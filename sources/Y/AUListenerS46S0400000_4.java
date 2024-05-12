package Y;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public class AUListenerS46S0400000_4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void onAnimationUpdate$0(AUListenerS46S0400000_4 aUListenerS46S0400000_4, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS46S0400000_4.l0;
        int i = -intValue;
        view.setPadding(i, view.getPaddingTop(), intValue, ((View) aUListenerS46S0400000_4.l0).getPaddingBottom());
        View view2 = (View) aUListenerS46S0400000_4.l1;
        view2.setPadding(i, view2.getPaddingTop(), intValue, ((View) aUListenerS46S0400000_4.l1).getPaddingBottom());
        ((ViewGroup.MarginLayoutParams) aUListenerS46S0400000_4.l2).setMarginStart(intValue);
        ((View) aUListenerS46S0400000_4.l3).setLayoutParams((ViewGroup.MarginLayoutParams) aUListenerS46S0400000_4.l2);
    }

    public static final void onAnimationUpdate$1(AUListenerS46S0400000_4 aUListenerS46S0400000_4, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS46S0400000_4.l0;
        int i = -intValue;
        view.setPadding(intValue, view.getPaddingTop(), i, ((View) aUListenerS46S0400000_4.l0).getPaddingBottom());
        View view2 = (View) aUListenerS46S0400000_4.l1;
        view2.setPadding(intValue, view2.getPaddingTop(), i, ((View) aUListenerS46S0400000_4.l1).getPaddingBottom());
        ((ViewGroup.MarginLayoutParams) aUListenerS46S0400000_4.l2).setMarginStart(intValue);
        ((View) aUListenerS46S0400000_4.l3).setLayoutParams((ViewGroup.MarginLayoutParams) aUListenerS46S0400000_4.l2);
    }

    public AUListenerS46S0400000_4(View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams, View view3, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = marginLayoutParams;
        this.l3 = view3;
    }
}
