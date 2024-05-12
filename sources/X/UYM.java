package X;

import android.animation.ValueAnimator;

/* loaded from: classes14.dex */
public final class UYM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80261Vej LJLIL;

    public UYM(C80261Vej c80261Vej) {
        this.LJLIL = c80261Vej;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
