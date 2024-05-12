package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class ByteAudioAuxSinkProxy {
    public long nativeSinkPtr;
    public ByteBuffer pullDirectBuffer;
    public ByteAudioStreamBuffer pullStreamBuffer;
    public ByteAudioSinkInterface.ByteAudioAuxSink sink;
    public ByteAudioAuxStream stream;

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

    public void onMixingBegin(long j) {
        ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink = this.sink;
        if (byteAudioAuxSink != null) {
            byteAudioAuxSink.onMixingBegin(this.stream);
        }
    }

    public void onMixingEnd(long j) {
        ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink = this.sink;
        if (byteAudioAuxSink != null) {
            byteAudioAuxSink.onMixingEnd(this.stream);
        }
    }

    public int onPullAudioBufferToStream(long j) {
        if (this.sink != null) {
            this.pullDirectBuffer.clear();
            int onPullAudioBufferToAuxStream = this.sink.onPullAudioBufferToAuxStream(this.stream, this.pullStreamBuffer);
            this.pullDirectBuffer.flip();
            return onPullAudioBufferToAuxStream;
        }
        return -1;
    }

    public void setNativeSink(long j) {
        this.nativeSinkPtr = j;
    }

    public ByteAudioAuxSinkProxy(ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink, ByteAudioAuxStream byteAudioAuxStream) {
        this.sink = byteAudioAuxSink;
        this.stream = byteAudioAuxStream;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(15360);
        this.pullDirectBuffer = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.pullStreamBuffer = new ByteAudioStreamBuffer(this.pullDirectBuffer, 0, new ByteAudioStreamFormat(0, 0, 0, 0), 0);
    }
}
