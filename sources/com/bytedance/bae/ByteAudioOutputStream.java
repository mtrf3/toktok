package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import java.util.LinkedHashMap;

/* loaded from: classes17.dex */
public class ByteAudioOutputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeOutputStreamSink;
    public long nativeStreamPtr;
    public ByteAudioOutputSinkProxy sinkProxy;
    public final Object streamLock = new Object();
    public int stream_id;

    public long getID() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamGetId(j);
            }
            return -1L;
        }
    }

    public String getName() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamGetName(j);
            }
            return null;
        }
    }

    public LinkedHashMap getStatsReport() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamGetStatsReport(j);
            }
            return null;
        }
    }

    public void releaseStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                long j2 = this.nativeEnginePtr;
                if (j2 != 0) {
                    ByteAudioNativeFunctions.nativeDestroyOutputStream(j2, j);
                    this.nativeStreamPtr = 0L;
                    long j3 = this.nativeOutputStreamSink;
                    if (j3 != 0) {
                        ByteAudioNativeFunctions.nativeReleaseOutputStreamSink(j3);
                        this.nativeOutputStreamSink = 0L;
                    }
                    ByteAudioOutputSinkProxy byteAudioOutputSinkProxy = this.sinkProxy;
                    if (byteAudioOutputSinkProxy != null) {
                        byteAudioOutputSinkProxy.releaseProxySink();
                    }
                    this.sinkProxy = null;
                }
            }
        }
    }

    public int startStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamStart(j);
            }
            return -1;
        }
    }

    public int stopStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamStop(j);
            }
            return -1;
        }
    }

    public ByteAudioStreamOption outputStreamGetValue(int i) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamGetValue(j, i);
            }
            return null;
        }
    }

    public int setGain(int i) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                this.gain = i;
                return ByteAudioNativeFunctions.nativeOutputStreamSetGain(j, i);
            }
            return -1;
        }
    }

    public int setMute(boolean z) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamSetMute(j, z);
            }
            return -1;
        }
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioOutputSink byteAudioOutputSink) {
        synchronized (this.streamLock) {
            ByteAudioOutputSinkProxy byteAudioOutputSinkProxy = new ByteAudioOutputSinkProxy(byteAudioOutputSink, this);
            this.sinkProxy = byteAudioOutputSinkProxy;
            long j = this.nativeStreamPtr;
            if (j != 0) {
                this.nativeOutputStreamSink = ByteAudioNativeFunctions.nativeOutputStreamSetSink(j, byteAudioOutputSinkProxy);
            }
        }
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamSetFormat(j, byteAudioStreamFormat);
            }
            return -1;
        }
    }

    public ByteAudioOutputStream(long j, String str) {
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateOutputStream(j, str);
        }
    }

    public int outputStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeOutputStreamSetValue(j, i, byteAudioStreamOption);
            }
            return -1;
        }
    }

    public int setGain(int i, int i2) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                this.gain = i;
                return ByteAudioNativeFunctions.nativeOutputStreamSetGainWithFade(j, i, i2);
            }
            return -1;
        }
    }
}
