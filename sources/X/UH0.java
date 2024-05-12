package X;

import android.animation.ValueAnimator;

/* loaded from: classes14.dex */
public final class UH0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C76923UGx LJLJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C76923UGx c76923UGx = this.LJLJI;
        c76923UGx.LLFFF = (int) (((this.LJLILLLLZI - r2) * floatValue) + this.LJLIL);
        c76923UGx.invalidate();
    }

    public UH0(C76923UGx c76923UGx, int i, int i2) {
        this.LJLJI = c76923UGx;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
