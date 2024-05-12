package Y;

import X.AbstractC38911fr;
import X.AbstractC76282Twk;
import X.AbstractC76285Twn;
import X.AbstractC76298Tx0;
import X.B83;
import X.BZI;
import X.C0NB;
import X.C0WE;
import X.C10S;
import X.C113554cx;
import X.C117434jD;
import X.C13870gZ;
import X.C14460hW;
import X.C14500ha;
import X.C14540he;
import X.C15380j0;
import X.C15490jB;
import X.C15650jR;
import X.C16880lQ;
import X.C18950ol;
import X.C28272B7s;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29701Eo;
import X.C2A4;
import X.C30868C9o;
import X.C30901Je;
import X.C31012CFc;
import X.C31071Jv;
import X.C31522CYs;
import X.C32014ChO;
import X.C32362Cn0;
import X.C33611Tp;
import X.C42951mN;
import X.C47061t0;
import X.C47261Igj;
import X.C51029K0z;
import X.C56K;
import X.C61447O9r;
import X.C73989T2b;
import X.C74947TbD;
import X.C74957TbN;
import X.C75177Tev;
import X.C75422Tis;
import X.C75795Tot;
import X.C75838Tpa;
import X.C76278Twg;
import X.C76279Twh;
import X.C76286Two;
import X.C76287Twp;
import X.C76296Twy;
import X.C76297Twz;
import X.C76312TxE;
import X.C76414Tys;
import X.C76574U3m;
import X.C76610U4w;
import X.C76614U5a;
import X.C76669U7d;
import X.C76683U7r;
import X.C76696U8e;
import X.C76697U8f;
import X.C76716U8y;
import X.C76732zl;
import X.C76762UAs;
import X.C76805UCj;
import X.C76819UCx;
import X.C76820UCy;
import X.C76836UDo;
import X.C76846UDy;
import X.C76881UFh;
import X.C76883UFj;
import X.C76929UHd;
import X.C76930UHe;
import X.C76939UHn;
import X.C76954UIc;
import X.C76956UIe;
import X.C77455UaZ;
import X.C77519Ubb;
import X.C77560UcG;
import X.C77591Ucl;
import X.C78078Ukc;
import X.C78720Uuy;
import X.C78793Uw9;
import X.C78932UyO;
import X.C78996UzQ;
import X.C79004UzY;
import X.C79057V0z;
import X.C79285V9t;
import X.C79286V9u;
import X.C80664VlE;
import X.C81091Vs7;
import X.C81392Vwy;
import X.C83741Wtl;
import X.C9CS;
import X.CCJ;
import X.CL6;
import X.CN1;
import X.DialogC31813Ce9;
import X.ED5;
import X.EnumC75419Tip;
import X.InterfaceC21020s6;
import X.InterfaceC24140x8;
import X.InterfaceC65784Pro;
import X.InterfaceC74605TPt;
import X.InterfaceC75179Tex;
import X.InterfaceC75441TjB;
import X.InterfaceC75973Trl;
import X.InterfaceC76348Txo;
import X.InterfaceC76578U3q;
import X.InterfaceC76620U5g;
import X.InterfaceC76622U5i;
import X.InterfaceC76728U9k;
import X.InterfaceC76768UAy;
import X.InterfaceC76931UHf;
import X.InterfaceC77110UOc;
import X.InterfaceC77461Uaf;
import X.JBR;
import X.LAV;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.R2P;
import X.T4Q;
import X.TV3;
import X.U1V;
import X.U1X;
import X.U1Y;
import X.U2A;
import X.U2O;
import X.U46;
import X.U4R;
import X.U65;
import X.U66;
import X.U7A;
import X.U7B;
import X.U7F;
import X.U7H;
import X.U7T;
import X.U7U;
import X.U7V;
import X.U7Z;
import X.U87;
import X.U9F;
import X.UBA;
import X.UC0;
import X.UE3;
import X.UE4;
import X.UIZ;
import X.UOJ;
import X.UOW;
import X.UZI;
import X.UZK;
import X.V18;
import X.V9R;
import X.V9T;
import X.VA9;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.X1D;
import X.YKR;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import au3.IDdS57S0100000_13;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.linkmic.LiveLinkMicGiftFlyChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractPlayerViewHeightChangeChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusContainerChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestFullPropsPageFragment;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchRtcOpenMessageEvent;
import com.bytedance.android.live.liveinteract.multimatch.rtc.MatchRtcOpenMessage;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.wallet.data.recharge.IapFailExtra;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.impl.game.ui.GameShortVideoAdDetailPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.subscription.emoji.LiveSubscribeEmojiInputDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicGiftExpressionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicViewUsePoolSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNew;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderOpt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.controller.JoinGroupResp;
import tikcast.linkmic.controller.LeaveJoinGroupResp;
import tikcast.linkmic.controller.RechargeResp;
import webcast.data.cohost_biz.BizJoinGroupResponse;
import webcast.im.PermitJoinGroupContent;

/* loaded from: classes14.dex */
public class ARunnableS32S0200000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                run$47(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                run$48(this);
                return;
            case C61447O9r.LJIIJ:
                run$49(this);
                return;
            case 50:
                run$50(this);
                return;
            case 51:
                run$51(this);
                return;
            case 52:
                run$52(this);
                return;
            case 53:
                run$53(this);
                return;
            case 54:
                run$54(this);
                return;
            case 55:
                run$55(this);
                return;
            case 56:
                run$56(this);
                return;
            case 57:
                run$57(this);
                return;
            case 58:
                run$58(this);
                return;
            case 59:
                run$59(this);
                return;
            case 60:
                run$60(this);
                return;
            case 61:
                run$61(this);
                return;
            case BaseNotice.CREATOR /* 62 */:
                run$62(this);
                return;
            case 63:
                run$63(this);
                return;
            case 64:
                run$64(this);
                return;
            case 65:
                run$65(this);
                return;
            case 66:
                run$66(this);
                return;
            case 67:
                run$67(this);
                return;
            case 68:
                run$68(this);
                return;
            case 69:
                run$69(this);
                return;
            case 70:
                run$70(this);
                return;
            case 71:
                run$71(this);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                run$72(this);
                return;
            case 73:
                run$73(this);
                return;
            case 74:
                run$74(this);
                return;
            case 75:
                run$75(this);
                return;
            case 76:
                run$76(this);
                return;
            case 77:
                run$77(this);
                return;
            case 78:
                run$78(this);
                return;
            case 79:
                run$79(this);
                return;
            case 80:
                run$80(this);
                return;
            case 81:
                run$81(this);
                return;
            case 82:
                run$82(this);
                return;
            case 83:
                run$83(this);
                return;
            case 84:
                run$84(this);
                return;
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                run$85(this);
                return;
            case 86:
                run$86(this);
                return;
            case 87:
                run$87(this);
                return;
            case 88:
                run$88(this);
                return;
            case 89:
                run$89(this);
                return;
            case 90:
                run$90(this);
                return;
            case 91:
                run$91(this);
                return;
            case 92:
                run$92(this);
                return;
            case 93:
                run$93(this);
                return;
            case 94:
                run$94(this);
                return;
            case 95:
                run$95(this);
                return;
            case 96:
                run$96(this);
                return;
            case 97:
                run$97(this);
                return;
            case 98:
                run$98(this);
                return;
            case 99:
                run$99(this);
                return;
            case 100:
                run$100(this);
                return;
            case 101:
                run$101(this);
                return;
            case 102:
                run$102(this);
                return;
            case 103:
                run$103(this);
                return;
            case 104:
                run$104(this);
                return;
            case 105:
                run$105(this);
                return;
            case 106:
                run$106(this);
                return;
            case 107:
                run$107(this);
                return;
            case 108:
                run$108(this);
                return;
            case 109:
                run$109(this);
                return;
            case 110:
                run$110(this);
                return;
            case 111:
                run$111(this);
                return;
            case 112:
                run$112(this);
                return;
            case 113:
                run$113(this);
                return;
            case 114:
                run$114(this);
                return;
            case 115:
                run$115(this);
                return;
            case 116:
                run$116(this);
                return;
            case 117:
                run$117(this);
                return;
            case 118:
                run$118(this);
                return;
            case 119:
                run$119(this);
                return;
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                run$120(this);
                return;
            case 121:
                run$121(this);
                return;
            case 122:
                run$122(this);
                return;
            case 123:
                run$123(this);
                return;
            case 124:
                run$124(this);
                return;
            case 125:
                run$125(this);
                return;
            case 126:
                run$126(this);
                return;
            case 127:
                run$127(this);
                return;
            case 128:
                run$128(this);
                return;
            case 129:
                run$129(this);
                return;
            case 130:
                run$130(this);
                return;
            case 131:
                run$131(this);
                return;
            case 132:
                run$132(this);
                return;
            case 133:
                run$133(this);
                return;
            case 134:
                run$134(this);
                return;
            case 135:
                run$135(this);
                return;
            case 136:
                run$136(this);
                return;
            case 137:
                run$137(this);
                return;
            case 138:
                run$138(this);
                return;
            case 139:
                run$139(this);
                return;
            case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                run$140(this);
                return;
            case 141:
                run$141(this);
                return;
            case 142:
                run$142(this);
                return;
            case 143:
                run$143(this);
                return;
            case 144:
                run$144(this);
                return;
            case 145:
                run$145(this);
                return;
            case 146:
                run$146(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r8 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS32S0200000_13.LIZ$0():void");
    }

    public final void LIZ$1() {
        C76683U7r c76683U7r;
        CopyOnWriteArrayList<U87> copyOnWriteArrayList = ((U7Z) this.l0).LJIIZILJ;
        List list = (List) this.l1;
        Iterator<U87> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            U87 it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            it2.LJLLLL(list, null);
        }
        if (((U7Z) this.l0).LJJII((List) this.l1)) {
            U7T u7t = ((U7Z) this.l0).LIZ;
            if (u7t != null && (c76683U7r = u7t.LJIILJJIL) != null) {
                c76683U7r.LIZIZ(2);
            }
            ((U7Z) this.l0).LIZIZ = false;
        }
    }

    public final void LIZ$10() {
        Integer num;
        InterfaceC24140x8 interfaceC24140x8;
        InterfaceC21020s6 liveStream;
        LiveCore liveCore;
        LiveCore.Builder builder;
        InterfaceC24140x8 interfaceC24140x82;
        InterfaceC21020s6 liveStream2;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        InterfaceC74605TPt interfaceC74605TPt = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        Integer num2 = null;
        if ((interfaceC74605TPt instanceof InterfaceC24140x8) && (interfaceC24140x82 = (InterfaceC24140x8) interfaceC74605TPt) != null && (liveStream2 = interfaceC24140x82.getLiveStream()) != null && (liveCore2 = liveStream2.getLiveCore()) != null && (builder2 = liveCore2.getBuilder()) != null) {
            num = Integer.valueOf(builder2.getCaptureAdaptedWidth());
        } else {
            num = null;
        }
        InterfaceC74605TPt interfaceC74605TPt2 = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        if ((interfaceC74605TPt2 instanceof InterfaceC24140x8) && (interfaceC24140x8 = (InterfaceC24140x8) interfaceC74605TPt2) != null && (liveStream = interfaceC24140x8.getLiveStream()) != null && (liveCore = liveStream.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
            num2 = Integer.valueOf(builder.getCaptureAdaptedHeight());
        }
        C74957TbN.LIZ().LJJ(C0WE.LIZJ(((SurfaceView) this.l1).getWidth(), ((SurfaceView) this.l1).getHeight(), num, num2, false));
    }

    public final void LIZ$11() {
        boolean z;
        Long l;
        boolean z2;
        UE3 ue3;
        User owner;
        C14500ha c14500ha = (C14500ha) this.l0;
        long j = c14500ha.LIZ.LJ;
        ((C76846UDy) this.l1).getClass();
        if (c14500ha.LIZ.LJ == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        LiveLinkMicGiftExpressionOptSetting liveLinkMicGiftExpressionOptSetting = LiveLinkMicGiftExpressionOptSetting.INSTANCE;
        if ((liveLinkMicGiftExpressionOptSetting.isSupportGiftAnimationFromABTest(c14500ha.LIZ.LJI) && c14500ha.LIZ.LJ == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) || (!z && liveLinkMicGiftExpressionOptSetting.isSupportGiftAnimation())) {
            C76846UDy c76846UDy = (C76846UDy) this.l1;
            C14500ha c14500ha2 = (C14500ha) this.l0;
            c76846UDy.getClass();
            IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            Long l2 = null;
            if (room != null && (owner = room.getOwner()) != null) {
                l = Long.valueOf(owner.getId());
            } else {
                l = null;
            }
            if (c14500ha2 != null && (ue3 = c14500ha2.LIZ) != null) {
                l2 = Long.valueOf(ue3.LJ);
            }
            boolean LJ = o.LJ(l, l2);
            if (LJ && (iInteractService.VY() || (iInteractService.gr0() && iInteractService.Yu0() > 0))) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !LJ;
            if (iInteractService.Vc()) {
                if ((!z2 && !z3) || ((C14500ha) this.l0).LIZ.LIZLLL == 0 || j == 0 || ((C76846UDy) this.l1).LIZIZ.LJJIL().compareTo(EnumC75419Tip.StateJoined) < 0 || !o.LJ(C74947TbD.LJJIFFI(Long.valueOf(j)), ((C76846UDy) this.l1).LIZIZ.LJJ())) {
                    return;
                }
                C76846UDy c76846UDy2 = (C76846UDy) this.l1;
                C14500ha c14500ha3 = (C14500ha) this.l0;
                c76846UDy2.getClass();
                UE3 ue32 = c14500ha3.LIZ;
                if (ue32.LIZIZ == 2 && !ue32.LJIIIZ && (ue32.LJ != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() ? liveLinkMicGiftExpressionOptSetting.isSupportFLY() : liveLinkMicGiftExpressionOptSetting.isSupportFLYFromSender(c14500ha3.LIZ.LJI))) {
                    UE3 ue33 = c14500ha3.LIZ;
                    long j2 = ue33.LJ;
                    int[] iArr = ue33.LIZJ.LJLIL;
                    Point point = new Point(iArr[0], iArr[1]);
                    Rect po0 = ((IInteractService) CN1.LIZ(IInteractService.class)).po0(j2);
                    Point point2 = new Point();
                    if (CCJ.LIZ(c76846UDy2.LIZ)) {
                        if (po0 != null) {
                            point2.x = po0.left + c76846UDy2.LJI + c76846UDy2.LJFF;
                            point2.y = po0.top;
                        }
                    } else if (po0 != null) {
                        point2.x = (po0.right - c76846UDy2.LJI) - c76846UDy2.LJFF;
                        point2.y = po0.top;
                    }
                    OSZ osz = new OSZ(point, point2);
                    if (C76846UDy.LJ((Point) osz.getFirst()) && C76846UDy.LJ((Point) osz.getSecond())) {
                        return;
                    }
                    dataChannelGlobal.tv0(LiveLinkMicGiftFlyChannel.class, new C14540he(new C14460hW((Point) osz.getFirst(), (Point) osz.getSecond(), c14500ha3.LIZ, ORY.LJJLJ(new Integer[]{Integer.valueOf(c76846UDy2.LJFF), Integer.valueOf(c76846UDy2.LJFF)}))));
                    return;
                }
                UE4 ue4 = c76846UDy2.LJ;
                if (ue4 == null) {
                    return;
                }
                if (c14500ha3.LIZ.LIZIZ == 2) {
                    ((ArrayBlockingQueue) ue4.LJLJI).offer(c14500ha3);
                    if (((ConcurrentHashMap) ue4.LJLIL).size() >= 2) {
                        ((AnimatorSet) ListProtector.get(ORZ.LLJI(((ConcurrentHashMap) ue4.LJLIL).values()), 0)).end();
                    }
                    ue4.LJI("firAnimationImmediately");
                    return;
                }
                ((ArrayBlockingQueue) ue4.LJLJI).offer(c14500ha3);
                ue4.LJI("onGiftEvent");
            }
        }
    }

    public final void LIZ$12() {
        UE4 ue4 = (UE4) this.l0;
        UE3 ue3 = ((C14500ha) this.l1).LIZ;
        ue4.getClass();
        String LIZLLL = UE4.LIZLLL(ue3);
        C14500ha c14500ha = (C14500ha) this.l1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fireAnimationSequentially , ");
        LIZ.append(ue4);
        C0NB.LIZIZ("AnimationView", X1D.LIZIZ(LIZ));
        if (c14500ha.LIZ.LJFF) {
            ImageView LIZJ = ue4.LIZJ(LIZLLL);
            if (LIZJ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("playComboAnimation , ");
                LIZ2.append(ue4);
                C0NB.LIZIZ("AnimationView", X1D.LIZIZ(LIZ2));
                AnimatorSet animatorSet = (AnimatorSet) ((ConcurrentHashMap) ue4.LJLIL).get(LIZJ);
                if (animatorSet != null && animatorSet.isRunning()) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                ((ConcurrentHashMap) ue4.LJLIL).put(LIZJ, animatorSet2);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(LIZJ, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.3f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.3f, 1.0f));
                ofPropertyValuesHolder.setInterpolator(new OvershootInterpolator());
                ofPropertyValuesHolder.setDuration(200L);
                ue4.LJFF(animatorSet2, ofPropertyValuesHolder, UE4.LIZ(LIZJ), null, LIZJ, c14500ha);
                return;
            }
            ue4.LJ(LIZLLL, c14500ha);
            return;
        }
        ue4.LJ(LIZLLL, c14500ha);
    }

    public final void LIZ$13() {
        int height;
        View findViewById;
        Object obj;
        Object obj2;
        int i;
        int i2;
        int LIZ;
        int i3;
        View view;
        int i4;
        int i5;
        int i6;
        View view2;
        int i7;
        int i8;
        int i9;
        View view3;
        int i10;
        View findViewById2;
        ViewGroup.LayoutParams layoutParams;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        View findViewById9;
        View findViewById10;
        View findViewById11;
        RechargeDialogNew rechargeDialogNew = (RechargeDialogNew) this.l0;
        if (rechargeDialogNew.vl().Cv0()) {
            int LIZ2 = C15380j0.LIZ(488.0f);
            View view4 = rechargeDialogNew.getView();
            if (view4 != null && (findViewById11 = view4.findViewById(R.id.l_2)) != null) {
                i = findViewById11.getHeight();
            } else {
                i = 0;
            }
            View view5 = rechargeDialogNew.getView();
            if (view5 != null && (findViewById10 = view5.findViewById(R.id.dn4)) != null) {
                i2 = findViewById10.getHeight();
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            View view6 = rechargeDialogNew.getView();
            if (view6 != null && (findViewById9 = view6.findViewById(R.id.dn4)) != null && findViewById9.getHeight() == 0) {
                LIZ = 0;
            } else {
                LIZ = C15380j0.LIZ(28.0f);
            }
            int i12 = i11 + LIZ;
            View view7 = rechargeDialogNew.getView();
            if (view7 != null && (findViewById8 = view7.findViewById(R.id.dat)) != null) {
                i3 = findViewById8.getHeight();
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            View view8 = rechargeDialogNew.getView();
            if (view8 != null) {
                view = view8.findViewById(R.id.dat);
            } else {
                view = null;
            }
            if (C29306Beo.LJJIIJ(view)) {
                i4 = C15380j0.LIZ(17.0f);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            View view9 = rechargeDialogNew.getView();
            if (view9 != null && (findViewById7 = view9.findViewById(R.id.c8d)) != null) {
                i5 = findViewById7.getHeight();
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            View view10 = rechargeDialogNew.getView();
            if (view10 != null && (findViewById6 = view10.findViewById(R.id.lzg)) != null) {
                i6 = findViewById6.getHeight();
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            View view11 = rechargeDialogNew.getView();
            if (view11 != null) {
                view2 = view11.findViewById(R.id.lzg);
            } else {
                view2 = null;
            }
            if (C29306Beo.LJJIIJ(view2)) {
                i7 = C15380j0.LIZ(16.0f);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            View view12 = rechargeDialogNew.getView();
            if (view12 != null && (findViewById5 = view12.findViewById(R.id.zg)) != null) {
                i8 = findViewById5.getHeight();
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            View view13 = rechargeDialogNew.getView();
            if (view13 != null && (findViewById4 = view13.findViewById(R.id.b9r)) != null) {
                i9 = findViewById4.getHeight();
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            View view14 = rechargeDialogNew.getView();
            if (view14 != null) {
                view3 = view14.findViewById(R.id.b9r);
            } else {
                view3 = null;
            }
            if (C29306Beo.LJJIIJ(view3)) {
                i10 = C15380j0.LIZ(32.0f);
            } else {
                i10 = 0;
            }
            height = LIZ2 - (C15380j0.LIZ(16.0f) + (i19 + i10));
            View view15 = rechargeDialogNew.getView();
            if (view15 != null && (findViewById2 = view15.findViewById(R.id.nb6)) != null) {
                View view16 = rechargeDialogNew.getView();
                if (view16 != null && (findViewById3 = view16.findViewById(R.id.nb6)) != null && (layoutParams = findViewById3.getLayoutParams()) != null) {
                    layoutParams.height = -2;
                } else {
                    layoutParams = null;
                }
                findViewById2.setLayoutParams(layoutParams);
            }
        } else {
            View view17 = rechargeDialogNew.getView();
            height = (view17 == null || (findViewById = view17.findViewById(R.id.nb6)) == null) ? 0 : findViewById.getHeight();
        }
        int LIZ3 = ((int) (((height * 1.0f) / C15380j0.LIZ(68.0f)) + 0.2f)) * 3;
        int size = ((List) this.l1).size();
        if (LIZ3 > size) {
            LIZ3 = size;
        }
        RechargeViewModel viewModel = ((RechargeDialogNew) this.l0).vl();
        RechargeDialogNew rechargeDialogNew2 = (RechargeDialogNew) this.l0;
        DataChannel dataChannel = rechargeDialogNew2.LJLJJL;
        C77591Ucl c77591Ucl = rechargeDialogNew2.LJLJJI;
        if (c77591Ucl != null) {
            Map<String, String> map = c77591Ucl.LIZIZ;
            o.LJIIIZ(viewModel, "viewModel");
            OSZ[] oszArr = new OSZ[9];
            oszArr[0] = new OSZ("request_page", viewModel.yv0());
            oszArr[1] = new OSZ("charge_reason", viewModel.tv0());
            oszArr[2] = new OSZ("charge_style", "window");
            oszArr[3] = new OSZ("panel_type", "normal");
            String str = "1";
            if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[4] = new OSZ("is_first_recharge", obj);
            if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[5] = new OSZ("is_anchor", obj2);
            oszArr[6] = new OSZ("package_show_num", String.valueOf(LIZ3));
            if (viewModel.Cv0()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[7] = new OSZ("is_landscape", str);
            oszArr[8] = new OSZ("model", Build.MODEL);
            Map LJJL = C113554cx.LJJL(oszArr);
            BZI LIZ4 = C28787BRn.LIZ("livesdk_recharge_show_before_action");
            LIZ4.LJIILLIIL(dataChannel);
            LIZ4.LJJIFFI(LJJL);
            LIZ4.LJJIFFI(map);
            LIZ4.LJJIIJZLJL();
            return;
        }
        o.LJIJI("rechargeDialogConfig");
        throw null;
    }

    public final void LIZ$14() {
        C76956UIe LJIIJ;
        TextView textView;
        View view;
        C76954UIc c76954UIc = ((LiveSubscribeEmojiInputDialog) this.l0).LJLJJI;
        if (c76954UIc != null) {
            List<BadgeIconTab> dataList = ((C31071Jv) this.l1).LJLIL;
            o.LJIIIZ(dataList, "dataList");
            if (!o.LJ(c76954UIc.LIZIZ, dataList)) {
                ((ArrayList) c76954UIc.LIZIZ).clear();
                ((ArrayList) c76954UIc.LIZIZ).addAll(dataList);
                c76954UIc.LIZ.LJIIL();
                Iterator it = ((ArrayList) c76954UIc.LIZIZ).iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        BadgeIconTab badgeIconTab = (BadgeIconTab) next;
                        if (badgeIconTab.tabPreview.iconType == 2) {
                            LJIIJ = c76954UIc.LIZ.LJIIJ();
                            LJIIJ.LJFF = false;
                            LJIIJ.LIZ(R.layout.dd5);
                            C78720Uuy url = C15650jR.LIZ().setUrl(badgeIconTab.tabPreview.iconUrl);
                            View view2 = LJIIJ.LJ;
                            if (view2 != null) {
                                view = view2.findViewById(R.id.f51);
                            } else {
                                view = null;
                            }
                            url.LJIIJJI(view);
                            LJIIJ.LIZ = badgeIconTab;
                        } else {
                            LJIIJ = c76954UIc.LIZ.LJIIJ();
                            LJIIJ.LJFF = false;
                            LJIIJ.LIZ(R.layout.dd3);
                            View view3 = LJIIJ.LJ;
                            if (view3 != null && (textView = (TextView) view3.findViewById(R.id.mt7)) != null) {
                                textView.setText(badgeIconTab.tabPreview.iconStr);
                            }
                            LJIIJ.LIZ = badgeIconTab;
                        }
                        if (i == c76954UIc.LIZJ) {
                            C80664VlE c80664VlE = c76954UIc.LIZ;
                            c76954UIc.LIZ(LJIIJ);
                            c80664VlE.LIZJ(LJIIJ, i, true);
                        } else {
                            C80664VlE c80664VlE2 = c76954UIc.LIZ;
                            View view4 = LJIIJ.LJ;
                            if (view4 != null) {
                                view4.setBackground(null);
                            }
                            c80664VlE2.LIZJ(LJIIJ, i, false);
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        C76954UIc c76954UIc2 = ((LiveSubscribeEmojiInputDialog) this.l0).LJLJJI;
        if (c76954UIc2 != null) {
            c76954UIc2.LIZJ = 0;
            C76956UIe LJIIIZ = c76954UIc2.LIZ.LJIIIZ(0);
            if (LJIIIZ != null) {
                C80664VlE c80664VlE3 = LJIIIZ.LJI;
                if (c80664VlE3 != null) {
                    c80664VlE3.LJIILIIL(LJIIIZ, true, false);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
    }

    public final void LIZ$15() {
        ViewPager viewPager;
        C73989T2b c73989T2b = ((LiveSubscribeEmojiInputDialog) this.l0).LJLJJL;
        List<BadgeIconTab> dataList = ((C31071Jv) this.l1).LJLIL;
        c73989T2b.getClass();
        o.LJIIIZ(dataList, "dataList");
        ((ArrayList) c73989T2b.LJLJI).clear();
        ((ArrayList) c73989T2b.LJLJI).addAll(dataList);
        c73989T2b.notifyDataSetChanged();
        View view = ((LiveSubscribeEmojiInputDialog) this.l0).getView();
        if (view == null || (viewPager = (ViewPager) view.findViewById(R.id.cuw)) == null) {
            return;
        }
        viewPager.setCurrentItem(0);
    }

    public final void LIZ$16() {
        C79286V9u c79286V9u = (C79286V9u) this.l1;
        C117434jD c117434jD = c79286V9u.LJ.LJIILLIIL;
        if (c117434jD == null || !c79286V9u.LIZ.equals(c117434jD.LIZIZ)) {
            ((C79286V9u) this.l1).LJ.LJI();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("localCache url check error: ");
            C13870gZ.LIZJ(LIZ, ((C79286V9u) this.l1).LIZ, LIZ, 3, "ImageDelegate");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C79286V9u c79286V9u2 = (C79286V9u) this.l1;
        int LIZ2 = c79286V9u2.LJ.LIZ(c79286V9u2.LIZIZ, c79286V9u2.LIZJ);
        C79286V9u c79286V9u3 = (C79286V9u) this.l1;
        C79285V9t c79285V9t = c79286V9u3.LJ;
        c79285V9t.LJFF(0, LIZ2, c79286V9u3.LIZLLL, currentTimeMillis, c79285V9t.LJIILJJIL, true, true);
        ((C79286V9u) this.l1).LJ.LJIJI.LJ((C81392Vwy) this.l0);
    }

    public final void LIZ$17() {
        EmoteEditDialogFragment emoteEditDialogFragment = (EmoteEditDialogFragment) this.l0;
        emoteEditDialogFragment.LJLJJI = emoteEditDialogFragment.Al(emoteEditDialogFragment.LJLLILLLL);
        EmoteEditDialogFragment emoteEditDialogFragment2 = (EmoteEditDialogFragment) this.l0;
        emoteEditDialogFragment2.LJLJI = emoteEditDialogFragment2.xl(emoteEditDialogFragment2.LJLJJL, emoteEditDialogFragment2.LJLJJI);
        VA9 va9 = (VA9) ((EmoteEditDialogFragment) this.l0)._$_findCachedViewById(R.id.f8z);
        if (va9 != null) {
            va9.setImageBitmap(((EmoteEditDialogFragment) this.l0).LJLJI);
        }
        ((EmoteEditDialogFragment) this.l0).Dl((YKR) this.l1);
    }

    public final void LIZ$18() {
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = (SpotlightImageEditDialogFragment) this.l0;
        spotlightImageEditDialogFragment.LJLJJI = spotlightImageEditDialogFragment.Al(spotlightImageEditDialogFragment.LJLLILLLL);
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment2 = (SpotlightImageEditDialogFragment) this.l0;
        spotlightImageEditDialogFragment2.LJLJI = spotlightImageEditDialogFragment2.xl(spotlightImageEditDialogFragment2.LJLJJL, spotlightImageEditDialogFragment2.LJLJJI);
        VA9 va9 = (VA9) ((SpotlightImageEditDialogFragment) this.l0)._$_findCachedViewById(R.id.f8z);
        if (va9 != null) {
            va9.setImageBitmap(((SpotlightImageEditDialogFragment) this.l0).LJLJI);
        }
        ((SpotlightImageEditDialogFragment) this.l0).Dl((YKR) this.l1);
    }

    public final void LIZ$19() {
        float width;
        U1Y u1y = (U1Y) this.l0;
        if (u1y != null) {
            U1X u1x = (U1X) this.l1;
            if (o.LJ(u1x.LJLJJL, Boolean.TRUE)) {
                width = 0.0f;
            } else {
                width = u1y.getWidth();
            }
            float height = u1y.getHeight();
            AnimatorSet LIZJ = U1X.LIZJ(width, height, u1y, u1y, 1.0f, 1.2857143f);
            LIZJ.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.3f, 1.0f));
            LIZJ.addListener(new ALAdapterS10S0200000_13(u1y, u1x, 14));
            AnimatorSet LIZJ2 = U1X.LIZJ(width, height, u1y, u1y, 1.2857143f, 1.0f);
            LIZJ2.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.3f, 1.0f));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1y.findViewById(R.id.gvb), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat.setDuration(340L);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
            AnimatorSet animatorSet = u1x.LJLJL;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = u1x.LJLJL;
                if (animatorSet2 != null) {
                    C16880lQ.LJLJJL(animatorSet2);
                }
                AnimatorSet animatorSet3 = u1x.LJLJL;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
                u1x.LJLJL = null;
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            u1x.LJLJL = animatorSet4;
            animatorSet4.play(LIZJ).after(2660L);
            animatorSet4.play(LIZJ2).after(8160L);
            animatorSet4.play(ofFloat).after(2660L);
            animatorSet4.addListener(new U1V(u1x, u1y, width, height));
            animatorSet4.start();
        }
    }

    public final void LIZ$2() {
        Long userId;
        CopyOnWriteArrayList<U87> copyOnWriteArrayList = ((U7Z) this.l0).LJIIZILJ;
        List list = (List) this.l1;
        Iterator<U87> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            U87 it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            it2.LLILII(list, null);
        }
        if (((U7Z) this.l0).LJJII((List) this.l1)) {
            U7T u7t = ((U7Z) this.l0).LIZ;
            if (u7t != null) {
                List<LinkUser> inviteeList = (List) this.l1;
                o.LJIIIZ(inviteeList, "inviteeList");
                u7t.LJJJLL(2);
                for (LinkUser linkUser : inviteeList) {
                    String linkMicId = linkUser.getLinkMicId();
                    if (linkMicId != null && (userId = linkUser.getUserId()) != null) {
                        u7t.LJJIIZ.put(linkMicId, Long.valueOf(userId.longValue()));
                    }
                }
            }
            ((U7Z) this.l0).LIZIZ = false;
        }
    }

    public final void LIZ$20() {
        boolean z;
        C76683U7r c76683U7r = ((U7T) this.l0).LJIILJJIL;
        if (c76683U7r.LIZ != 2) {
            z = c76683U7r.LIZIZ(2);
        } else {
            z = true;
        }
        if (!z) {
            C32014ChO.LIZJ(U7T.LJJJJI(1444), "forceJoinRtcChannel !canJoinRtcChannel", null);
            C29306Beo.LJJJ(new AqS163S0100000_13((InterfaceC76768UAy) this.l1, (InterfaceC76768UAy<JoinRtcChannelResult>) 416));
            return;
        }
        RtcUserInfo LLZL = ((U7T) this.l0).LLZL();
        String str = ((U7T) this.l0).LJIIJ;
        if (TextUtils.isEmpty(LLZL.getLinkMicId()) || TextUtils.isEmpty(str)) {
            C32014ChO.LIZJ(U7T.LJJJJI(1451), "forceJoinRtcChannel TextUtils.isEmpty(curRtcUserInfo.linkMicId) || TextUtils.isEmpty(curRtcInfo)", null);
            C29306Beo.LJJJ(new AqS163S0100000_13((InterfaceC76768UAy) this.l1, (InterfaceC76768UAy<JoinRtcChannelResult>) 417));
            return;
        }
        U7B u7b = new U7B();
        u7b.LIZ = LLZL;
        u7b.LIZIZ = str;
        U7A u7a = new U7A(u7b);
        U7T u7t = (U7T) this.l0;
        U7U.LJIIZILJ(u7t.LJIIIZ, u7t, u7a.LIZIZ, false, false, false, false, "business_multi_guest_anchor_switch_layout", new AqS179S0100000_13((InterfaceC76768UAy) this.l1, (InterfaceC76768UAy<JoinRtcChannelResult>) 480), 60);
    }

    public final void LIZ$21() {
        U4R.LIZLLL("Linker", "Group change message callback for business.");
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7T) this.l0).LJII;
        IMessage iMessage = (IMessage) this.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
            it.next().LJJJZ(new GroupChangeMessage(linkLayerMessage, linkLayerMessage.bizContent));
        }
    }

    public final void LIZ$23() {
        TextView textView = ((C75177Tev) this.l0).LIZJ;
        if (textView != null && textView.getVisibility() == 0) {
            TextView textView2 = ((C75177Tev) this.l0).LIZJ;
            if (textView2 != null) {
                textView2.getHeight();
            }
        } else if (((List) this.l1).size() - 1 > 0) {
        }
        DataChannel dataChannel = ((C75177Tev) this.l0).LIZ;
        if (dataChannel != null) {
            ((List) this.l1).size();
            dataChannel.rv0(InteractPlayerViewHeightChangeChannel.class, new V18());
        }
    }

    public final void LIZ$24() {
        float measuredHeight;
        MatchBottomNoticeCard matchBottomNoticeCard = (MatchBottomNoticeCard) this.l0;
        if (matchBottomNoticeCard.LJLILLLLZI != null) {
            View view = (View) this.l1;
            matchBottomNoticeCard.getClass();
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[2];
            boolean z = matchBottomNoticeCard.LJLJLJ;
            fArr[0] = 0.0f;
            if (z) {
                measuredHeight = view.getMeasuredHeight() * (-1.0f);
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            fArr[1] = measuredHeight;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(333L);
            animatorSet.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
            animatorSet.addListener(new IDAListenerS43S0200000_13(matchBottomNoticeCard, view, 11));
            animatorSet.start();
            C0NB.LIZIZ("MatchBottomNoticeCard", "pull in animation");
            return;
        }
        o.LJIJI("bottomNoticeLayout");
        throw null;
    }

    public final void LIZ$25() {
        if (((C76939UHn) this.l0).getMLikeViews().size() < 3) {
            ((C76939UHn) this.l0).getMLikeViews().add((TuxIconView) this.l1);
        }
        ((TuxIconView) this.l1).setImageDrawable(null);
        ((TuxIconView) this.l1).clearAnimation();
        C76939UHn c76939UHn = (C76939UHn) this.l0;
        TuxIconView tuxIconView = (TuxIconView) this.l1;
        if (C78996UzQ.LJJIIJZLJL(tuxIconView)) {
            C78996UzQ.LJI();
        }
        c76939UHn.removeView(tuxIconView);
    }

    public final void LIZ$26() {
        boolean z;
        boolean z2;
        float f;
        C76929UHd boxView;
        C76929UHd boxView2 = ((C76930UHe) this.l0).getBoxView();
        boolean z3 = true;
        if (boxView2 != null && boxView2.getVisibility() == 0 && (boxView = ((C76930UHe) this.l0).getBoxView()) != null && boxView.LJJLL()) {
            z = true;
        } else {
            z = false;
        }
        C10S.LIZ("showOrHideDividerAndShadow# isShowingGuide : ", z, "BannerParentLayout");
        if (z) {
            return;
        }
        InterfaceC76931UHf interfaceC76931UHf = (InterfaceC76931UHf) this.l1;
        if (interfaceC76931UHf != null) {
            z2 = interfaceC76931UHf.LJIL(((C76930UHe) this.l0).getDividerLeftLoc());
        } else {
            z2 = false;
        }
        StringBuilder LJI = JBR.LJI("showOrHideDividerAndShadow# showDividerOrMasker : ", z2, "， ");
        LJI.append((InterfaceC76931UHf) this.l1);
        C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LJI));
        View divider = ((C76930UHe) this.l0).getDivider();
        if (divider == null || divider.getVisibility() != 0) {
            z3 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showOrHideDividerAndShadow# isCurrentShown : ");
        LIZ.append(z3);
        C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        C76930UHe c76930UHe = (C76930UHe) this.l0;
        arrayList.add(c76930UHe.getDivider());
        arrayList.add(c76930UHe.getMasker());
        List<View> LJLL = ORZ.LJLL(arrayList);
        C76930UHe c76930UHe2 = (C76930UHe) this.l0;
        for (View view : LJLL) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                animate.cancel();
            }
            if (z2) {
                view.setVisibility(0);
            }
            ViewPropertyAnimator animate2 = view.animate();
            if (animate2 != null) {
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                animate2.alpha(f).withStartAction(new ARunnableS32S0200000_13(c76930UHe2, animate2, 127)).withEndAction(new ARunnableS8S0310000_13(c76930UHe2, animate2, z2, view, 0)).setDuration(300L).setInterpolator(new C30901Je()).start();
            }
        }
    }

    public final void LIZ$27() {
        C76574U3m c76574U3m = (C76574U3m) this.l0;
        if (c76574U3m.LIZ(c76574U3m.LJ)) {
            C76574U3m c76574U3m2 = (C76574U3m) this.l0;
            C16880lQ.LJLLLL(c76574U3m2.LJ, c76574U3m2.LIZ);
        }
        TV3.LJIIJJI(((C76574U3m) this.l0).LIZJ);
        C76574U3m c76574U3m3 = (C76574U3m) this.l0;
        c76574U3m3.LIZIZ = (InterfaceC76578U3q) this.l1;
        c76574U3m3.LIZ.addView(c76574U3m3.LIZJ);
        C15490jB.LJI(((C76574U3m) this.l0).LJFF);
    }

    public final void LIZ$28() {
        C76574U3m c76574U3m = (C76574U3m) this.l0;
        if (c76574U3m.LIZ(c76574U3m.LIZJ)) {
            C76574U3m c76574U3m2 = (C76574U3m) this.l0;
            C16880lQ.LJLLLL(c76574U3m2.LIZJ, c76574U3m2.LIZ);
        }
        TV3.LJIIJJI(((C76574U3m) this.l0).LJ);
        C76574U3m c76574U3m3 = (C76574U3m) this.l0;
        c76574U3m3.LIZLLL = (InterfaceC76578U3q) this.l1;
        c76574U3m3.LIZ.addView(c76574U3m3.LJ);
        C15490jB.LJI(((C76574U3m) this.l0).LJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$29() {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS32S0200000_13.LIZ$29():void");
    }

    public final void LIZ$3() {
        LiveEditText liveEditText;
        LiveEditText liveEditText2;
        View findViewById;
        if (((UIZ) this.l0) == UIZ.KEYBOARD) {
            View view = ((LiveSubscribeEmojiInputDialog) this.l1).getView();
            if (view != null && (findViewById = view.findViewById(R.id.eop)) != null) {
                findViewById.requestFocus();
            }
            Context context = ((LiveSubscribeEmojiInputDialog) this.l1).getContext();
            View view2 = ((LiveSubscribeEmojiInputDialog) this.l1).getView();
            if (view2 != null) {
                liveEditText2 = (LiveEditText) view2.findViewById(R.id.eop);
            } else {
                liveEditText2 = null;
            }
            C79057V0z.LJJJJZ(context, liveEditText2);
            return;
        }
        LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog = (LiveSubscribeEmojiInputDialog) this.l1;
        View view3 = liveSubscribeEmojiInputDialog.getView();
        if (view3 == null || (liveEditText = (LiveEditText) view3.findViewById(R.id.eop)) == null) {
            return;
        }
        C79057V0z.LJJIIJZLJL(liveSubscribeEmojiInputDialog.getContext(), liveEditText);
    }

    public final void LIZ$5() {
        int i;
        AbstractC38911fr abstractC38911fr;
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = (SpotlightImageEditDialogFragment) this.l0;
        if (spotlightImageEditDialogFragment.LJLLILLLL == null) {
            i = 0;
        } else {
            i = 1;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_edit_done");
        spotlightImageEditDialogFragment.Gl(LIZ);
        LIZ.LJIJJ(spotlightImageEditDialogFragment.LLFII, "show_entrance");
        LIZ.LJIJJ("one", "click_position");
        LIZ.LJIJJ(1, "picture_quantity");
        LIZ.LJIJJ(String.valueOf(i), "text_quantity");
        LIZ.LJJIIJZLJL();
        C76883UFj c76883UFj = ((SpotlightImageEditDialogFragment) this.l0).LJLIL;
        if (c76883UFj != null && (abstractC38911fr = c76883UFj.LJIIJJI) != null) {
            abstractC38911fr.LJJIIZ((C76881UFh) this.l1);
        }
        ((SpotlightImageEditDialogFragment) this.l0).dismiss();
        DialogC31813Ce9 dialogC31813Ce9 = ((SpotlightImageEditDialogFragment) this.l0).LL;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
    }

    public final void LIZ$6() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = (AnimatorSet) this.l0;
        if (animatorSet2 != null) {
            animatorSet2.setStartDelay(300L);
        }
        U46 u46 = (U46) this.l1;
        if (u46.LIZ(R.id.dhk).getWidth() == 0) {
            animatorSet = new AnimatorSet();
        } else {
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u46.LIZ(R.id.fbu), (Property<View, Float>) View.SCALE_X, 1.0f, 1.1f);
            o.LJIIIIZZ(ofFloat, "ofFloat(iv_true_or_dare_…, View.SCALE_X, 1f, 1.1f)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u46.LIZ(R.id.fbu), (Property<View, Float>) View.SCALE_Y, 1.0f, 1.1f);
            o.LJIIIIZZ(ofFloat2, "ofFloat(iv_true_or_dare_…, View.SCALE_Y, 1f, 1.1f)");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(u46.LIZ(R.id.ga9), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            o.LJIIIIZZ(ofFloat3, "ofFloat(lottie_truth_or_…cket, View.ALPHA, 1f, 0f)");
            ofFloat.setInterpolator(u46.LJZ);
            ofFloat2.setInterpolator(u46.LJZ);
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet3.setDuration(100L);
            AnimatorSet animatorSet4 = new AnimatorSet();
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u46.LIZ(R.id.fbu), (Property<View, Float>) View.SCALE_X, 1.1f, 0.0f);
            o.LJIIIIZZ(ofFloat4, "ofFloat(iv_true_or_dare_…, View.SCALE_X, 1.1f, 0f)");
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(u46.LIZ(R.id.fbu), (Property<View, Float>) View.SCALE_Y, 1.1f, 0.0f);
            o.LJIIIIZZ(ofFloat5, "ofFloat(iv_true_or_dare_…, View.SCALE_Y, 1.1f, 0f)");
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(u46.LIZ(R.id.fbu), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            o.LJIIIIZZ(ofFloat6, "ofFloat(iv_true_or_dare_head, View.ALPHA, 1f, 0f)");
            ofFloat4.setInterpolator(u46.LJZ);
            ofFloat5.setInterpolator(u46.LJZ);
            animatorSet4.setDuration(100L);
            animatorSet4.setStartDelay(100L);
            animatorSet4.playTogether(ofFloat4, ofFloat5, ofFloat6);
            AnimatorSet animatorSet5 = new AnimatorSet();
            float y = u46.LIZ(R.id.dhk).getY() - u46.LIZ(R.id.dh9).getY();
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat7.addUpdateListener(new AUListenerS100S0100000_13(u46, 70));
            ofFloat7.setDuration(200L);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(u46.LIZ(R.id.dhk), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -y);
            o.LJIIIIZZ(ofFloat8, "ofFloat(fl_truth_or_dare…RANSLATION_Y, 0f, -moveY)");
            ofFloat8.setDuration(100L);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(u46.LIZ(R.id.dhk), (Property<View, Float>) View.SCALE_X, 1.0f, 5.0f);
            ofFloat9.setDuration(200L);
            animatorSet5.setStartDelay(100L);
            animatorSet5.playSequentially(ofFloat7, ofFloat8, ofFloat9);
            AnimatorSet animatorSet6 = new AnimatorSet();
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(u46.LIZ(R.id.dh9), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            o.LJIIIIZZ(ofFloat10, "ofFloat(fl_time_banner, View.ALPHA, 0f, 1f)");
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(u46.LIZ(R.id.dhk), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            o.LJIIIIZZ(ofFloat11, "ofFloat(fl_truth_or_dare…itle, View.ALPHA, 1f, 0f)");
            animatorSet6.setDuration(100L);
            animatorSet6.setStartDelay(400L);
            animatorSet6.playTogether(ofFloat10, ofFloat11);
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorSet3, animatorSet4, animatorSet5, animatorSet6);
        }
        ((U46) this.l1).LJLIL = new AnimatorSet();
        AnimatorSet animatorSet7 = ((U46) this.l1).LJLIL;
        if (animatorSet7 != null) {
            animatorSet7.playTogether((AnimatorSet) this.l0, animatorSet);
        }
        AnimatorSet animatorSet8 = ((U46) this.l1).LJLIL;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
        AnimatorSet animatorSet9 = ((U46) this.l1).LJLIL;
        if (animatorSet9 != null) {
            animatorSet9.addListener(new ALAdapterS10S0100000_13((U46) this.l1, 6));
        }
        C75838Tpa victoryLapActivityListener = ((U46) this.l1).getVictoryLapActivityListener();
        if (victoryLapActivityListener != null) {
            victoryLapActivityListener.LIZ("Fixed_icon");
        }
    }

    public final void LIZ$7() {
        BattleBonusConfig battleBonusConfig = ((BattleTask) this.l0).battleBonusConfig;
        if (battleBonusConfig != null) {
            C76819UCx c76819UCx = ((C76805UCj) this.l1).LLF;
            if (c76819UCx != null) {
                c76819UCx.LJ(battleBonusConfig, "room_enter");
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        BattleBonusStatus battleBonusStatus = ((BattleTask) this.l0).battleBonusStatus;
        if (battleBonusStatus != null) {
            C76819UCx c76819UCx2 = ((C76805UCj) this.l1).LLF;
            if (c76819UCx2 != null) {
                c76819UCx2.LJIIIZ(battleBonusStatus);
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
    }

    public final void LIZ$8() {
        Integer num;
        InterfaceC24140x8 interfaceC24140x8;
        InterfaceC21020s6 liveStream;
        LiveCore liveCore;
        LiveCore.Builder builder;
        InterfaceC24140x8 interfaceC24140x82;
        InterfaceC21020s6 liveStream2;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        InterfaceC74605TPt interfaceC74605TPt = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        Integer num2 = null;
        if ((interfaceC74605TPt instanceof InterfaceC24140x8) && (interfaceC24140x82 = (InterfaceC24140x8) interfaceC74605TPt) != null && (liveStream2 = interfaceC24140x82.getLiveStream()) != null && (liveCore2 = liveStream2.getLiveCore()) != null && (builder2 = liveCore2.getBuilder()) != null) {
            num = Integer.valueOf(builder2.getCaptureAdaptedWidth());
        } else {
            num = null;
        }
        InterfaceC74605TPt interfaceC74605TPt2 = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        if ((interfaceC74605TPt2 instanceof InterfaceC24140x8) && (interfaceC24140x8 = (InterfaceC24140x8) interfaceC74605TPt2) != null && (liveStream = interfaceC24140x8.getLiveStream()) != null && (liveCore = liveStream.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
            num2 = Integer.valueOf(builder.getCaptureAdaptedHeight());
        }
        C74957TbN.LIZ().LJJ(C0WE.LIZJ(((SurfaceView) this.l1).getWidth(), ((SurfaceView) this.l1).getHeight(), num, num2, false));
    }

    public final void LIZ$9() {
        Integer num;
        InterfaceC24140x8 interfaceC24140x8;
        InterfaceC21020s6 liveStream;
        LiveCore liveCore;
        LiveCore.Builder builder;
        InterfaceC24140x8 interfaceC24140x82;
        InterfaceC21020s6 liveStream2;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        InterfaceC74605TPt interfaceC74605TPt = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        Integer num2 = null;
        if ((interfaceC74605TPt instanceof InterfaceC24140x8) && (interfaceC24140x82 = (InterfaceC24140x8) interfaceC74605TPt) != null && (liveStream2 = interfaceC24140x82.getLiveStream()) != null && (liveCore2 = liveStream2.getLiveCore()) != null && (builder2 = liveCore2.getBuilder()) != null) {
            num = Integer.valueOf(builder2.getCaptureAdaptedWidth());
        } else {
            num = null;
        }
        InterfaceC74605TPt interfaceC74605TPt2 = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        if ((interfaceC74605TPt2 instanceof InterfaceC24140x8) && (interfaceC24140x8 = (InterfaceC24140x8) interfaceC74605TPt2) != null && (liveStream = interfaceC24140x8.getLiveStream()) != null && (liveCore = liveStream.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
            num2 = Integer.valueOf(builder.getCaptureAdaptedHeight());
        }
        C74957TbN.LIZ().LJJ(C0WE.LIZJ(((SurfaceView) this.l1).getWidth(), ((SurfaceView) this.l1).getHeight(), num, num2, false));
    }

    public final void LIZ$22() {
        U2O u2o;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("im_message_eggtask_reward_settle  [delay] , left_time = ");
        LIZ.append(((MatchSpeedChallengeVM) this.l0).LJLJLLL);
        LIZ.append(' ');
        C0NB.LJIIIZ("SpeedChallengeVM", X1D.LIZIZ(LIZ));
        MatchSpeedChallengeVM matchSpeedChallengeVM = (MatchSpeedChallengeVM) this.l0;
        matchSpeedChallengeVM.setState(new AqS144S0200000_13(matchSpeedChallengeVM, (C76820UCy) this.l1, 54));
        U2O u2o2 = ((C76820UCy) this.l1).LJLIL;
        if (u2o2 != U2O.DISABLED && u2o2 != (u2o = U2O.BONUS_FINISHED)) {
            MatchSpeedChallengeVM matchSpeedChallengeVM2 = (MatchSpeedChallengeVM) this.l0;
            matchSpeedChallengeVM2.gv0(matchSpeedChallengeVM2.LJLJLLL, u2o);
        }
    }

    public final void LIZ$4() {
        C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ((ImageModel) this.l0);
        int width = ((C47061t0) this.l1).getWidth();
        int height = ((C47061t0) this.l1).getHeight();
        LJIIIZ.LJ = width;
        LJIIIZ.LJFF = height;
        LJIIIZ.LJIIL = Boolean.TRUE;
        C47061t0 c47061t0 = (C47061t0) this.l1;
        LJIIIZ.LJIIJJI = new IDdS57S0100000_13(c47061t0, 2);
        LJIIIZ.LJIIJJI(c47061t0);
    }

    public static final void run$0(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C76836UDo c76836UDo = (C76836UDo) aRunnableS32S0200000_13.l0;
            C2A4 c2a4 = (C2A4) aRunnableS32S0200000_13.l1;
            if (C78996UzQ.LJJIIJZLJL(c2a4)) {
                C78996UzQ.LJI();
            }
            c76836UDo.removeView(c2a4);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C29701Eo) aRunnableS32S0200000_13.l0).setAnimation("ttlive_gift_combo_wave.json");
            C29701Eo c29701Eo = (C29701Eo) aRunnableS32S0200000_13.l0;
            c29701Eo.addAnimatorListener(new C77560UcG(c29701Eo, (C9CS) aRunnableS32S0200000_13.l1));
            ((C29701Eo) aRunnableS32S0200000_13.l0).playAnimation();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            int LIZ2 = (int) (LAV.LIZ(((C75795Tot) aRunnableS32S0200000_13.l1).LJ) * ((ViewGroup) aRunnableS32S0200000_13.l0).getWidth());
            int i = (int) (LIZ2 * 0.375f);
            ImageView imageView = (ImageView) ((ViewGroup) aRunnableS32S0200000_13.l0).findViewById(R.id.cv5);
            if (imageView != null) {
                C79004UzY.LJJJLZIJ(LIZ2, LIZ2, imageView);
            }
            LiveIconView liveIconView = (LiveIconView) ((ViewGroup) aRunnableS32S0200000_13.l0).findViewById(R.id.cvl);
            if (liveIconView != null) {
                C79004UzY.LJJJLZIJ(i, i, liveIconView);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$100(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U7F u7f = (U7F) aRunnableS32S0200000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
            LinkCoreError linkCoreError = (LinkCoreError) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJIIZ(u7f, 4, linkCoreError, null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$101(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7F) aRunnableS32S0200000_13.l0).LJIILJJIL;
            LinkUser linkUser = (LinkUser) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJJJLI(linkUser);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$102(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            List<InterfaceC76728U9k> list = ((U7H) aRunnableS32S0200000_13.l0).LJIIIZ;
            Map<String, OnLineMicInfo> map = (Map) aRunnableS32S0200000_13.l1;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((InterfaceC76728U9k) it.next()).LIZIZ(map);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$103(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7F) aRunnableS32S0200000_13.l0).LJIILJJIL;
            LinkUser linkUser = (LinkUser) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJJJLI(linkUser);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$104(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76620U5g> copyOnWriteArrayList = ((C76614U5a) aRunnableS32S0200000_13.l0).LJFF;
            U65 u65 = (U65) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76620U5g> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LLJILJIL(u65);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$105(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76620U5g> copyOnWriteArrayList = ((C76614U5a) aRunnableS32S0200000_13.l0).LJFF;
            U65 u65 = (U65) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76620U5g> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LLJILJIL(u65);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$106(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7F) aRunnableS32S0200000_13.l0).LJIILJJIL;
            LinkUser linkUser = (LinkUser) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJJJLI(linkUser);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$107(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7F) aRunnableS32S0200000_13.l0).LJIILJJIL;
            LinkUser linkUser = (LinkUser) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJJJLI(linkUser);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$108(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$23();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$109(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C47061t0) aRunnableS32S0200000_13.l0).setVisibility(8);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS32S0200000_13.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            CL6.LIZIZ("match_punish");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$110(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C29701Eo) aRunnableS32S0200000_13.l0).setVisibility(8);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS32S0200000_13.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            CL6.LIZIZ("match_punish");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$111(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$24();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$112(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C47061t0) aRunnableS32S0200000_13.l0).setVisibility(8);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS32S0200000_13.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            CL6.LIZIZ("match_punish");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$113(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C29701Eo) aRunnableS32S0200000_13.l0).setVisibility(8);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS32S0200000_13.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            CL6.LIZIZ("match_punish");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$114(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((FeedLiveViewHolderNew) aRunnableS32S0200000_13.l0).LLFFF((Aweme) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$115(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((FeedLiveViewHolderOpt) aRunnableS32S0200000_13.l0).LL((Aweme) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$116(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((View) aRunnableS32S0200000_13.l0).setVisibility(8);
            C78932UyO.LJFF((View) aRunnableS32S0200000_13.l0);
            ((Runnable) aRunnableS32S0200000_13.l1).run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$117(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$25();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$118(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76696U8e) aRunnableS32S0200000_13.l0).LIZLLL((Layout) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$119(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76696U8e) aRunnableS32S0200000_13.l0).LIZLLL((Layout) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        AbstractC38911fr abstractC38911fr;
        try {
            C76883UFj c76883UFj = ((EmoteEditDialogFragment) aRunnableS32S0200000_13.l0).LJLIL;
            if (c76883UFj != null && (abstractC38911fr = c76883UFj.LJIIJJI) != null) {
                abstractC38911fr.LJJIIZ((C76881UFh) aRunnableS32S0200000_13.l1);
            }
            ((EmoteEditDialogFragment) aRunnableS32S0200000_13.l0).dismiss();
            DialogC31813Ce9 dialogC31813Ce9 = ((EmoteEditDialogFragment) aRunnableS32S0200000_13.l0).LLD;
            if (dialogC31813Ce9 != null) {
                C29306Beo.LJJJJ(dialogC31813Ce9);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$120(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76697U8f) aRunnableS32S0200000_13.l0).LIZLLL((Layout) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$121(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76697U8f) aRunnableS32S0200000_13.l0).LLFF.LJLIL((ArrayList) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$122(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76697U8f) aRunnableS32S0200000_13.l0).LIZLLL((Layout) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$123(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76697U8f) aRunnableS32S0200000_13.l0).LLFF.LJLIL((ArrayList) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$124(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Context LIZLLL = C15380j0.LIZLLL();
            String str = ((IapFailExtra) aRunnableS32S0200000_13.l0).toastMessage;
            ((C77519Ubb) aRunnableS32S0200000_13.l1).getClass();
            C30868C9o.LJ(12L, LIZLLL, str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$125(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            List<ViewPropertyAnimator> list = ((C76929UHd) aRunnableS32S0200000_13.l0).LJLJL;
            ViewPropertyAnimator bgAnimator = (ViewPropertyAnimator) aRunnableS32S0200000_13.l1;
            o.LJIIIIZZ(bgAnimator, "bgAnimator");
            ((ArrayList) list).add(bgAnimator);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$126(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            List<ViewPropertyAnimator> list = ((C76929UHd) aRunnableS32S0200000_13.l0).LJLJL;
            ViewPropertyAnimator guideAnimator = (ViewPropertyAnimator) aRunnableS32S0200000_13.l1;
            o.LJIIIIZZ(guideAnimator, "guideAnimator");
            ((ArrayList) list).add(guideAnimator);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$127(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((ArrayList) ((C76930UHe) aRunnableS32S0200000_13.l0).LJLJJLL).add((ViewPropertyAnimator) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$128(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$26();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$129(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$27();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$130(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$28();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$131(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76728U9k> copyOnWriteArrayList = ((C76669U7d) aRunnableS32S0200000_13.l0).LIZJ;
            Map<String, OnLineMicInfo> map = (Map) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76728U9k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(map);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$132(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76728U9k> copyOnWriteArrayList = ((C76669U7d) aRunnableS32S0200000_13.l0).LIZJ;
            Map<String, OnLineMicInfo> map = (Map) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76728U9k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ(map);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$133(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76728U9k> copyOnWriteArrayList = ((C76669U7d) aRunnableS32S0200000_13.l0).LIZJ;
            Map<String, OnLineMicInfo> map = (Map) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76728U9k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZ(map);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$134(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<InterfaceC76728U9k> copyOnWriteArrayList = ((C76669U7d) aRunnableS32S0200000_13.l0).LIZJ;
            Map<String, OnLineMicInfo> map = (Map) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76728U9k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL(map);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$135(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        try {
            ViewGroup viewGroup = ((C78078Ukc) aRunnableS32S0200000_13.l0).LLD;
            if (viewGroup != null && (animate = viewGroup.animate()) != null && (scaleX = animate.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (duration = scaleY.setDuration(100L)) != null && (interpolator = duration.setInterpolator((C83741Wtl) aRunnableS32S0200000_13.l1)) != null) {
                interpolator.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$136(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$29();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$137(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS32S0200000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS32S0200000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS1S0300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS32S0200000_13.l0, c76762UAs, LJIJI, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$138(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS32S0200000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS32S0200000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS1S0300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS32S0200000_13.l0, c76762UAs, LJIJI, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$139(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS32S0200000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS32S0200000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS1S0300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS32S0200000_13.l0, c76762UAs, LJIJI, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            FrameLayout frameLayout = (FrameLayout) ((U2A) aRunnableS32S0200000_13.l0).LIZ(R.id.gfb);
            if (frameLayout != null) {
                C16880lQ.LJLLLL((C47061t0) aRunnableS32S0200000_13.l1, frameLayout);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$140(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS32S0200000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            LayoutInfo LLLZI = ((U66) aRunnableS32S0200000_13.l0).LLLZI();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS32S0200000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S0400200_13(c76762UAs, (U66) aRunnableS32S0200000_13.l0, LJIJI, LLLZI, LIZIZ, currentTimeMillis, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$141(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS32S0200000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS32S0200000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS1S0300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS32S0200000_13.l0, c76762UAs, LJIJI, 3));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$142(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS32S0200000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS32S0200000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS1S0300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS32S0200000_13.l0, c76762UAs, LJIJI, 4));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$143(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS32S0200000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS32S0200000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS1S0300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS32S0200000_13.l0, c76762UAs, LJIJI, 7));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$144(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS32S0200000_13.l0).LJFF;
            if (u9f != null) {
                u9f.LJJI((LinkCoreError) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$145(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS32S0200000_13.l0).LJFF;
            if (u9f != null) {
                u9f.LLIZLLLIL((LinkCoreError) aRunnableS32S0200000_13.l1);
            }
            U9F u9f2 = ((U7U) aRunnableS32S0200000_13.l0).LJFF;
            if (u9f2 != null) {
                u9f2.LJLLI(false, (LinkCoreError) aRunnableS32S0200000_13.l1);
            }
            U7U u7u = (U7U) aRunnableS32S0200000_13.l0;
            U9F u9f3 = u7u.LJFF;
            if (u9f3 != null) {
                u9f3.LJIJJLI(u7u.LJJIIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$146(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS32S0200000_13.l0).LJFF;
            if (u9f != null) {
                u9f.LLIIIL((Object[]) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76846UDy) aRunnableS32S0200000_13.l0).LIZLLL(new C33611Tp(((C14500ha) aRunnableS32S0200000_13.l1).LIZ, new OSZ(new Point(0, 0), new Point(0, 0)), 0, System.currentTimeMillis()));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        C42951mN<C2A4> c42951mN;
        try {
            C16880lQ.LJLLLL((C2A4) aRunnableS32S0200000_13.l1, ((C76846UDy) aRunnableS32S0200000_13.l0).LIZIZ.LJJIJIL());
            if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable() && (c42951mN = ((C76846UDy) aRunnableS32S0200000_13.l0).LJIIIZ) != null) {
                c42951mN.LIZ((C2A4) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C75422Tis c75422Tis = ((MultiGuestEffectSwitchFragment) aRunnableS32S0200000_13.l0).LJZ;
            if (c75422Tis != null) {
                c75422Tis.LJIILL(((MultiGuestFullPropsPageFragment) aRunnableS32S0200000_13.l1).getView());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C75422Tis c75422Tis = ((MultiGuestEffectSwitchFragment) aRunnableS32S0200000_13.l0).LJZ;
            if (c75422Tis != null) {
                c75422Tis.LJIILL(((MultiGuestFullPropsPageFragment) aRunnableS32S0200000_13.l1).getView());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76414Tys) aRunnableS32S0200000_13.l0).LJ((CohostTopic) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            RankListV2Response.RankView rankView = ((RankListController) aRunnableS32S0200000_13.l0).LJII().LJLILLLLZI;
            C31522CYs.LJIIJ(((RankListFragment) aRunnableS32S0200000_13.l1).LJLJJI, rankView, C51029K0z.LJIILIIL((RankListFragment) aRunnableS32S0200000_13.l1), ((RankListController) aRunnableS32S0200000_13.l0).LIZ().LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            RankListV2Response.RankView rankView = ((RankListController) aRunnableS32S0200000_13.l0).LJII().LJLILLLLZI;
            C31522CYs.LJIIJ(((RankListFragment) aRunnableS32S0200000_13.l1).LJLJJI, rankView, C51029K0z.LJIILIIL((RankListFragment) aRunnableS32S0200000_13.l1), ((RankListController) aRunnableS32S0200000_13.l0).LIZ().LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C77455UaZ c77455UaZ = (C77455UaZ) aRunnableS32S0200000_13.l0;
            CompletionBlock completionBlock = (CompletionBlock) aRunnableS32S0200000_13.l1;
            c77455UaZ.getClass();
            InterfaceC77461Uaf interfaceC77461Uaf = (InterfaceC77461Uaf) ED5.LIZJ(InterfaceC77461Uaf.class, null);
            interfaceC77461Uaf.setOrderID("");
            interfaceC77461Uaf.setResult(CardStruct.IStatusCode.DEFAULT);
            completionBlock.onSuccess(interfaceC77461Uaf, "");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((InterfaceC65784Pro) aRunnableS32S0200000_13.l1).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((InterfaceC65784Pro) aRunnableS32S0200000_13.l1).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C76929UHd boxView = ((C76930UHe) aRunnableS32S0200000_13.l0).getBoxView();
            if (boxView != null) {
                boxView.setVisibility(0);
            }
            C76929UHd boxView2 = ((C76930UHe) aRunnableS32S0200000_13.l0).getBoxView();
            if (boxView2 != null) {
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(boxView2, new ARunnableS32S0200000_13(boxView2, (InterfaceC65784Pro) aRunnableS32S0200000_13.l1, 31));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C81091Vs7 c81091Vs7 = (C81091Vs7) ((EmoteEditDialogFragment) aRunnableS32S0200000_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs7 != null) {
                c81091Vs7.LJIIJJI(-((C56K) aRunnableS32S0200000_13.l1).element, 0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C81091Vs7 c81091Vs7 = (C81091Vs7) ((EmoteEditDialogFragment) aRunnableS32S0200000_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs7 != null) {
                c81091Vs7.LJIIJJI(-((C56K) aRunnableS32S0200000_13.l1).element, 0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C81091Vs7 c81091Vs7 = (C81091Vs7) ((EmoteEditDialogFragment) aRunnableS32S0200000_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs7 != null) {
                c81091Vs7.LJIIJJI(-((C56K) aRunnableS32S0200000_13.l1).element, 0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<U87> copyOnWriteArrayList = ((U7Z) aRunnableS32S0200000_13.l0).LJIIZILJ;
            Map<Long, ? extends List<GroupChannelUser>> map = (Map) aRunnableS32S0200000_13.l1;
            Iterator<U87> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJL(map);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C81091Vs7 c81091Vs7 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aRunnableS32S0200000_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs7 != null) {
                c81091Vs7.LJIIJJI(-((C56K) aRunnableS32S0200000_13.l1).element, 0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C81091Vs7 c81091Vs7 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aRunnableS32S0200000_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs7 != null) {
                c81091Vs7.LJIIJJI(-((C56K) aRunnableS32S0200000_13.l1).element, 0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C81091Vs7 c81091Vs7 = (C81091Vs7) ((SpotlightImageEditDialogFragment) aRunnableS32S0200000_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs7 != null) {
                c81091Vs7.LJIIJJI(-((C56K) aRunnableS32S0200000_13.l1).element, 0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$44(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C81091Vs7 c81091Vs7 = (C81091Vs7) ((SpotlightImageListPreviewDialogFragment) aRunnableS32S0200000_13.l0)._$_findCachedViewById(R.id.f12);
            if (c81091Vs7 != null) {
                c81091Vs7.LJIIJJI(-((C56K) aRunnableS32S0200000_13.l1).element, 0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((AudioGraphStickerHandler) aRunnableS32S0200000_13.l0).LJIILJJIL((T4Q) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$46(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            synchronized (((C78793Uw9) aRunnableS32S0200000_13.l1).LIZJ) {
                ((C78793Uw9) aRunnableS32S0200000_13.l1).LIZIZ.removeAll((List) aRunnableS32S0200000_13.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$47(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            InterfaceC75973Trl LLIIJI = ((InterfaceC75441TjB) aRunnableS32S0200000_13.l0).LLIIJI();
            if (LLIIJI != null) {
                LLIIJI.LJJJJLL(0, (List) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$48(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((AbstractC76282Twk) aRunnableS32S0200000_13.l0).LJIIJ((LinkMicBattleMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$49(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((AbstractC76282Twk) aRunnableS32S0200000_13.l0).LJIIJJI((LinkMicBattlePunishFinishMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$50(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((AbstractC76282Twk) aRunnableS32S0200000_13.l0).LJIIL((LinkMicBattleVictoryLapMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$51(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76278Twg) aRunnableS32S0200000_13.l0).LJIIIZ((LinkMicBattleArmiesMessage) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$52(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76279Twh) aRunnableS32S0200000_13.l0).LJIIIZ((LinkMicBattleArmiesMessage) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$53(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C76278Twg.LJIJJLI((C76278Twg) aRunnableS32S0200000_13.l0, 105, false, 0L, null, ((C76732zl) aRunnableS32S0200000_13.l1).element, 0L, 64);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$54(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((IPrevLoginPlatformService) aRunnableS32S0200000_13.l0).getPlatform().removeObserver((Observer) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$55(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76610U4w) aRunnableS32S0200000_13.l0).LIZ.invoke((C28272B7s) aRunnableS32S0200000_13.l1);
            ((C76610U4w) aRunnableS32S0200000_13.l0).LIZIZ.compareAndSet(false, true);
            if (!o.LJ((C28272B7s) aRunnableS32S0200000_13.l1, ((C76610U4w) aRunnableS32S0200000_13.l0).LIZJ)) {
                C76610U4w c76610U4w = (C76610U4w) aRunnableS32S0200000_13.l0;
                c76610U4w.onSei(c76610U4w.LIZJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$56(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            DataChannel dataChannel = ((C76805UCj) aRunnableS32S0200000_13.l0).LLD;
            if (dataChannel != null) {
                dataChannel.qv0(BattleBonusContainerChangeEvent.class, Integer.valueOf(((View) aRunnableS32S0200000_13.l1).getMeasuredWidth()));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$57(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$19();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$58(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((AbstractC76285Twn) aRunnableS32S0200000_13.l0).LJIILIIL((LinkMicBattleMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$59(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((AbstractC76285Twn) aRunnableS32S0200000_13.l0).LJIILJJIL((LinkMicBattlePunishFinishMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$60(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((AbstractC76285Twn) aRunnableS32S0200000_13.l0).LJIILLIIL((LinkMicBattleVictoryLapMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$61(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76286Two) aRunnableS32S0200000_13.l0).LJIIL((LinkMicBattleArmiesMessage) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$62(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76287Twp) aRunnableS32S0200000_13.l0).LJIIL((LinkMicBattleArmiesMessage) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$63(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        UZK oK;
        try {
            IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
            if (iGamePartnershipService != null && (oK = iGamePartnershipService.oK()) != null) {
                oK.LIZIZ(((GameShortVideoAdDetailPageDialogFragment) aRunnableS32S0200000_13.l0).getContext(), (UZI) aRunnableS32S0200000_13.l1, null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$64(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) aRunnableS32S0200000_13.l0, ((C32362Cn0) aRunnableS32S0200000_13.l1).LIZ());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$65(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76297Twz) aRunnableS32S0200000_13.l0).LJIIJ((LinkMicBattleArmiesMessage) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$66(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((C76296Twy) aRunnableS32S0200000_13.l0).LJIIJ((LinkMicBattleArmiesMessage) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$67(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedViewDelegateAbs", "receive LinkMicBattleMessage");
            ((AbstractC76298Tx0) aRunnableS32S0200000_13.l0).LJIILIIL((LinkMicBattleMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$68(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedViewDelegateAbs", "receive LinkMicBattleArmiesMessage");
            ((AbstractC76298Tx0) aRunnableS32S0200000_13.l0).LIZLLL((LinkMicBattleArmiesMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$69(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedViewDelegateAbs", "receive LinkMicBattlePunishFinishMessage");
            ((AbstractC76298Tx0) aRunnableS32S0200000_13.l0).LJIILLIIL((LinkMicBattlePunishFinishMessage) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<U87> copyOnWriteArrayList = ((U7Z) aRunnableS32S0200000_13.l0).LJIIZILJ;
            List list = (List) aRunnableS32S0200000_13.l1;
            Iterator<U87> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                U87 it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                it2.LJJLJLI(list, null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$70(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedViewDelegateAbs", "receive LinkMicBattleItemCard");
            ((AbstractC76298Tx0) aRunnableS32S0200000_13.l0).LJIIL((LinkMicBattleItemCard) ((IMessage) aRunnableS32S0200000_13.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$71(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "receive LinkMicBattleMessage");
            C76312TxE c76312TxE = (C76312TxE) aRunnableS32S0200000_13.l0;
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) ((IMessage) aRunnableS32S0200000_13.l1);
            c76312TxE.getClass();
            if (linkMicBattleMessage.action == 4) {
                InterfaceC76348Txo interfaceC76348Txo = c76312TxE.LIZ;
                if (interfaceC76348Txo != null) {
                    interfaceC76348Txo.p7(linkMicBattleMessage);
                }
            } else {
                InterfaceC76348Txo interfaceC76348Txo2 = c76312TxE.LIZ;
                if (interfaceC76348Txo2 != null) {
                    interfaceC76348Txo2.LIZIZ(linkMicBattleMessage);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$72(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "receive LinkMicBattleArmiesMessage");
            InterfaceC76348Txo interfaceC76348Txo = ((C76312TxE) aRunnableS32S0200000_13.l0).LIZ;
            if (interfaceC76348Txo != null) {
                interfaceC76348Txo.LIZIZ((IMessage) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$73(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "receive LinkMicBattlePunishFinishMessage");
            InterfaceC76348Txo interfaceC76348Txo = ((C76312TxE) aRunnableS32S0200000_13.l0).LIZ;
            if (interfaceC76348Txo != null) {
                interfaceC76348Txo.LIZIZ((IMessage) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$74(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "receive LinkMicBattleItemCard");
            InterfaceC76348Txo interfaceC76348Txo = ((C76312TxE) aRunnableS32S0200000_13.l0).LIZ;
            if (interfaceC76348Txo != null) {
                interfaceC76348Txo.LIZIZ((IMessage) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$75(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            InterfaceC77110UOc interfaceC77110UOc = ((UOJ) aRunnableS32S0200000_13.l0).LIZLLL;
            if (interfaceC77110UOc != null) {
                interfaceC77110UOc.LJJIJIL((UOW) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$76(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U7T u7t = (U7T) aRunnableS32S0200000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
            PermitJoinGroupContent permitJoinGroupContent = (PermitJoinGroupContent) aRunnableS32S0200000_13.l1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJII(new C76716U8y(u7t, permitJoinGroupContent));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$77(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U7V.LJIILIIL(new CancelApplyJoinGroupResult(((R2P) aRunnableS32S0200000_13.l0).LIZIZ), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$78(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<UBA> copyOnWriteArrayList = ((LinkCoreService) aRunnableS32S0200000_13.l0).LJLJJLL;
            U7T u7t = (U7T) aRunnableS32S0200000_13.l1;
            Iterator<UBA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL(u7t);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$79(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<U87> copyOnWriteArrayList = ((U7Z) aRunnableS32S0200000_13.l0).LJIIZILJ;
            List<LinkUser> list = (List) aRunnableS32S0200000_13.l1;
            Iterator<U87> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJLLJ(list);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$80(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        GroupChannelAllUser groupChannelAllUser;
        RechargeResp rechargeResp;
        try {
            R2P r2p = (R2P) aRunnableS32S0200000_13.l0;
            String str = null;
            if (r2p != null && (rechargeResp = (RechargeResp) r2p.data) != null) {
                groupChannelAllUser = rechargeResp.groupUser;
            } else {
                groupChannelAllUser = null;
                if (r2p != null) {
                }
                U7V.LJIILIIL(new RechargeResult(groupChannelAllUser, str), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
            }
            str = r2p.LIZIZ;
            U7V.LJIILIIL(new RechargeResult(groupChannelAllUser, str), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$81(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((LinkCoreService) aRunnableS32S0200000_13.l0).LIZLLL((LinkMessage) aRunnableS32S0200000_13.l1, null).LJIIIZ((LinkMessage) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$82(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$83(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            R2P r2p = (R2P) aRunnableS32S0200000_13.l0;
            U7V.LJIILIIL(new InviteGroupResult(((JoinGroupResp) r2p.data).cohostRespExtra, r2p.LIZIZ), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$84(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$85(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$20();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$86(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U7V.LJIILIIL(new CancelInviteJoinGroupResult(((R2P) aRunnableS32S0200000_13.l0).LIZIZ), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$87(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            R2P r2p = (R2P) aRunnableS32S0200000_13.l0;
            U7V.LJIILIIL(new LeaveGroupResult(((LeaveJoinGroupResp) r2p.data).cohostBizResp, r2p.LIZIZ), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$88(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$89(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$90(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U7V.LJIILIIL(new ReplyInviteGroupResult(((R2P) aRunnableS32S0200000_13.l0).LIZIZ), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$91(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        BizJoinGroupResponse bizJoinGroupResponse;
        try {
            R2P r2p = (R2P) aRunnableS32S0200000_13.l0;
            JoinGroupResp joinGroupResp = (JoinGroupResp) r2p.data;
            if (joinGroupResp != null) {
                bizJoinGroupResponse = joinGroupResp.cohostRespExtra;
            } else {
                bizJoinGroupResponse = null;
            }
            U7V.LJIILIIL(new ApplyGroupResult(bizJoinGroupResponse, r2p.LIZIZ), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$92(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$21();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$93(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$94(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$95(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            U7V.LJIILIIL(new PermitApplyGroupResult(((R2P) aRunnableS32S0200000_13.l0).LIZIZ), (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$96(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            Throwable it = (Throwable) aRunnableS32S0200000_13.l0;
            o.LJIIIIZZ(it, "it");
            U7V.LJIIJJI(it, (InterfaceC76768UAy) aRunnableS32S0200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$97(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            DataChannel dataChannel = (DataChannel) aRunnableS32S0200000_13.l0;
            if (dataChannel != null) {
                dataChannel.qv0(MatchRtcOpenMessageEvent.class, (MatchRtcOpenMessage) aRunnableS32S0200000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$98(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            ((V9R) aRunnableS32S0200000_13.l1).LJIIJJI((V9T) aRunnableS32S0200000_13.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$99(ARunnableS32S0200000_13 aRunnableS32S0200000_13) {
        boolean LIZ;
        try {
            aRunnableS32S0200000_13.LIZ$22();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS32S0200000_13(C76574U3m c76574U3m, int i) {
        this.$t = i;
        this.l0 = c76574U3m;
        this.l1 = null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS32S0200000_13(X.C14500ha r2, X.C76846UDy r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 20: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS32S0200000_13.<init>(X.0ha, X.UDy, int):void");
    }

    public ARunnableS32S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ARunnableS32S0200000_13(C75177Tev c75177Tev, C75177Tev c75177Tev2, List<? extends InterfaceC75179Tex> list, int i) {
        this.$t = i;
        this.l0 = c75177Tev;
        this.l1 = c75177Tev2;
    }

    public ARunnableS32S0200000_13(U7U u7u, int i, long j, Object[] objArr, int i2) {
        this.$t = i2;
        this.l0 = u7u;
        this.l1 = objArr;
    }
}
