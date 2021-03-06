// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mobile.proto

package com.prod.app.protobuff;

public final class Mobile {
  private Mobile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.prod.app.protobuff.CountryCodeEnum}
   */
  public enum CountryCodeEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_CODE = 0;</code>
     */
    UNKNOWN_CODE(0),
    /**
     * <code>ISD_91 = 1;</code>
     */
    ISD_91(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN_CODE = 0;</code>
     */
    public static final int UNKNOWN_CODE_VALUE = 0;
    /**
     * <code>ISD_91 = 1;</code>
     */
    public static final int ISD_91_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CountryCodeEnum valueOf(int value) {
      return forNumber(value);
    }

    public static CountryCodeEnum forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_CODE;
        case 1: return ISD_91;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CountryCodeEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CountryCodeEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CountryCodeEnum>() {
            public CountryCodeEnum findValueByNumber(int number) {
              return CountryCodeEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.prod.app.protobuff.Mobile.getDescriptor().getEnumTypes().get(0);
    }

    private static final CountryCodeEnum[] VALUES = values();

    public static CountryCodeEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CountryCodeEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.prod.app.protobuff.CountryCodeEnum)
  }

  public interface MobilePbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.prod.app.protobuff.MobilePb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
     */
    int getCodeValue();
    /**
     * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
     */
    com.prod.app.protobuff.Mobile.CountryCodeEnum getCode();

    /**
     * <code>string number = 2;</code>
     */
    java.lang.String getNumber();
    /**
     * <code>string number = 2;</code>
     */
    com.google.protobuf.ByteString
        getNumberBytes();
  }
  /**
   * Protobuf type {@code com.prod.app.protobuff.MobilePb}
   */
  public  static final class MobilePb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.prod.app.protobuff.MobilePb)
      MobilePbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MobilePb.newBuilder() to construct.
    private MobilePb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MobilePb() {
      code_ = 0;
      number_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MobilePb();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MobilePb(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              code_ = rawValue;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              number_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.prod.app.protobuff.Mobile.internal_static_com_prod_app_protobuff_MobilePb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.prod.app.protobuff.Mobile.internal_static_com_prod_app_protobuff_MobilePb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.prod.app.protobuff.Mobile.MobilePb.class, com.prod.app.protobuff.Mobile.MobilePb.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
     */
    public com.prod.app.protobuff.Mobile.CountryCodeEnum getCode() {
      @SuppressWarnings("deprecation")
      com.prod.app.protobuff.Mobile.CountryCodeEnum result = com.prod.app.protobuff.Mobile.CountryCodeEnum.valueOf(code_);
      return result == null ? com.prod.app.protobuff.Mobile.CountryCodeEnum.UNRECOGNIZED : result;
    }

    public static final int NUMBER_FIELD_NUMBER = 2;
    private volatile java.lang.Object number_;
    /**
     * <code>string number = 2;</code>
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      }
    }
    /**
     * <code>string number = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (code_ != com.prod.app.protobuff.Mobile.CountryCodeEnum.UNKNOWN_CODE.getNumber()) {
        output.writeEnum(1, code_);
      }
      if (!getNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, number_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (code_ != com.prod.app.protobuff.Mobile.CountryCodeEnum.UNKNOWN_CODE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, code_);
      }
      if (!getNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, number_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.prod.app.protobuff.Mobile.MobilePb)) {
        return super.equals(obj);
      }
      com.prod.app.protobuff.Mobile.MobilePb other = (com.prod.app.protobuff.Mobile.MobilePb) obj;

      if (code_ != other.code_) return false;
      if (!getNumber()
          .equals(other.getNumber())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + code_;
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getNumber().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.prod.app.protobuff.Mobile.MobilePb parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.prod.app.protobuff.Mobile.MobilePb prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.prod.app.protobuff.MobilePb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.prod.app.protobuff.MobilePb)
        com.prod.app.protobuff.Mobile.MobilePbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.prod.app.protobuff.Mobile.internal_static_com_prod_app_protobuff_MobilePb_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.prod.app.protobuff.Mobile.internal_static_com_prod_app_protobuff_MobilePb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.prod.app.protobuff.Mobile.MobilePb.class, com.prod.app.protobuff.Mobile.MobilePb.Builder.class);
      }

      // Construct using com.prod.app.protobuff.Mobile.MobilePb.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        code_ = 0;

        number_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.prod.app.protobuff.Mobile.internal_static_com_prod_app_protobuff_MobilePb_descriptor;
      }

      @java.lang.Override
      public com.prod.app.protobuff.Mobile.MobilePb getDefaultInstanceForType() {
        return com.prod.app.protobuff.Mobile.MobilePb.getDefaultInstance();
      }

      @java.lang.Override
      public com.prod.app.protobuff.Mobile.MobilePb build() {
        com.prod.app.protobuff.Mobile.MobilePb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.prod.app.protobuff.Mobile.MobilePb buildPartial() {
        com.prod.app.protobuff.Mobile.MobilePb result = new com.prod.app.protobuff.Mobile.MobilePb(this);
        result.code_ = code_;
        result.number_ = number_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.prod.app.protobuff.Mobile.MobilePb) {
          return mergeFrom((com.prod.app.protobuff.Mobile.MobilePb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.prod.app.protobuff.Mobile.MobilePb other) {
        if (other == com.prod.app.protobuff.Mobile.MobilePb.getDefaultInstance()) return this;
        if (other.code_ != 0) {
          setCodeValue(other.getCodeValue());
        }
        if (!other.getNumber().isEmpty()) {
          number_ = other.number_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.prod.app.protobuff.Mobile.MobilePb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.prod.app.protobuff.Mobile.MobilePb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int code_ = 0;
      /**
       * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
       */
      public int getCodeValue() {
        return code_;
      }
      /**
       * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
       */
      public Builder setCodeValue(int value) {
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
       */
      public com.prod.app.protobuff.Mobile.CountryCodeEnum getCode() {
        @SuppressWarnings("deprecation")
        com.prod.app.protobuff.Mobile.CountryCodeEnum result = com.prod.app.protobuff.Mobile.CountryCodeEnum.valueOf(code_);
        return result == null ? com.prod.app.protobuff.Mobile.CountryCodeEnum.UNRECOGNIZED : result;
      }
      /**
       * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
       */
      public Builder setCode(com.prod.app.protobuff.Mobile.CountryCodeEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        code_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.com.prod.app.protobuff.CountryCodeEnum code = 1;</code>
       */
      public Builder clearCode() {
        
        code_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object number_ = "";
      /**
       * <code>string number = 2;</code>
       */
      public java.lang.String getNumber() {
        java.lang.Object ref = number_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          number_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string number = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNumberBytes() {
        java.lang.Object ref = number_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          number_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string number = 2;</code>
       */
      public Builder setNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string number = 2;</code>
       */
      public Builder clearNumber() {
        
        number_ = getDefaultInstance().getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string number = 2;</code>
       */
      public Builder setNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        number_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.prod.app.protobuff.MobilePb)
    }

    // @@protoc_insertion_point(class_scope:com.prod.app.protobuff.MobilePb)
    private static final com.prod.app.protobuff.Mobile.MobilePb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.prod.app.protobuff.Mobile.MobilePb();
    }

    public static com.prod.app.protobuff.Mobile.MobilePb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MobilePb>
        PARSER = new com.google.protobuf.AbstractParser<MobilePb>() {
      @java.lang.Override
      public MobilePb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MobilePb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MobilePb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MobilePb> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.prod.app.protobuff.Mobile.MobilePb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_prod_app_protobuff_MobilePb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_prod_app_protobuff_MobilePb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014mobile.proto\022\026com.prod.app.protobuff\"Q" +
      "\n\010MobilePb\0225\n\004code\030\001 \001(\0162\'.com.prod.app." +
      "protobuff.CountryCodeEnum\022\016\n\006number\030\002 \001(" +
      "\t*/\n\017CountryCodeEnum\022\020\n\014UNKNOWN_CODE\020\000\022\n" +
      "\n\006ISD_91\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_prod_app_protobuff_MobilePb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_prod_app_protobuff_MobilePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_prod_app_protobuff_MobilePb_descriptor,
        new java.lang.String[] { "Code", "Number", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
