package com.ss.ttlivestreamer.livestreamv2.filter;

import android.content.Context;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public abstract class IAudioFilterManager extends AudioEffectProcessor {
    public boolean mEnable;

    /* loaded from: classes12.dex */
    public interface IBgmPlayingStatusCallback {
        void onPlayingStatusChange(boolean z);
    }

    public IAudioStrangeVoice getAudioStrangeVoice() {
        return null;
    }

    public double getPitchShift() {
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public boolean isDummy() {
        return true;
    }

    public boolean musicIsPlaying() {
        return false;
    }

    public abstract String name();

    public void setBgmStatusCallback(IBgmPlayingStatusCallback iBgmPlayingStatusCallback) {
    }

    public void setPitchShift(double d) {
    }

    public void setTranspose(int i) {
    }

    public void setVoiceAccompanySourceLufs(float f) {
    }

    public void setVoiceAccompanySourcePeak(float f) {
    }

    public void setVoiceAccompanyTargetLufs(float f) {
    }

    public void setVoiceTargetLufs(float f) {
    }

    public void start() {
    }

    public void stop() {
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public static IAudioFilterManager create(Context context, Handler handler, AudioDeviceModule audioDeviceModule, LiveStreamBuilder liveStreamBuilder, IFilterManager iFilterManager) {
        if (audioDeviceModule != null) {
            return new LiveCoreKaraokFilter(audioDeviceModule, handler, liveStreamBuilder, iFilterManager);
        }
        return new IAudioFilterManager() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager.1
            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void initEarMonitor() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public boolean isSupportHardWareEarMonitor() {
                return false;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public boolean isSupportSoftWareEarMonitor() {
                return false;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
            public String name() {
                return "dummy";
            }

            @Override // com.ss.ttlivestreamer.core.engine.AudioProcessor
            public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
                return buffer;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setAudioFadingParams(int i, int i2, int i3, int i4) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setBGMMusic(String str) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setBGMMusic(String str, long j) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setBGMMusic(String str, String str2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setBGMMusic(String str, String str2, long j) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setBGMVolume(float f) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setDRCEnable(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setEchoMode(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setEnableAudioFading(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setHardwareEarMonitorVolume(float f) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setHardwareEchoMode(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setLoopEnable(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setMixerEnable(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setMusicPitch(int i) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setOnlyMixWithRTC(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setOriginEnable(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setSoftwareEarMonitorVolume(float f) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setSoftwareEchoMode(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setTuningParams(String str) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setTuningParams(String str, String str2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
            public void setVoiceVolume(float f) {
            }
        };
    }
}
