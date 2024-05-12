package Y;

import X.AbstractC156316Bn;
import X.AbstractC156406Bw;
import X.AnonymousClass523;
import X.AnonymousClass525;
import X.AnonymousClass585;
import X.C127834zz;
import X.C1297357h;
import X.C1297457i;
import X.C1303859u;
import X.C140325f2;
import X.C140355f5;
import X.C158326Jg;
import X.C158396Jn;
import X.C16880lQ;
import X.C29701Eo;
import X.C50Q;
import X.C58D;
import X.C58Q;
import X.C59L;
import X.C5WY;
import X.C60V;
import X.C61C;
import X.C76800UCe;
import X.C8H9;
import X.InterfaceC65784Pro;
import X.ViewOnClickListenerC158316Jf;
import X.XJL;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;
import java.util.Iterator;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ALAdapterS1S0200000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                return;
            case 2:
                onAnimationCancel$1(this, animator);
                return;
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            default:
                super.onAnimationCancel(animator);
                return;
            case 6:
                onAnimationCancel$2(this, animator);
                return;
            case 7:
                onAnimationCancel$3(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationCancel$4(this, animator);
                return;
            case 14:
                onAnimationCancel$5(this, animator);
                return;
            case 15:
                onAnimationCancel$6(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationCancel$7(this, animator);
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
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
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
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$11(this, animator);
                return;
            case 12:
                onAnimationEnd$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$13(this, animator);
                return;
            case 14:
                onAnimationEnd$14(this, animator);
                return;
            case 15:
                onAnimationEnd$15(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$16(this, animator);
                return;
            case 17:
                onAnimationEnd$17(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                return;
            case 7:
                onAnimationStart$1(this, animator);
                return;
            case 9:
                onAnimationStart$2(this, animator);
                return;
            case 14:
                onAnimationStart$3(this, animator);
                return;
            case 15:
                onAnimationStart$4(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                super.onAnimationStart(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS1S0200000_2(View view, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = null;
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C61C) aLAdapterS1S0200000_2.l1).LJIIIIZZ = false;
    }

    public static final void onAnimationCancel$1(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C61C) aLAdapterS1S0200000_2.l1).LJIIIIZZ = true;
    }

    public static final void onAnimationCancel$2(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C60V) aLAdapterS1S0200000_2.l1).LJIIL = false;
    }

    public static final void onAnimationCancel$3(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C60V) aLAdapterS1S0200000_2.l1).LJIIL = true;
    }

    public static final void onAnimationCancel$4(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS1S0200000_2.l0).removeAnimatorListener(aLAdapterS1S0200000_2);
        C16880lQ.LJLZ((C29701Eo) aLAdapterS1S0200000_2.l0, (ConstraintLayout) aLAdapterS1S0200000_2.l1);
    }

    public static final void onAnimationCancel$5(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        C50Q funcBarController;
        AnonymousClass525 LJI;
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS1S0200000_2.l1).removeAnimatorListener(aLAdapterS1S0200000_2);
        ((AnonymousClass585) aLAdapterS1S0200000_2.l0).LJIILL();
        AnonymousClass523 LIZ = ((AnonymousClass585) aLAdapterS1S0200000_2.l0).LJIILJJIL().LIZ();
        ((AnonymousClass585) aLAdapterS1S0200000_2.l0).getClass();
        IFunctionBarService LIZ2 = C127834zz.LIZ();
        if (LIZ2 != null && (funcBarController = LIZ2.getFuncBarController()) != null && (LJI = funcBarController.LJI()) != null) {
            LJI.LJIIJJI(LIZ);
        }
    }

    public static final void onAnimationCancel$6(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animator) {
        super.onAnimationCancel(animator);
        C5WY c5wy = (C5WY) aLAdapterS1S0200000_2.l1;
        ImageView imageView = (ImageView) aLAdapterS1S0200000_2.l0;
        c5wy.getClass();
        c5wy.post(new ARunnableS11S0201000_8(1, c5wy, imageView, 3));
    }

    public static final void onAnimationCancel$7(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animator) {
        super.onAnimationCancel(animator);
        C5WY c5wy = (C5WY) aLAdapterS1S0200000_2.l1;
        ImageView imageView = (ImageView) aLAdapterS1S0200000_2.l0;
        c5wy.getClass();
        c5wy.post(new ARunnableS11S0201000_8(1, c5wy, imageView, 3));
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC156316Bn.LIZ((AbstractC156316Bn) aLAdapterS1S0200000_2.l0, (AbstractC156406Bw) aLAdapterS1S0200000_2.l1);
        ((AbstractC156316Bn) aLAdapterS1S0200000_2.l0).setMIsEditing(false);
        ((AbstractC156316Bn) aLAdapterS1S0200000_2.l0).setMIsDismissing(false);
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((LinearLayout) aLAdapterS1S0200000_2.l0).setVisibility(8);
        ((C61C) aLAdapterS1S0200000_2.l1).LJIIIIZZ = true;
    }

    public static final void onAnimationEnd$10(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Iterator<C59L> it = ((C1297357h) aLAdapterS1S0200000_2.l0).LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
        ((C1297457i) aLAdapterS1S0200000_2.l1).LIZ.bringToFront();
    }

    public static final void onAnimationEnd$11(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS1S0200000_2.l0).removeAnimatorListener(aLAdapterS1S0200000_2);
        C16880lQ.LJLZ((C29701Eo) aLAdapterS1S0200000_2.l0, (ConstraintLayout) aLAdapterS1S0200000_2.l1);
    }

    public static final void onAnimationEnd$12(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animator) {
        ((View) aLAdapterS1S0200000_2.l0).setVisibility(8);
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aLAdapterS1S0200000_2.l1;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$13(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animator) {
        ((View) aLAdapterS1S0200000_2.l0).setVisibility(8);
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aLAdapterS1S0200000_2.l1;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$14(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        C50Q funcBarController;
        AnonymousClass525 LJI;
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS1S0200000_2.l1).removeAnimatorListener(aLAdapterS1S0200000_2);
        ((AnonymousClass585) aLAdapterS1S0200000_2.l0).LJIILL();
        AnonymousClass523 LIZ = ((AnonymousClass585) aLAdapterS1S0200000_2.l0).LJIILJJIL().LIZ();
        ((AnonymousClass585) aLAdapterS1S0200000_2.l0).getClass();
        IFunctionBarService LIZ2 = C127834zz.LIZ();
        if (LIZ2 != null && (funcBarController = LIZ2.getFuncBarController()) != null && (LJI = funcBarController.LJI()) != null) {
            LJI.LJIIJJI(LIZ);
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animator) {
        super.onAnimationEnd(animator);
        C5WY c5wy = (C5WY) aLAdapterS1S0200000_2.l1;
        ImageView imageView = (ImageView) aLAdapterS1S0200000_2.l0;
        c5wy.getClass();
        c5wy.post(new ARunnableS11S0201000_8(1, c5wy, imageView, 3));
    }

    public static final void onAnimationEnd$16(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animator) {
        super.onAnimationEnd(animator);
        ((ImageView) aLAdapterS1S0200000_2.l0).setAlpha(0.0f);
        ((ImageView) aLAdapterS1S0200000_2.l0).setTranslationX(0.0f);
        ((ImageView) aLAdapterS1S0200000_2.l0).setTranslationY(0.0f);
        C5WY c5wy = (C5WY) aLAdapterS1S0200000_2.l1;
        ImageView imageView = (ImageView) aLAdapterS1S0200000_2.l0;
        c5wy.getClass();
        c5wy.post(new ARunnableS11S0201000_8(1, c5wy, imageView, 3));
    }

    public static final void onAnimationEnd$17(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C158326Jg mChild = ((ViewOnClickListenerC158316Jf) aLAdapterS1S0200000_2.l0).getMChild();
        if (mChild != null) {
            C158396Jn c158396Jn = mChild.LJLJI;
            if (c158396Jn != null) {
                c158396Jn.setVisibility(0);
            } else {
                o.LJIJI("edLiveTitle");
                throw null;
            }
        }
        C158326Jg mChild2 = ((ViewOnClickListenerC158316Jf) aLAdapterS1S0200000_2.l0).getMChild();
        if (mChild2 != null) {
            mChild2.LIZLLL();
        }
        ((ViewOnClickListenerC158316Jf) aLAdapterS1S0200000_2.l0).LIZJ((C158326Jg) aLAdapterS1S0200000_2.l1);
        C8H9 c8h9 = ((ViewOnClickListenerC158316Jf) aLAdapterS1S0200000_2.l0).LJLJI;
        if (c8h9 != null) {
            c8h9.setVisibility(0);
            ((ViewOnClickListenerC158316Jf) aLAdapterS1S0200000_2.l0).LIZ(0);
            ((ViewOnClickListenerC158316Jf) aLAdapterS1S0200000_2.l0).LJLJL = false;
            return;
        }
        o.LJIJI("liveCDHint");
        throw null;
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C61C) aLAdapterS1S0200000_2.l1).LJIIIIZZ = false;
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS1S0200000_2.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((View) aLAdapterS1S0200000_2.l1).setAlpha(1.0f);
    }

    public static final void onAnimationEnd$4(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((InterfaceC65784Pro) aLAdapterS1S0200000_2.l0).invoke();
        ((View) aLAdapterS1S0200000_2.l1).setAlpha(1.0f);
    }

    public static final void onAnimationEnd$5(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((XJL) aLAdapterS1S0200000_2.l0).LJJIIZ(C76800UCe.LIZ, new AqS168S0100000_2((ValueAnimator) aLAdapterS1S0200000_2.l1, 85));
    }

    public static final void onAnimationEnd$6(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((LinearLayout) aLAdapterS1S0200000_2.l0).setVisibility(8);
        ((C60V) aLAdapterS1S0200000_2.l1).LJIIL = true;
    }

    public static final void onAnimationEnd$7(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C60V) aLAdapterS1S0200000_2.l1).LJIIL = false;
    }

    public static final void onAnimationEnd$8(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C140355f5) aLAdapterS1S0200000_2.l0).LIZIZ.invoke();
        ((C140325f2) aLAdapterS1S0200000_2.l1).LJIIIIZZ = null;
    }

    public static final void onAnimationEnd$9(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C1303859u) aLAdapterS1S0200000_2.l0).LJ().setTranslationY(0.0f);
        ((C1303859u) aLAdapterS1S0200000_2.l0).LJ().setScaleY(1.0f);
        C58Q innerListener = ((C58D) aLAdapterS1S0200000_2.l1).getInnerListener();
        if (innerListener != null) {
            innerListener.LIZLLL();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) aLAdapterS1S0200000_2.l0).getLayoutParams();
        layoutParams.height = 0;
        ((LinearLayout) aLAdapterS1S0200000_2.l0).setLayoutParams(layoutParams);
        ((LinearLayout) aLAdapterS1S0200000_2.l0).setVisibility(0);
    }

    public static final void onAnimationStart$1(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) aLAdapterS1S0200000_2.l0).getLayoutParams();
        layoutParams.height = 0;
        ((LinearLayout) aLAdapterS1S0200000_2.l0).setLayoutParams(layoutParams);
        ((LinearLayout) aLAdapterS1S0200000_2.l0).setVisibility(0);
    }

    public static final void onAnimationStart$2(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C1303859u) aLAdapterS1S0200000_2.l0).LJLLILLLL.setVisibility(8);
        ((C1303859u) aLAdapterS1S0200000_2.l0).LJLLJ.setVisibility(8);
    }

    public static final void onAnimationStart$3(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnonymousClass585) aLAdapterS1S0200000_2.l0).LJLJL.storeBoolean("editor_pro_magic_guide_init", true);
        ((AnonymousClass585) aLAdapterS1S0200000_2.l0).LJLJLJ = true;
    }

    public static final void onAnimationStart$4(ALAdapterS1S0200000_2 aLAdapterS1S0200000_2, Animator animator) {
        super.onAnimationStart(animator);
        ((ImageView) aLAdapterS1S0200000_2.l0).setAlpha(1.0f);
        ((ImageView) aLAdapterS1S0200000_2.l0).setScaleX(2.56f);
        ((ImageView) aLAdapterS1S0200000_2.l0).setScaleY(2.56f);
        ((ImageView) aLAdapterS1S0200000_2.l0).setTranslationX(0.0f);
        ((ImageView) aLAdapterS1S0200000_2.l0).setTranslationY(0.0f);
    }

    public ALAdapterS1S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
