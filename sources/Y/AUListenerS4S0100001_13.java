package Y;

import X.AbstractC77394UZa;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AUListenerS4S0100001_13 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS4S0100001_13 aUListenerS4S0100001_13, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS4S0100001_13.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        constraintProperty.margin(4, ((Integer) animatedValue).intValue());
        constraintProperty.apply();
        ((ConstraintProperty) aUListenerS4S0100001_13.l0).alpha((1.0f - animation.getAnimatedFraction()) * aUListenerS4S0100001_13.f1);
    }

    public static final void onAnimationUpdate$1(AUListenerS4S0100001_13 aUListenerS4S0100001_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View view = ((AbstractC77394UZa) aUListenerS4S0100001_13.l0).LJLIL;
        float f = aUListenerS4S0100001_13.f1;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationX((((Float) animatedValue).floatValue() * ((AbstractC77394UZa) aUListenerS4S0100001_13.l0).LJLJLLL) + f);
    }

    public AUListenerS4S0100001_13(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
