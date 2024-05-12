package X;

import Y.ALAdapterS4S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class CVU extends C1CR {
    public CVX LLIIIJ;

    @Override // X.C1CR, X.AbstractC03490Bt
    public final Animator LJIIJ(ViewGroup viewGroup, C03860De c03860De, C03860De c03860De2) {
        Animator LJIIJ = super.LJIIJ(viewGroup, c03860De, c03860De2);
        if (LJIIJ instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) LJIIJ;
            valueAnimator.addUpdateListener(new AUListenerS94S0100000_5(c03860De, 78));
            valueAnimator.addListener(new ALAdapterS4S0100000_5(this, 79));
        }
        return LJIIJ;
    }
}
