package Y;

import X.C76800UCe;
import X.C80001VaX;
import X.C80164VdA;
import X.C83207Wl9;
import X.C83210WlC;
import X.EnumC80174VdK;
import X.InterfaceC65784Pro;
import X.InterfaceC79840VVc;
import X.InterfaceC80161Vd7;
import X.InterfaceC80179VdP;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ALAdapterS5S0110000_14 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0110000_14 aLAdapterS5S0110000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (aLAdapterS5S0110000_14.z1) {
            RelativeLayout rlAlbumContainer = ((C83207Wl9) aLAdapterS5S0110000_14.l0).LJLLI;
            o.LJIIIIZZ(rlAlbumContainer, "rlAlbumContainer");
            rlAlbumContainer.setVisibility(8);
        } else {
            RelativeLayout rlCategoryContainer = ((C83207Wl9) aLAdapterS5S0110000_14.l0).LJLJL;
            o.LJIIIIZZ(rlCategoryContainer, "rlCategoryContainer");
            rlCategoryContainer.setVisibility(8);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0110000_14 aLAdapterS5S0110000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (aLAdapterS5S0110000_14.z1) {
            RelativeLayout rlAlbumContainer = ((C83210WlC) aLAdapterS5S0110000_14.l0).LJFF;
            o.LJIIIIZZ(rlAlbumContainer, "rlAlbumContainer");
            rlAlbumContainer.setVisibility(8);
        } else {
            RelativeLayout rlCategoryContainer = ((C83210WlC) aLAdapterS5S0110000_14.l0).LIZIZ;
            o.LJIIIIZZ(rlCategoryContainer, "rlCategoryContainer");
            rlCategoryContainer.setVisibility(8);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0110000_14 aLAdapterS5S0110000_14, Animator animation) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS5S0110000_14.z1 && (interfaceC65784Pro = ((C80001VaX) aLAdapterS5S0110000_14.l0).LJLJI) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0110000_14 aLAdapterS5S0110000_14, Animator animation) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS5S0110000_14.z1 && (interfaceC65784Pro = ((C80001VaX) aLAdapterS5S0110000_14.l0).LJLJI) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS5S0110000_14 aLAdapterS5S0110000_14, Animator animator) {
        ((C80164VdA) aLAdapterS5S0110000_14.l0).setStateDirectLoading(aLAdapterS5S0110000_14.z1);
    }

    public static final void onAnimationEnd$5(ALAdapterS5S0110000_14 aLAdapterS5S0110000_14, Animator animator) {
        ((C80164VdA) aLAdapterS5S0110000_14.l0).LLJLL = System.currentTimeMillis();
        ((C80164VdA) aLAdapterS5S0110000_14.l0).LJIILIIL(EnumC80174VdK.Refreshing);
        C80164VdA c80164VdA = (C80164VdA) aLAdapterS5S0110000_14.l0;
        InterfaceC79840VVc interfaceC79840VVc = c80164VdA.LLILZIL;
        if (interfaceC79840VVc != null) {
            if (aLAdapterS5S0110000_14.z1) {
                interfaceC79840VVc.LJIJJLI(c80164VdA);
            }
        } else if (c80164VdA.LLIZ == null) {
            c80164VdA.LJIIIIZZ(3000, true, Boolean.FALSE);
        }
        C80164VdA c80164VdA2 = (C80164VdA) aLAdapterS5S0110000_14.l0;
        InterfaceC80161Vd7 interfaceC80161Vd7 = c80164VdA2.LLJJJJ;
        if (interfaceC80161Vd7 != null) {
            int i = c80164VdA2.LLJILJILJ;
            interfaceC80161Vd7.LJJI(c80164VdA2, i, (int) (c80164VdA2.LLJJIJIIJIL * i));
        }
        C80164VdA c80164VdA3 = (C80164VdA) aLAdapterS5S0110000_14.l0;
        InterfaceC80179VdP interfaceC80179VdP = c80164VdA3.LLIZ;
        if (interfaceC80179VdP != null && (c80164VdA3.LLJJJJ instanceof InterfaceC80161Vd7)) {
            if (aLAdapterS5S0110000_14.z1) {
                interfaceC80179VdP.LJIJJLI(c80164VdA3);
            }
            ((C80164VdA) aLAdapterS5S0110000_14.l0).LLIZ.LJI();
        }
    }

    public ALAdapterS5S0110000_14(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
