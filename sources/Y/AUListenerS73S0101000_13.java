package Y;

import X.C0NB;
import X.C15380j0;
import X.C264612c;
import X.C29306Beo;
import X.C76260TwO;
import X.U1X;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AUListenerS73S0101000_13 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS73S0101000_13 aUListenerS73S0101000_13, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((View) aUListenerS73S0101000_13.l0).setAlpha(floatValue);
        ((View) aUListenerS73S0101000_13.l0).setTranslationY((1 - floatValue) * aUListenerS73S0101000_13.i1);
    }

    public static final void onAnimationUpdate$1(AUListenerS73S0101000_13 aUListenerS73S0101000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((U1X) aUListenerS73S0101000_13.l0).LJLLILLLL == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        HorizontalScrollView horizontalScrollView = ((U1X) aUListenerS73S0101000_13.l0).LJLLILLLL;
        if (horizontalScrollView != null) {
            int scrollX = intValue - horizontalScrollView.getScrollX();
            if (C15380j0.LJIIZILJ()) {
                HorizontalScrollView horizontalScrollView2 = ((U1X) aUListenerS73S0101000_13.l0).LJLLILLLL;
                if (horizontalScrollView2 != null) {
                    int i = aUListenerS73S0101000_13.i1;
                    Object animatedValue2 = it.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    horizontalScrollView2.scrollTo(i - ((Integer) animatedValue2).intValue(), 0);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            HorizontalScrollView horizontalScrollView3 = ((U1X) aUListenerS73S0101000_13.l0).LJLLILLLL;
            if (horizontalScrollView3 != null) {
                horizontalScrollView3.scrollBy(scrollX, 0);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void onAnimationUpdate$2(AUListenerS73S0101000_13 aUListenerS73S0101000_13, ValueAnimator valueAnimator) {
        int intValue = aUListenerS73S0101000_13.i1 + ((Integer) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Int")).intValue();
        LinearLayout linearLayout = ((C76260TwO) aUListenerS73S0101000_13.l0).LJII;
        if (linearLayout == null) {
            C0NB.LJIIIZ("GiftOnlySelectUtils", "animatorEndFir, newGiftSelectLl is null");
        } else {
            C29306Beo.LJJLIIIJILLIZJL(intValue, linearLayout);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS73S0101000_13 aUListenerS73S0101000_13, ValueAnimator valueAnimator) {
        int intValue = aUListenerS73S0101000_13.i1 - ((Integer) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Int")).intValue();
        LinearLayout linearLayout = ((C76260TwO) aUListenerS73S0101000_13.l0).LJI;
        if (linearLayout == null) {
            C0NB.LJIIIZ("GiftOnlySelectUtils", "animatorEndSec, giftSelectLl is null");
        } else {
            C29306Beo.LJJJJJL(intValue, linearLayout);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS73S0101000_13 aUListenerS73S0101000_13, ValueAnimator valueAnimator) {
        int intValue = aUListenerS73S0101000_13.i1 + ((Integer) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Int")).intValue();
        LinearLayout linearLayout = ((C76260TwO) aUListenerS73S0101000_13.l0).LJI;
        if (linearLayout == null) {
            C0NB.LJIIIZ("GiftOnlySelectUtils", "animatorStartFir, giftSelectLl is null");
        } else {
            C29306Beo.LJJJJJL(intValue, linearLayout);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS73S0101000_13 aUListenerS73S0101000_13, ValueAnimator valueAnimator) {
        int intValue = aUListenerS73S0101000_13.i1 - ((Integer) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Int")).intValue();
        LinearLayout linearLayout = ((C76260TwO) aUListenerS73S0101000_13.l0).LJII;
        if (linearLayout == null) {
            C0NB.LJIIIZ("GiftOnlySelectUtils", "animatorStartSec, newGiftSelectLl is null");
        } else {
            C29306Beo.LJJLIIIJILLIZJL(intValue, linearLayout);
        }
    }

    public AUListenerS73S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
