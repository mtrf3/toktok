package Y;

import X.AbstractC59359NRj;
import X.C59357NRh;
import X.C59363NRn;
import X.C59988NgW;
import X.OJV;
import X.OSZ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ALAdapterS8S0200000_10 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

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
            case 3:
            case 5:
            default:
                super.onAnimationEnd(animator);
                return;
            case 4:
                onAnimationEnd$2(this, animator);
                return;
            case 6:
                onAnimationEnd$3(this, animator);
                return;
            case 7:
                onAnimationEnd$4(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                return;
            case 3:
                onAnimationStart$1(this, animator);
                return;
            case 4:
            case 6:
            case 7:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                onAnimationStart$2(this, animator);
                return;
            case 8:
                onAnimationStart$3(this, animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator, z);
                return;
            case 1:
                onAnimationStart$1(this, animator, z);
                return;
            default:
                super.onAnimationStart(animator, z);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL = null;
    }

    public static final void onAnimationCancel$1(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL = null;
    }

    public static final void onAnimationEnd$1(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL = null;
    }

    public static final void onAnimationEnd$2(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        abstractC59359NRj.getClass();
        C59363NRn.LIZJ(abstractC59359NRj, 8);
        abstractC59359NRj.LIZLLL(new OSZ("stageName", "reset"));
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS8S0200000_10.l1;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZJ(abstractC59359NRj2, 8);
        abstractC59359NRj2.LIZLLL(new OSZ("stageName", "reset"));
    }

    public static final void onAnimationEnd$3(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        abstractC59359NRj.getClass();
        C59363NRn.LIZJ(abstractC59359NRj, 8);
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        int i = ((C59357NRh) aLAdapterS8S0200000_10.l1).LJII;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZIZ(abstractC59359NRj2, i);
    }

    public static final void onAnimationEnd$4(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        abstractC59359NRj.getClass();
        C59363NRn.LIZJ(abstractC59359NRj, 8);
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS8S0200000_10.l1;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZJ(abstractC59359NRj2, 8);
        ((AbstractC59359NRj) aLAdapterS8S0200000_10.l0).LIZLLL(new OSZ("stageName", "reset"));
        ((AbstractC59359NRj) aLAdapterS8S0200000_10.l1).LIZLLL(new OSZ("stageName", "reset"));
    }

    public static final void onAnimationStart$0(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        int i = ((C59357NRh) aLAdapterS8S0200000_10.l1).LJII;
        abstractC59359NRj.getClass();
        C59363NRn.LIZIZ(abstractC59359NRj, i);
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        int i2 = -((C59357NRh) aLAdapterS8S0200000_10.l1).LJII;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZ(abstractC59359NRj2, i2);
        AbstractC59359NRj abstractC59359NRj3 = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        abstractC59359NRj3.getClass();
        C59363NRn.LIZJ(abstractC59359NRj3, 0);
    }

    public static final void onAnimationStart$1(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        int i = -((C59357NRh) aLAdapterS8S0200000_10.l1).LJIIIIZZ;
        abstractC59359NRj.getClass();
        C59363NRn.LIZ(abstractC59359NRj, i);
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZJ(abstractC59359NRj2, 0);
    }

    public static final void onAnimationStart$2(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS8S0200000_10.l0;
        int i = ((C59357NRh) aLAdapterS8S0200000_10.l1).LJII;
        abstractC59359NRj.getClass();
        C59363NRn.LIZIZ(abstractC59359NRj, i);
        AbstractC59359NRj abstractC59359NRj2 = ((C59357NRh) aLAdapterS8S0200000_10.l1).LIZJ;
        if (abstractC59359NRj2 != null) {
            abstractC59359NRj2.LIZLLL(new OSZ("stageName", "showAppInfo"));
        }
        ((AbstractC59359NRj) aLAdapterS8S0200000_10.l0).LIZLLL(new OSZ("stageName", "showAppInfo"));
    }

    public static final void onAnimationStart$3(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View underView = ((OJV) aLAdapterS8S0200000_10.l0).getUnderView();
        if (underView != null) {
            OJV ojv = (OJV) aLAdapterS8S0200000_10.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aLAdapterS8S0200000_10.l1;
            ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
            layoutParams.height = ojv.getHeight() + underView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            underView.setLayoutParams(layoutParams);
        }
    }

    public ALAdapterS8S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationStart$0(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        Animator animator = ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL;
        if (animator != null) {
            animator.cancel();
        }
        ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL = (ObjectAnimator) aLAdapterS8S0200000_10.l1;
    }

    public static final void onAnimationStart$1(ALAdapterS8S0200000_10 aLAdapterS8S0200000_10, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        Animator animator = ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL;
        if (animator != null) {
            animator.cancel();
        }
        ((C59988NgW) aLAdapterS8S0200000_10.l0).LJLL = (ObjectAnimator) aLAdapterS8S0200000_10.l1;
    }
}
