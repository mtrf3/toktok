package com.bytedance.realx;

import com.bytedance.realx.video.VideoFrame;

/* loaded from: classes33.dex */
public final class RXNativeFunctions {
    public static native void nativeOnCapturerError(long j, int i);

    public static native void nativeOnCapturerFormatSelected(long j, int i, int i2, int i3, int i4, int i5);

    public static native void nativeOnCapturerStarted(long j, boolean z);

    public static native void nativeOnCapturerStopped(long j);

    public static native void nativeOnFrameCaptured(long j, VideoFrame videoFrame);
}
