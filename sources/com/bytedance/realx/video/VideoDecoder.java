package com.bytedance.realx.video;

import android.view.Surface;

/* loaded from: classes33.dex */
public interface VideoDecoder {

    /* loaded from: classes33.dex */
    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame);

        void onDecoderInited(long j);

        void onMediaCodecStatus(VideoCodecStatus videoCodecStatus, String str);
    }

    long createNativeVideoDecoder();

    VideoCodecStatus decode(EncodedImage encodedImage);

    void disableExternalSurface();

    String getImplementationName();

    boolean getPrefersLateDecoding();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    void onFrame(VideoFrame videoFrame);

    VideoCodecStatus release();

    void setExternalSurface(Surface surface);

    VideoCodecStatus setPrivateParam(String str, String str2);

    /* loaded from: classes33.dex */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    /* loaded from: classes33.dex */
    public static class Settings {
        public final boolean enableRecreateByResolution;
        public final boolean enableSmoothOutput;
        public final boolean enableSurfaceTextureReuse;
        public final boolean enableYUVOutput;
        public final int height;
        public final boolean latencyInsensitiveMode;
        public final int numberOfCores;
        public final boolean outputByDts;
        public final int width;

        public Settings(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.outputByDts = z;
            this.enableSmoothOutput = z2;
            this.enableYUVOutput = z3;
            this.latencyInsensitiveMode = z4;
            this.enableSurfaceTextureReuse = z5;
            this.enableRecreateByResolution = z6;
        }
    }
}
