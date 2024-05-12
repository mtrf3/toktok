package com.ss.android.ugc.aweme.music.model;

import X.V0N;

/* loaded from: classes3.dex */
public enum SeparateStatus {
    UNKNOWN(0),
    SUCCESS(1),
    FAIL(2),
    PROCESSING(3);

    public final int status;

    public static SeparateStatus valueOf(String str) {
        return (SeparateStatus) V0N.LJJJ(SeparateStatus.class, str);
    }

    public final int getStatus() {
        return this.status;
    }

    SeparateStatus(int i) {
        this.status = i;
    }
}
