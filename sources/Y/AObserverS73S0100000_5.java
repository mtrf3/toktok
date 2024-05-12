package Y;

import X.AbstractC19190p9;
import X.AbstractC32579CqV;
import X.AbstractC32698CsQ;
import X.BEA;
import X.BEC;
import X.BJI;
import X.BML;
import X.BOD;
import X.BV8;
import X.BVB;
import X.BZI;
import X.C006900z;
import X.C011602u;
import X.C05170If;
import X.C06900Ow;
import X.C0A2;
import X.C0NB;
import X.C0Y4;
import X.C15380j0;
import X.C15510jD;
import X.C15610jN;
import X.C16880lQ;
import X.C17190lv;
import X.C1FL;
import X.C28787BRn;
import X.C29000BZs;
import X.C29296Bee;
import X.C29306Beo;
import X.C29401Dk;
import X.C29420Bge;
import X.C29494Bhq;
import X.C29602Bja;
import X.C29701Eo;
import X.C2A4;
import X.C2A7;
import X.C30796C6u;
import X.C30797C6v;
import X.C30868C9o;
import X.C30896CAq;
import X.C31353CSf;
import X.C31689Cc9;
import X.C31692CcC;
import X.C31735Cct;
import X.C31747Cd5;
import X.C31811Ce7;
import X.C32112Ciy;
import X.C32129CjF;
import X.C32137CjN;
import X.C32314CmE;
import X.C32444CoK;
import X.C32537Cpp;
import X.C32553Cq5;
import X.C32561CqD;
import X.C32567CqJ;
import X.C32570CqM;
import X.C32571CqN;
import X.C32650Cre;
import X.C32658Crm;
import X.C32676Cs4;
import X.C32681Cs9;
import X.C32696CsO;
import X.C32713Csf;
import X.C32733Csz;
import X.C32748CtE;
import X.C32785Ctp;
import X.C32793Ctx;
import X.C32796Cu0;
import X.C32805Cu9;
import X.C32822CuQ;
import X.C32839Cuh;
import X.C36636EZk;
import X.C47061t0;
import X.C47121t6;
import X.C48459J0d;
import X.C61447O9r;
import X.C73026SlK;
import X.C76824UDc;
import X.C76825UDd;
import X.C76841UDt;
import X.C77348UXg;
import X.C77446UaQ;
import X.C78895Uxn;
import X.C79359VCp;
import X.CCC;
import X.CCI;
import X.CFX;
import X.CN1;
import X.CRD;
import X.CSH;
import X.CVC;
import X.CVE;
import X.CVG;
import X.CVI;
import X.CVJ;
import X.CVT;
import X.CZM;
import X.CZN;
import X.CZO;
import X.CZP;
import X.CZR;
import X.CZT;
import X.CZV;
import X.CZW;
import X.EnumC06890Ov;
import X.EnumC30255Bu7;
import X.EnumC32736Ct2;
import X.EnumC32853Cuv;
import X.InterfaceC06390Mx;
import X.InterfaceC30442Bx8;
import X.KNV;
import X.ORZ;
import X.OSZ;
import X.Q8U;
import X.RunnableC31065CHd;
import X.U5H;
import X.UDY;
import X.UDZ;
import X.UVW;
import X.V16;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.GameStarCommentLayoutLandDataChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell;
import com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell;
import com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import com.bytedance.android.live.publicscreen.impl.giftHistory.GiftHistoryWidgetHelper;
import com.bytedance.android.live.slot.EcSlotBarrageWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.feedback.FeedbackAnimWidget;
import com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget;
import com.bytedance.android.livesdk.broadcast.guide.TopGuidanceWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideBottomCardWidget;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuidePinCardWidget;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollVoteEvent;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveLandScapeGiftDialog;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPageIndicatorWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.OffsetGridLayoutManager;
import com.bytedance.android.livesdk.giftlimitnotification.LiveGiftReminderFragment;
import com.bytedance.android.livesdk.guide.LiveGiftGuideViewModel;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.GiftSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelSwipeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSenderRefactorV1Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableRechargeSucceedAnimationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameStarCommentSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.qa.QAQuestionsFragment;
import com.bytedance.android.livesdk.qa.QASuggestedFragment;
import com.bytedance.android.livesdk.qa.TutorialDialog;
import com.bytedance.android.livesdk.revenue.StarCommentDataChannel;
import com.bytedance.android.livesdk.revenue.StarCommentHideEvent;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileAudienceOperationCell;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS37S0210000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AObserverS73S0100000_5 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            case 23:
                onChanged$23(this, obj);
                return;
            case 24:
                onChanged$24(this, obj);
                return;
            case 25:
                onChanged$25(this, obj);
                return;
            case 26:
                onChanged$26(this, obj);
                return;
            case 27:
                onChanged$27(this, obj);
                return;
            case 28:
                onChanged$28(this, obj);
                return;
            case 29:
                onChanged$29(this, obj);
                return;
            case 30:
                onChanged$30(this, obj);
                return;
            case 31:
                onChanged$31(this, obj);
                return;
            case 32:
                onChanged$32(this, obj);
                return;
            case 33:
                onChanged$33(this, obj);
                return;
            case 34:
                onChanged$34(this, obj);
                return;
            case 35:
                onChanged$35(this, obj);
                return;
            case 36:
                onChanged$36(this, obj);
                return;
            case 37:
                onChanged$37(this, obj);
                return;
            case 38:
                onChanged$38(this, obj);
                return;
            case 39:
                onChanged$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onChanged$40(this, obj);
                return;
            case 41:
                onChanged$41(this, obj);
                return;
            case 42:
                onChanged$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onChanged$43(this, obj);
                return;
            case 44:
                onChanged$44(this, obj);
                return;
            case 45:
                onChanged$45(this, obj);
                return;
            case 46:
                onChanged$46(this, obj);
                return;
            case 47:
                onChanged$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onChanged$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                onChanged$49(this, obj);
                return;
            case 50:
                onChanged$50(this, obj);
                return;
            case 51:
                onChanged$51(this, obj);
                return;
            case 52:
                onChanged$52(this, obj);
                return;
            case 53:
                onChanged$53(this, obj);
                return;
            case 54:
                onChanged$54(this, obj);
                return;
            case 55:
                onChanged$55(this, obj);
                return;
            case 56:
                onChanged$56(this, obj);
                return;
            case 57:
                onChanged$57(this, obj);
                return;
            case 58:
                onChanged$58(this, obj);
                return;
            case 59:
                onChanged$59(this, obj);
                return;
            case 60:
                onChanged$60(this, obj);
                return;
            case 61:
                onChanged$61(this, obj);
                return;
            case BaseNotice.CREATOR /* 62 */:
                onChanged$62(this, obj);
                return;
            case 63:
                onChanged$63(this, obj);
                return;
            case 64:
                onChanged$64(this, obj);
                return;
            case 65:
                onChanged$65(this, obj);
                return;
            case 66:
                onChanged$66(this, obj);
                return;
            case 67:
                onChanged$67(this, obj);
                return;
            case 68:
                onChanged$68(this, obj);
                return;
            case 69:
                onChanged$69(this, obj);
                return;
            default:
                return;
        }
    }

    public AObserverS73S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        List<? extends AbstractC32698CsQ<? extends C30896CAq>> matchItems = (List) obj;
        if (!LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
            C32676Cs4 c32676Cs4 = (C32676Cs4) aObserverS73S0100000_5.l0;
            o.LJIIIIZZ(matchItems, "matchItems");
            c32676Cs4.LJJLIIIJJI(matchItems);
        } else {
            if (((C32676Cs4) aObserverS73S0100000_5.l0).LJJIJIIJI() != 16) {
                return;
            }
            C32676Cs4 c32676Cs42 = (C32676Cs4) aObserverS73S0100000_5.l0;
            o.LJIIIIZZ(matchItems, "matchItems");
            c32676Cs42.LJJLIIIJJI(matchItems);
        }
    }

    public static final void onChanged$1(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        OSZ LJ;
        C32570CqM c32570CqM;
        Integer it = (Integer) obj;
        int i = ((C32567CqJ) aObserverS73S0100000_5.l0).LJLJJL;
        if (it == null || i != it.intValue()) {
            C32567CqJ c32567CqJ = (C32567CqJ) aObserverS73S0100000_5.l0;
            o.LJIIIIZZ(it, "it");
            c32567CqJ.LJLJJL = it.intValue();
            List<C32570CqM> list = ((C32567CqJ) aObserverS73S0100000_5.l0).LJLILLLLZI;
            if (list != null && (LJ = C29306Beo.LJ(C32571CqN.LJLIL, list)) != null && (c32570CqM = (C32570CqM) LJ.getFirst()) != null) {
                c32570CqM.LJ = false;
            }
            ((C32567CqJ) aObserverS73S0100000_5.l0).notifyDataSetChanged();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x00a0, code lost:
    
        if ((r1 instanceof X.CUL) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x00a2, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x015e, code lost:
    
        if ((r1 instanceof X.CUL) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$10(Y.AObserverS73S0100000_5 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS73S0100000_5.onChanged$10(Y.AObserverS73S0100000_5, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$11(Y.AObserverS73S0100000_5 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS73S0100000_5.onChanged$11(Y.AObserverS73S0100000_5, java.lang.Object):void");
    }

    public static final void onChanged$12(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        C006900z c006900z = (C006900z) obj;
        LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = LiveGiftTrayPublicScreenTranslateSetting.INSTANCE;
        if (liveGiftTrayPublicScreenTranslateSetting.canCommonWidgetsAlphaXfer(c006900z.LIZ.LIZLLL)) {
            if (c006900z.LIZ.LIZ) {
                ((MainScreenCommentPinnedWidget) aObserverS73S0100000_5.l0).hide();
                return;
            }
            C29602Bja c29602Bja = c006900z.LIZIZ;
            if (c29602Bja == null) {
                ((MainScreenCommentPinnedWidget) aObserverS73S0100000_5.l0).show();
                return;
            }
            MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget = (MainScreenCommentPinnedWidget) aObserverS73S0100000_5.l0;
            if (liveGiftTrayPublicScreenTranslateSetting.canCommonWidgetsAlphaXfer(c29602Bja.LIZLLL)) {
                return;
            }
            mainScreenCommentPinnedWidget.show();
        }
    }

    public static final void onChanged$13(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        C29296Bee c29296Bee;
        C29296Bee c29296Bee2 = (C29296Bee) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("contineTime--- ");
        LIZ.append(c29296Bee2.LIZJ);
        LIZ.append("  content--- ");
        C31811Ce7.LJ(LIZ, c29296Bee2.LIZ, LIZ, "CaptionTextWidget");
        Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        if (LIZJ.booleanValue()) {
            CaptionTextWidget captionTextWidget = (CaptionTextWidget) aObserverS73S0100000_5.l0;
            if (captionTextWidget.LJLJJI && (c29296Bee = captionTextWidget.LJZL) != null) {
                if ((!c29296Bee.LJ.isEmpty()) && o.LJ(ListProtector.get(c29296Bee.LJ, 0), captionTextWidget.LLF)) {
                    c29296Bee.LJ.clear();
                } else {
                    c29296Bee.LJ.clear();
                    c29296Bee.LJ.add(captionTextWidget.LLD);
                }
            }
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((CaptionTextWidget) aObserverS73S0100000_5.l0), C36636EZk.LIZ, null, new C29000BZs((CaptionTextWidget) aObserverS73S0100000_5.l0, c29296Bee2, null), 2);
        }
    }

    public static final void onChanged$14(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        View LJFF;
        FrameLayout frameLayout;
        Pair pair = (Pair) obj;
        if (((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).getView() == null || pair == null) {
            return;
        }
        if (o.LJ(pair.first, Boolean.TRUE)) {
            FrameLayout frameLayout2 = ((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).LJLJJL;
            if (frameLayout2 == null) {
                return;
            }
            int childCount = frameLayout2.getChildCount();
            if (((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).isShowing() && childCount > 0) {
                return;
            }
            IFrameSlot iFrameSlot = ((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).LJLILLLLZI;
            if (iFrameSlot != null) {
                iFrameSlot.getLocation();
            }
            EcSlotBarrageWidget ecSlotBarrageWidget = (EcSlotBarrageWidget) aObserverS73S0100000_5.l0;
            IFrameSlot iFrameSlot2 = ecSlotBarrageWidget.LJLILLLLZI;
            if (iFrameSlot2 != null && (LJFF = iFrameSlot2.LJFF(ecSlotBarrageWidget.context)) != null && (frameLayout = ((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).LJLJJL) != null) {
                frameLayout.addView(LJFF);
            }
            ((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).show();
            return;
        }
        if (!((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).isShowing()) {
            return;
        }
        FrameLayout frameLayout3 = ((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).LJLJJL;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        ((EcSlotBarrageWidget) aObserverS73S0100000_5.l0).hide();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$15(Y.AObserverS73S0100000_5 r4, java.lang.Object r5) {
        /*
            X.BvA r5 = (X.C30320BvA) r5
            if (r5 == 0) goto L1d
            java.lang.Object r2 = r4.l0
            com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget r2 = (com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget) r2
            boolean r0 = r5.LJI
            if (r0 == 0) goto L2c
            r2.cancelShowAnimation()
            r2.cancelHideAnimation()
            boolean r0 = r5.LJII
            if (r0 == 0) goto L28
            r2.hide()
        L19:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L27
        L1d:
            java.lang.Object r0 = r4.l0
            com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget r0 = (com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget) r0
            r0.cancelHideAnimation()
            r0.hide()
        L27:
            return
        L28:
            r2.animateHide()
            goto L19
        L2c:
            r2.animateShow()
            com.bytedance.android.live.base.model.ImageModel r0 = r5.LIZIZ
            if (r0 == 0) goto L82
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L82
            java.lang.Object r3 = X.ORZ.LJLLLL(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L82
            X.0jG r1 = new X.0jG
            r1.<init>()
            X.1t0 r0 = r2.LJZ()
            r1.LIZ = r0
            r1.LIZLLL = r3
            r0 = 1
            r1.LJFF = r0
            r1.LJIIJ = r0
            r1.LJI = r0
            X.C15490jB.LJI(r1)
            X.1t0 r0 = r2.LJZ()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof X.C018905p
            if (r0 == 0) goto L77
            X.05p r1 = (X.C018905p) r1
            if (r1 == 0) goto L77
            boolean r0 = r5.LJFF
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "w, 1:1"
        L6e:
            r1.dimensionRatio = r0
            X.1t0 r0 = r2.LJZ()
            r0.setLayoutParams(r1)
        L77:
            X.1t0 r0 = r2.LJZ()
            X.C29306Beo.LJJLJLI(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L89
        L82:
            X.1t0 r0 = r2.LJZ()
            X.C29306Beo.LJI(r0)
        L89:
            java.lang.String r0 = r5.LIZJ
            r2.LJZL(r0)
            r2.LJZI(r5)
            java.lang.CharSequence r0 = r5.LIZLLL
            boolean r0 = X.C29306Beo.LJIJJLI(r0)
            if (r0 == 0) goto Lb7
            X.2A7 r1 = r2.LJLZ()
            java.lang.CharSequence r0 = r5.LIZLLL
            r1.setText(r0)
            X.2A7 r1 = r2.LJLZ()
            X.BvB r0 = r5.LJ
            X.C16880lQ.LJJIII(r1, r0)
            X.2A7 r0 = r2.LJLZ()
            X.C29306Beo.LJJLJLI(r0)
            goto L19
        Lb4:
            java.lang.String r0 = "w, 58:78"
            goto L6e
        Lb7:
            X.2A7 r0 = r2.LJLZ()
            X.C29306Beo.LJI(r0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS73S0100000_5.onChanged$15(Y.AObserverS73S0100000_5, java.lang.Object):void");
    }

    public static final void onChanged$16(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean isSet = (Boolean) obj;
        LiveGoalPreviewButtonWidget liveGoalPreviewButtonWidget = (LiveGoalPreviewButtonWidget) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(isSet, "isSet");
        liveGoalPreviewButtonWidget.LLIIIJ(isSet.booleanValue());
    }

    public static final void onChanged$17(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean isSet = (Boolean) obj;
        LiveGoalPreviewWidget liveGoalPreviewWidget = (LiveGoalPreviewWidget) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(isSet, "isSet");
        liveGoalPreviewWidget.LLF(isSet.booleanValue());
    }

    public static final void onChanged$18(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        String it = (String) obj;
        PreviewBaseSlotWidget previewBaseSlotWidget = (PreviewBaseSlotWidget) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(it, "it");
        previewBaseSlotWidget.LLIIII(it);
    }

    public static final void onChanged$19(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean isSet = (Boolean) obj;
        BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = (BasePreviewSettingMainFragmentSheet) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(isSet, "isSet");
        basePreviewSettingMainFragmentSheet.LLIFFJFJJ = isSet.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$2(Y.AObserverS73S0100000_5 r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS73S0100000_5.onChanged$2(Y.AObserverS73S0100000_5, java.lang.Object):void");
    }

    public static final void onChanged$20(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            LayeredWidgetManager layeredWidgetManager = ((VideoBroadcastInteractionFragment) aObserverS73S0100000_5.l0).LJZI;
            if (layeredWidgetManager != null) {
                layeredWidgetManager.load(R.id.e0e, new GuidanceBaseWidget());
                return;
            } else {
                o.LJIJI("mWidgetManager");
                throw null;
            }
        }
        if (num.intValue() != 2) {
            return;
        }
        LayeredWidgetManager layeredWidgetManager2 = ((VideoBroadcastInteractionFragment) aObserverS73S0100000_5.l0).LJZI;
        if (layeredWidgetManager2 != null) {
            layeredWidgetManager2.load(R.id.lf2, new TopGuidanceWidget());
        } else {
            o.LJIJI("mWidgetManager");
            throw null;
        }
    }

    public static final void onChanged$21(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        LayeredWidgetManager layeredWidgetManager = ((VideoBroadcastInteractionFragment) aObserverS73S0100000_5.l0).LJZI;
        if (layeredWidgetManager != null) {
            layeredWidgetManager.load(R.id.d8y, new FeedbackAnimWidget());
        } else {
            o.LJIJI("mWidgetManager");
            throw null;
        }
    }

    public static final void onChanged$22(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        FollowGuideBottomCardWidget followGuideBottomCardWidget = (FollowGuideBottomCardWidget) aObserverS73S0100000_5.l0;
        if (followGuideBottomCardWidget.LJLJJI != null) {
            followGuideBottomCardWidget.LJZL();
        }
    }

    public static final void onChanged$23(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        FollowGuidePinCardWidget followGuidePinCardWidget = (FollowGuidePinCardWidget) aObserverS73S0100000_5.l0;
        if (followGuidePinCardWidget.LJLJJI != null) {
            followGuidePinCardWidget.LJZL();
        }
    }

    public static final void onChanged$24(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean it = (Boolean) obj;
        LiveLandScapeGiftDialog liveLandScapeGiftDialog = (LiveLandScapeGiftDialog) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(it, "it");
        liveLandScapeGiftDialog.wl(it.booleanValue());
    }

    public static final void onChanged$25(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        CCC ccc;
        ICommentService iCommentService;
        long j;
        VoteResponseData voteResponseData = (VoteResponseData) obj;
        if (!((AbsSelectPollWidget) aObserverS73S0100000_5.l0).isShowing()) {
            return;
        }
        if (!voteResponseData.commentBanned) {
            SelectPollViewModel selectPollViewModel = ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).LJLLILLLL;
            if (selectPollViewModel != null) {
                ccc = selectPollViewModel.LJLILLLLZI;
            } else {
                ccc = null;
            }
            if (ccc == CCC.NORMAL && (iCommentService = (ICommentService) CN1.LIZ(ICommentService.class)) != null) {
                Room room = (Room) ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).dataChannel.kv0(RoomChannel.class);
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                AbsSelectPollWidget absSelectPollWidget = (AbsSelectPollWidget) aObserverS73S0100000_5.l0;
                String str = absSelectPollWidget.LJLJI;
                ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.POLL;
                sender.getLogArgs().put("poll_id", String.valueOf(absSelectPollWidget.LJLJJL));
                sender.getLogArgs().put("poll_selection", absSelectPollWidget.LJLJI);
                iCommentService.Em0(j, str, null, 3, sender);
            }
        }
        boolean isEmpty = voteResponseData.optionList.isEmpty();
        AbsSelectPollWidget absSelectPollWidget2 = (AbsSelectPollWidget) aObserverS73S0100000_5.l0;
        DataChannel dataChannel = absSelectPollWidget2.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(SelectPollVoteEvent.class, new CCI(absSelectPollWidget2.LJLJJI, absSelectPollWidget2.LJLLJ, voteResponseData.optionList, isEmpty));
        }
        C15610jN.LIZ().postDelayed(new ARunnableS41S0100000_5((AbsSelectPollWidget) aObserverS73S0100000_5.l0, 161), 300L);
    }

    public static final void onChanged$26(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        ConstraintProperty constraintPropertyById;
        Throwable th = (Throwable) obj;
        ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).LJZI(true);
        LayeredElementContext layeredElementContext = ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(((AbsSelectPollWidget) aObserverS73S0100000_5.l0).getId())) != null) {
            constraintPropertyById.alpha(1.0f);
        }
        String str = "network_error";
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            C30868C9o.LJI(c29401Dk.getPrompt());
            switch (c29401Dk.getErrorCode()) {
                case 4003095:
                    ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).hide();
                    str = "timeout";
                    break;
                case 4003096:
                    break;
                default:
                    str = "other";
                    break;
            }
            ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).LLFFF(str);
            return;
        }
        if (o.LJ(th.getMessage(), "user dismiss")) {
            return;
        }
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.noh));
        ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).LLFFF("network_error");
    }

    public static final void onChanged$27(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Long it = (Long) obj;
        AbsSelectPollWidget absSelectPollWidget = (AbsSelectPollWidget) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(it, "it");
        absSelectPollWidget.LJLLJ = it.longValue();
        long longValue = it.longValue() / 1000;
        if (longValue <= 0) {
            AbsSelectPollWidget absSelectPollWidget2 = (AbsSelectPollWidget) aObserverS73S0100000_5.l0;
            absSelectPollWidget2.LJLLJ = 0L;
            absSelectPollWidget2.hide();
        } else {
            try {
                TextView textView = (TextView) ((AbsSelectPollWidget) aObserverS73S0100000_5.l0).LJLJLJ.getValue();
                if (textView == null) {
                    return;
                }
                textView.setText(C15380j0.LJIIIIZZ(R.plurals.o2, (int) longValue, String.valueOf(longValue)));
            } catch (Exception unused) {
            }
        }
    }

    public static final void onChanged$28(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        GiftSelectPollWidget giftSelectPollWidget;
        Room room;
        PollMessage pollMessage = (PollMessage) obj;
        Integer num = pollMessage.pollKind;
        int ordinal = CCC.GIFT.ordinal();
        if (num == null || num.intValue() != ordinal || (room = (giftSelectPollWidget = (GiftSelectPollWidget) aObserverS73S0100000_5.l0).LJLLL) == null || !room.giftPollVoteEnabled) {
            return;
        }
        giftSelectPollWidget.LLFZ(pollMessage);
    }

    public static final void onChanged$29(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        PollMessage pollMessage = (PollMessage) obj;
        Integer num = pollMessage.pollKind;
        int ordinal = CCC.NORMAL.ordinal();
        if (num == null || num.intValue() != ordinal) {
            return;
        }
        ((NormalSelectPollWidget) aObserverS73S0100000_5.l0).LLFZ(pollMessage);
    }

    public static final void onChanged$3(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        C32676Cs4 c32676Cs4;
        LinearLayoutManager linearLayoutManager;
        int LLILL;
        int LLILLJJLI;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        AbstractC32698CsQ abstractC32698CsQ;
        C32681Cs9 c32681Cs9;
        Object parent;
        C29420Bge c29420Bge = (C29420Bge) obj;
        if (!c29420Bge.LIZIZ) {
            c29420Bge.LIZIZ = true;
            C32553Cq5 c32553Cq5 = (C32553Cq5) aObserverS73S0100000_5.l0;
            C77446UaQ c77446UaQ = c29420Bge.LIZ;
            c32553Cq5.getClass();
            if (LiveEnableRechargeSucceedAnimationSetting.INSTANCE.enable()) {
                int i = c77446UaQ.LIZIZ;
                C47061t0 c47061t0 = c32553Cq5.LJLLL;
                C0A2 c0a2 = null;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(0);
                    ConstraintLayout constraintLayout = c32553Cq5.LLF;
                    if (constraintLayout != null && (parent = constraintLayout.getParent()) != null) {
                        ((View) parent).setTranslationZ(10.0f);
                    }
                    C17190lv LJII = C17190lv.LJII(c47061t0.getContext());
                    String LIZLLL = C15510jD.LIZLLL(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_recharge_anim.webp");
                    if (LIZLLL.length() == 0) {
                        File LJFF = C15510jD.LJFF(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_recharge_anim.webp");
                        if (LJFF != null) {
                            LJII.LJ = Uri.fromFile(LJFF);
                        }
                    } else {
                        LJII.LIZLLL(LIZLLL);
                    }
                    C0NB.LJIIIZ("Recharge Anim Debug", "First Anim Loaded");
                    LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
                    LJII.LJIIJJI = true;
                    LJII.LIZLLL = new C32561CqD(c32553Cq5, i);
                    LJII.LIZJ(c47061t0);
                }
                AbstractC32579CqV abstractC32579CqV = c32553Cq5.LJLJLJ;
                if ((abstractC32579CqV instanceof C32676Cs4) && (c32676Cs4 = (C32676Cs4) abstractC32579CqV) != null) {
                    C32129CjF.LIZ.LJII = true;
                    RunnableC31065CHd runnableC31065CHd = c32676Cs4.LJLZ;
                    if (runnableC31065CHd != null) {
                        c0a2 = runnableC31065CHd.getLayoutManager();
                    }
                    if ((c0a2 instanceof OffsetGridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) c0a2) != null && (LLILL = linearLayoutManager.LLILL()) <= (LLILLJJLI = linearLayoutManager.LLILLJJLI())) {
                        while (true) {
                            GiftPanelLeafViewModel LJJIJIL = c32676Cs4.LJJIJIL();
                            if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null && (abstractC32698CsQ = (AbstractC32698CsQ) ORZ.LJLLLLLL(LLILL, value)) != null && abstractC32698CsQ.LIZJ && (c32681Cs9 = c32676Cs4.LJZ) != null) {
                                c32681Cs9.notifyItemChanged(LLILL);
                            }
                            if (LLILL == LLILLJJLI) {
                                break;
                            } else {
                                LLILL++;
                            }
                        }
                    }
                }
                C0Y4.LIZ("livesdk_recharge_success_anime");
            }
        }
    }

    public static final void onChanged$30(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean isOn = (Boolean) obj;
        o.LJIIIIZZ(isOn, "isOn");
        if (isOn.booleanValue()) {
            C32658Crm.LIZ.storeBoolean(C32658Crm.LIZ(), true);
            BagListViewModel bagListViewModel = (BagListViewModel) aObserverS73S0100000_5.l0;
            bagListViewModel.kv0().removeCallbacks(bagListViewModel.LJLL);
            bagListViewModel.kv0().post(bagListViewModel.LJLL);
            return;
        }
        ((BagListViewModel) aObserverS73S0100000_5.l0).LJLJI.setValue(null);
        ((BagListViewModel) aObserverS73S0100000_5.l0).LJLJJI.setValue(null);
        List<AbstractC32698CsQ<? extends C30896CAq>> value = ((BagListViewModel) aObserverS73S0100000_5.l0).LJLILLLLZI.getValue();
        if (value != null) {
            for (AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ : value) {
                if (abstractC32698CsQ != null) {
                    abstractC32698CsQ.LIZJ = false;
                }
            }
        }
        BagListViewModel bagListViewModel2 = (BagListViewModel) aObserverS73S0100000_5.l0;
        bagListViewModel2.kv0().removeCallbacks(bagListViewModel2.LJLL);
    }

    public static final void onChanged$31(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        ((QAQuestionsFragment) aObserverS73S0100000_5.l0).vl().LJLLLLLL((AbstractC19190p9) obj);
    }

    public static final void onChanged$32(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        ((QAQuestionsFragment) aObserverS73S0100000_5.l0).vl().LJLLLLLL((AbstractC19190p9) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0443  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$33(Y.AObserverS73S0100000_5 r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS73S0100000_5.onChanged$33(Y.AObserverS73S0100000_5, java.lang.Object):void");
    }

    public static final void onChanged$34(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        IIconSlot.SlotViewModel slotViewModel = ((C31735Cct) aObserverS73S0100000_5.l0).LJLJI;
        if (slotViewModel != null) {
            slotViewModel.LJLJJI.postValue(obj);
        }
    }

    public static final void onChanged$35(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        ((MultiGuestUserCardCell) aObserverS73S0100000_5.l0).LJIILL(true);
    }

    public static final void onChanged$36(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        int i;
        Drawable drawable = (Drawable) obj;
        ((C31692CcC) aObserverS73S0100000_5.l0).LIZ();
        ImageView imageView = ((C31692CcC) aObserverS73S0100000_5.l0).LJLJLLL;
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ((C31692CcC) aObserverS73S0100000_5.l0).LJLJLLL.setImageDrawable(drawable);
    }

    public static final void onChanged$37(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        if (obj == C06900Ow.LIZIZ) {
            C29306Beo.LJJLJLI(((QAQuestionsFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.kf_));
        } else {
            C29306Beo.LJI(((QAQuestionsFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.kf_));
        }
    }

    public static final void onChanged$38(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        if (!((Boolean) obj).booleanValue()) {
            if (((QAQuestionsFragment) aObserverS73S0100000_5.l0).LJLILLLLZI) {
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLJILJIL;
                Boolean LIZJ = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ, "ANCHOR_SHOW_QA_TUTORIAL.value");
                if (LIZJ.booleanValue()) {
                    DataChannel dataChannel = ((QAQuestionsFragment) aObserverS73S0100000_5.l0).LJLIL;
                    if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                        new TutorialDialog().show(fragmentManager2, "QAndAQuestionsTabFragment");
                    }
                    c48459J0d.LIZ(Boolean.FALSE);
                    return;
                }
            }
            if (!((QAQuestionsFragment) aObserverS73S0100000_5.l0).LJLJI) {
                return;
            }
            C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.LLJILJILJ;
            Boolean LIZJ2 = c48459J0d2.LIZJ();
            o.LJIIIIZZ(LIZJ2, "ADMIN_SHOW_QA_TUTORIAL.value");
            if (!LIZJ2.booleanValue()) {
                return;
            }
            DataChannel dataChannel2 = ((QAQuestionsFragment) aObserverS73S0100000_5.l0).LJLIL;
            if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) != null) {
                new TutorialDialog().show(fragmentManager, "QAndAQuestionsTabFragment");
            }
            c48459J0d2.LIZ(Boolean.FALSE);
        }
    }

    public static final void onChanged$39(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        if (obj == C06900Ow.LIZIZ) {
            C29306Beo.LJJLJLI(((QASuggestedFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.kf_));
            return;
        }
        ((QASuggestedFragment) aObserverS73S0100000_5.l0).vl();
        QASuggestedFragment qASuggestedFragment = (QASuggestedFragment) aObserverS73S0100000_5.l0;
        qASuggestedFragment.LJLLI = true;
        C29306Beo.LJI(qASuggestedFragment._$_findCachedViewById(R.id.kf_));
    }

    public static final void onChanged$4(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean showPrivilegeCenter = (Boolean) obj;
        C32553Cq5 c32553Cq5 = (C32553Cq5) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(showPrivilegeCenter, "showPrivilegeCenter");
        c32553Cq5.LJJIIZ(showPrivilegeCenter.booleanValue());
    }

    public static final void onChanged$40(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        AbstractC19190p9 abstractC19190p9 = (AbstractC19190p9) obj;
        BV8 bv8 = ((QASuggestedFragment) aObserverS73S0100000_5.l0).LJLJL;
        if (bv8 != null) {
            bv8.LJLLLLLL(abstractC19190p9);
        } else {
            o.LJIJI("questionAdapter");
            throw null;
        }
    }

    public static final void onChanged$41(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != 1) {
            ((C011602u) ((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.dux)).setChecked(false);
            C29306Beo.LJI(((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.jqk));
        } else {
            ((C011602u) ((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.dux)).setChecked(true);
            C29306Beo.LJJLJLI(((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.jqk));
        }
    }

    public static final void onChanged$42(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        boolean z;
        boolean z2;
        String LIZIZ;
        BEA.LIZ.getClass();
        String LIZ = BEC.LIZ(String.valueOf(BEA.LJIL));
        String LIZ2 = BEC.LIZ(String.valueOf(BEA.LIZ()));
        Integer value = BEA.LJJ.getValue();
        if (value == null) {
            value = 0;
        }
        if (value.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && BEA.LJIJJLI.length() > 0 && !o.LJ(BEA.LJIJJLI, "COIN") && BEA.LJIILL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            TextView textView = (TextView) ((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.ivb);
            if (C15380j0.LJIIZILJ()) {
                String LJII = C15380j0.LJII(R.plurals.lt, BEA.LJIL);
                o.LJIIIIZZ(LJII, "getQuantityString(\n     …                        )");
                LIZIZ = Q8U.LIZIZ(new Object[]{LIZ, ujb.o.LJJJJZ(LJII, "{amount}", "", false), LIZ2, BEA.LJIIZILJ}, 4, "%s%s ≈ %s%s", "format(format, *args)");
            } else {
                String LJII2 = C15380j0.LJII(R.plurals.lt, BEA.LJIL);
                o.LJIIIIZZ(LJII2, "getQuantityString(\n     …                        )");
                LIZIZ = Q8U.LIZIZ(new Object[]{LIZ, ujb.o.LJJJJZ(LJII2, "{amount}", "", false), BEA.LJIIZILJ, LIZ2}, 4, "%s%s ≈ %s%s", "format(format, *args)");
            }
            textView.setText(LIZIZ);
        } else if (o.LJ(BEA.LJIJJLI, "COIN")) {
            TextView textView2 = (TextView) ((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.ivb);
            String LJII3 = C15380j0.LJII(R.plurals.lt, BEA.LJIL);
            o.LJIIIIZZ(LJII3, "getQuantityString(\n     … 0,\n                    )");
            String LLLZ = C16880lQ.LLLZ("%s%s", Arrays.copyOf(new Object[]{LIZ, ujb.o.LJJJJZ(LJII3, "{amount}", "", false)}, 2));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            textView2.setText(LLLZ);
        } else {
            TextView textView3 = (TextView) ((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.ivb);
            String LLLZ2 = C16880lQ.LLLZ("%s%s", Arrays.copyOf(new Object[]{BEA.LJIIZILJ, LIZ2}, 2));
            o.LJIIIIZZ(LLLZ2, "format(format, *args)");
            textView3.setText(LLLZ2);
        }
        if (BEA.LJIILL) {
            float f = BEA.LJIILLIIL;
            TextView textView4 = (TextView) ((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.lw6);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lnm);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_giftlimit_preview_descnew)");
            textView4.setText(ujb.o.LJJJJZ(ujb.o.LJJJJZ(LJIILJJIL, "{amount}", String.valueOf(f), false), "{currency}", BEA.LJIIZILJ, false));
        }
    }

    public static final void onChanged$43(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean it = (Boolean) obj;
        if (it != null) {
            o.LJIIIIZZ(it, "it");
            if (it.booleanValue()) {
                C29306Beo.LJI(((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.duv));
                C29306Beo.LJJLJLI(((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.duu));
                return;
            }
            C29306Beo.LJI(((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.duv));
            C29306Beo.LJJLJLI(((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.duz));
            C16880lQ.LJJIII((C2A7) ((LiveGiftReminderFragment) aObserverS73S0100000_5.l0)._$_findCachedViewById(R.id.izq), new ACListenerS25S0100000_5((LiveGiftReminderFragment) aObserverS73S0100000_5.l0, 309));
            BEA.LIZ.getClass();
            boolean LJ = BEA.LJ();
            String firstPanelFrom = BEA.LJJIIZI;
            o.LJIIIZ(firstPanelFrom, "firstPanelFrom");
            BZI LIZ = C28787BRn.LIZ("livesdk_gift_limit_setting_panel_fail");
            KNV.LJ(LJ ? 1 : 0, LIZ, "is_anchor", firstPanelFrom, "first_panel_from");
            C1FL.LJI(LIZ, "notification", "panel_type");
        }
    }

    public static final void onChanged$44(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        C06900Ow c06900Ow = (C06900Ow) obj;
        if (c06900Ow != null) {
            if (c06900Ow.LIZ == EnumC06890Ov.RUNNING) {
                ((BVB) aObserverS73S0100000_5.l0).LJLILLLLZI.setVisibility(0);
            } else {
                ((BVB) aObserverS73S0100000_5.l0).LJLILLLLZI.setVisibility(8);
            }
        }
    }

    public static final void onChanged$45(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        C32822CuQ c32822CuQ;
        User user;
        C79359VCp c79359VCp;
        User user2;
        C77348UXg bundle = (C77348UXg) obj;
        o.LJIIIZ(bundle, "bundle");
        LiveLandScapeGiftDialog liveLandScapeGiftDialog = (LiveLandScapeGiftDialog) aObserverS73S0100000_5.l0;
        liveLandScapeGiftDialog.getClass();
        C32805Cu9 c32805Cu9 = bundle.LIZ;
        if (LiveGiftSenderRefactorV1Setting.INSTANCE.enable()) {
            C73026SlK intention = c32805Cu9.LJJJJIZL;
            Gift gift = bundle.LIZIZ;
            Room room = c32805Cu9.LJJI;
            if (room == null || (c79359VCp = liveLandScapeGiftDialog.LJLJLLL) == null || (user2 = (User) c79359VCp.LIZIZ) == null) {
                return;
            }
            C32822CuQ LIZ = U5H.LIZ(user2);
            String str = liveLandScapeGiftDialog.LJLLJ;
            DataChannel dataChannel = liveLandScapeGiftDialog.dataChannel;
            Room room2 = c32805Cu9.LJJI;
            o.LJIIIIZZ(room2, "giftSendEvent.room");
            HashMap LJIIJ = V16.LJIIJ(room2, dataChannel);
            String str2 = c32805Cu9.LJIJI;
            if (str2 == null) {
                str2 = "";
            }
            int i = c32805Cu9.LJIIJ;
            String str3 = c32805Cu9.LJIJJ;
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            boolean z = c32805Cu9.LJIIL;
            int i2 = c32805Cu9.LJIIZILJ;
            String giftPageName = c32805Cu9.LJIILLIIL;
            int i3 = c32805Cu9.LJIJ;
            o.LJIIIIZZ(intention, "intention");
            o.LJIIIIZZ(giftPageName, "giftPageName");
            UVW.LJI.LIZ(new C76841UDt(intention, gift, room, LIZ, str, LJIIJ, z, str2, i, str3, i2, giftPageName, i3), null, null, null, null, null);
        } else {
            C79359VCp c79359VCp2 = liveLandScapeGiftDialog.LJLJLLL;
            if (c79359VCp2 != null && (user = (User) c79359VCp2.LIZIZ) != null) {
                c32822CuQ = U5H.LIZ(user);
            } else {
                c32822CuQ = null;
            }
            c32805Cu9.LJIILIIL = c32822CuQ;
            c32805Cu9.LJIILJJIL = liveLandScapeGiftDialog.LJLLJ;
            C32796Cu0.LIZIZ(liveLandScapeGiftDialog.dataChannel, c32805Cu9);
        }
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        long j = c32805Cu9.LJ;
        boolean z2 = c32805Cu9.LJIILL;
        String str4 = liveLandScapeGiftDialog.LJLLJ;
        String str5 = c32805Cu9.LJIILLIIL;
        o.LJIIIIZZ(str5, "giftSendEvent.giftPageName");
        c32785Ctp.LJJI(j, false, z2, str4, str5, c32805Cu9.LJIJI, Integer.valueOf(c32805Cu9.LJIIJ), null);
    }

    public static final void onChanged$46(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        if (obj == null || ((LiveLandScapeGiftDialog) aObserverS73S0100000_5.l0).LJLJLLL == null) {
            return;
        }
        o.LJIIIZ(null, "source");
        throw null;
    }

    public static final void onChanged$47(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        ((LiveLandScapeGiftDialog) aObserverS73S0100000_5.l0).dismissAllowingStateLoss();
    }

    public static final void onChanged$48(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        int i;
        UDZ c76824UDc;
        long j;
        Room room;
        ViewGroup viewGroup;
        OSZ osz = (OSZ) obj;
        GiftGuideMessage giftGuideMessage = (GiftGuideMessage) osz.getFirst();
        boolean booleanValue = ((Boolean) osz.getSecond()).booleanValue();
        if (giftGuideMessage != null) {
            LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2 = (LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0;
            BJI.LIZIZ = SystemClock.uptimeMillis();
            String guideType = giftGuideMessage.guideType;
            o.LJIIIZ(guideType, "guideType");
            BZI LIZ = C28787BRn.LIZ("livesdk_gift_guide_message_received");
            LIZ.LJIJJ(guideType, "notification_type");
            LIZ.LJJIIJZLJL();
            C32793Ctx.LIZ = System.currentTimeMillis();
            liveGiftGuideWidgetV2.getClass();
            if (C76825UDd.LIZ(giftGuideMessage)) {
                i = R.layout.cxc;
            } else {
                i = R.layout.cxf;
            }
            View view = liveGiftGuideWidgetV2.getView();
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), i, viewGroup, false);
                viewGroup.removeAllViews();
                viewGroup.addView(LLLLIILL);
            }
            if (C76825UDd.LIZ(giftGuideMessage)) {
                String type = giftGuideMessage.guideType;
                o.LJIIIZ(type, "type");
                TextView textView = (TextView) liveGiftGuideWidgetV2.findViewById(R.id.lyc);
                TextView textView2 = (TextView) liveGiftGuideWidgetV2.findViewById(R.id.c8k);
                C47121t6 c47121t6 = (C47121t6) liveGiftGuideWidgetV2.findViewById(R.id.jo4);
                ConstraintLayout constraintLayout = (ConstraintLayout) liveGiftGuideWidgetV2.findViewById(R.id.nin);
                LiveIconView liveIconView = (LiveIconView) liveGiftGuideWidgetV2.findViewById(R.id.c00);
                LinearLayout linearLayout = (LinearLayout) liveGiftGuideWidgetV2.findViewById(R.id.jo3);
                C2A4 c2a4 = (C2A4) liveGiftGuideWidgetV2.findViewById(R.id.fwj);
                FrameLayout frameLayout = (FrameLayout) liveGiftGuideWidgetV2.findViewById(R.id.bs8);
                o.LJIIIIZZ(c47121t6, "findViewById(R.id.send_button_right)");
                o.LJIIIIZZ(liveIconView, "findViewById(R.id.cross_close)");
                o.LJIIIIZZ(linearLayout, "findViewById(R.id.send_button_comb)");
                o.LJIIIIZZ(constraintLayout, "findViewById(R.id.white_area)");
                c76824UDc = new UDY(textView, textView2, c2a4, frameLayout, c47121t6, liveIconView, linearLayout, constraintLayout, type);
            } else {
                String type2 = giftGuideMessage.guideType;
                o.LJIIIZ(type2, "type");
                View findViewById = liveGiftGuideWidgetV2.findViewById(R.id.dt6);
                o.LJIIIIZZ(findViewById, "findViewById(R.id.gift_icon)");
                View findViewById2 = liveGiftGuideWidgetV2.findViewById(R.id.lyc);
                o.LJIIIIZZ(findViewById2, "findViewById(R.id.tvTitle)");
                View findViewById3 = liveGiftGuideWidgetV2.findViewById(R.id.c8k);
                o.LJIIIIZZ(findViewById3, "findViewById(R.id.description_tv)");
                View findViewById4 = liveGiftGuideWidgetV2.findViewById(R.id.my0);
                o.LJIIIIZZ(findViewById4, "findViewById(R.id.user_avatar)");
                View findViewById5 = liveGiftGuideWidgetV2.findViewById(R.id.afo);
                o.LJIIIIZZ(findViewById5, "findViewById(R.id.badge_container)");
                View findViewById6 = liveGiftGuideWidgetV2.findViewById(R.id.gar);
                o.LJIIIIZZ(findViewById6, "findViewById(R.id.lvFirstGift)");
                View findViewById7 = liveGiftGuideWidgetV2.findViewById(R.id.jo2);
                o.LJIIIIZZ(findViewById7, "findViewById(R.id.send_button)");
                View findViewById8 = liveGiftGuideWidgetV2.findViewById(R.id.jo4);
                o.LJIIIIZZ(findViewById8, "findViewById(R.id.send_button_right)");
                View findViewById9 = liveGiftGuideWidgetV2.findViewById(R.id.c00);
                o.LJIIIIZZ(findViewById9, "findViewById(R.id.cross_close)");
                View findViewById10 = liveGiftGuideWidgetV2.findViewById(R.id.jo3);
                o.LJIIIIZZ(findViewById10, "findViewById(R.id.send_button_comb)");
                View findViewById11 = liveGiftGuideWidgetV2.findViewById(R.id.nin);
                o.LJIIIIZZ(findViewById11, "findViewById(R.id.white_area)");
                c76824UDc = new C76824UDc((ImageView) findViewById, (TextView) findViewById2, (TextView) findViewById3, (ImageView) findViewById4, (FrameLayout) findViewById5, (C29701Eo) findViewById6, (TextView) findViewById7, (C47121t6) findViewById8, (LiveIconView) findViewById9, (LinearLayout) findViewById10, (ConstraintLayout) findViewById11, type2);
            }
            liveGiftGuideWidgetV2.LJLILLLLZI = c76824UDc;
            c76824UDc.LIZIZ();
            LiveGiftGuideViewModel LJZ = liveGiftGuideWidgetV2.LJZ();
            DataChannel dataChannel = liveGiftGuideWidgetV2.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            LJZ.getClass();
            if (C76825UDd.LIZ(giftGuideMessage)) {
                C32696CsO.LIZIZ(j, 1);
            } else {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(LJZ), null, null, new C32839Cuh(j, giftGuideMessage, null), 3);
            }
            UDZ udz = liveGiftGuideWidgetV2.LJLILLLLZI;
            if (udz != null) {
                Context context = liveGiftGuideWidgetV2.context;
                o.LJIIIIZZ(context, "context");
                DataChannel dataChannel2 = liveGiftGuideWidgetV2.dataChannel;
                int i2 = liveGiftGuideWidgetV2.LJLJJL;
                AqS136S0200000_5 aqS136S0200000_5 = new AqS136S0200000_5(liveGiftGuideWidgetV2, giftGuideMessage, 41);
                AqS37S0210000_5 aqS37S0210000_5 = new AqS37S0210000_5(giftGuideMessage, liveGiftGuideWidgetV2, booleanValue, 1);
                giftGuideMessage = giftGuideMessage;
                udz.LIZJ(context, dataChannel2, giftGuideMessage, liveGiftGuideWidgetV2, i2, aqS136S0200000_5, aqS37S0210000_5, booleanValue);
            }
            if (o.LJ(giftGuideMessage.guideType, "gift_guide_popup_education")) {
                String name = giftGuideMessage.triggerName;
                o.LJIIIZ(name, "name");
                C32696CsO.LJFF = name;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    public static final void onChanged$49(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        long j;
        String str;
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str2;
        GiftGuideMessage first;
        CommonMessageData commonMessageData;
        GiftGuideMessage first2;
        GiftGuideMessage first3;
        GiftGuideMessage first4;
        OSZ osz = (OSZ) obj;
        OSZ<GiftGuideMessage, Boolean> value = ((LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0).LJZ().LJLJLLL.getValue();
        ?? r5 = 1;
        if (value != null && (first4 = value.getFirst()) != null && o.LJ(first4.guideType, "gift_guide_bubble")) {
            return;
        }
        OSZ<GiftGuideMessage, Boolean> value2 = ((LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0).LJZ().LJLJLLL.getValue();
        if (value2 == null || (first3 = value2.getFirst()) == null || !first3.hasSent) {
            r5 = 0;
        }
        OSZ<GiftGuideMessage, Boolean> value3 = ((LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0).LJZ().LJLJLLL.getValue();
        if (value3 != null && (first2 = value3.getFirst()) != null) {
            j = first2.giftId;
        } else {
            j = 0;
        }
        OSZ<GiftGuideMessage, Boolean> value4 = ((LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0).LJZ().LJLJLLL.getValue();
        GiftGuideMessage giftGuideMessage = null;
        Long l5 = null;
        if (value4 == null || (first = value4.getFirst()) == null || (commonMessageData = first.baseMessage) == null || (str = commonMessageData.logId) == null) {
            str = "";
        }
        OSZ<GiftGuideMessage, Boolean> value5 = ((LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0).LJZ().LJLJLLL.getValue();
        if (value5 != null) {
            z = value5.getSecond().booleanValue();
        } else {
            z = false;
        }
        if (((Boolean) osz.getFirst()).booleanValue()) {
            LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2 = (LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0;
            liveGiftGuideWidgetV2.LJLJI = false;
            long uptimeMillis = SystemClock.uptimeMillis() - BJI.LIZIZ;
            BZI LIZ = C28787BRn.LIZ("livesdk_gift_guide_popup_show");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(j), "gift_id");
            LIZ.LJIJJ(C32650Cre.LIZJ, "notification_type");
            C78895Uxn.LIZIZ(LIZ, C32650Cre.LIZIZ, "notification_request_id", r5, "has_gift_sent_before");
            LIZ.LJIJJ(Long.valueOf(uptimeMillis), "message_received_to_show_duration");
            GuideInfoResponse.UserStats userStats = C32696CsO.LJ;
            if (userStats != null) {
                l = Long.valueOf(userStats.giftPanelShowCnt);
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "gift_panel_show_cnt");
            GuideInfoResponse.UserStats userStats2 = C32696CsO.LJ;
            if (userStats2 != null) {
                l2 = Long.valueOf(userStats2.shortcutGiftClickCnt);
            } else {
                l2 = null;
            }
            LIZ.LJIJJ(l2, "convenient_gift_click_cnt");
            GuideInfoResponse.UserStats userStats3 = C32696CsO.LJ;
            if (userStats3 != null) {
                l3 = Long.valueOf(userStats3.giftGuidePopupShowCnt);
            } else {
                l3 = null;
            }
            LIZ.LJIJJ(l3, "gift_guide_popup_show_cnt");
            GuideInfoResponse.UserStats userStats4 = C32696CsO.LJ;
            if (userStats4 != null) {
                l4 = Long.valueOf(userStats4.likeCnt);
            } else {
                l4 = null;
            }
            LIZ.LJIJJ(l4, "like_cnt");
            GuideInfoResponse.UserStats userStats5 = C32696CsO.LJ;
            if (userStats5 != null) {
                l5 = Long.valueOf(userStats5.watchDuration);
            }
            LIZ.LJIJJ(l5, "watch_duration");
            LIZ.LJIJJ(C32696CsO.LJFF, "trigger_rule");
            if (C32314CmE.LIZIZ() > 0 || z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str2, "has_coin");
            LIZ.LJJIIJZLJL();
            C32793Ctx.LIZLLL(C32650Cre.LIZJ);
            liveGiftGuideWidgetV2.show();
            return;
        }
        LiveGiftGuideWidgetV2 liveGiftGuideWidgetV22 = (LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0;
        EnumC32853Cuv enumC32853Cuv = (EnumC32853Cuv) osz.getSecond();
        if (enumC32853Cuv == null) {
            enumC32853Cuv = EnumC32853Cuv.OTHER;
        }
        OSZ<GiftGuideMessage, Boolean> value6 = ((LiveGiftGuideWidgetV2) aObserverS73S0100000_5.l0).LJZ().LJLJLLL.getValue();
        if (value6 != null) {
            giftGuideMessage = value6.getFirst();
        }
        liveGiftGuideWidgetV22.LJZI(enumC32853Cuv, r5, str, giftGuideMessage);
    }

    public static final void onChanged$5(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        int i;
        EnumC32736Ct2 enumC32736Ct2 = (EnumC32736Ct2) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load state: ");
        LIZ.append(enumC32736Ct2);
        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ));
        if (enumC32736Ct2 == null) {
            i = -1;
        } else {
            i = C32748CtE.LIZ[enumC32736Ct2.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    CVT cvt = ((C32676Cs4) aObserverS73S0100000_5.l0).LLD;
                    if (cvt != null) {
                        C29306Beo.LJI(cvt);
                    }
                    C47121t6 c47121t6 = ((C32676Cs4) aObserverS73S0100000_5.l0).LL;
                    if (c47121t6 != null) {
                        C29306Beo.LJI(c47121t6);
                    }
                    C32733Csz c32733Csz = ((C32676Cs4) aObserverS73S0100000_5.l0).LLF;
                    if (c32733Csz != null) {
                        C29306Beo.LJI(c32733Csz);
                    }
                    C32112Ciy.LIZ.storeInt("sp_gift_panel_dismiss_data_status", EnumC32736Ct2.SUCCESS.getValue());
                    return;
                }
                CVT cvt2 = ((C32676Cs4) aObserverS73S0100000_5.l0).LLD;
                if (cvt2 != null) {
                    C29306Beo.LJI(cvt2);
                }
                C47121t6 c47121t62 = ((C32676Cs4) aObserverS73S0100000_5.l0).LL;
                if (c47121t62 != null) {
                    C29306Beo.LJI(c47121t62);
                }
                C32733Csz c32733Csz2 = ((C32676Cs4) aObserverS73S0100000_5.l0).LLF;
                if (c32733Csz2 != null) {
                    C29306Beo.LJJLJLI(c32733Csz2);
                }
                C32676Cs4 c32676Cs4 = (C32676Cs4) aObserverS73S0100000_5.l0;
                C32733Csz c32733Csz3 = c32676Cs4.LLF;
                if (c32733Csz3 != null) {
                    c32733Csz3.LIZ(new AqS155S0100000_5(c32676Cs4, 7));
                }
                C32112Ciy.LIZ.storeInt("sp_gift_panel_dismiss_data_status", EnumC32736Ct2.FAILED.getValue());
                return;
            }
            CVT cvt3 = ((C32676Cs4) aObserverS73S0100000_5.l0).LLD;
            if (cvt3 != null) {
                C29306Beo.LJI(cvt3);
            }
            C47121t6 c47121t63 = ((C32676Cs4) aObserverS73S0100000_5.l0).LL;
            if (c47121t63 != null) {
                C29306Beo.LJI(c47121t63);
            }
            C32733Csz c32733Csz4 = ((C32676Cs4) aObserverS73S0100000_5.l0).LLF;
            if (c32733Csz4 != null) {
                C29306Beo.LJI(c32733Csz4);
            }
            C32112Ciy.LIZ.storeInt("sp_gift_panel_dismiss_data_status", EnumC32736Ct2.SUCCESS.getValue());
            return;
        }
        CVT cvt4 = ((C32676Cs4) aObserverS73S0100000_5.l0).LLD;
        if (cvt4 != null) {
            C29306Beo.LJJLJLI(cvt4);
        }
        C47121t6 c47121t64 = ((C32676Cs4) aObserverS73S0100000_5.l0).LL;
        if (c47121t64 != null) {
            C29306Beo.LJI(c47121t64);
        }
        C32733Csz c32733Csz5 = ((C32676Cs4) aObserverS73S0100000_5.l0).LLF;
        if (c32733Csz5 != null) {
            C29306Beo.LJI(c32733Csz5);
        }
        C32112Ciy.LIZ.storeInt("sp_gift_panel_dismiss_data_status", EnumC32736Ct2.LOADING.getValue());
    }

    public static final void onChanged$50(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        int i;
        Drawable drawable = (Drawable) obj;
        ((C31689Cc9) aObserverS73S0100000_5.l0).LIZ();
        ImageView imageView = ((C31689Cc9) aObserverS73S0100000_5.l0).LJLJLJ;
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ((C31689Cc9) aObserverS73S0100000_5.l0).LJLJLJ.setImageDrawable(drawable);
    }

    public static final void onChanged$51(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        boolean z;
        CoHostUserCardCell coHostUserCardCell = (CoHostUserCardCell) aObserverS73S0100000_5.l0;
        C2A7 c2a7 = coHostUserCardCell.LJLJLJ;
        if (c2a7 != null) {
            if (c2a7.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            coHostUserCardCell.LJIILJJIL(z);
            return;
        }
        o.LJIJI("linkmicButton");
        throw null;
    }

    public static final void onChanged$52(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        boolean z;
        CZV czv;
        String str;
        CVC cvc = (CVC) obj;
        if (cvc != null) {
            z = true;
        } else {
            z = false;
        }
        CVE.LIZ = z;
        CZR czr = (CZR) aObserverS73S0100000_5.l0;
        DataChannel dataChannel = czr.LJLILLLLZI;
        if (dataChannel != null) {
            if (cvc == null) {
                CVC cvc2 = czr.LJLLI;
                if (cvc2 != null) {
                    CVJ.LIZJ(cvc2, dataChannel, czr.LJLL.containsKey((Object) cvc2.LJLIL));
                }
            } else {
                CVC cvc3 = czr.LJLLI;
                if (cvc3 == null) {
                    if (cvc.LJLLI == CZV.DISPLAYING) {
                        CVI.LIZJ(cvc, dataChannel, czr.LJLL.containsKey((Object) cvc.LJLIL));
                    } else {
                        str = null;
                    }
                } else {
                    str = cvc3.LJLIL;
                }
                if (!o.LJ(str, cvc.LJLIL)) {
                    CVC cvc4 = czr.LJLLI;
                    if (cvc4 != null) {
                        CVJ.LIZJ(cvc4, dataChannel, czr.LJLL.containsKey((Object) cvc4.LJLIL));
                    }
                    if (cvc.LJLLI == CZV.DISPLAYING) {
                        CVI.LIZJ(cvc, dataChannel, czr.LJLL.containsKey((Object) cvc.LJLIL));
                    }
                } else {
                    CZV czv2 = czr.LJLLILLLL;
                    CZV czv3 = CZV.DISPLAYING;
                    if (czv2 != czv3 && cvc.LJLLI == czv3) {
                        CVI.LIZJ(cvc, dataChannel, czr.LJLL.containsKey((Object) cvc.LJLIL));
                    }
                }
            }
        }
        czr.LJLLI = cvc;
        if (cvc == null || (czv = cvc.LJLLI) == null) {
            czv = CZV.UNKNOWN;
        }
        czr.LJLLILLLL = czv;
    }

    public static final void onChanged$53(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        ((LiveIconView) aObserverS73S0100000_5.l0).setIcon((Drawable) obj);
    }

    public static final void onChanged$54(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        int i;
        View view = (View) aObserverS73S0100000_5.l0;
        if (obj == EnumC30255Bu7.REDDOT) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void onChanged$55(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        boolean z;
        C32137CjN c32137CjN = (C32137CjN) obj;
        if (c32137CjN != null) {
            LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = (LiveNewGiftPageIndicatorWidget) aObserverS73S0100000_5.l0;
            int i = liveNewGiftPageIndicatorWidget.LJLJJI;
            int i2 = c32137CjN.LIZ;
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            liveNewGiftPageIndicatorWidget.LJLJJI = i2;
            int i3 = c32137CjN.LIZIZ;
            liveNewGiftPageIndicatorWidget.LJLJJL = i3;
            ImageView imageView = null;
            if (i2 == 0 || i2 == 1) {
                LinearLayout linearLayout = liveNewGiftPageIndicatorWidget.LJLIL;
                if (linearLayout != null) {
                    C29306Beo.LJIIIZ(linearLayout);
                    return;
                } else {
                    o.LJIJI("points");
                    throw null;
                }
            }
            if (!z) {
                LinearLayout linearLayout2 = liveNewGiftPageIndicatorWidget.LJLIL;
                if (linearLayout2 != null) {
                    linearLayout2.removeAllViews();
                    LinearLayout linearLayout3 = liveNewGiftPageIndicatorWidget.LJLIL;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                        liveNewGiftPageIndicatorWidget.LJLJJLL.clear();
                        int i4 = liveNewGiftPageIndicatorWidget.LJLJJI;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ImageView imageView2 = new ImageView(liveNewGiftPageIndicatorWidget.getContext());
                            LinearLayout linearLayout4 = liveNewGiftPageIndicatorWidget.LJLIL;
                            if (linearLayout4 != null) {
                                linearLayout4.addView(imageView2);
                                liveNewGiftPageIndicatorWidget.LJLJJLL.add(imageView2);
                                C47121t6 c47121t6 = new C47121t6(liveNewGiftPageIndicatorWidget.getContext(), null);
                                c47121t6.setTextSize(15.0f);
                                c47121t6.setText("  ");
                                LinearLayout linearLayout5 = liveNewGiftPageIndicatorWidget.LJLIL;
                                if (linearLayout5 != null) {
                                    linearLayout5.addView(c47121t6);
                                    ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                    layoutParams2.height = C15380j0.LIZ(6.0f);
                                    layoutParams2.width = C15380j0.LIZ(6.0f);
                                    imageView2.setBackground(C15380j0.LJI(R.drawable.d4h));
                                } else {
                                    o.LJIJI("points");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("points");
                                throw null;
                            }
                        }
                        Object obj2 = ListProtector.get(liveNewGiftPageIndicatorWidget.LJLJJLL, liveNewGiftPageIndicatorWidget.LJLJJL);
                        o.LJIIIIZZ(obj2, "imageViews[currentPage]");
                        ImageView imageView3 = (ImageView) obj2;
                        imageView3.setBackground(C15380j0.LJI(R.drawable.d29));
                        liveNewGiftPageIndicatorWidget.LJLILLLLZI = imageView3;
                        return;
                    }
                    o.LJIJI("points");
                    throw null;
                }
                o.LJIJI("points");
                throw null;
            }
            try {
                imageView = (ImageView) ListProtector.get(liveNewGiftPageIndicatorWidget.LJLJJLL, i3);
            } catch (Exception unused) {
            }
            ImageView imageView4 = liveNewGiftPageIndicatorWidget.LJLILLLLZI;
            if (imageView == imageView4) {
                return;
            }
            if (imageView4 != null) {
                imageView4.setBackground(C15380j0.LJI(R.drawable.d4h));
            }
            if (imageView == null) {
                return;
            }
            imageView.setBackground(C15380j0.LJI(R.drawable.d29));
            liveNewGiftPageIndicatorWidget.LJLILLLLZI = imageView;
        }
    }

    public static final void onChanged$56(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean isSet = (Boolean) obj;
        BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(isSet, "isSet");
        basePreviewSettingMainFragment.LJLJLLL = isSet.booleanValue();
    }

    public static final void onChanged$57(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        DataChannel dataChannel = (DataChannel) aObserverS73S0100000_5.l0;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        dataChannel.rv0(ECLiveStatusChangeChannel.class, obj);
    }

    public static final void onChanged$58(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        CZW czw;
        CZW czw2;
        CZP czp = (CZP) obj;
        CZP czp2 = ((CZO) aObserverS73S0100000_5.l0).LJI;
        CZW czw3 = null;
        if (czp2 != null) {
            czw = czp2.LIZJ;
        } else {
            czw = null;
        }
        if (czp != null) {
            czw2 = czp.LIZJ;
        } else {
            czw2 = null;
        }
        boolean z = true;
        if (czw == czw2) {
            IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
            CZO czo = (CZO) aObserverS73S0100000_5.l0;
            iPublicScreenService.ZD(czo.LJII, czo.LIZ(czp, true, false));
        } else {
            IPublicScreenService iPublicScreenService2 = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
            CZO czo2 = (CZO) aObserverS73S0100000_5.l0;
            long j = czo2.LJII;
            if (czo2.LJI == null || czp == null) {
                z = false;
            }
            iPublicScreenService2.ZD(j, czo2.LIZ(czp, false, z));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update indicator -> ");
            if (czp != null) {
                czw3 = czp.LIZJ;
            }
            LIZ.append(CZT.LIZJ(czw3));
            CZT.LIZLLL(X1D.LIZIZ(LIZ));
        }
        ((CZO) aObserverS73S0100000_5.l0).LJI = czp;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Boolean, O] */
    public static final void onChanged$59(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        CVC cvc = (CVC) obj;
        if (cvc == null) {
            ((C32537Cpp) ((CZO) aObserverS73S0100000_5.l0).LIZJ.gv0(CZM.class)).LIZ = Boolean.FALSE;
            ((CZO) aObserverS73S0100000_5.l0).LIZJ.pv0(StarCommentHideEvent.class);
        } else {
            ((C32537Cpp) ((CZO) aObserverS73S0100000_5.l0).LIZJ.gv0(CZM.class)).LIZ = Boolean.TRUE;
            ((CZO) aObserverS73S0100000_5.l0).LIZJ.rv0(StarCommentDataChannel.class, cvc);
        }
        C0NB.LIZIZ("fanyiwen", "send");
        if (cvc == null) {
            ((CZO) aObserverS73S0100000_5.l0).LIZJ.rv0(GameStarCommentLayoutLandDataChannel.class, 0);
        } else {
            ((CZO) aObserverS73S0100000_5.l0).LIZJ.rv0(GameStarCommentLayoutLandDataChannel.class, Integer.valueOf(C15380j0.LIZ(88.0f)));
        }
        CZO czo = (CZO) aObserverS73S0100000_5.l0;
        CVC cvc2 = czo.LIZLLL;
        if (cvc2 == null) {
            if (cvc != null) {
                InterfaceC06390Mx LIZ = CN1.LIZ(IPublicScreenService.class);
                o.LJIIIIZZ(LIZ, "getService(IPublicScreenService::class.java)");
                czo.LJFF = ((IPublicScreenService) LIZ).UW(((CZO) aObserverS73S0100000_5.l0).LJII, new C31353CSf(cvc), false);
            }
        } else if (cvc != null) {
            if (o.LJ(cvc.LJLIL, cvc2.LJLIL)) {
                CZO czo2 = (CZO) aObserverS73S0100000_5.l0;
                CSH<? extends CRD> csh = czo2.LJFF;
                if (csh != null) {
                    CZV czv = czo2.LJ;
                    CZV czv2 = CZV.DISPLAYING;
                    if (czv != czv2 && cvc.LJLLI == czv2) {
                        if (czv == CZV.SELF_WAITING) {
                            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).dh0(czo2.LJII, csh, 2);
                        } else {
                            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).dh0(czo2.LJII, csh, 1);
                        }
                    } else if (cvc.LJLLI == czv2) {
                        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).dh0(czo2.LJII, csh, 2);
                    }
                } else {
                    InterfaceC06390Mx LIZ2 = CN1.LIZ(IPublicScreenService.class);
                    o.LJIIIIZZ(LIZ2, "getService(IPublicScreenService::class.java)");
                    czo2.LJFF = ((IPublicScreenService) LIZ2).UW(((CZO) aObserverS73S0100000_5.l0).LJII, new C31353CSf(cvc), false);
                }
            } else {
                if (((CZO) aObserverS73S0100000_5.l0).LJFF != null) {
                    IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
                    CZO czo3 = (CZO) aObserverS73S0100000_5.l0;
                    iPublicScreenService.Lb0(czo3.LJII, czo3.LJFF, true);
                }
                ((CZO) aObserverS73S0100000_5.l0).LJFF = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).UW(((CZO) aObserverS73S0100000_5.l0).LJII, new C31353CSf(cvc), true);
            }
        } else {
            if (czo.LJFF != null) {
                InterfaceC06390Mx LIZ3 = CN1.LIZ(IPublicScreenService.class);
                o.LJIIIIZZ(LIZ3, "getService(IPublicScreenService::class.java)");
                CZO czo4 = (CZO) aObserverS73S0100000_5.l0;
                ((IPublicScreenService) LIZ3).Lb0(czo4.LJII, czo4.LJFF, false);
            }
            ((CZO) aObserverS73S0100000_5.l0).LJFF = null;
        }
        CZO czo5 = (CZO) aObserverS73S0100000_5.l0;
        czo5.LIZLLL = cvc;
        if (cvc != null) {
            czo5.LJ = cvc.LJLLI;
        }
    }

    public static final void onChanged$6(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        MutableLiveData<List<C32713Csf>> mutableLiveData;
        List<C32713Csf> value;
        RecyclerView recyclerView;
        Integer num = (Integer) obj;
        GiftPanelLeafViewModel LJJII = ((C32553Cq5) aObserverS73S0100000_5.l0).LJJII();
        if (LJJII != null && (mutableLiveData = LJJII.LJLJI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<C32713Csf> it = value.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    int i2 = it.next().LIZ;
                    if (num != null && i2 == num.intValue()) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf == null || valueOf.intValue() == -1 || (recyclerView = ((C32553Cq5) aObserverS73S0100000_5.l0).LJLJLLL) == null) {
                return;
            }
            recyclerView.LJLI(valueOf.intValue());
        }
    }

    public static final void onChanged$60(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        CVG cvg = (CVG) obj;
        if (!((CZO) aObserverS73S0100000_5.l0).LJIILIIL && (!cvg.LIZ.isEmpty())) {
            ((CZO) aObserverS73S0100000_5.l0).LJIILIIL = true;
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).addDisplaySourceOption(((CZO) aObserverS73S0100000_5.l0).LJII, new C30796C6u());
        }
    }

    public static final void onChanged$61(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        CZW czw;
        CZW czw2;
        CZP czp = (CZP) obj;
        CZP czp2 = ((CZN) aObserverS73S0100000_5.l0).LJI;
        CZW czw3 = null;
        if (czp2 != null) {
            czw = czp2.LIZJ;
        } else {
            czw = null;
        }
        if (czp != null) {
            czw2 = czp.LIZJ;
        } else {
            czw2 = null;
        }
        boolean z = true;
        if (czw == czw2) {
            IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
            CZN czn = (CZN) aObserverS73S0100000_5.l0;
            iPublicScreenService.ZD(czn.LJII, czn.LIZ(czp, true, false));
        } else {
            IPublicScreenService iPublicScreenService2 = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
            CZN czn2 = (CZN) aObserverS73S0100000_5.l0;
            long j = czn2.LJII;
            if (czn2.LJI == null || czp == null) {
                z = false;
            }
            iPublicScreenService2.ZD(j, czn2.LIZ(czp, false, z));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update indicator -> ");
            if (czp != null) {
                czw3 = czp.LIZJ;
            }
            LIZ.append(CZT.LIZJ(czw3));
            CZT.LIZLLL(X1D.LIZIZ(LIZ));
        }
        ((CZN) aObserverS73S0100000_5.l0).LJI = czp;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Boolean, O] */
    public static final void onChanged$62(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        CVC cvc = (CVC) obj;
        if (LiveGameStarCommentSetting.INSTANCE.enable()) {
            if (cvc == null) {
                ((C32537Cpp) ((CZN) aObserverS73S0100000_5.l0).LIZJ.gv0(CZM.class)).LIZ = Boolean.FALSE;
                ((CZN) aObserverS73S0100000_5.l0).LIZJ.pv0(StarCommentHideEvent.class);
            } else {
                ((C32537Cpp) ((CZN) aObserverS73S0100000_5.l0).LIZJ.gv0(CZM.class)).LIZ = Boolean.TRUE;
                ((CZN) aObserverS73S0100000_5.l0).LIZJ.rv0(StarCommentDataChannel.class, cvc);
            }
        }
        if (cvc != null) {
            CZN czn = (CZN) aObserverS73S0100000_5.l0;
            if (czn.LJIIJJI) {
                czn.LIZIZ(true);
            } else {
                czn.LIZIZ(false);
            }
        } else {
            ((CZN) aObserverS73S0100000_5.l0).LIZIZ(false);
        }
        CZN czn2 = (CZN) aObserverS73S0100000_5.l0;
        CVC cvc2 = czn2.LIZLLL;
        if (cvc2 == null) {
            if (cvc != null) {
                InterfaceC06390Mx LIZ = CN1.LIZ(IPublicScreenService.class);
                o.LJIIIIZZ(LIZ, "getService(IPublicScreenService::class.java)");
                czn2.LJFF = ((IPublicScreenService) LIZ).UW(((CZN) aObserverS73S0100000_5.l0).LJII, new C31353CSf(cvc), false);
            }
        } else if (cvc != null) {
            if (o.LJ(cvc.LJLIL, cvc2.LJLIL)) {
                CZN czn3 = (CZN) aObserverS73S0100000_5.l0;
                CSH<? extends CRD> csh = czn3.LJFF;
                if (csh != null) {
                    CZV czv = czn3.LJ;
                    CZV czv2 = CZV.DISPLAYING;
                    if (czv != czv2 && cvc.LJLLI == czv2) {
                        if (czv == CZV.SELF_WAITING) {
                            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).dh0(czn3.LJII, csh, 2);
                        } else {
                            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).dh0(czn3.LJII, csh, 1);
                        }
                    } else if (cvc.LJLLI == czv2) {
                        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).dh0(czn3.LJII, csh, 2);
                    }
                } else {
                    InterfaceC06390Mx LIZ2 = CN1.LIZ(IPublicScreenService.class);
                    o.LJIIIIZZ(LIZ2, "getService(IPublicScreenService::class.java)");
                    czn3.LJFF = ((IPublicScreenService) LIZ2).UW(((CZN) aObserverS73S0100000_5.l0).LJII, new C31353CSf(cvc), false);
                }
            } else {
                if (((CZN) aObserverS73S0100000_5.l0).LJFF != null) {
                    IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
                    CZN czn4 = (CZN) aObserverS73S0100000_5.l0;
                    iPublicScreenService.Lb0(czn4.LJII, czn4.LJFF, true);
                }
                ((CZN) aObserverS73S0100000_5.l0).LJFF = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).UW(((CZN) aObserverS73S0100000_5.l0).LJII, new C31353CSf(cvc), true);
            }
        } else {
            if (czn2.LJFF != null) {
                InterfaceC06390Mx LIZ3 = CN1.LIZ(IPublicScreenService.class);
                o.LJIIIIZZ(LIZ3, "getService(IPublicScreenService::class.java)");
                CZN czn5 = (CZN) aObserverS73S0100000_5.l0;
                ((IPublicScreenService) LIZ3).Lb0(czn5.LJII, czn5.LJFF, false);
            }
            ((CZN) aObserverS73S0100000_5.l0).LJFF = null;
        }
        CZN czn6 = (CZN) aObserverS73S0100000_5.l0;
        czn6.LIZLLL = cvc;
        if (cvc != null) {
            czn6.LJ = cvc.LJLLI;
        }
    }

    public static final void onChanged$63(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        CVG cvg = (CVG) obj;
        if (!((CZN) aObserverS73S0100000_5.l0).LJIIJ && (!cvg.LIZ.isEmpty())) {
            ((CZN) aObserverS73S0100000_5.l0).LJIIJ = true;
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).addDisplaySourceOption(((CZN) aObserverS73S0100000_5.l0).LJII, new C30797C6v());
        }
    }

    public static final void onChanged$64(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        C06900Ow c06900Ow = (C06900Ow) obj;
        if (c06900Ow == null) {
            return;
        }
        if (c06900Ow.LIZ == EnumC06890Ov.RUNNING) {
            ((BOD) aObserverS73S0100000_5.l0).LJLILLLLZI.setVisibility(0);
        } else {
            ((BOD) aObserverS73S0100000_5.l0).LJLILLLLZI.setVisibility(8);
        }
    }

    public static final void onChanged$65(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        String s = (String) obj;
        o.LJIIIZ(s, "s");
        ((TextView) ((C31747Cd5) aObserverS73S0100000_5.l0).LJLIL.findViewById(R.id.title)).setText(s);
    }

    public static final void onChanged$66(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Drawable s = (Drawable) obj;
        o.LJIIIZ(s, "s");
        ((ImageView) ((C31747Cd5) aObserverS73S0100000_5.l0).LJLIL.findViewById(R.id.e_q)).setImageDrawable(s);
    }

    public static final void onChanged$67(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        String s = (String) obj;
        o.LJIIIZ(s, "s");
        ((C31747Cd5) aObserverS73S0100000_5.l0).L(s);
    }

    public static final void onChanged$68(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        ((LiveProfileAudienceOperationCell) aObserverS73S0100000_5.l0).LJIILIIL(false);
    }

    public static final void onChanged$69(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        if (o.LJ(obj, Boolean.TRUE)) {
            LiveWidget liveWidget = ((GiftHistoryWidgetHelper) aObserverS73S0100000_5.l0).LJLLI;
            if (liveWidget != null) {
                liveWidget.hide();
                return;
            }
            return;
        }
        LiveWidget liveWidget2 = ((GiftHistoryWidgetHelper) aObserverS73S0100000_5.l0).LJLLI;
        if (liveWidget2 == null) {
            return;
        }
        liveWidget2.show();
    }

    public static final void onChanged$7(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        String str;
        Resources resources;
        Integer leftTime = (Integer) obj;
        MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment = (MultiGuestGoLivePreviewFragment) aObserverS73S0100000_5.l0;
        o.LJIIIIZZ(leftTime, "leftTime");
        int intValue = leftTime.intValue();
        if (multiGuestGoLivePreviewFragment.LLILII != null && MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportPauseGoLiveInPreviewPanel()) {
            C2A7 c2a7 = multiGuestGoLivePreviewFragment.LLIIZ;
            if (c2a7 != null) {
                c2a7.setText(BML.LIZ(C15380j0.LJIILJJIL(R.string.n99), Integer.valueOf(intValue)));
            }
        } else {
            C2A7 c2a72 = multiGuestGoLivePreviewFragment.LLIIZ;
            if (c2a72 != null) {
                Context context = multiGuestGoLivePreviewFragment.getContext();
                if (context == null || (resources = context.getResources()) == null || (str = resources.getQuantityString(R.plurals.m0, intValue, Integer.valueOf(intValue))) == null) {
                    str = "";
                }
                c2a72.setText(str);
            }
        }
        if (intValue == 0) {
            if (multiGuestGoLivePreviewFragment.LLILII != null && MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportPauseGoLiveInPreviewPanel()) {
                C2A7 c2a73 = multiGuestGoLivePreviewFragment.LLIIZ;
                if (c2a73 != null) {
                    c2a73.setText(R.string.nah);
                }
            } else {
                C2A7 c2a74 = multiGuestGoLivePreviewFragment.LLIIZ;
                if (c2a74 != null) {
                    c2a74.setText(R.string.soa);
                }
            }
        }
        if (leftTime.intValue() == 0) {
            MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment2 = (MultiGuestGoLivePreviewFragment) aObserverS73S0100000_5.l0;
            multiGuestGoLivePreviewFragment2.LLILLJJLI = "timeout";
            multiGuestGoLivePreviewFragment2.LLILLIZIL = "others";
        }
    }

    public static final void onChanged$8(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Room LJJIJLIJ;
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (!it.booleanValue() || (LJJIJLIJ = C29306Beo.LJJIJLIJ(((MultiGuestGoLivePreviewFragment) aObserverS73S0100000_5.l0).dataChannel)) == null) {
            return;
        }
        C30868C9o.LJI(C15380j0.LJIILL(R.string.n9e, C05170If.LIZ(LJJIJLIJ.getOwner())));
    }

    public static final void onChanged$9(AObserverS73S0100000_5 aObserverS73S0100000_5, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            ((MultiGuestGoLivePreviewFragment) aObserverS73S0100000_5.l0).getClass();
            C30868C9o.LJI(BML.LIZ(C15380j0.LJIILJJIL(R.string.nbg), Integer.valueOf(MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime.INSTANCE.getMiniutes())));
        }
    }
}
