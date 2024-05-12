package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WWQ implements Animator.AnimatorListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ WW1 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        boolean z = this.LJLIL;
        if (!z) {
            this.LJLILLLLZI.LLJJIJI(z);
        } else {
            this.LJLILLLLZI.LJLIL.LJIIIZ(this.LJLJI, true);
        }
    }

    public WWQ(boolean z, WW1 ww1, long j) {
        this.LJLIL = z;
        this.LJLILLLLZI = ww1;
        this.LJLJI = j;
    }
}
