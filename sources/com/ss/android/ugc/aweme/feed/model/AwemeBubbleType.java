package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum AwemeBubbleType {
    LEFT(1);

    public final int value;

    public static AwemeBubbleType valueOf(String str) {
        return (AwemeBubbleType) V0N.LJJJ(AwemeBubbleType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AwemeBubbleType(int i) {
        this.value = i;
    }
}
