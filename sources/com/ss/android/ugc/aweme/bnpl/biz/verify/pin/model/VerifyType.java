package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model;

import X.V0N;

/* loaded from: classes20.dex */
public enum VerifyType {
    OTP("OTP"),
    PIN("PIN");

    public final String LJLIL;

    public static VerifyType valueOf(String str) {
        return (VerifyType) V0N.LJJJ(VerifyType.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    VerifyType(String str) {
        this.LJLIL = str;
    }
}
