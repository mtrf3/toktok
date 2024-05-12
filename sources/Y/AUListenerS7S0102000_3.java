package Y;

import X.C210118Ml;
import X.C264612c;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public class AUListenerS7S0102000_3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final void onAnimationUpdate$0(AUListenerS7S0102000_3 aUListenerS7S0102000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        for (int i = aUListenerS7S0102000_3.i1; i < aUListenerS7S0102000_3.i2; i++) {
            View childAt = ((C210118Ml) aUListenerS7S0102000_3.l0).getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.width = (int) floatValue;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS7S0102000_3 aUListenerS7S0102000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        for (int i = aUListenerS7S0102000_3.i1; i < aUListenerS7S0102000_3.i2; i++) {
            View childAt = ((C210118Ml) aUListenerS7S0102000_3.l0).getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.width = (int) floatValue;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public AUListenerS7S0102000_3(int i, int i2, C210118Ml c210118Ml, int i3) {
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = c210118Ml;
    }
}
