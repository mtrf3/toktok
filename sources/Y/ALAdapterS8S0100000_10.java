package Y;

import X.AbstractC59359NRj;
import X.C32151Nz;
import X.C56602Ka;
import X.C59316NPs;
import X.C59357NRh;
import X.C59360NRk;
import X.C59363NRn;
import X.NQ4;
import X.NSG;
import X.O6R;
import X.O7Z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.relation.ffp.ui.AnimationAuthFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ALAdapterS8S0100000_10 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                onAnimationEnd$4(this, animator);
                return;
            case 6:
                onAnimationEnd$5(this, animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 8:
                onAnimationEnd$0(this, animator, z);
                return;
            default:
                super.onAnimationEnd(animator, z);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationStart$0(this, animator);
                return;
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                onAnimationStart$1(this, animator);
                return;
            case 7:
                onAnimationStart$2(this, animator);
                return;
        }
    }

    public ALAdapterS8S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((VideoRelationBtnAssem) aLAdapterS8S0100000_10.l0).u4().mv0(false);
    }

    public static final void onAnimationEnd$1(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        String LIZ = C56602Ka.LIZ(((VideoRelationBtnAssem) aLAdapterS8S0100000_10.l0).LLIFFJFJJ);
        if (LIZ == null) {
            return;
        }
        C56602Ka.LIZ.put(LIZ, Boolean.TRUE);
    }

    public static final void onAnimationEnd$2(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnimationAuthFragment) aLAdapterS8S0100000_10.l0).Jl();
    }

    public static final void onAnimationEnd$3(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C59316NPs c59316NPs = (C59316NPs) aLAdapterS8S0100000_10.l0;
        if (c59316NPs.LLLLIIL) {
            c59316NPs.r(4);
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animator) {
        ((O7Z) aLAdapterS8S0100000_10.l0).LJLIL = false;
    }

    public static final void onAnimationEnd$5(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((NSG) ((C59357NRh) aLAdapterS8S0100000_10.l0).LJFF.L9()).getContainer().setEnabled(true);
    }

    public static final void onAnimationStart$0(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C59360NRk c59360NRk = ((NQ4) aLAdapterS8S0100000_10.l0).LJLJJLL;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(-40));
        c59360NRk.getClass();
        C59363NRn.LIZ(c59360NRk, LJJIIZ);
        C59360NRk c59360NRk2 = ((NQ4) aLAdapterS8S0100000_10.l0).LJLJJLL;
        c59360NRk2.getClass();
        C59363NRn.LIZJ(c59360NRk2, 0);
    }

    public static final void onAnimationStart$1(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((NSG) ((C59357NRh) aLAdapterS8S0100000_10.l0).LJFF.L9()).getContainer().setEnabled(false);
    }

    public static final void onAnimationStart$2(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C59357NRh c59357NRh = (C59357NRh) aLAdapterS8S0100000_10.l0;
        c59357NRh.LJ.LLZZZIL(-c59357NRh.LJIIJ);
        ((C59357NRh) aLAdapterS8S0100000_10.l0).LJ.setVisibility(0);
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0100000_10 aLAdapterS8S0100000_10, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS8S0100000_10.l0;
        abstractC59359NRj.getClass();
        C59363NRn.LIZJ(abstractC59359NRj, 8);
    }
}
