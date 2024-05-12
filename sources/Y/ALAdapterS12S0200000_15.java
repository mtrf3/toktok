package Y;

import X.C51464KHs;
import X.XVJ;
import X.XVK;
import X.XXG;
import X.XYR;
import X.YK3;
import X.YK4;
import X.YKQ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ALAdapterS12S0200000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 3:
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
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationStart$0(this, animator);
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS12S0200000_15 aLAdapterS12S0200000_15, Animator animator) {
        ((View) aLAdapterS12S0200000_15.l0).setVisibility(4);
    }

    public static final void onAnimationEnd$0(ALAdapterS12S0200000_15 aLAdapterS12S0200000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (((YK3) aLAdapterS12S0200000_15.l0).LJLILLLLZI.contains((YK4) aLAdapterS12S0200000_15.l1)) {
            ((YK3) aLAdapterS12S0200000_15.l0).LJLILLLLZI.remove((YK4) aLAdapterS12S0200000_15.l1);
            ((YK3) aLAdapterS12S0200000_15.l0).LJLJI.LIZ((YK4) aLAdapterS12S0200000_15.l1);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS12S0200000_15 aLAdapterS12S0200000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((YKQ) aLAdapterS12S0200000_15.l0).getClass();
    }

    public static final void onAnimationEnd$2(ALAdapterS12S0200000_15 aLAdapterS12S0200000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        YKQ ykq = (YKQ) aLAdapterS12S0200000_15.l0;
        View view = (View) aLAdapterS12S0200000_15.l1;
        if (!ykq.LJLIL) {
            ((C51464KHs) ykq).LJLJI.invoke(view);
            ykq.LJLIL = true;
            if (view != null) {
                view.postDelayed(ykq.LJLILLLLZI, 700L);
            }
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS12S0200000_15 aLAdapterS12S0200000_15, Animator animator) {
        ((View) aLAdapterS12S0200000_15.l0).setVisibility(4);
    }

    public static final void onAnimationEnd$4(ALAdapterS12S0200000_15 aLAdapterS12S0200000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnimatorSet) aLAdapterS12S0200000_15.l1).start();
        XVK xvk = (XVK) aLAdapterS12S0200000_15.l0;
        if (xvk != null) {
            XXG xxg = ((XYR) xvk).LIZ;
            xxg.getClass();
            XVJ.LIZ(xxg.LJLJL, !xxg.LLF ? 1 : 0);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS12S0200000_15 aLAdapterS12S0200000_15, Animator animator) {
        ((View) aLAdapterS12S0200000_15.l1).setVisibility(0);
    }

    public ALAdapterS12S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ALAdapterS12S0200000_15(YKQ ykq, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l0 = ykq;
        this.l1 = view;
    }
}
