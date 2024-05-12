package com.bytedance.realx.video;

/* loaded from: classes33.dex */
public interface CapturerObserver {
    void onCapturerError(String str);

    void onCapturerFormatSelected(int i, int i2, int i3, int i4, int i5);

    void onCapturerStarted(boolean z);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
