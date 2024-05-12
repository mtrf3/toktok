package com.ss.android.ugc.playerkit.radar;

import X.InterfaceC46856IaC;

/* loaded from: classes9.dex */
public interface IRadarTransmitter {
    boolean aLogWriteFuncAddrEnabled();

    boolean analyzerEnabled();

    boolean enabled();

    long getALogSimpleWriteFuncAddr();

    int kernelLogLever();

    int kernelLogLeverPrecise();

    boolean localTraceEnabled();

    int logNotifyLevel();

    int networkQualityType();

    boolean remoteTransmitEnabled();

    boolean sdkTransmitEnabled();

    void startVideo(String str);

    void tag(String str);

    InterfaceC46856IaC tracer();

    void transmitE(String str, String str2, Exception exc);

    void transmitI(String str, String str2);

    void transmitW(String str, String str2);

    boolean ttSDKALogOptEnabled();
}
