package Y;

import X.CSH;
import X.InterfaceC88471Ynr;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ALAdapterS1S0210000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator, z);
                return;
            default:
                super.onAnimationEnd(animator, z);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0210000_5 aLAdapterS1S0210000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aLAdapterS1S0210000_5.l0;
        CSH pinnedModel = (CSH) aLAdapterS1S0210000_5.l1;
        o.LJIIIIZZ(pinnedModel, "pinnedModel");
        interfaceC88471Ynr.invoke(pinnedModel, Boolean.valueOf(aLAdapterS1S0210000_5.z2));
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0210000_5 aLAdapterS1S0210000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS1S0210000_5.z2) {
            AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) aLAdapterS1S0210000_5.l1;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animation);
                return;
            }
            return;
        }
        ((View) aLAdapterS1S0210000_5.l0).setVisibility(4);
        AnimatorListenerAdapter animatorListenerAdapter2 = (AnimatorListenerAdapter) aLAdapterS1S0210000_5.l1;
        if (animatorListenerAdapter2 != null) {
            animatorListenerAdapter2.onAnimationEnd(animation);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS1S0210000_5 aLAdapterS1S0210000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS1S0210000_5.z2) {
            return;
        }
        ((View) aLAdapterS1S0210000_5.l0).setVisibility(0);
        AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) aLAdapterS1S0210000_5.l1;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0210000_5 aLAdapterS1S0210000_5, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS1S0210000_5.z2) {
            AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) aLAdapterS1S0210000_5.l1;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animation);
                return;
            }
            return;
        }
        ((View) aLAdapterS1S0210000_5.l0).setVisibility(4);
        AnimatorListenerAdapter animatorListenerAdapter2 = (AnimatorListenerAdapter) aLAdapterS1S0210000_5.l1;
        if (animatorListenerAdapter2 != null) {
            animatorListenerAdapter2.onAnimationEnd(animation);
        }
    }

    public ALAdapterS1S0210000_5(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
