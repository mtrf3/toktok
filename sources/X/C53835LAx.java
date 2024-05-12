package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.LAx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53835LAx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C81227VuJ LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C53835LAx(int i, int i2, C81227VuJ c81227VuJ) {
        this.LJLIL = c81227VuJ;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if (animatedValue != null) {
            float floatValue = ((Float) animatedValue).floatValue();
            this.LJLIL.setMCurSelectPercent((int) (((this.LJLJI - r2) * floatValue) + this.LJLILLLLZI));
            this.LJLIL.invalidate();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
