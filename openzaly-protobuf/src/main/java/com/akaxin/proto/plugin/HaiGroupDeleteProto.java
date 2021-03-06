// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_group_delete.proto

package com.akaxin.proto.plugin;

public final class HaiGroupDeleteProto {
  private HaiGroupDeleteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HaiGroupDeleteRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupDeleteRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    java.lang.String getGroupId();
    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupIdBytes();
  }
  /**
   * <pre>
   **
   *删除群组
   *----
   *接口名
   *----
   * /hai/group/delete
   *错误码
   *----
   * success
   * error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiGroupDeleteRequest}
   */
  public  static final class HaiGroupDeleteRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupDeleteRequest)
      HaiGroupDeleteRequestOrBuilder {
    // Use HaiGroupDeleteRequest.newBuilder() to construct.
    private HaiGroupDeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HaiGroupDeleteRequest() {
      groupId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private HaiGroupDeleteRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              groupId_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest.class, com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;
    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *删除的群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest other = (com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest) obj;

      boolean result = true;
      result = result && getGroupId()
          .equals(other.getGroupId());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * <pre>
     **
     *删除群组
     *----
     *接口名
     *----
     * /hai/group/delete
     *错误码
     *----
     * success
     * error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiGroupDeleteRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupDeleteRequest)
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest.class, com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest.newBuilder()
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
      public Builder clear() {
        super.clear();
        groupId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteRequest_descriptor;
      }

      public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest getDefaultInstanceForType() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest.getDefaultInstance();
      }

      public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest build() {
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest buildPartial() {
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest result = new com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest(this);
        result.groupId_ = groupId_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest) {
          return mergeFrom((com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest other) {
        if (other == com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest.getDefaultInstance()) return this;
        if (!other.getGroupId().isEmpty()) {
          groupId_ = other.groupId_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object groupId_ = "";
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          groupId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *删除的群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupId_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupDeleteRequest)
    }

    // @@protoc_insertion_point(class_scope:plugin.HaiGroupDeleteRequest)
    private static final com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest();
    }

    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HaiGroupDeleteRequest>
        PARSER = new com.google.protobuf.AbstractParser<HaiGroupDeleteRequest>() {
      public HaiGroupDeleteRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new HaiGroupDeleteRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HaiGroupDeleteRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HaiGroupDeleteRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HaiGroupDeleteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupDeleteResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code plugin.HaiGroupDeleteResponse}
   */
  public  static final class HaiGroupDeleteResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupDeleteResponse)
      HaiGroupDeleteResponseOrBuilder {
    // Use HaiGroupDeleteResponse.newBuilder() to construct.
    private HaiGroupDeleteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HaiGroupDeleteResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private HaiGroupDeleteResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse.class, com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse)) {
        return super.equals(obj);
      }
      com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse other = (com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code plugin.HaiGroupDeleteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupDeleteResponse)
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse.class, com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse.Builder.class);
      }

      // Construct using com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse.newBuilder()
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
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.internal_static_plugin_HaiGroupDeleteResponse_descriptor;
      }

      public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse getDefaultInstanceForType() {
        return com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse.getDefaultInstance();
      }

      public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse build() {
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse buildPartial() {
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse result = new com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse) {
          return mergeFrom((com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse other) {
        if (other == com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupDeleteResponse)
    }

    // @@protoc_insertion_point(class_scope:plugin.HaiGroupDeleteResponse)
    private static final com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse();
    }

    public static com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HaiGroupDeleteResponse>
        PARSER = new com.google.protobuf.AbstractParser<HaiGroupDeleteResponse>() {
      public HaiGroupDeleteResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new HaiGroupDeleteResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HaiGroupDeleteResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HaiGroupDeleteResponse> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.plugin.HaiGroupDeleteProto.HaiGroupDeleteResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_plugin_HaiGroupDeleteRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_plugin_HaiGroupDeleteRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_plugin_HaiGroupDeleteResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_plugin_HaiGroupDeleteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035plugin/hai_group_delete.proto\022\006plugin\"" +
      ")\n\025HaiGroupDeleteRequest\022\020\n\010group_id\030\001 \001" +
      "(\t\"\030\n\026HaiGroupDeleteResponse2`\n\025HaiGroup" +
      "DeleteService\022G\n\006delete\022\035.plugin.HaiGrou" +
      "pDeleteRequest\032\036.plugin.HaiGroupDeleteRe" +
      "sponseB.\n\027com.akaxin.proto.pluginB\023HaiGr" +
      "oupDeleteProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_plugin_HaiGroupDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_plugin_HaiGroupDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_plugin_HaiGroupDeleteRequest_descriptor,
        new java.lang.String[] { "GroupId", });
    internal_static_plugin_HaiGroupDeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_plugin_HaiGroupDeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_plugin_HaiGroupDeleteResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
