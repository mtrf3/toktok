package com.bytedance.vcloud.networkpredictor;

/* loaded from: classes9.dex */
public interface ISpeedRecordOld {
    long getBytes();

    long getLastRecvDate();

    String getProtocol();

    String getStreamId();

    long getTcpInfoRtt();

    long getTime();

    long getTimestamp();

    int getTrackType();
}
