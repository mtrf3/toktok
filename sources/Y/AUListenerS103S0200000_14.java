package Y;

import X.C0CO;
import X.C16300kU;
import X.C76732zl;
import X.C81199Vtr;
import X.C81291VvL;
import X.C81312Vvg;
import X.C81313Vvh;
import X.C81443Vxn;
import X.C82011WGp;
import X.KOV;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AUListenerS103S0200000_14 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS103S0200000_14 aUListenerS103S0200000_14, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C81313Vvh) aUListenerS103S0200000_14.l0).LIZLLL = it.getAnimatedFraction();
        ((C81312Vvg) aUListenerS103S0200000_14.l1).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS103S0200000_14 aUListenerS103S0200000_14, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue instanceof Matrix) {
            C82011WGp c82011WGp = (C82011WGp) aUListenerS103S0200000_14.l0;
            Matrix matrix = (Matrix) animatedValue;
            c82011WGp.LJLLJ = matrix;
            c82011WGp.LLFII = C81199Vtr.LIZ(matrix);
            C16300kU.LJIIJ((C82011WGp) aUListenerS103S0200000_14.l0);
        }
        ((ValueAnimator) aUListenerS103S0200000_14.l1).setInterpolator(((C82011WGp) aUListenerS103S0200000_14.l0).LLI);
    }

    public static final void onAnimationUpdate$2(AUListenerS103S0200000_14 aUListenerS103S0200000_14, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View requireView = ((C81443Vxn) aUListenerS103S0200000_14.l0).requireView();
        o.LJIIIIZZ(requireView, "requireView()");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            requireView.setTranslationY(((Float) animatedValue).floatValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    public static final void onAnimationUpdate$3(AUListenerS103S0200000_14 aUListenerS103S0200000_14, ValueAnimator valueAnimator) {
        int intValue;
        int i;
        int animatedFraction;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        C81291VvL c81291VvL = (C81291VvL) aUListenerS103S0200000_14.l1;
        int i2 = c81291VvL.LIZIZ;
        int i3 = c81291VvL.LIZJ;
        if (i2 > i3) {
            intValue = (i2 - num.intValue()) / 2;
            C81291VvL c81291VvL2 = (C81291VvL) aUListenerS103S0200000_14.l1;
            i = c81291VvL2.LIZIZ - intValue;
            c81291VvL2.getClass();
            animatedFraction = (int) (valueAnimator.getAnimatedFraction() * 0.0f);
        } else {
            intValue = (i3 - num.intValue()) / 2;
            C81291VvL c81291VvL3 = (C81291VvL) aUListenerS103S0200000_14.l1;
            i = c81291VvL3.LIZJ - intValue;
            c81291VvL3.getClass();
            ((C81291VvL) aUListenerS103S0200000_14.l1).getClass();
            animatedFraction = (int) (0.0f - (valueAnimator.getAnimatedFraction() * 0.0f));
        }
        ((GradientDrawable) aUListenerS103S0200000_14.l0).setBounds(intValue + animatedFraction, animatedFraction, i - animatedFraction, ((C81291VvL) aUListenerS103S0200000_14.l1).LJII.getHeight() - animatedFraction);
    }

    public static final void onAnimationUpdate$4(AUListenerS103S0200000_14 aUListenerS103S0200000_14, ValueAnimator valueAnimator) {
        Integer num;
        int i;
        float f;
        float f2;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int intValue = num.intValue();
            float f3 = -(intValue - ((C76732zl) aUListenerS103S0200000_14.l0).element);
            C0CO c0co = ((KOV) aUListenerS103S0200000_14.l1).LJLJJL.LJLLL;
            if (c0co.LIZIZ.LJLLJ) {
                float f4 = c0co.LJFF - f3;
                c0co.LJFF = f4;
                int round = Math.round(f4 - c0co.LJI);
                c0co.LJI += round;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (c0co.LIZ.getOrientation() == 0) {
                    i = round;
                    round = 0;
                    f = c0co.LJFF;
                    f2 = 0.0f;
                } else {
                    i = 0;
                    f = 0.0f;
                    f2 = c0co.LJFF;
                }
                c0co.LIZJ.scrollBy(i, round);
                MotionEvent obtain = MotionEvent.obtain(c0co.LJII, uptimeMillis, 2, f, f2, 0);
                c0co.LIZLLL.addMovement(obtain);
                obtain.recycle();
            }
            ((C76732zl) aUListenerS103S0200000_14.l0).element = intValue;
        }
    }

    public AUListenerS103S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
