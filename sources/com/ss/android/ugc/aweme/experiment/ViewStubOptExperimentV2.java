package com.ss.android.ugc.aweme.experiment;

import X.C0ID;
import X.C221108m2;
import X.C34762Dkc;
import X.C34763Dkd;
import X.C5H3;

/* loaded from: classes7.dex */
public final class ViewStubOptExperimentV2 implements C0ID {
    public static final boolean ALL_OPT = true;
    public static final C34763Dkd Companion = new C34763Dkd();
    public static final boolean DEFAULT_VALUE = false;
    public static final String KEY = "feed_viewstub_opt_v2";
    public static boolean expVal;
    public static boolean hasInit;
    public final C5H3 coldBootExpVal$delegate = C221108m2.LIZIZ(C34762Dkc.LJLIL);

    /* renamed from: default, reason: not valid java name */
    public final boolean f27default;

    private final boolean getColdBootExpVal() {
        return ((Boolean) this.coldBootExpVal$delegate.getValue()).booleanValue();
    }

    @Override // X.C0ID
    public boolean hit() {
        return getColdBootExpVal();
    }

    public final boolean getDefault() {
        return this.f27default;
    }
}
