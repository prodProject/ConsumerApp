package com.prod.app.SessionsManger;


import com.prod.app.Enums.SessionKeyTypeEnum;
import com.prod.app.Formatter.SessionKeyTypeEnumFormatter;
import com.prod.app.Interfaces.ISession;
import com.prod.app.Session.FastSave;
import com.prod.app.clientServices.ConsumerClientService;
import com.prod.app.protobuff.Consumer;

public class ConsumerSession implements ISession<Consumer.ConsumerPb> {

    private SessionKeyTypeEnumFormatter m_formatter;
    private ConsumerClientService m_ConsumerClientService;

    public ConsumerSession()
    {
        m_formatter = new SessionKeyTypeEnumFormatter();
        m_ConsumerClientService = new ConsumerClientService();
    }
    @Override
    public Consumer.ConsumerPb getSession() {
        return FastSave.getInstance().getObject(m_formatter.format(SessionKeyTypeEnum.CONSUMER), Consumer.ConsumerPb.class);
    }

    @Override
    public void setSession(Consumer.ConsumerPb value) {
        FastSave.getInstance().saveObject(m_formatter.format(SessionKeyTypeEnum.CONSUMER), value);
    }

    @Override
    public void clear() {
        FastSave.getInstance().deleteValue(m_formatter.format(SessionKeyTypeEnum.CONSUMER));
    }

    @Override
    public boolean sessionExixts() {
        return FastSave.getInstance().isKeyExists(m_formatter.format(SessionKeyTypeEnum.CONSUMER));
    }

    @Override
    public Consumer.ConsumerPb updateSession(Consumer.ConsumerPb value) {
        if(value!=null){
            Consumer.ConsumerPb resp = m_ConsumerClientService.update(value);
            setSession(resp);
            return resp ;
        }
        return value;
    }
}


















