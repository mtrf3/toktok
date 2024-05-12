package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ALAdapterS1S0000000_4 extends AnimatorListenerAdapter {
    public final int $t;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
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
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
            case 4:
            case 5:
            default:
                super.onAnimationEnd(animator);
                return;
            case 6:
                onAnimationEnd$3(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS1S0000000_4(int i) {
        this.$t = i;
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0000000_4 aLAdapterS1S0000000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0000000_4 aLAdapterS1S0000000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0000000_4 aLAdapterS1S0000000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0000000_4 aLAdapterS1S0000000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
    }
}
