package X;

import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.Vqr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81013Vqr extends C81014Vqs {
    @Override // X.C81014Vqs, X.WN5
    public final Animator LJFF(C82158WMg c82158WMg, C82158WMg c82158WMg2) {
        if (c82158WMg == null) {
            return new AnimatorSet();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, c82158WMg.LIZIZ.getMeasuredHeight());
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(c82158WMg, 6));
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(250L);
        return ofFloat;
    }
}
