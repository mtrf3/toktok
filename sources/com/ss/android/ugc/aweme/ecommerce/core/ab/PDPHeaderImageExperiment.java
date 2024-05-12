package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C221108m2;
import X.C5H3;
import X.X9X;

/* loaded from: classes16.dex */
public final class PDPHeaderImageExperiment {
    public static final PDPHeaderImageExperiment INSTANCE = new PDPHeaderImageExperiment();
    public static final PDPImageConfig none = new PDPImageConfig(0, 1, null);
    public static final C5H3 config$delegate = C221108m2.LIZIZ(X9X.LJLIL);

    private final PDPImageConfig getConfig() {
        return (PDPImageConfig) config$delegate.getValue();
    }

    public final boolean isProgressiveSwitch() {
        if (getConfig().progressiveSwitch == 1) {
            return true;
        }
        return false;
    }
}
