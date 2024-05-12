package Y;

import X.C2U8;
import X.C53882LCs;
import X.C53883LCt;
import X.C53888LCy;
import X.C54112LLo;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56414MCc;
import X.C56892MUm;
import X.C57596Mj2;
import X.C62846OlW;
import X.InterfaceC65784Pro;
import X.LOS;
import X.LRV;
import X.LRX;
import X.LSY;
import X.LUF;
import X.SJI;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.CustomDotAbility;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.feed.platform.cell.clean.CellCleanComponent;
import com.ss.android.ugc.feed.platform.panel.clean.FeedCleanComponent;
import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ALAdapterS7S0100000_9 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$9(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationCancel$0(this, animator);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            case 18:
            default:
                super.onAnimationCancel(animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationCancel$1(this, animator);
                return;
            case 12:
                onAnimationCancel$2(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationCancel$3(this, animator);
                return;
            case 14:
                onAnimationCancel$4(this, animator);
                return;
            case 15:
                onAnimationCancel$5(this, animator);
                return;
            case 19:
                onAnimationCancel$6(this, animator);
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
            case 7:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 19:
            default:
                super.onAnimationEnd(animator);
                return;
            case 6:
                onAnimationEnd$5(this, animator);
                return;
            case 8:
                onAnimationEnd$6(this, animator);
                return;
            case 9:
                onAnimationEnd$7(this, animator);
                return;
            case 14:
                onAnimationEnd$8(this, animator);
                return;
            case 15:
                onAnimationEnd$9(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$10(this, animator);
                return;
            case 17:
                onAnimationEnd$11(this, animator);
                return;
            case 18:
                onAnimationEnd$12(this, animator);
                return;
            case 20:
                onAnimationEnd$13(this, animator);
                return;
            case 21:
                onAnimationEnd$14(this, animator);
                return;
            case 22:
                onAnimationEnd$15(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationRepeat$0(this, animator);
                return;
            default:
                super.onAnimationRepeat(animator);
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
            case 10:
                onAnimationStart$2(this, animator);
                return;
            case 14:
                onAnimationStart$3(this, animator);
                return;
            case 15:
                onAnimationStart$4(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS7S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((VideoMusicCoverAssem) aLAdapterS7S0100000_9.l0).A4();
    }

    public static final void onAnimationCancel$1(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        ((C56892MUm) aLAdapterS7S0100000_9.l0).LJI.cancel();
        ((C56892MUm) aLAdapterS7S0100000_9.l0).LIZJ = false;
    }

    public static final void onAnimationCancel$2(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ValueAnimator valueAnimator = ((C53882LCs) aLAdapterS7S0100000_9.l0).LJIIIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = ((C53882LCs) aLAdapterS7S0100000_9.l0).LJIIJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C53882LCs c53882LCs = (C53882LCs) aLAdapterS7S0100000_9.l0;
        c53882LCs.LJII = false;
        c53882LCs.LIZLLL = false;
    }

    public static final void onAnimationCancel$3(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ValueAnimator valueAnimator = ((C53883LCt) aLAdapterS7S0100000_9.l0).LJIILLIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = ((C53883LCt) aLAdapterS7S0100000_9.l0).LJIIZILJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C53883LCt c53883LCt = (C53883LCt) aLAdapterS7S0100000_9.l0;
        c53883LCt.LJI = false;
        c53883LCt.LJII = false;
    }

    public static final void onAnimationCancel$4(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        ((C56414MCc) aLAdapterS7S0100000_9.l0).setVisibility(8);
        Animator.AnimatorListener animatorListener = ((C56414MCc) aLAdapterS7S0100000_9.l0).LJLL;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$5(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        ((C56414MCc) aLAdapterS7S0100000_9.l0).setVisibility(8);
        Animator.AnimatorListener animatorListener = ((C56414MCc) aLAdapterS7S0100000_9.l0).LJLL;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$6(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        ValueAnimator valueAnimator = ((C53888LCy) aLAdapterS7S0100000_9.l0).LJIIJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = ((C53888LCy) aLAdapterS7S0100000_9.l0).LJIIJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C53888LCy c53888LCy = (C53888LCy) aLAdapterS7S0100000_9.l0;
        c53888LCy.LJ = false;
        c53888LCy.LIZLLL = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((InterfaceC65784Pro) aLAdapterS7S0100000_9.l0).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS7S0100000_9.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$10(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ScrollSwitchStateManager scrollSwitchStateManager = ((C57596Mj2) aLAdapterS7S0100000_9.l0).LJLLI;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.tv0(true);
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C54112LLo) aLAdapterS7S0100000_9.l0).LIZIZ(1.0f);
    }

    public static final void onAnimationEnd$12(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View view = ((LUF) aLAdapterS7S0100000_9.l0).LJIIIZ;
        if (view != null) {
            view.setScaleX(0.0f);
        }
        View view2 = ((LUF) aLAdapterS7S0100000_9.l0).LJIIIZ;
        if (view2 != null) {
            view2.setScaleY(0.0f);
        }
        View view3 = ((LUF) aLAdapterS7S0100000_9.l0).LJIIIIZZ;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        C62846OlW c62846OlW = ((LUF) aLAdapterS7S0100000_9.l0).LIZLLL;
        if (c62846OlW != null) {
            c62846OlW.setVisibility(0);
        }
        C62846OlW c62846OlW2 = ((LUF) aLAdapterS7S0100000_9.l0).LIZLLL;
        if (c62846OlW2 != null) {
            c62846OlW2.setScaleX(1.2f);
        }
        C62846OlW c62846OlW3 = ((LUF) aLAdapterS7S0100000_9.l0).LIZLLL;
        if (c62846OlW3 != null) {
            c62846OlW3.setScaleY(1.2f);
        }
        LUF luf = (LUF) aLAdapterS7S0100000_9.l0;
        C62846OlW c62846OlW4 = luf.LIZLLL;
        if (c62846OlW4 == null) {
            luf.getClass();
            return;
        }
        luf.LJI();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c62846OlW4, PropertyValuesHolder.ofFloat("scaleX", 1.2f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.2f, 1.0f));
        luf.LJI = ofPropertyValuesHolder;
        if (ofPropertyValuesHolder != null) {
            ofPropertyValuesHolder.setInterpolator(new SJI());
        }
        ObjectAnimator objectAnimator = luf.LJI;
        if (objectAnimator != null) {
            objectAnimator.setDuration(150L);
        }
        ObjectAnimator objectAnimator2 = luf.LJI;
        if (objectAnimator2 == null) {
            return;
        }
        objectAnimator2.start();
    }

    public static final void onAnimationEnd$13(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = ((FollowTabViewLifecycleObserver) aLAdapterS7S0100000_9.l0).LJLJL;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        TextView textView = ((FollowTabViewLifecycleObserver) aLAdapterS7S0100000_9.l0).LJLJJLL;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public static final void onAnimationEnd$14(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((LOS) aLAdapterS7S0100000_9.l0).LIZIZ();
    }

    public static final void onAnimationEnd$15(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        FeedCleanComponent feedCleanComponent = (FeedCleanComponent) aLAdapterS7S0100000_9.l0;
        feedCleanComponent.LJLJJLL = null;
        feedCleanComponent.LJLJL = false;
    }

    public static final void onAnimationEnd$2(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        super.onAnimationEnd(animator);
        AnimatorSet animatorSet = ((LSY) aLAdapterS7S0100000_9.l0).LJLILLLLZI;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        super.onAnimationEnd(animator);
        LSY lsy = (LSY) aLAdapterS7S0100000_9.l0;
        if (lsy.LJLILLLLZI != null) {
            lsy.LJLIL.start();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((EdgeSlideGuideAssem) aLAdapterS7S0100000_9.l0).H3();
    }

    public static final void onAnimationEnd$5(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((CellCleanComponent) aLAdapterS7S0100000_9.l0).LLFF = null;
    }

    public static final void onAnimationEnd$6(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((LRV) aLAdapterS7S0100000_9.l0).LIZ();
        C2U8.LIZ(new LRX(1));
        ViewGroup viewGroup = ((LRV) aLAdapterS7S0100000_9.l0).LJIIIIZZ;
        if (viewGroup != null) {
            CustomDotAbility customDotAbility = (CustomDotAbility) C55096Ljo.LIZ(C55230Lly.LJ(viewGroup), CustomDotAbility.class, null);
            if (customDotAbility != null) {
                customDotAbility.XH();
                return;
            }
            return;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public static final void onAnimationEnd$7(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((LRV) aLAdapterS7S0100000_9.l0).LIZ();
        C2U8.LIZ(new LRX(1));
        ViewGroup viewGroup = ((LRV) aLAdapterS7S0100000_9.l0).LJIIIIZZ;
        if (viewGroup != null) {
            CustomDotAbility customDotAbility = (CustomDotAbility) C55096Ljo.LIZ(C55230Lly.LJ(viewGroup), CustomDotAbility.class, null);
            if (customDotAbility != null) {
                customDotAbility.XH();
                return;
            }
            return;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public static final void onAnimationEnd$8(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        ((C56414MCc) aLAdapterS7S0100000_9.l0).setVisibility(8);
        Animator.AnimatorListener animatorListener = ((C56414MCc) aLAdapterS7S0100000_9.l0).LJLL;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    public static final void onAnimationRepeat$0(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        C56892MUm c56892MUm = (C56892MUm) aLAdapterS7S0100000_9.l0;
        c56892MUm.LIZLLL = (c56892MUm.LIZLLL + 1) % 5;
    }

    public static final void onAnimationStart$0(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        super.onAnimationStart(animator);
        ((LSY) aLAdapterS7S0100000_9.l0).LJLJI.LJLLJ.start();
    }

    public static final void onAnimationStart$1(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = ((LRV) aLAdapterS7S0100000_9.l0).LJIIIIZZ;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            C2U8.LIZ(new LRX(0));
            ViewGroup viewGroup2 = ((LRV) aLAdapterS7S0100000_9.l0).LJIIIIZZ;
            if (viewGroup2 != null) {
                CustomDotAbility customDotAbility = (CustomDotAbility) C55096Ljo.LIZ(C55230Lly.LJ(viewGroup2), CustomDotAbility.class, null);
                if (customDotAbility != null) {
                    customDotAbility.XH();
                    return;
                }
                return;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public static final void onAnimationStart$2(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = ((LRV) aLAdapterS7S0100000_9.l0).LJIIIIZZ;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            C2U8.LIZ(new LRX(0));
            ViewGroup viewGroup2 = ((LRV) aLAdapterS7S0100000_9.l0).LJIIIIZZ;
            if (viewGroup2 != null) {
                CustomDotAbility customDotAbility = (CustomDotAbility) C55096Ljo.LIZ(C55230Lly.LJ(viewGroup2), CustomDotAbility.class, null);
                if (customDotAbility != null) {
                    customDotAbility.XH();
                    return;
                }
                return;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public static final void onAnimationStart$3(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        ((C56414MCc) aLAdapterS7S0100000_9.l0).setVisibility(0);
        Animator.AnimatorListener animatorListener = ((C56414MCc) aLAdapterS7S0100000_9.l0).LJLL;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS7S0100000_9 aLAdapterS7S0100000_9, Animator animator) {
        ((C56414MCc) aLAdapterS7S0100000_9.l0).setVisibility(0);
        Animator.AnimatorListener animatorListener = ((C56414MCc) aLAdapterS7S0100000_9.l0).LJLL;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
