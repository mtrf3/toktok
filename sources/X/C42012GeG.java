package X;

import Y.ARunnableS11S0101000_7;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import kotlin.jvm.internal.o;

/* renamed from: X.GeG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42012GeG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ExpandedTitleModule LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    public C42012GeG(int i, int i2, ExpandedTitleModule expandedTitleModule, int i3, int i4, int i5, int i6) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = expandedTitleModule;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
        this.LJLJJLL = i5;
        this.LJLJL = i6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (this.LJLIL != this.LJLILLLLZI) {
            ExpandedTitleModule expandedTitleModule = this.LJLJI;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            expandedTitleModule.LJIIJJI(((Integer) animatedValue).intValue());
        }
        if (this.LJLJJI >= 0) {
            int animatedFraction = this.LJLJJL + ((int) (it.getAnimatedFraction() * (r0 - r2)));
            ExpandedTitleModule expandedTitleModule2 = this.LJLJI;
            expandedTitleModule2.LJLJJL.getLayoutParams().height = animatedFraction;
            expandedTitleModule2.LJLLI.requestLayout();
        }
        if (this.LJLJJLL >= 0) {
            int animatedFraction2 = this.LJLJL + ((int) (it.getAnimatedFraction() * (r0 - r4)));
            ExpandedTitleModule expandedTitleModule3 = this.LJLJI;
            expandedTitleModule3.LJLLLLLL.post(new ARunnableS11S0101000_7(animatedFraction2, expandedTitleModule3, 12));
        }
    }
}
