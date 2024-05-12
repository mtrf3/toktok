package Y;

import X.C0NB;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ALAdapterS2S0000000_5 extends AnimatorListenerAdapter {
    public final int $t;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
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
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS2S0000000_5(int i) {
        this.$t = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0000000_5 aLAdapterS2S0000000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("start width end");
    }

    public static final void onAnimationStart$0(ALAdapterS2S0000000_5 aLAdapterS2S0000000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C0NB.LIZ(" start width start");
    }
}
