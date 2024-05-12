package Y;

import X.C16880lQ;
import X.C2315096s;
import X.C95D;
import X.C95F;
import X.InterfaceC65784Pro;
import X.KL2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDAListenerS38S0200000_4 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
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
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
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
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
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
                onAnimationStart$1(this, animator);
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                onAnimationStart$4(this, animator);
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$0(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2315096s) iDAListenerS38S0200000_4.l0).setScaleX(1.0f);
        ((C2315096s) iDAListenerS38S0200000_4.l0).setScaleY(1.0f);
    }

    public static final void onAnimationEnd$0(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2315096s) iDAListenerS38S0200000_4.l0).setScaleX(1.0f);
        ((C2315096s) iDAListenerS38S0200000_4.l0).setScaleY(1.0f);
        if (((C2315096s) iDAListenerS38S0200000_4.l0).LJLILLLLZI) {
            ((AnimatorSet) iDAListenerS38S0200000_4.l1).start();
        } else {
            if (!((AnimatorSet) iDAListenerS38S0200000_4.l1).isRunning()) {
                return;
            }
            ((AnimatorSet) iDAListenerS38S0200000_4.l1).cancel();
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l1).invoke();
    }

    public static final void onAnimationEnd$2(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l1).invoke();
    }

    public static final void onAnimationEnd$3(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l1).invoke();
    }

    public static final void onAnimationEnd$4(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l1).invoke();
    }

    public static final void onAnimationEnd$5(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C16880lQ.LJLLL((ImageView) iDAListenerS38S0200000_4.l1, (ViewGroup) iDAListenerS38S0200000_4.l0);
    }

    public static final void onAnimationEnd$6(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C95D c95d = (C95D) iDAListenerS38S0200000_4.l0;
        ViewGroup viewGroup = c95d.LIZ;
        if (viewGroup != null) {
            float LIZJ = KL2.LIZJ(viewGroup.getContext(), 4.0f);
            float f = -LIZJ;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", f, LIZJ);
            ofFloat.setInterpolator(new AccelerateInterpolator(3.0f));
            ofFloat.setDuration(750L);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, "translationY", LIZJ, f);
            ofFloat2.setInterpolator(new DecelerateInterpolator(3.0f));
            ofFloat2.setDuration(750L);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            AnimatorSet animatorSet = new AnimatorSet();
            c95d.LJIIIIZZ = animatorSet;
            animatorSet.playSequentially(ofFloat, ofFloat2);
            animatorSet.start();
        }
        ((C95D) iDAListenerS38S0200000_4.l0).getClass();
        C95F LIZJ2 = C95D.LIZJ();
        if (LIZJ2 != null) {
            LIZJ2.LJ((Context) iDAListenerS38S0200000_4.l1);
        }
    }

    public static final void onAnimationStart$1(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l0).invoke();
    }

    public static final void onAnimationStart$2(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l0).invoke();
    }

    public static final void onAnimationStart$3(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l0).invoke();
    }

    public static final void onAnimationStart$4(IDAListenerS38S0200000_4 iDAListenerS38S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS38S0200000_4.l0).invoke();
    }

    public IDAListenerS38S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
