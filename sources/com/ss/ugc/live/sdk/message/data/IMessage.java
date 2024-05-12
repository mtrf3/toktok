package com.ss.ugc.live.sdk.message.data;

import java.util.Map;

/* loaded from: classes16.dex */
public interface IMessage {
    boolean consumedMessageSEI();

    int consumingStrategy();

    long getDecodeEndAtMillis();

    long getDecodeStartAtMillis();

    MessageID getDependID();

    MessageID getDependRootID();

    long getDimension();

    long getDispatchAtMillis();

    int getDispatchStrategy();

    long getDispatchTimeoutMillis();

    Map<String, Object> getExtraParams();

    int getGeneralMessageType();

    int getIntType();

    Boolean getIntercepted();

    long getLocalTimestamp();

    int getMessageFrom();

    long getMessageId();

    MessageSEI getMessageSEI();

    MessageTrackTimeInfo getMessageTrackTimeInfo();

    String getMethodName();

    int getPriority();

    boolean needMonitor();

    void removeDependID();

    void removeMessageSEI();

    void setDecodeEndAtMillis(long j);

    void setDecodeStartAtMillis(long j);

    void setDispatchAtMillis(long j);

    void setIntercepted(Boolean bool);
}
