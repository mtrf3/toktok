package com.ss.ttlivestreamer.livestreamv2.capture;

/* loaded from: classes12.dex */
public interface CameraObserver {
    void onCaptureStarted(int i, int i2);

    void onCaptureStopped(int i);

    void onError(int i, String str);

    void onInfo(int i, int i2, String str);
}
