package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class AudioFrameAvailableSink extends AudioSink {
    public List<ILiveStream.IAudioFrameAvailableListener> mListeners = new ArrayList();
    public List<ILiveStream.IAudioFrameAvailableListener> mListenersToBeAdded = new ArrayList();
    public List<ILiveStream.IAudioFrameAvailableListener> mListenersToBeRemoved = new ArrayList();
    public final Object mFence = new Object();

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onNoData() {
    }

    public void addListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mFence) {
            this.mListenersToBeRemoved.remove(iAudioFrameAvailableListener);
            if (!this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeAdded.contains(iAudioFrameAvailableListener)) {
                this.mListenersToBeAdded.add(iAudioFrameAvailableListener);
            }
        }
    }

    public void removeListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mFence) {
            this.mListenersToBeAdded.remove(iAudioFrameAvailableListener);
            if (this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeRemoved.contains(iAudioFrameAvailableListener)) {
                this.mListenersToBeRemoved.add(iAudioFrameAvailableListener);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        synchronized (this.mFence) {
            if (!this.mListenersToBeAdded.isEmpty()) {
                this.mListeners.addAll(this.mListenersToBeAdded);
                this.mListenersToBeAdded.clear();
            }
            if (!this.mListenersToBeRemoved.isEmpty()) {
                this.mListeners.removeAll(this.mListenersToBeRemoved);
                this.mListenersToBeRemoved.clear();
            }
        }
        for (ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener : this.mListeners) {
            if (iAudioFrameAvailableListener != null) {
                buffer.position(0);
                iAudioFrameAvailableListener.onAudioFrameAvailable(buffer, i, i2, i3, j);
            }
        }
    }
}
