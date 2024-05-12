package com.ss.android.ugc.aweme.experiment;

import X.C0ID;
import X.C221108m2;
import X.C5H3;
import X.C87683Yb9;
import X.C87684YbA;

/* loaded from: classes17.dex */
public final class FollowFeedViewStubExperiment implements C0ID {
    public static final C87684YbA Companion = new C87684YbA();
    public static final boolean DEFAULT_VALUE = false;
    public static final String KEY = "follow_feed_viewstub_opt";
    public static final String REPO_NAME = "ab_repo_cold_boot";
    public static boolean expVal;
    public static boolean hasInit;
    public final boolean close;
    public final C5H3 expVal$delegate = C221108m2.LIZIZ(C87683Yb9.LJLIL);

    private final boolean getExpVal() {
        return ((Boolean) this.expVal$delegate.getValue()).booleanValue();
    }

    @Override // X.C0ID
    public boolean hit() {
        return getExpVal();
    }

    public final boolean getClose() {
        return this.close;
    }
}
