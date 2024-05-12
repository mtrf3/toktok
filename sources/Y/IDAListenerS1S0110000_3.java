package Y;

import X.C212808Wu;
import X.C226998vX;
import X.C71Y;
import X.C76800UCe;
import X.C9XU;
import X.InterfaceC65784Pro;
import X.X1D;
import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDAListenerS1S0110000_3 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void onAnimationCancel$3(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animator) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animator) {
    }

    public static final void onAnimationStart$3(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
                onAnimationCancel$3(this, animator);
                return;
            case 4:
                o.LJIIIZ(animator, "p0");
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
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                onAnimationRepeat$3(this, animator);
                return;
            case 4:
                o.LJIIIZ(animator, "p0");
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
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                o.LJIIIZ(animator, "p0");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$2(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C212808Wu) iDAListenerS1S0110000_3.l0).setClosing(false);
        ((C212808Wu) iDAListenerS1S0110000_3.l0).setAnimating(false);
    }

    public static final void onAnimationEnd$0(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animation) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(animation, "animation");
        if (iDAListenerS1S0110000_3.z1 && (interfaceC65784Pro = ((C226998vX) iDAListenerS1S0110000_3.l0).LJ) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animator) {
        o.LJIIIZ(animator, "animator");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addShowAndHideAnimation ");
        LIZ.append(iDAListenerS1S0110000_3.z1);
        LIZ.append(" animation end ");
        C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ));
        if (iDAListenerS1S0110000_3.z1) {
            ((BottomBarFragment) iDAListenerS1S0110000_3.l0).Dl();
        } else {
            ((BottomBarFragment) iDAListenerS1S0110000_3.l0).xl();
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C212808Wu) iDAListenerS1S0110000_3.l0).setClosing(false);
        ((C212808Wu) iDAListenerS1S0110000_3.l0).setAnimating(false);
    }

    public static final void onAnimationEnd$3(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animator) {
        if (iDAListenerS1S0110000_3.z1) {
            ((CommentInputFragment) iDAListenerS1S0110000_3.l0).LJLIL.setVisibility(0);
        } else {
            ((CommentInputFragment) iDAListenerS1S0110000_3.l0).Hl();
        }
    }

    public static final void onAnimationEnd$4(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator p0) {
        int i;
        o.LJIIIZ(p0, "p0");
        View view = (View) iDAListenerS1S0110000_3.l0;
        if (iDAListenerS1S0110000_3.z1) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void onAnimationStart$0(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C226998vX c226998vX = (C226998vX) iDAListenerS1S0110000_3.l0;
        c226998vX.LIZJ(c226998vX.LJFF);
        C226998vX c226998vX2 = (C226998vX) iDAListenerS1S0110000_3.l0;
        C9XU.LIZIZ(c226998vX2.LIZ, c226998vX2.LJI);
    }

    public static final void onAnimationStart$2(IDAListenerS1S0110000_3 iDAListenerS1S0110000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!iDAListenerS1S0110000_3.z1) {
            ((C212808Wu) iDAListenerS1S0110000_3.l0).setClosing(true);
        }
        ((C212808Wu) iDAListenerS1S0110000_3.l0).setAnimating(true);
    }

    public IDAListenerS1S0110000_3(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
