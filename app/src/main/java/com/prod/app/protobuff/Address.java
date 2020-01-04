// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: address.proto

package com.prod.app.protobuff;

public final class Address {
  private Address() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddressPbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.prod.app.protobuff.AddressPb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string houseNo = 1;</code>
     */
    java.lang.String getHouseNo();
    /**
     * <code>string houseNo = 1;</code>
     */
    com.google.protobuf.ByteString
        getHouseNoBytes();

    /**
     * <code>string streetOrRoad = 2;</code>
     */
    java.lang.String getStreetOrRoad();
    /**
     * <code>string streetOrRoad = 2;</code>
     */
    com.google.protobuf.ByteString
        getStreetOrRoadBytes();

    /**
     * <code>string landmark = 3;</code>
     */
    java.lang.String getLandmark();
    /**
     * <code>string landmark = 3;</code>
     */
    com.google.protobuf.ByteString
        getLandmarkBytes();

    /**
     * <code>string pincode = 4;</code>
     */
    java.lang.String getPincode();
    /**
     * <code>string pincode = 4;</code>
     */
    com.google.protobuf.ByteString
        getPincodeBytes();
  }
  /**
   * Protobuf type {@code com.prod.app.protobuff.AddressPb}
   */
  public  static final class AddressPb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.prod.app.protobuff.AddressPb)
      AddressPbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AddressPb.newBuilder() to construct.
    private AddressPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddressPb() {
      houseNo_ = "";
      streetOrRoad_ = "";
      landmark_ = "";
      pincode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AddressPb();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddressPb(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              houseNo_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              streetOrRoad_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              landmark_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              pincode_ = s;
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
      return com.prod.app.protobuff.Address.internal_static_com_prod_app_protobuff_AddressPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.prod.app.protobuff.Address.internal_static_com_prod_app_protobuff_AddressPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.prod.app.protobuff.Address.AddressPb.class, com.prod.app.protobuff.Address.AddressPb.Builder.class);
    }

    public static final int HOUSENO_FIELD_NUMBER = 1;
    private volatile java.lang.Object houseNo_;
    /**
     * <code>string houseNo = 1;</code>
     */
    public java.lang.String getHouseNo() {
      java.lang.Object ref = houseNo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        houseNo_ = s;
        return s;
      }
    }
    /**
     * <code>string houseNo = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHouseNoBytes() {
      java.lang.Object ref = houseNo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        houseNo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STREETORROAD_FIELD_NUMBER = 2;
    private volatile java.lang.Object streetOrRoad_;
    /**
     * <code>string streetOrRoad = 2;</code>
     */
    public java.lang.String getStreetOrRoad() {
      java.lang.Object ref = streetOrRoad_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        streetOrRoad_ = s;
        return s;
      }
    }
    /**
     * <code>string streetOrRoad = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStreetOrRoadBytes() {
      java.lang.Object ref = streetOrRoad_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        streetOrRoad_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LANDMARK_FIELD_NUMBER = 3;
    private volatile java.lang.Object landmark_;
    /**
     * <code>string landmark = 3;</code>
     */
    public java.lang.String getLandmark() {
      java.lang.Object ref = landmark_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        landmark_ = s;
        return s;
      }
    }
    /**
     * <code>string landmark = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLandmarkBytes() {
      java.lang.Object ref = landmark_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        landmark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PINCODE_FIELD_NUMBER = 4;
    private volatile java.lang.Object pincode_;
    /**
     * <code>string pincode = 4;</code>
     */
    public java.lang.String getPincode() {
      java.lang.Object ref = pincode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pincode_ = s;
        return s;
      }
    }
    /**
     * <code>string pincode = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPincodeBytes() {
      java.lang.Object ref = pincode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pincode_ = b;
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
      if (!getHouseNoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, houseNo_);
      }
      if (!getStreetOrRoadBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, streetOrRoad_);
      }
      if (!getLandmarkBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, landmark_);
      }
      if (!getPincodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pincode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getHouseNoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, houseNo_);
      }
      if (!getStreetOrRoadBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, streetOrRoad_);
      }
      if (!getLandmarkBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, landmark_);
      }
      if (!getPincodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pincode_);
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
      if (!(obj instanceof com.prod.app.protobuff.Address.AddressPb)) {
        return super.equals(obj);
      }
      com.prod.app.protobuff.Address.AddressPb other = (com.prod.app.protobuff.Address.AddressPb) obj;

      if (!getHouseNo()
          .equals(other.getHouseNo())) return false;
      if (!getStreetOrRoad()
          .equals(other.getStreetOrRoad())) return false;
      if (!getLandmark()
          .equals(other.getLandmark())) return false;
      if (!getPincode()
          .equals(other.getPincode())) return false;
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
      hash = (37 * hash) + HOUSENO_FIELD_NUMBER;
      hash = (53 * hash) + getHouseNo().hashCode();
      hash = (37 * hash) + STREETORROAD_FIELD_NUMBER;
      hash = (53 * hash) + getStreetOrRoad().hashCode();
      hash = (37 * hash) + LANDMARK_FIELD_NUMBER;
      hash = (53 * hash) + getLandmark().hashCode();
      hash = (37 * hash) + PINCODE_FIELD_NUMBER;
      hash = (53 * hash) + getPincode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.prod.app.protobuff.Address.AddressPb parseFrom(
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
    public static Builder newBuilder(com.prod.app.protobuff.Address.AddressPb prototype) {
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
     * Protobuf type {@code com.prod.app.protobuff.AddressPb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.prod.app.protobuff.AddressPb)
        com.prod.app.protobuff.Address.AddressPbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.prod.app.protobuff.Address.internal_static_com_prod_app_protobuff_AddressPb_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.prod.app.protobuff.Address.internal_static_com_prod_app_protobuff_AddressPb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.prod.app.protobuff.Address.AddressPb.class, com.prod.app.protobuff.Address.AddressPb.Builder.class);
      }

      // Construct using com.prod.app.protobuff.Address.AddressPb.newBuilder()
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
        houseNo_ = "";

        streetOrRoad_ = "";

        landmark_ = "";

        pincode_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.prod.app.protobuff.Address.internal_static_com_prod_app_protobuff_AddressPb_descriptor;
      }

      @java.lang.Override
      public com.prod.app.protobuff.Address.AddressPb getDefaultInstanceForType() {
        return com.prod.app.protobuff.Address.AddressPb.getDefaultInstance();
      }

      @java.lang.Override
      public com.prod.app.protobuff.Address.AddressPb build() {
        com.prod.app.protobuff.Address.AddressPb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.prod.app.protobuff.Address.AddressPb buildPartial() {
        com.prod.app.protobuff.Address.AddressPb result = new com.prod.app.protobuff.Address.AddressPb(this);
        result.houseNo_ = houseNo_;
        result.streetOrRoad_ = streetOrRoad_;
        result.landmark_ = landmark_;
        result.pincode_ = pincode_;
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
        if (other instanceof com.prod.app.protobuff.Address.AddressPb) {
          return mergeFrom((com.prod.app.protobuff.Address.AddressPb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.prod.app.protobuff.Address.AddressPb other) {
        if (other == com.prod.app.protobuff.Address.AddressPb.getDefaultInstance()) return this;
        if (!other.getHouseNo().isEmpty()) {
          houseNo_ = other.houseNo_;
          onChanged();
        }
        if (!other.getStreetOrRoad().isEmpty()) {
          streetOrRoad_ = other.streetOrRoad_;
          onChanged();
        }
        if (!other.getLandmark().isEmpty()) {
          landmark_ = other.landmark_;
          onChanged();
        }
        if (!other.getPincode().isEmpty()) {
          pincode_ = other.pincode_;
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
        com.prod.app.protobuff.Address.AddressPb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.prod.app.protobuff.Address.AddressPb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object houseNo_ = "";
      /**
       * <code>string houseNo = 1;</code>
       */
      public java.lang.String getHouseNo() {
        java.lang.Object ref = houseNo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          houseNo_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string houseNo = 1;</code>
       */
      public com.google.protobuf.ByteString
          getHouseNoBytes() {
        java.lang.Object ref = houseNo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          houseNo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string houseNo = 1;</code>
       */
      public Builder setHouseNo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        houseNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string houseNo = 1;</code>
       */
      public Builder clearHouseNo() {
        
        houseNo_ = getDefaultInstance().getHouseNo();
        onChanged();
        return this;
      }
      /**
       * <code>string houseNo = 1;</code>
       */
      public Builder setHouseNoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        houseNo_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object streetOrRoad_ = "";
      /**
       * <code>string streetOrRoad = 2;</code>
       */
      public java.lang.String getStreetOrRoad() {
        java.lang.Object ref = streetOrRoad_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          streetOrRoad_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string streetOrRoad = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStreetOrRoadBytes() {
        java.lang.Object ref = streetOrRoad_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          streetOrRoad_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string streetOrRoad = 2;</code>
       */
      public Builder setStreetOrRoad(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        streetOrRoad_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string streetOrRoad = 2;</code>
       */
      public Builder clearStreetOrRoad() {
        
        streetOrRoad_ = getDefaultInstance().getStreetOrRoad();
        onChanged();
        return this;
      }
      /**
       * <code>string streetOrRoad = 2;</code>
       */
      public Builder setStreetOrRoadBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        streetOrRoad_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object landmark_ = "";
      /**
       * <code>string landmark = 3;</code>
       */
      public java.lang.String getLandmark() {
        java.lang.Object ref = landmark_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          landmark_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string landmark = 3;</code>
       */
      public com.google.protobuf.ByteString
          getLandmarkBytes() {
        java.lang.Object ref = landmark_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          landmark_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string landmark = 3;</code>
       */
      public Builder setLandmark(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        landmark_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string landmark = 3;</code>
       */
      public Builder clearLandmark() {
        
        landmark_ = getDefaultInstance().getLandmark();
        onChanged();
        return this;
      }
      /**
       * <code>string landmark = 3;</code>
       */
      public Builder setLandmarkBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        landmark_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object pincode_ = "";
      /**
       * <code>string pincode = 4;</code>
       */
      public java.lang.String getPincode() {
        java.lang.Object ref = pincode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          pincode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string pincode = 4;</code>
       */
      public com.google.protobuf.ByteString
          getPincodeBytes() {
        java.lang.Object ref = pincode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          pincode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string pincode = 4;</code>
       */
      public Builder setPincode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        pincode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string pincode = 4;</code>
       */
      public Builder clearPincode() {
        
        pincode_ = getDefaultInstance().getPincode();
        onChanged();
        return this;
      }
      /**
       * <code>string pincode = 4;</code>
       */
      public Builder setPincodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        pincode_ = value;
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


      // @@protoc_insertion_point(builder_scope:com.prod.app.protobuff.AddressPb)
    }

    // @@protoc_insertion_point(class_scope:com.prod.app.protobuff.AddressPb)
    private static final com.prod.app.protobuff.Address.AddressPb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.prod.app.protobuff.Address.AddressPb();
    }

    public static com.prod.app.protobuff.Address.AddressPb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddressPb>
        PARSER = new com.google.protobuf.AbstractParser<AddressPb>() {
      @java.lang.Override
      public AddressPb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddressPb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddressPb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddressPb> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.prod.app.protobuff.Address.AddressPb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_prod_app_protobuff_AddressPb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_prod_app_protobuff_AddressPb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\raddress.proto\022\026com.prod.app.protobuff\"" +
      "U\n\tAddressPb\022\017\n\007houseNo\030\001 \001(\t\022\024\n\014streetO" +
      "rRoad\030\002 \001(\t\022\020\n\010landmark\030\003 \001(\t\022\017\n\007pincode" +
      "\030\004 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_prod_app_protobuff_AddressPb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_prod_app_protobuff_AddressPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_prod_app_protobuff_AddressPb_descriptor,
        new java.lang.String[] { "HouseNo", "StreetOrRoad", "Landmark", "Pincode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
