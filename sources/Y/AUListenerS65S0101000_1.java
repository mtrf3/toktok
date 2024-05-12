package Y;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AUListenerS65S0101000_1 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS65S0101000_1 aUListenerS65S0101000_1, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        if (aUListenerS65S0101000_1.i1 > 0) {
            ViewGroup.LayoutParams layoutParams = ((View) aUListenerS65S0101000_1.l0).getLayoutParams();
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
        }
        View view = (View) aUListenerS65S0101000_1.l0;
        float animatedFraction = 1.0f - (animation.getAnimatedFraction() * 2.0f);
        if (animatedFraction < 0.0f) {
            animatedFraction = 0.0f;
        }
        view.setAlpha(animatedFraction);
    }

    public static final void onAnimationUpdate$1(AUListenerS65S0101000_1 aUListenerS65S0101000_1, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = (ViewGroup) aUListenerS65S0101000_1.l0;
        if (viewGroup != null) {
            int i = aUListenerS65S0101000_1.i1;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((Integer) animatedValue).intValue() + i);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS65S0101000_1 aUListenerS65S0101000_1, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = (ViewGroup) aUListenerS65S0101000_1.l0;
        if (viewGroup != null) {
            int i = aUListenerS65S0101000_1.i1;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((Integer) animatedValue).intValue() + i);
        }
    }

    public AUListenerS65S0101000_1(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
