package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.UcF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77559UcF extends C73102SmY {
    public final /* synthetic */ C77557UcD LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        C77557UcD c77557UcD = this.LJLIL;
        c77557UcD.LJLJJI = 2;
        c77557UcD.LJ(this.LJLJI, this.LJLILLLLZI);
    }

    public C77559UcF(C77557UcD c77557UcD, Runnable runnable, long j) {
        this.LJLIL = c77557UcD;
        this.LJLILLLLZI = runnable;
        this.LJLJI = j;
    }
}
