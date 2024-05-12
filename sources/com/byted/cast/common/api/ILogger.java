package com.byted.cast.common.api;

/* loaded from: classes29.dex */
public interface ILogger {
    void onDebug(String str, String str2);

    void onError(String str, String str2);

    void onError(String str, String str2, Throwable th);

    void onInfo(String str, String str2);

    void onVerbose(String str, String str2);

    void onWarn(String str, String str2);
}
