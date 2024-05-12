package com.ss.android.ugc.aweme.profile.model;

import X.V0N;

/* loaded from: classes5.dex */
public enum AccountLabelType {
    SCM(1),
    AGS_WARNING(2),
    HONOR_LABEL_VERIFICATION(3);

    public final int value;

    public static AccountLabelType valueOf(String str) {
        return (AccountLabelType) V0N.LJJJ(AccountLabelType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AccountLabelType(int i) {
        this.value = i;
    }
}
