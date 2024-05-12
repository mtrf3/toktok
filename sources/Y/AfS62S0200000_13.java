package Y;

import X.AbstractC75865Tq1;
import X.AbstractC75977Trp;
import X.B83;
import X.BPP;
import X.BZI;
import X.C05170If;
import X.C05630Jz;
import X.C0NB;
import X.C0TL;
import X.C15380j0;
import X.C15610jN;
import X.C276516r;
import X.C28467BFf;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C30868C9o;
import X.C32014ChO;
import X.C32208CkW;
import X.C32355Cmt;
import X.C34K;
import X.C44375HbH;
import X.C58416MwG;
import X.C58418MwI;
import X.C61447O9r;
import X.C64698PaI;
import X.C64799Pbv;
import X.C68322mC;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73969T1h;
import X.C74726TUk;
import X.C74738TUw;
import X.C74776TWi;
import X.C74838TYs;
import X.C74947TbD;
import X.C75378TiA;
import X.C75516TkO;
import X.C75525TkX;
import X.C75688TnA;
import X.C75726Tnm;
import X.C75863Tpz;
import X.C75870Tq6;
import X.C75878TqE;
import X.C75981Trt;
import X.C75984Trw;
import X.C75989Ts1;
import X.C76003TsF;
import X.C76007TsJ;
import X.C76015TsR;
import X.C76016TsS;
import X.C76032Tsi;
import X.C76110Tty;
import X.C76116Tu4;
import X.C76188TvE;
import X.C76190TvG;
import X.C76234Tvy;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76301Tx3;
import X.C76302Tx4;
import X.C76312TxE;
import X.C76718U9a;
import X.C76732zl;
import X.C76766UAw;
import X.C76800UCe;
import X.C77150UPq;
import X.C77492UbA;
import X.C77536Ubs;
import X.C77537Ubt;
import X.C77607Ud1;
import X.C77624UdI;
import X.C77731Uf1;
import X.C78609UtB;
import X.EnumC32353Cmr;
import X.EnumC75617Tm1;
import X.EnumC75692TnE;
import X.EnumC75697TnJ;
import X.EnumC76178Tv4;
import X.InterfaceC215138cP;
import X.InterfaceC29856Bng;
import X.InterfaceC58007Mpf;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.InterfaceC74596TPk;
import X.InterfaceC74617TQf;
import X.InterfaceC75158Tec;
import X.InterfaceC75706TnS;
import X.InterfaceC75871Tq7;
import X.InterfaceC76347Txn;
import X.InterfaceC76348Txo;
import X.InterfaceC76362Ty2;
import X.InterfaceC76562U3a;
import X.InterfaceC76768UAy;
import X.InterfaceC77500UbI;
import X.InterfaceC77737Uf7;
import X.InterfaceC92693kP;
import X.JBR;
import X.R2P;
import X.TMC;
import X.TTW;
import X.TV4;
import X.TV5;
import X.TV9;
import X.TZI;
import X.U30;
import X.U4C;
import X.U4R;
import X.U66;
import X.U7F;
import X.U7T;
import X.U7V;
import X.U8Q;
import X.U9N;
import X.UHK;
import X.UI8;
import X.UPG;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.audience.LiveShowAudienceViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeThresholdInfoData;
import com.bytedance.android.live.wallet.model.ExchangeExtra;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.utils.ChargeFailLogHelper;
import com.bytedance.android.live.wallet.viewmodel.exchange.AutoExchangeTaxDialogVM;
import com.bytedance.android.livesdk.browser.emote.CropEmoteFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.LinkmicSettingResult;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCancelResult;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestDetroyWhenCreateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRtcReplyMsgSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinFixChannelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptAbTest;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.InviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.JoinChannelResp;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS42S0210000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.controller.RechargeResp;
import webcast.data.cohost_biz.BizRechargeResponse;
import webcast.data.multi_guest_play.ShowContent;
import webcast.im.CohostContent;
import webcast.im.ListChangeBizContent;
import webcast.im.P2PGroupChangeContent;

/* loaded from: classes14.dex */
public class AfS62S0200000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            case 36:
                accept$36(this, obj);
                return;
            case 37:
                accept$37(this, obj);
                return;
            case 38:
                accept$38(this, obj);
                return;
            case 39:
                accept$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                accept$40(this, obj);
                return;
            case 41:
                accept$41(this, obj);
                return;
            case 42:
                accept$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                accept$43(this, obj);
                return;
            case 44:
                accept$44(this, obj);
                return;
            case 45:
                accept$45(this, obj);
                return;
            case 46:
                accept$46(this, obj);
                return;
            case 47:
                accept$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                accept$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                accept$49(this, obj);
                return;
            case 50:
                accept$50(this, obj);
                return;
            case 51:
                accept$51(this, obj);
                return;
            case 52:
                accept$52(this, obj);
                return;
            case 53:
                accept$53(this, obj);
                return;
            case 54:
                accept$54(this, obj);
                return;
            case 55:
                accept$55(this, obj);
                return;
            case 56:
                accept$56(this, obj);
                return;
            case 57:
                accept$57(this, obj);
                return;
            case 58:
                accept$58(this, obj);
                return;
            case 59:
                accept$59(this, obj);
                return;
            case 60:
                accept$60(this, obj);
                return;
            case 61:
                accept$61(this, obj);
                return;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                return;
            case 63:
                accept$63(this, obj);
                return;
            case 64:
                accept$64(this, obj);
                return;
            case 65:
                accept$65(this, obj);
                return;
            case 66:
                accept$66(this, obj);
                return;
            case 67:
                accept$67(this, obj);
                return;
            case 68:
                accept$68(this, obj);
                return;
            case 69:
                accept$69(this, obj);
                return;
            case 70:
                accept$70(this, obj);
                return;
            case 71:
                accept$71(this, obj);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                accept$72(this, obj);
                return;
            case 73:
                accept$73(this, obj);
                return;
            case 74:
                accept$74(this, obj);
                return;
            case 75:
                accept$75(this, obj);
                return;
            case 76:
                accept$76(this, obj);
                return;
            case 77:
                accept$77(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS62S0200000_13(U7F u7f, int i) {
        this.$t = i;
        this.l0 = null;
        this.l1 = u7f;
    }

    public static final void accept$0(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        int i;
        C28467BFf<C76800UCe> it = (C28467BFf) obj;
        ((InterfaceC65784Pro) afS62S0200000_13.l0).invoke();
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        o.LJIIIIZZ(it, "it");
        c76271TwZ.LJJJJ(it, ((C76234Tvy) afS62S0200000_13.l1).LJLJJI.LIZLLL);
        if (((C76234Tvy) afS62S0200000_13.l1).LJLJJI.LIZLLL) {
            i = 2;
        } else {
            i = 1;
        }
        C76265TwT.LJII(i, "cancel_success");
    }

    public static final void accept$1(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        boolean z;
        GetGuestSettingResponse.ResponseData responseData = ((GetGuestSettingResponse) obj).data;
        if (responseData != null && responseData.rankListShowAction == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has chosen, so run regular logic");
            InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) afS62S0200000_13.l0;
            if (interfaceC74596TPk != null) {
                interfaceC74596TPk.showKickOutDialog();
                return;
            }
            return;
        }
        C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has not chosen, so show leave rank dialog");
        C74738TUw.LJIIIIZZ("leave_with_kicked_out", 0, (DataChannel) afS62S0200000_13.l1, true, 16);
    }

    public static final void accept$10(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ExchangeThresholdInfoData exchangeThresholdInfoData = (ExchangeThresholdInfoData) obj;
        ((AutoExchangeTaxDialogVM) afS62S0200000_13.l0).hv0("wallet_exchange_threshold_info_duration");
        boolean z = exchangeThresholdInfoData.shouldCollectW9;
        if (z) {
            ((AutoExchangeTaxDialogVM) afS62S0200000_13.l0).LJZI = (TaxDialogParams) afS62S0200000_13.l1;
        }
        ((AutoExchangeTaxDialogVM) afS62S0200000_13.l0).sv0(exchangeThresholdInfoData.shouldCollectBillingAddress, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.browser.emote.CropEmoteFragment] */
    public static final void accept$11(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C68322mC c68322mC = (C68322mC) afS62S0200000_13.l0;
            EditImageForSubMethod editImageForSubMethod = (EditImageForSubMethod) afS62S0200000_13.l1;
            ?? cropEmoteFragment = new CropEmoteFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_origin_bitmap", bitmap);
            cropEmoteFragment.setArguments(bundle);
            c68322mC.element = cropEmoteFragment;
            editImageForSubMethod.LJJIFFI(cropEmoteFragment, bitmap);
        }
    }

    public static final void accept$12(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Player player;
        Long valueOf;
        Player player2;
        Player player3;
        Player player4;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) afS62S0200000_13.l0;
        switch (linkLayerMessage.messageType) {
            case 1:
                CreateChannelContent createChannelContent = linkLayerMessage.createChannelContent;
                if (createChannelContent != null && (player4 = createChannelContent.owner) != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == player4.uid) {
                    C32014ChO.LIZJ(((LinkCoreService) afS62S0200000_13.l1).LJFF(284), "onLinkLayerMessage ignore msg, because channel has been created as anchor", null);
                    return;
                }
                U66 LJ = ((LinkCoreService) afS62S0200000_13.l1).LJ(((LinkLayerMessage) afS62S0200000_13.l0).channelId);
                if (LJ == null) {
                    C32014ChO.LIZJ(((LinkCoreService) afS62S0200000_13.l1).LJFF(BuildConfig.VERSION_CODE), "onLinkLayerMessage linker == null ", null);
                    ((LinkCoreService) afS62S0200000_13.l1).LIZLLL((LinkLayerMessage) afS62S0200000_13.l0, null).LJFF((LinkLayerMessage) afS62S0200000_13.l0);
                    return;
                }
                if (!LiveSdkMultiGuestDetroyWhenCreateSetting.INSTANCE.enable()) {
                    return;
                }
                LinkLayerMessage linkLayerMessage2 = (LinkLayerMessage) afS62S0200000_13.l0;
                if (linkLayerMessage2.scene == 2) {
                    return;
                }
                LinkCoreService linkCoreService = (LinkCoreService) afS62S0200000_13.l1;
                linkCoreService.getClass();
                LinkLayerMessage linkLayerMessage3 = new LinkLayerMessage(0, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
                CreateChannelContent createChannelContent2 = linkLayerMessage2.createChannelContent;
                if (createChannelContent2 != null) {
                    player3 = createChannelContent2.owner;
                } else {
                    player3 = null;
                }
                linkLayerMessage3.finishContent = new FinishChannelContent(player3, 0L, 2, null);
                LJ.LJIIL(linkLayerMessage3, new AqS160S0200000_13(linkCoreService, linkLayerMessage2, 38));
                return;
            case 2:
                if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
                    InviteContent inviteContent = ((LinkLayerMessage) afS62S0200000_13.l0).inviteContent;
                    if (inviteContent != null && (player2 = inviteContent.operator) != null) {
                        valueOf = Long.valueOf(player2.uid);
                    }
                    valueOf = null;
                } else {
                    InviteContent inviteContent2 = ((LinkLayerMessage) afS62S0200000_13.l0).inviteContent;
                    if (inviteContent2 != null && (player = inviteContent2.inviter) != null) {
                        valueOf = Long.valueOf(player.uid);
                    }
                    valueOf = null;
                }
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                if (valueOf == null || valueOf.longValue() != currentUserId) {
                    ((LinkCoreService) afS62S0200000_13.l1).LIZLLL((LinkLayerMessage) afS62S0200000_13.l0, null).LJIIIZ((LinkLayerMessage) afS62S0200000_13.l0);
                    return;
                } else {
                    U4R.LIZLLL("LinkCoreService", "onLinkLayerMessage operator is cur user, do not consume the message ");
                    return;
                }
            case 3:
                U66 LJ2 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ2 == null) {
                    return;
                }
                LJ2.LJ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 4:
                U66 LJ3 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ3 == null) {
                    return;
                }
                LJ3.LJIL((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 5:
                U66 LJ4 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ4 == null) {
                    return;
                }
                LJ4.LJIJ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 6:
                U66 LJ5 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ5 == null) {
                    return;
                }
                LJ5.LJIILL((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 7:
                U66 LJ6 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ6 == null) {
                    return;
                }
                LJ6.LJIJJ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 8:
                U66 LJ7 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ7 == null) {
                    return;
                }
                LJ7.LJIJI((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 9:
                U66 LJ8 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ8 == null) {
                    return;
                }
                LJ8.LJIIIIZZ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 10:
                U66 LJ9 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ9 == null) {
                    return;
                }
                LJ9.LJIIL((LinkLayerMessage) afS62S0200000_13.l0, null);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                U66 LJ10 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ10 == null) {
                    return;
                }
                LJ10.LJIIZILJ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 12:
                U66 LJ11 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ11 == null) {
                    return;
                }
                LJ11.LJJ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                U66 LJ12 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ12 == null) {
                    return;
                }
                LJ12.LJIILJJIL((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 14:
                U66 LJ13 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ13 == null) {
                    return;
                }
                LJ13.LIZLLL((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 15:
                U66 LJ14 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ14 == null) {
                    return;
                }
                LJ14.LJIIJ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                U66 LJ15 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ15 == null) {
                    return;
                }
                LJ15.LIZ((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 17:
                U66 LJ16 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ16 == null) {
                    return;
                }
                LJ16.LJIILLIIL((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            case 18:
                U66 LJ17 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkLayerMessage.channelId);
                if (LJ17 == null) {
                    return;
                }
                LJ17.LJIILIIL((LinkLayerMessage) afS62S0200000_13.l0);
                return;
            default:
                return;
        }
    }

    public static final void accept$13(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel failed  = ");
        LIZ.append(th);
        C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(-1, "err_code", jSONObject);
        C05630Jz.LJI(jSONObject, "err_msg", th.toString());
        C58416MwG.LIZLLL.LIZ("cancel_match", jSONObject);
        C75688TnA c75688TnA = (C75688TnA) afS62S0200000_13.l0;
        c75688TnA.LJIIJJI();
        c75688TnA.LJIILLIIL("auto_match_cancel_failed");
        ((InterfaceC65784Pro) afS62S0200000_13.l1).invoke();
        BPP.LJ(C15380j0.LIZLLL(), th);
        C75516TkO.LIZ.LIZIZ(902, "quick linkmic exit match pool failed", th, null);
    }

    public static final void accept$14(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        DataChannel dataChannel;
        Throwable th = (Throwable) obj;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(-1, "err_code", jSONObject);
        C05630Jz.LJI(jSONObject, "err_msg", th.toString());
        C58416MwG c58416MwG = C58416MwG.LIZLLL;
        c58416MwG.LIZ("auto_match", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "end_reason", "auto_match_failed");
        c58416MwG.LIZIZ(2, jSONObject2);
        C75688TnA c75688TnA = new C75688TnA();
        c75688TnA.LJIIJJI();
        c75688TnA.LJIIJ(th);
        c75688TnA.LJIILLIIL("auto_match_failed");
        RandomLinkMicManager randomLinkMicManager = RandomLinkMicManager.LJLIL;
        EnumC75692TnE enumC75692TnE = EnumC75692TnE.IDLE;
        randomLinkMicManager.getClass();
        RandomLinkMicManager.LJIJI(enumC75692TnE);
        DataChannel dataChannel2 = RandomLinkMicManager.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(LinkCrossRoomStateChangeEvent.class, new C32208CkW(1));
        }
        if (th instanceof C29401Dk) {
            switch (((C276516r) th).getErrorCode()) {
                case 4004386:
                    C30868C9o.LIZJ(R.string.nrw);
                    break;
                case 4004387:
                    EnumC75697TnJ enumC75697TnJ = (EnumC75697TnJ) afS62S0200000_13.l0;
                    if (enumC75697TnJ == EnumC75697TnJ.TYPE_AUTO_START_WHEN_END) {
                        C15610jN.LIZJ(new ARunnableS49S0100000_13(enumC75697TnJ, 98), 1200L);
                        break;
                    } else {
                        C30868C9o.LIZJ(R.string.nrv);
                        break;
                    }
            }
        }
        BPP.LJ(C15380j0.LIZLLL(), th);
        C75516TkO.LIZ.LIZIZ(901, "quick link mic auto match failed", th, null);
        RandomLinkMicManager.LIZJ(false);
        RandomLinkMicManager.LJLLILLLL = false;
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) afS62S0200000_13.l1;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(-3, "result error "), th);
        }
        if (((EnumC75697TnJ) afS62S0200000_13.l0) == EnumC75697TnJ.TYPE_PUBLIC_SCREEN && (dataChannel = RandomLinkMicManager.LJLILLLLZI) != null) {
            dataChannel.qv0(OpenCoHostEvent.class, "anchor_host_notice");
        }
    }

    public static final void accept$15(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((TV9) afS62S0200000_13.l0).hl();
        C32014ChO.LIZJ(TV5.LIZIZ(85), "getFanTicketRankList exception,", ((Throwable) obj).getMessage());
    }

    public static final void accept$16(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        int longValue = (int) (((C76732zl) afS62S0200000_13.l0).element - ((Number) obj).longValue());
        ((LiveData) ((MultiGuestGoLivePreviewViewModel) afS62S0200000_13.l1).LJZ.getValue()).setValue(Integer.valueOf(longValue));
        if (longValue == 0) {
            ((MultiGuestGoLivePreviewViewModel) afS62S0200000_13.l1).sv0();
            ((C73318Sq2) ((MultiGuestGoLivePreviewViewModel) afS62S0200000_13.l1).LJLLI.LIZ.getValue()).dispose();
        }
    }

    public static final void accept$17(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((InterfaceC75158Tec) afS62S0200000_13.l0).LJIILL(null, ((ImageModel) afS62S0200000_13.l1).schema);
    }

    public static final void accept$18(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((InterfaceC65784Pro) afS62S0200000_13.l0).invoke();
        C73411SrX c73411SrX = ((C75378TiA) afS62S0200000_13.l1).LIZLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        ((C75378TiA) afS62S0200000_13.l1).LIZLLL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$19(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        long j;
        CohostListResponse.ResponseData responseData;
        List<CohostListUser> list;
        C75726Tnm feedWindowManager;
        CohostListResponse.ResponseData responseData2;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData2 = (CohostListResponse.ResponseData) baseResponse.data) != null) {
            j = responseData2.groupChannelId;
        } else {
            j = 0;
        }
        C76110Tty c76110Tty = (C76110Tty) afS62S0200000_13.l0;
        c76110Tty.LJLLILLLL = j;
        ((C75870Tq6) afS62S0200000_13.l1).LJIIZILJ(c76110Tty.LLD, c76110Tty.LJLJLLL, c76110Tty.LJLLI);
        if (baseResponse != null && (responseData = (CohostListResponse.ResponseData) baseResponse.data) != null && (list = responseData.users) != null) {
            C76110Tty c76110Tty2 = (C76110Tty) afS62S0200000_13.l0;
            for (CohostListUser cohostListUser : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onLinkedListChange, user.linkmicIdStr = ");
                b0.LJ(LIZ, cohostListUser.linkmicIdStr, ", groupChannelId=", j);
                C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
                c76110Tty2.LIZJ(cohostListUser, c76110Tty2.LJZL);
                C75989Ts1 c75989Ts1 = c76110Tty2.LJZL.get(cohostListUser.linkmicIdStr);
                if (c75989Ts1 != null) {
                    c75989Ts1.LJFF = j;
                    String str = cohostListUser.linkmicIdStr;
                    if (str == null || str.length() == 0) {
                        C0NB.LJ("MultiHostFeedHandler", "onLinkedListChange, user.linkmicIdStr isNullOrEmpty ");
                    }
                    C76301Tx3 c76301Tx3 = c76110Tty2.LJLLL;
                    if (c76301Tx3 != null && (feedWindowManager = c76301Tx3.getFeedWindowManager()) != null) {
                        String str2 = cohostListUser.linkmicIdStr;
                        o.LJIIIIZZ(str2, "user.linkmicIdStr");
                        C76116Tu4 LIZ2 = feedWindowManager.LIZ(str2);
                        if (LIZ2 != null) {
                            LIZ2.LJJZZI(c75989Ts1, c76110Tty2.LJZL.size());
                        }
                    }
                }
            }
        }
    }

    public static final void accept$2(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        boolean z;
        GetGuestSettingResponse.ResponseData responseData = ((GetGuestSettingResponse) obj).data;
        if (responseData != null && responseData.rankListShowAction == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has chosen, so run regular logic");
            InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) afS62S0200000_13.l0;
            if (interfaceC74617TQf != null) {
                interfaceC74617TQf.showKickOutDialog();
                return;
            }
            return;
        }
        C0NB.LIZIZ("GiftRankListManager", "guestRankSetting has not chosen, so show leave rank dialog");
        C74738TUw.LJIIIIZZ("leave_with_kicked_out", 0, (DataChannel) afS62S0200000_13.l1, true, 16);
    }

    public static final void accept$20(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkedListChange, handleException = ");
        LIZ.append(th.getMessage());
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C75870Tq6 c75870Tq6 = (C75870Tq6) afS62S0200000_13.l0;
        C76110Tty c76110Tty = (C76110Tty) afS62S0200000_13.l1;
        c75870Tq6.LJIILLIIL(c76110Tty.LLD, c76110Tty.LJLJLLL, c76110Tty.LJLLI, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$21(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        LinkmicListResponse linkmicListResponse;
        List<CohostListUser> list;
        C75726Tnm feedWindowManager;
        BaseResponse baseResponse = (BaseResponse) obj;
        C75870Tq6 c75870Tq6 = (C75870Tq6) afS62S0200000_13.l0;
        C76110Tty c76110Tty = (C76110Tty) afS62S0200000_13.l1;
        c75870Tq6.LJIIZILJ(c76110Tty.LLD, c76110Tty.LJLJLLL, c76110Tty.LJLLI);
        if (baseResponse != null && (linkmicListResponse = (LinkmicListResponse) baseResponse.data) != null && (list = linkmicListResponse.users) != null) {
            C76110Tty c76110Tty2 = (C76110Tty) afS62S0200000_13.l1;
            for (CohostListUser cohostListUser : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onLinkedListChange, user.linkmicIdStr = ");
                JBR.LJIIJ(LIZ, cohostListUser.linkmicIdStr, LIZ, "MultiHostFeedHandler");
                c76110Tty2.LIZJ(cohostListUser, c76110Tty2.LJZL);
                C75989Ts1 c75989Ts1 = c76110Tty2.LJZL.get(cohostListUser.linkmicIdStr);
                if (c75989Ts1 != null) {
                    String str = cohostListUser.linkmicIdStr;
                    if (str == null || str.length() == 0) {
                        C0NB.LJ("MultiHostFeedHandler", "onLinkedListChange, user.linkmicIdStr isNullOrEmpty ");
                    }
                    C76301Tx3 c76301Tx3 = c76110Tty2.LJLLL;
                    if (c76301Tx3 != null && (feedWindowManager = c76301Tx3.getFeedWindowManager()) != null) {
                        String str2 = cohostListUser.linkmicIdStr;
                        o.LJIIIIZZ(str2, "user.linkmicIdStr");
                        C76116Tu4 LIZ2 = feedWindowManager.LIZ(str2);
                        if (LIZ2 != null) {
                            LIZ2.LJJZZI(c75989Ts1, c76110Tty2.LJZL.size());
                        }
                    }
                }
            }
        }
    }

    public static final void accept$22(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkedListChange, handleException = ");
        LIZ.append(th.getMessage());
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C75870Tq6 c75870Tq6 = (C75870Tq6) afS62S0200000_13.l0;
        C76110Tty c76110Tty = (C76110Tty) afS62S0200000_13.l1;
        c75870Tq6.LJIILLIIL(c76110Tty.LLD, c76110Tty.LJLJLLL, c76110Tty.LJLLI, th);
    }

    public static final void accept$23(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        InterfaceC75871Tq7 interfaceC75871Tq7;
        InterfaceC76347Txn LIZ;
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C75870Tq6 c75870Tq6 = (C75870Tq6) afS62S0200000_13.l0;
        InterfaceC76348Txo interfaceC76348Txo = ((C76312TxE) afS62S0200000_13.l1).LIZ;
        if (interfaceC76348Txo != null && (LIZ = interfaceC76348Txo.LIZ()) != null) {
            interfaceC75871Tq7 = LIZ.LIZIZ();
        } else {
            interfaceC75871Tq7 = null;
        }
        c75870Tq6.LJIIL();
        c75870Tq6.LJIIJ(throwable);
        c75870Tq6.LJIILL(interfaceC75871Tq7);
        c75870Tq6.LJIILJJIL("battle_info_failed");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkBattleInfo, failed, throwable = ");
        LIZ2.append(throwable);
        C0NB.LJIIIZ("MatchFeedWidgetPresenter", X1D.LIZIZ(LIZ2));
    }

    public static final void accept$24(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1531), "moderatorKickOut success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJJL);
        ((U7T) afS62S0200000_13.l0).LJJJJJL = null;
    }

    public static final void accept$25(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1535);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorKickOut error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJJL);
        ((U7T) afS62S0200000_13.l0).LJJJJJL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$26(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        RechargeResp rechargeResp;
        long j;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (rechargeResp = (RechargeResp) baseResponse.data) != null) {
            U7T u7t = (U7T) afS62S0200000_13.l0;
            MicPositionData micPositionData = (MicPositionData) afS62S0200000_13.l1;
            if (u7t.LJIJI != null && !u7t.LJJIIZI.containsKey(rechargeResp.myLinkmicId)) {
                u7t.LJJIIZI.put(rechargeResp.myLinkmicId, U9N.COMPENSATION);
                BZI LIZ = C28787BRn.LIZ("livesdk_compensate_lost_im");
                LIZ.LJIJJ("invite", "message_type");
                LIZ.LJIJJ(Long.valueOf(u7t.LJIILIIL), "user_id");
                LIZ.LJIJJ(Long.valueOf(u7t.LJIL), "room_id");
                LIZ.LJIJJ(Long.valueOf(u7t.LJI), "channel_id");
                LIZ.LJIJJ(rechargeResp.myLinkmicId, "link_mic_id");
                LIZ.LJJIIJZLJL();
                LinkLayerMessage linkLayerMessage = new LinkLayerMessage(0, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
                InviteContent inviteContent = new InviteContent(null, null, null, null, null, false, null, null, null, 511, null);
                Player player = new Player(0L, 0L, 3, null);
                player.roomId = u7t.LJIL;
                Room room = u7t.LJ;
                if (room != null) {
                    j = room.getOwnerUserId();
                } else {
                    j = -1;
                }
                player.uid = j;
                inviteContent.inviter = player;
                inviteContent.inviteeLinkMicId = rechargeResp.myLinkmicId;
                inviteContent.inviterLinkMicId = rechargeResp.targetLinkmicId;
                inviteContent.isOwner = false;
                inviteContent.inviteeRTCInfo = rechargeResp.myInfo;
                inviteContent.positionData = micPositionData;
                inviteContent.dsl = u7t.LJIJI;
                linkLayerMessage.inviteContent = inviteContent;
                u7t.LJJIIJ(linkLayerMessage);
            }
        }
    }

    public static final void accept$27(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1303), "kickOut success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJJ);
        ((U7T) afS62S0200000_13.l0).LJJJJJ = null;
    }

    public static final void accept$28(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1307);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOut error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJJ);
        ((U7T) afS62S0200000_13.l0).LJJJJJ = null;
    }

    public static final void accept$29(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1140), "moderatorPermitApply success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJ);
        ((U7T) afS62S0200000_13.l0).LJJJJ = null;
    }

    public static final void accept$3(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        boolean z;
        InterfaceC92693kP interfaceC92693kP;
        Throwable throwable = (Throwable) obj;
        InterfaceC76362Ty2 interfaceC76362Ty2 = (InterfaceC76362Ty2) ((C76302Tx4) afS62S0200000_13.l0).mView;
        if (interfaceC76362Ty2 != null && interfaceC76362Ty2.nC()) {
            z = true;
        } else {
            z = false;
        }
        if (z || C76265TwT.LJIIIZ) {
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            o.LJIIIIZZ(throwable, "throwable");
            c76271TwZ.LJJIL(true, throwable, ((C34K) afS62S0200000_13.l1).element);
            ((C76302Tx4) afS62S0200000_13.l0).LJJJJIZL();
            return;
        }
        if (throwable instanceof C29401Dk) {
            C276516r c276516r = (C276516r) throwable;
            C76265TwT.LJIIJ = c276516r.getErrorCode();
            if (c276516r.getErrorCode() == 0) {
                InterfaceC76362Ty2 interfaceC76362Ty22 = (InterfaceC76362Ty2) ((C76302Tx4) afS62S0200000_13.l0).mView;
                if (interfaceC76362Ty22 != null) {
                    interfaceC76362Ty22.XV(true);
                }
                C76271TwZ.LIZ.LJJIL(true, throwable, ((C34K) afS62S0200000_13.l1).element);
                ((C76302Tx4) afS62S0200000_13.l0).LJJJJIZL();
                return;
            }
            if (LiveTwoMatchLinkOptAbTest.INSTANCE.getValue() && c276516r.getErrorCode() == 4004047) {
                ((C76302Tx4) afS62S0200000_13.l0).LJJJJIZL();
                C76271TwZ.LIZ.LJJIL(false, throwable, ((C34K) afS62S0200000_13.l1).element);
                InterfaceC76362Ty2 interfaceC76362Ty23 = (InterfaceC76362Ty2) ((C76302Tx4) afS62S0200000_13.l0).mView;
                if (interfaceC76362Ty23 == null) {
                    return;
                }
                interfaceC76362Ty23.XV(false);
                return;
            }
        }
        if (LiveTwoMatchLinkOptAbTest.INSTANCE.getValue()) {
            if (((C76302Tx4) afS62S0200000_13.l0).LJLIL == 0) {
                C76271TwZ c76271TwZ2 = C76271TwZ.LIZ;
                o.LJIIIIZZ(throwable, "throwable");
                c76271TwZ2.LJJIL(false, throwable, ((C34K) afS62S0200000_13.l1).element);
                C76302Tx4 c76302Tx4 = (C76302Tx4) afS62S0200000_13.l0;
                InterfaceC92693kP interfaceC92693kP2 = c76302Tx4.LJLILLLLZI;
                if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = c76302Tx4.LJLILLLLZI) != null) {
                    interfaceC92693kP.dispose();
                }
                long j = LiveTwoMatchLinkOptSetting.INSTANCE.getValue().permission_retry_duration;
                c76302Tx4.LJLILLLLZI = ((InterfaceC29856Bng) TMC.LJIL(j, j, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LIZJ(c76302Tx4.autoDisposeWithTransformer())).LIZIZ(new AfS65S0100000_13(c76302Tx4, 16));
                return;
            }
            LiveTwoMatchLinkOptSetting liveTwoMatchLinkOptSetting = LiveTwoMatchLinkOptSetting.INSTANCE;
            int i = liveTwoMatchLinkOptSetting.getValue().permission_retry_count;
            int i2 = ((C76302Tx4) afS62S0200000_13.l0).LJLIL;
            if (1 <= i2 && i2 < i) {
                C76271TwZ c76271TwZ3 = C76271TwZ.LIZ;
                o.LJIIIIZZ(throwable, "throwable");
                c76271TwZ3.LJJIL(false, throwable, ((C34K) afS62S0200000_13.l1).element);
                return;
            } else if (i2 >= liveTwoMatchLinkOptSetting.getValue().permission_retry_count) {
                ((C76302Tx4) afS62S0200000_13.l0).LJJJJIZL();
                ((C34K) afS62S0200000_13.l1).element = true;
            }
        }
        C76271TwZ c76271TwZ4 = C76271TwZ.LIZ;
        o.LJIIIIZZ(throwable, "throwable");
        c76271TwZ4.LJJIL(false, throwable, ((C34K) afS62S0200000_13.l1).element);
        InterfaceC76362Ty2 interfaceC76362Ty24 = (InterfaceC76362Ty2) ((C76302Tx4) afS62S0200000_13.l0).mView;
        if (interfaceC76362Ty24 == null) {
            return;
        }
        interfaceC76362Ty24.XV(false);
    }

    public static final void accept$30(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1144);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorPermitApply apply error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJ);
        ((U7T) afS62S0200000_13.l0).LJJJJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$31(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        RechargeResp rechargeResp;
        GroupChannelAllUser groupChannelAllUser;
        BizRechargeResponse bizRechargeResponse;
        BizRechargeResponse.ResponseData responseData;
        Map<Long, CohostUserInfo> map;
        R2P r2p = (R2P) obj;
        if (r2p != null && (rechargeResp = (RechargeResp) r2p.data) != null && (groupChannelAllUser = rechargeResp.groupUser) != null) {
            U7T u7t = (U7T) afS62S0200000_13.l0;
            List<RTCExtraInfo> list = rechargeResp.groupExtInfo;
            if (list != null) {
                LinkLayerMessage linkLayerMessage = new LinkLayerMessage(0, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
                CommonMessageData commonMessageData = new CommonMessageData();
                commonMessageData.messageId = -1L;
                commonMessageData.createTime = r2p.extra.now;
                RechargeResp rechargeResp2 = (RechargeResp) r2p.data;
                if (rechargeResp2 != null && (bizRechargeResponse = rechargeResp2.cohostRespExtra) != null && (responseData = bizRechargeResponse.data) != null && (map = responseData.userInfos) != null) {
                    CohostContent cohostContent = new CohostContent();
                    ListChangeBizContent listChangeBizContent = new ListChangeBizContent();
                    listChangeBizContent.userInfos = map;
                    cohostContent.listChangeBizContent = listChangeBizContent;
                    linkLayerMessage.bizContent = new BusinessContent(0L, null, cohostContent, 3, null);
                }
                linkLayerMessage.baseMessage = commonMessageData;
                P2PGroupChangeContent p2PGroupChangeContent = new P2PGroupChangeContent();
                p2PGroupChangeContent.groupUser = groupChannelAllUser;
                p2PGroupChangeContent.groupExtInfo = list;
                linkLayerMessage.p2pGroupChangeContent = p2PGroupChangeContent;
                u7t.getClass();
                U7V.LJIILJJIL(new AqS42S0210000_13(u7t, linkLayerMessage, false, 1));
            }
        }
        C15610jN.LIZ().post(new ARunnableS32S0200000_13(r2p, (InterfaceC76768UAy) afS62S0200000_13.l1, 80));
    }

    public static final void accept$32(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(2231), "kickOutAll success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
    }

    public static final void accept$33(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(2227);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOutAll error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
    }

    public static final void accept$34(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        LinkMessage linkMessage = (LinkMessage) afS62S0200000_13.l0;
        int i = linkMessage.messageType;
        if (i != 13) {
            if (i != 14) {
                if (i != 22) {
                    switch (i) {
                        case 2:
                            U66 LJ = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
                            if (LJ == null) {
                                return;
                            }
                            LJ.LJII((LinkMessage) afS62S0200000_13.l0);
                            return;
                        case 3:
                            if (MtCoHostRtcReplyMsgSetting.INSTANCE.isEnable()) {
                                C15610jN.LIZIZ(new ARunnableS32S0200000_13((LinkCoreService) afS62S0200000_13.l1, (LinkMessage) afS62S0200000_13.l0, 81));
                                return;
                            } else if (MultiHostPreJoinFixChannelSetting.INSTANCE.isEnable()) {
                                ((LinkCoreService) afS62S0200000_13.l1).LIZLLL((LinkMessage) afS62S0200000_13.l0, C76718U9a.LJLIL);
                                return;
                            } else {
                                ((LinkCoreService) afS62S0200000_13.l1).LIZLLL((LinkMessage) afS62S0200000_13.l0, null).LJIIIZ((LinkMessage) afS62S0200000_13.l0);
                                return;
                            }
                        case 4:
                            U66 LJ2 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
                            if (LJ2 == null) {
                                return;
                            }
                            LJ2.LJ((LinkMessage) afS62S0200000_13.l0);
                            return;
                        case 5:
                            if ((linkMessage.replyContent.sourceType == EnumC75617Tm1.RANDOM_LINK_MIC_RECOMMEND.getType() && ((LinkMessage) afS62S0200000_13.l0).replyContent.replyStatus == 1) || ((((LinkMessage) afS62S0200000_13.l0).replyContent.sourceType == EnumC75617Tm1.TOPIC_INVITE.getType() && ((LinkMessage) afS62S0200000_13.l0).replyContent.replyStatus == 1) || (((LinkMessage) afS62S0200000_13.l0).replyContent.sourceType == EnumC75617Tm1.TOPIC_PAIR.getType() && ((LinkMessage) afS62S0200000_13.l0).replyContent.replyStatus == 1))) {
                                ((LinkCoreService) afS62S0200000_13.l1).LIZLLL((LinkMessage) afS62S0200000_13.l0, null).LJIJ((LinkMessage) afS62S0200000_13.l0);
                                return;
                            }
                            U66 LJ3 = ((LinkCoreService) afS62S0200000_13.l1).LJ(((LinkMessage) afS62S0200000_13.l0).channelId);
                            if (LJ3 == null) {
                                return;
                            }
                            LJ3.LJIJ((LinkMessage) afS62S0200000_13.l0);
                            return;
                        case 6:
                            ((LinkCoreService) afS62S0200000_13.l1).LIZLLL(linkMessage, null).LJFF((LinkMessage) afS62S0200000_13.l0);
                            return;
                        case 7:
                            U66 LJ4 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
                            if (LJ4 == null) {
                                return;
                            }
                            LJ4.LJIJJLI((LinkMessage) afS62S0200000_13.l0);
                            return;
                        case 8:
                            U66 LJ5 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
                            if (LJ5 == null) {
                                return;
                            }
                            LJ5.LJIL((LinkMessage) afS62S0200000_13.l0);
                            return;
                        case 9:
                            U66 LJ6 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
                            if (LJ6 == null) {
                                return;
                            }
                            LJ6.LJIJI((LinkMessage) afS62S0200000_13.l0);
                            return;
                        default:
                            return;
                    }
                }
                U66 LJ7 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
                if (LJ7 == null) {
                    return;
                }
                LJ7.LJI((LinkMessage) afS62S0200000_13.l0);
                return;
            }
            U66 LJ8 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
            if (LJ8 == null) {
                return;
            }
            LJ8.LJIJJ((LinkMessage) afS62S0200000_13.l0);
            return;
        }
        U66 LJ9 = ((LinkCoreService) afS62S0200000_13.l1).LJ(linkMessage.channelId);
        if (LJ9 == null) {
            return;
        }
        LJ9.LJIILL((LinkMessage) afS62S0200000_13.l0);
    }

    public static final void accept$35(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1099), "replyInvite success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJIJL);
        ((U7T) afS62S0200000_13.l0).LJJIJL = null;
    }

    public static final void accept$36(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1103);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJIJL);
        ((U7T) afS62S0200000_13.l0).LJJIJL = null;
    }

    public static final void accept$37(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(900), "apply success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJIJIL);
        ((U7T) afS62S0200000_13.l0).LJJIJIL = null;
    }

    public static final void accept$38(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(904);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJIJIL);
        ((U7T) afS62S0200000_13.l0).LJJIJIL = null;
    }

    public static final void accept$39(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1519), "joinChannel success");
        C29306Beo.LJJJ(new AqS102S0300000_13((R2P) obj, (R2P<JoinChannelResp>) afS62S0200000_13.l1, (InterfaceC76768UAy<JoinChannelResult>) afS62S0200000_13.l0, (U7T) 13));
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJLI);
        ((U7T) afS62S0200000_13.l0).LJJJJLI = null;
    }

    public static final void accept$4(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        int i;
        Throwable throwable = (Throwable) obj;
        if (throwable instanceof C29401Dk) {
            i = ((C276516r) throwable).getErrorCode();
            C77731Uf1 c77731Uf1 = C77731Uf1.LIZ;
            InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) afS62S0200000_13.l0;
            o.LJIIIIZZ(throwable, "throwable");
            C77731Uf1.LJIIJJI(c77731Uf1, interfaceC77737Uf7, 7, 71, i, "ttlive_create_subscription", (Exception) throwable, null, null, 0, 448);
            ChargeFailLogHelper.LIZ(71, i, ((C29401Dk) throwable).getPrompt(), "");
        } else if (throwable instanceof C64698PaI) {
            C77731Uf1 c77731Uf12 = C77731Uf1.LIZ;
            InterfaceC77737Uf7 interfaceC77737Uf72 = (InterfaceC77737Uf7) afS62S0200000_13.l0;
            o.LJIIIIZZ(throwable, "throwable");
            C77731Uf1.LJIIJJI(c77731Uf12, interfaceC77737Uf72, 7, 71, -312, "ttlive_create_subscription", (Exception) throwable, null, null, 0, 448);
            ChargeFailLogHelper.LIZ(71, -312, throwable.getMessage(), "");
            i = -312;
        } else if (throwable instanceof C0TL) {
            i = ((C0TL) throwable).statusCode;
        } else if (throwable instanceof C64799Pbv) {
            i = ((C64799Pbv) throwable).getStatusCode();
            C77731Uf1 c77731Uf13 = C77731Uf1.LIZ;
            InterfaceC77737Uf7 interfaceC77737Uf73 = (InterfaceC77737Uf7) afS62S0200000_13.l0;
            o.LJIIIIZZ(throwable, "throwable");
            C77731Uf1.LJIIJJI(c77731Uf13, interfaceC77737Uf73, 7, 71, i, "ttlive_create_subscription", (Exception) throwable, null, null, 0, 448);
            ChargeFailLogHelper.LIZ(71, i, throwable.toString(), "");
        } else if (throwable instanceof Exception) {
            C77731Uf1 c77731Uf14 = C77731Uf1.LIZ;
            InterfaceC77737Uf7 interfaceC77737Uf74 = (InterfaceC77737Uf7) afS62S0200000_13.l0;
            o.LJIIIIZZ(throwable, "throwable");
            C77731Uf1.LJIIJJI(c77731Uf14, interfaceC77737Uf74, 7, 71, -313, "ttlive_create_subscription", (Exception) throwable, null, null, 0, 448);
            ChargeFailLogHelper.LIZ(71, -313, throwable.getMessage(), "");
            i = -313;
        } else {
            i = -1;
        }
        C78609UtB.LJJJLL(31, i, "ttlive_create_subscription", throwable.getMessage(), (HashMap) afS62S0200000_13.l1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(throwable.getClass());
        LIZ.append(" : ");
        LIZ.append(throwable);
        C77624UdI.LIZ(i, X1D.LIZIZ(LIZ), (HashMap) afS62S0200000_13.l1);
    }

    public static final void accept$40(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1237), "cancelApply success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJIZL);
        ((U7T) afS62S0200000_13.l0).LJJJJIZL = null;
    }

    public static final void accept$41(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1241);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelApply error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJIZL);
        ((U7T) afS62S0200000_13.l0).LJJJJIZL = null;
    }

    public static final void accept$42(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(795), "leaveChannel success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJIL);
        ((U7T) afS62S0200000_13.l0).LJJIL = null;
    }

    public static final void accept$43(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(799);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leaveChannel error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T u7t = (U7T) afS62S0200000_13.l0;
        u7t.getClass();
        U7V.LJIILJJIL(new AqS163S0100000_13(u7t, 418));
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJIL);
        ((U7T) afS62S0200000_13.l0).LJJIL = null;
    }

    public static final void accept$44(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1164), "cancelInvite success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJI);
        ((U7T) afS62S0200000_13.l0).LJJJJI = null;
    }

    public static final void accept$45(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1168);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJI);
        ((U7T) afS62S0200000_13.l0).LJJJJI = null;
    }

    public static final void accept$46(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1027), "permitApply success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJIL);
        ((U7T) afS62S0200000_13.l0).LJJJIL = null;
    }

    public static final void accept$47(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1031);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply apply error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJIL);
        ((U7T) afS62S0200000_13.l0).LJJJIL = null;
    }

    public static final void accept$48(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(723);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyChannel Destroy Channel error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T u7t = (U7T) afS62S0200000_13.l0;
        u7t.getClass();
        U7V.LJIILJJIL(new AqS163S0100000_13(u7t, 418));
        C76766UAw.LIZJ.LIZJ(new ARunnableS49S0100000_13((U7T) afS62S0200000_13.l0, 172));
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJI);
        ((U7T) afS62S0200000_13.l0).LJJJI = null;
    }

    public static final void accept$49(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(1426), "changeMaxPosition success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJL);
        ((U7T) afS62S0200000_13.l0).LJJJJL = null;
    }

    public static final void accept$5(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((TV9) afS62S0200000_13.l0).hl();
        C32014ChO.LIZJ(TV4.LIZIZ(91), "getFanTicketRankList exception,", ((Throwable) obj).getMessage());
    }

    public static final void accept$50(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        U4R.LIZLLL("Linker", "joinDirect success");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS62S0200000_13.l0);
        U7T.LJJIII(((U7T) afS62S0200000_13.l1).LJJIJLIJ);
        ((U7T) afS62S0200000_13.l1).LJJIJLIJ = null;
    }

    public static final void accept$51(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1430);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeMaxPosition error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l1);
        U7T.LJJIII(((U7T) afS62S0200000_13.l0).LJJJJL);
        ((U7T) afS62S0200000_13.l0).LJJJJL = null;
    }

    public static final void accept$52(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinDirect error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        U4R.LIZIZ("Linker", X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l0);
        U7T.LJJIII(((U7T) afS62S0200000_13.l1).LJJIJLIJ);
        ((U7T) afS62S0200000_13.l1).LJJIJLIJ = null;
    }

    public static final void accept$53(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((HashMap) ((C75863Tpz) afS62S0200000_13.l0).LJ).get((User) afS62S0200000_13.l1);
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        ((HashMap) ((C75863Tpz) afS62S0200000_13.l0).LJ).remove((User) afS62S0200000_13.l1);
    }

    public static final void accept$54(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Boolean it = (Boolean) obj;
        ((ContactUFR) afS62S0200000_13.l0).LJLLI = true;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            ((InterfaceC215138cP) afS62S0200000_13.l1).onNext(new C77150UPq(true, 1, 0, null, 28));
        } else {
            ((InterfaceC215138cP) afS62S0200000_13.l1).onNext(new C77150UPq(false, 1, 0, null, 28));
        }
        ((InterfaceC215138cP) afS62S0200000_13.l1).onComplete();
    }

    public static final void accept$55(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS62S0200000_13.l0);
        ((U7F) afS62S0200000_13.l1).LJIIL.LIZLLL();
        U4R.LIZLLL("CoLinker", "multiCancelSubscriptions.clear");
    }

    public static final void accept$56(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) afS62S0200000_13.l0;
        if (interfaceC76768UAy != null) {
            interfaceC76768UAy.LIZIZ(new MultiCancelResult(null));
        }
        ((U7F) afS62S0200000_13.l1).LJIIL.LIZLLL();
        U4R.LIZLLL("CoLinker", "multiCancelSubscriptions.clear");
    }

    public static final void accept$57(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((UPG) afS62S0200000_13.l0).LJIILLIIL(true, false);
        ((InterfaceC73573Su9) afS62S0200000_13.l1).onNext(new C77150UPq(true, 0, 0, null, 30));
        UPG upg = (UPG) afS62S0200000_13.l0;
        ((InterfaceC58007Mpf) upg.LJLLL.getValue()).LIZJ(new AqS179S0100000_13(upg, 518));
        ((InterfaceC73573Su9) afS62S0200000_13.l1).onComplete();
        C73411SrX c73411SrX = ((UPG) afS62S0200000_13.l0).LJLLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$58(Y.AfS62S0200000_13 r9, java.lang.Object r10) {
        /*
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.Object r2 = r9.l0
            X.Su9 r2 = (X.InterfaceC73573Su9) r2
            X.UPq r3 = new X.UPq
            r4 = 0
            boolean r1 = r10 instanceof X.C38333F2r
            r7 = 0
            if (r1 == 0) goto L77
            r0 = r10
            X.F1q r0 = (X.C38306F1q) r0
            if (r0 == 0) goto L77
            int r6 = r0.getErrorCode()
        L17:
            r8 = 26
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            r2.onNext(r3)
            if (r1 == 0) goto L75
            X.F1q r10 = (X.C38306F1q) r10
        L24:
            r4 = 0
            if (r10 == 0) goto L45
            int r1 = r10.getErrorCode()
            r0 = 3002047(0x2dcebf, float:4.206764E-39)
            r3 = 1
            if (r1 != r0) goto L45
            java.lang.Object r2 = r9.l1
            X.UPG r2 = (X.UPG) r2
            X.UPa r1 = X.C77134UPa.LIZ
            java.lang.String r0 = r2.LJFF()
            r1.LIZ(r0)
            r2.LJIILLIIL(r4, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L4c
        L45:
            java.lang.Object r0 = r9.l1
            X.UPG r0 = (X.UPG) r0
            r0.LJIILLIIL(r4, r4)
        L4c:
            java.lang.Object r3 = r9.l1
            X.UPG r3 = (X.UPG) r3
            X.Ol8 r0 = r3.LJLLL
            java.lang.Object r2 = r0.getValue()
            X.Mpf r2 = (X.InterfaceC58007Mpf) r2
            kotlin.jvm.internal.AqS179S0100000_13 r1 = new kotlin.jvm.internal.AqS179S0100000_13
            r0 = 518(0x206, float:7.26E-43)
            r1.<init>(r3, r0)
            r2.LIZJ(r1)
            java.lang.Object r0 = r9.l0
            X.Su9 r0 = (X.InterfaceC73573Su9) r0
            r0.onComplete()
            java.lang.Object r0 = r9.l1
            X.UPG r0 = (X.UPG) r0
            X.SrX r0 = r0.LJLLJ
            if (r0 == 0) goto L74
            r0.dispose()
        L74:
            return
        L75:
            r10 = r7
            goto L24
        L77:
            r6 = -1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS62S0200000_13.accept$58(Y.AfS62S0200000_13, java.lang.Object):void");
    }

    public static final void accept$59(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C75525TkX c75525TkX = (C75525TkX) afS62S0200000_13.l0;
        if (c75525TkX.LLFFF) {
            c75525TkX.LJIIIZ(R.drawable.cxo);
        } else {
            c75525TkX.LJIIL();
        }
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS62S0200000_13.l1).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$6(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((MultiGuestV3GuestPresenter) afS62S0200000_13.l0).requestingMultiGuestSetting = false;
        GetGuestSettingResponse.ResponseData responseData = ((GetGuestSettingResponse) obj).data;
        if (responseData != null) {
            C74838TYs c74838TYs = (C74838TYs) afS62S0200000_13.l1;
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = (MultiGuestV3GuestPresenter) afS62S0200000_13.l0;
            c74838TYs.LJIJI = true;
            String logTAG = multiGuestV3GuestPresenter.logTAG(1221);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getServerGuestCameraStatus request success, guestCameraStatus = ");
            LIZ.append(responseData.guestCameraStatus);
            LIZ.append(", hadAdjustedVideoOnPreviewPage=");
            LIZ.append(c74838TYs.LJIJ);
            LIZ.append(", isPreviewFragmentShowing=");
            LIZ.append(c74838TYs.LJIJJ);
            C32014ChO.LJFF(logTAG, X1D.LIZIZ(LIZ));
            if (responseData.guestCameraStatus == 1 && !c74838TYs.LJIJ && !c74838TYs.LJIJJ) {
                multiGuestV3GuestPresenter.updateLocalPreviewSettingToVideoByServerResponse();
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C32014ChO.LIZJ(((MultiGuestV3GuestPresenter) afS62S0200000_13.l0).logTAG(1221), "getServerGuestCameraStatus request success, but data is null", null);
    }

    public static final void accept$60(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((InterfaceC75158Tec) afS62S0200000_13.l0).LJIILL(null, ((ImageModel) afS62S0200000_13.l1).schema);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$61(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str = ((LinkmicSettingResult) ((BaseResponse) obj).data).linkMIcAbParams;
        String idStr = ((Room) afS62S0200000_13.l0).getIdStr();
        if (idStr == null) {
            idStr = "";
        }
        U4C.LIZLLL(str, idStr);
        U4C.LIZIZ = true;
        LinkControlWidget linkControlWidget = (LinkControlWidget) ((C44375HbH) afS62S0200000_13.l1).LJLIL;
        linkControlWidget.getClass();
        if (C74726TUk.LIZIZ()) {
            linkControlWidget.LLFFF();
        }
        if (linkControlWidget.LLF() && linkControlWidget.dataChannel.kv0(BattleStateChannel.class) != EnumC76178Tv4.START) {
            C74776TWi.LJIIIIZZ(linkControlWidget.dataChannel);
        }
        C73411SrX c73411SrX = C74726TUk.LIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$62(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        C75878TqE c75878TqE = (C75878TqE) afS62S0200000_13.l0;
        MGetUserLinkmicStatusResponse.ResponseData responseData = null;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        c75878TqE.getClass();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "log_id", str, true);
        c75878TqE.LJIIJJI();
        c75878TqE.LJIILLIIL("fetch_user_linkmic_status_succeed");
        C76007TsJ c76007TsJ = (C76007TsJ) afS62S0200000_13.l1;
        c76007TsJ.LIZLLL = 0;
        c76007TsJ.LIZ = true;
        if (baseResponse != null) {
            responseData = (MGetUserLinkmicStatusResponse.ResponseData) baseResponse.data;
        }
        c76007TsJ.LIZIZ = responseData;
        c76007TsJ.LIZIZ();
        ((C76007TsJ) afS62S0200000_13.l1).LIZJ();
    }

    public static final void accept$63(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable it = (Throwable) obj;
        C75878TqE c75878TqE = (C75878TqE) afS62S0200000_13.l0;
        c75878TqE.LJIIJJI();
        c75878TqE.LJIIJ(it);
        c75878TqE.LJIILLIIL("fetch_user_linkmic_status_failed");
        ((C76007TsJ) afS62S0200000_13.l1).LIZLLL++;
        C75516TkO c75516TkO = C75516TkO.LIZ;
        o.LJIIIIZZ(it, "it");
        c75516TkO.LIZIZ(114, "on refresh multi_cohost status list failed", it, null);
    }

    public static final void accept$64(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((U8Q) afS62S0200000_13.l0).LIZIZ.remove((Region) afS62S0200000_13.l1);
    }

    public static final void accept$65(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable th = ((C77536Ubs) obj).LIZ;
        if (th != null) {
            C77537Ubt c77537Ubt = (C77537Ubt) afS62S0200000_13.l0;
            Context context = (Context) afS62S0200000_13.l1;
            if (th instanceof Exception) {
                int i = 18;
                if (c77537Ubt.LIZIZ != 18) {
                    i = 11;
                }
                UI8 ui8 = new UI8();
                ui8.LJIIJJI = i;
                ui8.LJIIL = c77537Ubt.LIZJ;
                ui8.LIZLLL = (Exception) th;
                ui8.LJIILIIL = false;
                C77607Ud1.LIZ().LIZ(context, "exchange_fail_block", C77492UbA.LIZ(ui8));
                throw th;
            }
            throw th;
        }
    }

    public static final void accept$66(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((InterfaceC65784Pro) afS62S0200000_13.l0).invoke();
        TTW.LJJJJ((TTW) afS62S0200000_13.l1);
    }

    public static final void accept$67(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((InterfaceC65784Pro) afS62S0200000_13.l0).invoke();
        TTW.LJJJJ((TTW) afS62S0200000_13.l1);
    }

    public static final void accept$68(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable it = (Throwable) obj;
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) ((AbstractC75977Trp) afS62S0200000_13.l0).LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null) {
            multiCoHostInviteListContract$AbsView.sc(it);
        }
        AbstractC75977Trp abstractC75977Trp = (AbstractC75977Trp) afS62S0200000_13.l0;
        Room room = ((C75981Trt) afS62S0200000_13.l1).LJLIL;
        o.LJIIIIZZ(it, "it");
        abstractC75977Trp.LJIIZILJ(room, 2, it);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01aa, code lost:
    
        if (r5 == null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo>] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData$TopHostInfo>] */
    /* JADX WARN: Type inference failed for: r5v97, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$69(Y.AfS62S0200000_13 r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS62S0200000_13.accept$69(Y.AfS62S0200000_13, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        C0NB.LIZIZ("LiveShowAudienceViewModel", "getShowList successful");
        ShowContent showContent = ((GetShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            LiveShowAudienceViewModel liveShowAudienceViewModel = (LiveShowAudienceViewModel) afS62S0200000_13.l0;
            InterfaceC76562U3a interfaceC76562U3a = (InterfaceC76562U3a) afS62S0200000_13.l1;
            liveShowAudienceViewModel.kv0(showContent.showingAndReadyList, showContent.finishedList, false);
            if (interfaceC76562U3a != null) {
                interfaceC76562U3a.LIZ(U30.LIZ(showContent.showingAndReadyList, showContent.finishedList, false));
            }
            liveShowAudienceViewModel.lv0(showContent.showConfig);
        }
    }

    public static final void accept$70(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable it = (Throwable) obj;
        ((C76015TsR) afS62S0200000_13.l0).LLF.LIZLLL();
        ((C76015TsR) afS62S0200000_13.l0).LJLLILLLL.clear();
        ((C76015TsR) afS62S0200000_13.l0).LJLLJ.clear();
        C75878TqE c75878TqE = (C75878TqE) afS62S0200000_13.l1;
        c75878TqE.LJIIJJI();
        c75878TqE.LJIIJ(it);
        c75878TqE.LJIILLIIL("fetch_rivals_failed");
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) ((C76015TsR) afS62S0200000_13.l0).LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null) {
            o.LJIIIIZZ(it, "it");
            multiCoHostInviteListContract$AbsView.Al(it);
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(-1, "err_code", jSONObject);
        C05630Jz.LIZ(0, "show_random_link_mic_entrance", jSONObject);
        C05630Jz.LIZ(0, "friend_list_size", jSONObject);
        C05630Jz.LIZ(0, "recommend_list_size", jSONObject);
        C58418MwI c58418MwI = C58418MwI.LIZLLL;
        c58418MwI.LIZ("fetch_rivals_data", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "end_reason", "fetch_data");
        c58418MwI.LIZIZ(2, jSONObject2);
        C75516TkO c75516TkO = C75516TkO.LIZ;
        o.LJIIIIZZ(it, "it");
        c75516TkO.LIZIZ(112, "on fetch multi_cohost rival list failed", it, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo>] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData$TopHostInfo>] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$71(Y.AfS62S0200000_13 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS62S0200000_13.accept$71(Y.AfS62S0200000_13, java.lang.Object):void");
    }

    public static final void accept$72(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Throwable it = (Throwable) obj;
        ((C76016TsS) afS62S0200000_13.l0).LLF.LIZLLL();
        ((C76016TsS) afS62S0200000_13.l0).LJLLILLLL.clear();
        ((C76016TsS) afS62S0200000_13.l0).LJLLJ.clear();
        C75878TqE c75878TqE = (C75878TqE) afS62S0200000_13.l1;
        c75878TqE.LJIIJJI();
        c75878TqE.LJIIJ(it);
        c75878TqE.LJIILLIIL("fetch_rivals_failed");
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) ((C76016TsS) afS62S0200000_13.l0).LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null) {
            o.LJIIIIZZ(it, "it");
            multiCoHostInviteListContract$AbsView.Al(it);
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(-1, "err_code", jSONObject);
        C05630Jz.LIZ(0, "show_random_link_mic_entrance", jSONObject);
        C05630Jz.LIZ(0, "friend_list_size", jSONObject);
        C05630Jz.LIZ(0, "recommend_list_size", jSONObject);
        C58418MwI c58418MwI = C58418MwI.LIZLLL;
        c58418MwI.LIZ("fetch_rivals_data", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "end_reason", "fetch_data");
        c58418MwI.LIZIZ(2, jSONObject2);
        C75516TkO c75516TkO = C75516TkO.LIZ;
        o.LJIIIIZZ(it, "it");
        c75516TkO.LIZIZ(112, "on fetch multi_cohost rival list failed", it, null);
    }

    public static final void accept$73(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        Context context;
        Throwable th = (Throwable) obj;
        TZI tzi = (TZI) afS62S0200000_13.l0;
        User user = (User) afS62S0200000_13.l1;
        tzi.getClass();
        if ((th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 4004269) {
            C30868C9o.LJI(C15380j0.LJIILL(R.string.n8m, C05170If.LIZ(user)));
        } else {
            if (th == null || (context = tzi.LIZ) == null) {
                return;
            }
            BPP.LIZJ(context, th);
        }
    }

    public static final void accept$74(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((C76190TvG) afS62S0200000_13.l0).L((C76032Tsi) afS62S0200000_13.l1, 0);
    }

    public static final void accept$75(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((C76188TvE) afS62S0200000_13.l0).L((C75984Trw) afS62S0200000_13.l1, 0);
    }

    public static final void accept$76(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        ((InterfaceC75158Tec) afS62S0200000_13.l0).LJIILL(null, ((ImageModel) afS62S0200000_13.l1).schema);
    }

    public static final void accept$77(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        User user;
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("realAnchorMuteGuestOp-> exception: exception = ");
        LIZ.append(th.getMessage());
        C0NB.LJIIIZ("anchorMuteGuest/anchor", X1D.LIZIZ(LIZ));
        if ((th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 4004269) {
            Object[] objArr = new Object[1];
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) afS62S0200000_13.l0;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                str = C05170If.LIZ(user);
            } else {
                str = null;
            }
            objArr[0] = str;
            C30868C9o.LJI(C15380j0.LJIILL(R.string.n8m, objArr));
            return;
        }
        C74947TbD.LJIILJJIL((Context) afS62S0200000_13.l1, th);
    }

    public static final void accept$8(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        RandomLinkMicPreviewDialog randomLinkMicPreviewDialog = (RandomLinkMicPreviewDialog) afS62S0200000_13.l0;
        int i = randomLinkMicPreviewDialog.LJLJJI + 1;
        randomLinkMicPreviewDialog.LJLJJI = i;
        ((UHK) afS62S0200000_13.l1).setCurrentItem(i);
    }

    public static final void accept$9(AfS62S0200000_13 afS62S0200000_13, Object obj) {
        String str;
        ExchangeExtra exchangeExtra;
        BaseResponse baseResponse = (BaseResponse) obj;
        WalletExchange walletExchange = WalletExchange.LJLIL;
        int i = ((ExchangeParams) afS62S0200000_13.l0).way;
        walletExchange.getClass();
        HashMap<String, String> LJIIJJI = WalletExchange.LJIIJJI(i, true);
        WalletCenter walletCenter = C32355Cmt.LIZ;
        walletCenter.LJIILIIL(EnumC32353Cmr.EXCHANGE_SUCCESS, LJIIJJI);
        walletCenter.LJIIL();
        InterfaceC77500UbI interfaceC77500UbI = (InterfaceC77500UbI) afS62S0200000_13.l1;
        if (interfaceC77500UbI != null) {
            if (baseResponse != null && (exchangeExtra = (ExchangeExtra) baseResponse.extra) != null) {
                str = exchangeExtra.orderId;
            } else {
                str = null;
            }
            interfaceC77500UbI.LIZ(str);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS62S0200000_13(X.C76110Tty r2, X.C75870Tq6 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 19: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS62S0200000_13.<init>(X.Tty, X.Tq6, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS62S0200000_13(X.UPG r2, X.C73433Srt r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 57: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS62S0200000_13.<init>(X.UPG, X.Srt, int):void");
    }

    public AfS62S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
