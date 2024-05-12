package com.ss.android.ttve.nativePort;

import X.YO6;

/* loaded from: classes16.dex */
public class TEAudioMetricsCallback {
    public YO6 listener;

    public void setListener(Object obj) {
        this.listener = (YO6) obj;
    }

    public static boolean onProgressChanged(Object obj, int i, float f, String str) {
        TEAudioMetricsCallback tEAudioMetricsCallback;
        YO6 yo6;
        if ((obj instanceof TEAudioMetricsCallback) && (tEAudioMetricsCallback = (TEAudioMetricsCallback) obj) != null && (yo6 = tEAudioMetricsCallback.listener) != null) {
            yo6.LIZ(str, i);
            return false;
        }
        return false;
    }
}
