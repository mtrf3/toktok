package com.ss.ttlivestreamer.livestreamv2.filter;

import X.AnonymousClass028;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class AudioStrangeVoice extends IAudioStrangeVoice {
    public EffectWrapper mEffect;
    public AudioDeviceModule.AudioRenderSink mPlayer;

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public void release() {
        super.release();
        if (this.mPlayInVoipMode) {
            this.mPlayer.openForceMediaMode(Boolean.TRUE);
        }
        this.mEffect = null;
        this.mPlayer = null;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public int setAudioStrangeResource(String str) {
        EffectWrapper effectWrapper = this.mEffect;
        if (effectWrapper != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            return effectWrapper.setAudioEffectConfig(str);
        }
        return -1;
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

    public AudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, EffectWrapper effectWrapper, int i, int i2) {
        this.mEffect = effectWrapper;
        this.mPlayer = audioRenderSink;
        if (effectWrapper == null) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG effect is null");
            if (!AnonymousClass028.LJI(androidRuntimeException, "AudioStrangeVoice.AudioStrangeVoice")) {
            } else {
                throw androidRuntimeException;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice
    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        EffectWrapper effectWrapper;
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        if (this.mEnable && (effectWrapper = this.mEffect) != null && effectWrapper.processStrangeVoice(buffer, i, i2, i3, j) == 0 && this.mIsPlayerMode && (audioRenderSink = this.mPlayer) != null) {
            audioRenderSink.onData(buffer, i, i2, i3, j);
        }
        return buffer;
    }
}
