package X;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes10.dex */
public final class LDI extends AbstractC65781Prl implements InterfaceC65784Pro<ValueAnimator> {
    public static final LDI LJLIL = new LDI();

    public LDI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ValueAnimator invoke() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        return valueAnimator;
    }
}
