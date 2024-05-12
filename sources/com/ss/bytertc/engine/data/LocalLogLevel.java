package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum LocalLogLevel {
    INFO(0),
    WARNING(1),
    ERROR(2),
    NONE(3);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static LocalLogLevel fromId(int i) {
        for (LocalLogLevel localLogLevel : values()) {
            if (localLogLevel.getValue() == i) {
                return localLogLevel;
            }
        }
        return WARNING;
    }

    public static LocalLogLevel valueOf(String str) {
        return (LocalLogLevel) V0N.LJJJ(LocalLogLevel.class, str);
    }

    LocalLogLevel(int i) {
        this.value = i;
    }
}
