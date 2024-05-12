package X;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: X.Vdt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80209Vdt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C45621qg LJLIL;
    public final /* synthetic */ C80217Ve1 LJLILLLLZI;
    public final /* synthetic */ AppBarLayout$BaseBehavior LJLJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLJI.setHeaderTopBottomOffset(this.LJLIL, this.LJLILLLLZI, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public C80209Vdt(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, C45621qg c45621qg, C80217Ve1 c80217Ve1) {
        this.LJLJI = appBarLayout$BaseBehavior;
        this.LJLIL = c45621qg;
        this.LJLILLLLZI = c80217Ve1;
    }
}
