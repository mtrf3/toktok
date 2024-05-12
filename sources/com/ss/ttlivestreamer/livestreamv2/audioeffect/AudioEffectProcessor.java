package com.ss.ttlivestreamer.livestreamv2.audioeffect;

import com.ss.ttlivestreamer.core.engine.AudioProcessor;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public abstract class AudioEffectProcessor extends AudioProcessor {

    /* loaded from: classes12.dex */
    public interface Callback {
        void onProgress(long j);

        void start();

        void stop();
    }

    /* loaded from: classes12.dex */
    public interface CallbackV2 extends Callback {
        void onError(int i, Exception exc);
    }

    public void getScoreInfo(double[] dArr) {
    }

    public TEBundle getStreamInfo() {
        return null;
    }

    public abstract void initEarMonitor();

    public abstract boolean isSupportHardWareEarMonitor();

    public abstract boolean isSupportSoftWareEarMonitor();

    public void pause() {
    }

    public void resume() {
    }

    public void seek(long j) {
    }

    public void seekLyricPos(double d) {
    }

    public abstract void setAudioFadingParams(int i, int i2, int i3, int i4);

    public abstract void setBGMMusic(String str);

    public abstract void setBGMMusic(String str, long j);

    public abstract void setBGMMusic(String str, String str2);

    public abstract void setBGMMusic(String str, String str2, long j);

    public abstract void setBGMProgressListener(Callback callback);

    public abstract void setBGMVolume(float f);

    public abstract void setDRCEnable(boolean z);

    public abstract void setEchoMode(boolean z);

    public abstract void setEnableAudioFading(boolean z);

    public abstract void setHardwareEarMonitorVolume(float f);

    public abstract void setHardwareEchoMode(boolean z);

    public abstract void setLoopEnable(boolean z);

    public abstract void setMixerEnable(boolean z);

    public abstract void setMusicPitch(int i);

    public abstract void setOnlyMixWithRTC(boolean z);

    public abstract void setOriginEnable(boolean z);

    public int setScoringSources(String str, String str2, double d) {
        return -1;
    }

    public abstract void setSoftwareEarMonitorVolume(float f);

    public abstract void setSoftwareEchoMode(boolean z);

    public abstract void setTuningParams(String str);

    public abstract void setTuningParams(String str, String str2);

    public abstract void setVoiceVolume(float f);
}
