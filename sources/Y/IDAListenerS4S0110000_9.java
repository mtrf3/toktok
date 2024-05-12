package Y;

import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDAListenerS4S0110000_9 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
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
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
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
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS4S0110000_9 iDAListenerS4S0110000_9, Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        View view = (View) iDAListenerS4S0110000_9.l0;
        if (iDAListenerS4S0110000_9.z1) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void onAnimationEnd$1(IDAListenerS4S0110000_9 iDAListenerS4S0110000_9, Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        View C3 = ((MFToolBarAssem) iDAListenerS4S0110000_9.l0).C3();
        if (iDAListenerS4S0110000_9.z1) {
            i = 0;
        } else {
            i = 8;
        }
        C3.setVisibility(i);
    }

    public IDAListenerS4S0110000_9(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
