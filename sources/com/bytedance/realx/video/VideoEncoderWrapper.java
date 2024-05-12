package com.bytedance.realx.video;

import com.bytedance.realx.video.EncodedImage;
import com.bytedance.realx.video.VideoEncoder;
import com.bytedance.realx.video.VideoEncoderWrapper;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class VideoEncoderWrapper {
    public static native void nativeOnEncodedFrame(long j, ByteBuffer byteBuffer, int i, int i2, long j2, int i3, int i4);

    public static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() { // from class: X.ZWK
            @Override // com.bytedance.realx.video.VideoEncoder.Callback
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.lambda$createEncoderCallback$0(j, encodedImage, codecSpecificInfo);
            }
        };
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    public static /* synthetic */ void lambda$createEncoderCallback$0(long j, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        nativeOnEncodedFrame(j, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative(), codecSpecificInfo.codec_standard.toInt());
    }
}
