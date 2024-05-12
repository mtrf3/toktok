package com.ss.ttlivestreamer.core.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.transport.MP4Transport;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class NativeMp4Recorder extends MP4Transport implements MediaRecorder {
    @Override // com.ss.ttlivestreamer.core.transport.MP4Transport, com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int start() {
        nativeStartRecord();
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int stop() {
        nativeStopRecord();
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int addTrack(MediaFormat mediaFormat) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    public NativeMp4Recorder(boolean z, boolean z2) {
        super(z, z2);
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        throw new AndroidRuntimeException("Should not be here.");
    }
}
