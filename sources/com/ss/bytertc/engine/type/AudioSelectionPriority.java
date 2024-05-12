package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioSelectionPriority {
    AUDIO_SELECTION_PRIORITY_NORMAL(0),
    AUDIO_SELECTION_PRIORITY_HIGIH(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static AudioSelectionPriority valueOf(String str) {
        return (AudioSelectionPriority) V0N.LJJJ(AudioSelectionPriority.class, str);
    }

    AudioSelectionPriority(int i) {
        this.value = i;
    }
}
