package X;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.20r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C515720r extends AbstractC65781Prl implements InterfaceC65784Pro<ValueAnimator> {
    public static final C515720r LJLIL = new C515720r();

    public C515720r() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ValueAnimator invoke() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        return valueAnimator;
    }
}
