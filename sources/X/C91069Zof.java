package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.Zof, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91069Zof implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C91071Zoh LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C91069Zof(C91071Zoh c91071Zoh, int i) {
        this.LJLIL = c91071Zoh;
        this.LJLILLLLZI = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int pow;
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int viewPagerMarginTop = this.LJLIL.getViewPagerMarginTop();
        C91071Zoh c91071Zoh = this.LJLIL;
        if (animatedFraction == 1.0f) {
            pow = -viewPagerMarginTop;
        } else {
            pow = (int) (((1 - Math.pow(animatedFraction, 3.0d)) * this.LJLILLLLZI) - this.LJLIL.getViewPagerMarginTop());
        }
        c91071Zoh.setViewPagerMarginTopByDelta(pow);
    }
}
