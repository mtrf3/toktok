package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioScenarioType {
    AUDIO_SCENARIO_MUSIC(0),
    AUDIO_SCENARIO_HIGHQUALITY_COMMUNICATION(1),
    AUDIO_SCENARIO_COMMUNICATION(2),
    AUDIO_SCENARIO_MEDIA(3),
    AUDIO_SCENARIO_GAME_STREAMING(4),
    AUDIO_SCENARIO_HIGHQUALITY_CHAT(5);

    public final int value;

    public int value() {
        return this.value;
    }

    public static AudioScenarioType fromId(int i) {
        for (AudioScenarioType audioScenarioType : values()) {
            if (audioScenarioType.value() == i) {
                return audioScenarioType;
            }
        }
        return AUDIO_SCENARIO_MUSIC;
    }

    public static AudioScenarioType valueOf(String str) {
        return (AudioScenarioType) V0N.LJJJ(AudioScenarioType.class, str);
    }

    AudioScenarioType(int i) {
        this.value = i;
    }
}
