package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum FallbackOrRecoverReason {
    FALLBACK_OR_RECOVER_REASON_UNKNOWN(-1),
    FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH(0),
    FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE(1),
    FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH(2),
    FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE(3),
    FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH(4),
    FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE(5),
    FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH(6),
    FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE(7);

    public int value;

    public int value() {
        return this.value;
    }

    public static FallbackOrRecoverReason valueOf(String str) {
        return (FallbackOrRecoverReason) V0N.LJJJ(FallbackOrRecoverReason.class, str);
    }

    FallbackOrRecoverReason(int i) {
        this.value = i;
    }
}
