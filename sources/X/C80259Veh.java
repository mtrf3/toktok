package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Veh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80259Veh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C80258Veg LJLJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LJLJI.tweenIndicatorPosition(this.LJLIL, this.LJLILLLLZI, valueAnimator.getAnimatedFraction());
    }

    public C80259Veh(C80258Veg c80258Veg, View view, View view2) {
        this.LJLJI = c80258Veg;
        this.LJLIL = view;
        this.LJLILLLLZI = view2;
    }
}
