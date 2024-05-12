package Y;

import X.C191467fK;
import X.C201607vg;
import X.C2054084i;
import X.C210118Ml;
import X.C264612c;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextLayoutView;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AUListenerS67S0101000_3 implements ValueAnimator.AnimatorUpdateListener {
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS67S0101000_3 aUListenerS67S0101000_3, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ((C2054084i) aUListenerS67S0101000_3.l0).LJLJLJ.getLayoutParams().height = intValue;
        TuxTextLayoutView tuxTextLayoutView = ((C2054084i) aUListenerS67S0101000_3.l0).LJLLL;
        if (tuxTextLayoutView != null) {
            tuxTextLayoutView.requestLayout();
            ((C2054084i) aUListenerS67S0101000_3.l0).LJIIL(intValue, aUListenerS67S0101000_3.i1);
        } else {
            o.LJIJI("descView");
            throw null;
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS67S0101000_3 aUListenerS67S0101000_3, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ((C2054084i) aUListenerS67S0101000_3.l0).LJLJLJ.getLayoutParams().height = intValue;
        TuxTextLayoutView tuxTextLayoutView = ((C2054084i) aUListenerS67S0101000_3.l0).LJLLL;
        if (tuxTextLayoutView != null) {
            tuxTextLayoutView.requestLayout();
            ((C2054084i) aUListenerS67S0101000_3.l0).LJIIL(intValue, aUListenerS67S0101000_3.i1);
        } else {
            o.LJIJI("descView");
            throw null;
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS67S0101000_3 aUListenerS67S0101000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (it.getAnimatedFraction() <= 0.75f) {
            ((View) aUListenerS67S0101000_3.l0).getLayoutParams().height = (int) (((it.getAnimatedFraction() * aUListenerS67S0101000_3.i1) * 4) / 3);
        }
        if (it.getAnimatedFraction() > 0.25f) {
            ((View) aUListenerS67S0101000_3.l0).setAlpha(((it.getAnimatedFraction() - 0.25f) * 4) / 3);
        }
        ((View) aUListenerS67S0101000_3.l0).requestLayout();
    }

    public static final void onAnimationUpdate$3(AUListenerS67S0101000_3 aUListenerS67S0101000_3, ValueAnimator animation) {
        int pow;
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int patientTopMargin = ((C191467fK) aUListenerS67S0101000_3.l0).getPatientTopMargin();
        if (animatedFraction == 1.0f) {
            pow = -patientTopMargin;
        } else {
            pow = (int) (((1 - Math.pow(animatedFraction, 3.0d)) * aUListenerS67S0101000_3.i1) - ((C191467fK) aUListenerS67S0101000_3.l0).getPatientTopMargin());
        }
        ((C191467fK) aUListenerS67S0101000_3.l0).LJLJJL(pow);
    }

    public static final void onAnimationUpdate$4(AUListenerS67S0101000_3 aUListenerS67S0101000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        for (int i = 0; i < aUListenerS67S0101000_3.i1; i++) {
            View childAt = ((C210118Ml) aUListenerS67S0101000_3.l0).getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.width = (int) floatValue;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS67S0101000_3 aUListenerS67S0101000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        for (int i = 0; i < aUListenerS67S0101000_3.i1; i++) {
            View childAt = ((C210118Ml) aUListenerS67S0101000_3.l0).getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.width = (int) floatValue;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS67S0101000_3 aUListenerS67S0101000_3, ValueAnimator animation) {
        int pow;
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int patientLeftMargin = ((C201607vg) aUListenerS67S0101000_3.l0).getPatientLeftMargin();
        if (animatedFraction == 1.0f) {
            pow = -patientLeftMargin;
        } else {
            pow = (int) (((1 - Math.pow(animatedFraction, 3.0d)) * aUListenerS67S0101000_3.i1) - ((C201607vg) aUListenerS67S0101000_3.l0).getPatientLeftMargin());
        }
        ((C201607vg) aUListenerS67S0101000_3.l0).LJJLL(pow, false);
    }

    public AUListenerS67S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
