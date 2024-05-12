package Y;

import X.C16880lQ;
import X.C32500CpE;
import X.C74074T5i;
import X.C76930UHe;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDAListenerS5S0300000_4 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS5S0300000_4 iDAListenerS5S0300000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C74074T5i) iDAListenerS5S0300000_4.l0).LLIILII = false;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS5S0300000_4.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS5S0300000_4 iDAListenerS5S0300000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C16880lQ.LJLLL((SmartImageView) iDAListenerS5S0300000_4.l1, (ViewGroup) iDAListenerS5S0300000_4.l0);
        C16880lQ.LJLJL((ValueAnimator) iDAListenerS5S0300000_4.l2);
    }

    public static final void onAnimationStart$0(IDAListenerS5S0300000_4 iDAListenerS5S0300000_4, Animator animator) {
        o.LJIIIZ(animator, "animator");
        Iterator<View> it = ((C32500CpE) iDAListenerS5S0300000_4.l0).LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
        ((C76930UHe) iDAListenerS5S0300000_4.l1).setVisibility(0);
        View view = (View) iDAListenerS5S0300000_4.l2;
        if (view != null) {
            view.postDelayed(new ARunnableS40S0100000_4(view, 4), 50L);
        }
    }

    public static final void onAnimationStart$1(IDAListenerS5S0300000_4 iDAListenerS5S0300000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C74074T5i) iDAListenerS5S0300000_4.l0).LLIILII = true;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS5S0300000_4.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public IDAListenerS5S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
