package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class AudioOriginFrameSink extends AudioSink {
    public ILiveStream.IAudioFrameAvailableListener listener;

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onNoData() {
    }

    public void setListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        this.listener = iAudioFrameAvailableListener;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.listener != null) {
            buffer.position(0);
            this.listener.onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }
}
