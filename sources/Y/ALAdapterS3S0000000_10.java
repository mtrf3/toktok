package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ALAdapterS3S0000000_10 extends AnimatorListenerAdapter {
    public final int $t;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
            case 2:
            case 3:
            default:
                super.onAnimationEnd(animator);
                return;
            case 4:
                onAnimationEnd$1(this, animator);
                return;
        }
    }

    public ALAdapterS3S0000000_10(int i) {
        this.$t = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0000000_10 aLAdapterS3S0000000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        animation.setStartDelay(1000L);
        animation.start();
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0000000_10 aLAdapterS3S0000000_10, Animator animator) {
        super.onAnimationEnd(animator);
        animator.setStartDelay(1000L);
        animator.start();
    }
}
