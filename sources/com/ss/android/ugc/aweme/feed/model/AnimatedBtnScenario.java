package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes4.dex */
public enum AnimatedBtnScenario {
    UNKNOWN(0),
    LIKE_GUIDE(1);

    public final int value;

    public static AnimatedBtnScenario valueOf(String str) {
        return (AnimatedBtnScenario) V0N.LJJJ(AnimatedBtnScenario.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AnimatedBtnScenario(int i) {
        this.value = i;
    }
}
