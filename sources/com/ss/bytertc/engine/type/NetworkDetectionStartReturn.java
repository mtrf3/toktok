package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum NetworkDetectionStartReturn {
    NetworkDetectionStartReturnSuccess(0),
    NetworkDetectionStartReturnParamErr(1),
    NetworkDetectionStartReturnStreaming(2),
    NetworkDetectionStartReturnStarted(3),
    NetworkDetectionStartReturnNotSupport(4);

    public int value;

    public int value() {
        return this.value;
    }

    public static NetworkDetectionStartReturn fromId(int i) {
        for (NetworkDetectionStartReturn networkDetectionStartReturn : values()) {
            if (networkDetectionStartReturn.value() == i) {
                return networkDetectionStartReturn;
            }
        }
        return NetworkDetectionStartReturnSuccess;
    }

    public static NetworkDetectionStartReturn valueOf(String str) {
        return (NetworkDetectionStartReturn) V0N.LJJJ(NetworkDetectionStartReturn.class, str);
    }

    NetworkDetectionStartReturn(int i) {
        this.value = i;
    }
}
