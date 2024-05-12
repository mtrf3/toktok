package Y;

import X.C264612c;
import X.C53700L5s;
import X.InterfaceC65784Pro;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AUListenerS2S0100001_1 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS2S0100001_1 aUListenerS2S0100001_1, ValueAnimator animation) {
        float f;
        Float f2;
        o.LJIIIZ(animation, "animation");
        C53700L5s c53700L5s = (C53700L5s) aUListenerS2S0100001_1.l0;
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = aUListenerS2S0100001_1.f1;
        }
        c53700L5s.LJLLL = f;
        ((C53700L5s) aUListenerS2S0100001_1.l0).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS2S0100001_1 aUListenerS2S0100001_1, ValueAnimator valueAnimator) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue() == aUListenerS2S0100001_1.f1 && (interfaceC65784Pro = (InterfaceC65784Pro) aUListenerS2S0100001_1.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public AUListenerS2S0100001_1(float f, Object obj, int i) {
        this.$t = i;
        this.f1 = f;
        this.l0 = obj;
    }
}
