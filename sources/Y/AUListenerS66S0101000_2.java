package Y;

import X.C159006Lw;
import X.C159016Lx;
import X.C45737HxF;
import X.C6KA;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AUListenerS66S0101000_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS66S0101000_2 aUListenerS66S0101000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C159006Lw c159006Lw = (C159006Lw) aUListenerS66S0101000_2.l0;
        C159016Lx[] c159016LxArr = c159006Lw.LLFII;
        if (c159016LxArr != null) {
            C159016Lx c159016Lx = c159016LxArr[aUListenerS66S0101000_2.i1];
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            c159016Lx.LJLJJI = ((Integer) animatedValue).intValue();
            c159006Lw.invalidate();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS66S0101000_2 aUListenerS66S0101000_2, ValueAnimator valueAnimator) {
        switch (aUListenerS66S0101000_2.i1) {
            case 0:
                C45737HxF c45737HxF = (C45737HxF) aUListenerS66S0101000_2.l0;
                c45737HxF.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = c45737HxF.LJLJLJ;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) floatValue;
                view.setLayoutParams(layoutParams);
                return;
            default:
                ImageView imageView = ((C6KA) aUListenerS66S0101000_2.l0).LIZ.LJLJLLL;
                if (imageView != null) {
                    imageView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
        }
    }

    public AUListenerS66S0101000_2(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
