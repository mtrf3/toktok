package Y;

import X.C15380j0;
import X.C16880lQ;
import X.C2314396l;
import X.C264612c;
import X.C31563Ca7;
import X.C44384HbQ;
import X.C74074T5i;
import X.C76800UCe;
import X.C76930UHe;
import X.InterfaceC88472Yns;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AUListenerS96S0200000_4 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS96S0200000_4 aUListenerS96S0200000_4, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS96S0200000_4.l0;
        layoutParams.height = intValue;
        ((C76930UHe) aUListenerS96S0200000_4.l1).setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS96S0200000_4 aUListenerS96S0200000_4, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup.LayoutParams layoutParams = ((C74074T5i) aUListenerS96S0200000_4.l0).getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aUListenerS96S0200000_4.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(it);
        }
        ((C74074T5i) aUListenerS96S0200000_4.l0).requestLayout();
    }

    public static final void onAnimationUpdate$2(AUListenerS96S0200000_4 aUListenerS96S0200000_4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((View) aUListenerS96S0200000_4.l0).setAlpha(floatValue);
        ((View) aUListenerS96S0200000_4.l1).setAlpha(floatValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS96S0200000_4 aUListenerS96S0200000_4, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((BaseCaptionSheetFragment) aUListenerS96S0200000_4.l0).getView();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            view.requestLayout();
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        ValueAnimator valueAnimator = (ValueAnimator) aUListenerS96S0200000_4.l1;
        C16880lQ.LJLJL(valueAnimator);
        valueAnimator.cancel();
    }

    public static final void onAnimationUpdate$4(AUListenerS96S0200000_4 aUListenerS96S0200000_4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((RelativeLayout.LayoutParams) aUListenerS96S0200000_4.l0).bottomMargin = (int) (C44384HbQ.LJJJLL(50) * floatValue);
        ((C2314396l) aUListenerS96S0200000_4.l1).setAlpha(floatValue);
        ((C2314396l) aUListenerS96S0200000_4.l1).setLayoutParams((RelativeLayout.LayoutParams) aUListenerS96S0200000_4.l0);
    }

    public static final void onAnimationUpdate$5(AUListenerS96S0200000_4 aUListenerS96S0200000_4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((RelativeLayout.LayoutParams) aUListenerS96S0200000_4.l0).bottomMargin = (int) (C44384HbQ.LJJJLL(50) * floatValue);
        ((C2314396l) aUListenerS96S0200000_4.l1).setAlpha(floatValue);
        ((C2314396l) aUListenerS96S0200000_4.l1).setLayoutParams((RelativeLayout.LayoutParams) aUListenerS96S0200000_4.l0);
    }

    public static final void onAnimationUpdate$6(AUListenerS96S0200000_4 aUListenerS96S0200000_4, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((ViewGroup.LayoutParams) aUListenerS96S0200000_4.l0) instanceof FrameLayout.LayoutParams) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (floatValue > C15380j0.LIZ(-20.0f) && floatValue < C15380j0.LIZ(-15.0f)) {
                ((C31563Ca7) aUListenerS96S0200000_4.l1).LL.setAlpha((C15380j0.LIZ(20.0f) + floatValue) / C15380j0.LIZ(5.0f));
            } else if (floatValue > C15380j0.LIZ(15.0f) && floatValue < C15380j0.LIZ(20.0f)) {
                ((C31563Ca7) aUListenerS96S0200000_4.l1).LL.setAlpha(1 - ((floatValue - C15380j0.LIZ(15.0f)) / C15380j0.LIZ(5.0f)));
            }
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.LayoutParams) aUListenerS96S0200000_4.l0)).setMarginStart((int) floatValue);
            ((C31563Ca7) aUListenerS96S0200000_4.l1).LL.setLayoutParams((ViewGroup.LayoutParams) aUListenerS96S0200000_4.l0);
        }
    }

    public AUListenerS96S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
