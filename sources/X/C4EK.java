package X;

import android.animation.ValueAnimator;

/* renamed from: X.4EK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EK extends AbstractC65781Prl implements InterfaceC65784Pro<ValueAnimator> {
    public static final C4EK LJLIL = new C4EK();

    public C4EK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ValueAnimator invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(C55953Lxd.LJIIIIZZ());
        return ofFloat;
    }
}
