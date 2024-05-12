package com.ss.bytertc.engine;

import com.ss.bytertc.engine.type.AudioEnhancementConfig;

/* loaded from: classes33.dex */
public class InternalAudioEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceSignaling;

    public boolean getAudioEnhance() {
        return this.enhanceAudio;
    }

    public boolean getSignalingEnhance() {
        return this.enhanceSignaling;
    }

    public InternalAudioEnhancementConfig(AudioEnhancementConfig audioEnhancementConfig) {
        this.enhanceSignaling = audioEnhancementConfig.enhanceSignaling;
        this.enhanceAudio = audioEnhancementConfig.enhanceAudio;
    }
}
