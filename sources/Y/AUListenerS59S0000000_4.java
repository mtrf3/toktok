package Y;

import android.animation.ValueAnimator;

/* loaded from: classes5.dex */
public class AUListenerS59S0000000_4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;

    public static final void onAnimationUpdate$0(AUListenerS59S0000000_4 aUListenerS59S0000000_4, ValueAnimator valueAnimator) {
    }

    public static final void onAnimationUpdate$1(AUListenerS59S0000000_4 aUListenerS59S0000000_4, ValueAnimator valueAnimator) {
    }

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

    public AUListenerS59S0000000_4(int i) {
        this.$t = i;
    }
}
