// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat/Chat.proto

package com.grpc.chat;

/**
 * Protobuf type {@code com.grpc.chat.ChatMessageFromServer}
 */
public  final class ChatMessageFromServer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.chat.ChatMessageFromServer)
    ChatMessageFromServerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChatMessageFromServer.newBuilder() to construct.
  private ChatMessageFromServer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChatMessageFromServer() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChatMessageFromServer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChatMessageFromServer(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (timestamp_ != null) {
              subBuilder = timestamp_.toBuilder();
            }
            timestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timestamp_);
              timestamp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.grpc.chat.ChatMessage.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.grpc.chat.ChatMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

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
    return com.grpc.chat.Chat.internal_static_com_grpc_chat_ChatMessageFromServer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.chat.Chat.internal_static_com_grpc_chat_ChatMessageFromServer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.chat.ChatMessageFromServer.class, com.grpc.chat.ChatMessageFromServer.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return Whether the timestamp field is set.
   */
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return The timestamp.
   */
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return getTimestamp();
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private com.grpc.chat.ChatMessage message_;
  /**
   * <code>.com.grpc.chat.ChatMessage message = 2;</code>
   * @return Whether the message field is set.
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.com.grpc.chat.ChatMessage message = 2;</code>
   * @return The message.
   */
  public com.grpc.chat.ChatMessage getMessage() {
    return message_ == null ? com.grpc.chat.ChatMessage.getDefaultInstance() : message_;
  }
  /**
   * <code>.com.grpc.chat.ChatMessage message = 2;</code>
   */
  public com.grpc.chat.ChatMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
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
    if (timestamp_ != null) {
      output.writeMessage(1, getTimestamp());
    }
    if (message_ != null) {
      output.writeMessage(2, getMessage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestamp());
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMessage());
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
    if (!(obj instanceof com.grpc.chat.ChatMessageFromServer)) {
      return super.equals(obj);
    }
    com.grpc.chat.ChatMessageFromServer other = (com.grpc.chat.ChatMessageFromServer) obj;

    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
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
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.chat.ChatMessageFromServer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.chat.ChatMessageFromServer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.chat.ChatMessageFromServer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.chat.ChatMessageFromServer parseFrom(
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
  public static Builder newBuilder(com.grpc.chat.ChatMessageFromServer prototype) {
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
   * Protobuf type {@code com.grpc.chat.ChatMessageFromServer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.chat.ChatMessageFromServer)
      com.grpc.chat.ChatMessageFromServerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.chat.Chat.internal_static_com_grpc_chat_ChatMessageFromServer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.chat.Chat.internal_static_com_grpc_chat_ChatMessageFromServer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.chat.ChatMessageFromServer.class, com.grpc.chat.ChatMessageFromServer.Builder.class);
    }

    // Construct using com.grpc.chat.ChatMessageFromServer.newBuilder()
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
      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }
      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.chat.Chat.internal_static_com_grpc_chat_ChatMessageFromServer_descriptor;
    }

    @java.lang.Override
    public com.grpc.chat.ChatMessageFromServer getDefaultInstanceForType() {
      return com.grpc.chat.ChatMessageFromServer.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.chat.ChatMessageFromServer build() {
      com.grpc.chat.ChatMessageFromServer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.chat.ChatMessageFromServer buildPartial() {
      com.grpc.chat.ChatMessageFromServer result = new com.grpc.chat.ChatMessageFromServer(this);
      if (timestampBuilder_ == null) {
        result.timestamp_ = timestamp_;
      } else {
        result.timestamp_ = timestampBuilder_.build();
      }
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
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
      if (other instanceof com.grpc.chat.ChatMessageFromServer) {
        return mergeFrom((com.grpc.chat.ChatMessageFromServer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.chat.ChatMessageFromServer other) {
      if (other == com.grpc.chat.ChatMessageFromServer.getDefaultInstance()) return this;
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
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
      com.grpc.chat.ChatMessageFromServer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.chat.ChatMessageFromServer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
        onChanged();
      } else {
        timestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
        onChanged();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (timestamp_ != null) {
          timestamp_ =
            com.google.protobuf.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
        } else {
          timestamp_ = value;
        }
        onChanged();
      } else {
        timestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder clearTimestamp() {
      if (timestampBuilder_ == null) {
        timestamp_ = null;
        onChanged();
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }

    private com.grpc.chat.ChatMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.chat.ChatMessage, com.grpc.chat.ChatMessage.Builder, com.grpc.chat.ChatMessageOrBuilder> messageBuilder_;
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     * @return The message.
     */
    public com.grpc.chat.ChatMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.grpc.chat.ChatMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     */
    public Builder setMessage(com.grpc.chat.ChatMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     */
    public Builder setMessage(
        com.grpc.chat.ChatMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     */
    public Builder mergeMessage(com.grpc.chat.ChatMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            com.grpc.chat.ChatMessage.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     */
    public com.grpc.chat.ChatMessage.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     */
    public com.grpc.chat.ChatMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.grpc.chat.ChatMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.com.grpc.chat.ChatMessage message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.chat.ChatMessage, com.grpc.chat.ChatMessage.Builder, com.grpc.chat.ChatMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.chat.ChatMessage, com.grpc.chat.ChatMessage.Builder, com.grpc.chat.ChatMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.chat.ChatMessageFromServer)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.chat.ChatMessageFromServer)
  private static final com.grpc.chat.ChatMessageFromServer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.chat.ChatMessageFromServer();
  }

  public static com.grpc.chat.ChatMessageFromServer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatMessageFromServer>
      PARSER = new com.google.protobuf.AbstractParser<ChatMessageFromServer>() {
    @java.lang.Override
    public ChatMessageFromServer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChatMessageFromServer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChatMessageFromServer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatMessageFromServer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.chat.ChatMessageFromServer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

