package X;

import Y.ARunnableS40S0100000_4;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.9tV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251219tV extends C251319tf {
    public final /* synthetic */ C251199tT LJLIL;

    public C251219tV(C251199tT c251199tT) {
        this.LJLIL = c251199tT;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZJ.postDelayed(new ARunnableS40S0100000_4(this, 132), 3000L);
    }
}
