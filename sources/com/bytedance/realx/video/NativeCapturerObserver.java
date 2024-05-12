package com.bytedance.realx.video;

import com.bytedance.realx.video.VideoFrame;

/* loaded from: classes33.dex */
public class NativeCapturerObserver implements CapturerObserver {
    public final long nativeSource;

    public static native void nativeCapturerStarted(long j, boolean z);

    public static native void nativeCapturerStopped(long j);

    public static native void nativeOnFrameCaptured(long j, int i, int i2, int i3, long j2, VideoFrame.Buffer buffer);

    @Override // com.bytedance.realx.video.CapturerObserver
    public void onCapturerError(String str) {
    }

    @Override // com.bytedance.realx.video.CapturerObserver
    public void onCapturerFormatSelected(int i, int i2, int i3, int i4, int i5) {
    }

    @Override // com.bytedance.realx.video.CapturerObserver
    public void onCapturerStopped() {
        nativeCapturerStopped(this.nativeSource);
    }

    public NativeCapturerObserver(long j) {
        this.nativeSource = j;
    }

    @Override // com.bytedance.realx.video.CapturerObserver
    public void onCapturerStarted(boolean z) {
        nativeCapturerStarted(this.nativeSource, z);
    }

    @Override // com.bytedance.realx.video.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }
}
