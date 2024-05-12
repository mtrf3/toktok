package Y;

import X.InterfaceC65784Pro;
import X.KL4;
import X.KL5;
import X.KL7;
import X.KLD;
import X.KSB;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ALAdapterS4S0300000_8 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS4S0300000_8 aLAdapterS4S0300000_8, Animator animation) {
        InterfaceC65784Pro interfaceC65784Pro;
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        if (o.LJ((Boolean) aLAdapterS4S0300000_8.l2, Boolean.FALSE) && (interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS4S0300000_8.l1) != null) {
            interfaceC65784Pro.invoke();
        }
        ((KLD) aLAdapterS4S0300000_8.l0).LJZL = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0300000_8 aLAdapterS4S0300000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((KSB) aLAdapterS4S0300000_8.l0).LIZJ((Product) aLAdapterS4S0300000_8.l1);
        ((Animator) aLAdapterS4S0300000_8.l2).start();
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0300000_8 aLAdapterS4S0300000_8, Animator animator) {
        super.onAnimationEnd(animator);
        ((KL5) aLAdapterS4S0300000_8.l2).LIZIZ((MotionEvent) aLAdapterS4S0300000_8.l1, (View) aLAdapterS4S0300000_8.l0);
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0300000_8 aLAdapterS4S0300000_8, Animator animator) {
        super.onAnimationEnd(animator);
        ((KL7) aLAdapterS4S0300000_8.l2).LIZIZ((MotionEvent) aLAdapterS4S0300000_8.l1, (View) aLAdapterS4S0300000_8.l0);
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0300000_8 aLAdapterS4S0300000_8, Animator animation) {
        InterfaceC65784Pro interfaceC65784Pro;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (((KLD) aLAdapterS4S0300000_8.l0).LJZL && (interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS4S0300000_8.l1) != null) {
            interfaceC65784Pro.invoke();
        }
        ((KLD) aLAdapterS4S0300000_8.l0).LJZL = false;
    }

    public static final void onAnimationEnd$4(ALAdapterS4S0300000_8 aLAdapterS4S0300000_8, Animator animator) {
        super.onAnimationEnd(animator);
        ((KL4) aLAdapterS4S0300000_8.l2).LIZIZ((MotionEvent) aLAdapterS4S0300000_8.l1, (View) aLAdapterS4S0300000_8.l0);
    }

    public static final void onAnimationStart$0(ALAdapterS4S0300000_8 aLAdapterS4S0300000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((KLD) aLAdapterS4S0300000_8.l0).LJZL = true;
    }

    public ALAdapterS4S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
