package Y;

import X.C32151Nz;
import X.C91139Zpn;
import X.C91171ZqJ;
import X.C91197Zqj;
import X.C91234ZrK;
import X.C91488ZvQ;
import X.O6R;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDUListenerS264S0100000_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public IDUListenerS264S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        GradientDrawable gradientDrawable = (GradientDrawable) iDUListenerS264S0100000_29.l0;
        if (gradientDrawable != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                gradientDrawable.setColor(num.intValue());
            }
        }
    }

    public static final void onAnimationUpdate$1(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        GradientDrawable gradientDrawable = (GradientDrawable) iDUListenerS264S0100000_29.l0;
        if (gradientDrawable != null) {
            int LJJIIZ = O6R.LJJIIZ(it.getAnimatedFraction() * C32151Nz.LJIIZILJ(1));
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                gradientDrawable.setStroke(LJJIIZ, num.intValue());
            }
        }
    }

    public static final void onAnimationUpdate$10(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C91197Zqj) iDUListenerS264S0100000_29.l0).LJII(1 - it.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$11(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        C91234ZrK c91234ZrK = (C91234ZrK) iDUListenerS264S0100000_29.l0;
        c91234ZrK.LJLJJL = animatedFraction;
        c91234ZrK.invalidate();
    }

    public static final void onAnimationUpdate$2(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        TuxIconView tuxIconView = ((C91139Zpn) iDUListenerS264S0100000_29.l0).LJLIL;
        if (tuxIconView != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                tuxIconView.setTintColor(num.intValue());
            }
        }
    }

    public static final void onAnimationUpdate$3(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        TuxTextView tuxTextView = ((C91139Zpn) iDUListenerS264S0100000_29.l0).LJLILLLLZI;
        if (tuxTextView != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                tuxTextView.setTextColor(num.intValue());
            }
        }
    }

    public static final void onAnimationUpdate$4(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C91488ZvQ) iDUListenerS264S0100000_29.l0).setAlpha(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$5(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C91488ZvQ) iDUListenerS264S0100000_29.l0).setAlpha(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$6(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            TuxTextView tuxTextView = ((C91488ZvQ) iDUListenerS264S0100000_29.l0).LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setScaleX(floatValue);
                tuxTextView.setScaleY(floatValue);
            }
        }
    }

    public static final void onAnimationUpdate$7(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            TuxTextView tuxTextView = ((C91488ZvQ) iDUListenerS264S0100000_29.l0).LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setScaleX(floatValue);
                tuxTextView.setScaleY(floatValue);
            }
        }
    }

    public static final void onAnimationUpdate$8(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        C91171ZqJ c91171ZqJ = (C91171ZqJ) iDUListenerS264S0100000_29.l0;
        Object animatedValue = animator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c91171ZqJ.scrollTo(((Integer) animatedValue).intValue(), 0);
    }

    public static final void onAnimationUpdate$9(IDUListenerS264S0100000_29 iDUListenerS264S0100000_29, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C91197Zqj) iDUListenerS264S0100000_29.l0).LJII(it.getAnimatedFraction());
    }
}
