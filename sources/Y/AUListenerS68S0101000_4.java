package Y;

import X.C173726ro;
import X.C250999t9;
import X.C51633KOf;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AUListenerS68S0101000_4 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS68S0101000_4 aUListenerS68S0101000_4, ValueAnimator it) {
        C173726ro progressBarTimerView = ((C250999t9) aUListenerS68S0101000_4.l0).getProgressBarTimerView();
        o.LJIIIIZZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue != null) {
            progressBarTimerView.LJLJLLL = progressBarTimerView.LJLJJL * (((Float) animatedValue).floatValue() / aUListenerS68S0101000_4.i1);
            progressBarTimerView.invalidate();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    public static final void onAnimationUpdate$1(AUListenerS68S0101000_4 aUListenerS68S0101000_4, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C173726ro progressBarTimerView = ((C51633KOf) aUListenerS68S0101000_4.l0).getProgressBarTimerView();
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progressBarTimerView.LJLJLLL = progressBarTimerView.LJLJJL * (((Float) animatedValue).floatValue() / aUListenerS68S0101000_4.i1);
        progressBarTimerView.invalidate();
    }

    public AUListenerS68S0101000_4(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
