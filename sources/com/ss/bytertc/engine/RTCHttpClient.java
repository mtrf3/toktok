package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public interface RTCHttpClient {

    /* loaded from: classes33.dex */
    public interface RtcHttpCallback {
        void run(int i, String str);
    }

    void GetAsync(String str, RtcHttpCallback rtcHttpCallback, int i);

    void PostAsync(String str, String str2, RtcHttpCallback rtcHttpCallback, int i);
}
