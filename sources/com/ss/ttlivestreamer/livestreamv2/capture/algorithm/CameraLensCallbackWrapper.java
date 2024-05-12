package com.ss.ttlivestreamer.livestreamv2.capture.algorithm;

/* loaded from: classes12.dex */
public interface CameraLensCallbackWrapper {
    void onError(int i, int i2, String str);

    void onInfo(int i, int i2, int i3, String str);

    void onSuccess(int i, float f, int i2);
}
