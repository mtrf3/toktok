package com.bytedance.pitaya.jniwrapper;

import X.C93291aOV;

/* loaded from: classes30.dex */
public interface IAdapter extends ReflectionCall {
    public static final C93291aOV Companion = C93291aOV.LIZ;

    void appLogEvent(String str, String str2);

    void async(int i, long j);

    void asyncAfter(double d, int i, long j);

    void cancelAllDownload();

    void cancelTimer(String str);

    int currentNetworkStatus();

    void download(String str, String str2, long j);

    boolean isAllowedMonitorEvent(String str);

    boolean isBusinessDisabled(String str);

    void logger(String str, String str2);

    void monitor(String str, String str2, String str3, String str4);

    void reportTrace(String str, String str2);

    void request(int i, String str, String str2, long j);

    void threadException(String str, String str2, String str3, int i);

    String timer(long j, int i);

    void unzip(String str, String str2, long j);
}
