package X;

import android.animation.Animator;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JB0 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C48740JAy LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

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
        if (this.LJLIL) {
            LinearLayout linearLayout = this.LJLILLLLZI.LIZLLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.LJLILLLLZI.LIZLLL;
            if (linearLayout2 != null) {
                linearLayout2.setAlpha(1.0f);
            }
        } else {
            LinearLayout linearLayout3 = this.LJLILLLLZI.LIZLLL;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            LinearLayout linearLayout4 = this.LJLILLLLZI.LIZLLL;
            if (linearLayout4 != null) {
                linearLayout4.setAlpha(0.0f);
            }
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public JB0(boolean z, C48740JAy c48740JAy, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = z;
        this.LJLILLLLZI = c48740JAy;
        this.LJLJI = interfaceC65784Pro;
    }
}
