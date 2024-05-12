package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum VoiceEqualizationBandFrequency {
    VOICE_EQUALIZATION_BAND_FREQUENCY_31(0),
    VOICE_EQUALIZATION_BAND_FREQUENCY_62(1),
    VOICE_EQUALIZATION_BAND_FREQUENCY_125(2),
    VOICE_EQUALIZATION_BAND_FREQUENCY_250(3),
    VOICE_EQUALIZATION_BAND_FREQUENCY_500(4),
    VOICE_EQUALIZATION_BAND_FREQUENCY_1k(5),
    VOICE_EQUALIZATION_BAND_FREQUENCY_2k(6),
    VOICE_EQUALIZATION_BAND_FREQUENCY_4k(7),
    VOICE_EQUALIZATION_BAND_FREQUENCY_8k(8),
    VOICE_EQUALIZATION_BAND_FREQUENCY_16k(9);

    public final int value;

    public int value() {
        return this.value;
    }

    public static VoiceEqualizationBandFrequency fromId(int i) {
        for (VoiceEqualizationBandFrequency voiceEqualizationBandFrequency : values()) {
            if (voiceEqualizationBandFrequency.value() == i) {
                return voiceEqualizationBandFrequency;
            }
        }
        return VOICE_EQUALIZATION_BAND_FREQUENCY_16k;
    }

    public static VoiceEqualizationBandFrequency valueOf(String str) {
        return (VoiceEqualizationBandFrequency) V0N.LJJJ(VoiceEqualizationBandFrequency.class, str);
    }

    VoiceEqualizationBandFrequency(int i) {
        this.value = i;
    }
}
