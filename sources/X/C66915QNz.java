package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.QNz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66915QNz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ O5V LJLIL;

    public C66915QNz(O5V o5v) {
        this.LJLIL = o5v;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
        int[] iArr = (int[]) valueAnimator.getAnimatedValue();
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        this.LJLIL.setLayoutParams(layoutParams);
    }
}
