package Y;

import X.C12U;
import X.C141335gf;
import X.C15380j0;
import X.C16O;
import X.C16P;
import X.C1H0;
import X.C278217i;
import X.C280518f;
import X.C37781e2;
import X.C3C5;
import X.C45101pq;
import X.C47061t0;
import X.C76800UCe;
import X.InterfaceC16680l6;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDUListenerS170S0200000 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(IDUListenerS170S0200000 iDUListenerS170S0200000, ValueAnimator valueAnimator) {
        ((View) ((C280518f) ((InterfaceC16680l6) iDUListenerS170S0200000.l0)).LIZ.LIZLLL.getParent()).invalidate();
    }

    public static final void onAnimationUpdate$1(IDUListenerS170S0200000 iDUListenerS170S0200000, ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        if (Math.abs(f) >= 0.5d) {
            f = Math.signum(f) - f;
        }
        float LIZ = C15380j0.LIZ(60.0f) * f;
        ((C47061t0) iDUListenerS170S0200000.l0).setTranslationY(LIZ);
        C1H0 c1h0 = ((KaraokeHoverWidget) iDUListenerS170S0200000.l1).LJLILLLLZI;
        if (c1h0 == null) {
            return;
        }
        c1h0.setTranslationY(LIZ);
    }

    public static final void onAnimationUpdate$2(IDUListenerS170S0200000 iDUListenerS170S0200000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C45101pq c45101pq = ((C278217i) iDUListenerS170S0200000.l0).LIZ;
        if (c45101pq != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            c45101pq.LJJ(((Integer) animatedValue).intValue());
        }
        ((C12U) iDUListenerS170S0200000.l1).LIZ();
    }

    public static final void onAnimationUpdate$3(IDUListenerS170S0200000 iDUListenerS170S0200000, ValueAnimator valueAnimator) {
        float measuredWidth;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        View view = (View) iDUListenerS170S0200000.l0;
        C37781e2 c37781e2 = (C37781e2) iDUListenerS170S0200000.l1;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (view != null) {
                if (!c37781e2.LJLJJL) {
                    floatValue = 1.8f - floatValue;
                }
                view.setScaleX(floatValue);
                if (!C15380j0.LJIIZILJ()) {
                    measuredWidth = 0.0f;
                } else {
                    measuredWidth = view.getMeasuredWidth();
                }
                view.setPivotX(measuredWidth);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void onAnimationUpdate$4(IDUListenerS170S0200000 iDUListenerS170S0200000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        View view = (View) iDUListenerS170S0200000.l0;
        C37781e2 c37781e2 = (C37781e2) iDUListenerS170S0200000.l1;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (view != null) {
                if (!c37781e2.LJLJJL) {
                    floatValue = 1.0f - floatValue;
                }
                view.setAlpha(floatValue);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void onAnimationUpdate$5(IDUListenerS170S0200000 iDUListenerS170S0200000, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C16P c16p = (C16P) iDUListenerS170S0200000.l1;
        C16O c16o = (C16O) iDUListenerS170S0200000.l0;
        c16p.getClass();
        C16P.LIZLLL(floatValue, c16o);
        ((C16P) iDUListenerS170S0200000.l1).LIZ(floatValue, (C16O) iDUListenerS170S0200000.l0, false);
        ((C16P) iDUListenerS170S0200000.l1).invalidateSelf();
    }

    public IDUListenerS170S0200000(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
