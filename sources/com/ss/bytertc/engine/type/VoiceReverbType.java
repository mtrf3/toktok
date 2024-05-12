package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum VoiceReverbType {
    VOICE_REVERB_ORIGINAL(0),
    VOICE_REVERB_ECHO(1),
    VOICE_REVERB_CONCERT(2),
    VOICE_REVERB_ETHEREAL(3),
    VOICE_REVERB_KTV(4),
    VOICE_REVERB_STUDIO(5),
    VOICE_REVERB_VIRTUAL_STEREO(6),
    VOICE_REVERB_SPACIOUS(7),
    VOICE_REVERB_3D(8),
    VOICE_REVERB_POP(9),
    VOICE_REVERB_DISCO(10),
    VOICE_REVERB_OLDRECORD(11),
    VOICE_REVERB_HARMONY(12),
    VOICE_REVERB_ROCK(13),
    VOICE_REVERB_BLUES(14),
    VOICE_REVERB_JAZZ(15),
    VOICE_REVERB_ELECTRONIC(16),
    VOICE_REVERB_VINYL(17),
    VOICE_REVERB_CHAMBER(18);

    public final int value;

    public int value() {
        return this.value;
    }

    public static VoiceReverbType fromId(int i) {
        for (VoiceReverbType voiceReverbType : values()) {
            if (voiceReverbType.value() == i) {
                return voiceReverbType;
            }
        }
        return VOICE_REVERB_ORIGINAL;
    }

    public static VoiceReverbType valueOf(String str) {
        return (VoiceReverbType) V0N.LJJJ(VoiceReverbType.class, str);
    }

    VoiceReverbType(int i) {
        this.value = i;
    }
}
