package com.ss.android.ugc.aweme.services.interceptor.callback;

import X.V0N;

/* loaded from: classes12.dex */
public enum AgeGateResult {
    SUCCESS(0),
    UNDERAGE(1),
    DEVICE_BLOCK(2),
    ERROR(3),
    CANCEL(4);

    public final int value;

    public static AgeGateResult valueOf(String str) {
        return (AgeGateResult) V0N.LJJJ(AgeGateResult.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AgeGateResult(int i) {
        this.value = i;
    }
}
