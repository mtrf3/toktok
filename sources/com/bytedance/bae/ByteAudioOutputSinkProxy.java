package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class ByteAudioOutputSinkProxy {
    public long nativeSinkPtr;
    public ByteBuffer pullDirectBuffer;
    public ByteAudioStreamBuffer pullStreamBuffer;
    public ByteAudioSinkInterface.ByteAudioOutputSink sink;
    public ByteAudioOutputStream stream;

    public void releaseProxySink() {
        this.sink = null;
        this.stream = null;
        this.pullStreamBuffer = null;
    }

    public ByteBuffer getDirectBuffer() {
        return this.pullDirectBuffer;
    }

    public ByteAudioStreamBuffer getStreamBuffer() {
        return this.pullStreamBuffer;
    }

    public int onPullAudioBufferToStream(long j) {
        if (this.sink != null) {
            this.pullDirectBuffer.clear();
            int onPullAudioBufferToStream = this.sink.onPullAudioBufferToStream(this.stream, this.pullStreamBuffer);
            this.pullDirectBuffer.flip();
            return onPullAudioBufferToStream;
        }
        return -1;
    }

    public void setNativeSink(long j) {
        this.nativeSinkPtr = j;
    }

    public ByteAudioOutputSinkProxy(ByteAudioSinkInterface.ByteAudioOutputSink byteAudioOutputSink, ByteAudioOutputStream byteAudioOutputStream) {
        this.sink = byteAudioOutputSink;
        this.stream = byteAudioOutputStream;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(15360);
        this.pullDirectBuffer = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.pullStreamBuffer = new ByteAudioStreamBuffer(this.pullDirectBuffer, 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);
    }
}
