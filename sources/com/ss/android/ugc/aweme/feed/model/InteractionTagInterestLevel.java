package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes11.dex */
public enum InteractionTagInterestLevel {
    UNDEFINED(0),
    LOW(1),
    HIGH(2);

    public final int level;

    public static InteractionTagInterestLevel valueOf(String str) {
        return (InteractionTagInterestLevel) V0N.LJJJ(InteractionTagInterestLevel.class, str);
    }

    public final int getLevel() {
        return this.level;
    }

    InteractionTagInterestLevel(int i) {
        this.level = i;
    }
}
