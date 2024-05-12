package X;

import Y.ARunnableS40S0100000_4;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.9tZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251259tZ extends C251319tf {
    public final /* synthetic */ C251239tX LJLIL;

    public C251259tZ(C251239tX c251239tX) {
        this.LJLIL = c251239tX;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZJ.postDelayed(new ARunnableS40S0100000_4(this, 133), 3000L);
    }
}
