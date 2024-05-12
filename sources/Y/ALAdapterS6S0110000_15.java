package Y;

import X.C53379KxD;
import X.C86652Xzc;
import X.C90193gN;
import X.InterfaceC86653Xzd;
import X.XXF;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ALAdapterS6S0110000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final void onAnimationCancel$0(ALAdapterS6S0110000_15 aLAdapterS6S0110000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C86652Xzc) aLAdapterS6S0110000_15.l0).LIZ(R.id.b5f).setClickable(aLAdapterS6S0110000_15.z1);
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0110000_15 aLAdapterS6S0110000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C86652Xzc) aLAdapterS6S0110000_15.l0).LIZ(R.id.b5f).setClickable(aLAdapterS6S0110000_15.z1);
        InterfaceC86653Xzd delegate = ((C86652Xzc) aLAdapterS6S0110000_15.l0).getDelegate();
        if (delegate != null) {
            delegate.LIZLLL();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0110000_15 aLAdapterS6S0110000_15, Animator animator) {
        ((XXF) aLAdapterS6S0110000_15.l0).LJLLI.setClickable(true);
        if (aLAdapterS6S0110000_15.z1) {
            ((XXF) aLAdapterS6S0110000_15.l0).LJLJLJ.setVisibility(8);
            ((XXF) aLAdapterS6S0110000_15.l0).LJLJLJ.clearAnimation();
            if (C90193gN.LIZIZ(((XXF) aLAdapterS6S0110000_15.l0).LJLZ)) {
                ((ViewGroup.MarginLayoutParams) ((XXF) aLAdapterS6S0110000_15.l0).LJLL.getLayoutParams()).leftMargin = 0;
            } else {
                ((ViewGroup.MarginLayoutParams) ((XXF) aLAdapterS6S0110000_15.l0).LJLL.getLayoutParams()).rightMargin = 0;
            }
        }
    }

    public static final void onAnimationStart$0(ALAdapterS6S0110000_15 aLAdapterS6S0110000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C86652Xzc) aLAdapterS6S0110000_15.l0).LIZ(R.id.b5f).setClickable(false);
        C86652Xzc c86652Xzc = (C86652Xzc) aLAdapterS6S0110000_15.l0;
        c86652Xzc.getClass();
        if (C53379KxD.LIZ() && c86652Xzc.LIZ(R.id.bgr).getVisibility() == 0) {
            c86652Xzc.LIZ(R.id.bgr).setAlpha(1.0f);
            ObjectAnimator objectAnimator = c86652Xzc.LJLJJI;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c86652Xzc.LIZ(R.id.bgr), "alpha", 0.3f);
            ofFloat.setDuration(1500L);
            ofFloat.setStartDelay(3000L);
            ofFloat.addListener(new IDAListenerS82S0100000_15(c86652Xzc, 2));
            ofFloat.start();
            c86652Xzc.LJLJJI = ofFloat;
        }
    }

    public ALAdapterS6S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
