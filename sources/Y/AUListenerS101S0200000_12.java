package Y;

import X.C264612c;
import X.S21;
import X.SJ3;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.widget.FrameLayout;

/* loaded from: classes13.dex */
public class AUListenerS101S0200000_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS101S0200000_12 aUListenerS101S0200000_12, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((S21) aUListenerS101S0200000_12.l0).setAlpha(floatValue);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aUListenerS101S0200000_12.l1;
        layoutParams.bottomMargin = (int) ((floatValue - 1) * layoutParams.height);
        ((S21) aUListenerS101S0200000_12.l0).setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS101S0200000_12 aUListenerS101S0200000_12, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((S21) aUListenerS101S0200000_12.l0).setAlpha(floatValue);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aUListenerS101S0200000_12.l1;
        layoutParams.bottomMargin = (int) ((floatValue - 1) * layoutParams.height);
        ((S21) aUListenerS101S0200000_12.l0).setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$2(AUListenerS101S0200000_12 aUListenerS101S0200000_12, ValueAnimator valueAnimator) {
        SJ3 sj3 = (SJ3) aUListenerS101S0200000_12.l0;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) aUListenerS101S0200000_12.l1;
        Matrix matrix = sj3.LJZ;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        do {
            sj3.LJLLLLLL[i] = (sj3.LJLLLL[i] * floatValue) + ((1.0f - floatValue) * sj3.LJLLL[i]);
            i++;
        } while (i < 9);
        matrix.setValues(sj3.LJLLLLLL);
        sj3.LJLLI.set(sj3.LJZ);
        sj3.LJFF();
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }

    public AUListenerS101S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
