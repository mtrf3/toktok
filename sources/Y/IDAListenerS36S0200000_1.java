package Y;

import X.C113534cv;
import X.C3XR;
import X.C4LG;
import X.C4LI;
import X.C68322mC;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDAListenerS36S0200000_1 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                o.LJIIIZ(animator, "animator");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                onAnimationCancel$5(this, animator);
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
                o.LJIIIZ(animator, "animator");
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
                o.LJIIIZ(animator, "p0");
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
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                o.LJIIIZ(animator, "animator");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "p0");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                o.LJIIIZ(animator, "animator");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "p0");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$1(IDAListenerS36S0200000_1 iDAListenerS36S0200000_1, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C113534cv) iDAListenerS36S0200000_1.l0).setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = ((View) iDAListenerS36S0200000_1.l1).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(0);
        ((View) iDAListenerS36S0200000_1.l1).setLayoutParams(marginLayoutParams);
        ((C113534cv) iDAListenerS36S0200000_1.l0).setVisibility(8);
    }

    public static final void onAnimationCancel$5(IDAListenerS36S0200000_1 iDAListenerS36S0200000_1, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((View) iDAListenerS36S0200000_1.l0).setAlpha(1.0f);
        ((View) iDAListenerS36S0200000_1.l0).setVisibility(8);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) ((C68322mC) iDAListenerS36S0200000_1.l1).element;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C68322mC) iDAListenerS36S0200000_1.l1).element = null;
    }

    public static final void onAnimationEnd$0(IDAListenerS36S0200000_1 iDAListenerS36S0200000_1, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C3XR) iDAListenerS36S0200000_1.l0).LIZ.setVisibility(8);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS36S0200000_1.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS36S0200000_1 iDAListenerS36S0200000_1, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C113534cv) iDAListenerS36S0200000_1.l0).setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = ((View) iDAListenerS36S0200000_1.l1).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(0);
        ((View) iDAListenerS36S0200000_1.l1).setLayoutParams(marginLayoutParams);
        ((C113534cv) iDAListenerS36S0200000_1.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$3(IDAListenerS36S0200000_1 iDAListenerS36S0200000_1, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C4LI c4li = (C4LI) iDAListenerS36S0200000_1.l0;
        String str = ((C4LG) iDAListenerS36S0200000_1.l1).LJLILLLLZI;
        if (str != null) {
            c4li.LIZ(str);
        } else {
            o.LJIJI("emoji");
            throw null;
        }
    }

    public static final void onAnimationEnd$4(IDAListenerS36S0200000_1 iDAListenerS36S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) iDAListenerS36S0200000_1.l0).setVisibility(8);
        View view = (View) iDAListenerS36S0200000_1.l1;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = (View) iDAListenerS36S0200000_1.l1;
        if (view2 != null) {
            view2.setAlpha(0.1f);
        }
    }

    public IDAListenerS36S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
