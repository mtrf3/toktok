package Y;

import X.C39661h4;
import X.C78890Uxi;
import X.C80944Vpk;
import X.WNO;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ALAdapterS7S0300000_14 extends AnimatorListenerAdapter {
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
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                return;
            case 3:
                onAnimationStart$1(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS7S0300000_14 aLAdapterS7S0300000_14, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C39661h4) aLAdapterS7S0300000_14.l0).LJIIIIZZ();
        ((C39661h4) aLAdapterS7S0300000_14.l1).LJIIIIZZ();
        ((ObjectAnimator) aLAdapterS7S0300000_14.l2).start();
    }

    public static final void onAnimationEnd$1(ALAdapterS7S0300000_14 aLAdapterS7S0300000_14, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C39661h4) aLAdapterS7S0300000_14.l0).LJIIIIZZ();
        ((C39661h4) aLAdapterS7S0300000_14.l1).LJIIIIZZ();
        ((ObjectAnimator) aLAdapterS7S0300000_14.l2).start();
    }

    public static final void onAnimationEnd$2(ALAdapterS7S0300000_14 aLAdapterS7S0300000_14, Animator animator) {
        super.onAnimationEnd(animator);
        for (WNO wno : (List) aLAdapterS7S0300000_14.l1) {
            wno.LIZJ.LIZIZ(true);
            C80944Vpk.LIZJ(wno.LIZIZ);
            wno.LIZIZ.setVisibility(0);
            wno.LIZ.setVisibility(0);
        }
        C78890Uxi.LIZIZ((ViewGroup) ((View) aLAdapterS7S0300000_14.l0).getRootView(), false);
        ((Runnable) aLAdapterS7S0300000_14.l2).run();
    }

    public static final void onAnimationEnd$3(ALAdapterS7S0300000_14 aLAdapterS7S0300000_14, Animator animator) {
        super.onAnimationEnd(animator);
        for (WNO wno : (List) aLAdapterS7S0300000_14.l1) {
            wno.LIZJ.LIZIZ(false);
            C80944Vpk.LIZJ(wno.LIZ);
            wno.LIZIZ.setVisibility(0);
            wno.LIZ.setVisibility(0);
        }
        C78890Uxi.LIZIZ((ViewGroup) ((View) aLAdapterS7S0300000_14.l0).getRootView(), false);
        ((Runnable) aLAdapterS7S0300000_14.l2).run();
    }

    public static final void onAnimationStart$0(ALAdapterS7S0300000_14 aLAdapterS7S0300000_14, Animator animator) {
        super.onAnimationStart(animator);
        C78890Uxi.LIZIZ((ViewGroup) ((View) aLAdapterS7S0300000_14.l0).getRootView(), true);
    }

    public static final void onAnimationStart$1(ALAdapterS7S0300000_14 aLAdapterS7S0300000_14, Animator animator) {
        super.onAnimationStart(animator);
        C78890Uxi.LIZIZ((ViewGroup) ((View) aLAdapterS7S0300000_14.l0).getRootView(), true);
    }

    public ALAdapterS7S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
