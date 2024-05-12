package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpm, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91138Zpm extends AnimatorListenerAdapter {
    public boolean LJLIL;
    public final /* synthetic */ C91139Zpn LJLILLLLZI;

    public C91138Zpm(C91139Zpn c91139Zpn) {
        this.LJLILLLLZI = c91139Zpn;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        boolean z;
        o.LJIIIZ(animation, "animation");
        C91139Zpn c91139Zpn = this.LJLILLLLZI;
        if (this.LJLIL) {
            c91139Zpn.LIZJ();
            z = false;
        } else {
            c91139Zpn.LIZLLL();
            z = true;
        }
        c91139Zpn.LJLLILLLL = z;
    }
}
