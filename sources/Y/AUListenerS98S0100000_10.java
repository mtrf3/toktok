package Y;

import X.C264612c;
import X.C58985NCz;
import X.C59571NZn;
import X.C59572NZo;
import X.C59988NgW;
import X.C73030SlO;
import X.InterfaceC59366NRq;
import X.OO3;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.behavior.ui.LynxUI;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AUListenerS98S0100000_10 implements ValueAnimator.AnimatorUpdateListener {
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
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public AUListenerS98S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C59988NgW c59988NgW = (C59988NgW) aUListenerS98S0100000_10.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c59988NgW.setScrollOffset(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C59988NgW c59988NgW = (C59988NgW) aUListenerS98S0100000_10.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c59988NgW.setScrollOffset(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$10(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animatedValue) {
        Integer num;
        o.LJIIIZ(animatedValue, "animatedValue");
        Object animatedValue2 = animatedValue.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).LLZZZIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animatedValue) {
        Integer num;
        o.LJIIIZ(animatedValue, "animatedValue");
        Object animatedValue2 = animatedValue.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).LLZZZIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animatedValue) {
        Integer num;
        o.LJIIIZ(animatedValue, "animatedValue");
        Object animatedValue2 = animatedValue.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).qM(num.intValue());
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animator) {
        Integer num;
        o.LJIIIZ(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).LJJLIIIIJ(num.intValue());
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        C59571NZn c59571NZn = (C59571NZn) aUListenerS98S0100000_10.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c59571NZn.setBottomMargin(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$15(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((BottomSheetBehavior) aUListenerS98S0100000_10.l0).getClass();
    }

    public static final void onAnimationUpdate$16(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animator) {
        Integer num;
        o.LJIIIZ(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C73030SlO.LJIIJ((C58985NCz) aUListenerS98S0100000_10.l0, num.intValue());
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        C59572NZo c59572NZo = (C59572NZo) aUListenerS98S0100000_10.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c59572NZo.setBottomMargin(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animator) {
        Integer num;
        o.LJIIIZ(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).LJJLIIIIJ(num.intValue());
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animatedValue) {
        Integer num;
        o.LJIIIZ(animatedValue, "animatedValue");
        Object animatedValue2 = animatedValue.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).LLZZZIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((LynxUI) aUListenerS98S0100000_10.l0).mView.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        OO3 oo3 = (OO3) aUListenerS98S0100000_10.l0;
        oo3.LJIJ(oo3.LJIL, floatValue);
        ((OO3) aUListenerS98S0100000_10.l0).LJIILLIIL(floatValue);
        ((OO3) aUListenerS98S0100000_10.l0).LJIIZILJ(floatValue);
    }

    public static final void onAnimationUpdate$7(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animatedValue) {
        Float f;
        o.LJIIIZ(animatedValue, "animatedValue");
        Object animatedValue2 = animatedValue.getAnimatedValue();
        if ((animatedValue2 instanceof Float) && (f = (Float) animatedValue2) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).ur0(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animatedValue) {
        Integer num;
        o.LJIIIZ(animatedValue, "animatedValue");
        Object animatedValue2 = animatedValue.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).LLZZZIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS98S0100000_10 aUListenerS98S0100000_10, ValueAnimator animatedValue) {
        Integer num;
        o.LJIIIZ(animatedValue, "animatedValue");
        Object animatedValue2 = animatedValue.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            ((InterfaceC59366NRq) aUListenerS98S0100000_10.l0).LLZZZIL(num.intValue());
        }
    }
}
