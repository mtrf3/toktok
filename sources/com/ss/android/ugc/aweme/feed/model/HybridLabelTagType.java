package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes4.dex */
public enum HybridLabelTagType {
    UNKNOWN(0),
    PRIVACY(1),
    FRIEND(2),
    FOLLOWING(3),
    MAF(4);

    public final int value;

    public static HybridLabelTagType valueOf(String str) {
        return (HybridLabelTagType) V0N.LJJJ(HybridLabelTagType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    HybridLabelTagType(int i) {
        this.value = i;
    }
}
