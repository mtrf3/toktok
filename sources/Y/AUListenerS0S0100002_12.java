package Y;

import X.C74040T4a;
import X.C74041T4b;
import X.C74063T4x;
import android.animation.ValueAnimator;

/* loaded from: classes13.dex */
public class AUListenerS0S0100002_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
    public float f2;
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

    public static final void onAnimationUpdate$0(AUListenerS0S0100002_12 aUListenerS0S0100002_12, ValueAnimator valueAnimator) {
        ((C74040T4a) aUListenerS0S0100002_12.l0).LJLZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C74040T4a c74040T4a = (C74040T4a) aUListenerS0S0100002_12.l0;
        c74040T4a.LJLL = (aUListenerS0S0100002_12.f1 - c74040T4a.LJLZ) + aUListenerS0S0100002_12.f2;
        c74040T4a.invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0100002_12 aUListenerS0S0100002_12, ValueAnimator valueAnimator) {
        ((C74063T4x) aUListenerS0S0100002_12.l0).LJLZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C74063T4x c74063T4x = (C74063T4x) aUListenerS0S0100002_12.l0;
        c74063T4x.LJLL = (aUListenerS0S0100002_12.f1 - c74063T4x.LJLZ) + aUListenerS0S0100002_12.f2;
        c74063T4x.invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS0S0100002_12 aUListenerS0S0100002_12, ValueAnimator valueAnimator) {
        ((C74041T4b) aUListenerS0S0100002_12.l0).LJLLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C74041T4b c74041T4b = (C74041T4b) aUListenerS0S0100002_12.l0;
        c74041T4b.LJLJLJ = (aUListenerS0S0100002_12.f1 - c74041T4b.LJLLLL) + aUListenerS0S0100002_12.f2;
        c74041T4b.invalidate();
    }

    public AUListenerS0S0100002_12(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
