package com.ss.ttlivestreamer.livestreamv2.audioeffect;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class DummyAudioFilterManager extends IAudioFilterManager {
    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public double getPitchShift() {
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

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
        return "DummyAudioFilter";
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

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public void setPitchShift(double d) {
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
}
