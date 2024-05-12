package com.bef.effectsdk.view;

import X.V0N;

/* loaded from: classes.dex */
public enum BEFView$FitMode {
    FIT_WIDTH,
    FIT_HEIGHT,
    FILL_SCREEN,
    FIT_WIDTH_BOTTOM,
    NO_CLIP;

    public static BEFView$FitMode valueOf(String str) {
        return (BEFView$FitMode) V0N.LJJJ(BEFView$FitMode.class, str);
    }
}
