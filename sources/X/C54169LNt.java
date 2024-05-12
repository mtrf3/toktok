package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.LNt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54169LNt implements ValueAnimator.AnimatorUpdateListener {
    public static final C54169LNt LJLIL = new C54169LNt();

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View view = LQM.LJIIJ;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        View view2 = LQM.LJIIJJI;
        if (view2 != null) {
            view2.setAlpha(floatValue);
        }
        View view3 = LQM.LJIIL;
        if (view3 == null) {
            return;
        }
        view3.setAlpha(floatValue);
    }
}
