package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBC implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C76824UDc LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ int LJLJJI;

    public LBC(C76824UDc c76824UDc, int i, C76732zl c76732zl, int i2) {
        this.LJLIL = c76824UDc;
        this.LJLILLLLZI = i;
        this.LJLJI = c76732zl;
        this.LJLJJI = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ImageView imageView = this.LJLIL.LIZ;
        int i = this.LJLILLLLZI;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        C76824UDc.LJI((((Float) animatedValue).floatValue() * (-0.58181816f)) + 0.9f, i, imageView);
        ImageView imageView2 = this.LJLIL.LIZ;
        Object animatedValue2 = it.getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        imageView2.setTranslationX(((Float) animatedValue2).floatValue() * this.LJLJI.element);
        ImageView imageView3 = this.LJLIL.LIZ;
        Object animatedValue3 = it.getAnimatedValue();
        o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        imageView3.setTranslationY(((Float) animatedValue3).floatValue() * this.LJLJJI);
        FrameLayout frameLayout = this.LJLIL.LJ;
        Object animatedValue4 = it.getAnimatedValue();
        o.LJII(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        frameLayout.setAlpha(((Float) animatedValue4).floatValue());
    }
}
