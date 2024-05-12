package Y;

import X.C48740JAy;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AUListenerS0S0303000_8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationUpdate$0(AUListenerS0S0303000_8 aUListenerS0S0303000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((C48740JAy) aUListenerS0S0303000_8.l0).LIZJ == null || ((View) aUListenerS0S0303000_8.l1) == null) {
            return;
        }
        float animatedFraction = it.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        ((View) aUListenerS0S0303000_8.l1).setAlpha(f);
        int i = (int) (animatedFraction * aUListenerS0S0303000_8.i3);
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS0S0303000_8.l1).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (f * aUListenerS0S0303000_8.i3);
        }
        int i2 = aUListenerS0S0303000_8.i4 - i;
        ViewGroup.LayoutParams layoutParams2 = ((View) aUListenerS0S0303000_8.l2).getLayoutParams();
        if (layoutParams2 != null) {
            int i3 = aUListenerS0S0303000_8.i5;
            if (i2 < i3) {
                i2 = i3;
            }
            layoutParams2.width = i2;
        }
        View view = ((C48740JAy) aUListenerS0S0303000_8.l0).LIZJ;
        if (view != null) {
            view.requestLayout();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0303000_8 aUListenerS0S0303000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((C48740JAy) aUListenerS0S0303000_8.l0).LIZJ == null || ((LinearLayout) aUListenerS0S0303000_8.l1) == null) {
            return;
        }
        float animatedFraction = it.getAnimatedFraction();
        ((LinearLayout) aUListenerS0S0303000_8.l1).setAlpha(animatedFraction);
        int i = (int) ((aUListenerS0S0303000_8.i3 * animatedFraction) + aUListenerS0S0303000_8.i4);
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS0S0303000_8.l2).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
        }
        int i2 = (int) ((animatedFraction * aUListenerS0S0303000_8.i5) + aUListenerS0S0303000_8.i4);
        ViewGroup.LayoutParams layoutParams2 = ((LinearLayout) aUListenerS0S0303000_8.l1).getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = i2;
        }
        View view = ((C48740JAy) aUListenerS0S0303000_8.l0).LIZJ;
        if (view != null) {
            view.requestLayout();
        }
    }

    public AUListenerS0S0303000_8(Object obj, Object obj2, int i, int i2, Object obj3, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.i4 = i2;
        this.l2 = obj3;
        this.i5 = i3;
    }
}
