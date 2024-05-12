package com.ss.ttlivestreamer.core.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface MediaRecorder {
    int addTrack(MediaFormat mediaFormat);

    void release();

    int start();

    int stop();

    int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
