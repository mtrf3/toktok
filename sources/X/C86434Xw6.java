package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.Xw6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86434Xw6 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C86431Xw3 LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL) {
            InterfaceC86436Xw8 interfaceC86436Xw8 = this.LJLILLLLZI.LL;
            if (interfaceC86436Xw8 != null) {
                interfaceC86436Xw8.LIZ();
            }
            InterfaceC86438XwA animEndListener = this.LJLILLLLZI.getAnimEndListener();
            if (animEndListener != null) {
                animEndListener.LIZ();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL) {
            InterfaceC86436Xw8 interfaceC86436Xw8 = this.LJLILLLLZI.LL;
            if (interfaceC86436Xw8 != null) {
                interfaceC86436Xw8.LIZ();
            }
            InterfaceC86438XwA animEndListener = this.LJLILLLLZI.getAnimEndListener();
            if (animEndListener != null) {
                animEndListener.LIZ();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        InterfaceC86436Xw8 interfaceC86436Xw8;
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL && (interfaceC86436Xw8 = this.LJLILLLLZI.LL) != null) {
            interfaceC86436Xw8.LIZIZ();
        }
    }

    public C86434Xw6(boolean z, C86431Xw3 c86431Xw3) {
        this.LJLIL = z;
        this.LJLILLLLZI = c86431Xw3;
    }
}
