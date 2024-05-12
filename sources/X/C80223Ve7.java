package X;

import android.animation.ValueAnimator;

/* renamed from: X.Ve7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80223Ve7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80221Ve5 LJLIL;

    public C80223Ve7(C80221Ve5 c80221Ve5) {
        this.LJLIL = c80221Ve5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
