package Y;

import X.C29306Beo;
import X.C86165Xrl;
import X.C86652Xzc;
import X.InterfaceC87276YNc;
import X.X6C;
import X.Y00;
import X.Y0S;
import X.Y90;
import X.YNZ;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDAListenerS82S0100000_15 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$0(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
    }

    public static final void onAnimationCancel$1(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
    }

    public static final void onAnimationRepeat$0(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "p0");
                return;
            case 3:
                o.LJIIIZ(animator, "p0");
                return;
            case 4:
                o.LJIIIZ(animator, "p0");
                return;
            case 5:
                o.LJIIIZ(animator, "p0");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                o.LJIIIZ(animator, "animator");
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
                return;
            case 9:
                o.LJIIIZ(animator, "animation");
                return;
            case 10:
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
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                o.LJIIIZ(animator, "animator");
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                onAnimationEnd$9(this, animator);
                return;
            case 10:
                onAnimationEnd$10(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                return;
            case 1:
                onAnimationRepeat$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "p0");
                return;
            case 3:
                o.LJIIIZ(animator, "p0");
                return;
            case 4:
                o.LJIIIZ(animator, "p0");
                return;
            case 5:
                o.LJIIIZ(animator, "p0");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                o.LJIIIZ(animator, "animator");
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
                return;
            case 9:
                o.LJIIIZ(animator, "animation");
                return;
            case 10:
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
                o.LJIIIZ(animator, "p0");
                return;
            case 3:
                o.LJIIIZ(animator, "p0");
                return;
            case 4:
                o.LJIIIZ(animator, "p0");
                return;
            case 5:
                onAnimationStart$5(this, animator);
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                onAnimationStart$7(this, animator);
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
                return;
            case 9:
                onAnimationStart$9(this, animator);
                return;
            case 10:
                onAnimationStart$10(this, animator);
                return;
            default:
                return;
        }
    }

    public IDAListenerS82S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
        ((Y90) iDAListenerS82S0100000_15.l0).LJLJI = false;
    }

    public static final void onAnimationEnd$1(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
        Y90 y90 = (Y90) iDAListenerS82S0100000_15.l0;
        y90.LJLJJI = false;
        y90.LJLILLLLZI.setTranslationX(0.0f);
    }

    public static final void onAnimationEnd$10(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animation) {
        View childAt;
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = ((YNZ) iDAListenerS82S0100000_15.l0).LJLLILLLL;
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            childAt.setVisibility(8);
        }
        YNZ ynz = (YNZ) iDAListenerS82S0100000_15.l0;
        if (ynz.LJLJI != null) {
            ynz.LJLJI = Boolean.valueOf(!r0.booleanValue());
        }
        YNZ ynz2 = (YNZ) iDAListenerS82S0100000_15.l0;
        ViewGroup viewGroup2 = ynz2.LJLLI;
        ynz2.LJLLI = ynz2.LJLLILLLL;
        ynz2.LJLLILLLL = viewGroup2;
        if (o.LJ(ynz2.LJLJI, Boolean.TRUE)) {
            InterfaceC87276YNc interfaceC87276YNc = ((YNZ) iDAListenerS82S0100000_15.l0).LJLILLLLZI;
            if (interfaceC87276YNc != null) {
                interfaceC87276YNc.LJ();
                return;
            }
            return;
        }
        InterfaceC87276YNc interfaceC87276YNc2 = ((YNZ) iDAListenerS82S0100000_15.l0).LJLIL;
        if (interfaceC87276YNc2 == null) {
            return;
        }
        interfaceC87276YNc2.LJ();
    }

    public static final void onAnimationEnd$2(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C86652Xzc) iDAListenerS82S0100000_15.l0).LJLJJI = null;
    }

    public static final void onAnimationEnd$3(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((Y0S) iDAListenerS82S0100000_15.l0).LIZJ = null;
    }

    public static final void onAnimationEnd$4(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((Y00) iDAListenerS82S0100000_15.l0).setValueAnimator(null);
        ((Y00) iDAListenerS82S0100000_15.l0).LIZ(R.id.c4m).setAlpha(1.0f);
        ((Y00) iDAListenerS82S0100000_15.l0).setToastStatus(X6C.NONE);
        Y00 y00 = (Y00) iDAListenerS82S0100000_15.l0;
        y00.setState(y00.getState());
    }

    public static final void onAnimationEnd$5(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator p0) {
        o.LJIIIZ(p0, "p0");
        TuxIconView tuxIconView = ((FeedCaptionView) iDAListenerS82S0100000_15.l0).LLIIII;
        if (tuxIconView != null) {
            tuxIconView.getAlpha();
        }
        ((FeedCaptionView) iDAListenerS82S0100000_15.l0).LLIILII = null;
    }

    public static final void onAnimationEnd$6(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C29306Beo.LJI((View) iDAListenerS82S0100000_15.l0);
    }

    public static final void onAnimationEnd$8(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJII.setVisibility(0);
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJIILL.setVisibility(0);
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJIJ.setVisibility(0);
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJIJI.setVisibility(0);
    }

    public static final void onAnimationEnd$9(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJII.setVisibility(8);
    }

    public static final void onAnimationStart$0(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
        ((Y90) iDAListenerS82S0100000_15.l0).LJLJI = true;
    }

    public static final void onAnimationStart$1(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
        ((Y90) iDAListenerS82S0100000_15.l0).LJLJJI = true;
    }

    public static final void onAnimationStart$10(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animation) {
        View childAt;
        View childAt2;
        View childAt3;
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = ((YNZ) iDAListenerS82S0100000_15.l0).LJLLI;
        if (viewGroup != null && (childAt3 = viewGroup.getChildAt(1)) != null) {
            childAt3.setVisibility(8);
        }
        ViewGroup viewGroup2 = ((YNZ) iDAListenerS82S0100000_15.l0).LJLLI;
        if (viewGroup2 != null && (childAt2 = viewGroup2.getChildAt(0)) != null) {
            childAt2.setVisibility(0);
        }
        ViewGroup viewGroup3 = ((YNZ) iDAListenerS82S0100000_15.l0).LJLLILLLL;
        if (viewGroup3 == null || (childAt = viewGroup3.getChildAt(1)) == null) {
            return;
        }
        childAt.setVisibility(0);
    }

    public static final void onAnimationStart$5(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator p0) {
        o.LJIIIZ(p0, "p0");
        TuxIconView tuxIconView = ((FeedCaptionView) iDAListenerS82S0100000_15.l0).LLIIII;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setAlpha(1.0f);
    }

    public static final void onAnimationStart$7(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C29306Beo.LJJLJLI((View) iDAListenerS82S0100000_15.l0);
    }

    public static final void onAnimationStart$9(IDAListenerS82S0100000_15 iDAListenerS82S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJIILL.setVisibility(8);
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJIJ.setVisibility(8);
        ((C86165Xrl) iDAListenerS82S0100000_15.l0).LJIJI.setVisibility(8);
    }
}
