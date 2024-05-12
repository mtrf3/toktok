package Y;

import X.C117344j4;
import X.C16880lQ;
import X.C3C5;
import X.C76800UCe;
import X.C79146V4k;
import X.MBA;
import X.XJL;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ALAdapterS0S0400000_1 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
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
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0400000_1 aLAdapterS0S0400000_1, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((View) aLAdapterS0S0400000_1.l2).setAlpha(1.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0400000_1 aLAdapterS0S0400000_1, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C16880lQ.LJLJJL((AnimatorSet) aLAdapterS0S0400000_1.l3);
        ((C117344j4) aLAdapterS0S0400000_1.l0).LJIL((RecyclerView.ViewHolder) aLAdapterS0S0400000_1.l1);
        C117344j4 c117344j4 = (C117344j4) aLAdapterS0S0400000_1.l0;
        if (!c117344j4.LJIILJJIL()) {
            c117344j4.LJIIIIZZ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0400000_1 aLAdapterS0S0400000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (C79146V4k.LJJJ((MBA) aLAdapterS0S0400000_1.l0)) {
            XJL xjl = (XJL) aLAdapterS0S0400000_1.l1;
            C16880lQ.LJLLL((ImageView) aLAdapterS0S0400000_1.l3, (ViewGroup) ((View) aLAdapterS0S0400000_1.l2));
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xjl.resumeWith(c76800UCe);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0400000_1 aLAdapterS0S0400000_1, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C117344j4) aLAdapterS0S0400000_1.l0).getClass();
    }

    public ALAdapterS0S0400000_1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
