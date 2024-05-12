package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.CaI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31574CaI implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C31576CaK LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    public C31574CaI(C31576CaK c31576CaK, float f, float f2) {
        this.LJLIL = c31576CaK;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31576CaK c31576CaK = this.LJLIL;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c31576CaK.LJLJJL = ((Float) animatedValue).floatValue();
        if (this.LJLILLLLZI != this.LJLJI) {
            C31576CaK c31576CaK2 = this.LJLIL;
            float f = c31576CaK2.LJLJJLL;
            if (f != 0.0f) {
                Object animatedValue2 = it.getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                c31576CaK2.LJLJJLL = f - (((Float) animatedValue2).floatValue() - this.LJLILLLLZI);
            }
        }
        this.LJLIL.postInvalidate();
    }
}
