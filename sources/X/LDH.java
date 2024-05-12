package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LDH extends AnimatorListenerAdapter {
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation, z);
    }
}
