package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;

/* loaded from: classes33.dex */
public interface IAudioEffectPlayerEventHandler {
    void onAudioEffectPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError);
}
