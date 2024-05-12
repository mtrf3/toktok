package com.ss.android.ugc.aweme.experiment;

import X.C221108m2;
import X.C52981Kqn;
import X.C5H3;

/* loaded from: classes10.dex */
public final class SeekBarEdgeOptiExp {
    public static final boolean DEFAULT = false;
    public static final boolean TREATMENT = true;
    public static final SeekBarEdgeOptiExp INSTANCE = new SeekBarEdgeOptiExp();
    public static final C5H3 res$delegate = C221108m2.LIZIZ(C52981Kqn.LJLIL);

    private final boolean getRes() {
        return ((Boolean) res$delegate.getValue()).booleanValue();
    }

    public final boolean edgeOptimized() {
        if (getRes()) {
            return true;
        }
        return false;
    }
}
