package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;

/* loaded from: classes17.dex */
public class ByteAudioAuxStream {
    public int gain;
    public boolean mute;
    public long nativeAuxStreamSink;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioAuxSinkProxy sinkProxy;
    public final Object streamLock = new Object();
    public int stream_id;

    public void clearInputStreamNameForMix() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                ByteAudioNativeFunctions.nativeClearInputStreamNameForMix(j);
            }
        }
    }

    public long getID() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamGetId(j);
            }
            return -1L;
        }
    }

    public String getName() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamGetName(j);
            }
            return null;
        }
    }

    public int pauseStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamPause(j);
            }
            return -1;
        }
    }

    public void releaseStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                long j2 = this.nativeEnginePtr;
                if (j2 != 0) {
                    ByteAudioNativeFunctions.nativeDestroyAuxStream(j2, j);
                    this.nativeStreamPtr = 0L;
                    long j3 = this.nativeAuxStreamSink;
                    if (j3 != 0) {
                        ByteAudioNativeFunctions.nativeReleaseAuxStreamSink(j3);
                        this.nativeAuxStreamSink = 0L;
                    }
                    ByteAudioAuxSinkProxy byteAudioAuxSinkProxy = this.sinkProxy;
                    if (byteAudioAuxSinkProxy != null) {
                        byteAudioAuxSinkProxy.releaseProxySink();
                    }
                    this.sinkProxy = null;
                }
            }
        }
    }

    public int resumeStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamResume(j);
            }
            return -1;
        }
    }

    public int startStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamStart(j);
            }
            return -1;
        }
    }

    public int stopStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamStop(j);
            }
            return -1;
        }
    }

    public void addInputStreamNameForMix(String str) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                ByteAudioNativeFunctions.nativeAddInputStreamNameForMix(j, str);
            }
        }
    }

    public ByteAudioStreamOption auxStreamGetValue(int i) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamGetValue(j, i);
            }
            return null;
        }
    }

    public int setGain(int i) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                this.gain = i;
                return ByteAudioNativeFunctions.nativeAuxStreamSetGain(j, i);
            }
            return -1;
        }
    }

    public void setPath(String str) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                ByteAudioNativeFunctions.nativeAuxStreamSetPath(j, str);
            }
        }
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink) {
        synchronized (this.streamLock) {
            ByteAudioAuxSinkProxy byteAudioAuxSinkProxy = new ByteAudioAuxSinkProxy(byteAudioAuxSink, this);
            this.sinkProxy = byteAudioAuxSinkProxy;
            long j = this.nativeStreamPtr;
            if (j != 0) {
                this.nativeAuxStreamSink = ByteAudioNativeFunctions.nativeAuxStreamSetSink(j, byteAudioAuxSinkProxy);
            }
        }
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamSetFormat(j, byteAudioStreamFormat);
            }
            return -1;
        }
    }

    public ByteAudioAuxStream(long j, String str) {
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateAuxStream(j, str);
        }
    }

    public int auxStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeAuxStreamSetValue(j, i, byteAudioStreamOption);
            }
            return -1;
        }
    }
}
