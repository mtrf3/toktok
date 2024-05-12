package com.ss.android.ugc.aweme.benchmark;

import X.V0N;

/* loaded from: classes10.dex */
public enum BTCHMode {
    NORMAL("normal"),
    NOT_LOGIN("notlogin"),
    KIDS("kids");

    public final String value;

    public static BTCHMode valueOf(String str) {
        return (BTCHMode) V0N.LJJJ(BTCHMode.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    BTCHMode(String str) {
        this.value = str;
    }
}
