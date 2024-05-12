package Y;

import X.C81581W0b;
import X.W0F;
import android.animation.ValueAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AUListenerS1S0100002_14 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS1S0100002_14 aUListenerS1S0100002_14, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            W0F w0f = (W0F) aUListenerS1S0100002_14.l0;
            float f2 = aUListenerS1S0100002_14.f1;
            float f3 = aUListenerS1S0100002_14.f2;
            f.floatValue();
            w0f.LIZIZ().setAlpha(f.floatValue() * f2);
            ConstraintLayout constraintLayout = w0f.LJLL;
            if (constraintLayout != null) {
                constraintLayout.setAlpha(f.floatValue() * f3);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0100002_14 aUListenerS1S0100002_14, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C81581W0b c81581W0b = (C81581W0b) aUListenerS1S0100002_14.l0;
            float f2 = aUListenerS1S0100002_14.f1;
            float f3 = aUListenerS1S0100002_14.f2;
            f.floatValue();
            c81581W0b.LIZIZ().setAlpha(f.floatValue() * f2);
            ConstraintLayout constraintLayout = c81581W0b.LJLJL;
            if (constraintLayout != null) {
                constraintLayout.setAlpha(f.floatValue() * f3);
            }
        }
    }

    public AUListenerS1S0100002_14(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
