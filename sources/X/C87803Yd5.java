package X;

import android.animation.ValueAnimator;

/* renamed from: X.Yd5, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87803Yd5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C87810YdC LJLJI;

    public C87803Yd5(int i, int i2, C87810YdC c87810YdC) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = c87810YdC;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        int i = this.LJLIL;
        if (intValue <= i) {
            int i2 = this.LJLILLLLZI;
            if (i2 >= intValue) {
                AbstractC87817YdJ.LJIIIIZZ(this.LJLJI.LIZLLL, i2 - intValue);
            } else {
                AbstractC87817YdJ.LJIIIIZZ(this.LJLJI.LIZLLL, 0);
            }
        } else {
            if (CCJ.LIZ(this.LJLJI.LJIIL.getContext())) {
                this.LJLJI.LJIIL.setTranslationX((intValue - this.LJLIL) * (-1.0f));
            } else {
                this.LJLJI.LJIIL.setTranslationX(intValue - this.LJLIL);
            }
            AbstractC87817YdJ.LJIIIIZZ(this.LJLJI.LIZLLL, 0);
            intValue = i;
        }
        AbstractC87817YdJ.LJIIIIZZ(this.LJLJI.LJIIJJI, intValue);
        if (intValue > this.LJLJI.LJII.getWidth()) {
            AbstractC87817YdJ.LJIIIIZZ(this.LJLJI.LJII, intValue);
        }
    }
}
