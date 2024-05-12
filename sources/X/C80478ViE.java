package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.ViE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80478ViE extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC80491ViR LJLILLLLZI;
    public final /* synthetic */ C80475ViB LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C80475ViB c80475ViB = this.LJLJI;
        c80475ViB.LJIILIIL = 0;
        c80475ViB.LJIIIIZZ = null;
        InterfaceC80491ViR interfaceC80491ViR = this.LJLILLLLZI;
        if (interfaceC80491ViR != null) {
            ((C80487ViN) interfaceC80491ViR).LIZ.LIZIZ();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LJLJI.LJIIZILJ.LIZ(0, this.LJLIL);
        C80475ViB c80475ViB = this.LJLJI;
        c80475ViB.LJIILIIL = 2;
        c80475ViB.LJIIIIZZ = animator;
    }

    public C80478ViE(C80475ViB c80475ViB, boolean z, C80487ViN c80487ViN) {
        this.LJLJI = c80475ViB;
        this.LJLIL = z;
        this.LJLILLLLZI = c80487ViN;
    }
}
