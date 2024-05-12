package Y;

import X.C78928UyK;
import X.C81259Vup;
import X.C81443Vxn;
import X.C82894Wg6;
import X.InterfaceC45540Hu4;
import X.InterfaceC65784Pro;
import X.T4X;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ALAdapterS2S0210000_14 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 1:
                onAnimationStart$1(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0210000_14 aLAdapterS2S0210000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        aLAdapterS2S0210000_14.z2 = true;
        View view = ((C81443Vxn) aLAdapterS2S0210000_14.l0).mView;
        if (view != null) {
            view.setVisibility(8);
        }
        C78928UyK.LIZIZ(true, false, false, ((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLJL);
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) ((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLJJL.getValue();
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLJJLL);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0210000_14 aLAdapterS2S0210000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS2S0210000_14.z2) {
            return;
        }
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) ((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLJJL.getValue();
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLJJLL);
        }
        T4X t4x = ((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLIL;
        if (t4x != null) {
            t4x.LIZJ();
        }
        if (C82894Wg6.LIZIZ.LIZLLL()) {
            ((C81443Vxn) aLAdapterS2S0210000_14.l0).requireView().setLayerType(0, null);
        }
        ((InterfaceC65784Pro) aLAdapterS2S0210000_14.l1).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0210000_14 aLAdapterS2S0210000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS2S0210000_14.z2) {
            ((View) aLAdapterS2S0210000_14.l0).setVisibility(8);
            ((C81259Vup) aLAdapterS2S0210000_14.l1).LIZLLL();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS2S0210000_14 aLAdapterS2S0210000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        aLAdapterS2S0210000_14.z2 = false;
        View requireView = ((C81443Vxn) aLAdapterS2S0210000_14.l0).requireView();
        o.LJIIIIZZ(requireView, "requireView()");
        requireView.setVisibility(0);
        T4X t4x = ((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLIL;
        if (t4x != null) {
            t4x.LIZIZ();
        }
        if (C82894Wg6.LIZIZ.LIZLLL()) {
            ((C81443Vxn) aLAdapterS2S0210000_14.l0).requireView().setLayerType(2, null);
        }
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) ((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLJJL.getValue();
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.registerActivityOnKeyDownListener(((C81443Vxn) aLAdapterS2S0210000_14.l0).LJLJJLL);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS2S0210000_14 aLAdapterS2S0210000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (aLAdapterS2S0210000_14.z2) {
            ((View) aLAdapterS2S0210000_14.l0).setVisibility(0);
        }
    }

    public ALAdapterS2S0210000_14(C81443Vxn c81443Vxn, AqS164S0100000_14 aqS164S0100000_14, int i) {
        this.$t = i;
        this.l0 = c81443Vxn;
        this.l1 = aqS164S0100000_14;
    }

    public ALAdapterS2S0210000_14(boolean z, View view, C81259Vup c81259Vup, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = view;
        this.l1 = c81259Vup;
    }
}
