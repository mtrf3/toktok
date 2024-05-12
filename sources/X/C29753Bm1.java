package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.Bm1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29753Bm1 implements Animator.AnimatorListener {
    public final /* synthetic */ C29746Blu LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC29768BmG LJLJI;

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
        KL2.LJIILLIIL(8, this.LJLIL.LJIJJLI);
        if (this.LJLILLLLZI) {
            this.LJLIL.LJII(EnumC29732Blg.FANS_CLUB_UNJOIN);
        }
        InterfaceC29768BmG interfaceC29768BmG = this.LJLJI;
        if (interfaceC29768BmG != null) {
            interfaceC29768BmG.LIZ();
        }
    }

    public C29753Bm1(C29746Blu c29746Blu, boolean z, C29747Blv c29747Blv) {
        this.LJLIL = c29746Blu;
        this.LJLILLLLZI = z;
        this.LJLJI = c29747Blv;
    }
}
