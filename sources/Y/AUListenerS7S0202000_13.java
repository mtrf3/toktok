package Y;

import X.C15380j0;
import X.C264612c;
import X.C34K;
import X.U46;
import android.animation.ValueAnimator;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AUListenerS7S0202000_13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public int i3;
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

    public static final void onAnimationUpdate$0(AUListenerS7S0202000_13 aUListenerS7S0202000_13, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue() - ((U46) aUListenerS7S0202000_13.l0).LIZ(R.id.jcv).getScrollX();
        if (C15380j0.LJIIZILJ()) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ((U46) aUListenerS7S0202000_13.l0).LIZ(R.id.jcv);
            int i = aUListenerS7S0202000_13.i2;
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            horizontalScrollView.scrollTo(i - ((Integer) animatedValue).intValue(), 0);
        } else {
            ((U46) aUListenerS7S0202000_13.l0).LIZ(R.id.jcv).scrollBy(intValue, 0);
        }
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) animatedValue2).intValue() == aUListenerS7S0202000_13.i2) {
            C34K c34k = (C34K) aUListenerS7S0202000_13.l1;
            if (!c34k.element) {
                c34k.element = true;
                U46 u46 = (U46) aUListenerS7S0202000_13.l0;
                u46.postDelayed(u46.LJLJJI, aUListenerS7S0202000_13.i3 * 0.4f * 1000);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS7S0202000_13 aUListenerS7S0202000_13, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue() - ((U46) aUListenerS7S0202000_13.l0).LIZ(R.id.jcw).getScrollX();
        if (C15380j0.LJIIZILJ()) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ((U46) aUListenerS7S0202000_13.l0).LIZ(R.id.jcw);
            int i = aUListenerS7S0202000_13.i2;
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            horizontalScrollView.scrollTo(i - ((Integer) animatedValue).intValue(), 0);
        } else {
            ((U46) aUListenerS7S0202000_13.l0).LIZ(R.id.jcw).scrollBy(intValue, 0);
        }
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) animatedValue2).intValue() == aUListenerS7S0202000_13.i2) {
            C34K c34k = (C34K) aUListenerS7S0202000_13.l1;
            if (!c34k.element) {
                c34k.element = true;
                U46 u46 = (U46) aUListenerS7S0202000_13.l0;
                if (u46.LJZI <= 1) {
                    u46.postDelayed(u46.LJLJI, aUListenerS7S0202000_13.i3 * 0.4f * 1000);
                    return;
                }
                u46.removeCallbacks(u46.LJLJJL);
                U46 u462 = (U46) aUListenerS7S0202000_13.l0;
                ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(u462, 119);
                u462.LJLJJL = aRunnableS49S0100000_13;
                u462.postDelayed(aRunnableS49S0100000_13, aUListenerS7S0202000_13.i3 * 0.4f * 1000);
            }
        }
    }

    public AUListenerS7S0202000_13(U46 u46, int i, C34K c34k, int i2, int i3) {
        this.$t = i3;
        this.l0 = u46;
        this.i2 = i;
        this.l1 = c34k;
        this.i3 = i2;
    }
}
