package X;

import android.animation.ValueAnimator;

/* renamed from: X.Vfg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80320Vfg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80315Vfb LJLIL;

    public C80320Vfg(C80315Vfb c80315Vfb) {
        this.LJLIL = c80315Vfb;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LLJZ.LJIILIIL(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
