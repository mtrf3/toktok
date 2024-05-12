package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.ViD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80477ViD extends AnimatorListenerAdapter {
    public boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC80491ViR LJLJI;
    public final /* synthetic */ C80475ViB LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LJLIL = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        C80475ViB c80475ViB = this.LJLJJI;
        c80475ViB.LJIILIIL = 0;
        c80475ViB.LJIIIIZZ = null;
        if (!this.LJLIL) {
            C80474ViA c80474ViA = c80475ViB.LJIIZILJ;
            boolean z = this.LJLILLLLZI;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            c80474ViA.LIZ(i, z);
            InterfaceC80491ViR interfaceC80491ViR = this.LJLJI;
            if (interfaceC80491ViR != null) {
                C80487ViN c80487ViN = (C80487ViN) interfaceC80491ViR;
                c80487ViN.LIZ.LIZ(c80487ViN.LIZIZ);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LJLJJI.LJIIZILJ.LIZ(0, this.LJLILLLLZI);
        C80475ViB c80475ViB = this.LJLJJI;
        c80475ViB.LJIILIIL = 1;
        c80475ViB.LJIIIIZZ = animator;
        this.LJLIL = false;
    }

    public C80477ViD(C80475ViB c80475ViB, boolean z, C80487ViN c80487ViN) {
        this.LJLJJI = c80475ViB;
        this.LJLILLLLZI = z;
        this.LJLJI = c80487ViN;
    }
}
