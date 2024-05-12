package Y;

import X.C04330Ez;
import X.C2U8;
import X.C53379KxD;
import X.C62846OlW;
import X.C72197SVd;
import X.C79377VDh;
import X.C80648Vky;
import X.C84995XXj;
import X.C86652Xzc;
import X.C87102YGk;
import X.C87107YGp;
import X.C87238YLq;
import X.C89953fz;
import X.InterfaceC86653Xzd;
import X.KL2;
import X.XVK;
import X.XW8;
import X.XXG;
import X.XYR;
import X.Y45;
import X.YBU;
import X.YS3;
import X.YS4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem;
import com.ss.android.ugc.aweme.setting.ui.SettingItemHighlightHelper;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;
import com.ss.android.videoshop.context.VideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ALAdapterS12S0100000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                return;
            case 8:
                onAnimationCancel$1(this, animator);
                return;
            case 9:
                onAnimationCancel$2(this, animator);
                return;
            case 10:
                onAnimationCancel$3(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationCancel$4(this, animator);
                return;
            case 20:
                onAnimationCancel$5(this, animator);
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
            case 21:
            default:
                super.onAnimationEnd(animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$10(this, animator);
                return;
            case 12:
                onAnimationEnd$11(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$12(this, animator);
                return;
            case 14:
                onAnimationEnd$13(this, animator);
                return;
            case 15:
                onAnimationEnd$14(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$15(this, animator);
                return;
            case 17:
                onAnimationEnd$16(this, animator);
                return;
            case 18:
                onAnimationEnd$17(this, animator);
                return;
            case 19:
                onAnimationEnd$18(this, animator);
                return;
            case 20:
                onAnimationEnd$19(this, animator);
                return;
            case 22:
                onAnimationEnd$20(this, animator);
                return;
            case 23:
                onAnimationEnd$21(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        switch (this.$t) {
            case 21:
                onAnimationPause$0(this, animator);
                return;
            default:
                super.onAnimationPause(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationStart$0(this, animator);
                return;
            case 4:
                onAnimationStart$1(this, animator);
                return;
            case 8:
                onAnimationStart$2(this, animator);
                return;
            case 10:
                onAnimationStart$3(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationStart$4(this, animator);
                return;
            case 14:
                onAnimationStart$5(this, animator);
                return;
            case 15:
                onAnimationStart$6(this, animator);
                return;
            case 20:
                onAnimationStart$7(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS12S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C87107YGp) aLAdapterS12S0100000_15.l0).LIZ.LIZIZ(1);
    }

    public static final void onAnimationCancel$1(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        C80648Vky c80648Vky = ((AwemePagerAssem) aLAdapterS12S0100000_15.l0).LJLJJL;
        if (c80648Vky != null) {
            c80648Vky.setDisallowActionDown(false);
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SettingItemHighlightHelper settingItemHighlightHelper = (SettingItemHighlightHelper) aLAdapterS12S0100000_15.l0;
        settingItemHighlightHelper.LJLJI.LJIIJJI(C89953fz.LIZ(settingItemHighlightHelper.LJLIL));
    }

    public static final void onAnimationCancel$3(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SettingItemHighlightHelper settingItemHighlightHelper = (SettingItemHighlightHelper) aLAdapterS12S0100000_15.l0;
        settingItemHighlightHelper.LJLJI.LJIIJJI(C89953fz.LIZ(settingItemHighlightHelper.LJLIL));
    }

    public static final void onAnimationCancel$4(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        C80648Vky c80648Vky = ((AwemePagerAssemV2) aLAdapterS12S0100000_15.l0).LJLJL;
        if (c80648Vky != null) {
            c80648Vky.setDisallowActionDown(false);
        }
    }

    public static final void onAnimationCancel$5(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C86652Xzc) aLAdapterS12S0100000_15.l0).LIZ(R.id.b5f).setClickable(((C86652Xzc) aLAdapterS12S0100000_15.l0).LJLJJL);
    }

    public static final void onAnimationEnd$0(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animator) {
        super.onAnimationEnd(animator);
        AvatarCutActivity avatarCutActivity = (AvatarCutActivity) aLAdapterS12S0100000_15.l0;
        int i = avatarCutActivity.LLIIIJ + 90;
        avatarCutActivity.LLIIIJ = i;
        if (i >= 360) {
            avatarCutActivity.LLIIIJ = 0;
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C87107YGp) aLAdapterS12S0100000_15.l0).LIZ.LIZIZ(0);
    }

    public static final void onAnimationEnd$10(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        AwemePagerAssemV2 awemePagerAssemV2 = (AwemePagerAssemV2) aLAdapterS12S0100000_15.l0;
        awemePagerAssemV2.LLFII = false;
        awemePagerAssemV2.LLFFF = 0.0f;
        C80648Vky c80648Vky = awemePagerAssemV2.LJLJL;
        if (c80648Vky != null) {
            c80648Vky.setDisallowActionDown(false);
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        YS3 ys3 = ((VideoContext) aLAdapterS12S0100000_15.l0).layerHostMediaLayout;
        if (ys3 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ys3.getLayoutParams()) != null) {
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            ys3.setLayoutParams(marginLayoutParams);
        }
        ((VideoContext) aLAdapterS12S0100000_15.l0).fullScreenOperator.setVideoScreenState(2);
        ((VideoContext) aLAdapterS12S0100000_15.l0).notifyEvent(new C79377VDh(312));
    }

    public static final void onAnimationEnd$12(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animator) {
        KL2.LIZIZ(((VideoContext) aLAdapterS12S0100000_15.l0).layerHostMediaLayout);
        VideoContext videoContext = (VideoContext) aLAdapterS12S0100000_15.l0;
        YS4 ys4 = videoContext.simpleMediaView;
        if (ys4 != null) {
            ys4.LIZ(videoContext.layerHostMediaLayout);
        }
        ((VideoContext) aLAdapterS12S0100000_15.l0).fullScreenOperator.exitFullScreenMode();
        ((VideoContext) aLAdapterS12S0100000_15.l0).fullScreenOperator.setVideoScreenState(0);
        ((VideoContext) aLAdapterS12S0100000_15.l0).notifyEvent(new C79377VDh(312));
        YS3 ys3 = ((VideoContext) aLAdapterS12S0100000_15.l0).layerHostMediaLayout;
        if (ys3 != null) {
            ys3.post(new ARunnableS51S0100000_15(aLAdapterS12S0100000_15, 58));
        }
        ((VideoContext) aLAdapterS12S0100000_15.l0).dismissSurfaceCoverFrameIfUseSurfaceView(true);
    }

    public static final void onAnimationEnd$13(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        RelativeLayout relativeLayout = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        RelativeLayout relativeLayout2 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout2 != null) {
            relativeLayout2.setAlpha(1.0f);
        }
        RelativeLayout relativeLayout3 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJL;
        if (relativeLayout3 == null) {
            return;
        }
        relativeLayout3.setVisibility(8);
    }

    public static final void onAnimationEnd$14(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        RelativeLayout relativeLayout = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout2 != null) {
            relativeLayout2.setAlpha(0.0f);
        }
        RelativeLayout relativeLayout3 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJL;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(0);
        }
        RelativeLayout relativeLayout4 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJL;
        if (relativeLayout4 == null) {
            return;
        }
        relativeLayout4.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$15(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C87238YLq) aLAdapterS12S0100000_15.l0).LIZLLL.invoke();
    }

    public static final void onAnimationEnd$16(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C87238YLq) aLAdapterS12S0100000_15.l0).LIZJ.invoke();
    }

    public static final void onAnimationEnd$17(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((Y45) aLAdapterS12S0100000_15.l0).hd(0);
    }

    public static final void onAnimationEnd$18(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((Y45) aLAdapterS12S0100000_15.l0).hd(1);
    }

    public static final void onAnimationEnd$19(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C86652Xzc) aLAdapterS12S0100000_15.l0).LIZ(R.id.b5f).setClickable(((C86652Xzc) aLAdapterS12S0100000_15.l0).LJLJJL);
        InterfaceC86653Xzd delegate = ((C86652Xzc) aLAdapterS12S0100000_15.l0).getDelegate();
        if (delegate != null) {
            delegate.LIZLLL();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C87102YGk) aLAdapterS12S0100000_15.l0).LJII();
    }

    public static final void onAnimationEnd$20(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        XVK xvk = (XVK) aLAdapterS12S0100000_15.l0;
        if (xvk != null) {
            XXG xxg = ((XYR) xvk).LIZ;
            xxg.getClass();
            C2U8.LIZ(new C72197SVd(xxg.LLFII, xxg.LLF ? 1 : 0));
        }
    }

    public static final void onAnimationEnd$21(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C84995XXj c84995XXj = (C84995XXj) aLAdapterS12S0100000_15.l0;
        C62846OlW c62846OlW = c84995XXj.LJLJI;
        C62846OlW c62846OlW2 = c84995XXj.LJLILLLLZI;
        c84995XXj.LJLJI = c62846OlW2;
        c84995XXj.LJLILLLLZI = c62846OlW;
        c84995XXj.P(c62846OlW2, c84995XXj.LJZ + 1);
    }

    public static final void onAnimationEnd$3(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animator) {
        super.onAnimationEnd(animator);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setVisibility(0);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setAlpha(1.0f);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLJJL.setVisibility(8);
    }

    public static final void onAnimationEnd$4(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animator) {
        super.onAnimationEnd(animator);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setVisibility(8);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setAlpha(0.0f);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLJJL.setVisibility(0);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLJJL.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$5(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View view = ((FeedCaptionView) aLAdapterS12S0100000_15.l0).LLIIIJ;
        if (view != null) {
            view.setVisibility(8);
        }
        ((FeedCaptionView) aLAdapterS12S0100000_15.l0).LJLLLLLL = 2;
    }

    public static final void onAnimationEnd$6(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        TuxIconView tuxIconView;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        TuxTextView tuxTextView = ((FeedCaptionView) aLAdapterS12S0100000_15.l0).LLIFFJFJJ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        ((FeedCaptionView) aLAdapterS12S0100000_15.l0).LJLLLLLL = 0;
        if (C53379KxD.LIZ()) {
            FeedCaptionView feedCaptionView = (FeedCaptionView) aLAdapterS12S0100000_15.l0;
            feedCaptionView.getClass();
            if (C53379KxD.LIZ() && (tuxIconView = feedCaptionView.LLIIII) != null && tuxIconView.getVisibility() == 0) {
                TuxIconView tuxIconView2 = feedCaptionView.LLIIII;
                if (tuxIconView2 != null) {
                    tuxIconView2.setAlpha(1.0f);
                }
                ObjectAnimator objectAnimator = feedCaptionView.LLIILII;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                TuxIconView tuxIconView3 = feedCaptionView.LLIIII;
                o.LJI(tuxIconView3);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView3, "alpha", feedCaptionView.LLIL);
                ofFloat.setDuration(feedCaptionView.LLIILZL);
                ofFloat.setStartDelay(feedCaptionView.LLIIZ);
                ofFloat.addListener(new IDAListenerS82S0100000_15(feedCaptionView, 5));
                ofFloat.start();
                feedCaptionView.LLIILII = ofFloat;
            }
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((VideoProgressBarAssem) aLAdapterS12S0100000_15.l0).r4().kv0(0, false);
    }

    public static final void onAnimationEnd$8(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        AwemePagerAssem awemePagerAssem = (AwemePagerAssem) aLAdapterS12S0100000_15.l0;
        awemePagerAssem.LLFII = false;
        awemePagerAssem.LLFFF = 0.0f;
        C80648Vky c80648Vky = awemePagerAssem.LJLJJL;
        if (c80648Vky != null) {
            c80648Vky.setDisallowActionDown(false);
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SettingItemHighlightHelper settingItemHighlightHelper = (SettingItemHighlightHelper) aLAdapterS12S0100000_15.l0;
        settingItemHighlightHelper.LJLJI.LJIIJJI(C89953fz.LIZ(settingItemHighlightHelper.LJLIL));
    }

    public static final void onAnimationPause$0(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((YBU) aLAdapterS12S0100000_15.l0).LLIZ = false;
    }

    public static final void onAnimationStart$0(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animator) {
        aLAdapterS12S0100000_15.onAnimationCancel(animator);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setVisibility(0);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setAlpha(0.0f);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLJJL.setVisibility(0);
    }

    public static final void onAnimationStart$1(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animator) {
        aLAdapterS12S0100000_15.onAnimationCancel(animator);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setVisibility(0);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLILLLLZI.setAlpha(1.0f);
        ((ChooseMusicActivity) aLAdapterS12S0100000_15.l0).LJLJJL.setVisibility(0);
    }

    public static final void onAnimationStart$2(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C80648Vky c80648Vky = ((AwemePagerAssem) aLAdapterS12S0100000_15.l0).LJLJJL;
        if (c80648Vky != null) {
            c80648Vky.setDisallowActionDown(true);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((SettingItemHighlightHelper) aLAdapterS12S0100000_15.l0).LJLJI.LJIIJJI(new ColorDrawable(C04330Ez.LIZIZ(((SettingItemHighlightHelper) aLAdapterS12S0100000_15.l0).LJLIL, R.color.t2)));
    }

    public static final void onAnimationStart$4(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C80648Vky c80648Vky = ((AwemePagerAssemV2) aLAdapterS12S0100000_15.l0).LJLJL;
        if (c80648Vky != null) {
            c80648Vky.setDisallowActionDown(true);
        }
    }

    public static final void onAnimationStart$5(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        RelativeLayout relativeLayout = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        RelativeLayout relativeLayout2 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout2 != null) {
            relativeLayout2.setAlpha(0.0f);
        }
        RelativeLayout relativeLayout3 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJL;
        if (relativeLayout3 == null) {
            return;
        }
        relativeLayout3.setVisibility(0);
    }

    public static final void onAnimationStart$6(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        RelativeLayout relativeLayout = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        RelativeLayout relativeLayout2 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJJLL;
        if (relativeLayout2 != null) {
            relativeLayout2.setAlpha(1.0f);
        }
        RelativeLayout relativeLayout3 = ((XW8) aLAdapterS12S0100000_15.l0).LJLJL;
        if (relativeLayout3 == null) {
            return;
        }
        relativeLayout3.setVisibility(0);
    }

    public static final void onAnimationStart$7(ALAdapterS12S0100000_15 aLAdapterS12S0100000_15, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C86652Xzc) aLAdapterS12S0100000_15.l0).LIZ(R.id.b5f).setClickable(false);
    }
}
