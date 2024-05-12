package com.byted.cast.mediacommon;

import com.byted.cast.mediacommon.MediaSetting;

/* loaded from: classes29.dex */
public interface IMediaRecorderCallback {
    void onAudioEncoder(String str, int i, int i2, int i3, int i4);

    void onAudioFrameAvailable(byte[] bArr, int i, MediaSetting.ACODEC_ID acodec_id, long j);

    void onAudioPcm(byte[] bArr, int i, int i2, int i3, int i4, long j);

    void onAudioRecordFailed(int i);

    void onPaused();

    void onResumed();

    void onStopped();

    void onVideoEncoder(String str, int i, int i2, int i3, int i4);

    void onVideoFrameAvailable(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4, int i5);

    void onVideoFrameCodec(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4);

    void onVideoRecordError(int i, String str);
}
