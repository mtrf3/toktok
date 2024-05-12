package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.ZqB, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91163ZqB implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C91165ZqD LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public C91163ZqB(C91165ZqD c91165ZqD, C76732zl c76732zl, C76732zl c76732zl2, int i, int i2) {
        this.LJLIL = c91165ZqD;
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
            C76732zl c76732zl = this.LJLJI;
            int i = c76732zl.element + abs;
            int i2 = this.LJLIL.LJLJI;
            c76732zl.element = i - i2;
            C76732zl c76732zl2 = this.LJLILLLLZI;
            c76732zl2.element = (c76732zl2.element - abs) + i2;
        }
        C91165ZqD c91165ZqD = this.LJLIL;
        int i3 = this.LJLJJI;
        int i4 = this.LJLJI.element;
        c91165ZqD.getClass();
        int round = i3 + Math.round((i4 - i3) * animatedFraction);
        C91165ZqD c91165ZqD2 = this.LJLIL;
        int i5 = this.LJLJJL;
        int i6 = this.LJLILLLLZI.element;
        c91165ZqD2.getClass();
        int round2 = i5 + Math.round(animatedFraction * (i6 - i5));
        if (round != c91165ZqD.LJLJLLL || round2 != c91165ZqD.LJLL) {
            c91165ZqD.LJLJLLL = round;
            c91165ZqD.LJLL = round2;
            C16300kU.LJIIJ(c91165ZqD);
        }
    }
}
