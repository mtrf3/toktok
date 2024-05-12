package kotlin.jvm.internal;

import X.AbstractC029409q;
import X.AbstractC19020os;
import X.AbstractC19190p9;
import X.AbstractC34571Xh;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.B35;
import X.B9K;
import X.BAF;
import X.BAI;
import X.BEF;
import X.BGH;
import X.BGJ;
import X.BH0;
import X.BHW;
import X.BHZ;
import X.BJM;
import X.BUV;
import X.BV1;
import X.BV8;
import X.BWG;
import X.BYO;
import X.BYS;
import X.BZI;
import X.C04120Ee;
import X.C04130Ef;
import X.C05590Jv;
import X.C06900Ow;
import X.C0M;
import X.C0NB;
import X.C11;
import X.C15610jN;
import X.C18960om;
import X.C1O4;
import X.C28509BGv;
import X.C28511BGx;
import X.C28512BGy;
import X.C28513BGz;
import X.C28787BRn;
import X.C28882BVe;
import X.C28907BWd;
import X.C28963BYh;
import X.C28984BZc;
import X.C29306Beo;
import X.C29311Bet;
import X.C29419Bgd;
import X.C29494Bhq;
import X.C29688Bky;
import X.C29689Bkz;
import X.C29821Bn7;
import X.C30211BtP;
import X.C30230Bti;
import X.C30444BxA;
import X.C30466BxW;
import X.C30577BzJ;
import X.C30588BzU;
import X.C30590BzW;
import X.C30610Bzq;
import X.C30620C0a;
import X.C30627C0h;
import X.C31306CQk;
import X.C31583CaR;
import X.C31954CgQ;
import X.C32208CkW;
import X.C32364Cn2;
import X.C32537Cpp;
import X.C32696CsO;
import X.C34561Xg;
import X.C38113ExZ;
import X.C38129Exp;
import X.C51029K0z;
import X.C61447O9r;
import X.C61878OQg;
import X.C68322mC;
import X.C75233Tfp;
import X.C76800UCe;
import X.C76825UDd;
import X.C76832UDk;
import X.C79004UzY;
import X.C79146V4k;
import X.C7N;
import X.CLM;
import X.CLN;
import X.CLQ;
import X.CN1;
import X.CQK;
import X.CQQ;
import X.EnumC04110Ed;
import X.EnumC12540eQ;
import X.EnumC30204BtI;
import X.EnumC30231Btj;
import X.EnumC30241Btt;
import X.EnumC30410Bwc;
import X.EnumC32853Cuv;
import X.EnumC74778TWk;
import X.InterfaceC06390Mx;
import X.InterfaceC25704A6y;
import X.InterfaceC30237Btp;
import X.InterfaceC30264BuG;
import X.InterfaceC30442Bx8;
import X.InterfaceC31587CaV;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.J71;
import X.ORZ;
import X.UFE;
import X.ViewOnClickListenerC28501BGn;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.PreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.impl.revenue.subscription.SubscribeService;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.widget.OthersLikeWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveImportHostLynxJsb;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveBadgeLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowGuidVoidSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizWindowFixSetting;
import com.bytedance.android.livesdk.lynx.bridge.TTLiveLynxBridgeModule;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideMsgInfo;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.QASuggestedFragment;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ql1.IDbS495S0100000_5;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* loaded from: classes6.dex */
public class AqS136S0200000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            case 34:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case 36:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this, obj);
            case C61447O9r.LJIIJ:
                return invoke$49(this, obj);
            case 50:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        o.LJIIIZ(obj, "switch");
        BGJ bgj = (BGJ) aqS136S0200000_5.l0;
        View view = (View) aqS136S0200000_5.l1;
        bgj.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_entrance_click");
        LIZ.LJIILLIIL(bgj.LJLILLLLZI);
        BAI.LIZ(LIZ);
        LIZ.LJJIIJZLJL();
        if (obj == EnumC12540eQ.ON && !BAF.LJIIIZ(view.getContext(), bgj.LJLILLLLZI, new BGH(bgj))) {
            bgj.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        LiveIconView liveIconView = (LiveIconView) aqS136S0200000_5.l0;
        if (liveIconView != null) {
            C11 c11 = (C11) aqS136S0200000_5.l1;
            if (intValue == 0) {
                int i2 = c11.LJLJLLL;
                if (i2 > 0 && (i = c11.LJLL) > 0) {
                    ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
                    layoutParams.width = i2;
                    layoutParams.height = i;
                    liveIconView.setLayoutParams(layoutParams);
                }
            } else {
                int LIZ = (int) B9K.LIZ(c11.LJLJLJ, 30.0f);
                int LIZ2 = (int) B9K.LIZ(c11.LJLJLJ, 30.0f);
                ViewGroup.LayoutParams layoutParams2 = liveIconView.getLayoutParams();
                layoutParams2.width = LIZ;
                layoutParams2.height = LIZ2;
                liveIconView.setLayoutParams(layoutParams2);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            OthersLikeWidget othersLikeWidget = (OthersLikeWidget) aqS136S0200000_5.l0;
            if (!othersLikeWidget.LJZ) {
                othersLikeWidget.LJZ = true;
                othersLikeWidget.LJLZ = false;
                othersLikeWidget.LJLLLL.clear();
                ((OthersLikeWidget) aqS136S0200000_5.l0).LJLLLLLL.clear();
                OthersLikeWidget othersLikeWidget2 = (OthersLikeWidget) aqS136S0200000_5.l0;
                int i = (int) ((LikeEffect) aqS136S0200000_5.l1).effectCnt;
                LikeHelper likeHelper = othersLikeWidget2.LJLLI;
                Bitmap bitmap = null;
                if (likeHelper != null) {
                    bitmap = likeHelper.LJJIIJZLJL(null);
                }
                for (int i2 = 0; i2 < i; i2++) {
                    othersLikeWidget2.LJZ(-1, bitmap);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        C1O4 c1o4;
        SparkContext context = (SparkContext) obj;
        o.LJIIIZ(context, "context");
        context.LJJIJIL(new CLM());
        if (LiveQuizWindowFixSetting.INSTANCE.getValue()) {
            context.LJJIFFI(1, "ignore_keyboard_status_change");
            context.LJJIFFI(1, "force_dialog_non_cancelable");
        }
        LayeredElementContext layeredElementContext = ((ActQuizWidget) aqS136S0200000_5.l0).getLayeredElementContext();
        if ((layeredElementContext instanceof C1O4) && (c1o4 = (C1O4) layeredElementContext) != null) {
            context.LJJIIZ(Integer.valueOf(c1o4.LJIIJ + c1o4.LIZJ), "top_element_height");
            context.LJJIIZ(Integer.valueOf(c1o4.LJIIIZ + c1o4.LIZLLL + c1o4.LJI + c1o4.LIZJ), "comments_element_height");
            context.LJJIIZ(Integer.valueOf(c1o4.LJI + c1o4.LIZJ), "toolbar_element_height");
        }
        context.LJJIJIIJIL(new CLN((ActQuizWidget) aqS136S0200000_5.l0, (C68322mC) aqS136S0200000_5.l1));
        context.LJJI(new IDbS495S0100000_5((ActQuizWidget) aqS136S0200000_5.l0, 5));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        BorderInfo borderInfo = (BorderInfo) obj;
        o.LJIIIZ(borderInfo, "borderInfo");
        ((LiveProfileDialog) aqS136S0200000_5.l0).Il(borderInfo, (User) ((C68322mC) aqS136S0200000_5.l1).element, true);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        BorderInfo borderInfo = (BorderInfo) obj;
        o.LJIIIZ(borderInfo, "borderInfo");
        ((LiveProfileDialog) aqS136S0200000_5.l0).Il(borderInfo, (User) ((C68322mC) aqS136S0200000_5.l1).element, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(128);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(128);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(256);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(256);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(512);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(512);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(1024);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(1024);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(4096);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(4096);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        o.LJIIIZ(it, "it");
        ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        List<PollOptionInfo> list;
        PollUpdateVotesContent pollUpdateVotesContent;
        o.LJIIIZ(it, "it");
        C04120Ee LIZJ = C30627C0h.LIZJ(((Room) aqS136S0200000_5.l0).getId());
        if (LIZJ != null) {
            DataChannel dataChannel = (DataChannel) aqS136S0200000_5.l1;
            Room room = (Room) aqS136S0200000_5.l0;
            LIZJ.LIZ(EnumC04110Ed.LIVE_END);
            PollMessage pollMessage = LIZJ.LJI;
            if (pollMessage != null) {
                PollEndContent pollEndContent = new PollEndContent();
                PollMessage pollMessage2 = C30627C0h.LJLJJLL;
                if (pollMessage2 == null || (pollUpdateVotesContent = pollMessage2.updateContent) == null || (list = pollUpdateVotesContent.optionList) == null) {
                    list = C61878OQg.INSTANCE;
                }
                pollEndContent.optionList = list;
                pollMessage.endContent = pollEndContent;
            }
            C04130Ef.LJII(dataChannel, LIZJ, "close_take");
            C30627C0h.LJIIL(room.getId(), LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Number) obj).intValue() > 0) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).nv0();
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(1);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        C75233Tfp it = (C75233Tfp) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI > 0) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).nv0();
        }
        EnumC74778TWk enumC74778TWk = it.LJLIL;
        if ((enumC74778TWk == EnumC74778TWk.FLOATING && it.LJLILLLLZI > 0) || enumC74778TWk == EnumC74778TWk.FLOATING_FIX) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(2);
        } else if ((enumC74778TWk == EnumC74778TWk.GRID && it.LJLILLLLZI > 0) || enumC74778TWk == EnumC74778TWk.GRID_FIX) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(4);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(6);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(8);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        String str;
        C32208CkW it = (C32208CkW) obj;
        o.LJIIIZ(it, "it");
        int i = it.LIZ;
        if (i == 0) {
            GuidanceViewModel guidanceViewModel = (GuidanceViewModel) aqS136S0200000_5.l0;
            guidanceViewModel.LJLLILLLL = true;
            NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = guidanceViewModel.LJLJLLL;
            if (newAnchorGuideMsgInfo != null) {
                str = newAnchorGuideMsgInfo.messageKey;
            } else {
                str = null;
            }
            if (o.LJ(str, "co_host_guide")) {
                guidanceViewModel.mv0(guidanceViewModel.LJLJLLL);
                guidanceViewModel.hv0().removeCallbacks(guidanceViewModel.LJLLLL);
                guidanceViewModel.LJLJLLL = null;
            }
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(16);
        } else if (i == 1) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(16);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        o.LJIIIZ(it, "it");
        ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(32);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(2048);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(2048);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GuidanceViewModel) aqS136S0200000_5.l0).jv0(64);
        } else {
            ((GuidanceViewModel) aqS136S0200000_5.l0).iv0(64);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        boolean z;
        GiftMessage giftMessage = (GiftMessage) obj;
        InterfaceC31587CaV interfaceC31587CaV = (InterfaceC31587CaV) aqS136S0200000_5.l0;
        C31583CaR c31583CaR = (C31583CaR) aqS136S0200000_5.l1;
        if (!c31583CaR.LJLJI && c31583CaR.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        ((GiftWidget) interfaceC31587CaV).LL(giftMessage, z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        ActivityC45651qj LIZIZ;
        if (obj == EnumC12540eQ.OFF) {
            ((InterfaceC30237Btp) aqS136S0200000_5.l0).setAlpha(0.34f);
        } else {
            ((InterfaceC30237Btp) aqS136S0200000_5.l0).setAlpha(1.0f);
            ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(((InterfaceC30237Btp) aqS136S0200000_5.l0).getContext());
            if (LIZIZ2 != null) {
                C30444BxA.LIZJ(EnumC30410Bwc.LIVE_BROADCAST_MORE_GOODYBAG, LIZIZ2, ((InterfaceC30237Btp) aqS136S0200000_5.l0).LIZ(R.id.ldl), null, 4);
            }
            View view = EnumC30204BtI.MORE.getView((DataChannel) aqS136S0200000_5.l1);
            if (view != null && (LIZIZ = C29306Beo.LIZIZ(view.getContext())) != null) {
                C30444BxA.LIZJ(EnumC30410Bwc.LIVE_BROADCAST_MORE, LIZIZ, view.findViewById(R.id.ldl), null, 4);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            BAF.LJJIFFI((BaseFragment) aqS136S0200000_5.l0, (InterfaceC88472Yns) aqS136S0200000_5.l1);
        } else {
            ((InterfaceC88472Yns) aqS136S0200000_5.l1).invoke(Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        InterfaceC30237Btp interfaceC30237Btp;
        BEF it = (BEF) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLJJI && o.LJ(it.LJLJJLL, "POLL") && ((C79146V4k.LJJJI((DataChannel) aqS136S0200000_5.l0) || C29306Beo.LJIIJ((DataChannel) aqS136S0200000_5.l0)) && (interfaceC30237Btp = ((BYS) aqS136S0200000_5.l1).LJLJJI) != null)) {
            interfaceC30237Btp.setAlpha(0.34f);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        C30620C0a LLFII;
        AbstractC029409q adapter;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C0M c0m = (C0M) aqS136S0200000_5.l0;
        c0m.LJFF = booleanValue;
        int indexOf = ((PreviewLiveModeWidget) aqS136S0200000_5.l1).LJLJI.indexOf(c0m);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateVoiceChatRedDot's value:");
        LIZ.append(booleanValue);
        LIZ.append(" index:");
        LIZ.append(indexOf);
        C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
        if (indexOf >= 0 && (LLFII = ((PreviewLiveModeWidget) aqS136S0200000_5.l1).LLFII()) != null && (adapter = LLFII.LJLIL.getAdapter()) != null) {
            adapter.notifyItemChanged(indexOf + 1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1 == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$31(kotlin.jvm.internal.AqS136S0200000_5 r5, java.lang.Object r6) {
        /*
            com.bytedance.android.live.broadcast.model.RoomCreateInfo r6 = (com.bytedance.android.live.broadcast.model.RoomCreateInfo) r6
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget r0 = (com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget) r0
            r0.LJLJL = r6
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.dataChannel
            if (r1 == 0) goto L5d
            java.lang.Class<com.bytedance.android.live.LiveModeChannel> r0 = com.bytedance.android.live.LiveModeChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 == 0) goto L5d
            boolean r1 = X.C28509BGv.LIZLLL(r0)
            r0 = 1
            if (r1 != r0) goto L5d
        L22:
            java.lang.String r1 = "PreviewCoverWidget"
            if (r0 == 0) goto L42
            java.lang.String r0 = "isLiveVoice, use voice cover"
            X.C0NB.LIZIZ(r1, r0)
            java.lang.Object r4 = r5.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget r4 = (com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget) r4
            java.lang.Object r3 = r5.l1
            X.BGn r3 = (X.ViewOnClickListenerC28501BGn) r3
            int r2 = r6.voiceCoverAuditStatus
            com.bytedance.android.live.base.model.ImageModel r1 = r6.voiceCover
            boolean r0 = r6.useAvatarAsVoiceCover
            r4.getClass()
            com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget.LL(r3, r2, r1, r0)
        L3f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L42:
            java.lang.String r0 = "not isLiveVoice, use cover"
            X.C0NB.LIZIZ(r1, r0)
            java.lang.Object r4 = r5.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget r4 = (com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget) r4
            java.lang.Object r3 = r5.l1
            X.BGn r3 = (X.ViewOnClickListenerC28501BGn) r3
            long r0 = r6.mCoverAuditStatus
            int r2 = (int) r0
            com.bytedance.android.live.base.model.ImageModel r1 = r6.mCover
            boolean r0 = r6.useAvatarAsCover
            r4.getClass()
            com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget.LL(r3, r2, r1, r0)
            goto L3f
        L5d:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS136S0200000_5.invoke$31(kotlin.jvm.internal.AqS136S0200000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$32(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        ((C28882BVe) aqS136S0200000_5.l0).LJFF.postValue(C06900Ow.LIZJ);
        ((AbstractC19020os) aqS136S0200000_5.l1).LIZ(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        List list = (List) obj;
        ArrayList LJ = AnonymousClass391.LJ(list, "response");
        C28882BVe c28882BVe = (C28882BVe) aqS136S0200000_5.l0;
        if (c28882BVe.LJIIJ) {
            if ((!BV1.LJ(c28882BVe.LIZJ) && ((C28882BVe) aqS136S0200000_5.l0).LIZLLL) || BV1.LJI(((C28882BVe) aqS136S0200000_5.l0).LIZJ)) {
                LJ.add(new QuestionEx(new Question(0L, "", 12, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
            }
            LJ.add(new QuestionEx(new Question(0L, "", 13, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
        }
        if (!C79004UzY.LJJIFFI(list)) {
            LJ.addAll(list);
        }
        C28882BVe c28882BVe2 = (C28882BVe) aqS136S0200000_5.l0;
        if (((c28882BVe2.LJIIJ || c28882BVe2.LJIIJJI) && LJ.size() == 2) || (!((C28882BVe) aqS136S0200000_5.l0).LJIIJ && LJ.size() == 0)) {
            ((C28882BVe) aqS136S0200000_5.l0).LJII.postValue(Boolean.TRUE);
            ((AbstractC34571Xh) aqS136S0200000_5.l1).LIZ(new ArrayList());
        } else {
            ((C28882BVe) aqS136S0200000_5.l0).LJII.postValue(Boolean.FALSE);
            ((AbstractC34571Xh) aqS136S0200000_5.l1).LIZIZ(LJ.size(), LJ);
        }
        MutableLiveData<C06900Ow> mutableLiveData = ((C28882BVe) aqS136S0200000_5.l0).LJI;
        C06900Ow c06900Ow = C06900Ow.LIZJ;
        mutableLiveData.postValue(c06900Ow);
        ((C28882BVe) aqS136S0200000_5.l0).LJFF.postValue(c06900Ow);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((BWG) aqS136S0200000_5.l0).P((Question) aqS136S0200000_5.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue >= 0) {
            BV8 bv8 = ((QASuggestedFragment) aqS136S0200000_5.l0).LJLJL;
            if (bv8 != null) {
                C18960om<T> c18960om = bv8.LJLIL;
                AbstractC19190p9 abstractC19190p9 = c18960om.LJI;
                if (abstractC19190p9 == null) {
                    abstractC19190p9 = c18960om.LJFF;
                }
                if (abstractC19190p9 != null && intValue < abstractC19190p9.size()) {
                    BV8 bv82 = ((QASuggestedFragment) aqS136S0200000_5.l0).LJLJL;
                    if (bv82 != null) {
                        QuestionEx LJJIZ = bv82.LJJIZ(intValue);
                        if (LJJIZ != null && LJJIZ.question.questionId != 0) {
                            DataChannel dataChannel = (DataChannel) aqS136S0200000_5.l1;
                            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_list_question_show");
                            LIZ.LJIILLIIL(dataChannel);
                            LIZ.LJIJJ(Integer.valueOf(LJJIZ.question.createFrom), "create_from");
                            LIZ.LJIJJ(Long.valueOf(LJJIZ.question.questionId), "question_id");
                            LIZ.LJIJJ(LJJIZ.question.recReqId, "rec_req_id");
                            LIZ.LJIJJ(Integer.valueOf(LJJIZ.LJLJJL), "rsp_num");
                            UFE.LIZIZ(LJJIZ.LJLJJLL, LIZ, "rsp_pos");
                        }
                    } else {
                        o.LJIJI("questionAdapter");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("questionAdapter");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        SparkContext context = (SparkContext) obj;
        o.LJIIIZ(context, "context");
        context.LJJIJIIJIL(new CLQ((InterfaceC65784Pro) aqS136S0200000_5.l0, (InterfaceC65784Pro) aqS136S0200000_5.l1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    public static final Object invoke$37(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C32537Cpp) ((DataChannel) aqS136S0200000_5.l0).gv0(C30590BzW.class)).LIZ = Boolean.FALSE;
            InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) aqS136S0200000_5.l1;
            if (interfaceC30237Btp != null) {
                interfaceC30237Btp.setVisibility(8);
            }
            C30588BzU.LJIIIIZZ((DataChannel) aqS136S0200000_5.l0);
        } else {
            InterfaceC30237Btp interfaceC30237Btp2 = (InterfaceC30237Btp) aqS136S0200000_5.l1;
            if (interfaceC30237Btp2 != null) {
                interfaceC30237Btp2.setVisibility(0);
            }
            C30588BzU.LIZ = System.currentTimeMillis();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        DataChannel dataChannel;
        ((InterfaceC88472Yns) aqS136S0200000_5.l0).invoke(obj);
        if (obj != null && (dataChannel = (DataChannel) aqS136S0200000_5.l1) != null) {
            dataChannel.rv0(HashTagResp.class, obj);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        String uri = UriProtector.parse(it).buildUpon().appendQueryParameter("id", String.valueOf(((C28907BWd) aqS136S0200000_5.l0).LIZIZ)).appendQueryParameter("source", "inapp").appendQueryParameter("enter_from", "toast").build().toString();
        o.LJIIIIZZ(uri, "parse(it).buildUpon()\n  …      .build().toString()");
        ((InterfaceC88472Yns) aqS136S0200000_5.l1).invoke(uri);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        BEF bef = (BEF) ((DataChannel) aqS136S0200000_5.l0).kv0(LiveBanCapabilityChannel.class);
        if (bef != null && bef.LJLJJI && (C79146V4k.LJJJI((DataChannel) aqS136S0200000_5.l0) || C29306Beo.LJIIJ((DataChannel) aqS136S0200000_5.l0))) {
            InterfaceC30237Btp interfaceC30237Btp = ((BYS) aqS136S0200000_5.l1).LJLJJI;
            if (interfaceC30237Btp != null) {
                interfaceC30237Btp.setAlpha(0.34f);
            }
        } else {
            InterfaceC30237Btp interfaceC30237Btp2 = ((BYS) aqS136S0200000_5.l1).LJLJJI;
            if (interfaceC30237Btp2 != null) {
                interfaceC30237Btp2.setAlpha(1.0f);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        String str;
        String str2;
        o.LJIIIZ(it, "it");
        PreviewLiveProNotifyWidget previewLiveProNotifyWidget = (PreviewLiveProNotifyWidget) aqS136S0200000_5.l0;
        previewLiveProNotifyWidget.getClass();
        BZI LIZ = C28787BRn.LIZ("banner_click");
        LIZ.LJIILLIIL(previewLiveProNotifyWidget.dataChannel);
        LIZ.LJIJJ("custom_dynamic", "banner_type");
        LIZ.LJIJJ("live_take_page", "banner_page");
        LIZ.LJIJJ(previewLiveProNotifyWidget.LJLJJLL, "banner_content_starling_key");
        LiveMode liveMode = (LiveMode) previewLiveProNotifyWidget.dataChannel.kv0(LiveModeChannel.class);
        if (liveMode != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = "video_live";
        }
        LIZ.LJIJ(str);
        LIZ.LJIJJ(1, "is_anchor");
        LIZ.LJJIIJZLJL();
        ImageModel imageModel = ((LiveProInfo) aqS136S0200000_5.l1).banner;
        if (imageModel != null && (str2 = imageModel.schema) != null) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
            Context context = ((PreviewLiveProNotifyWidget) aqS136S0200000_5.l0).context;
            o.LJIIIIZZ(context, "context");
            C05590Jv.LJ((IHybridContainerService) LIZ2, context, str2);
        }
        InterfaceC30442Bx8.z2.LIZJ(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        String str;
        DataChannel dataChannel;
        Room room;
        Long valueOf;
        EnumC32853Cuv closeReason = (EnumC32853Cuv) obj;
        o.LJIIIZ(closeReason, "closeReason");
        LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2 = (LiveGiftGuideWidgetV2) aqS136S0200000_5.l0;
        GiftGuideMessage giftGuideMessage = (GiftGuideMessage) aqS136S0200000_5.l1;
        boolean z = giftGuideMessage.hasSent;
        CommonMessageData commonMessageData = giftGuideMessage.baseMessage;
        if (commonMessageData == null || (str = commonMessageData.logId) == null) {
            str = "";
        }
        liveGiftGuideWidgetV2.LJZI(closeReason, z, str, giftGuideMessage);
        if (C76825UDd.LIZ((GiftGuideMessage) aqS136S0200000_5.l1) && (dataChannel = ((LiveGiftGuideWidgetV2) aqS136S0200000_5.l0).dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (valueOf = Long.valueOf(room.getId())) != null) {
            valueOf.longValue();
            int i = C76832UDk.LIZ[closeReason.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C32696CsO.LIZIZ(valueOf.longValue(), 2);
                }
            } else {
                C32696CsO.LIZIZ(valueOf.longValue(), 3);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        EnumC30204BtI enumC30204BtI;
        EnumC30231Btj it = (EnumC30231Btj) obj;
        o.LJIIIZ(it, "it");
        if (C30230Bti.LJIIIZ == null && C30230Bti.LJIIJ == null) {
            C30230Bti.LJI = it;
            int LIZ = C30230Bti.LIZ((ViewGroup) aqS136S0200000_5.l1) + C30230Bti.LIZ((ViewGroup) aqS136S0200000_5.l0);
            C30230Bti.LJ = LIZ;
            if (LIZ > C30230Bti.LJFF || C30230Bti.LJI == EnumC30231Btj.EXCEEDS) {
                if (C30230Bti.LIZLLL) {
                    List<EnumC30204BtI> list = C30230Bti.LIZ;
                    List<EnumC30204BtI> list2 = C30230Bti.LIZIZ;
                    EnumC30204BtI enumC30204BtI2 = (EnumC30204BtI) ORZ.LJLLLL(ORZ.LLIIIILZ(list, list2));
                    if (enumC30204BtI2 != null) {
                        ((ArrayList) list2).add(enumC30204BtI2);
                        C15610jN.LIZIZ(new ARunnableS41S0100000_5(enumC30204BtI2, 276));
                        C30230Bti.LJIIIZ = enumC30204BtI2;
                    }
                }
            } else {
                EnumC30231Btj enumC30231Btj = C30230Bti.LJI;
                EnumC30231Btj enumC30231Btj2 = EnumC30231Btj.CAN_HOLD_MORE;
                if (enumC30231Btj == enumC30231Btj2 && C30230Bti.LIZLLL && C30230Bti.LJ < C30230Bti.LJFF) {
                    ArrayList arrayList = (ArrayList) C30230Bti.LIZIZ;
                    if ((!arrayList.isEmpty()) && C30230Bti.LJI == enumC30231Btj2 && (enumC30204BtI = (EnumC30204BtI) ORZ.LLFF(arrayList)) != null) {
                        arrayList.remove(enumC30204BtI);
                        C15610jN.LIZIZ(new ARunnableS41S0100000_5(enumC30204BtI, 277));
                        C30230Bti.LJIIJ = enumC30204BtI;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        C28984BZc c28984BZc;
        DataChannel dataChannel;
        o.LJIIIZ(obj, "switch");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_background_click");
        LIZ.LJIILLIIL(((C28984BZc) aqS136S0200000_5.l0).LJLILLLLZI);
        LIZ.LJJIIJZLJL();
        if (obj != EnumC12540eQ.OFF && (dataChannel = (c28984BZc = (C28984BZc) aqS136S0200000_5.l0).LJLILLLLZI) != null) {
            View view = (View) aqS136S0200000_5.l1;
            FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
            if (fragmentManager != null) {
                C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_ENHANCE_BACKGROUND);
                IUserManageService iUserManageService = (IUserManageService) CN1.LIZ(IUserManageService.class);
                view.getContext();
                iUserManageService.Ye0(c28984BZc.LJLJJI, dataChannel, 7);
                IEffectService iEffectService = (IEffectService) CN1.LIZ(IEffectService.class);
                iEffectService.getLiveBgDialogFragment(view.getContext(), dataChannel, "solo", iEffectService.getSoloBgEffectLogManager(), c28984BZc.LJLJJL, null, null, null).show(fragmentManager, "LiveBgDialogFragment");
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0227, code lost:
    
        if (r7 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$44(kotlin.jvm.internal.AqS136S0200000_5 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS136S0200000_5.invoke$44(kotlin.jvm.internal.AqS136S0200000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$45(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        o.LJIIIZ(it, "it");
        C30466BxW c30466BxW = (C30466BxW) aqS136S0200000_5.l0;
        InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) aqS136S0200000_5.l1;
        c30466BxW.getClass();
        C30466BxW.LJI(interfaceC30237Btp, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        int intValue = ((Number) obj).intValue();
        Iterator it = ((List) aqS136S0200000_5.l0).iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setVisibility(8);
        }
        if (intValue == 1) {
            ((TextView) aqS136S0200000_5.l1).setVisibility(8);
        } else if (intValue > 1) {
            ((ImageView) ListProtector.get((List) aqS136S0200000_5.l0, 0)).setVisibility(0);
            ((ImageView) ListProtector.get((List) aqS136S0200000_5.l0, 1)).setVisibility(0);
            if (intValue > 2) {
                ((ImageView) ListProtector.get((List) aqS136S0200000_5.l0, 2)).setVisibility(0);
                if (intValue > 3) {
                    ((ImageView) ListProtector.get((List) aqS136S0200000_5.l0, 3)).setVisibility(0);
                    if (intValue > 4) {
                        ((ImageView) ListProtector.get((List) aqS136S0200000_5.l0, 4)).setVisibility(0);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        o.LJIIIZ(it, "it");
        BUV.LIZ((Context) aqS136S0200000_5.l0, (DataChannel) aqS136S0200000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$48(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        o.LJIIIZ(it, "it");
        BUV.LIZ((Context) aqS136S0200000_5.l0, (DataChannel) aqS136S0200000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        View it = (View) obj;
        o.LJIIIZ(it, "it");
        String button = ((EnumC30241Btt) aqS136S0200000_5.l0).toString();
        o.LJIIIZ(button, "button");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C30211BtP.LIZ);
        linkedHashMap.put("button", button);
        C30211BtP.LIZIZ("button_clicked", linkedHashMap);
        ((InterfaceC30264BuG) aqS136S0200000_5.l1).onClick(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        TTLiveLynxBridgeModule it = (TTLiveLynxBridgeModule) obj;
        o.LJIIIZ(it, "it");
        C31954CgQ c31954CgQ = (C31954CgQ) aqS136S0200000_5.l0;
        Activity activity = (Activity) aqS136S0200000_5.l1;
        c31954CgQ.getClass();
        if (LiveImportHostLynxJsb.INSTANCE.getValue()) {
            C38129Exp c38129Exp = new C38129Exp(new AqS155S0100000_5(c31954CgQ, 31));
            c38129Exp.LJIIL = it;
            c38129Exp.LJIILIIL = c31954CgQ.LJZI;
            C38113ExZ qh = ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).qh(c31954CgQ.LJLJLJ.LJLILLLLZI, activity, c31954CgQ.LJZI, c31954CgQ.LJLJJLL, c38129Exp);
            if (qh instanceof C38113ExZ) {
                c31954CgQ.LJLJLJ.LJLILLLLZI.LIZIZ(qh);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        boolean z;
        AnchorRoomInfoResponse.ResponseData anchorRoomInfo = (AnchorRoomInfoResponse.ResponseData) obj;
        o.LJIIIZ(anchorRoomInfo, "anchorRoomInfo");
        AnchorRoomInfoResponse.PartnershipInfo partnershipInfo = anchorRoomInfo.partnershipInfo;
        if (partnershipInfo != null) {
            z = true;
            if (partnershipInfo.showPartnership) {
                C30610Bzq c30610Bzq = (C30610Bzq) aqS136S0200000_5.l0;
                SystemClock.uptimeMillis();
                c30610Bzq.getClass();
                C30610Bzq c30610Bzq2 = (C30610Bzq) aqS136S0200000_5.l0;
                c30610Bzq2.getClass();
                C30577BzJ.LJ(c30610Bzq2.LJLJLJ);
                ((InterfaceC25704A6y) aqS136S0200000_5.l1).LIZ(z);
                return C76800UCe.LIZ;
            }
        }
        z = false;
        ((InterfaceC25704A6y) aqS136S0200000_5.l1).LIZ(z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$51(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        long longValue = ((Number) obj).longValue();
        C29311Bet c29311Bet = (C29311Bet) aqS136S0200000_5.l0;
        long j = ((C29821Bn7) aqS136S0200000_5.l1).LIZ;
        c29311Bet.getClass();
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).bt(longValue, j);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        o.LJIIIZ(it, "it");
        ((BasePreviewSettingMainFragment) aqS136S0200000_5.l0).Kl((LiveMode) aqS136S0200000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        FragmentManager fragmentManager;
        LiveMode liveMode;
        String str;
        o.LJIIIZ(it, "it");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL((BasePreviewSettingMainFragment) aqS136S0200000_5.l0);
        if (LJIILIIL != null) {
            LJIILIIL.pv0(DismissPreviewSettingDialogEvent.class);
        }
        BHW bhw = BHZ.Companion;
        LiveMode liveMode2 = (LiveMode) aqS136S0200000_5.l1;
        bhw.getClass();
        BHZ LIZ = BHW.LIZ(liveMode2);
        if (LIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("openHashtagAnchorDialog() hashTagGameTag = ");
            LIZ2.append(LIZ);
            C0NB.LJIIIZ("BasePreviewSettingMainFragment", X1D.LIZIZ(LIZ2));
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL((BasePreviewSettingMainFragment) aqS136S0200000_5.l0);
            if (LJIILIIL2 != null && (fragmentManager = (FragmentManager) LJIILIIL2.kv0(C29494Bhq.class)) != null) {
                LiveMode liveMode3 = (LiveMode) aqS136S0200000_5.l1;
                BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) aqS136S0200000_5.l0;
                IHashTagService LJIIJ = C7N.LJIIJ();
                C28511BGx c28511BGx = new C28511BGx(LIZ, basePreviewSettingMainFragment, liveMode3);
                if (liveMode3 == null) {
                    liveMode = LiveMode.VIDEO;
                } else {
                    liveMode = liveMode3;
                }
                LJIIJ.pu0(fragmentManager, c28511BGx, LIZ, liveMode);
                BZI LIZ3 = C28787BRn.LIZ("live_topic_click");
                LIZ3.LJIJJ("start", "enter_rom");
                int i = C28512BGy.LIZ[liveMode3.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        str = "third_party";
                    } else {
                        str = "screen_share";
                    }
                } else {
                    str = "video_live";
                }
                LIZ3.LJIJJ(str, "live_type");
                LIZ3.LJIILLIIL(C51029K0z.LJIILIIL(basePreviewSettingMainFragment));
                LIZ3.LJJIIJZLJL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$54(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            if (LiveBadgeLoadOptSetting.INSTANCE.lazyLoad()) {
                ((CQQ) aqS136S0200000_5.l0).LJI((CQK) aqS136S0200000_5.l1, new C31306CQk());
            } else {
                ((CQQ) aqS136S0200000_5.l0).LJFF((CQK) aqS136S0200000_5.l1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$55(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            if (LiveBadgeLoadOptSetting.INSTANCE.lazyLoad()) {
                ((CQQ) aqS136S0200000_5.l0).LJI((CQK) aqS136S0200000_5.l1, new C31306CQk());
            } else {
                ((CQQ) aqS136S0200000_5.l0).LJFF((CQK) aqS136S0200000_5.l1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$56(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        String str;
        BadgeStruct badgeStruct = (BadgeStruct) obj;
        o.LJIIIZ(badgeStruct, "badgeStruct");
        if (!((CQK) aqS136S0200000_5.l0).LJJIFFI && badgeStruct.badgeScene == 4) {
            BZI LIZ = C28787BRn.LIZ("livesdk_privilege_badge_show");
            LIZ.LJIILLIIL(((CQQ) aqS136S0200000_5.l1).LJIIIIZZ);
            LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ.LJIJJ("comment_area", "show_entrance");
            PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
            if (privilegeLogExtra == null || (str = privilegeLogExtra.privilege_id) == null) {
                str = "";
            }
            LIZ.LJIJJ(str, "privilege_id");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
            ((CQK) aqS136S0200000_5.l0).LJJIFFI = true;
        }
        ((CQK) aqS136S0200000_5.l0).LJLLILLLL(badgeStruct);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$57(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        BadgeStruct badgeStruct = (BadgeStruct) obj;
        o.LJIIIZ(badgeStruct, "badgeStruct");
        if (!((CQK) aqS136S0200000_5.l0).LJJIFFI && badgeStruct.badgeScene == 4) {
            BZI LIZ = C28787BRn.LIZ("livesdk_privilege_badge_show");
            LIZ.LJIILLIIL(((CQQ) aqS136S0200000_5.l1).LJIIIIZZ);
            LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ.LJIJJ("comment_area", "show_entrance");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
            ((CQK) aqS136S0200000_5.l0).LJJIFFI = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$58(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        boolean z;
        Integer num;
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        Creator creator = ((Room) aqS136S0200000_5.l0).creator;
        if (creator == null || (num = creator.roomContinue) == null || num.intValue() != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!C29689Bkz.LJIIJ) {
                it.LIZIZ();
                C29689Bkz.LJIILL = 2;
                it.LJIIIZ("system_event_resume_room_succeeded", "");
                C29689Bkz.LJIIJ = true;
            }
        } else if (!C29689Bkz.LJIIIZ) {
            it.LIZIZ();
            it.LJIIIZ("system_enter_room_api_succeeded", "");
            C29689Bkz.LJIIIZ = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$59(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        long j;
        o.LJIIIZ(it, "it");
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        Long l = ((PinMessageViewModel) aqS136S0200000_5.l0).LJLLLL;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        iPublicScreenService.F00(j, (C29419Bgd) aqS136S0200000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        o.LJIIIZ(it, "it");
        ((BasePreviewSettingMainFragmentSheet) aqS136S0200000_5.l0).Zl((LiveMode) aqS136S0200000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$60(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        BYO.LIZ((LatestBanRecordInfo) obj, (Context) aqS136S0200000_5.l0, (LifecycleOwner) aqS136S0200000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        FragmentManager fragmentManager;
        LiveMode liveMode;
        String str;
        o.LJIIIZ(it, "it");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) aqS136S0200000_5.l0);
        if (LJIILIIL != null) {
            LJIILIIL.pv0(DismissPreviewSettingDialogEvent.class);
        }
        BHW bhw = BHZ.Companion;
        LiveMode liveMode2 = (LiveMode) aqS136S0200000_5.l1;
        bhw.getClass();
        BHZ LIZ = BHW.LIZ(liveMode2);
        if (LIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("openHashtagAnchorDialog() hashTagGameTag = ");
            LIZ2.append(LIZ);
            C0NB.LJIIIZ("BasePreviewSettingMainFragment", X1D.LIZIZ(LIZ2));
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL((BasePreviewSettingMainFragmentSheet) aqS136S0200000_5.l0);
            if (LJIILIIL2 != null && (fragmentManager = (FragmentManager) LJIILIIL2.kv0(C29494Bhq.class)) != null) {
                LiveMode liveMode3 = (LiveMode) aqS136S0200000_5.l1;
                BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = (BasePreviewSettingMainFragmentSheet) aqS136S0200000_5.l0;
                IHashTagService LJIIJ = C7N.LJIIJ();
                C28513BGz c28513BGz = new C28513BGz(LIZ, basePreviewSettingMainFragmentSheet, liveMode3);
                if (liveMode3 == null) {
                    liveMode = LiveMode.VIDEO;
                } else {
                    liveMode = liveMode3;
                }
                LJIIJ.pu0(fragmentManager, c28513BGz, LIZ, liveMode);
                BZI LIZ3 = C28787BRn.LIZ("live_topic_click");
                LIZ3.LJIJJ("start", "enter_rom");
                int i = BH0.LIZ[liveMode3.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        str = "third_party";
                    } else {
                        str = "screen_share";
                    }
                } else {
                    str = "video_live";
                }
                LIZ3.LJIJJ(str, "live_type");
                LIZ3.LJIILLIIL(C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet));
                LIZ3.LJJIIJZLJL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS136S0200000_5 aqS136S0200000_5, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        GiftPanelBanner giftPanelBanner = (GiftPanelBanner) aqS136S0200000_5.l0;
        if (giftPanelBanner != null && (str = giftPanelBanner.schemaUrl) != null) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((C28963BYh) aqS136S0200000_5.l1).getContext(), UriProtector.parse(new C32364Cn2(str).LIZLLL()));
        }
        String charSequence = ((C28963BYh) aqS136S0200000_5.l1).LJLILLLLZI.getText().toString();
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_goal_gift_banner_click");
        LIZ.LJIIZILJ();
        C28963BYh.LIZ(LIZ, charSequence);
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS136S0200000_5 aqS136S0200000_5, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        o.LJIIIZ(sparkContext, "sparkContext");
        List<J71> list = ((C32364Cn2) aqS136S0200000_5.l0).LIZ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                J71 j71 = (J71) it.next();
                if (j71 != null && C29306Beo.LJIJJLI(j71.LJLIL) && C29306Beo.LJIJJLI(j71.LJLILLLLZI)) {
                    String str = j71.LJLIL;
                    o.LJIIIIZZ(str, "basicNameValuePair.name");
                    String str2 = j71.LJLILLLLZI;
                    o.LJIIIIZZ(str2, "basicNameValuePair.value");
                    sparkContext.LJJIIZ(str2, str);
                }
            }
        }
        if (FollowGuidVoidSetting.INSTANCE.getValue() > 0) {
            sparkContext.LJJI(new IDbS495S0100000_5((SubscribeService) aqS136S0200000_5.l1, 4));
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS136S0200000_5(X.CQQ r3, X.CQQ r4, X.CQK<MESSAGE> r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 54: goto Lf;
                case 55: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS136S0200000_5.<init>(X.CQQ, X.CQK, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS136S0200000_5(X.InterfaceC30237Btp r3, com.bytedance.ies.sdk.datachannel.DataChannel r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 28: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS136S0200000_5.<init>(X.Btp, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(BGJ bgj, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = bgj;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C28882BVe c28882BVe, C34561Xg c34561Xg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c28882BVe;
        this.l1 = c34561Xg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS136S0200000_5(C28882BVe c28882BVe, C28882BVe c28882BVe2, AbstractC34571Xh<QuestionEx> abstractC34571Xh) {
        super(1);
        this.$t = abstractC34571Xh;
        this.l0 = c28882BVe;
        this.l1 = c28882BVe2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(BWG bwg, Question question, int i) {
        super(1);
        this.$t = i;
        this.l0 = bwg;
        this.l1 = question;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C28907BWd c28907BWd, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = c28907BWd;
        this.l1 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C28984BZc c28984BZc, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c28984BZc;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C29311Bet c29311Bet, C29821Bn7 c29821Bn7, int i) {
        super(1);
        this.$t = i;
        this.l0 = c29311Bet;
        this.l1 = c29821Bn7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(EnumC30241Btt enumC30241Btt, InterfaceC30264BuG interfaceC30264BuG, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC30241Btt;
        this.l1 = interfaceC30264BuG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C30466BxW c30466BxW, InterfaceC30237Btp interfaceC30237Btp, int i) {
        super(1);
        this.$t = i;
        this.l0 = c30466BxW;
        this.l1 = interfaceC30237Btp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C30610Bzq c30610Bzq, InterfaceC25704A6y interfaceC25704A6y, int i) {
        super(1);
        this.$t = i;
        this.l0 = c30610Bzq;
        this.l1 = interfaceC25704A6y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C0M c0m, PreviewLiveModeWidget previewLiveModeWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0m;
        this.l1 = previewLiveModeWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(InterfaceC31587CaV interfaceC31587CaV, C31583CaR c31583CaR, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC31587CaV;
        this.l1 = c31583CaR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C31954CgQ c31954CgQ, ActivityC45651qj activityC45651qj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c31954CgQ;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(C32364Cn2 c32364Cn2, SubscribeService subscribeService, int i) {
        super(1);
        this.$t = i;
        this.l0 = c32364Cn2;
        this.l1 = subscribeService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(Context context, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(Context context, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(ViewGroup viewGroup, ViewGroup viewGroup2, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = viewGroup2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(TextView textView, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(LiveIconView liveIconView, C11 c11, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveIconView;
        this.l1 = c11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(PinMessageViewModel pinMessageViewModel, C29419Bgd c29419Bgd, int i) {
        super(1);
        this.$t = i;
        this.l0 = pinMessageViewModel;
        this.l1 = c29419Bgd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(GuidanceViewModel guidanceViewModel, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = guidanceViewModel;
        this.l1 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(PreviewCoverWidget previewCoverWidget, ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewCoverWidget;
        this.l1 = viewOnClickListenerC28501BGn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(PreviewLiveProNotifyWidget previewLiveProNotifyWidget, LiveProInfo liveProInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewLiveProNotifyWidget;
        this.l1 = liveProInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(BasePreviewSettingMainFragment basePreviewSettingMainFragment, LiveMode liveMode, int i) {
        super(1);
        this.$t = i;
        this.l0 = basePreviewSettingMainFragment;
        this.l1 = liveMode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet, LiveMode liveMode, int i) {
        super(1);
        this.$t = i;
        this.l0 = basePreviewSettingMainFragmentSheet;
        this.l1 = liveMode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(PreviewStartLiveWidget previewStartLiveWidget, Room room, int i) {
        super(1);
        this.$t = i;
        this.l0 = room;
        this.l1 = previewStartLiveWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2, GiftGuideMessage giftGuideMessage, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveGiftGuideWidgetV2;
        this.l1 = giftGuideMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(OthersLikeWidget othersLikeWidget, LikeEffect likeEffect, int i) {
        super(1);
        this.$t = i;
        this.l0 = othersLikeWidget;
        this.l1 = likeEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(GiftPanelBanner giftPanelBanner, C28963BYh c28963BYh, int i) {
        super(1);
        this.$t = i;
        this.l0 = giftPanelBanner;
        this.l1 = c28963BYh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(QASuggestedFragment qASuggestedFragment, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = qASuggestedFragment;
        this.l1 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS136S0200000_5(ActQuizWidget actQuizWidget, ActQuizWidget actQuizWidget2, C68322mC<B35> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = actQuizWidget;
        this.l1 = actQuizWidget2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS136S0200000_5(BaseFragment baseFragment, BaseFragment baseFragment2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = baseFragment;
        this.l1 = baseFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS136S0200000_5(LiveProfileDialog liveProfileDialog, LiveProfileDialog liveProfileDialog2, C68322mC<User> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = liveProfileDialog;
        this.l1 = liveProfileDialog2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(Room room, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = room;
        this.l1 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(DataChannel dataChannel, BYS bys, int i) {
        super(1);
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = bys;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(DataChannel dataChannel, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS136S0200000_5(AqS155S0100000_5 aqS155S0100000_5, AqS155S0100000_5 aqS155S0100000_52, int i) {
        super(1);
        this.$t = i;
        this.l0 = aqS155S0100000_5;
        this.l1 = aqS155S0100000_52;
    }
}
