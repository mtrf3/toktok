package Y;

import X.KeyEventCallbackC73065Slx;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ALAdapterS4S0000000_12 extends AnimatorListenerAdapter {
    public final int $t;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public ALAdapterS4S0000000_12(int i) {
        this.$t = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0000000_12 aLAdapterS4S0000000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        KeyEventCallbackC73065Slx.LIZJ(KeyEventCallbackC73065Slx.LJLLILLLL);
        KeyEventCallbackC73065Slx.LJLLI = null;
        KeyEventCallbackC73065Slx.LJLLILLLL = null;
        KeyEventCallbackC73065Slx.LJLJL = null;
        KeyEventCallbackC73065Slx.LJLJLLL = null;
        KeyEventCallbackC73065Slx.LJLL = null;
        KeyEventCallbackC73065Slx.LJLJLJ = null;
        KeyEventCallbackC73065Slx.LJLJJL = null;
        KeyEventCallbackC73065Slx.LJLJJLL = null;
    }
}
