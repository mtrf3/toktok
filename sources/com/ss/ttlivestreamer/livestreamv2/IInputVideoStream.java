package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface IInputVideoStream {
    int fps();

    int getHeight();

    VideoMixer.VideoMixerDescription getMixerDescription();

    int getRealFps();

    int getWidth();

    String name();

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j);

    void release();

    void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription);

    int start();

    int stop();
}
