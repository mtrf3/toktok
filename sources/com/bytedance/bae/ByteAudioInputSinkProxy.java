package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class ByteAudioInputSinkProxy {
    public long nativeSinkPtr;
    public ByteBuffer pushDirectBuffer;
    public ByteAudioStreamBuffer pushStreamBuffer;
    public ByteAudioSinkInterface.ByteAudioInputSink sink;
    public ByteAudioInputStream stream;

    public void releaseProxySink() {
        this.sink = null;
        this.stream = null;
        this.pushStreamBuffer = null;
    }

    public ByteBuffer getDirectBuffer() {
        return this.pushDirectBuffer;
    }

    public ByteAudioStreamBuffer getStreamBuffer() {
        return this.pushStreamBuffer;
    }

    public int onPushAudioBufferFromStream(long j) {
        if (this.sink != null) {
            this.pushDirectBuffer.position(this.pushStreamBuffer.getLength());
            this.pushDirectBuffer.flip();
            int onPushAudioBufferFromStream = this.sink.onPushAudioBufferFromStream(this.stream, this.pushStreamBuffer);
            this.pushDirectBuffer.clear();
            return onPushAudioBufferFromStream;
        }
        return -1;
    }

    public void setNativeSink(long j) {
        this.nativeSinkPtr = j;
    }

    public ByteAudioInputSinkProxy(ByteAudioSinkInterface.ByteAudioInputSink byteAudioInputSink, ByteAudioInputStream byteAudioInputStream) {
        this.sink = byteAudioInputSink;
        this.stream = byteAudioInputStream;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(15360);
        this.pushDirectBuffer = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.pushStreamBuffer = new ByteAudioStreamBuffer(this.pushDirectBuffer, 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);
    }
}
