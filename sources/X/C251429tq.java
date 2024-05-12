package X;

import Y.ARunnableS40S0100000_4;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.9tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251429tq extends C251319tf {
    public final /* synthetic */ C251409to LJLIL;

    public C251429tq(C251409to c251409to) {
        this.LJLIL = c251409to;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZJ.postDelayed(new ARunnableS40S0100000_4(this, 122), r1.LJ * 1000);
    }
}
