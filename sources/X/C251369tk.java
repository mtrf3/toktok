package X;

import Y.ARunnableS40S0100000_4;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.9tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251369tk extends C251319tf {
    public final /* synthetic */ C251349ti LJLIL;

    public C251369tk(C251349ti c251349ti) {
        this.LJLIL = c251349ti;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZJ.postDelayed(new ARunnableS40S0100000_4(this, 118), 5000L);
    }
}
