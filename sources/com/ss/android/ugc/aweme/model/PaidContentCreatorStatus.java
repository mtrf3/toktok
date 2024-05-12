package com.ss.android.ugc.aweme.model;

import X.V0N;

/* loaded from: classes5.dex */
public enum PaidContentCreatorStatus {
    UNKNOWN(0),
    NOT_ELIGIBLE(1),
    ELIGIBLE_WITH_PUBLISHED_SERIES(2),
    ELIGIBLE_WITH_NO_PUBLISHED_SERIES(3);

    public final int LJLIL;

    public static PaidContentCreatorStatus valueOf(String str) {
        return (PaidContentCreatorStatus) V0N.LJJJ(PaidContentCreatorStatus.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    PaidContentCreatorStatus(int i) {
        this.LJLIL = i;
    }
}
