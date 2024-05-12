package com.ss.bytertc.engine.utils;

import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioFrameType;
import com.ss.bytertc.engine.data.AudioSampleRate;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public interface IAudioFrame {
    AudioChannel channel();

    int data_size();

    AudioFrameType frame_type();

    ByteBuffer getDataBuffer();

    void release();

    AudioSampleRate sample_rate();

    long timestamp_us();
}
