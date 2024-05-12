package Y;

import X.C16880lQ;
import X.C73062Slu;
import X.EnumC73069Sm1;
import X.KeyEventCallbackC73065Slx;
import X.SJ3;
import X.T5P;
import X.T5Q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ALAdapterS9S0200000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
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
            case 2:
                onAnimationEnd$2(this, animator);
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

    public static final void onAnimationCancel$0(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        ((SJ3) aLAdapterS9S0200000_12.l1).LLD.removeAllUpdateListeners();
        C16880lQ.LJLJL(((SJ3) aLAdapterS9S0200000_12.l1).LLD);
        Runnable runnable = (Runnable) aLAdapterS9S0200000_12.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        ((AnimatorSet) aLAdapterS9S0200000_12.l0).start();
        T5Q t5q = ((T5P) aLAdapterS9S0200000_12.l1).LJLIL;
        if (t5q != null) {
            t5q.LIZIZ(1);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        KeyEventCallbackC73065Slx.LJLZ = EnumC73069Sm1.PORTRAIT;
        KeyEventCallbackC73065Slx.LIZJ((C73062Slu) aLAdapterS9S0200000_12.l0);
        ViewGroup.LayoutParams layoutParams = ((C73062Slu) aLAdapterS9S0200000_12.l0).getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        ((C73062Slu) aLAdapterS9S0200000_12.l0).setLayoutParams(layoutParams);
        KeyEventCallbackC73065Slx.LIZ((C73062Slu) aLAdapterS9S0200000_12.l0, (ViewGroup) aLAdapterS9S0200000_12.l1, Integer.valueOf(r2.getChildCount() - 1));
        C73062Slu c73062Slu = KeyEventCallbackC73065Slx.LJLJLJ;
        if (c73062Slu != null) {
            c73062Slu.LJIIIZ(KeyEventCallbackC73065Slx.LJLZ);
        }
        ImageView imageView = KeyEventCallbackC73065Slx.LJLLILLLL;
        if (imageView != null) {
            imageView.post(new ARunnableS12S0101000_8(0, imageView, 35));
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        ((SJ3) aLAdapterS9S0200000_12.l1).LLD.removeAllUpdateListeners();
        C16880lQ.LJLJL(((SJ3) aLAdapterS9S0200000_12.l1).LLD);
        Runnable runnable = (Runnable) aLAdapterS9S0200000_12.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        T5Q t5q = ((T5P) aLAdapterS9S0200000_12.l1).LJLIL;
        if (t5q != null) {
            t5q.LIZIZ(0);
        }
    }

    public ALAdapterS9S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
