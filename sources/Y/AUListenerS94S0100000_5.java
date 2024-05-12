package Y;

import X.C03860De;
import X.C15380j0;
import X.C259910h;
import X.C264612c;
import X.C29306Beo;
import X.C29512Bi8;
import X.C29727Blb;
import X.C29739Bln;
import X.C29746Blu;
import X.C30870C9q;
import X.C31463CWl;
import X.C31470CWs;
import X.C31499CXv;
import X.C31563Ca7;
import X.C31576CaK;
import X.C31580CaO;
import X.C32205CkT;
import X.C32531Cpj;
import X.C32532Cpk;
import X.C32534Cpm;
import X.C32727Cst;
import X.C47061t0;
import X.C47121t6;
import X.C47171tB;
import X.C56414MCc;
import X.C61447O9r;
import X.C72431Sbj;
import X.C8I2;
import X.CF8;
import X.CSD;
import X.CUV;
import X.CV7;
import X.CX3;
import X.CXC;
import X.CY1;
import X.InterfaceC31469CWr;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.U2I;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import com.bytedance.android.livesdk.interaction.custompoll.CustomPollCardWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget;
import com.bytedance.android.livesdk.liveevent.LiveEventDescCardWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdk.widget.RecommendSwipeOldWidget;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AUListenerS94S0100000_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            case 17:
                onAnimationUpdate$17(this, valueAnimator);
                return;
            case 18:
                onAnimationUpdate$18(this, valueAnimator);
                return;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                return;
            case 20:
                onAnimationUpdate$20(this, valueAnimator);
                return;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                return;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                return;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                return;
            case 24:
                onAnimationUpdate$24(this, valueAnimator);
                return;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                return;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                return;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                return;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                return;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                return;
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                return;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                return;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                return;
            case 33:
                onAnimationUpdate$33(this, valueAnimator);
                return;
            case 34:
                onAnimationUpdate$34(this, valueAnimator);
                return;
            case 35:
                onAnimationUpdate$35(this, valueAnimator);
                return;
            case 36:
                onAnimationUpdate$36(this, valueAnimator);
                return;
            case 37:
                onAnimationUpdate$37(this, valueAnimator);
                return;
            case 38:
                onAnimationUpdate$38(this, valueAnimator);
                return;
            case 39:
                onAnimationUpdate$39(this, valueAnimator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationUpdate$40(this, valueAnimator);
                return;
            case 41:
                onAnimationUpdate$41(this, valueAnimator);
                return;
            case 42:
                onAnimationUpdate$42(this, valueAnimator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationUpdate$43(this, valueAnimator);
                return;
            case 44:
                onAnimationUpdate$44(this, valueAnimator);
                return;
            case 45:
                onAnimationUpdate$45(this, valueAnimator);
                return;
            case 46:
                onAnimationUpdate$46(this, valueAnimator);
                return;
            case 47:
                onAnimationUpdate$47(this, valueAnimator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onAnimationUpdate$48(this, valueAnimator);
                return;
            case C61447O9r.LJIIJ:
                onAnimationUpdate$49(this, valueAnimator);
                return;
            case 50:
                onAnimationUpdate$50(this, valueAnimator);
                return;
            case 51:
                onAnimationUpdate$51(this, valueAnimator);
                return;
            case 52:
                onAnimationUpdate$52(this, valueAnimator);
                return;
            case 53:
                onAnimationUpdate$53(this, valueAnimator);
                return;
            case 54:
                onAnimationUpdate$54(this, valueAnimator);
                return;
            case 55:
                onAnimationUpdate$55(this, valueAnimator);
                return;
            case 56:
                onAnimationUpdate$56(this, valueAnimator);
                return;
            case 57:
                onAnimationUpdate$57(this, valueAnimator);
                return;
            case 58:
                onAnimationUpdate$58(this, valueAnimator);
                return;
            case 59:
                onAnimationUpdate$59(this, valueAnimator);
                return;
            case 60:
                onAnimationUpdate$60(this, valueAnimator);
                return;
            case 61:
                onAnimationUpdate$61(this, valueAnimator);
                return;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationUpdate$62(this, valueAnimator);
                return;
            case 63:
                onAnimationUpdate$63(this, valueAnimator);
                return;
            case 64:
                onAnimationUpdate$64(this, valueAnimator);
                return;
            case 65:
                onAnimationUpdate$65(this, valueAnimator);
                return;
            case 66:
                onAnimationUpdate$66(this, valueAnimator);
                return;
            case 67:
                onAnimationUpdate$67(this, valueAnimator);
                return;
            case 68:
                onAnimationUpdate$68(this, valueAnimator);
                return;
            case 69:
                onAnimationUpdate$69(this, valueAnimator);
                return;
            case 70:
                onAnimationUpdate$70(this, valueAnimator);
                return;
            case 71:
                onAnimationUpdate$71(this, valueAnimator);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                onAnimationUpdate$72(this, valueAnimator);
                return;
            case 73:
                onAnimationUpdate$73(this, valueAnimator);
                return;
            case 74:
                onAnimationUpdate$74(this, valueAnimator);
                return;
            case 75:
                onAnimationUpdate$75(this, valueAnimator);
                return;
            case 76:
                onAnimationUpdate$76(this, valueAnimator);
                return;
            case 77:
                onAnimationUpdate$77(this, valueAnimator);
                return;
            case 78:
                onAnimationUpdate$78(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public AUListenerS94S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CV7 cv7 = (CV7) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        cv7.LJLILLLLZI = ((Integer) animatedValue).intValue();
        super/*android.widget.FrameLayout*/.requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CV7 cv7 = (CV7) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        cv7.LJLJI = ((Integer) animatedValue).intValue();
        super/*android.widget.FrameLayout*/.requestLayout();
    }

    public static final void onAnimationUpdate$10(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((VideoBroadcastInteractionFragment) aUListenerS94S0100000_5.l0).getView();
        if (view == null) {
            return;
        }
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31576CaK c31576CaK = (C31576CaK) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c31576CaK.LJLJJLL = ((Float) animatedValue).floatValue();
        ((C31576CaK) aUListenerS94S0100000_5.l0).postInvalidate();
    }

    public static final void onAnimationUpdate$12(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        for (View view : ((CustomPollCardWidget) aUListenerS94S0100000_5.l0).LJLJLJ) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        Float f;
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            for (View view : (View[]) aUListenerS94S0100000_5.l0) {
                view.setAlpha(floatValue);
            }
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        Float f;
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            for (View view : (View[]) aUListenerS94S0100000_5.l0) {
                if (C29306Beo.LJJIIJ(view)) {
                    view.setAlpha(floatValue);
                }
            }
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        Float f;
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            C47061t0 c47061t0 = ((DrawGuessCanvasWidget) aUListenerS94S0100000_5.l0).LJLJI;
            if (c47061t0 != null) {
                c47061t0.setAlpha(floatValue);
            } else {
                o.LJIJI("guideView");
                throw null;
            }
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            View view = ((DrawGuessToolbarWidget) aUListenerS94S0100000_5.l0).LJLLILLLL;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) floatValue;
                View view2 = ((DrawGuessToolbarWidget) aUListenerS94S0100000_5.l0).LJLLILLLL;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                    return;
                } else {
                    o.LJIJI("colorPickerContainer");
                    throw null;
                }
            }
            o.LJIJI("colorPickerContainer");
            throw null;
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue >= 0 && intValue < 200) {
            f = 0.0f;
            ((LikeUserInfoAnimWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI.setAlpha(0.0f);
        } else {
            if (intValue >= 200 && intValue < 400) {
                ((LikeUserInfoAnimWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI.setAlpha((intValue * 0.005f) - 1.0f);
            } else {
                ((LikeUserInfoAnimWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI.setAlpha(1.0f);
                if (intValue >= 200) {
                    if (intValue >= 450) {
                        if (intValue >= 450) {
                            if (intValue < 600) {
                                f2 = intValue - 600;
                                f3 = -0.0012666667f;
                            } else if (intValue <= 1200) {
                                f2 = intValue - 600;
                                f3 = 6.6666704E-5f;
                            }
                            f = 0.96f + (f2 * f3);
                        }
                    }
                }
                f = 1.0f;
            }
            f = 0.0046f * (intValue - 200);
        }
        ((LikeUserInfoAnimWidget) aUListenerS94S0100000_5.l0).LJLIL.setScaleX(f);
        ((LikeUserInfoAnimWidget) aUListenerS94S0100000_5.l0).LJLIL.setScaleY(f);
    }

    public static final void onAnimationUpdate$18(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CXC cxc = (CXC) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        cxc.LIZJ = ((Integer) animatedValue).intValue();
    }

    public static final void onAnimationUpdate$19(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CXC cxc = (CXC) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        cxc.LIZJ = ((Integer) animatedValue).intValue();
    }

    public static final void onAnimationUpdate$2(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        ((GradientDrawable) ((C29727Blb) aUListenerS94S0100000_5.l0).LIZLLL.getBackground()).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$20(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CXC cxc = (CXC) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cxc.LIZIZ(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((LiveEventDescCardWidget) aUListenerS94S0100000_5.l0).LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$22(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view != null) {
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationY(((Float) animatedValue).floatValue());
        }
        if (animation.getAnimatedFraction() >= 0.98f) {
            View view2 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI;
            if (view2 != null) {
                view2.setScaleX(1.0f);
            }
            View view3 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI;
            if (view3 != null) {
                view3.setScaleY(1.0f);
            }
            if (((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LLFII()) {
                RecommendSwipeOldWidget recommendSwipeOldWidget = (RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0;
                if (recommendSwipeOldWidget.LJLILLLLZI != null) {
                    C47061t0 c47061t0 = recommendSwipeOldWidget.LJLLL;
                    if (c47061t0 != null) {
                        c47061t0.setTranslationX(0.0f);
                    }
                    C47061t0 c47061t02 = recommendSwipeOldWidget.LJLLJ;
                    if (c47061t02 != null) {
                        ViewGroup.LayoutParams layoutParams = c47061t02.getLayoutParams();
                        layoutParams.width = 0;
                        c47061t02.setLayoutParams(layoutParams);
                    }
                    C47061t0 c47061t03 = recommendSwipeOldWidget.LJLLL;
                    if (c47061t03 != null) {
                        ViewGroup.LayoutParams layoutParams2 = c47061t03.getLayoutParams();
                        layoutParams2.width = 0;
                        c47061t03.setLayoutParams(layoutParams2);
                    }
                }
                C47061t0 c47061t04 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLJ;
                if (c47061t04 != null) {
                    Object animatedValue2 = animation.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    c47061t04.setTranslationY(((Float) animatedValue2).floatValue());
                }
                C47061t0 c47061t05 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLJ;
                if (c47061t05 != null) {
                    c47061t05.setScaleY(1.0f);
                }
                C47061t0 c47061t06 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLL;
                if (c47061t06 != null) {
                    Object animatedValue3 = animation.getAnimatedValue();
                    o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                    c47061t06.setTranslationY(((Float) animatedValue3).floatValue());
                }
                C47061t0 c47061t07 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLL;
                if (c47061t07 == null) {
                    return;
                }
                c47061t07.setScaleY(1.0f);
                return;
            }
            return;
        }
        float animatedFraction = (animation.getAnimatedFraction() / 10) + 0.9f;
        View view4 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view4 != null) {
            view4.setScaleX(animatedFraction);
        }
        View view5 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view5 != null) {
            view5.setScaleY(animatedFraction);
        }
        if (!((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LLFII()) {
            return;
        }
        C47061t0 c47061t08 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLJ;
        if (c47061t08 != null) {
            Object animatedValue4 = animation.getAnimatedValue();
            o.LJII(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
            c47061t08.setTranslationY(((Float) animatedValue4).floatValue());
        }
        C47061t0 c47061t09 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLJ;
        if (c47061t09 != null) {
            c47061t09.setScaleY(animatedFraction);
        }
        C47061t0 c47061t010 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLL;
        if (c47061t010 != null) {
            Object animatedValue5 = animation.getAnimatedValue();
            o.LJII(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
            c47061t010.setTranslationY(((Float) animatedValue5).floatValue());
        }
        C47061t0 c47061t011 = ((RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0).LJLLL;
        if (c47061t011 != null) {
            c47061t011.setScaleY(animatedFraction);
        }
        RecommendSwipeOldWidget recommendSwipeOldWidget2 = (RecommendSwipeOldWidget) aUListenerS94S0100000_5.l0;
        View view6 = recommendSwipeOldWidget2.LJLILLLLZI;
        if (view6 == null) {
            return;
        }
        float scaleX = (1 - view6.getScaleX()) * ((Number) recommendSwipeOldWidget2.LLIIIILZ.getValue()).intValue();
        float f = 2;
        int i = (int) (scaleX / f);
        C47061t0 c47061t012 = recommendSwipeOldWidget2.LJLLL;
        if (c47061t012 != null) {
            c47061t012.setTranslationX((-i) / f);
        }
        C47061t0 c47061t013 = recommendSwipeOldWidget2.LJLLJ;
        if (c47061t013 != null) {
            ViewGroup.LayoutParams layoutParams3 = c47061t013.getLayoutParams();
            layoutParams3.width = i;
            c47061t013.setLayoutParams(layoutParams3);
        }
        C47061t0 c47061t014 = recommendSwipeOldWidget2.LJLLL;
        if (c47061t014 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = c47061t014.getLayoutParams();
        layoutParams4.width = i;
        c47061t014.setLayoutParams(layoutParams4);
    }

    public static final void onAnimationUpdate$23(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (C15380j0.LJIIZILJ()) {
            View view = (View) aUListenerS94S0100000_5.l0;
            if (view != null) {
                C29306Beo.LJJLIIIIJ(intValue, view);
                return;
            }
            return;
        }
        View view2 = (View) aUListenerS94S0100000_5.l0;
        if (view2 == null) {
            return;
        }
        C29306Beo.LJJJLIIL(intValue, view2);
    }

    public static final void onAnimationUpdate$24(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((TryModeBroadcastInteractionFragment) aUListenerS94S0100000_5.l0).getView();
        if (view == null) {
            return;
        }
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$25(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ImageView imageView = ((C32727Cst) aUListenerS94S0100000_5.l0).LJLJI;
        if (imageView != null) {
            imageView.setScaleX(floatValue);
        }
        ImageView imageView2 = ((C32727Cst) aUListenerS94S0100000_5.l0).LJLJI;
        if (imageView2 == null) {
            return;
        }
        imageView2.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$26(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "value", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ImageView imageView = ((C32727Cst) aUListenerS94S0100000_5.l0).LJLJI;
        if (imageView != null) {
            imageView.setScaleX(floatValue);
        }
        ImageView imageView2 = ((C32727Cst) aUListenerS94S0100000_5.l0).LJLJI;
        if (imageView2 == null) {
            return;
        }
        imageView2.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$27(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleX(floatValue);
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$28(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleX(floatValue);
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$29(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleX(floatValue);
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        ((GradientDrawable) ((C29727Blb) aUListenerS94S0100000_5.l0).LIZLLL.getBackground()).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$30(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleX(floatValue);
        ((C56414MCc) aUListenerS94S0100000_5.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$31(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((DrawGuessStatusWidget) aUListenerS94S0100000_5.l0).LJLLLLLL) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = ((DrawGuessStatusWidget) aUListenerS94S0100000_5.l0).getView();
            if (view == null) {
                return;
            }
            view.setAlpha(floatValue);
        }
    }

    public static final void onAnimationUpdate$32(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            ((ViewGroup) aUListenerS94S0100000_5.l0).setAlpha(floatValue);
            if (floatValue == 0.0f) {
                C29306Beo.LJI((ViewGroup) aUListenerS94S0100000_5.l0);
            }
        }
    }

    public static final void onAnimationUpdate$33(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C29306Beo.LJJJJJL((int) f.floatValue(), (ViewGroup) aUListenerS94S0100000_5.l0);
        }
    }

    public static final void onAnimationUpdate$34(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        o.LJIIIZ(animation, "animation");
        TextView textView = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (textView != null) {
            layoutParams3 = textView.getLayoutParams();
        }
        if (layoutParams3 != null) {
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams3.width = ((Integer) animatedValue).intValue();
        }
        TextView textView2 = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (textView2 != null) {
            textView2.requestLayout();
        }
        View view = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJZI;
        if (view != null && (layoutParams2 = view.getLayoutParams()) != null) {
            Object animatedValue2 = animation.getAnimatedValue();
            o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.width = ((Integer) animatedValue2).intValue();
        }
        View view2 = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJZI;
        if (view2 != null) {
            view2.requestLayout();
        }
        TextView textView3 = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJLZ;
        if (textView3 != null && (layoutParams = textView3.getLayoutParams()) != null) {
            Object animatedValue3 = animation.getAnimatedValue();
            o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((Integer) animatedValue3).intValue();
        }
        TextView textView4 = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJLZ;
        if (textView4 != null) {
            textView4.requestLayout();
        }
    }

    public static final void onAnimationUpdate$35(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        TextView textView = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (textView != null) {
            layoutParams2 = textView.getLayoutParams();
        }
        if (layoutParams2 != null) {
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.width = ((Integer) animatedValue).intValue();
        }
        TextView textView2 = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (textView2 != null) {
            textView2.requestLayout();
        }
        View view = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJZI;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            Object animatedValue2 = animation.getAnimatedValue();
            o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((Integer) animatedValue2).intValue();
        }
        View view2 = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LJZI;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    public static final void onAnimationUpdate$36(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        CY1 LLFII = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LLFII();
        if (LLFII != null && (layoutParams = LLFII.getLayoutParams()) != null) {
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((Integer) animatedValue).intValue();
        }
        CY1 LLFII2 = ((OnlineAudienceRankWidget) aUListenerS94S0100000_5.l0).LLFII();
        if (LLFII2 != null) {
            LLFII2.requestLayout();
        }
    }

    public static final void onAnimationUpdate$37(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$38(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$39(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31580CaO c31580CaO = (C31580CaO) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c31580CaO.LJJJZ = ((Integer) animatedValue).intValue();
        CX3 cx3 = ((C31580CaO) aUListenerS94S0100000_5.l0).LJJLIIIJ;
        if (cx3 != null) {
            cx3.LIZ();
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        float offset = (((C32205CkT) aUListenerS94S0100000_5.l0).getOffset() + intValue) * ((C32205CkT) aUListenerS94S0100000_5.l0).getSlope();
        C32205CkT c32205CkT = (C32205CkT) aUListenerS94S0100000_5.l0;
        ((C32205CkT) aUListenerS94S0100000_5.l0).LJLIL.setShader(new LinearGradient(intValue, ((C32205CkT) aUListenerS94S0100000_5.l0).getSlope() * intValue, intValue + ((C32205CkT) aUListenerS94S0100000_5.l0).getOffset(), offset, c32205CkT.LJLJL, c32205CkT.getPositionArray(), Shader.TileMode.CLAMP));
        ((C32205CkT) aUListenerS94S0100000_5.l0).invalidate();
    }

    public static final void onAnimationUpdate$40(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31580CaO c31580CaO = (C31580CaO) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c31580CaO.LJJLI = ((Integer) animatedValue).intValue();
        CX3 cx3 = ((C31580CaO) aUListenerS94S0100000_5.l0).LJJLIIIJ;
        if (cx3 != null) {
            cx3.LIZ();
        }
    }

    public static final void onAnimationUpdate$41(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31580CaO c31580CaO = (C31580CaO) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c31580CaO.LJJL = ((Integer) animatedValue).intValue();
        CX3 cx3 = ((C31580CaO) aUListenerS94S0100000_5.l0).LJJLIIIJ;
        if (cx3 != null) {
            cx3.LIZ();
        }
    }

    public static final void onAnimationUpdate$42(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31580CaO c31580CaO = (C31580CaO) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c31580CaO.LJJJZ = ((Integer) animatedValue).intValue();
        CX3 cx3 = ((C31580CaO) aUListenerS94S0100000_5.l0).LJJLIIIJ;
        if (cx3 != null) {
            cx3.LIZ();
        }
    }

    public static final void onAnimationUpdate$43(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        View view = ((ProgrammedLiveFollowCardWidget) aUListenerS94S0100000_5.l0).getView();
        if (view == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$44(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        View view = ((ProgrammedLiveFollowCardWidget) aUListenerS94S0100000_5.l0).getView();
        if (view == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$45(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$46(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$47(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        MeasureLinearLayout measureLinearLayout = ((AddModeratorFragment) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        C29306Beo.LJJJJJL(((Integer) animatedValue).intValue(), measureLinearLayout);
    }

    public static final void onAnimationUpdate$48(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((VoiceChatBroadcastInteractionFragment) aUListenerS94S0100000_5.l0).getView();
        if (view == null) {
            return;
        }
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$49(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.scaleX(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$5(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31463CWl c31463CWl = (C31463CWl) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c31463CWl.LJJLIIIJ = ((Float) animatedValue).floatValue();
        InterfaceC31469CWr interfaceC31469CWr = ((C31463CWl) aUListenerS94S0100000_5.l0).LJJLI;
        if (interfaceC31469CWr != null) {
            interfaceC31469CWr.invalidate();
        }
    }

    public static final void onAnimationUpdate$50(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.scaleY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$51(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$52(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$53(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.scaleX(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$54(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.scaleY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$55(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$56(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LiveIconView liveIconView = ((LiveCenterEntranceWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (liveIconView != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            liveIconView.setIconTint(((Integer) animatedValue).intValue());
            return;
        }
        o.LJIJI("violationIcon");
        throw null;
    }

    public static final void onAnimationUpdate$57(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LiveIconView liveIconView = ((LiveCenterEntranceWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (liveIconView != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            liveIconView.setIconTint(((Integer) animatedValue).intValue());
            return;
        }
        o.LJIJI("violationIcon");
        throw null;
    }

    public static final void onAnimationUpdate$58(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LiveIconView liveIconView = ((LiveCenterEntranceWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (liveIconView != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            liveIconView.setIconTint(((Integer) animatedValue).intValue());
            return;
        }
        o.LJIJI("violationIcon");
        throw null;
    }

    public static final void onAnimationUpdate$59(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation1) {
        Integer num;
        ViewGroup.LayoutParams layoutParams;
        int i;
        o.LJIIIZ(animation1, "animation1");
        Object animatedValue = animation1.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        C47121t6 c47121t6 = ((C29739Bln) aUListenerS94S0100000_5.l0).LJIIZILJ;
        if (c47121t6 != null && (layoutParams = c47121t6.getLayoutParams()) != null) {
            C29739Bln c29739Bln = (C29739Bln) aUListenerS94S0100000_5.l0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            layoutParams.width = i;
            C47121t6 c47121t62 = c29739Bln.LJIIZILJ;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setLayoutParams(layoutParams);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31463CWl c31463CWl = (C31463CWl) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c31463CWl.LJJL = ((Integer) animatedValue).intValue();
        InterfaceC31469CWr interfaceC31469CWr = ((C31463CWl) aUListenerS94S0100000_5.l0).LJJLI;
        if (interfaceC31469CWr != null) {
            interfaceC31469CWr.invalidate();
        }
    }

    public static final void onAnimationUpdate$60(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation1) {
        Integer num;
        ViewGroup.LayoutParams layoutParams;
        int i;
        o.LJIIIZ(animation1, "animation1");
        Object animatedValue = animation1.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        C47121t6 c47121t6 = ((C29746Blu) aUListenerS94S0100000_5.l0).LJIL;
        if (c47121t6 != null && (layoutParams = c47121t6.getLayoutParams()) != null) {
            C29746Blu c29746Blu = (C29746Blu) aUListenerS94S0100000_5.l0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            layoutParams.width = i;
            C47121t6 c47121t62 = c29746Blu.LJIL;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setLayoutParams(layoutParams);
        }
    }

    public static final void onAnimationUpdate$61(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        C47171tB c47171tB = ((CSD) aUListenerS94S0100000_5.l0).LJLLL;
        Object animatedValue = animator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c47171tB.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$62(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        C47171tB c47171tB = ((CSD) aUListenerS94S0100000_5.l0).LJLLL;
        Object animatedValue = animator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c47171tB.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$63(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        float f;
        Float f2;
        o.LJIIIZ(animation, "animation");
        CF8 cf8 = (CF8) aUListenerS94S0100000_5.l0;
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        cf8.LJIL(f);
    }

    public static final void onAnimationUpdate$64(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        int LIZIZ;
        Integer num;
        o.LJIIIZ(it, "it");
        U2I u2i = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (u2i != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                LIZIZ = num.intValue();
            } else {
                LIZIZ = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
            }
            u2i.setTextColor(LIZIZ);
        }
    }

    public static final void onAnimationUpdate$65(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        int LIZIZ;
        Integer num;
        int LIZIZ2;
        Integer num2;
        o.LJIIIZ(it, "it");
        U2I u2i = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (u2i != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num2 = (Integer) animatedValue) != null) {
                LIZIZ2 = num2.intValue();
            } else {
                LIZIZ2 = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
            }
            u2i.setTextColor(LIZIZ2);
        }
        C8I2 c8i2 = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLL;
        if (c8i2 == null) {
            return;
        }
        Object animatedValue2 = it.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            LIZIZ = num.intValue();
        } else {
            LIZIZ = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
        }
        c8i2.setSolidColor(LIZIZ);
    }

    public static final void onAnimationUpdate$66(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        int LIZIZ;
        Integer num;
        int LIZIZ2;
        Integer num2;
        o.LJIIIZ(it, "it");
        U2I u2i = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (u2i != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num2 = (Integer) animatedValue) != null) {
                LIZIZ2 = num2.intValue();
            } else {
                LIZIZ2 = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
            }
            u2i.setTextColor(LIZIZ2);
        }
        C8I2 c8i2 = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLL;
        if (c8i2 == null) {
            return;
        }
        Object animatedValue2 = it.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            LIZIZ = num.intValue();
        } else {
            LIZIZ = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
        }
        c8i2.setSolidColor(LIZIZ);
    }

    public static final void onAnimationUpdate$67(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        int LIZIZ;
        Integer num;
        o.LJIIIZ(it, "it");
        U2I u2i = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (u2i != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                LIZIZ = num.intValue();
            } else {
                LIZIZ = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
            }
            u2i.setTextColor(LIZIZ);
        }
    }

    public static final void onAnimationUpdate$68(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        int LIZIZ;
        Integer num;
        int LIZIZ2;
        Integer num2;
        o.LJIIIZ(it, "it");
        U2I u2i = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLLL;
        if (u2i != null) {
            Object animatedValue = it.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num2 = (Integer) animatedValue) != null) {
                LIZIZ2 = num2.intValue();
            } else {
                LIZIZ2 = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
            }
            u2i.setTextColor(LIZIZ2);
        }
        C8I2 c8i2 = ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).LJLLL;
        if (c8i2 == null) {
            return;
        }
        Object animatedValue2 = it.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            LIZIZ = num.intValue();
        } else {
            LIZIZ = C259910h.LIZIZ(R.attr.bmu, ((SubscribeTimeStickerWidget) aUListenerS94S0100000_5.l0).context);
        }
        c8i2.setSolidColor(LIZIZ);
    }

    public static final void onAnimationUpdate$69(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.translationX(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31463CWl c31463CWl = (C31463CWl) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c31463CWl.LJJL = ((Integer) animatedValue).intValue();
        InterfaceC31469CWr interfaceC31469CWr = ((C31463CWl) aUListenerS94S0100000_5.l0).LJJLI;
        if (interfaceC31469CWr != null) {
            interfaceC31469CWr.invalidate();
        }
    }

    public static final void onAnimationUpdate$70(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue >= 0 && intValue < 200) {
            f = 0.0f;
            ((LikeUserInfoAnimOptimizedWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI.setAlpha(0.0f);
        } else {
            if (intValue >= 200 && intValue < 400) {
                ((LikeUserInfoAnimOptimizedWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI.setAlpha((intValue * 0.005f) - 1.0f);
            } else {
                ((LikeUserInfoAnimOptimizedWidget) aUListenerS94S0100000_5.l0).LJLILLLLZI.setAlpha(1.0f);
                if (intValue >= 200) {
                    if (intValue >= 450) {
                        if (intValue >= 450) {
                            if (intValue < 600) {
                                f2 = intValue - 600;
                                f3 = -0.0012666667f;
                            } else if (intValue <= 1200) {
                                f2 = intValue - 600;
                                f3 = 6.6666704E-5f;
                            }
                            f = 0.96f + (f2 * f3);
                        }
                    }
                }
                f = 1.0f;
            }
            f = 0.0046f * (intValue - 200);
        }
        ((LikeUserInfoAnimOptimizedWidget) aUListenerS94S0100000_5.l0).LJLIL.setScaleX(f);
        ((LikeUserInfoAnimOptimizedWidget) aUListenerS94S0100000_5.l0).LJLIL.setScaleY(f);
    }

    public static final void onAnimationUpdate$71(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        View view = ((C32531Cpj) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view != null) {
            Object animatedValue = anim.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            view.setBackgroundColor(((Integer) animatedValue).intValue());
        }
        View view2 = ((C32531Cpj) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view2 != null) {
            view2.setOutlineProvider(new C32532Cpk((C32531Cpj) aUListenerS94S0100000_5.l0));
        }
        View view3 = ((C32531Cpj) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view3 == null) {
            return;
        }
        view3.setClipToOutline(true);
    }

    public static final void onAnimationUpdate$72(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        View view = ((C32531Cpj) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view != null) {
            Object animatedValue = anim.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            view.setBackgroundColor(((Integer) animatedValue).intValue());
        }
        View view2 = ((C32531Cpj) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view2 != null) {
            view2.setOutlineProvider(new C32534Cpm((C32531Cpj) aUListenerS94S0100000_5.l0));
        }
        View view3 = ((C32531Cpj) aUListenerS94S0100000_5.l0).LJLILLLLZI;
        if (view3 == null) {
            return;
        }
        view3.setClipToOutline(true);
    }

    public static final void onAnimationUpdate$73(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C72431Sbj c72431Sbj = ((C31563Ca7) aUListenerS94S0100000_5.l0).LJZI;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c72431Sbj.setAlpha(((Float) animatedValue).floatValue());
        if (UserLevelBadgeShowEnableSetting.INSTANCE.getValue()) {
            C31470CWs c31470CWs = ((C31563Ca7) aUListenerS94S0100000_5.l0).LJLZ;
            Object animatedValue2 = it.getAnimatedValue();
            o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            c31470CWs.setAlpha(((Float) animatedValue2).floatValue());
        }
    }

    public static final void onAnimationUpdate$74(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C72431Sbj c72431Sbj = ((C31563Ca7) aUListenerS94S0100000_5.l0).LJZI;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c72431Sbj.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$75(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31470CWs c31470CWs = ((C31563Ca7) aUListenerS94S0100000_5.l0).LJLZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c31470CWs.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$76(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        ((View) aUListenerS94S0100000_5.l0).setBackgroundColor(((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    public static final void onAnimationUpdate$77(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator valueAnimator) {
        ((View) aUListenerS94S0100000_5.l0).setBackgroundColor(((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    public static final void onAnimationUpdate$78(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        C29512Bi8 c29512Bi8;
        C31499CXv c31499CXv;
        int left;
        o.LJIIIZ(it, "it");
        C03860De c03860De = (C03860De) aUListenerS94S0100000_5.l0;
        View view = null;
        if (c03860De != null) {
            view = c03860De.LIZIZ;
        }
        if (!(view instanceof C29512Bi8) || (c29512Bi8 = (C29512Bi8) view) == null || (c31499CXv = c29512Bi8.LJLIL) == null) {
            return;
        }
        if (C15380j0.LJIIZILJ()) {
            left = c29512Bi8.getRight();
        } else {
            left = c29512Bi8.getLeft();
        }
        c31499CXv.setMaskEdge(left);
    }

    public static final void onAnimationUpdate$8(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CUV cuv = (CUV) aUListenerS94S0100000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        cuv.LJLJJL = ((Integer) animatedValue).intValue();
        CUV.LIZ((CUV) aUListenerS94S0100000_5.l0);
    }

    public static final void onAnimationUpdate$9(AUListenerS94S0100000_5 aUListenerS94S0100000_5, ValueAnimator animation) {
        float f;
        Float f2;
        o.LJIIIZ(animation, "animation");
        C30870C9q c30870C9q = (C30870C9q) aUListenerS94S0100000_5.l0;
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 2.5f;
        }
        c30870C9q.LJLJJI = f;
        ((C30870C9q) aUListenerS94S0100000_5.l0).invalidate();
    }
}
