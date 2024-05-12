package X;

import android.animation.ValueAnimator;

/* renamed from: X.T5t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74085T5t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80508Vii LJLIL;

    public C74085T5t(C80508Vii c80508Vii) {
        this.LJLIL = c80508Vii;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LIZJ(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }
}
