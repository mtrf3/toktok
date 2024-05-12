package com.ss.android.ugc.aweme.account.model;

import X.V0N;

/* loaded from: classes16.dex */
public enum VerificationMethodType {
    UNKNOWN(0),
    EMAIL(1),
    MOBILE(2),
    PASSWORD(3);

    public static VerificationMethodType valueOf(String str) {
        return (VerificationMethodType) V0N.LJJJ(VerificationMethodType.class, str);
    }

    VerificationMethodType(int i) {
    }
}
