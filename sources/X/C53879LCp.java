package X;

import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.LCp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53879LCp {
    public static Animator LIZ(View targetView) {
        o.LJIIIZ(targetView, "targetView");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(targetView, 19));
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(C55953Lxd.LJIIJ());
        return ofFloat;
    }

    public static Animator LIZIZ(View targetView) {
        o.LJIIIZ(targetView, "targetView");
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(targetView, 20));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C55953Lxd.LJIIJ());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.5f, 1.0f);
        ofFloat2.setInterpolator(C55953Lxd.LJIIJ());
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(targetView, 21));
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }
}
