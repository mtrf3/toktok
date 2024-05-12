package com.ss.ttlivestreamer.core.effect;

import X.X1D;
import android.text.TextUtils;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.io.File;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class NativeAudioStrange extends IAudioStrangeVoice {
    public int mChannel;
    public boolean mEnableOpt;
    public long mNativeObj;
    public AudioDeviceModule.AudioRenderSink mPlayer;
    public boolean mRelease;
    public int mSampleHz;

    private native long nativeCreate(int i, int i2, String str, String str2, boolean z);

    private native int nativeProcess(long j, Buffer buffer, int i, int i2, int i3, long j2);

    private native void nativeRelease(long j);

    private native int nativeUpdateResource(long j, String str, String str2);

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public int setAudioStrangeResource(String str) {
        return -1;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public void release() {
        super.release();
        if (this.mPlayInVoipMode) {
            this.mPlayer.openForceMediaMode(Boolean.TRUE);
        }
        this.mPlayer = null;
        this.mRelease = true;
        synchronized (this) {
            long j = this.mNativeObj;
            if (j != 0) {
                nativeRelease(j);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public void setEnable(boolean z) {
        if (!this.mRelease) {
            super.setEnable(z);
            if (!isEnable()) {
                synchronized (this) {
                    long j = this.mNativeObj;
                    if (j != 0) {
                        nativeRelease(j);
                        this.mNativeObj = 0L;
                    }
                }
                return;
            }
            long nativeCreate = nativeCreate(this.mSampleHz, this.mChannel, null, null, this.mEnableOpt);
            this.mNativeObj = nativeCreate;
            if (nativeCreate == 0) {
                AVLog.ioe("NativeAudioStrange", "Create strange error.");
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public void enablePlayerMode(boolean z, boolean z2) {
        this.mIsPlayerMode = z;
        this.mPlayInVoipMode = z2;
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mPlayer;
        if (audioRenderSink != null && z2) {
            audioRenderSink.openForceMediaMode(Boolean.valueOf(!z));
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public int setAudioStrangeResource(String str, String str2) {
        if (str2 == null) {
            if (!TextUtils.isEmpty(str)) {
                str2 = new File(str).getParent();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Using ");
            LIZ.append(str2);
            LIZ.append(" as search path");
            AVLog.iow("NativeAudioStrange", X1D.LIZIZ(LIZ));
        }
        if (!TextUtils.isEmpty(str) && !new File(str).canRead()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Resource ");
            LIZ2.append(str);
            LIZ2.append("invalid.");
            AVLog.iow("NativeAudioStrange", X1D.LIZIZ(LIZ2));
            return -1;
        }
        synchronized (this) {
            long j = this.mNativeObj;
            if (j == 0) {
                return -1;
            }
            return nativeUpdateResource(j, str, str2);
        }
    }

    public NativeAudioStrange(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z) {
        this.mSampleHz = i;
        this.mChannel = i2;
        this.mPlayer = audioRenderSink;
        this.mEnableOpt = z;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        if (isEnable()) {
            synchronized (this) {
                long j2 = this.mNativeObj;
                if (j2 != 0) {
                    if (nativeProcess(j2, buffer, i, i2, i3, j) != 0) {
                        return buffer;
                    }
                    if (this.mIsPlayerMode && (audioRenderSink = this.mPlayer) != null) {
                        audioRenderSink.onData(buffer, i, i2, i3, j);
                    }
                }
            }
        }
        return buffer;
    }
}
