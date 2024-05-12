package X;

import android.animation.ValueAnimator;

/* renamed from: X.VgE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80354VgE implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80342Vg2 LJLIL;

    public C80354VgE(C80342Vg2 c80342Vg2) {
        this.LJLIL = c80342Vg2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LIZJ.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
