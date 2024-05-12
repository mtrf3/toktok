package com.bytedance.realx.video;

import com.bytedance.realx.video.VideoDecoder;

/* loaded from: classes33.dex */
public class VideoDecoderWrapper {
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame);

    public static native void nativeOnDecoderInited(long j, long j2);

    public static native void nativeOnMediaCodecStatus(long j, VideoCodecStatus videoCodecStatus, String str);

    public static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: com.bytedance.realx.video.VideoDecoderWrapper.1
            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onDecodedFrame(VideoFrame videoFrame) {
                long j2 = j;
                if (j2 != 0) {
                    VideoDecoderWrapper.nativeOnDecodedFrame(j2, videoFrame);
                }
            }

            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onDecoderInited(long j2) {
                long j3 = j;
                if (j3 != 0) {
                    VideoDecoderWrapper.nativeOnDecoderInited(j3, j2);
                }
            }

            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onMediaCodecStatus(VideoCodecStatus videoCodecStatus, String str) {
                if (j != 0 && str != null && str.length() != 0) {
                    VideoDecoderWrapper.nativeOnMediaCodecStatus(j, videoCodecStatus, str);
                }
            }
        };
    }
}
