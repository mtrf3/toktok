package Y;

import X.C183487Ia;
import X.C264612c;
import X.C7IZ;
import android.animation.ValueAnimator;

/* loaded from: classes4.dex */
public class AUListenerS3S0100001_3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
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

    public static final void onAnimationUpdate$0(AUListenerS3S0100001_3 aUListenerS3S0100001_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C183487Ia) aUListenerS3S0100001_3.l0).LIZIZ.setAlpha(floatValue);
        ((C183487Ia) aUListenerS3S0100001_3.l0).LIZIZ.setTranslationY(((1 - floatValue) * C7IZ.LJIIL) + aUListenerS3S0100001_3.f1);
    }

    public static final void onAnimationUpdate$1(AUListenerS3S0100001_3 aUListenerS3S0100001_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C183487Ia) aUListenerS3S0100001_3.l0).LIZ.setAlpha(1 - floatValue);
        ((C183487Ia) aUListenerS3S0100001_3.l0).LIZ.setTranslationY(aUListenerS3S0100001_3.f1 - (floatValue * C7IZ.LJIIL));
    }

    public static final void onAnimationUpdate$2(AUListenerS3S0100001_3 aUListenerS3S0100001_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C183487Ia) aUListenerS3S0100001_3.l0).LIZ.setAlpha(floatValue);
        ((C183487Ia) aUListenerS3S0100001_3.l0).LIZ.setTranslationY(((1 - floatValue) * C7IZ.LJIIL) + aUListenerS3S0100001_3.f1);
    }

    public AUListenerS3S0100001_3(C183487Ia c183487Ia, float f, int i) {
        this.$t = i;
        this.l0 = c183487Ia;
        this.f1 = f;
    }
}
