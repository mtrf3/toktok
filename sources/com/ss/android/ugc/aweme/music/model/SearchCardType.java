package com.ss.android.ugc.aweme.music.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum SearchCardType {
    TYPE_NORMAL(1);

    public final int value;

    public static SearchCardType valueOf(String str) {
        return (SearchCardType) V0N.LJJJ(SearchCardType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    SearchCardType(int i) {
        this.value = i;
    }
}
