package X;

import android.animation.ValueAnimator;

/* renamed from: X.Vg8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80348Vg8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C80343Vg3 LJLIL;

    public C80348Vg8(C80343Vg3 c80343Vg3) {
        this.LJLIL = c80343Vg3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.LJLIL.LIZJ.setScaleX(floatValue);
        this.LJLIL.LIZJ.setScaleY(floatValue);
    }
}
