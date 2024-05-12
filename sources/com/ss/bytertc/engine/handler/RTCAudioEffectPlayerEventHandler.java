package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IAudioEffectPlayerEventHandler;
import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;

/* loaded from: classes33.dex */
public class RTCAudioEffectPlayerEventHandler {
    public IAudioEffectPlayerEventHandler mAudioEffectHandler;

    public void setAudioEffectPlayerEventHandler(IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler) {
        this.mAudioEffectHandler = iAudioEffectPlayerEventHandler;
    }

    public void onAudioEffectPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError) {
        IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler = this.mAudioEffectHandler;
        if (iAudioEffectPlayerEventHandler != null) {
            iAudioEffectPlayerEventHandler.onAudioEffectPlayerStateChanged(i, playerState, playerError);
        }
    }
}
