package Y;

import X.AOX;
import X.ASI;
import X.AnonymousClass961;
import X.AnonymousClass974;
import X.C17N;
import X.C188727au;
import X.C2312195p;
import X.C2314396l;
import X.C247279n9;
import X.C247379nJ;
import X.C250999t9;
import X.C25738A8g;
import X.C29701Eo;
import X.C31563Ca7;
import X.C59357NRh;
import X.C72190SUw;
import X.C79004UzY;
import X.FMX;
import X.InterfaceC250539sP;
import X.InterfaceC65784Pro;
import X.NQ4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.survey.SurveyData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ALAdapterS3S0100000_4 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 9:
                onAnimationCancel$1(this, animator);
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
            case 14:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            case 20:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 33:
            case 37:
            case 39:
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
            case 15:
                onAnimationEnd$13(this, animator);
                return;
            case 18:
                onAnimationEnd$14(this, animator);
                return;
            case 19:
                onAnimationEnd$15(this, animator);
                return;
            case 21:
                onAnimationEnd$16(this, animator);
                return;
            case 22:
                onAnimationEnd$17(this, animator);
                return;
            case 25:
                onAnimationEnd$18(this, animator);
                return;
            case 26:
                onAnimationEnd$19(this, animator);
                return;
            case 30:
                onAnimationEnd$20(this, animator);
                return;
            case 31:
                onAnimationEnd$21(this, animator);
                return;
            case 32:
                onAnimationEnd$22(this, animator);
                return;
            case 34:
                onAnimationEnd$23(this, animator);
                return;
            case 35:
                onAnimationEnd$24(this, animator);
                return;
            case 36:
                onAnimationEnd$25(this, animator);
                return;
            case 38:
                onAnimationEnd$26(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationEnd$27(this, animator);
                return;
            case 41:
                onAnimationEnd$28(this, animator);
                return;
            case 42:
                onAnimationEnd$29(this, animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 10:
                onAnimationEnd$0(this, animator, z);
                return;
            default:
                super.onAnimationEnd(animator, z);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                onAnimationStart$1(this, animator);
                return;
            case 6:
                onAnimationStart$2(this, animator);
                return;
            case 9:
                o.LJIIIZ(animator, "animation");
                return;
            case 14:
                onAnimationStart$4(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationStart$5(this, animator);
                return;
            case 17:
                onAnimationStart$6(this, animator);
                return;
            case 20:
                onAnimationStart$7(this, animator);
                return;
            case 23:
                onAnimationStart$8(this, animator);
                return;
            case 24:
                onAnimationStart$9(this, animator);
                return;
            case 27:
                onAnimationStart$10(this, animator);
                return;
            case 28:
                onAnimationStart$11(this, animator);
                return;
            case 29:
                onAnimationStart$12(this, animator);
                return;
            case 31:
                onAnimationStart$13(this, animator);
                return;
            case 33:
                onAnimationStart$14(this, animator);
                return;
            case 37:
                onAnimationStart$15(this, animator);
                return;
            case 39:
                onAnimationStart$16(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS3S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$1(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS3S0100000_4.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2312195p) aLAdapterS3S0100000_4.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$10(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((TextView) aLAdapterS3S0100000_4.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$11(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) aLAdapterS3S0100000_4.l0).invoke();
    }

    public static final void onAnimationEnd$12(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((NQ4) aLAdapterS3S0100000_4.l0).LIZLLL().LJFF(4);
    }

    public static final void onAnimationEnd$13(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C59357NRh) aLAdapterS3S0100000_4.l0).LIZIZ.LJFF(4);
    }

    public static final void onAnimationEnd$14(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS3S0100000_4.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animator) {
        super.onAnimationEnd(animator);
        ((InterfaceC65784Pro) aLAdapterS3S0100000_4.l0).invoke();
    }

    public static final void onAnimationEnd$16(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((AnonymousClass974) aLAdapterS3S0100000_4.l0).LIZ;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("searchStickerView");
            throw null;
        }
    }

    public static final void onAnimationEnd$17(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnonymousClass974) aLAdapterS3S0100000_4.l0).LJII.setVisibility(8);
    }

    public static final void onAnimationEnd$18(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((AnonymousClass974) aLAdapterS3S0100000_4.l0).LIZ;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("searchStickerView");
            throw null;
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((AnonymousClass974) aLAdapterS3S0100000_4.l0).LIZ;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("searchStickerView");
            throw null;
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        View view = ((BaseCaptionSheetFragment) aLAdapterS3S0100000_4.l0).getView();
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -2;
    }

    public static final void onAnimationEnd$20(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        LinearLayout linearLayout = ((C247279n9) aLAdapterS3S0100000_4.l0).LIZJ;
        if (linearLayout != null) {
            linearLayout.postDelayed(new ARunnableS40S0100000_4(aLAdapterS3S0100000_4, 157), 200L);
        }
    }

    public static final void onAnimationEnd$21(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SmartImageView smartImageView = ((C247279n9) aLAdapterS3S0100000_4.l0).LJIILLIIL;
        if (smartImageView != null) {
            smartImageView.setVisibility(8);
        }
        SmartImageView smartImageView2 = ((C247279n9) aLAdapterS3S0100000_4.l0).LJIILLIIL;
        if (smartImageView2 != null) {
            smartImageView2.setAlpha(1.0f);
        }
    }

    public static final void onAnimationEnd$22(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((C247379nJ) aLAdapterS3S0100000_4.l0).LJ;
        if (c29701Eo != null) {
            c29701Eo.setRepeatCount(-1);
        }
        C29701Eo c29701Eo2 = ((C247379nJ) aLAdapterS3S0100000_4.l0).LJ;
        if (c29701Eo2 != null) {
            c29701Eo2.removeAllAnimatorListeners();
        }
        C29701Eo c29701Eo3 = ((C247379nJ) aLAdapterS3S0100000_4.l0).LJ;
        if (c29701Eo3 != null) {
            c29701Eo3.playAnimation();
        }
    }

    public static final void onAnimationEnd$23(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((View) aLAdapterS3S0100000_4.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$24(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS3S0100000_4.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$25(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS3S0100000_4.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$26(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animator) {
        if (C79004UzY.LJJIFFI(((AnonymousClass961) aLAdapterS3S0100000_4.l0).LJLJJI.getListeners())) {
            AnonymousClass961 anonymousClass961 = (AnonymousClass961) aLAdapterS3S0100000_4.l0;
            anonymousClass961.LJLJJI.addUpdateListener(anonymousClass961.LJLJL);
        }
        ((AnonymousClass961) aLAdapterS3S0100000_4.l0).LJLJJI.start();
    }

    public static final void onAnimationEnd$27(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C31563Ca7) aLAdapterS3S0100000_4.l0).LL.setVisibility(8);
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$28(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C31563Ca7) aLAdapterS3S0100000_4.l0).LLF.setVisibility(8);
    }

    public static final void onAnimationEnd$29(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C31563Ca7) aLAdapterS3S0100000_4.l0).LLF.setVisibility(0);
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View _$_findCachedViewById = ((FashionMallFragment) aLAdapterS3S0100000_4.l0)._$_findCachedViewById(R.id.d2t);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(4);
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animator) {
        ValueAnimator valueAnimator = ((AnonymousClass961) aLAdapterS3S0100000_4.l0).LJLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ((AnonymousClass961) aLAdapterS3S0100000_4.l0).setAlpha(1.0f);
        ((AnonymousClass961) aLAdapterS3S0100000_4.l0).setVisibility(4);
    }

    public static final void onAnimationEnd$5(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animator) {
        String str;
        AOX aox = (AOX) aLAdapterS3S0100000_4.l0;
        aox.LJLLLL = true;
        if (aox.LJLLI != null) {
            SurveyData surveyData = aox.LJLLILLLL;
            o.LJIIIZ(surveyData, "surveyData");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("pop_survey_id", String.valueOf(surveyData.dialogId));
            if (!TextUtils.isEmpty(surveyData.originalQuestion)) {
                str = surveyData.originalQuestion;
            } else {
                str = surveyData.question;
            }
            c188727au.LJIIIZ("pop_survey_question", str);
            c188727au.LIZLLL(surveyData.originId, "original_id");
            FMX.LJIIL("pop_survey_show", c188727au.LIZ);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animator) {
        AOX aox = (AOX) aLAdapterS3S0100000_4.l0;
        if (aox.LJLLLLLL) {
            return;
        }
        if (aox.LJLLJ == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aox.LJLILLLLZI, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, r5.getHeight());
            aox.LJLLJ = ofFloat;
            ofFloat.setDuration(300L);
            aox.LJLLJ.setInterpolator(new DecelerateInterpolator());
            aox.LJLLJ.setStartDelay(2000L);
        }
        if (aox.LJLLJ.isStarted() || aox.LJLLJ.isRunning()) {
            return;
        }
        aox.LJLLJ.start();
    }

    public static final void onAnimationEnd$7(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2314396l) aLAdapterS3S0100000_4.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$8(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C250999t9) aLAdapterS3S0100000_4.l0).getCoinTextView().setVisibility(8);
    }

    public static final void onAnimationEnd$9(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC250539sP interfaceC250539sP = (InterfaceC250539sP) aLAdapterS3S0100000_4.l0;
        if (interfaceC250539sP != null) {
            interfaceC250539sP.LIZ();
        }
    }

    public static final void onAnimationStart$1(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animator) {
        ((AOX) aLAdapterS3S0100000_4.l0).LJLILLLLZI.setVisibility(0);
        ((AOX) aLAdapterS3S0100000_4.l0).LJLJI.setVisibility(0);
        ((AOX) aLAdapterS3S0100000_4.l0).LJLJI.setAlpha(1.0f);
        ((AOX) aLAdapterS3S0100000_4.l0).LJLJJLL.setVisibility(8);
    }

    public static final void onAnimationStart$10(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxTextView tuxTextView = ((C247279n9) aLAdapterS3S0100000_4.l0).LJIIIIZZ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
        }
    }

    public static final void onAnimationStart$11(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxTextView tuxTextView = ((C247279n9) aLAdapterS3S0100000_4.l0).LJIIIZ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
        }
    }

    public static final void onAnimationStart$12(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        FrameLayout frameLayout = ((C247279n9) aLAdapterS3S0100000_4.l0).LJIIJJI;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public static final void onAnimationStart$13(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SmartImageView smartImageView = ((C247279n9) aLAdapterS3S0100000_4.l0).LJIILLIIL;
        if (smartImageView != null) {
            smartImageView.setVisibility(0);
        }
    }

    public static final void onAnimationStart$14(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        LinearLayout linearLayout = ((C247279n9) aLAdapterS3S0100000_4.l0).LJIILL;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public static final void onAnimationStart$15(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS3S0100000_4.l0).setVisibility(0);
    }

    public static final void onAnimationStart$16(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS3S0100000_4.l0).setVisibility(0);
    }

    public static final void onAnimationStart$2(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animator) {
        ((AOX) aLAdapterS3S0100000_4.l0).LJLJJLL.setAlpha(0.0f);
        ((AOX) aLAdapterS3S0100000_4.l0).LJLJJLL.setVisibility(0);
    }

    public static final void onAnimationStart$4(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((TuxTextView) aLAdapterS3S0100000_4.l0).setAlpha(1.0f);
    }

    public static final void onAnimationStart$5(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJLIIIJJI(((C72190SUw) aLAdapterS3S0100000_4.l0).LJLJJLL);
    }

    public static final void onAnimationStart$6(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJLIIIJJI(((C25738A8g) aLAdapterS3S0100000_4.l0).LJLJJLL);
    }

    public static final void onAnimationStart$7(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnonymousClass974) aLAdapterS3S0100000_4.l0).LJII.setVisibility(0);
    }

    public static final void onAnimationStart$8(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((AnonymousClass974) aLAdapterS3S0100000_4.l0).LIZ;
        if (view != null) {
            view.setVisibility(0);
        } else {
            o.LJIJI("searchStickerView");
            throw null;
        }
    }

    public static final void onAnimationStart$9(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnonymousClass974) aLAdapterS3S0100000_4.l0).LJII.setVisibility(0);
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0100000_4 aLAdapterS3S0100000_4, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        ((ASI) aLAdapterS3S0100000_4.l0).LJLIL.setVisibility(0);
        ((ASI) aLAdapterS3S0100000_4.l0).LJLILLLLZI.setVisibility(8);
    }
}
