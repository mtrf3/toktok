package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.LVp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54373LVp {
    public static void LIZ(View cartView) {
        o.LJIIIZ(cartView, "cartView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cartView, "rotation", 0.0f, -20.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cartView, "rotation", -20.0f, 20.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cartView, "rotation", 20.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
    }
}
