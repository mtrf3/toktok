package Y;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDAListenerS72S0000000_2 implements Animator.AnimatorListener {
    public final int $t;

    public static final void onAnimationCancel$0(IDAListenerS72S0000000_2 iDAListenerS72S0000000_2, Animator animator) {
    }

    public static final void onAnimationEnd$0(IDAListenerS72S0000000_2 iDAListenerS72S0000000_2, Animator animator) {
    }

    public static final void onAnimationRepeat$0(IDAListenerS72S0000000_2 iDAListenerS72S0000000_2, Animator animator) {
    }

    public static final void onAnimationStart$0(IDAListenerS72S0000000_2 iDAListenerS72S0000000_2, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "p0");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
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
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "p0");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
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
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "p0");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
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
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "p0");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public IDAListenerS72S0000000_2(int i) {
        this.$t = i;
    }
}
