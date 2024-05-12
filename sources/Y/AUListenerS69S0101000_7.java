package Y;

import X.C45674HwE;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AUListenerS69S0101000_7 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS69S0101000_7 aUListenerS69S0101000_7, ValueAnimator it) {
        Integer num;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS69S0101000_7.l0).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i = aUListenerS69S0101000_7.i1;
            View view = (View) aUListenerS69S0101000_7.l0;
            if (num != null) {
                marginLayoutParams.bottomMargin = i - num.intValue();
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS69S0101000_7 aUListenerS69S0101000_7, ValueAnimator valueAnimator) {
        ((C45674HwE) aUListenerS69S0101000_7.l0).LJLJJLL.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * aUListenerS69S0101000_7.i1);
    }

    public AUListenerS69S0101000_7(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
