package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes4.dex */
public enum AwemeBubbleBusiness {
    PROMOTE(1);

    public final int value;

    public static AwemeBubbleBusiness valueOf(String str) {
        return (AwemeBubbleBusiness) V0N.LJJJ(AwemeBubbleBusiness.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AwemeBubbleBusiness(int i) {
        this.value = i;
    }
}
