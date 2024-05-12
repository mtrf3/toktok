package Y;

import X.AbstractC32678Cs6;
import X.AbstractC73672Svk;
import X.AnonymousClass064;
import X.BAU;
import X.BQW;
import X.BZI;
import X.C03510Bv;
import X.C15380j0;
import X.C15540jG;
import X.C18950ol;
import X.C28787BRn;
import X.C29306Beo;
import X.C29512Bi8;
import X.C29701Eo;
import X.C29727Blb;
import X.C29739Bln;
import X.C29746Blu;
import X.C29747Blv;
import X.C29867Bnr;
import X.C2A4;
import X.C30005Bq5;
import X.C30011BqB;
import X.C30429Bwv;
import X.C31460CWi;
import X.C31463CWl;
import X.C31563Ca7;
import X.C31580CaO;
import X.C31692CcC;
import X.C31699CcJ;
import X.C32727Cst;
import X.C47121t6;
import X.C61447O9r;
import X.C73969T1h;
import X.CKB;
import X.CN1;
import X.CVU;
import X.CVV;
import X.CVW;
import X.CVX;
import X.CX3;
import X.EnumC29732Blg;
import X.InterfaceC29734Bli;
import X.InterfaceC29736Blk;
import X.InterfaceC30442Bx8;
import X.KL2;
import X.UFE;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.RefreshExposureCompensationViewChannel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.programmedlive.model.FollowCard;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.PreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveUserInfoWidget;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileHeaderCell;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ALAdapterS4S0100000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 41:
                onAnimationCancel$0(this, animator);
                return;
            case 42:
                onAnimationCancel$1(this, animator);
                return;
            case 53:
                onAnimationCancel$2(this, animator);
                return;
            case 54:
                onAnimationCancel$3(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
                return;
            case 2:
            case 3:
            case 6:
            case 7:
            case 9:
            case 10:
            case 20:
            case 21:
            case 27:
            case 30:
            case 33:
            case 35:
            case 37:
            case 46:
            case 80:
            default:
                super.onAnimationEnd(animator);
                return;
            case 4:
                onAnimationEnd$1(this, animator);
                return;
            case 5:
                onAnimationEnd$2(this, animator);
                return;
            case 8:
                onAnimationEnd$3(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$4(this, animator);
                return;
            case 12:
                onAnimationEnd$5(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$6(this, animator);
                return;
            case 14:
                onAnimationEnd$7(this, animator);
                return;
            case 15:
                onAnimationEnd$8(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                o.LJIIIZ(animator, "animation");
                return;
            case 17:
                onAnimationEnd$10(this, animator);
                return;
            case 18:
                onAnimationEnd$11(this, animator);
                return;
            case 19:
                onAnimationEnd$12(this, animator);
                return;
            case 22:
                onAnimationEnd$13(this, animator);
                return;
            case 23:
                onAnimationEnd$14(this, animator);
                return;
            case 24:
                onAnimationEnd$15(this, animator);
                return;
            case 25:
                onAnimationEnd$16(this, animator);
                return;
            case 26:
                onAnimationEnd$17(this, animator);
                return;
            case 28:
                onAnimationEnd$18(this, animator);
                return;
            case 29:
                onAnimationEnd$19(this, animator);
                return;
            case 31:
                onAnimationEnd$20(this, animator);
                return;
            case 32:
                onAnimationEnd$21(this, animator);
                return;
            case 34:
                onAnimationEnd$22(this, animator);
                return;
            case 36:
                onAnimationEnd$23(this, animator);
                return;
            case 38:
                onAnimationEnd$24(this, animator);
                return;
            case 39:
                onAnimationEnd$25(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationEnd$26(this, animator);
                return;
            case 41:
                onAnimationEnd$27(this, animator);
                return;
            case 42:
                onAnimationEnd$28(this, animator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationEnd$29(this, animator);
                return;
            case 44:
                o.LJIIIZ(animator, "animation");
                return;
            case 45:
                onAnimationEnd$31(this, animator);
                return;
            case 47:
                onAnimationEnd$32(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onAnimationEnd$33(this, animator);
                return;
            case C61447O9r.LJIIJ:
                onAnimationEnd$34(this, animator);
                return;
            case 50:
                onAnimationEnd$35(this, animator);
                return;
            case 51:
                onAnimationEnd$36(this, animator);
                return;
            case 52:
                super.onAnimationEnd(animator);
                return;
            case 53:
                onAnimationEnd$38(this, animator);
                return;
            case 54:
                onAnimationEnd$39(this, animator);
                return;
            case 55:
                onAnimationEnd$40(this, animator);
                return;
            case 56:
                onAnimationEnd$41(this, animator);
                return;
            case 57:
                onAnimationEnd$42(this, animator);
                return;
            case 58:
                onAnimationEnd$43(this, animator);
                return;
            case 59:
                onAnimationEnd$44(this, animator);
                return;
            case 60:
                onAnimationEnd$45(this, animator);
                return;
            case 61:
                onAnimationEnd$46(this, animator);
                return;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationEnd$47(this, animator);
                return;
            case 63:
                onAnimationEnd$48(this, animator);
                return;
            case 64:
                onAnimationEnd$49(this, animator);
                return;
            case 65:
                onAnimationEnd$50(this, animator);
                return;
            case 66:
                onAnimationEnd$51(this, animator);
                return;
            case 67:
                onAnimationEnd$52(this, animator);
                return;
            case 68:
                onAnimationEnd$53(this, animator);
                return;
            case 69:
                onAnimationEnd$54(this, animator);
                return;
            case 70:
                onAnimationEnd$55(this, animator);
                return;
            case 71:
                onAnimationEnd$56(this, animator);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                onAnimationEnd$57(this, animator);
                return;
            case 73:
                onAnimationEnd$58(this, animator);
                return;
            case 74:
                onAnimationEnd$59(this, animator);
                return;
            case 75:
                onAnimationEnd$60(this, animator);
                return;
            case 76:
                onAnimationEnd$61(this, animator);
                return;
            case 77:
                onAnimationEnd$62(this, animator);
                return;
            case 78:
                onAnimationEnd$63(this, animator);
                return;
            case 79:
                onAnimationEnd$64(this, animator);
                return;
            case 81:
                onAnimationEnd$65(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 2:
                onAnimationStart$1(this, animator);
                return;
            case 3:
                onAnimationStart$2(this, animator);
                return;
            case 6:
                onAnimationStart$3(this, animator);
                return;
            case 7:
                onAnimationStart$4(this, animator);
                return;
            case 9:
                onAnimationStart$5(this, animator);
                return;
            case 10:
                onAnimationStart$6(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationStart$7(this, animator);
                return;
            case 17:
                onAnimationStart$8(this, animator);
                return;
            case 20:
                onAnimationStart$9(this, animator);
                return;
            case 21:
                onAnimationStart$10(this, animator);
                return;
            case 27:
                onAnimationStart$11(this, animator);
                return;
            case 30:
                onAnimationStart$12(this, animator);
                return;
            case 33:
                onAnimationStart$13(this, animator);
                return;
            case 35:
                onAnimationStart$14(this, animator);
                return;
            case 37:
                onAnimationStart$15(this, animator);
                return;
            case 41:
                onAnimationStart$16(this, animator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationStart$17(this, animator);
                return;
            case 44:
                onAnimationStart$18(this, animator);
                return;
            case 46:
                onAnimationStart$19(this, animator);
                return;
            case 52:
                onAnimationStart$20(this, animator);
                return;
            case 53:
                onAnimationStart$21(this, animator);
                return;
            case 54:
                onAnimationStart$22(this, animator);
                return;
            case 59:
                onAnimationStart$23(this, animator);
                return;
            case 60:
                onAnimationStart$24(this, animator);
                return;
            case 65:
                onAnimationStart$25(this, animator);
                return;
            case 67:
                onAnimationStart$26(this, animator);
                return;
            case 69:
                onAnimationStart$27(this, animator);
                return;
            case 71:
                onAnimationStart$28(this, animator);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                onAnimationStart$29(this, animator);
                return;
            case 79:
                onAnimationStart$30(this, animator);
                return;
            case 80:
                onAnimationStart$31(this, animator);
                return;
            case 81:
                onAnimationStart$32(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS4S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        AbstractC32678Cs6 abstractC32678Cs6 = (AbstractC32678Cs6) aLAdapterS4S0100000_5.l0;
        C47121t6 c47121t6 = abstractC32678Cs6.LJLLLL;
        if (c47121t6 != null) {
            if (abstractC32678Cs6.LJZL) {
                i = R.drawable.d3a;
            } else {
                i = R.drawable.d4e;
            }
            c47121t6.setBackgroundResource(i);
        }
        ((AbstractC32678Cs6) aLAdapterS4S0100000_5.l0).LL = false;
    }

    public static final void onAnimationCancel$1(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ImageView imageView = ((C32727Cst) aLAdapterS4S0100000_5.l0).LJLJI;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    public static final void onAnimationCancel$2(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).LJZ(true);
    }

    public static final void onAnimationCancel$3(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).hide();
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(8, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJII);
        ((C29727Blb) aLAdapterS4S0100000_5.l0).LJII.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        float f;
        float f2;
        if (((C29727Blb) aLAdapterS4S0100000_5.l0).LIZIZ == null) {
            return;
        }
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(200L);
        TransitionManager.beginDelayedTransition((ViewGroup) ((C29727Blb) aLAdapterS4S0100000_5.l0).LIZIZ, changeBounds);
        KL2.LJIILLIIL(8, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIJ);
        if (((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIIZZ.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            C29727Blb c29727Blb = (C29727Blb) aLAdapterS4S0100000_5.l0;
            if (c29727Blb.LJJ != 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c29727Blb.LJIIIIZZ.getLayoutParams();
                if (((C29727Blb) aLAdapterS4S0100000_5.l0).LJJ == 3) {
                    f = 6.0f;
                    f2 = 6.0f;
                } else {
                    f = 11.0f;
                    f2 = 10.0f;
                }
                marginLayoutParams.setMarginEnd(C15380j0.LIZ(f));
                marginLayoutParams.setMarginStart(C15380j0.LIZ(f2));
                ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIIZZ.setLayoutParams(marginLayoutParams);
            }
        }
        ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIJ.LIZ(AbstractC73672Svk.LJJIJIL(1).LJIIL(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS39S0101000_13(1, aLAdapterS4S0100000_5, 4)).LJJJJZ());
    }

    public static final void onAnimationEnd$10(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((PublicScreenWidget) aLAdapterS4S0100000_5.l0).LJLJI.setEnabled(true);
    }

    public static final void onAnimationEnd$11(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ((PublicScreenWidget) aLAdapterS4S0100000_5.l0).LJLJJI.start();
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$12(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ((PublicScreenWidget) aLAdapterS4S0100000_5.l0).LJLJI.setVisibility(8);
        if (!(!((PublicScreenWidget) aLAdapterS4S0100000_5.l0).LLIIII.LIZ())) {
            PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aLAdapterS4S0100000_5.l0;
            publicScreenWidget.LLILII(publicScreenWidget.LJLLJ);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$13(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((CommentWidget) aLAdapterS4S0100000_5.l0).LJLJL.setVisibility(8);
    }

    public static final void onAnimationEnd$14(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((View) aLAdapterS4S0100000_5.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$15(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        View view = ((DrawerFeedLiveFragmentV2) aLAdapterS4S0100000_5.l0).LJLJI;
        if (view != null) {
            view.setVisibility(8);
        }
        ((DrawerFeedLiveFragmentV2) aLAdapterS4S0100000_5.l0).LJLLILLLL = false;
    }

    public static final void onAnimationEnd$16(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ((DrawerFeedLiveFragmentV2) aLAdapterS4S0100000_5.l0).LJLLILLLL = false;
    }

    public static final void onAnimationEnd$17(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = (LiveRoomNotifyWidget) ((ARunnableS41S0100000_5) aLAdapterS4S0100000_5.l0).l0;
        View view = liveRoomNotifyWidget.LJLJJL;
        if (view == null) {
            return;
        }
        view.postDelayed(liveRoomNotifyWidget.LLF, 2000L);
    }

    public static final void onAnimationEnd$18(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C15540jG c15540jG = ((DrawGuessCanvasWidget) aLAdapterS4S0100000_5.l0).LJLJLJ;
        if (c15540jG != null) {
            c15540jG.LJ();
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super/*com.bytedance.ies.sdk.widgets.LiveWidget*/.hide();
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(8, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJII);
        ((C29727Blb) aLAdapterS4S0100000_5.l0).LJII.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$20(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((LikeUserInfoAnimWidget) aLAdapterS4S0100000_5.l0).LJLLJ.setVisibility(4);
    }

    public static final void onAnimationEnd$21(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((SelfLikeViewOptimizedWidget) aLAdapterS4S0100000_5.l0).LJLJJI;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        } else {
            o.LJIJI("flowerAnimation");
            throw null;
        }
    }

    public static final void onAnimationEnd$22(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ProgrammedLiveUserInfoWidget programmedLiveUserInfoWidget = (ProgrammedLiveUserInfoWidget) aLAdapterS4S0100000_5.l0;
        programmedLiveUserInfoWidget.LLJILJILJ.LJJIFFI = false;
        programmedLiveUserInfoWidget.LLJI(true);
        C29306Beo.LJJLJLI(((ProgrammedLiveUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJLL);
        C29306Beo.LJJLJLI(((ProgrammedLiveUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJI);
    }

    public static final void onAnimationEnd$23(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0;
        C29727Blb c29727Blb = clearScreenUserInfoWidget.LLJILJILJ;
        if (c29727Blb != null) {
            c29727Blb.LJJIFFI = false;
        }
        clearScreenUserInfoWidget.LLJI(true);
        ((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LLILLJJLI(false);
        C29306Beo.LJJLJLI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJLL);
        C29306Beo.LJJLJLI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJI);
        ClearScreenUserInfoWidget clearScreenUserInfoWidget2 = (ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0;
        if (clearScreenUserInfoWidget2.LLFII()) {
            return;
        }
        if (!clearScreenUserInfoWidget2.LLILL && clearScreenUserInfoWidget2.LLFF == 0) {
            clearScreenUserInfoWidget2.LLIILZL();
        } else {
            clearScreenUserInfoWidget2.LLIIZ(clearScreenUserInfoWidget2.LLIFFJFJJ);
        }
    }

    public static final void onAnimationEnd$24(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0;
        KL2.LJIILLIIL(clearScreenUserInfoWidget.LLLF, clearScreenUserInfoWidget.LJLJL);
        ClearScreenUserInfoWidget clearScreenUserInfoWidget2 = (ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0;
        KL2.LJIILLIIL(clearScreenUserInfoWidget2.LLLFF, clearScreenUserInfoWidget2.LJLLI);
        ClearScreenUserInfoWidget clearScreenUserInfoWidget3 = (ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0;
        KL2.LJIILLIIL(clearScreenUserInfoWidget3.LLLFZ, clearScreenUserInfoWidget3.LJLLLLLL);
        ClearScreenUserInfoWidget clearScreenUserInfoWidget4 = (ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0;
        KL2.LJIILLIIL(clearScreenUserInfoWidget4.LLFF, clearScreenUserInfoWidget4.LJZI);
    }

    public static final void onAnimationEnd$25(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((ARunnableS41S0100000_5) aLAdapterS4S0100000_5.l0).l0;
        C29727Blb c29727Blb = liveRoomUserInfoWidget.LLJILJILJ;
        if (c29727Blb == null || !c29727Blb.LJJIFFI) {
            KL2.LJIILLIIL(8, liveRoomUserInfoWidget.LJLLLLLL);
        } else {
            liveRoomUserInfoWidget.LLIIII();
        }
    }

    public static final void onAnimationEnd$26(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        View view;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((ARunnableS41S0100000_5) aLAdapterS4S0100000_5.l0).l0;
        liveRoomUserInfoWidget.LLF = false;
        if (liveRoomUserInfoWidget.LLILL) {
            View view2 = liveRoomUserInfoWidget.LLI;
            if (view2 == liveRoomUserInfoWidget.LJZI) {
                liveRoomUserInfoWidget.LLIIL(5);
            } else if (view2 == liveRoomUserInfoWidget.LLJIJIL || view2 == liveRoomUserInfoWidget.LJLLLLLL) {
                liveRoomUserInfoWidget.LLIILII(false);
            }
        } else if (liveRoomUserInfoWidget.LLFZ == liveRoomUserInfoWidget.LJZI && ((view = liveRoomUserInfoWidget.LLI) == liveRoomUserInfoWidget.LLJIJIL || view == liveRoomUserInfoWidget.LJLLLLLL)) {
            liveRoomUserInfoWidget.LLIILZL();
        }
        ((LiveRoomUserInfoWidget) ((ARunnableS41S0100000_5) aLAdapterS4S0100000_5.l0).l0).LLFF();
    }

    public static final void onAnimationEnd$27(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        AbstractC32678Cs6 abstractC32678Cs6 = (AbstractC32678Cs6) aLAdapterS4S0100000_5.l0;
        C47121t6 c47121t6 = abstractC32678Cs6.LJLLLL;
        if (c47121t6 != null) {
            if (abstractC32678Cs6.LJZL) {
                i = R.drawable.d3a;
            } else {
                i = R.drawable.d4e;
            }
            c47121t6.setBackgroundResource(i);
        }
        ((AbstractC32678Cs6) aLAdapterS4S0100000_5.l0).LL = false;
    }

    public static final void onAnimationEnd$28(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ImageView imageView = ((C32727Cst) aLAdapterS4S0100000_5.l0).LJLJI;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    public static final void onAnimationEnd$29(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        BAU bau = ((DrawGuessStatusWidget) aLAdapterS4S0100000_5.l0).LJLJLJ;
        if (bau != null) {
            bau.start();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(8, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIIZZ);
    }

    public static final void onAnimationEnd$31(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((C29867Bnr) aLAdapterS4S0100000_5.l0).LIZLLL();
    }

    public static final void onAnimationEnd$32(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        MicRoomUserInfoWidget micRoomUserInfoWidget = (MicRoomUserInfoWidget) aLAdapterS4S0100000_5.l0;
        C29727Blb c29727Blb = micRoomUserInfoWidget.LLFFF;
        if (c29727Blb != null) {
            c29727Blb.LJJIFFI = false;
        }
        micRoomUserInfoWidget.LLFII(true);
    }

    public static final void onAnimationEnd$33(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        CX3 cx3 = ((C31580CaO) aLAdapterS4S0100000_5.l0).LJJLIIIJ;
        if (cx3 != null) {
            cx3.LIZ();
        }
    }

    public static final void onAnimationEnd$34(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C31580CaO c31580CaO = (C31580CaO) aLAdapterS4S0100000_5.l0;
        c31580CaO.LJJLI = 0;
        c31580CaO.LJJL = 255;
        String str = c31580CaO.LJJLIIIIJ;
        if (str != null) {
            c31580CaO.LJJJLZIJ = str;
        }
        c31580CaO.LJJLIIIIJ = null;
        CX3 cx3 = c31580CaO.LJJLIIIJ;
        if (cx3 != null) {
            cx3.LIZ();
        }
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$35(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C31580CaO c31580CaO = (C31580CaO) aLAdapterS4S0100000_5.l0;
        c31580CaO.LJJLI = 0;
        c31580CaO.LJJL = 255;
        String str = c31580CaO.LJJLIIIIJ;
        if (str != null) {
            c31580CaO.LJJJLZIJ = str;
        }
        c31580CaO.LJJLIIIIJ = null;
        CX3 cx3 = c31580CaO.LJJLIIIJ;
        if (cx3 != null) {
            cx3.LIZ();
        }
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$36(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        View view;
        String str;
        o.LJIIIZ(animation, "animation");
        C30429Bwv c30429Bwv = (C30429Bwv) aLAdapterS4S0100000_5.l0;
        if (c30429Bwv.LJLLJ && (view = c30429Bwv.getView()) != null && view.getVisibility() == 0) {
            View view2 = ((C30429Bwv) aLAdapterS4S0100000_5.l0).getView();
            if (view2 != null) {
                view2.setVisibility(8);
            }
            DataChannel dataChannel = ((C30429Bwv) aLAdapterS4S0100000_5.l0).getDataChannel();
            if (dataChannel != null) {
                dataChannel.rv0(RefreshExposureCompensationViewChannel.class, Boolean.FALSE);
            }
            if (((C30429Bwv) aLAdapterS4S0100000_5.l0).LJLLL != 0) {
                BZI LIZ = C28787BRn.LIZ("livesdk_live_focus_exposure_adjust");
                LIZ.LJIILLIIL(((C30429Bwv) aLAdapterS4S0100000_5.l0).getDataChannel());
                LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
                LIZ.LJIJJ(0, "is_dual_camera");
                Integer LIZIZ = InterfaceC30442Bx8.LJIIIZ.LIZIZ();
                if (LIZIZ == null || LIZIZ.intValue() != 1) {
                    str = "back";
                } else {
                    str = "front";
                }
                LIZ.LJIJJ(str, "camera_type");
                UFE.LIZIZ(((C30429Bwv) aLAdapterS4S0100000_5.l0).LJLLL, LIZ, "adjusted_exp");
            }
        }
    }

    public static final void onAnimationEnd$38(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        long j;
        Long l;
        o.LJIIIZ(animation, "animation");
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).LJZ(true);
        Handler LJZL = ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).LJZL();
        FollowCard followCard = ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).LJLLILLLL;
        if (followCard != null && (l = followCard.duration) != null) {
            j = l.longValue();
        } else {
            j = 5000;
        }
        LJZL.sendEmptyMessageDelayed(2, j);
    }

    public static final void onAnimationEnd$39(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).hide();
    }

    public static final void onAnimationEnd$4(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        if (((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIZ.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            C29727Blb c29727Blb = (C29727Blb) aLAdapterS4S0100000_5.l0;
            if (c29727Blb.LJJ != 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c29727Blb.LJIIIZ.getLayoutParams();
                int i = ((C29727Blb) aLAdapterS4S0100000_5.l0).LJJ;
                if (i == 1) {
                    marginLayoutParams.setMarginEnd(C15380j0.LIZ(9.0f));
                } else if (i == 3) {
                    marginLayoutParams.setMarginStart(C15380j0.LIZ(6.0f));
                    marginLayoutParams.setMarginEnd(C15380j0.LIZ(6.0f));
                }
                ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIZ.setLayoutParams(marginLayoutParams);
            }
        }
        KL2.LJIILLIIL(8, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIJ);
        if (((C29727Blb) aLAdapterS4S0100000_5.l0).LIZIZ == null) {
            return;
        }
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(200L);
        TransitionManager.beginDelayedTransition((ViewGroup) ((C29727Blb) aLAdapterS4S0100000_5.l0).LIZIZ, changeBounds);
        ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIJ.LIZ(AbstractC73672Svk.LJJIJIL(1).LJIIL(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS36S0101000_5(2, aLAdapterS4S0100000_5, 52)).LJJJJZ());
    }

    public static final void onAnimationEnd$40(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0).LLFF(R.plurals.nz);
        ((PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0).LJLJJLL = BQW.L1_TASK_KEY.getKey();
        ((PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0).LL();
        ((PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0).LLFZ(false);
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.25f, 0.46f, 0.45f, 0.94f);
        o.LJIIIIZZ(LIZIZ, "create(0.25f, 0.46f, 0.45f, 0.94f)");
        PreviewLevelUpNotifyWidget previewLevelUpNotifyWidget = (PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0;
        ObjectAnimator LLFFF = previewLevelUpNotifyWidget.LLFFF(previewLevelUpNotifyWidget.LJLJLLL, false, LIZIZ, 250L, 0L);
        PreviewLevelUpNotifyWidget previewLevelUpNotifyWidget2 = (PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0;
        ObjectAnimator LLFFF2 = previewLevelUpNotifyWidget2.LLFFF(previewLevelUpNotifyWidget2.LJLLI, false, LIZIZ, 250L, 0L);
        AnimatorSet animatorSet = ((PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0).LJLLILLLL;
        if (animatorSet != null) {
            animatorSet.playTogether(LLFFF, LLFFF2);
        }
        AnimatorSet animatorSet2 = ((PreviewLevelUpNotifyWidget) aLAdapterS4S0100000_5.l0).LJLLILLLL;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final void onAnimationEnd$41(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29306Beo.LJI((View) aLAdapterS4S0100000_5.l0);
    }

    public static final void onAnimationEnd$42(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ((LiveRoomNotifyWidget) aLAdapterS4S0100000_5.l0).hide();
        ((LiveRoomNotifyWidget) aLAdapterS4S0100000_5.l0).LJLLJ = null;
        CKB.INSTANCE.onMessageFinish();
        DataChannel dataChannel = ((LiveRoomNotifyWidget) aLAdapterS4S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
    }

    public static final void onAnimationEnd$43(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ((LiveRoomNotifyWidget) aLAdapterS4S0100000_5.l0).hide();
        ((LiveRoomNotifyWidget) aLAdapterS4S0100000_5.l0).LJLLJ = null;
        CKB.INSTANCE.onMessageFinish();
        DataChannel dataChannel = ((LiveRoomNotifyWidget) aLAdapterS4S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
    }

    public static final void onAnimationEnd$44(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS4S0100000_5.l0).updateBitmap("image_4", null);
    }

    public static final void onAnimationEnd$45(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ((PublicScreenWidget) aLAdapterS4S0100000_5.l0).LJLJJI.start();
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$46(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        KL2.LJIILLIIL(0, ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIIZILJ);
    }

    public static final void onAnimationEnd$47(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(300L);
        TransitionManager.beginDelayedTransition(((C29739Bln) aLAdapterS4S0100000_5.l0).LJIIIZ, changeBounds);
        KL2.LJIILLIIL(8, ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIIZILJ);
        InterfaceC29736Blk interfaceC29736Blk = ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIIJJI;
        if (interfaceC29736Blk != null) {
            ((C29727Blb) interfaceC29736Blk).LJ();
        }
    }

    public static final void onAnimationEnd$48(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        Rect rect = new Rect();
        ImageView imageView = ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIILL;
        if (imageView != null) {
            imageView.getGlobalVisibleRect(rect);
        }
        Rect rect2 = new Rect();
        ImageView imageView2 = ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIILJJIL;
        if (imageView2 != null) {
            imageView2.getGlobalVisibleRect(rect2);
        }
        KL2.LJIILLIIL(0, ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIILJJIL);
        KL2.LJIILLIIL(4, ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIILL);
        KL2.LJIILLIIL(0, ((C29739Bln) aLAdapterS4S0100000_5.l0).LJIILLIIL);
        C29739Bln c29739Bln = (C29739Bln) aLAdapterS4S0100000_5.l0;
        float f = rect.left - rect2.left;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c29739Bln.LJIILLIIL, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c29739Bln.LJIILJJIL, (Property<ImageView, Float>) View.TRANSLATION_X, f, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addListener(new ALAdapterS4S0100000_5(c29739Bln, 64));
        AnimatorSet animatorSet = new AnimatorSet();
        c29739Bln.LJIJJ = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        AnimatorSet animatorSet2 = c29739Bln.LJIJJ;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final void onAnimationEnd$49(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C29739Bln) aLAdapterS4S0100000_5.l0).LJII(EnumC29732Blg.FANS_CLUB_ANCHOR);
    }

    public static final void onAnimationEnd$5(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        C29727Blb c29727Blb = (C29727Blb) aLAdapterS4S0100000_5.l0;
        c29727Blb.getClass();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(200L);
        TransitionManager.beginDelayedTransition((ViewGroup) c29727Blb.LIZIZ, changeBounds);
        KL2.LJIILLIIL(8, c29727Blb.LJ);
        if (!c29727Blb.LJIILLIIL) {
            KL2.LJIILLIIL(8, c29727Blb.LJFF);
        }
        KL2.LJIILLIIL(4, c29727Blb.LJIIIIZZ);
        KL2.LJIILLIIL(4, c29727Blb.LJIIJ);
        if (!c29727Blb.LJJIJIIJI) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(c29727Blb.LJII, (Property<C2A4, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(200L);
            duration.addListener(new ALAdapterS4S0100000_5(c29727Blb, 1));
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(c29727Blb.LJIIIIZZ, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(300L);
            duration2.setInterpolator(C18950ol.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
            duration2.addListener(new ALAdapterS4S0100000_5(c29727Blb, 2));
            duration2.setStartDelay(200L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(c29727Blb.LJIIIIZZ, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(300L);
            duration3.setInterpolator(C18950ol.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
            duration3.setStartDelay(200L);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(c29727Blb.LJIIJ, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L);
            duration4.setStartDelay(200L);
            duration4.addListener(new ALAdapterS4S0100000_5(c29727Blb, 3));
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(c29727Blb.LJIIJ, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(150L);
            duration5.setStartDelay(3200L);
            duration5.addListener(new ALAdapterS4S0100000_5(c29727Blb, 4));
            AnimatorSet animatorSet = new AnimatorSet();
            c29727Blb.LJIJJ = animatorSet;
            animatorSet.playTogether(duration, duration2, duration3, duration4, duration5);
            c29727Blb.LJIJJ.start();
            return;
        }
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(c29727Blb.LJII, (Property<C2A4, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(200L);
        duration6.addListener(new ALAdapterS4S0100000_5(c29727Blb, 5));
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(c29727Blb.LJIIIIZZ, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(300L);
        duration7.setInterpolator(C18950ol.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
        duration7.addListener(new ALAdapterS4S0100000_5(c29727Blb, 6));
        duration7.setStartDelay(200L);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(c29727Blb.LJIIIIZZ, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(300L);
        duration8.setInterpolator(C18950ol.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
        duration8.setStartDelay(200L);
        ObjectAnimator duration9 = ObjectAnimator.ofFloat(c29727Blb.LJIIJ, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L);
        duration9.setStartDelay(200L);
        duration9.addListener(new ALAdapterS4S0100000_5(c29727Blb, 7));
        AnimatorSet animatorSet2 = new AnimatorSet();
        c29727Blb.LJIJJ = animatorSet2;
        animatorSet2.playTogether(duration6, duration7, duration8, duration9);
        c29727Blb.LJIJJ.start();
    }

    public static final void onAnimationEnd$50(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$51(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(300L);
        TransitionManager.beginDelayedTransition(((C29746Blu) aLAdapterS4S0100000_5.l0).LJIIIZ, changeBounds);
        KL2.LJIILLIIL(8, ((C29746Blu) aLAdapterS4S0100000_5.l0).LJIL);
        InterfaceC29736Blk interfaceC29736Blk = ((C29746Blu) aLAdapterS4S0100000_5.l0).LJIIJJI;
        if (interfaceC29736Blk != null) {
            ((C29727Blb) interfaceC29736Blk).LJ();
        }
        ((C29746Blu) aLAdapterS4S0100000_5.l0).LJJIIJ.LIZ(AbstractC73672Svk.LJJIJIL(1).LJIIL(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS57S0100000_5((C29746Blu) aLAdapterS4S0100000_5.l0, 314)).LJJJJZ());
    }

    public static final void onAnimationEnd$52(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$53(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C15540jG c15540jG = ((C29746Blu) aLAdapterS4S0100000_5.l0).LJJIIZI;
        if (c15540jG != null) {
            c15540jG.LIZ();
        }
        C29746Blu c29746Blu = (C29746Blu) aLAdapterS4S0100000_5.l0;
        c29746Blu.LJJIIZI = null;
        KL2.LJIILLIIL(0, c29746Blu.LJIILL);
        KL2.LJIILLIIL(8, ((C29746Blu) aLAdapterS4S0100000_5.l0).LJIJI);
        C29747Blv c29747Blv = ((C29746Blu) aLAdapterS4S0100000_5.l0).LJJIJ;
        if (c29747Blv != null) {
            c29747Blv.LIZ();
        }
    }

    public static final void onAnimationEnd$54(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29747Blv c29747Blv = ((C29746Blu) aLAdapterS4S0100000_5.l0).LJJIJ;
        if (c29747Blv != null) {
            c29747Blv.LIZ();
        }
    }

    public static final void onAnimationEnd$55(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29747Blv c29747Blv = ((C29746Blu) aLAdapterS4S0100000_5.l0).LJJIJ;
        if (c29747Blv != null) {
            c29747Blv.LIZ();
        }
    }

    public static final void onAnimationEnd$56(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((LikeUserInfoAnimOptimizedWidget) aLAdapterS4S0100000_5.l0).LJLLL.setVisibility(8);
    }

    public static final void onAnimationEnd$57(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((LikeUserInfoAnimWidget) aLAdapterS4S0100000_5.l0).LJLLL.setVisibility(8);
    }

    public static final void onAnimationEnd$58(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C30011BqB) aLAdapterS4S0100000_5.l0).LIZ;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(4);
        } else {
            o.LJIJI("bubblesAnimation");
            throw null;
        }
    }

    public static final void onAnimationEnd$59(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C30005Bq5) aLAdapterS4S0100000_5.l0).LIZ;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        } else {
            o.LJIJI("flowerAnimation");
            throw null;
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((GradientDrawable) ((C29727Blb) aLAdapterS4S0100000_5.l0).LIZLLL.getBackground()).setColor(((C29727Blb) aLAdapterS4S0100000_5.l0).LJIL.getResources().getColor(R.color.abc));
    }

    public static final void onAnimationEnd$60(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C31563Ca7) aLAdapterS4S0100000_5.l0).LJZI.setVisibility(8);
        ((C31563Ca7) aLAdapterS4S0100000_5.l0).LJLZ.setVisibility(8);
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$61(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C31563Ca7) aLAdapterS4S0100000_5.l0).LJZI.setVisibility(0);
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$62(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C31563Ca7) aLAdapterS4S0100000_5.l0).LJLZ.setVisibility(0);
        ((C31563Ca7) aLAdapterS4S0100000_5.l0).LJLZ.setAlpha(1.0f);
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$63(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C31563Ca7) aLAdapterS4S0100000_5.l0).LJZL.setVisibility(0);
    }

    public static final void onAnimationEnd$64(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        CVX cvx = ((CVU) aLAdapterS4S0100000_5.l0).LLIIIJ;
        if (cvx != null) {
            cvx.LIZIZ();
        }
    }

    public static final void onAnimationEnd$65(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        View view = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LLFZ;
        if (view != null) {
            anonymousClass064.LJII((ConstraintLayout) view);
            anonymousClass064.LJI(R.id.mzv, 7);
            anonymousClass064.LJIIIZ(R.id.h1c, 7, R.id.o4, 6, C15380j0.LIZ(16.0f));
            View view2 = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LLFZ;
            if (view2 != null) {
                anonymousClass064.LIZIZ((ConstraintLayout) view2);
                LiveIconView liveIconView = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LJLLL;
                if (liveIconView != null) {
                    ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
                    layoutParams.width = C15380j0.LIZ(16.0f);
                    layoutParams.height = C15380j0.LIZ(16.0f);
                    liveIconView.setLayoutParams(layoutParams);
                }
                C47121t6 c47121t6 = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LJLLLL;
                if (c47121t6 != null) {
                    c47121t6.setAlpha(0.0f);
                }
                C29306Beo.LJI(((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LJLLLL);
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public static final void onAnimationEnd$7(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(8, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJII);
        ((C29727Blb) aLAdapterS4S0100000_5.l0).LJII.setAlpha(1.0f);
        KL2.LJIILLIIL(8, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJ);
        InterfaceC29734Bli interfaceC29734Bli = ((C29727Blb) aLAdapterS4S0100000_5.l0).LJJIIZ;
        if (interfaceC29734Bli != null) {
            interfaceC29734Bli.LJIIJ();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C31460CWi c31460CWi = ((C31463CWl) aLAdapterS4S0100000_5.l0).LJJLIIIIJ;
        if (c31460CWi != null) {
            c31460CWi.invalidate();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(0, (View) aLAdapterS4S0100000_5.l0);
    }

    public static final void onAnimationStart$1(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(0, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIIZZ);
    }

    public static final void onAnimationStart$10(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ImageView imageView = ((C31699CcJ) aLAdapterS4S0100000_5.l0).LJLLI;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(4);
    }

    public static final void onAnimationStart$11(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        for (View view : (View[]) aLAdapterS4S0100000_5.l0) {
            C29306Beo.LJJLJLI(view);
        }
    }

    public static final void onAnimationStart$12(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        View view = ((DrawGuessStatusWidget) aLAdapterS4S0100000_5.l0).getView();
        if (view != null) {
            view.setAlpha(0.0f);
        }
        super/*com.bytedance.ies.sdk.widgets.LiveWidget*/.show();
    }

    public static final void onAnimationStart$13(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29727Blb c29727Blb = ((ProgrammedLiveUserInfoWidget) aLAdapterS4S0100000_5.l0).LLJILJILJ;
        c29727Blb.LJJIFFI = true;
        ImageView imageView = c29727Blb.LJJII;
        if (imageView != null) {
            KL2.LJIILLIIL(8, imageView);
        }
        ((ProgrammedLiveUserInfoWidget) aLAdapterS4S0100000_5.l0).LLJI(false);
        C29306Beo.LJI(((ProgrammedLiveUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJLL);
        C29306Beo.LJI(((ProgrammedLiveUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJI);
    }

    public static final void onAnimationStart$14(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        ((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LLJI(false);
        C29727Blb c29727Blb = ((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LLJILJILJ;
        if (c29727Blb != null) {
            c29727Blb.LJJIFFI = true;
            ImageView imageView = c29727Blb.LJJII;
            if (imageView != null) {
                KL2.LJIILLIIL(8, imageView);
            }
        }
        ((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LLILLJJLI(true);
        C29306Beo.LJI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJLL);
        C29306Beo.LJI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJJI);
        ((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LLILII();
    }

    public static final void onAnimationStart$15(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        C29306Beo.LJI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLJL);
        C29306Beo.LJI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLLI);
        C29306Beo.LJI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJLLLLLL);
        C29306Beo.LJI(((ClearScreenUserInfoWidget) aLAdapterS4S0100000_5.l0).LJZI);
    }

    public static final void onAnimationStart$16(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        AbstractC32678Cs6 abstractC32678Cs6 = (AbstractC32678Cs6) aLAdapterS4S0100000_5.l0;
        abstractC32678Cs6.LL = true;
        C47121t6 c47121t6 = abstractC32678Cs6.LJLLLL;
        if (c47121t6 != null) {
            if (abstractC32678Cs6.LJZL) {
                i = R.drawable.d3a;
            } else {
                i = R.drawable.d39;
            }
            c47121t6.setBackgroundResource(i);
        }
    }

    public static final void onAnimationStart$17(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        View view = ((DrawGuessStatusWidget) aLAdapterS4S0100000_5.l0).getView();
        if (view != null) {
            view.setAlpha(0.0f);
        }
        ((DrawGuessStatusWidget) aLAdapterS4S0100000_5.l0).show();
        DrawGuessStatusWidget drawGuessStatusWidget = (DrawGuessStatusWidget) aLAdapterS4S0100000_5.l0;
        drawGuessStatusWidget.LJLL = true;
        DrawGuessStatusWidget.LLIIIJ(drawGuessStatusWidget);
    }

    public static final void onAnimationStart$18(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ViewGroup) aLAdapterS4S0100000_5.l0).setPivotX(C15380j0.LIZ(35.0f));
        ((ViewGroup) aLAdapterS4S0100000_5.l0).setPivotY(C15380j0.LIZ(35.0f));
    }

    public static final void onAnimationStart$19(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29727Blb c29727Blb = ((MicRoomUserInfoWidget) aLAdapterS4S0100000_5.l0).LLFFF;
        if (c29727Blb != null) {
            c29727Blb.LJJIFFI = true;
            ImageView imageView = c29727Blb.LJJII;
            if (imageView != null) {
                KL2.LJIILLIIL(8, imageView);
            }
        }
        ((MicRoomUserInfoWidget) aLAdapterS4S0100000_5.l0).LLFII(false);
    }

    public static final void onAnimationStart$2(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(0, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIJ);
    }

    public static final void onAnimationStart$20(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationStart(animator);
        LiveIconView liveIconView = ((C31692CcC) ((AObserverS36S0400000_5) aLAdapterS4S0100000_5.l0).l3).LJLJJLL;
        if (liveIconView != null) {
            liveIconView.setVisibility(4);
        }
    }

    public static final void onAnimationStart$21(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).show();
    }

    public static final void onAnimationStart$22(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_5.l0).LJZ(false);
    }

    public static final void onAnimationStart$23(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS4S0100000_5.l0).playAnimation();
    }

    public static final void onAnimationStart$24(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationStart(animator);
        ((PublicScreenWidget) aLAdapterS4S0100000_5.l0).LJLJI.setEnabled(false);
    }

    public static final void onAnimationStart$25(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        KL2.LJIILLIIL(0, ((C29746Blu) aLAdapterS4S0100000_5.l0).LJIL);
    }

    public static final void onAnimationStart$26(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        KL2.LJIILLIIL(0, ((C29746Blu) aLAdapterS4S0100000_5.l0).LJJ);
        super.onAnimationStart(animation);
    }

    public static final void onAnimationStart$27(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        KL2.LJIILLIIL(0, ((C29746Blu) aLAdapterS4S0100000_5.l0).LJJ);
        super.onAnimationStart(animation);
    }

    public static final void onAnimationStart$28(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationStart(animator);
        ((LikeUserInfoAnimOptimizedWidget) aLAdapterS4S0100000_5.l0).LJLLL.setVisibility(0);
    }

    public static final void onAnimationStart$29(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationStart(animator);
        ((LikeUserInfoAnimWidget) aLAdapterS4S0100000_5.l0).LJLLL.setVisibility(0);
    }

    public static final void onAnimationStart$3(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(0, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIIZZ);
    }

    public static final void onAnimationStart$30(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        CVX cvx = ((CVU) aLAdapterS4S0100000_5.l0).LLIIIJ;
        if (cvx != null) {
            cvx.LIZ();
        }
    }

    public static final void onAnimationStart$31(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        LiveProfileHeaderCell liveProfileHeaderCell = (LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0;
        C29512Bi8 c29512Bi8 = liveProfileHeaderCell.LJLLJ;
        if (c29512Bi8 != null) {
            CVU cvu = new CVU();
            cvu.LLIIIJ = new CVV(liveProfileHeaderCell);
            C03510Bv.LIZ(c29512Bi8, cvu);
        }
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        View view = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LLFZ;
        if (view != null) {
            anonymousClass064.LJII((ConstraintLayout) view);
            anonymousClass064.LJI(R.id.mzv, 7);
            anonymousClass064.LJIIIZ(R.id.h1c, 7, R.id.d2z, 6, C15380j0.LIZ(16.0f));
            View view2 = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LLFZ;
            if (view2 != null) {
                anonymousClass064.LIZIZ((ConstraintLayout) view2);
                LiveIconView liveIconView = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LJLLL;
                if (liveIconView != null) {
                    ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
                    layoutParams.width = C15380j0.LIZ(14.0f);
                    layoutParams.height = C15380j0.LIZ(14.0f);
                    liveIconView.setLayoutParams(layoutParams);
                }
                C47121t6 c47121t6 = ((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LJLLLL;
                if (c47121t6 != null) {
                    c47121t6.setAlpha(0.0f);
                }
                C29306Beo.LJJLJLI(((LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0).LJLLLL);
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public static final void onAnimationStart$32(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        LiveProfileHeaderCell liveProfileHeaderCell = (LiveProfileHeaderCell) aLAdapterS4S0100000_5.l0;
        C29512Bi8 c29512Bi8 = liveProfileHeaderCell.LJLLJ;
        if (c29512Bi8 != null) {
            CVU cvu = new CVU();
            cvu.LLIIIJ = new CVW(liveProfileHeaderCell);
            C03510Bv.LIZ(c29512Bi8, cvu);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(0, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIJ);
        if (((C29727Blb) aLAdapterS4S0100000_5.l0).LIZIZ == null) {
            return;
        }
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(200L);
        TransitionManager.beginDelayedTransition((ViewGroup) ((C29727Blb) aLAdapterS4S0100000_5.l0).LIZIZ, changeBounds);
        ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIJ.LIZ(AbstractC73672Svk.LJJIJIL(1).LJIIL(3200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS36S0101000_5(1, aLAdapterS4S0100000_5, 53)).LJJJJZ());
    }

    public static final void onAnimationStart$5(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationStart(animator);
        ((ImageView) aLAdapterS4S0100000_5.l0).setScaleX(0.0f);
        ((ImageView) aLAdapterS4S0100000_5.l0).setScaleY(0.0f);
        ((ImageView) aLAdapterS4S0100000_5.l0).setAlpha(0.5f);
    }

    public static final void onAnimationStart$6(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        KL2.LJIILLIIL(0, ((C29727Blb) aLAdapterS4S0100000_5.l0).LJIIIZ);
    }

    public static final void onAnimationStart$7(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ViewGroup) aLAdapterS4S0100000_5.l0).setPivotX(C15380j0.LIZ(35.0f));
        ((ViewGroup) aLAdapterS4S0100000_5.l0).setPivotY(C15380j0.LIZ(35.0f));
    }

    public static final void onAnimationStart$8(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aLAdapterS4S0100000_5.l0;
        publicScreenWidget.getClass();
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_mention_remind_show")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_mention_remind_show");
            LIZ.LJIILLIIL(publicScreenWidget.dataChannel);
            LIZ.LJJIIJZLJL();
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$9(ALAdapterS4S0100000_5 aLAdapterS4S0100000_5, Animator animator) {
        super.onAnimationStart(animator);
        ImageView imageView = ((BottomLeftSlotWidget) aLAdapterS4S0100000_5.l0).LJLILLLLZI;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }
}
