package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface VideoFrameRenderer {
    float getRealRatePerSeconds();

    boolean isEnable();

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j);

    void release();

    void setEnable(boolean z);

    void setFitMode(boolean z);

    void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription);
}
