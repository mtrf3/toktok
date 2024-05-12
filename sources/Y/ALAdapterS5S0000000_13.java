package Y;

import X.C0NB;
import X.UHR;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ALAdapterS5S0000000_13 extends AnimatorListenerAdapter {
    public final int $t;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationCancel$0(this, animator);
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
                super.onAnimationEnd(animator);
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
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                onAnimationStart$1(this, animator);
                return;
        }
    }

    public ALAdapterS5S0000000_13(int i) {
        this.$t = i;
    }

    public static final void onAnimationCancel$0(ALAdapterS5S0000000_13 aLAdapterS5S0000000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0000000_13 aLAdapterS5S0000000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("holder  end");
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0000000_13 aLAdapterS5S0000000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        UHR.LIZ = false;
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0000000_13 aLAdapterS5S0000000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("holder  end");
    }

    public static final void onAnimationEnd$4(ALAdapterS5S0000000_13 aLAdapterS5S0000000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationStart$0(ALAdapterS5S0000000_13 aLAdapterS5S0000000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C0NB.LIZ(" holder  start");
    }

    public static final void onAnimationStart$1(ALAdapterS5S0000000_13 aLAdapterS5S0000000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C0NB.LIZ(" holder  start");
    }
}
