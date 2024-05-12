package Y;

import X.C15380j0;
import X.C34K;
import X.U5K;
import X.U5M;
import android.animation.ValueAnimator;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AUListenerS1S0201100_13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public long j3;
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS1S0201100_13 aUListenerS1S0201100_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((U5K) aUListenerS1S0201100_13.l0).LJLJJLL == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        HorizontalScrollView horizontalScrollView = ((U5K) aUListenerS1S0201100_13.l0).LJLJJLL;
        if (horizontalScrollView != null) {
            int scrollX = intValue - horizontalScrollView.getScrollX();
            if (C15380j0.LJIIZILJ()) {
                HorizontalScrollView horizontalScrollView2 = ((U5K) aUListenerS1S0201100_13.l0).LJLJJLL;
                if (horizontalScrollView2 != null) {
                    int i = aUListenerS1S0201100_13.i2;
                    Object animatedValue2 = it.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    horizontalScrollView2.scrollTo(i - ((Integer) animatedValue2).intValue(), 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                HorizontalScrollView horizontalScrollView3 = ((U5K) aUListenerS1S0201100_13.l0).LJLJJLL;
                if (horizontalScrollView3 != null) {
                    horizontalScrollView3.scrollBy(scrollX, 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Object animatedValue3 = it.getAnimatedValue();
            o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) animatedValue3).intValue() == aUListenerS1S0201100_13.i2) {
                C34K c34k = (C34K) aUListenerS1S0201100_13.l1;
                if (!c34k.element) {
                    U5K u5k = (U5K) aUListenerS1S0201100_13.l0;
                    if (u5k.LJLIL) {
                        c34k.element = true;
                        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = u5k.LJLLI;
                        long j = u5k.LJLLLLLL - aUListenerS1S0201100_13.j3;
                        if (j <= 0) {
                            j = 0;
                        }
                        u5k.postDelayed(aRunnableS49S0100000_13, j);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0201100_13 aUListenerS1S0201100_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((U5M) aUListenerS1S0201100_13.l0).LJLJJI == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        HorizontalScrollView horizontalScrollView = ((U5M) aUListenerS1S0201100_13.l0).LJLJJI;
        if (horizontalScrollView != null) {
            int scrollX = intValue - horizontalScrollView.getScrollX();
            if (C15380j0.LJIIZILJ()) {
                HorizontalScrollView horizontalScrollView2 = ((U5M) aUListenerS1S0201100_13.l0).LJLJJI;
                if (horizontalScrollView2 != null) {
                    int i = aUListenerS1S0201100_13.i2;
                    Object animatedValue2 = it.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    horizontalScrollView2.scrollTo(i - ((Integer) animatedValue2).intValue(), 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                HorizontalScrollView horizontalScrollView3 = ((U5M) aUListenerS1S0201100_13.l0).LJLJJI;
                if (horizontalScrollView3 != null) {
                    horizontalScrollView3.scrollBy(scrollX, 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Object animatedValue3 = it.getAnimatedValue();
            o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) animatedValue3).intValue() == aUListenerS1S0201100_13.i2) {
                C34K c34k = (C34K) aUListenerS1S0201100_13.l1;
                if (!c34k.element) {
                    U5M u5m = (U5M) aUListenerS1S0201100_13.l0;
                    if (u5m.LJLIL) {
                        c34k.element = true;
                        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = u5m.LJLJLLL;
                        long j = u5m.LJLLJ - aUListenerS1S0201100_13.j3;
                        if (j <= 0) {
                            j = 0;
                        }
                        u5m.postDelayed(aRunnableS49S0100000_13, j);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public AUListenerS1S0201100_13(Object obj, int i, Object obj2, long j, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
        this.j3 = j;
    }
}
