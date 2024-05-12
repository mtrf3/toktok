package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.LBv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53859LBv implements Animator.AnimatorPauseListener {
    public final /* synthetic */ LDQ LJLIL;

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    public C53859LBv(LDQ ldq) {
        this.LJLIL = ldq;
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animation) {
        long currentTimeMillis;
        o.LJIIIZ(animation, "animation");
        LDQ ldq = this.LJLIL;
        long currentTimeMillis2 = System.currentTimeMillis();
        Long l = this.LJLIL.LJIIZILJ;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        ldq.LJIJ = currentTimeMillis2 - currentTimeMillis;
    }
}
