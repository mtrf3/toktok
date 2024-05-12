package Y;

import X.C52308Kfw;
import X.C7MY;
import X.InterfaceC65784Pro;
import X.L5P;
import X.L5Y;
import X.LB9;
import android.animation.Animator;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionAssemV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDAListenerS40S0200000_9 implements Animator.AnimatorListener {
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
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
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
                onAnimationRepeat$2(this, animator);
                return;
            case 3:
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
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$2(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) iDAListenerS40S0200000_9.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animation);
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().getLayoutParams().height = C7MY.LIZIZ(40);
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().setAlpha(1.0f);
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).K3().setVisibility(0);
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().requestLayout();
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().postDelayed(new ARunnableS45S0100000_9((InterfaceC65784Pro) iDAListenerS40S0200000_9.l1, 92), 100L);
    }

    public static final void onAnimationEnd$1(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().getLayoutParams().height = C7MY.LIZIZ(40);
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().setAlpha(1.0f);
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0)._$_findCachedViewById(R.id.iol).setVisibility(0);
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().requestLayout();
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().postDelayed(new ARunnableS45S0100000_9((InterfaceC65784Pro) iDAListenerS40S0200000_9.l1, 94), 100L);
    }

    public static final void onAnimationEnd$2(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) iDAListenerS40S0200000_9.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
        L5Y LJI = ((L5P) iDAListenerS40S0200000_9.l1).LJI();
        if (LJI != null) {
            LJI.setCanDrawRing(true);
            LJI.invalidate();
        }
    }

    public static final void onAnimationEnd$3(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animation) {
        TuxIconView tuxIconView;
        o.LJIIIZ(animation, "animation");
        ((LB9) iDAListenerS40S0200000_9.l1).LIZ.LIZIZ();
        if (C52308Kfw.LIZ() && (tuxIconView = (TuxIconView) iDAListenerS40S0200000_9.l0) != null) {
            tuxIconView.setIconWidth(LB9.LIZLLL);
        }
    }

    public static final void onAnimationRepeat$2(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) iDAListenerS40S0200000_9.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animation);
        }
    }

    public static final void onAnimationStart$0(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().getLayoutParams().height = 0;
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().setAlpha(0.0f);
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().setVisibility(0);
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).K3().setVisibility(8);
        ((PoiPublishExtensionAssem) iDAListenerS40S0200000_9.l0).H3().requestLayout();
    }

    public static final void onAnimationStart$1(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().getLayoutParams().height = 0;
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().setAlpha(0.0f);
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().setVisibility(0);
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0)._$_findCachedViewById(R.id.iol).setVisibility(4);
        ((PoiPublishExtensionAssemV2) iDAListenerS40S0200000_9.l0).F3().requestLayout();
    }

    public static final void onAnimationStart$2(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) iDAListenerS40S0200000_9.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation);
        }
        L5Y LJI = ((L5P) iDAListenerS40S0200000_9.l1).LJI();
        if (LJI != null) {
            LJI.setCanDrawRing(false);
            LJI.invalidate();
        }
    }

    public static final void onAnimationStart$3(IDAListenerS40S0200000_9 iDAListenerS40S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxIconView tuxIconView = (TuxIconView) iDAListenerS40S0200000_9.l0;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setVisibility(0);
    }

    public IDAListenerS40S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
