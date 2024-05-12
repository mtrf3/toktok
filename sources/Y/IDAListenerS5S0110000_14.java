package Y;

import X.C81302VvW;
import X.C81303VvX;
import X.InterfaceC81305VvZ;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDAListenerS5S0110000_14 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                return;
            case 1:
                onAnimationRepeat$1(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$0(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animator) {
        ((C81303VvX) iDAListenerS5S0110000_14.l0).getClass();
    }

    public static final void onAnimationCancel$1(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C81302VvW) iDAListenerS5S0110000_14.l0).getClass();
    }

    public static final void onAnimationEnd$0(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animator) {
        InterfaceC81305VvZ interfaceC81305VvZ = ((C81303VvX) iDAListenerS5S0110000_14.l0).LJLJJI;
        if (interfaceC81305VvZ != null) {
            if (iDAListenerS5S0110000_14.z1) {
                interfaceC81305VvZ.LIZIZ();
            } else {
                interfaceC81305VvZ.LIZ();
            }
        }
        ((C81303VvX) iDAListenerS5S0110000_14.l0).getClass();
    }

    public static final void onAnimationEnd$1(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC81305VvZ interfaceC81305VvZ = ((C81302VvW) iDAListenerS5S0110000_14.l0).LJLJJI;
        if (interfaceC81305VvZ != null) {
            if (iDAListenerS5S0110000_14.z1) {
                interfaceC81305VvZ.LIZIZ();
            } else {
                interfaceC81305VvZ.LIZ();
            }
        }
        ((C81302VvW) iDAListenerS5S0110000_14.l0).getClass();
    }

    public static final void onAnimationRepeat$0(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animator) {
        ((C81303VvX) iDAListenerS5S0110000_14.l0).getClass();
    }

    public static final void onAnimationRepeat$1(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C81302VvW) iDAListenerS5S0110000_14.l0).getClass();
    }

    public static final void onAnimationStart$0(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animator) {
        ((C81303VvX) iDAListenerS5S0110000_14.l0).getClass();
    }

    public static final void onAnimationStart$1(IDAListenerS5S0110000_14 iDAListenerS5S0110000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C81302VvW) iDAListenerS5S0110000_14.l0).getClass();
    }

    public IDAListenerS5S0110000_14(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
