package Y;

import X.C80656Vl6;
import X.C80665VlF;
import X.C80676VlQ;
import X.C80685VlZ;
import X.C80696Vlk;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes15.dex */
public class ALAdapterS3S0101000_14 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final void onAnimationEnd$0(ALAdapterS3S0101000_14 aLAdapterS3S0101000_14, Animator animator) {
        C80665VlF c80665VlF = (C80665VlF) aLAdapterS3S0101000_14.l0;
        c80665VlF.LJLJI = aLAdapterS3S0101000_14.i1;
        c80665VlF.LJLJJI = 0.0f;
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0101000_14 aLAdapterS3S0101000_14, Animator animator) {
        C80656Vl6 c80656Vl6 = (C80656Vl6) aLAdapterS3S0101000_14.l0;
        c80656Vl6.LJLJI = aLAdapterS3S0101000_14.i1;
        c80656Vl6.LJLJJI = 0.0f;
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0101000_14 aLAdapterS3S0101000_14, Animator animator) {
        C80676VlQ c80676VlQ = (C80676VlQ) aLAdapterS3S0101000_14.l0;
        c80676VlQ.LJLJI = aLAdapterS3S0101000_14.i1;
        c80676VlQ.LJLJJI = 0.0f;
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0101000_14 aLAdapterS3S0101000_14, Animator animator) {
        C80685VlZ c80685VlZ = (C80685VlZ) aLAdapterS3S0101000_14.l0;
        c80685VlZ.LJLJI = aLAdapterS3S0101000_14.i1;
        c80685VlZ.LJLJJI = 0.0f;
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0101000_14 aLAdapterS3S0101000_14, Animator animator) {
        C80696Vlk c80696Vlk = (C80696Vlk) aLAdapterS3S0101000_14.l0;
        c80696Vlk.LJLJI = aLAdapterS3S0101000_14.i1;
        c80696Vlk.LJLJJI = 0.0f;
    }

    public ALAdapterS3S0101000_14(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
