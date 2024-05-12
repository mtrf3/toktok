package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AnsMode {
    ANS_MODE_DISABLE(0),
    ANS_MODE_LOW(1),
    ANS_MODE_MEDIUM(2),
    ANS_MODE_HIGH(3),
    ANS_MODE_AUTOMATIC(4);

    public final int value;

    public int value() {
        return this.value;
    }

    public static AnsMode fromId(int i) {
        for (AnsMode ansMode : values()) {
            if (ansMode.value() == i) {
                return ansMode;
            }
        }
        return ANS_MODE_AUTOMATIC;
    }

    public static AnsMode valueOf(String str) {
        return (AnsMode) V0N.LJJJ(AnsMode.class, str);
    }

    AnsMode(int i) {
        this.value = i;
    }
}
