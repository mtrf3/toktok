package X;

import Y.AfS26S1100000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStartEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestStopPlayAdEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoCaptureChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorMuteGuestOp;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.TriggerListChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.LiveShowService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multiguestv3.model.AudioPunishEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiGuestEndEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorInProgressEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestCancelReservationMsgReceivedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageP2PParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCP2PMessage;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicSwitchClosedEvent;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestZoomFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkRemoveConnectSuccReportSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidGaussBlurOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorActivityInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorCommonInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptAnchorConnectOverReportSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PunishSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLivePerceptionSetting;
import com.bytedance.android.livesdk.model.message.AudienceCancelContent;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserStateMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicSignalMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message.LinkerAcceptNoticeContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.im.KickOutBizContent;

/* renamed from: X.TYw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74842TYw extends TZ8 implements OnMessageListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final Room LJLJI;
    public final DataChannel LJLJJI;
    public boolean LJLJJL;
    public R24 LJLJJLL;
    public TZK LJLJL;
    public boolean LJLJLJ;
    public Boolean LJLJLLL;
    public final C31657Cbd LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final String LJLLLLLL;
    public C73411SrX LJLZ;
    public volatile boolean LJZ;
    public final HashMap<String, Boolean> LJZI;
    public C73411SrX LJZL;
    public final C73318Sq2 LL;
    public final TZD LLD;
    public final TS6 LLF;
    public final Config.Vendor LLFF;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
    public InterfaceC31805Ce1 userManager;

    static {
        TBT tbt = new TBT(C74842TYw.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C74842TYw.class, "liveShowService", "getLiveShowService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/show/LiveShowService;", 0, c65351Pkp)};
    }

    public final C74838TYs LJJJLIIL() {
        return (C74838TYs) this.LJLLI.getValue();
    }

    public final C76800UCe LJJJLL() {
        List list;
        AbstractC74727TUl LIZ;
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
                list = LIZ.LJIJI();
            } else {
                list = null;
            }
            tzc.tv(null, null, list);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        U8O LJJIIZI;
        C73411SrX c73411SrX;
        Boolean LIZJ = InterfaceC30442Bx8.LLJJIJIIJIL.LIZJ();
        o.LJIIIIZZ(LIZJ, "ANCHOR_SHOULD_OPEN_GUEST_LINKMIC_WHEN_START.value");
        if (LIZJ.booleanValue()) {
            if (!MultiGuestOptAnchorConnectOverReportSetting.INSTANCE.isEnable()) {
                C29556Biq.LIZ().getClass();
                C74830TYk.LJ(C74983Tbn.LIZJ(), null);
            }
            if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                C74979Tbj.LJIILIIL = "live_over";
                C74979Tbj.LJII();
            }
        } else if (!MultiGuestOptAnchorConnectOverReportSetting.INSTANCE.isEnable()) {
            C29556Biq.LIZ().getClass();
            C74830TYk.LJFF(C74983Tbn.LIZJ());
        }
        ((TZ1) this.LJLLJ.getValue()).LIZ();
        TZ6 tz6 = (TZ6) this.LJLLLL.getValue();
        if (tz6 != null) {
            C8E.LJ().zF(tz6.LIZIZ);
            DataChannel dataChannel = tz6.LIZ;
            if (dataChannel != null) {
                dataChannel.rv0(CurrentRealDisplayChannel.class, new OSZ("", 0));
            }
            tz6.LIZ = null;
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LIZLLL(this.LLD);
        }
        InterfaceC31805Ce1 interfaceC31805Ce12 = this.userManager;
        if (interfaceC31805Ce12 != null) {
            interfaceC31805Ce12.release();
        }
        C74896TaO.LJ().clear();
        C74896TaO.LIZLLL().clear();
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        DataChannel dataChannel2 = this.LJLJJI;
        if (dataChannel2 != null) {
            dataChannel2.jv0(this);
        }
        C8E.LJ().X3(this.LLF);
        R24 r24 = this.LJLJJLL;
        if (r24 != null && (c73411SrX = r24.LJIIIIZZ) != null && !c73411SrX.isDisposed()) {
            r24.LJIIIIZZ.dispose();
        }
        this.LJLJJLL = null;
        C88207Yjb.LJIILJJIL();
        C75147TeR.LIZIZ();
        C58582Myw.LIZ().clear();
        this.LL.LIZLLL();
        ((LinkedHashMap) C75147TeR.LJLJJLL).clear();
        C75159Ted.LIZ.getClass();
        C75159Ted.LIZJ();
        C73411SrX c73411SrX2 = this.LJLZ;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        ZoomService zoomService = (ZoomService) this.LJLL.LIZ(this, LLFFF[0]);
        if (zoomService != null) {
            zoomService.destroy();
        }
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LIZJ().remove("ZOOM_SERVICE");
        C0NB.LIZIZ("LiveShowService", "LiveShowService release");
        LiveShowService.LIZJ = true;
        c75559Tl5.LIZJ().remove("LIVE_SHOW_SERVICE");
        ((List) C74856TZk.LIZ.getValue()).clear();
        super.detachView();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable() && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIIZI = LJJZZI.LJJIIZI()) != null) {
            LJJIIZI.setPlayerInfoProvider(null);
        }
    }

    public final MultiGuestDataHolder getMultiGuestDataHolder() {
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("multiGuestDataHolder");
        throw null;
    }

    @Override // X.TZ8
    public final void gg0() {
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            tzc.gg0();
        }
    }

    public final void onEnterBackground() {
        AbstractC74727TUl LIZ;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        C32014ChO.LIZJ(logTAG(1793), "onEnterBackground", null);
        this.LJLJLLL = Boolean.TRUE;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
            LLIIJLIL2.pause();
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            LLIIJLIL.LJJIIZ("MultiGuestV3AnchorPresenter onEnterBackground");
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && C76917UGr.LJJIII(LIZ) > 0 && !B5G.LIZIZ().LJJIJLIJ && C74838TYs.LJ().LJIIIIZZ) {
            C29556Biq.LIZ().getClass();
            C74830TYk.LJI("anchor_pause", 0L, -1L, C74983Tbn.LIZJ(), "liveEnd&turnOff", "");
        }
    }

    public static String LJJJJZI() {
        return C78886Uxe.LJJJJLL(C8E.LJ());
    }

    public final void onAdStop() {
        if (!C74838TYs.LJ().LJJIL) {
            return;
        }
        this.dataChannel.pv0(MultiGuestStopPlayAdEvent.class);
        C30868C9o.LIZJ(R.string.n7_);
        C74838TYs.LJ().LJJIL = false;
        C73411SrX c73411SrX = this.LJLZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C74776TWi.LIZ(this.LJLJJI, getMultiGuestDataHolder().LJI);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(MuteMicSwitchClosedEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(MuteMicChannel.class, Boolean.valueOf(!getMultiGuestDataHolder().LJFF));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAdStop isAudioEnableBeforeAd:");
        LIZ.append(getMultiGuestDataHolder().LJFF);
        LIZ.append(", isVideoEnableBeforeAd:");
        LIZ.append(getMultiGuestDataHolder().LJI);
        C0NB.LIZIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ));
        ((IInteractService) CN1.LIZ(IInteractService.class)).uX("live_video_ads");
    }

    @Override // X.TZ8
    public final InterfaceC31805Ce1 LJJJJJ() {
        return this.userManager;
    }

    public static final String LJJJJZ(LinkPlayerInfo linkPlayerInfo) {
        Room room;
        Boolean bool;
        SubscribeInfo subscribeInfo;
        if (linkPlayerInfo == null || (room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class)) == null) {
            return "";
        }
        User owner = room.getOwner();
        if (owner != null) {
            bool = Boolean.valueOf(owner.isAnchorHasSubQualification());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            return "-1";
        }
        User user = linkPlayerInfo.mUser;
        if (user != null && (subscribeInfo = user.getSubscribeInfo()) != null && subscribeInfo.isSubscribedToCurrentAnchor()) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static void LJJJLZIJ(boolean z) {
        TQU LIZLLL;
        InterfaceC74695TTf LLIIJLIL;
        if (!z) {
            ((IInteractService) CN1.LIZ(IInteractService.class)).rd("live_anchor_mute_mic", C51029K0z.LJJIIZI(new OSZ("MuteMicState", CardStruct.IStatusCode.DEFAULT)));
        } else {
            ((IInteractService) CN1.LIZ(IInteractService.class)).uX("live_anchor_mute_mic");
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            LLIIJLIL.LIZLLL("business_mute_source_audio_mute_punish", !z);
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LIZLLL = R62.LIZLLL()) != null) {
            LIZLLL.LIZIZ(Boolean.valueOf(!z), "Client.muteLocalAudio", "business_mute_source_audio_mute_punish", "just for fake audio capture");
        }
    }

    @Override // X.InterfaceC74852TZg
    public final void LJJIFFI(TZK tzk) {
        this.LJLJL = tzk;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt
    /* renamed from: LJJJJLL, reason: merged with bridge method [inline-methods] */
    public final void attachView(TZC tzc) {
        U8H LJJZZI;
        U8O LJJIIZI;
        super.attachView((C74842TYw) tzc);
        C74838TYs.LJ().LJIIIIZZ = true;
        C74838TYs.LJ().LJJIJIIJIL = false;
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LJII(0);
            interfaceC31805Ce1.LJ(this.LLD);
            interfaceC31805Ce1.init();
        }
        TZ6 tz6 = (TZ6) this.LJLLLL.getValue();
        if (tz6 != null) {
            C8E.LJ().Aq(tz6.LIZIZ);
        }
        TZ1 tz1 = (TZ1) this.LJLLJ.getValue();
        InterfaceC31805Ce1 interfaceC31805Ce12 = tz1.LJLJI;
        if (interfaceC31805Ce12 != null) {
            interfaceC31805Ce12.LJ(tz1);
        }
        tz1.LJLILLLLZI.lv0(tz1.LJLIL, ResetRedDotNumEvent.class, new AqS179S0100000_13(tz1, 494));
        ((C32537Cpp) this.LJLJJI.gv0(C28419BDj.class)).LIZ = Boolean.valueOf(this.LJLJLJ);
        IMessageManager iMessageManager = (IMessageManager) this.LJLJJI.kv0(C29927Bop.class);
        this.mMessageManager = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.mMessageManager;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
            iMessageManager2.addMessageListener(EnumC31509CYf.LINK_MIC_SIGNAL.getIntType(), this);
            if (MultiLivePerceptionSetting.isEnable()) {
                iMessageManager2.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this);
            }
            if (C74726TUk.LIZ()) {
                iMessageManager2.addMessageListener(EnumC31509CYf.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
            }
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.ov0(AnchorMuteGuestOp.class, this, new AqS179S0100000_13(this, 456));
        dataChannelGlobal.pv0(AudioPunishEvent.class, this, new AqS179S0100000_13(this, 457));
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null) {
            dataChannel.mv0(LinkInRoomAnchorInviteGuestEvent.class, this, new AqS179S0100000_13(this, 458));
            dataChannel.mv0(AnchorKickOutGuestByWindowEvent.class, this, new AqS179S0100000_13(this, 459));
            dataChannel.mv0(MultiLiveAnchorMuteVideoEvent.class, this, new AqS179S0100000_13(this, 460));
            dataChannel.mv0(LinkInGuestCountDownFinishChannel.class, this, new AqS179S0100000_13(this, 461));
            dataChannel.mv0(LinkInRoomAnchorKickOutGuestEvent.class, this, new AqS179S0100000_13(this, 462));
            dataChannel.mv0(TriggerListChangeEvent.class, this, new AqS179S0100000_13(this, 451));
            dataChannel.mv0(LinkInRoomAnchorPermitGuestEvent.class, this, new AqS179S0100000_13(this, 452));
            dataChannel.mv0(MultiGuestV3VideoCaptureChangeEvent.class, this, C74872Ta0.LJLIL);
            dataChannel.nv0(MuteMicChannel.class, this, new AqS179S0100000_13(this, 453));
            dataChannel.mv0(MultiGuestAdStartEvent.class, this, new AqS179S0100000_13(this, 454));
            dataChannel.mv0(MultiGuestAdStopEvent.class, this, new AqS179S0100000_13(this, 455));
        }
        C8E.LJ().e3(this.LLF);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIIZI = LJJZZI.LJJIIZI()) != null) {
            LJJIIZI.setPlayerInfoProvider(new C75180Tey(this));
        }
        if (!MultiGuestFetchAnchorActivityInfoSetting.INSTANCE.isEnable()) {
            C0NB.LJIIIZ("MultiGuestV3AnchorPresenter", "MultiGuestFetchAnchorActivityInfoSetting is false, so return, do not request activity info");
        } else if (o.LJ(InterfaceC30442Bx8.R2.LIZJ(), Boolean.FALSE)) {
            C0NB.LJIIIZ("MultiGuestV3AnchorPresenter", "local LIVE_SHOW_ACTIVITY_BANNER_FOR_ANCHOR is false, so return, do not request activity info");
        } else {
            ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).getMultiGuestActivityInfo("give_me_the_mic")).LIZLLL(autoDispose())).LIZJ(new AfS65S0100000_13(this, 139), new AfS65S0100000_13(this, UserLevelGeckoUpdateSetting.DEFAULT));
        }
        if (MultiGuestFetchAnchorCommonInfoSetting.INSTANCE.isEnable()) {
            o.LJIIIIZZ(InterfaceC30442Bx8.n3.LIZJ(), "LIVE_BANNER_TIME.value");
            if (!DateUtils.isToday(r1.longValue())) {
                ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).getMultiGuestActivityInfo("in_room_multi_guest")).LIZLLL(autoDispose())).LIZJ(new AfS65S0100000_13(this, 141), new AfS65S0100000_13(this, 142));
            }
        }
        TVU.LJIJJ(this.LJLIL.getId(), this.LJLIL.getOwnerUserId(), true);
    }

    public final void LJJL(KickOutMessage kickOutMessage) {
        BusinessContent bizContent;
        MultiLiveContent multiLiveContent;
        KickOutBizContent kickOutBizContent;
        User user;
        BusinessContent bizContent2;
        MultiLiveContent multiLiveContent2;
        KickOutBizContent kickOutBizContent2;
        BusinessContent bizContent3;
        MultiLiveContent multiLiveContent3;
        KickOutBizContent kickOutBizContent3;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleReceiveModeratorKickOutMessage, message=");
        LIZ2.append(kickOutMessage);
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ2));
        BizContentWrapper bizContentWrapper = kickOutMessage.getCustomMessage().getBizContentWrapper();
        if (bizContentWrapper != null && (bizContent = bizContentWrapper.getBizContent()) != null && (multiLiveContent = bizContent.multiLiveContent) != null && (kickOutBizContent = multiLiveContent.kickOutBizContent) != null && kickOutBizContent.operatorLinkAdminType == 1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("receive moderator kickOut success message, uid: ");
            LIZ3.append(kickOutMessage.getOwner().getUserId());
            C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ3));
            Long userId = kickOutMessage.getOwner().getUserId();
            User user2 = null;
            if (userId != null) {
                long longValue = userId.longValue();
                InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
                if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LIZLLL(longValue)) != null) {
                    linkPlayerInfo.LIZLLL = true;
                }
                TZK tzk = this.LJLJL;
                if (tzk != null) {
                    tzk.LJIILL(longValue);
                }
            }
            BizContentWrapper bizContentWrapper2 = kickOutMessage.getCustomMessage().getBizContentWrapper();
            if (bizContentWrapper2 != null && (bizContent3 = bizContentWrapper2.getBizContent()) != null && (multiLiveContent3 = bizContent3.multiLiveContent) != null && (kickOutBizContent3 = multiLiveContent3.kickOutBizContent) != null) {
                user = kickOutBizContent3.operatorUserInfo;
            } else {
                user = null;
            }
            BizContentWrapper bizContentWrapper3 = kickOutMessage.getCustomMessage().getBizContentWrapper();
            if (bizContentWrapper3 != null && (bizContent2 = bizContentWrapper3.getBizContent()) != null && (multiLiveContent2 = bizContent2.multiLiveContent) != null && (kickOutBizContent2 = multiLiveContent2.kickOutBizContent) != null) {
                user2 = kickOutBizContent2.kickPlayerUserInfo;
            }
            C28847BTv.LIZIZ(R.string.n3j, "removed_guest", user, user2);
            if (user2 != null) {
                long id = user2.getId();
                long followStatus = user2.getFollowInfo().getFollowStatus();
                EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
                HashMap<Long, String> hashMap = C74830TYk.LIZIZ;
                String remove = hashMap.remove(Long.valueOf(id));
                String remove2 = C74830TYk.LIZJ.remove(Long.valueOf(id));
                if (remove2 != null) {
                    C74824TYe.LJJZZIII(id, followStatus, true, remove2, "anchor_kick_out_guest");
                    if (remove != null && hashMap.size() == 0) {
                        C74830TYk.LJI("anchor_kick_out_guest", id, followStatus, LIZJ, remove, remove2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("return, receive anchor kickOut success message, uid: ");
        LIZ4.append(kickOutMessage.getOwner().getUserId());
        LIZ4.append(',');
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ4));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLI(com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage r25) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74842TYw.LJJLI(com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
    
        if (r1 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIIJ(X.TZQ r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74842TYw.LJJLIIIIJ(X.TZQ):void");
    }

    public final String logTAG(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_MultiGuestV3AnchorPresenter_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_MultiGuestV3AnchorPresenter_", i, LIZ2);
    }

    public final void onFirstRemoteVideoFrameRender(String linkMicId) {
        AbstractC74727TUl LIZ;
        String str;
        int i;
        ShowListUser showListUser;
        U35 LIZ2;
        U35 LIZ3;
        ShowContent content;
        ShowConfig showConfig;
        String str2;
        InterfaceC31336CRo interfaceC31336CRo;
        LinkPlayerInfo linkPlayerInfo;
        AbstractC74727TUl LIZ4;
        ShowContent content2;
        List<ShowListUser> list;
        ShowListUser showListUser2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        AbstractC74727TUl LIZ5;
        AbstractC74727TUl LIZ6;
        AbstractC74727TUl LIZ7;
        U8H LJJZZI;
        InterfaceC74695TTf LLIIJLIL;
        if (this.mView == 0) {
            return;
        }
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("position:LinkIn_Anchor; interactId:");
        LIZ8.append(linkMicId);
        TYQ.LJFF("OnFirstRemoteVideoFrame", X1D.LIZIZ(LIZ8));
        this.LJLLILLLL.getValue().getClass();
        o.LJIIIZ(linkMicId, "linkMicId");
        LinkPlayerInfo linkPlayerInfo2 = null;
        LinkLayerRTCP2PMessage linkLayerRTCP2PMessage = new LinkLayerRTCP2PMessage(null, null, null, null, 15, null);
        linkLayerRTCP2PMessage.generateId();
        linkLayerRTCP2PMessage.setMethod("linkMicSDKFirstVideoFrameReceived");
        LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam = new LinkLayerRTCMessageP2PParam(null, 1, null);
        linkLayerRTCMessageP2PParam.setLinkMicId(linkMicId);
        linkLayerRTCP2PMessage.setParam(linkLayerRTCMessageP2PParam);
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCP2PMessage);
        o.LJIIIIZZ(json, "get().toJson(cmd)");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            LLIIJLIL.sendUserMessage(linkMicId, json);
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LJJZZI = R62.LJJZZI()) != null) {
            LJJZZI.LJJJZ();
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
            long LJJJ = C76917UGr.LJJJ(LIZ, linkMicId);
            if (LJJJ > 0) {
                InterfaceC31805Ce1 interfaceC31805Ce12 = this.userManager;
                if (interfaceC31805Ce12 != null && (LIZ7 = interfaceC31805Ce12.LIZ()) != null) {
                    linkPlayerInfo2 = C76917UGr.LJJIJL(LIZ7, LJJJ);
                }
                InterfaceC31805Ce1 interfaceC31805Ce13 = this.userManager;
                if (interfaceC31805Ce13 == null || (str = interfaceC31805Ce13.LIZIZ(LJJJ)) == null) {
                    str = "";
                }
                InterfaceC31805Ce1 interfaceC31805Ce14 = this.userManager;
                if (interfaceC31805Ce14 != null && (LIZ6 = interfaceC31805Ce14.LIZ()) != null) {
                    C76917UGr.LJJIII(LIZ6);
                }
                EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
                String LJJJLL = C78886Uxe.LJJJLL(C8E.LJ());
                String LJJJJZ = LJJJJZ(linkPlayerInfo2);
                int LJIIJ = C74947TbD.LJIIJ(linkPlayerInfo2);
                InterfaceC31805Ce1 interfaceC31805Ce15 = this.userManager;
                if (interfaceC31805Ce15 != null && (LIZ5 = interfaceC31805Ce15.LIZ()) != null) {
                    C76917UGr.LJJJJIZL(LIZ5, linkMicId);
                }
                C74838TYs LJJJLIIL = LJJJLIIL();
                if (LJJJLIIL != null && (multiLiveAnchorPanelSettings = LJJJLIIL.LJJI) != null) {
                    i = multiLiveAnchorPanelSettings.applierSortSetting;
                } else {
                    i = 0;
                }
                C75017TcL.LJIIZILJ(LJJJ, LIZJ, linkMicId, LJJJLL, LJJJJZ, LJIIJ, str, i);
                C75147TeR.LIZLLL(LJJJ, false);
                C32039Chn c32039Chn = new C32039Chn();
                User owner = this.LJLIL.getOwner();
                if (owner != null) {
                    c32039Chn.LIZ = owner.getId();
                    c32039Chn.LIZIZ = LJJJ;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(this.LJLIL.getId()));
                hashMap.put("anchor_id", String.valueOf(this.LJLIL.getOwner().getId()));
                hashMap.put("channel_id", String.valueOf(this.LJLIL.getId()));
                hashMap.put("connection_type", "audience");
                B5G.LIZIZ().LJJIIZI = System.currentTimeMillis();
                String str3 = B5G.LIZIZ().LJJIFFI;
                if (!TextUtils.isEmpty(str3)) {
                    if (str3 != null) {
                        hashMap.put("request_id", str3);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (!LiveSdkRemoveConnectSuccReportSetting.INSTANCE.isEnable()) {
                    BZI LIZ9 = C28787BRn.LIZ("connection_success");
                    LIZ9.LJJIFFI(hashMap);
                    BZJ bzj = LIZ9.LIZ;
                    if (bzj != null) {
                        bzj.LIZLLL(c32039Chn);
                    }
                    LIZ9.LJJIIJZLJL();
                }
                if (MultiGuestV3PunishSetting.INSTANCE.isEnable() && ((IInteractService) CN1.LIZ(IInteractService.class)).gt(String.valueOf(this.LJLJI.getId()))) {
                    C279017q.LJ("onFirstRemoteVideoFrameRender, mute: ", linkMicId, BYR.LIZ);
                    LJJJJ(linkPlayerInfo2, 3, false);
                }
                U35 LIZ10 = TQA.LIZ();
                if (LIZ10 != null && (content2 = LIZ10.getContent()) != null && (list = content2.showingAndReadyList) != null) {
                    Iterator<ShowListUser> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            showListUser2 = it.next();
                            if (showListUser2.status == 2) {
                                break;
                            }
                        } else {
                            showListUser2 = null;
                            break;
                        }
                    }
                    showListUser = showListUser2;
                } else {
                    showListUser = null;
                }
                if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (LIZ2 = TQA.LIZ()) != null && LIZ2.LJIIJJI() && (LIZ3 = TQA.LIZ()) != null && (content = LIZ3.getContent()) != null && (showConfig = content.showConfig) != null && !showConfig.allowOpenMicFreely) {
                    if (showListUser != null) {
                        str2 = showListUser.linkmicIdStr;
                    } else {
                        str2 = null;
                    }
                    if (!o.LJ(str2, linkMicId) && (interfaceC31336CRo = (InterfaceC31336CRo) this.mView) != null) {
                        Context context = interfaceC31336CRo.getContext();
                        InterfaceC31805Ce1 interfaceC31805Ce16 = this.userManager;
                        if (interfaceC31805Ce16 != null && (LIZ4 = interfaceC31805Ce16.LIZ()) != null) {
                            linkPlayerInfo = C76917UGr.LJJIJIIJIL(LIZ4, linkMicId);
                        } else {
                            linkPlayerInfo = null;
                        }
                        C74947TbD.LJJ(context, linkPlayerInfo, 2, this.LL, TZL.ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append("onFirstRemoteVideoFrameRender return as there wasn't uid match for interactId:");
        LIZ11.append(linkMicId);
        LIZ11.append(' ');
        C0NB.LIZIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ11));
    }

    @Override // X.AbstractC75411Tih
    public final void onLayoutChanged(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        UC0.LJJIZ("[layoutChanged] anchor won't handle layout change because of caller is myself ", "V3Guest");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AudienceCancelContent audienceCancelContent;
        PerceptionDialogInfo perceptionDialogInfo;
        InterfaceC31336CRo interfaceC31336CRo;
        InterfaceC74695TTf LLIIJLIL;
        long j;
        if (iMessage instanceof LinkMessage) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            if (this.mView == 0 || linkMessage.messageType != 24) {
                return;
            }
            C30868C9o.LIZJ(R.string.n96);
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 == null) {
                return;
            }
            LinkerAcceptNoticeContent linkerAcceptNoticeContent = linkMessage.acceptNoticeContentMessage;
            if (linkerAcceptNoticeContent != null) {
                j = linkerAcceptNoticeContent.fromUserId;
            } else {
                j = 0;
            }
            R6.LLLLLLJ(j);
            return;
        }
        if (iMessage instanceof LinkMicSignalMessage) {
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 == null || (LLIIJLIL = R62.LLIIJLIL()) == null) {
                return;
            }
            LLIIJLIL.LJJIIZ("MultiGuestV3AnchorPresenter onMessage");
            return;
        }
        if (iMessage instanceof PerceptionMessage) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            if (!MultiLivePerceptionSetting.isEnable() || (perceptionDialogInfo = perceptionMessage.dialog) == null) {
                return;
            }
            if ((perceptionDialogInfo.scene != 4 && perceptionDialogInfo.scene != 5) || (interfaceC31336CRo = (InterfaceC31336CRo) this.mView) == null || perceptionDialogInfo == null) {
                return;
            }
            Context context = interfaceC31336CRo.getContext();
            o.LJIIIIZZ(context, "context");
            T t = this.mView;
            o.LJII(t, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            C0NP.LIZLLL(perceptionDialogInfo, context, (LifecycleOwner) t, (InterfaceC74834TYo) this.LJLLL.getValue(), new AqS195S0100000_13(this, 61), new AqS195S0100000_13(perceptionMessage, 62), 80);
            return;
        }
        if (!(iMessage instanceof AudienceReserveUserStateMessage) || !C74726TUk.LIZ()) {
            return;
        }
        AudienceReserveUserStateMessage audienceReserveUserStateMessage = (AudienceReserveUserStateMessage) iMessage;
        TZC tzc = (TZC) this.mView;
        if (tzc != null && tzc.BG()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
            if (interfaceC31805Ce1 == null) {
                return;
            }
            TRT.LIZ(interfaceC31805Ce1, "reserve_message", 2, null, null, 12);
            return;
        }
        if (audienceReserveUserStateMessage.type != 2 || (audienceCancelContent = audienceReserveUserStateMessage.audienceCancelContent) == null) {
            return;
        }
        long j2 = audienceCancelContent.fromUserId;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return;
        }
        dataChannel.qv0(MultiGuestCancelReservationMsgReceivedEvent.class, Long.valueOf(j2));
    }

    public final void onUserJoined(String str) {
        Boolean bool;
        List<LinkPlayerInfo> list;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        AbstractC74727TUl LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("position:LinkIn_Anchor; interactId:");
        LIZ2.append(str);
        TYQ.LJFF("OnUserJoined", X1D.LIZIZ(LIZ2));
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            bool = Boolean.valueOf(R6.LLLLZLLIL());
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE) && LinkMicStateSetting.INSTANCE.enableRTCSend()) {
            LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage(null, null, null, null, 0L, null, null, 127, null);
            linkLayerRTCMessage.generateId();
            LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam(null, 0, 0, null, null, true, 31, null);
            ArrayList arrayList = new ArrayList();
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
            if (interfaceC31805Ce1 == null || (LIZ = interfaceC31805Ce1.LIZ()) == null || (list = LIZ.LJJI()) == null) {
                list = C61878OQg.INSTANCE;
            }
            for (LinkPlayerInfo linkPlayerInfo : list) {
                String str2 = linkPlayerInfo.mInteractIdStr;
                o.LJIIIIZZ(str2, "player.interactIdStr");
                Boolean LIZJ = getMultiGuestDataHolder().LIZJ(linkPlayerInfo.mInteractIdStr);
                Boolean bool2 = Boolean.TRUE;
                arrayList.add(new LinkLayerRTCMessageUser(str2, -1, o.LJ(LIZJ, bool2) ? 1 : 0, o.LJ(getMultiGuestDataHolder().LJIIJ(linkPlayerInfo.mInteractIdStr), bool2) ? 1 : 0));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!o.LJ(((LinkLayerRTCMessageUser) next).getLinkMicId(), str)) {
                    arrayList2.add(next);
                }
            }
            linkLayerRTCMessageParam.getUsers().addAll(arrayList2);
            linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
            linkLayerRTCMessage.setMethod("linkMicSDKVideoMute");
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LLIIJLIL2 = R62.LLIIJLIL()) != null) {
                String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
                o.LJIIIIZZ(json, "get().toJson(cmd)");
                LLIIJLIL2.sendRoomMessage(json);
            }
            linkLayerRTCMessage.setMethod("linkMicSDKAudioMute");
            InterfaceC75441TjB R63 = C8E.LJ().R6();
            if (R63 != null && (LLIIJLIL = R63.LLIIJLIL()) != null) {
                String json2 = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
                o.LJIIIIZZ(json2, "get().toJson(cmd)");
                LLIIJLIL.sendRoomMessage(json2);
            }
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, java.lang.Boolean.valueOf(r9)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0169, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7, java.lang.Boolean.valueOf(r8)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0189, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, java.lang.Boolean.valueOf(r9)) == false) goto L25;
     */
    @Override // X.AbstractC75411Tih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUserMediaStateListChanged(X.C74630TQs r20) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74842TYw.onUserMediaStateListChanged(X.TQs):void");
    }

    public static void LJJLIIIJJIZ(C74842TYw c74842TYw, TZQ tzq) {
        int i;
        AbstractC74727TUl LIZ;
        List LJIL;
        c74842TYw.getClass();
        String LIZLLL = C74776TWi.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        C76180Tv6 c76180Tv6 = new C76180Tv6(c74842TYw.LJLJI.getId(), tzq.LIZ.getId(), LIZLLL, tzq.LJ, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), tzq.LIZJ, null, 128);
        long id = tzq.LIZ.getId();
        String str = tzq.LIZIZ;
        o.LJIIIIZZ(str, "event.inviteSource");
        C75147TeR.LIZ(id, str, 0, 12);
        int i2 = -1;
        if (o.LJ(tzq.LIZIZ, "panel_plus") || o.LJ(tzq.LIZIZ, "panel_Golive")) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = c74842TYw.userManager;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJIL = LIZ.LJIL()) != null) {
                i2 = ((Number) C29306Beo.LJ(new AqS179S0100000_13(tzq, 463), LJIL).getSecond()).intValue();
            }
            i = i2 + 1;
        } else {
            i = -1;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null) {
            return;
        }
        R6.LJJLIIIJJIZ(c76180Tv6, new TZ4(c74842TYw, id, tzq, "normal_invite", i));
    }

    @Override // X.InterfaceC74852TZg
    public final boolean LJIJJLI(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        int i;
        String str2;
        Context context;
        if (((IInteractService) CN1.LIZ(IInteractService.class)).Hu0()) {
            return false;
        }
        LiveSdkMultiGuestSelectFixedMicCountSetting liveSdkMultiGuestSelectFixedMicCountSetting = LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE;
        if (liveSdkMultiGuestSelectFixedMicCountSetting.enable() && (multiLiveAnchorPanelSettings = getMultiGuestDataHolder().LJIIJ) != null && multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
            C29556Biq.LIZ().getClass();
            int LJIIIIZZ = C74983Tbn.LJIIIIZZ();
            if (C59994Ngc.LIZJ() == EnumC74778TWk.FLOATING_FIX) {
                if (getMultiGuestDataHolder().LJIILIIL != 4) {
                    str2 = "";
                } else {
                    str2 = C74776TWi.LJ;
                }
                i = 6;
            } else if (C59994Ngc.LIZJ() == EnumC74778TWk.GRID_FIX) {
                int i2 = getMultiGuestDataHolder().LJIILIIL;
                if (i2 != 3) {
                    if (i2 != 5) {
                        str2 = "";
                    } else {
                        str2 = C74776TWi.LIZJ;
                    }
                } else {
                    str2 = C74776TWi.LIZIZ;
                }
                i = 8;
            } else {
                i = 0;
                str2 = "";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkIncreaseGuestMaxCount curGuestCount:");
            C15890jp.LIZIZ(LIZ, getMultiGuestDataHolder().LJIILIIL, ", curSelectedGuestMaxCount:", LJIIIIZZ, ", maxGuestCount:");
            LIZ.append(i);
            LIZ.append(", targetLayoutId:");
            LIZ.append(str2);
            C0NB.LIZIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ));
            if (LJIIIIZZ < i && !TextUtils.isEmpty(str2)) {
                if (liveSdkMultiGuestSelectFixedMicCountSetting.enable()) {
                    InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
                    if (interfaceC31336CRo != null) {
                        context = interfaceC31336CRo.getContext();
                    } else {
                        context = null;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("showIncreaseGuestCountDialog targetLayoutId:");
                    LIZ2.append(str2);
                    C0NB.LIZIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ2));
                    C47071t1 c47071t1 = new C47071t1(context);
                    c47071t1.LJIILLIIL(R.string.nbc);
                    c47071t1.LJFF(R.string.nbb);
                    c47071t1.LJIIIZ(R.string.nb_, new C74831TYl(str));
                    c47071t1.LJIIL(R.string.nba, new TZ7(str2, this, str, interfaceC65784Pro, context));
                    LiveDialog LIZ3 = c47071t1.LIZ();
                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "3564511377609350172")).LIZ) {
                        LIZ3.show();
                    }
                    C74824TYe.LJJIII(C74838TYs.LJ().LJJ, str, "show", "");
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TZ8
    public final void LJJJJL(TZJ source, C78862UxG c78862UxG) {
        InterfaceC74695TTf LLIIJLIL;
        U8H LJJZZI;
        o.LJIIIZ(source, "source");
        if (this.mView == 0) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C74967TbX.class)).LIZ = source;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.pv0(MultiGuestEndEvent.class);
        }
        if (source == TZJ.USER_CLICK) {
            InterfaceC30442Bx8.LLJJIJIIJIL.LIZ(Boolean.FALSE);
        }
        String str = source.value;
        o.LJIIIIZZ(str, "source.value");
        C74838TYs.LJ().LJIIIZ(false);
        C74838TYs.LJ().LJI();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.LJIIIIZZ();
        }
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            tzc.l1();
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            LLIIJLIL.LJIIJ(c78862UxG, str);
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LIZJ();
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("roomId:");
            LIZ.append(this.LJLIL.getId());
            TYQ.LIZLLL("LinkIn_finish", X1D.LIZIZ(LIZ));
            EnumC74778TWk LJIIJ = C74824TYe.LJIIJ();
            InterfaceC75441TjB R63 = C8E.LJ().R6();
            if (R63 != null) {
                R63.LJJLIIIJLLLLLLLZ(new TZS(source.finishReason), new TZ0(source, this, LJIIJ));
            }
        }
        C74838TYs.LJ().LJIIIIZZ = false;
    }

    public final void LJJJJLI(String str, boolean z) {
        int i;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        InterfaceC74695TTf LLIIJLIL;
        LinkPlayerInfo linkPlayerInfo;
        InterfaceC74695TTf LLIIJLIL2;
        User user;
        AbstractC74727TUl LIZ;
        InterfaceC74695TTf LLIIJLIL3;
        getMultiGuestDataHolder().LJIILJJIL(LJJJJZI(), !z);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL3 = R6.LLIIJLIL()) != null) {
            LLIIJLIL3.LJJIIZ("MultiGuestV3AnchorPresenter anchorMuteVideo");
        }
        if (z) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            ((IEffectService) LIZ2).getLiveGameEffectHelper();
            C1XG.LIZJ();
            i = 1;
        } else {
            InterfaceC06390Mx LIZ3 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
            ((IEffectService) LIZ3).getLiveGameEffectHelper();
            C1XG.LIZ();
            i = 2;
        }
        TZC tzc = (TZC) this.mView;
        ImageModel imageModel = null;
        if (tzc != null) {
            interfaceC55235Lm3 = tzc.linkScope();
        } else {
            interfaceC55235Lm3 = null;
        }
        boolean z2 = !changeMediaState(interfaceC55235Lm3, 4, i);
        if (MultiGuestAndroidGaussBlurOptSetting.INSTANCE.isOptGaussBlur()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
                linkPlayerInfo = C76917UGr.LJJIIZ(LIZ, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            } else {
                linkPlayerInfo = null;
            }
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LLIIJLIL2 = R62.LLIIJLIL()) != null) {
                boolean z3 = !z;
                if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                    imageModel = user.getAvatarThumb();
                }
                LLIIJLIL2.LJII(z3, imageModel, str, false, z2);
                return;
            }
            return;
        }
        if (!z2 || !LinkMicStateSetting.INSTANCE.enableRTCSend()) {
            return;
        }
        this.LJLLILLLL.getValue().getClass();
        String LIZ4 = TRZ.LIZ(LJJJJZI(), "linkMicSDKVideoMute", !z);
        InterfaceC75441TjB R63 = C8E.LJ().R6();
        if (R63 == null || (LLIIJLIL = R63.LLIIJLIL()) == null) {
            return;
        }
        LLIIJLIL.sendRoomMessage(LIZ4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x02db, code lost:
    
        if (r11 != r0.longValue()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029b, code lost:
    
        r6 = X.C75147TeR.LJLJJLL;
        r5 = (java.lang.String) ((java.util.LinkedHashMap) r6).get(java.lang.Long.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02aa, code lost:
    
        if (r5 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ac, code lost:
    
        r0 = (X.TZC) r25.mView;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02b0, code lost:
    
        if (r0 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b2, code lost:
    
        r0.v9(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b5, code lost:
    
        r6.remove(java.lang.Long.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bc, code lost:
    
        if (r8 != 1) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02be, code lost:
    
        X.C75017TcL.LJII(r25.LJLIL, r3, "whole_live", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cf, code lost:
    
        X.C75017TcL.LJII(r25.LJLIL, r3, "normal", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0299, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue() == false) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ(com.bytedance.android.livesdk.comp.api.linkcore.model.UnifiedReplyInviteMessage r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74842TYw.LJJJZ(com.bytedance.android.livesdk.comp.api.linkcore.model.UnifiedReplyInviteMessage, boolean):void");
    }

    public final void LJJLIIIJL(String str, String str2) {
        List list;
        AbstractC74727TUl LIZ;
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
                list = LIZ.LJIJI();
            } else {
                list = null;
            }
            tzc.tv(str, str2, list);
        }
    }

    public final void onUserLeft(String str, long j) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo LJJIJIIJIL;
        User user;
        boolean z;
        if (this.mView == 0) {
            return;
        }
        if (!LinkMicMultiGuestZoomFixSetting.INSTANCE.getValue()) {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            String str2 = this.LJLLLLLL;
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("action", "tryShrinkGuest");
            oszArr[1] = new OSZ("step", "entrance");
            C31657Cbd c31657Cbd = this.LJLL;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLFFF;
            if (c31657Cbd.LIZ(this, interfaceC74236TBoArr[0]) == null) {
                z = true;
            } else {
                z = false;
            }
            oszArr[2] = new OSZ("zoomServiceIsNull", Boolean.valueOf(z));
            oszArr[3] = new OSZ("interactId", str);
            LJIILIIL.LJIIIIZZ(str2, C113554cx.LJJLIIIIJ(oszArr));
            ZoomService zoomService = (ZoomService) this.LJLL.LIZ(this, interfaceC74236TBoArr[0]);
            if (zoomService != null && zoomService.LJII() && o.LJ(zoomService.LJFF(), str)) {
                C28733BPl.LJIILIIL().LJIIIIZZ(this.LJLLLLLL, C113554cx.LJJLIIIIJ(new OSZ("action", "tryShrinkGuest"), new OSZ("step", "zoom")));
                C74865TZt.LIZ(zoomService, str, null, true, EnumC74929Tav.FROM_AUTO_SHRINK_GUEST_WHEN_GUEST_LEAVE, 4);
            }
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJIJIIJIL = C76917UGr.LJJIJIIJIL(LIZ, str)) != null && (user = LJJIJIIJIL.mUser) != null && j == 1) {
            long id = user.getId();
            String secUid = LJJIJIIJIL.mUser.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            LJJJJJL(id, secUid, "kickout_with_rtc_user_leaved");
        }
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            tzc.Cg();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("position:LinkIn_Anchor; interactId:");
        LIZ2.append(str);
        TYQ.LJFF("OnUserLeaved", X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74842TYw(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(room, dataChannel, lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJI = room;
        this.LJLJJI = dataChannel;
        this.LJLL = new C31657Cbd("ZOOM_SERVICE");
        this.LJLLI = C221108m2.LIZIZ(TZO.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(TS0.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(new AqS160S0200000_13(lifecycleOwner, this, 33));
        this.LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 402));
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 401));
        this.LJLLLLLL = "Zoom/MultiGuestV3AnchorPresenter";
        this.LJZI = new HashMap<>();
        this.LL = new C73318Sq2();
        this.LLD = new TZD(this);
        this.LLF = new TS6(this);
        this.LLFF = Config.Vendor.BYTE;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LJI(new AnchorBusinessUserManager(this.LJLIL, C78886Uxe.LJJJLIIL(C8E.LJ()), iMessageManager), "MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        c75559Tl5.LJI(new ZoomService(dataChannel), null);
        if (MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            C0NB.LIZIZ("LiveShowService", "LiveShowService create");
            LiveShowService.LIZJ = false;
            c75559Tl5.LJI(new LiveShowService(dataChannel), null);
        }
        c75559Tl5.LIZLLL(this);
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LJI(getMultiGuestDataHolder());
        }
    }

    @Override // X.TZ8
    public final void LJJJJ(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
        String str;
        String str2;
        Context context;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        long j;
        User user;
        long j2;
        User user2;
        User user3;
        String str3;
        String str4;
        long j3;
        User user4;
        long j4;
        User user5;
        long j5;
        User user6;
        long j6;
        User user7;
        long j7;
        User user8;
        long j8;
        User user9;
        User user10;
        Context context2;
        InterfaceC31805Ce1 interfaceC31805Ce12;
        String str5;
        long j9;
        User user11;
        long j10;
        User user12;
        User user13;
        String str6;
        long j11;
        User user14;
        long j12;
        User user15;
        long j13;
        User user16;
        long j14;
        User user17;
        String str7;
        long j15;
        User user18;
        long j16;
        User user19;
        User user20;
        User user21;
        User user22;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchorMuteGuest->userid:");
        String str8 = null;
        if (linkPlayerInfo != null && (user22 = linkPlayerInfo.mUser) != null) {
            str = user22.getIdStr();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            str2 = linkPlayerInfo.mInteractIdStr;
        } else {
            str2 = null;
        }
        C0EH.LIZLLL(LIZ, str2, " , status:", i, " , isOpCamera:");
        FT5.LJ(LIZ, z, LIZ, "anchorMuteGuest/anchor");
        if (this.multiGuestDataHolder != null) {
            if (z) {
                MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
                InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
                if (interfaceC31336CRo != null) {
                    context2 = interfaceC31336CRo.getContext();
                } else {
                    context2 = null;
                }
                if (linkPlayerInfo != null && (user21 = linkPlayerInfo.mUser) != null) {
                    C74947TbD.LJIILLIIL(user21);
                }
                C73318Sq2 mCompositeDisposable = this.LL;
                o.LJIIIZ(mCompositeDisposable, "mCompositeDisposable");
                if (context2 == null) {
                    return;
                }
                Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (obj instanceof InterfaceC31805Ce1) {
                    interfaceC31805Ce12 = (InterfaceC31805Ce1) obj;
                } else {
                    interfaceC31805Ce12 = null;
                }
                if (i == 0) {
                    Object[] objArr = new Object[1];
                    if (linkPlayerInfo != null && (user20 = linkPlayerInfo.mUser) != null) {
                        str7 = C05170If.LIZ(user20);
                    } else {
                        str7 = null;
                    }
                    objArr[0] = str7;
                    C30868C9o.LJI(C15380j0.LJIILL(R.string.n_l, objArr));
                    C74824TYe c74824TYe = C74824TYe.LIZ;
                    if (interfaceC31805Ce12 != null) {
                        if (linkPlayerInfo != null && (user19 = linkPlayerInfo.mUser) != null) {
                            j16 = user19.getId();
                        } else {
                            j16 = 0;
                        }
                        str8 = interfaceC31805Ce12.LIZIZ(j16);
                    }
                    int LIZ2 = C74947TbD.LIZ(linkPlayerInfo, multiGuestDataHolder);
                    String str9 = C74824TYe.LJIILL;
                    if (linkPlayerInfo != null && (user18 = linkPlayerInfo.mUser) != null) {
                        j15 = user18.getId();
                    } else {
                        j15 = 0;
                    }
                    c74824TYe.LJIILLIIL(i, LIZ2, str8, str9, "click", true, j15);
                    return;
                }
                if (C74947TbD.LJFF(linkPlayerInfo, i, true)) {
                    return;
                }
                if (i == 1) {
                    if (!InterfaceC30442Bx8.d2.LIZJ().booleanValue()) {
                        C74947TbD.LJJ(context2, linkPlayerInfo, 3, mCompositeDisposable, null);
                        C74824TYe c74824TYe2 = C74824TYe.LIZ;
                        if (interfaceC31805Ce12 != null) {
                            if (linkPlayerInfo != null && (user17 = linkPlayerInfo.mUser) != null) {
                                j14 = user17.getId();
                            } else {
                                j14 = 0;
                            }
                            str8 = interfaceC31805Ce12.LIZIZ(j14);
                        }
                        int LIZ3 = C74947TbD.LIZ(linkPlayerInfo, multiGuestDataHolder);
                        String str10 = C74824TYe.LJIILL;
                        if (linkPlayerInfo != null && (user16 = linkPlayerInfo.mUser) != null) {
                            j13 = user16.getId();
                        } else {
                            j13 = 0;
                        }
                        c74824TYe2.LJIILLIIL(i, LIZ3, str8, str10, "panel_click", true, j13);
                        return;
                    }
                    if (linkPlayerInfo != null) {
                        user13 = linkPlayerInfo.mUser;
                    } else {
                        user13 = null;
                    }
                    C47071t1 c47071t1 = new C47071t1(context2);
                    Object[] objArr2 = new Object[1];
                    if (user13 != null) {
                        str8 = C05170If.LIZ(user13);
                    }
                    objArr2[0] = str8;
                    c47071t1.LIZJ = C15380j0.LJIILL(R.string.n_p, objArr2);
                    c47071t1.LJII(C15380j0.LJIILJJIL(R.string.n_o));
                    c47071t1.LJIIL(R.string.n_r, new TZ9(i, context2, multiGuestDataHolder, interfaceC31805Ce12, linkPlayerInfo, mCompositeDisposable));
                    c47071t1.LJIIIZ(R.string.n_q, OHZ.LJLJLJ);
                    C74947TbD.LJI(c47071t1.LIZ());
                    C74824TYe c74824TYe3 = C74824TYe.LIZ;
                    if (interfaceC31805Ce12 != null) {
                        if (linkPlayerInfo != null && (user15 = linkPlayerInfo.mUser) != null) {
                            j12 = user15.getId();
                        } else {
                            j12 = 0;
                        }
                        str6 = interfaceC31805Ce12.LIZIZ(j12);
                    } else {
                        str6 = null;
                    }
                    int LIZ4 = C74947TbD.LIZ(linkPlayerInfo, multiGuestDataHolder);
                    String str11 = C74824TYe.LJIILL;
                    if (linkPlayerInfo != null && (user14 = linkPlayerInfo.mUser) != null) {
                        j11 = user14.getId();
                    } else {
                        j11 = 0;
                    }
                    c74824TYe3.LJIILLIIL(i, LIZ4, str6, str11, "show", true, j11);
                    return;
                }
                C74947TbD.LJJ(context2, linkPlayerInfo, 1, mCompositeDisposable, null);
                C74824TYe c74824TYe4 = C74824TYe.LIZ;
                if (interfaceC31805Ce12 != null) {
                    if (linkPlayerInfo != null && (user12 = linkPlayerInfo.mUser) != null) {
                        j10 = user12.getId();
                    } else {
                        j10 = 0;
                    }
                    str5 = interfaceC31805Ce12.LIZIZ(j10);
                } else {
                    str5 = null;
                }
                int LIZ5 = C74947TbD.LIZ(linkPlayerInfo, multiGuestDataHolder);
                String str12 = C74824TYe.LJIILL;
                if (linkPlayerInfo != null && (user11 = linkPlayerInfo.mUser) != null) {
                    j9 = user11.getId();
                } else {
                    j9 = 0;
                }
                c74824TYe4.LJIILLIIL(i, LIZ5, str5, str12, "toast_show", true, j9);
                return;
            }
            MultiGuestDataHolder multiGuestDataHolder2 = getMultiGuestDataHolder();
            InterfaceC31336CRo interfaceC31336CRo2 = (InterfaceC31336CRo) this.mView;
            if (interfaceC31336CRo2 != null) {
                context = interfaceC31336CRo2.getContext();
            } else {
                context = null;
            }
            if (linkPlayerInfo != null && (user10 = linkPlayerInfo.mUser) != null) {
                C74947TbD.LJIILLIIL(user10);
            }
            C73318Sq2 mCompositeDisposable2 = this.LL;
            o.LJIIIZ(mCompositeDisposable2, "mCompositeDisposable");
            if (context == null) {
                return;
            }
            Object obj2 = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (obj2 instanceof InterfaceC31805Ce1) {
                interfaceC31805Ce1 = (InterfaceC31805Ce1) obj2;
            } else {
                interfaceC31805Ce1 = null;
            }
            if (i == 3) {
                String str13 = null;
                C74947TbD.LJJ(context, linkPlayerInfo, 4, mCompositeDisposable2, null);
                C74824TYe c74824TYe5 = C74824TYe.LIZ;
                if (interfaceC31805Ce1 != null) {
                    if (linkPlayerInfo != null && (user9 = linkPlayerInfo.mUser) != null) {
                        j8 = user9.getId();
                    } else {
                        j8 = 0;
                    }
                    str13 = interfaceC31805Ce1.LIZIZ(j8);
                }
                int LIZJ = C74947TbD.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                String str14 = C74824TYe.LJIILL;
                if (linkPlayerInfo != null && (user8 = linkPlayerInfo.mUser) != null) {
                    j7 = user8.getId();
                } else {
                    j7 = 0;
                }
                c74824TYe5.LJIILLIIL(LIZJ, i, str13, str14, "punish", false, j7);
                return;
            }
            if (C74947TbD.LJFF(linkPlayerInfo, i, false)) {
                return;
            }
            if (i == 1) {
                if (!InterfaceC30442Bx8.d2.LIZJ().booleanValue()) {
                    String str15 = null;
                    C74947TbD.LJJ(context, linkPlayerInfo, 2, mCompositeDisposable2, null);
                    C74824TYe c74824TYe6 = C74824TYe.LIZ;
                    if (interfaceC31805Ce1 != null) {
                        if (linkPlayerInfo != null && (user7 = linkPlayerInfo.mUser) != null) {
                            j6 = user7.getId();
                        } else {
                            j6 = 0;
                        }
                        str15 = interfaceC31805Ce1.LIZIZ(j6);
                    }
                    int LIZJ2 = C74947TbD.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                    String str16 = C74824TYe.LJIILL;
                    if (linkPlayerInfo != null && (user6 = linkPlayerInfo.mUser) != null) {
                        j5 = user6.getId();
                    } else {
                        j5 = 0;
                    }
                    c74824TYe6.LJIILLIIL(LIZJ2, i, str15, str16, "panel_click", false, j5);
                    return;
                }
                if (linkPlayerInfo != null) {
                    user3 = linkPlayerInfo.mUser;
                } else {
                    user3 = null;
                }
                C47071t1 c47071t12 = new C47071t1(context);
                Object[] objArr3 = new Object[1];
                if (user3 != null) {
                    str3 = C05170If.LIZ(user3);
                } else {
                    str3 = null;
                }
                objArr3[0] = str3;
                c47071t12.LIZJ = C15380j0.LJIILL(R.string.n_t, objArr3);
                c47071t12.LJII(C15380j0.LJIILJJIL(R.string.n_s));
                c47071t12.LJIIL(R.string.n_r, new TZA(i, context, multiGuestDataHolder2, interfaceC31805Ce1, linkPlayerInfo, mCompositeDisposable2));
                c47071t12.LJIIIZ(R.string.n_q, C73030SlO.LJLJJI);
                C74947TbD.LJI(c47071t12.LIZ());
                C74824TYe c74824TYe7 = C74824TYe.LIZ;
                if (interfaceC31805Ce1 != null) {
                    if (linkPlayerInfo != null && (user5 = linkPlayerInfo.mUser) != null) {
                        j4 = user5.getId();
                    } else {
                        j4 = 0;
                    }
                    str4 = interfaceC31805Ce1.LIZIZ(j4);
                } else {
                    str4 = null;
                }
                int LIZJ3 = C74947TbD.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                String str17 = C74824TYe.LJIILL;
                if (linkPlayerInfo != null && (user4 = linkPlayerInfo.mUser) != null) {
                    j3 = user4.getId();
                } else {
                    j3 = 0;
                }
                c74824TYe7.LJIILLIIL(LIZJ3, i, str4, str17, "show", false, j3);
                return;
            }
            String str18 = null;
            C74947TbD.LJJ(context, linkPlayerInfo, 0, mCompositeDisposable2, null);
            C74824TYe c74824TYe8 = C74824TYe.LIZ;
            if (interfaceC31805Ce1 != null) {
                if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                    j2 = user2.getId();
                } else {
                    j2 = 0;
                }
                str18 = interfaceC31805Ce1.LIZIZ(j2);
            }
            int LIZJ4 = C74947TbD.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
            String str19 = C74824TYe.LJIILL;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            c74824TYe8.LJIILLIIL(LIZJ4, i, str18, str19, "toast_show", false, j);
        }
    }

    @Override // X.TZ8
    public final void LJJJJJL(long j, String str, String source) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo LJJIIZ;
        InterfaceC75441TjB R6;
        o.LJIIIZ(source, "source");
        if (this.mView == 0) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("roomId:");
        LIZ2.append(this.LJLIL.getId());
        LIZ2.append("; userId:");
        LIZ2.append(j);
        LIZ2.append("; secUserId:");
        LIZ2.append(str);
        TYQ.LIZLLL("LinkIn_kickOut", X1D.LIZIZ(LIZ2));
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJIIZ = C76917UGr.LJJIIZ(LIZ, j)) != null && (R6 = C8E.LJ().R6()) != null) {
            long id = this.LJLIL.getId();
            String str2 = LJJIIZ.mInteractIdStr;
            o.LJIIIIZZ(str2, "it.interactId");
            R6.LJJJLL(new C75186Tf4(TZ8.LJJJJI(source), id, j, str2), new TZ3(this, LJJIIZ, j));
        }
    }

    public final void LJJLIIIJILLIZJL(long j, String str, String str2) {
        int i;
        int i2;
        Object obj;
        int i3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        AbstractC74727TUl LIZ;
        if (RandomLinkMicManager.LJIIIIZZ()) {
            RandomLinkMicManager.LJIILIIL();
        }
        this.LJZ = false;
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "permit apply from guest succ");
        TS8.LIZ.LJ(j, str);
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LJIIIZ(j, "guest_apply_anchor");
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = getMultiGuestDataHolder().LJIIJ;
        if (multiLiveAnchorPanelSettings2 != null) {
            i = multiLiveAnchorPanelSettings2.layoutType;
        } else {
            i = -1;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = getMultiGuestDataHolder().LJIIJ;
        if (multiLiveAnchorPanelSettings3 != null) {
            i2 = multiLiveAnchorPanelSettings3.fixMicNumAction;
        } else {
            i2 = -1;
        }
        EnumC74778TWk LIZJ = CL8.LIZJ(i, i2);
        TZK tzk = this.LJLJL;
        if (tzk != null) {
            tzk.LJJIII(j, false);
        }
        String valueOf = String.valueOf(j);
        DataChannel dataChannel = this.dataChannel;
        LinkPlayerInfo linkPlayerInfo = null;
        if (dataChannel != null) {
            obj = dataChannel.kv0(C74966TbW.class);
        } else {
            obj = null;
        }
        boolean LJ = o.LJ(valueOf, obj);
        List LIZIZ = C74896TaO.LIZIZ(j);
        InterfaceC31805Ce1 interfaceC31805Ce12 = this.userManager;
        if (interfaceC31805Ce12 != null && (LIZ = interfaceC31805Ce12.LIZ()) != null) {
            linkPlayerInfo = C76917UGr.LJJIJL(LIZ, j);
        }
        String LJJJLL = C78886Uxe.LJJJLL(C8E.LJ());
        String LJJJJZ = LJJJJZ(linkPlayerInfo);
        Gson gson = C09650Zl.LIZJ;
        String json = GsonProtectorUtils.toJson(gson, C74896TaO.LIZJ(j));
        String json2 = GsonProtectorUtils.toJson(gson, LIZIZ);
        int size = LIZIZ.size();
        int LJIIJ = C74947TbD.LJIIJ(linkPlayerInfo);
        Long l = (Long) C75457TjR.LJFF().get(Long.valueOf(j));
        if (l == null) {
            l = -1L;
        }
        long longValue = l.longValue();
        Integer num = (Integer) C75457TjR.LJI().get(Long.valueOf(j));
        if (num == null) {
            num = -1;
        }
        int intValue = num.intValue();
        C74838TYs LJJJLIIL = LJJJLIIL();
        if (LJJJLIIL != null && (multiLiveAnchorPanelSettings = LJJJLIIL.LJJI) != null) {
            i3 = multiLiveAnchorPanelSettings.applierSortSetting;
        } else {
            i3 = 0;
        }
        C75017TcL.LJI(j, LIZJ, LJ, str, LJJJLL, LJJJJZ, json, json2, size, LJIIJ, longValue, intValue, i3, str2);
        C74830TYk.LIZJ(j, C75147TeR.LIZJ(j), str);
        if (LJ) {
            C74830TYk.LIZLLL.add(Long.valueOf(j));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r10 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ(java.lang.Throwable r10, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError r11, long r12, java.lang.String r14) {
        /*
            r9 = this;
            com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting r2 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE
            boolean r0 = r2.getValue()
            if (r0 == 0) goto L6e
            if (r10 == 0) goto Ld
        La:
            r9.logThrowable(r10)
        Ld:
            r0 = 0
            r9.LJZ = r0
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r9.LJZI
            r0.remove(r14)
            boolean r0 = r10 instanceof X.C29401Dk
            if (r0 == 0) goto L2a
            r0 = r10
            X.16r r0 = (X.C276516r) r0
            int r1 = r0.getErrorCode()
            r0 = 4004026(0x3d18ba, float:5.610835E-39)
            if (r1 == r0) goto L5f
            r0 = 4004029(0x3d18bd, float:5.61084E-39)
            if (r1 == r0) goto L5f
        L2a:
            boolean r0 = r2.getValue()
            if (r0 == 0) goto L55
            T extends X.91o r0 = r9.mView
            X.TZC r0 = (X.TZC) r0
            r1 = 0
            if (r0 == 0) goto L5d
            boolean r0 = r0.isViewValid()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L3f:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto L55
            T extends X.91o r0 = r9.mView
            X.CRo r0 = (X.InterfaceC31336CRo) r0
            if (r0 == 0) goto L4f
            android.content.Context r1 = r0.getContext()
        L4f:
            r0 = 2131847484(0x7f11693c, float:1.9328447E38)
            X.BPP.LIZLLL(r1, r10, r0)
        L55:
            X.TZK r0 = r9.LJLJL
            if (r0 == 0) goto L5c
            r0.LJIIZILJ(r12, r10)
        L5c:
            return
        L5d:
            r0 = r1
            goto L3f
        L5f:
            X.Ce1 r3 = r9.userManager
            if (r3 == 0) goto L2a
            java.lang.String r4 = "permit_failed"
            r5 = 4
            r6 = 0
            r8 = 12
            r7 = r6
            X.TRT.LIZ(r3, r4, r5, r6, r7, r8)
            goto L2a
        L6e:
            java.lang.Throwable r10 = new java.lang.Throwable
            java.lang.String r0 = r11.getErrorMsg()
            r10.<init>(r0)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74842TYw.LJJLIIIJ(java.lang.Throwable, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError, long, java.lang.String):void");
    }

    public final void LJJLIIIJJI(int i, String str, String str2, long j) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        String LIZLLL = C74776TWi.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        BizPermitParams bizPermitParams = new BizPermitParams(1800L);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LLIIIZ(new C75993Ts5(this.LJLIL.getId(), j, LIZLLL, str, i2, bizPermitParams, 64), new TZG(this, i, j, str, str2));
        }
    }

    @Override // X.TZ8, X.InterfaceC74852TZg
    public final void LJJJI(int i, String str, long j, String str2, String str3, boolean z) {
        if (this.mView == 0) {
            return;
        }
        if (i == 2) {
            LJJLIIIJJI(2, str2, str3, j);
            return;
        }
        if (z) {
            if (this.LJZI.containsKey(str2)) {
                TZK tzk = this.LJLJL;
                if (tzk != null) {
                    tzk.LJIIZILJ(j, new Throwable("Current user is permitting"));
                    return;
                }
                return;
            }
            this.LJZI.put(str2, Boolean.TRUE);
            InterfaceC92693kP LJJJJZI = TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(5L).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS26S1100000_13(this, str2, 6));
            this.LJZL = (C73411SrX) LJJJJZI;
            this.LL.LIZ(LJJJJZI);
        }
        this.LJZ = true;
        TS8.LIZ.LJ(j, str2);
        C74838TYs.LJ().LJIIIZ(true);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(MultiGuestAnchorInProgressEvent.class);
        }
        C74838TYs LJJJLIIL = LJJJLIIL();
        if (LJJJLIIL != null) {
            LJJJLIIL.LJII(j);
        }
        if (this.mView != 0) {
            C74838TYs.LJ().LJJIII = true;
            C74838TYs LJ = C74838TYs.LJ();
            System.currentTimeMillis();
            LJ.getClass();
        }
        LJJLIIIJJI(i, str2, str3, j);
    }
}
