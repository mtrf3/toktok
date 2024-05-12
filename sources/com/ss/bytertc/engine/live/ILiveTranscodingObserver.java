package com.ss.bytertc.engine.live;

import com.bytedance.realx.video.VideoFrame;

/* loaded from: classes33.dex */
public interface ILiveTranscodingObserver {
    boolean isSupportClientPushStream();

    void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i);

    void onMixingAudioFrame(String str, byte[] bArr, int i, long j);

    void onMixingDataFrame(String str, byte[] bArr, long j);

    void onMixingVideoFrame(String str, VideoFrame videoFrame);

    void onStreamMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, ByteRTCStreamMixingType byteRTCStreamMixingType);
}
