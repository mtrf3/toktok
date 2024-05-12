package com.ss.android.ugc.aweme.setting.creatorverification;

import X.V0N;

/* loaded from: classes9.dex */
public enum CreatorVerificationStatus {
    NOT_CREATED,
    CREATED,
    REJECTED,
    VERIFIED;

    public static CreatorVerificationStatus valueOf(String str) {
        return (CreatorVerificationStatus) V0N.LJJJ(CreatorVerificationStatus.class, str);
    }
}
