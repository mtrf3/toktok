package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1A extends AnimatorListenerAdapter {
    public final /* synthetic */ U18 LJLIL;

    public U1A(U18 u18) {
        this.LJLIL = u18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.removeAnimatorListener(this);
        this.LJLIL.setMinAndMaxProgress(0.36231884f, 0.85507244f);
        this.LJLIL.setRepeatCount(-1);
        synchronized (this.LJLIL) {
        }
    }
}
