package com.bytedance.realx.audio;

/* loaded from: classes33.dex */
public interface ScreenAudioCaptureObserver {
    void onAudioFrameCapture(byte[] bArr, int i, int i2, int i3);

    void onCapturerStarted();

    void onCapturerStopped();
}
