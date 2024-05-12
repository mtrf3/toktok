package X;

import android.animation.ValueAnimator;

/* renamed from: X.VgD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80353VgD implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80343Vg3 LJLIL;

    public C80353VgD(C80343Vg3 c80343Vg3) {
        this.LJLIL = c80343Vg3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LIZJ.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
