package Y;

import X.AnonymousClass833;
import X.C177326xc;
import X.C202597xH;
import X.C264612c;
import X.C29701Eo;
import X.C32151Nz;
import X.C56K;
import X.C71Q;
import X.C8DZ;
import X.O6R;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AUListenerS95S0200000_3 implements ValueAnimator.AnimatorUpdateListener {
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
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS95S0200000_3.l0;
        Object animatedValue = anim.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        marginLayoutParams.setMarginStart(((Integer) animatedValue).intValue());
        ((C177326xc) aUListenerS95S0200000_3.l1).LJFF.setLayoutParams((ViewGroup.MarginLayoutParams) aUListenerS95S0200000_3.l0);
    }

    public static final void onAnimationUpdate$1(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleX(floatValue);
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleY(floatValue);
        ((AnonymousClass833) aUListenerS95S0200000_3.l1).invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleX(floatValue);
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleY(floatValue);
        ((AnonymousClass833) aUListenerS95S0200000_3.l1).invalidate();
    }

    public static final void onAnimationUpdate$3(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleX(floatValue);
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleY(floatValue);
        ((C202597xH) aUListenerS95S0200000_3.l1).invalidate();
    }

    public static final void onAnimationUpdate$4(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleX(floatValue);
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleY(floatValue);
        ((C202597xH) aUListenerS95S0200000_3.l1).invalidate();
    }

    public static final void onAnimationUpdate$5(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleX(floatValue);
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleY(floatValue);
        ((C8DZ) aUListenerS95S0200000_3.l1).invalidate();
    }

    public static final void onAnimationUpdate$6(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleX(floatValue);
        ((TuxIconView) aUListenerS95S0200000_3.l0).setScaleY(floatValue);
        ((C8DZ) aUListenerS95S0200000_3.l1).invalidate();
    }

    public static final void onAnimationUpdate$7(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            if (floatValue < 2750.0f) {
                ((C29701Eo) aUListenerS95S0200000_3.l0).setProgress(floatValue / 5500.0f);
                return;
            }
            if (floatValue >= 2750.0f && floatValue <= ((C56K) aUListenerS95S0200000_3.l1).element + 2750.0f) {
                ((C29701Eo) aUListenerS95S0200000_3.l0).setProgress(0.5f);
                return;
            }
            float f2 = (floatValue - 2750.0f) / 5500.0f;
            C29701Eo c29701Eo = (C29701Eo) aUListenerS95S0200000_3.l0;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            c29701Eo.setProgress(f2);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS95S0200000_3 aUListenerS95S0200000_3, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        ((ViewGroup.MarginLayoutParams) aUListenerS95S0200000_3.l0).setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS95S0200000_3.l0;
        Object animatedValue = anim.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        marginLayoutParams.setMarginEnd(((Integer) animatedValue).intValue());
        ((View) ((C71Q) aUListenerS95S0200000_3.l1).LIZJ.getValue()).setLayoutParams((ViewGroup.MarginLayoutParams) aUListenerS95S0200000_3.l0);
    }

    public AUListenerS95S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
