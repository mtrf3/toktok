package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum MessageConfig {
    RELIABLE_ORDERED(0),
    UNRELIABLE_ORDERED(1),
    UNRELIABLE_UNORDERED(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static MessageConfig fromId(int i) {
        for (MessageConfig messageConfig : values()) {
            if (messageConfig.value() == i) {
                return messageConfig;
            }
        }
        return RELIABLE_ORDERED;
    }

    public static MessageConfig valueOf(String str) {
        return (MessageConfig) V0N.LJJJ(MessageConfig.class, str);
    }

    MessageConfig(int i) {
        this.value = i;
    }
}
