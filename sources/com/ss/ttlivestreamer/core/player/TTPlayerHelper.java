package com.ss.ttlivestreamer.core.player;

import X.AnonymousClass028;
import X.C16880lQ;
import X.X1D;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class TTPlayerHelper {
    public static final String TAG = C16880lQ.LJLLJ(TTPlayerHelper.class);

    /* loaded from: classes12.dex */
    public static class NativeAudioSink extends AudioSink {
        public AudioSink mSink;

        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
        public void onNoData() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public synchronized void release() {
        }

        public long getNativeObject() {
            long j = this.mNativeObj;
            if (j < 0) {
                return j & 4294967295L;
            }
            return j;
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public void finalize() {
            release();
        }

        public void closeAudio(boolean z) {
            long j = this.mNativeObj;
            if (j != 0) {
                TTPlayerHelper.nativeCloseAudio(j, z);
            }
        }

        public void setAudioSink(AudioSink audioSink) {
            this.mSink = audioSink;
        }

        public NativeAudioSink(int i, int i2) {
            setNativeObj(TTPlayerHelper.nativeCreateTTAudioSink(this, i, i2));
        }

        public int readAudioBuffer(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer != null) {
                long j = this.mNativeObj;
                if (j != 0) {
                    return TTPlayerHelper.nativeReadTTAudioBuffer(j, byteBuffer, i, i2, i3);
                }
                return -1;
            }
            return -1;
        }

        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            AudioSink audioSink = this.mSink;
            if (audioSink != null) {
                audioSink.onData(buffer, i, i2, i3, j);
            }
        }
    }

    public static String getTTVideoEngineVersion() {
        Method method;
        try {
            method = Class.forName("com.ss.ttvideoengine.TTVideoEngine").getMethod("getEngineVersion", new Class[0]);
        } catch (Throwable th) {
            th = th;
        }
        if (method != null) {
            return (String) method.invoke(null, new Object[0]);
        }
        th = null;
        AVLog.ioe(TAG, "probe TTVideoEngine failed", th);
        return null;
    }

    public static native void nativeCloseAudio(long j, boolean z);

    public static native long nativeCreateTTAudioSink(Object obj, int i, int i2);

    public static native int nativeReadTTAudioBuffer(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public static NativeAudioSink createAudioPlayer(int i, int i2) {
        String tTVideoEngineVersion = getTTVideoEngineVersion();
        if (tTVideoEngineVersion != null) {
            String str = TAG;
            StringBuilder LJ = AnonymousClass028.LJ("Create TTAudioPlayer with engine version ", tTVideoEngineVersion, " sampleHZ ", i, " channel ");
            LJ.append(i2);
            AVLog.iow(str, X1D.LIZIZ(LJ));
            return new NativeAudioSink(i, i2);
        }
        return null;
    }
}
