package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum NetworkDetectionLinkType {
    UP(0),
    DOWN(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static NetworkDetectionLinkType fromId(int i) {
        for (NetworkDetectionLinkType networkDetectionLinkType : values()) {
            if (networkDetectionLinkType.value() == i) {
                return networkDetectionLinkType;
            }
        }
        return UP;
    }

    public static NetworkDetectionLinkType valueOf(String str) {
        return (NetworkDetectionLinkType) V0N.LJJJ(NetworkDetectionLinkType.class, str);
    }

    NetworkDetectionLinkType(int i) {
        this.value = i;
    }
}
