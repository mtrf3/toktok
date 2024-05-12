package X;

import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.Vqs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81014Vqs extends WN5 {
    @Override // X.WMU
    public final void LIZJ(Class cls, Class cls2) {
    }

    @Override // X.WN5
    public final boolean LJ() {
        return true;
    }

    @Override // X.WN5
    public Animator LJFF(C82158WMg c82158WMg, C82158WMg c82158WMg2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c82158WMg.LIZIZ.getAlpha(), 0.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(c82158WMg, 52));
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // X.WN5
    public final Animator LJI(C82158WMg c82158WMg, C82158WMg c82158WMg2) {
        View view = c82158WMg2.LIZIZ;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, view.getAlpha());
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(view, 51));
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150L);
        return ofFloat;
    }
}
