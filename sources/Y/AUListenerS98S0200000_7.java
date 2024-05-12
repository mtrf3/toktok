package Y;

import X.I02;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AUListenerS98S0200000_7 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS98S0200000_7 aUListenerS98S0200000_7, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((I02) aUListenerS98S0200000_7.l1).LJJLJ(((MotionEvent) aUListenerS98S0200000_7.l0).getY() - (it.getAnimatedFraction() * ((MotionEvent) aUListenerS98S0200000_7.l0).getY()));
    }

    public static final void onAnimationUpdate$1(AUListenerS98S0200000_7 aUListenerS98S0200000_7, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((I02) aUListenerS98S0200000_7.l1).LJJLJ((it.getAnimatedFraction() * (((I02) aUListenerS98S0200000_7.l1).LJLLL - ((MotionEvent) aUListenerS98S0200000_7.l0).getY())) + ((MotionEvent) aUListenerS98S0200000_7.l0).getY());
    }

    public AUListenerS98S0200000_7(MotionEvent motionEvent, I02 i02, int i) {
        this.$t = i;
        this.l0 = motionEvent;
        this.l1 = i02;
    }
}
