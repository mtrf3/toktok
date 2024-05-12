package Y;

import X.C16880lQ;
import X.C227008vY;
import X.InterfaceC88473Ynt;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ALAdapterS0S0210000_3 extends AnimatorListenerAdapter {
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

    public static final void onAnimationEnd$0(ALAdapterS0S0210000_3 aLAdapterS0S0210000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS0S0210000_3.z2) {
            ((View) aLAdapterS0S0210000_3.l0).setVisibility(8);
            ((C227008vY) aLAdapterS0S0210000_3.l1).LIZJ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0210000_3 aLAdapterS0S0210000_3, Animator animation) {
        float f;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C16880lQ.LJLJJLL((ObjectAnimator) aLAdapterS0S0210000_3.l1);
        ((ObjectAnimator) aLAdapterS0S0210000_3.l1).removeAllUpdateListeners();
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) aLAdapterS0S0210000_3.l0;
        if (aLAdapterS0S0210000_3.z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        interfaceC88473Ynt.invoke(Float.valueOf(f), Boolean.FALSE, Boolean.TRUE);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0210000_3 aLAdapterS0S0210000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (aLAdapterS0S0210000_3.z2) {
            ((View) aLAdapterS0S0210000_3.l0).setVisibility(0);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS0S0210000_3 aLAdapterS0S0210000_3, Animator animation) {
        float f;
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) aLAdapterS0S0210000_3.l0;
        if (aLAdapterS0S0210000_3.z2) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        interfaceC88473Ynt.invoke(Float.valueOf(f), Boolean.TRUE, Boolean.FALSE);
    }

    public ALAdapterS0S0210000_3(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
