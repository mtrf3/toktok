package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L7A implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ L5Y LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public L7A(L5Y l5y, float f) {
        this.LJLIL = l5y;
        this.LJLILLLLZI = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        float f;
        Float f2;
        o.LJIIIZ(animation, "animation");
        L5Y l5y = this.LJLIL;
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = this.LJLILLLLZI;
        }
        l5y.LJLLJ = f;
        this.LJLIL.invalidate();
    }
}
