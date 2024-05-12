package com.ss.android.ugc.aweme.experiment;

import X.C0ID;
import X.C221108m2;
import X.C34753DkT;
import X.C34754DkU;
import X.C5H3;

/* loaded from: classes7.dex */
public final class ViewStubOptExperiment implements C0ID {
    public static final boolean DEFAULT_VALUE = true;
    public static final String KEY = "feed_viewstub_opt";
    public static boolean hasInit;
    public final boolean DEFAULT = true;
    public final C5H3 coldBootExpVal$delegate = C221108m2.LIZIZ(C34753DkT.LJLIL);
    public static final C34754DkU Companion = new C34754DkU();
    public static boolean expVal = true;

    private final boolean getColdBootExpVal() {
        return ((Boolean) this.coldBootExpVal$delegate.getValue()).booleanValue();
    }

    @Override // X.C0ID
    public boolean hit() {
        return getColdBootExpVal();
    }

    public final boolean getDEFAULT() {
        return this.DEFAULT;
    }
}
