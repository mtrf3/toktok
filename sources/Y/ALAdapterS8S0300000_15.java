package Y;

import X.C16880lQ;
import X.C86997YCj;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes16.dex */
public class ALAdapterS8S0300000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0300000_15 aLAdapterS8S0300000_15, Animator animator) {
        C16880lQ.LJLJL((ValueAnimator) aLAdapterS8S0300000_15.l1);
        ((C86997YCj) aLAdapterS8S0300000_15.l2).LJII((RecyclerView.ViewHolder) aLAdapterS8S0300000_15.l0);
        ((C86997YCj) aLAdapterS8S0300000_15.l2).LJIILLIIL.remove((RecyclerView.ViewHolder) aLAdapterS8S0300000_15.l0);
        ((C86997YCj) aLAdapterS8S0300000_15.l2).LJJIFFI();
    }

    public static final void onAnimationEnd$1(ALAdapterS8S0300000_15 aLAdapterS8S0300000_15, Animator animator) {
        C16880lQ.LJLJL((ValueAnimator) aLAdapterS8S0300000_15.l1);
        ((C86997YCj) aLAdapterS8S0300000_15.l2).LJII((RecyclerView.ViewHolder) aLAdapterS8S0300000_15.l0);
        ((C86997YCj) aLAdapterS8S0300000_15.l2).LJIILL.remove((RecyclerView.ViewHolder) aLAdapterS8S0300000_15.l0);
        ((C86997YCj) aLAdapterS8S0300000_15.l2).LJJIFFI();
    }

    public static final void onAnimationStart$0(ALAdapterS8S0300000_15 aLAdapterS8S0300000_15, Animator animator) {
        ((C86997YCj) aLAdapterS8S0300000_15.l2).getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS8S0300000_15 aLAdapterS8S0300000_15, Animator animator) {
        ((C86997YCj) aLAdapterS8S0300000_15.l2).getClass();
    }

    public ALAdapterS8S0300000_15(C86997YCj c86997YCj, RecyclerView.ViewHolder viewHolder, ValueAnimator valueAnimator, int i) {
        this.$t = i;
        this.l2 = c86997YCj;
        this.l0 = viewHolder;
        this.l1 = valueAnimator;
    }
}
