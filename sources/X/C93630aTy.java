package X;

import android.animation.ValueAnimator;

/* renamed from: X.aTy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93630aTy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C93632aU0 LJLJJL;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C93632aU0 c93632aU0 = this.LJLJJL;
        int round = this.LJLIL + Math.round((this.LJLILLLLZI - r2) * animatedFraction);
        int round2 = this.LJLJI + Math.round(animatedFraction * (this.LJLJJI - r1));
        if (round != c93632aU0.LJLJL || round2 != c93632aU0.LJLJLJ) {
            c93632aU0.LJLJL = round;
            c93632aU0.LJLJLJ = round2;
            C16300kU.LJIIJ(c93632aU0);
        }
    }

    public C93630aTy(C93632aU0 c93632aU0, int i, int i2, int i3, int i4) {
        this.LJLJJL = c93632aU0;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
    }
}
