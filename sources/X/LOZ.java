package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ LOT LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public LOZ(LOT lot, C76732zl c76732zl, C76732zl c76732zl2, int i, int i2) {
        this.LJLIL = lot;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = c76732zl2;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        float animatedFraction = animator.getAnimatedFraction();
        if (this.LJLIL.LJLILLLLZI > 0) {
            int abs = Math.abs(this.LJLILLLLZI.element - this.LJLJI.element) / 2;
            if (!C52309Kfx.LIZ() || this.LJLJI.element + abs >= this.LJLIL.LJLJI) {
                C76732zl c76732zl = this.LJLJI;
                int i = c76732zl.element + abs;
                int i2 = this.LJLIL.LJLJI;
                c76732zl.element = i - i2;
                C76732zl c76732zl2 = this.LJLILLLLZI;
                c76732zl2.element = (c76732zl2.element - abs) + i2;
            }
        }
        LOT lot = this.LJLIL;
        int i3 = this.LJLJJI;
        int i4 = this.LJLJI.element;
        lot.getClass();
        int LIZ = AnonymousClass036.LIZ(i4 - i3, animatedFraction, i3);
        LOT lot2 = this.LJLIL;
        int i5 = this.LJLJJL;
        int i6 = this.LJLILLLLZI.element;
        lot2.getClass();
        int LIZ2 = AnonymousClass036.LIZ(animatedFraction, i6 - i5, i5);
        if (LIZ != lot.LJLJLLL || LIZ2 != lot.LJLL) {
            lot.LJLJLLL = LIZ;
            lot.LJLL = LIZ2;
            C16300kU.LJIIJ(lot);
        }
    }
}
