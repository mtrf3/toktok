package com.bytedance.bae;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class ByteAudioFilterProxy {
    public ByteBuffer directBuffer;
    public ByteAudioFilter sink;
    public ByteAudioStreamBuffer streamBuffer;

    public int onProcess() {
        if (this.sink != null) {
            this.directBuffer.position(this.streamBuffer.getLength());
            this.directBuffer.flip();
            return this.sink.onProcess(this.streamBuffer);
        }
        return -1;
    }

    public ByteBuffer getDirectBuffer() {
        return this.directBuffer;
    }

    public ByteAudioStreamBuffer getStreamBuffer() {
        return this.streamBuffer;
    }

    public ByteAudioFilterProxy(ByteAudioFilter byteAudioFilter) {
        this.sink = byteAudioFilter;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(15360);
        this.directBuffer = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.streamBuffer = new ByteAudioStreamBuffer(this.directBuffer, 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);
    }
}
