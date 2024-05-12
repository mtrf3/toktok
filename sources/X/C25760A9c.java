package X;

import android.animation.Animator;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.A9c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25760A9c implements Animator.AnimatorListener {
    public final /* synthetic */ C25765A9h LJLIL;
    public final /* synthetic */ InterfaceC65784Pro LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        CustomDialogFragment customDialogFragment = this.LJLIL.LJLLILLLL;
        if (customDialogFragment != null) {
            customDialogFragment.vl(new AqS29S0001000_4(this.LJLJI, 18));
        }
        C221018lt.LIZ("RecUserDialogController", "resize finished");
        InterfaceC65784Pro interfaceC65784Pro = this.LJLILLLLZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public C25760A9c(C25765A9h c25765A9h, InterfaceC65784Pro interfaceC65784Pro, int i) {
        this.LJLIL = c25765A9h;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = i;
    }
}
