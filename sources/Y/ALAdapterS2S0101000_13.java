package Y;

import X.C0NB;
import X.C76414Tys;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ALAdapterS2S0101000_13 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
            default:
                super.onAnimationCancel(animator);
                return;
            case 2:
                onAnimationCancel$1(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                onAnimationEnd$1(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0101000_13 aLAdapterS2S0101000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C76414Tys) aLAdapterS2S0101000_13.l0).LJIIL(aLAdapterS2S0101000_13.i1);
    }

    public static final void onAnimationCancel$1(ALAdapterS2S0101000_13 aLAdapterS2S0101000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((MatchCountDownAssem) aLAdapterS2S0101000_13.l0).E3(aLAdapterS2S0101000_13.i1);
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0101000_13 aLAdapterS2S0101000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("animator end");
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0101000_13 aLAdapterS2S0101000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("animator end");
    }

    public static final void onAnimationStart$0(ALAdapterS2S0101000_13 aLAdapterS2S0101000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C0NB.LIZ("animator start");
    }

    public static final void onAnimationStart$1(ALAdapterS2S0101000_13 aLAdapterS2S0101000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS2S0101000_13.l0).setAlpha(0.0f);
        ((View) aLAdapterS2S0101000_13.l0).setVisibility(0);
        ((View) aLAdapterS2S0101000_13.l0).setTranslationY(aLAdapterS2S0101000_13.i1);
    }

    public static final void onAnimationStart$2(ALAdapterS2S0101000_13 aLAdapterS2S0101000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C0NB.LIZ("animator start");
    }

    public ALAdapterS2S0101000_13(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
