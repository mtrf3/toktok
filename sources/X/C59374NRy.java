package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.NRy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59374NRy extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C59357NRh LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!this.LJLIL) {
            this.LJLILLLLZI.LIZ.LIZ(8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL) {
            this.LJLILLLLZI.LIZ.LIZ(0);
        }
    }

    public C59374NRy(C59357NRh c59357NRh, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = c59357NRh;
    }
}
