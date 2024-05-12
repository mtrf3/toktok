package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import java.util.LinkedHashMap;

/* loaded from: classes17.dex */
public class ByteAudioInputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeInputStreamSink;
    public long nativeStreamPtr;
    public ByteAudioInputSinkProxy sinkProxy;
    public final Object streamLock = new Object();
    public int stream_id;

    public long getID() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamGetId(j);
            }
            return -1L;
        }
    }

    public String getName() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamGetName(j);
            }
            return null;
        }
    }

    public LinkedHashMap getStatsReport() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamGetStatsReport(j);
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
                    ByteAudioNativeFunctions.nativeDestroyInputStream(j2, j);
                    this.nativeStreamPtr = 0L;
                    long j3 = this.nativeInputStreamSink;
                    if (j3 != 0) {
                        ByteAudioNativeFunctions.nativeReleaseInputStreamSink(j3);
                        this.nativeInputStreamSink = 0L;
                    }
                    ByteAudioInputSinkProxy byteAudioInputSinkProxy = this.sinkProxy;
                    if (byteAudioInputSinkProxy != null) {
                        byteAudioInputSinkProxy.releaseProxySink();
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
                return ByteAudioNativeFunctions.nativeInputStreamStart(j);
            }
            return -1;
        }
    }

    public int stopStream() {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamStop(j);
            }
            return -1;
        }
    }

    public ByteAudioStreamOption inputStreamGetValue(int i) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamGetValue(j, i);
            }
            return null;
        }
    }

    public int setGain(int i) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                this.gain = i;
                return ByteAudioNativeFunctions.nativeInputStreamSetGain(j, i);
            }
            return -1;
        }
    }

    public int setMute(boolean z) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamSetMute(j, z);
            }
            return -1;
        }
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioInputSink byteAudioInputSink) {
        synchronized (this.streamLock) {
            ByteAudioInputSinkProxy byteAudioInputSinkProxy = new ByteAudioInputSinkProxy(byteAudioInputSink, this);
            this.sinkProxy = byteAudioInputSinkProxy;
            long j = this.nativeStreamPtr;
            if (j != 0) {
                this.nativeInputStreamSink = ByteAudioNativeFunctions.nativeInputStreamSetSink(j, byteAudioInputSinkProxy);
            }
        }
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamSetFormat(j, byteAudioStreamFormat);
            }
            return -1;
        }
    }

    public int updateStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamUpdateFormat(j, byteAudioStreamFormat);
            }
            return -1;
        }
    }

    public ByteAudioInputStream(long j, String str) {
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateInputStream(j, str);
        }
    }

    public int inputStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        synchronized (this.streamLock) {
            long j = this.nativeStreamPtr;
            if (j != 0) {
                return ByteAudioNativeFunctions.nativeInputStreamSetValue(j, i, byteAudioStreamOption);
            }
            return -1;
        }
    }
}
