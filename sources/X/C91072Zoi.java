package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.Zoi, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91072Zoi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C91071Zoh LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C91072Zoi(C91071Zoh c91071Zoh, int i) {
        this.LJLIL = c91071Zoh;
        this.LJLILLLLZI = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int viewPagerMarginTop;
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int viewPagerMarginTop2 = this.LJLIL.getViewPagerMarginTop();
        C91071Zoh c91071Zoh = this.LJLIL;
        if (animatedFraction == 1.0f) {
            viewPagerMarginTop = -(viewPagerMarginTop2 + c91071Zoh.LJLLILLLL);
        } else {
            double pow = 1 - Math.pow(animatedFraction, 3.0d);
            int i = this.LJLILLLLZI;
            C91071Zoh c91071Zoh2 = this.LJLIL;
            viewPagerMarginTop = (int) ((pow * (i + c91071Zoh2.LJLLILLLL)) - (c91071Zoh2.getViewPagerMarginTop() + this.LJLIL.LJLLILLLL));
        }
        c91071Zoh.setViewPagerMarginTopByDelta(viewPagerMarginTop);
    }
}
