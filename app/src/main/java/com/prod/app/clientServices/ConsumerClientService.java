package com.prod.app.clientServices;

import android.os.AsyncTask;

import com.prod.app.CommonCode.HttpCaller;
import com.prod.app.CommonCode.ProtoJsonUtil;
import com.prod.app.CommonCode.ProtoSerilizerAndDeserilizer;
import com.prod.app.ServerConfig.ServerUrlManeger;
import com.prod.app.ServerConfig.UrlPathProvider;
import com.prod.app.protobuff.Consumer;
import com.prod.basic.common.httpCommon.Enums.RequestContentTypeEnum;
import com.prod.basic.common.httpCommon.Enums.RequestMethodEnum;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class ConsumerClientService  {
    private ConsumerCreateService m_ConsumerCreateService;
    private ConsumerUpdateService m_ConsumerUpdateService;

    public ConsumerClientService() {
        m_ConsumerCreateService = new ConsumerCreateService();
        m_ConsumerUpdateService = new ConsumerUpdateService();
    }

    public Consumer.ConsumerPb create(Consumer.ConsumerPb request) {
        try {
            return m_ConsumerCreateService.execute(request).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Consumer.ConsumerPb update(Consumer.ConsumerPb request) {
        try {
            return m_ConsumerUpdateService.execute(request).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }



    private class ConsumerCreateService extends AsyncTask<Consumer.ConsumerPb, Void, Consumer.ConsumerPb> {

        @Override
        protected Consumer.ConsumerPb doInBackground(Consumer.ConsumerPb... ConsumerPbs) {
            ServerUrlManeger urlManeger = new ServerUrlManeger();
            ProtoSerilizerAndDeserilizer serilizer = new ProtoSerilizerAndDeserilizer();

            HttpCaller caller = new HttpCaller(RequestMethodEnum.POST, RequestContentTypeEnum.CONTENT_TYPE_JSON, urlManeger.getServerUrl(UrlPathProvider.UrlPathEnum.CONSUMER), serilizer.getJsonObject(ConsumerPbs[0]));
            try {
                Consumer.ConsumerPb.Builder resBuilder1 = Consumer.ConsumerPb.newBuilder(ProtoJsonUtil.fromJson(caller.execute().toString(), Consumer.ConsumerPb.class));
                return resBuilder1.build();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    private class WorkerUpdateService extends AsyncTask<Consumer.ConsumerPb, Void, Consumer.ConsumerPb> {

        @Override
        protected Consumer.ConsumerPb doInBackground(Consumer.ConsumerPb... ConsumerPbs) {
            ServerUrlManeger urlManeger = new ServerUrlManeger();
            ProtoSerilizerAndDeserilizer serilizer = new ProtoSerilizerAndDeserilizer();

            HttpCaller caller = new HttpCaller(RequestMethodEnum.PUT, RequestContentTypeEnum.CONTENT_TYPE_JSON, urlManeger.getServerUrl(UrlPathProvider.UrlPathEnum.CONSUMER), serilizer.getJsonObject(ConsumerPbs[0]));
            try {
                Consumer.ConsumerPb.Builder resBuilder1 = Consumer.ConsumerPb.newBuilder(ProtoJsonUtil.fromJson(caller.execute().toString(), Consumer.ConsumerPb.class));
                return resBuilder1.build();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }



}