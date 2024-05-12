package X;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KLE implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ KLD LJLIL;
    public final /* synthetic */ KLC LJLILLLLZI;
    public final /* synthetic */ RectF LJLJI;
    public final /* synthetic */ RectF LJLJJI;

    public KLE(KLD kld, KLC klc, RectF rectF, RectF rectF2) {
        this.LJLIL = kld;
        this.LJLILLLLZI = klc;
        this.LJLJI = rectF;
        this.LJLJJI = rectF2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        KLD kld = this.LJLIL;
        if (kld.LLD == null) {
            kld.LLD = new RectF();
        }
        KLD kld2 = this.LJLIL;
        RectF rectF = kld2.LLD;
        if (rectF != null) {
            RectF rectF2 = this.LJLJI;
            RectF rectF3 = this.LJLJJI;
            rectF.left = C06420Na.LIZIZ(rectF3.left, rectF2.left, it.getAnimatedFraction(), rectF2.left);
            rectF.top = C06420Na.LIZIZ(rectF3.top, rectF2.top, it.getAnimatedFraction(), rectF2.top);
            rectF.right = C06420Na.LIZIZ(rectF3.right, rectF2.right, it.getAnimatedFraction(), rectF2.right);
            rectF.bottom = C06420Na.LIZIZ(rectF3.bottom, rectF2.bottom, it.getAnimatedFraction(), rectF2.bottom);
            float f = 2;
            if (rectF.right - rectF.left <= ((kld2.LJLILLLLZI.getStrokeWidth() / f) + kld2.LJLL) * f) {
                kld2.LJLJJLL.setColor(C51452KHg.LIZ);
            }
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type android.graphics.RectF");
        float f2 = ((RectF) animatedValue).right;
        Object animatedValue2 = it.getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type android.graphics.RectF");
        if (f2 - ((RectF) animatedValue2).left >= this.LJLIL.LJLLI * 2) {
            this.LJLILLLLZI.LJLJJI = false;
        }
    }
}
