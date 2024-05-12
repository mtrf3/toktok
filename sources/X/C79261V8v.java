package X;

import android.animation.ValueAnimator;

/* renamed from: X.V8v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79261V8v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80418VhG LJLIL;

    public C79261V8v(C80418VhG c80418VhG) {
        this.LJLIL = c80418VhG;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLIL.LJIIJ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
