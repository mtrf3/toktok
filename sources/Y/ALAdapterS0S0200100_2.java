package Y;

import X.C198517qh;
import X.C6BK;
import X.GXR;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes3.dex */
public class ALAdapterS0S0200100_2 extends AnimatorListenerAdapter {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0200100_2 aLAdapterS0S0200100_2, Animator animator) {
        ((View) aLAdapterS0S0200100_2.l0).setVisibility(0);
        if (aLAdapterS0S0200100_2.j2 > 0) {
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZJ(Long.valueOf(System.currentTimeMillis() - aLAdapterS0S0200100_2.j2), "click_show_duration");
            c198517qh.LJ();
        }
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aLAdapterS0S0200100_2.l1;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0200100_2 aLAdapterS0S0200100_2, Animator animator) {
        ((View) aLAdapterS0S0200100_2.l0).setVisibility(0);
        if (aLAdapterS0S0200100_2.j2 > 0) {
            C6BK c6bk = new C6BK();
            c6bk.LIZJ(Long.valueOf(System.currentTimeMillis() - aLAdapterS0S0200100_2.j2), "click_show_duration");
            GXR.LIZIZ("tool_performance_enter_text_sticker_tab", c6bk.LJ());
        }
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aLAdapterS0S0200100_2.l1;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        super.onAnimationEnd(animator);
    }

    public ALAdapterS0S0200100_2(long j, ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, View view, int i) {
        this.$t = i;
        this.l0 = view;
        this.j2 = j;
        this.l1 = aLAdapterS1S0100000_2;
    }
}
