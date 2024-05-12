package X;

import Y.AfS26S1100000_13;
import Y.AfS3S0200100_13;
import Y.AfS8S0100100_13;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkAnchorOpenOrClickUserCardEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorMuteGuestOp;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiGuestEndEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorInProgressEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.JoinDirectBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.UnifiedReplyInviteMessage;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMuteTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorMuteViewSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLivePerceptionSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicSignalMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message.LinkerAcceptNoticeContent;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* renamed from: X.TYx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74843TYx extends TZ8 implements OnMessageListener {
    public final Room LJLJI;
    public final DataChannel LJLJJI;
    public Boolean LJLJJL;
    public final HashMap<String, Boolean> LJLJJLL;
    public TZK LJLJL;
    public boolean LJLJLJ;
    public C73411SrX LJLJLLL;
    public final C73318Sq2 LJLL;
    public int LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C74660TRw LJLLLLLL;
    public final TS7 LJLZ;
    public final C62822Ol8 LJZ;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    @Override // X.InterfaceC74852TZg
    public final boolean LJIJJLI(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        return false;
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        C74830TYk.LJ(null, null);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C8E.LJ().X3(this.LJLZ);
        ((TZ1) this.LJLLL.getValue()).LIZ();
        C75147TeR.LIZIZ();
        ((LinkedHashMap) C75147TeR.LJLJJLL).clear();
        C88207Yjb.LJIILJJIL();
        super.detachView();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    public final C76800UCe LJJJJZI() {
        List list;
        AbstractC74727TUl LIZ;
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLILLLLZI;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
                list = LIZ.LJIJI();
            } else {
                list = null;
            }
            tzc.tv(null, null, list);
        }
        return C76800UCe.LIZ;
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
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        this.LJLJJL = Boolean.TRUE;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
            LLIIJLIL2.pause();
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            LLIIJLIL.LJJIIZ("onEnterBackground");
        }
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

    @Override // X.InterfaceC74852TZg
    public final void LJJIFFI(TZK tzk) {
        this.LJLJL = tzk;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Boolean, O] */
    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt
    /* renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(TZC tzc) {
        Boolean bool;
        U8H LJJZZI;
        U8O LJJIIZI;
        TQW tqw;
        Room room;
        IMessageManager iMessageManager;
        super.attachView((C74843TYx) tzc);
        C74838TYs.LJ().LJIIIIZZ = true;
        C74838TYs.LJ().LJJIJIIJIL = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            AnchorBusinessUserManager anchorBusinessUserManager = new AnchorBusinessUserManager(room, C78886Uxe.LJJJLIIL(C8E.LJ()), iMessageManager, (LifecycleOwner) this.mView);
            anchorBusinessUserManager.init();
            C75559Tl5.LIZIZ.LJI(anchorBusinessUserManager, "MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            anchorBusinessUserManager.LJLLILLLL = getMultiGuestDataHolder();
            this.LJLILLLLZI = anchorBusinessUserManager;
            TQW tqw2 = (TQW) dataChannel.kv0(C74971Tbb.class);
            if (tqw2 != null) {
                tqw2.LIZIZ(anchorBusinessUserManager);
            }
            anchorBusinessUserManager.LJ(this.LJLLLLLL);
        }
        IMessageManager iMessageManager2 = (IMessageManager) this.LJLJJI.kv0(C29927Bop.class);
        this.mMessageManager = iMessageManager2;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.mMessageManager;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
            iMessageManager3.addMessageListener(EnumC31509CYf.LINK_MIC_SIGNAL.getIntType(), this);
            if (MultiLivePerceptionSetting.isEnable()) {
                iMessageManager3.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this);
            }
            if (C74726TUk.LIZ()) {
                iMessageManager3.addMessageListener(EnumC31509CYf.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (tqw = (TQW) dataChannel2.kv0(C74971Tbb.class)) != null) {
            tqw.LIZIZ(new N4U(new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap()));
        }
        C8E.LJ().e3(this.LJLZ);
        TZ1 tz1 = (TZ1) this.LJLLL.getValue();
        InterfaceC31805Ce1 interfaceC31805Ce1 = tz1.LJLJI;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LJ(tz1);
        }
        tz1.LJLILLLLZI.lv0(tz1.LJLIL, ResetRedDotNumEvent.class, new AqS179S0100000_13(tz1, 494));
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIIZI = LJJZZI.LJJIIZI()) != null) {
            LJJIIZI.setPlayerInfoProvider(new C75805Tp3(this));
        }
        ((C32537Cpp) this.LJLJJI.gv0(C28419BDj.class)).LIZ = Boolean.FALSE;
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null) {
            bool = Boolean.valueOf(R62.LLLLJI());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LJJJLZIJ(this.LJLJI);
        } else {
            LJJJJLL(this.LJLJI);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, MuteMicChannel.class, new AqS179S0100000_13(this, 608));
            dataChannel3.mv0(LinkInRoomAnchorInviteGuestEvent.class, this, new AqS179S0100000_13(this, 609));
            dataChannel3.mv0(AnchorKickOutGuestByWindowEvent.class, this, new AqS179S0100000_13(this, 610));
            dataChannel3.mv0(LinkInRoomAnchorKickOutGuestEvent.class, this, new AqS179S0100000_13(this, 611));
            dataChannel3.mv0(LinkAnchorOpenOrClickUserCardEvent.class, this, new AqS179S0100000_13(this, 612));
            dataChannel3.mv0(LinkInRoomAnchorPermitGuestEvent.class, this, new AqS179S0100000_13(this, 613));
        }
        DataChannelGlobal.LJLJJI.ov0(AnchorMuteGuestOp.class, this, new AqS179S0100000_13(this, 614));
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.mv0(AnchorKickOutGuestByWindowEvent.class, this, new AqS179S0100000_13(this, 615));
        }
    }

    public final void LJJJJLL(Room room) {
        C0NB.LIZIZ("VoiceChatAnchorPresenter", "changeLayout");
        String LIZIZ = LAV.LIZIZ();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
            bizChangeLayoutParams.displayId = 2;
            R6.LJJIIJZLJL(new C76606U4s(9, LIZIZ, bizChangeLayoutParams), new C74788TWu(this, LIZIZ, room));
        }
    }

    public final void LJJJLZIJ(Room room) {
        Context context;
        C0NB.LIZIZ("VoiceChatAnchorPresenter", "requestUpdateSetting");
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = getMultiGuestDataHolder().LJIIJ;
        long liveId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        if (multiLiveAnchorPanelSettings != null) {
            long LIZIZ = C31012CFc.LIZIZ();
            C74716TUa.LIZIZ((MultiLiveApi) TTL.LIZ(MultiLiveApi.class, "get().getService(MultiLiveApi::class.java)"), room.getId(), C78886Uxe.LJJJLIIL(C8E.LJ()), liveId, multiLiveAnchorPanelSettings.layoutType, multiLiveAnchorPanelSettings.fixMicNumAction, multiLiveAnchorPanelSettings.allowViewerReq, multiLiveAnchorPanelSettings.onlyAllowFollowerReq, null, "", 0, multiLiveAnchorPanelSettings.applierSortSetting, 0L, 2560).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS3S0200100_13(LIZIZ, this, multiLiveAnchorPanelSettings, 45), new AfS8S0100100_13(LIZIZ, this, 26));
            return;
        }
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
        if (interfaceC31336CRo != null) {
            context = interfaceC31336CRo.getContext();
        } else {
            context = null;
        }
        BPP.LIZLLL(context, new Throwable("param illegal."), R.string.sp2);
    }

    public final void LJJLI(boolean z) {
        int i;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        TZM tzm;
        if (!LiveAudioMuteTypeSetting.INSTANCE.isEnableAnchorMuteMic() || !MultiGuestAnchorMuteViewSwitcherSetting.INSTANCE.isEnable()) {
            return;
        }
        String LJJJJLL = C78886Uxe.LJJJJLL(C8E.LJ());
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            tzm.LJJLIIIJJI(i, LJJJJLL);
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
            LLIIJLIL2.LJJIIZ("voice chat anchor switch audio");
        }
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            interfaceC55235Lm3 = tzc.linkScope();
        } else {
            interfaceC55235Lm3 = null;
        }
        if (changeMediaState(interfaceC55235Lm3, 3, i) || !LinkMicStateSetting.INSTANCE.enableRTCSend()) {
            return;
        }
        this.LJZ.getValue().getClass();
        String LIZ = TRZ.LIZ(LJJJJLL, "linkMicSDKAudioMute", z);
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            LLIIJLIL.sendRoomMessage(LIZ);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
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
            LLIIJLIL.LJJIIZ("VoiceChatAnchorPresenter onMessage");
            return;
        }
        if (!(iMessage instanceof PerceptionMessage)) {
            return;
        }
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
        C0NP.LIZLLL(perceptionDialogInfo, context, (LifecycleOwner) t, (InterfaceC74834TYo) this.LJLLILLLL.getValue(), new AqS195S0100000_13(this, 74), new AqS195S0100000_13(perceptionMessage, 75), 80);
    }

    @Override // X.AbstractC75411Tih
    public final void onUserMediaStateListChanged(C74630TQs listState) {
        InterfaceC75441TjB R6;
        InterfaceC74695TTf LLIIJLIL;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        int i;
        o.LJIIIZ(listState, "listState");
        super.onUserMediaStateListChanged(listState);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        TZM tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class);
        if (tzm != null) {
            List<UserState> list = listState.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            for (UserState userState : list) {
                if (true ^ o.LJ(userState.linkMicId, C78886Uxe.LJJJJLL(C8E.LJ()))) {
                    arrayList.add(userState);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UserState userState2 = (UserState) it.next();
                int i2 = listState.LJLIL;
                if (i2 == 2 || i2 == 3) {
                    int LLILZIL = tzm.LLILZIL(userState2.linkMicId);
                    int LL = tzm.LL(userState2.linkMicId);
                    int i3 = userState2.audioMuted;
                    int i4 = userState2.onlineUserState;
                    int i5 = userState2.rtcConnection;
                    tzm.LJJLIIIJJI(i3, userState2.linkMicId);
                    tzm.LLLLZIL(i4, userState2.linkMicId);
                    tzm.LJJLIIJ(i5, userState2.linkMicId);
                    int LLILZIL2 = tzm.LLILZIL(userState2.linkMicId);
                    boolean k = tzm.k(userState2.linkMicId);
                    if (LLILZIL != LLILZIL2) {
                        linkedHashMap.put(userState2.linkMicId, Boolean.valueOf(k));
                    }
                    InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLILLLLZI;
                    if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIJJI(userState2.linkMicId)) != null && LL != i3) {
                        long id = linkPlayerInfo.mUser.getId();
                        String str = linkPlayerInfo.mInteractIdStr;
                        o.LJIIIIZZ(str, "info.interactId");
                        if (i3 == 1) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        C74824TYe.LJLI(0, i, id, str, false);
                    }
                }
            }
            boolean filterStateType = LinkMicStateSetting.INSTANCE.filterStateType();
            if ((listState.LJLJI || filterStateType) && (R6 = C8E.LJ().R6()) != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
                LLIIJLIL.LJJIIZ("onRemoteMediaChanged");
            }
            this.LJLJJI.qv0(MultiLiveUserMediaEvent.class, listState);
        }
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            tzc.tx(listState, linkedHashMap);
        }
    }

    public static void LJJJZ(C74843TYx c74843TYx, TZQ tzq) {
        AbstractC74727TUl LIZ;
        List LJIL;
        c74843TYx.getClass();
        String LJJJJLI = C78886Uxe.LJJJJLI(C8E.LJ());
        if (LJJJJLI.length() == 0) {
            C32014ChO.LIZJ("VoiceChatAnchorPresenter", "layoutId is null", null);
            return;
        }
        C76180Tv6 c76180Tv6 = new C76180Tv6(c74843TYx.LJLJI.getId(), tzq.LIZ.getId(), LJJJJLI, tzq.LJ, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), tzq.LIZJ, null, 128);
        long id = tzq.LIZ.getId();
        String str = tzq.LIZIZ;
        o.LJIIIIZZ(str, "event.inviteSource");
        C75147TeR.LIZ(id, str, 0, 12);
        int i = -1;
        if (o.LJ(tzq.LIZIZ, "panel_plus") || o.LJ(tzq.LIZIZ, "panel_Golive")) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = c74843TYx.LJLILLLLZI;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJIL = LIZ.LJIL()) != null) {
                i = ((Number) C29306Beo.LJ(new AqS179S0100000_13(tzq, 616), LJIL).getSecond()).intValue();
            }
            i++;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null) {
            return;
        }
        R6.LJJLIIIJJIZ(c76180Tv6, new TZ5(c74843TYx, id, tzq, "normal_invite", i));
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
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            LLIIJLIL.LJIIJ(c78862UxG, str);
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LIZJ();
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("roomId:");
            LIZ.append(this.LJLIL.getId());
            TYQ.LIZLLL("LinkIn_finish", X1D.LIZIZ(LIZ));
            EnumC74778TWk LJIIJ = C74824TYe.LJIIJ();
            InterfaceC75441TjB R63 = C8E.LJ().R6();
            if (R63 != null) {
                R63.LJJLIIIJLLLLLLLZ(new TZS(source.finishReason), new TZ2(source, LJIIJ, this));
            }
        }
        C74838TYs.LJ().LJIIIIZZ = false;
    }

    public final void LJJJLIIL(UnifiedReplyInviteMessage unifiedReplyInviteMessage, boolean z) {
        long j;
        long j2;
        long j3;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        BusinessContent bizContent;
        MultiLiveContent multiLiveContent;
        JoinDirectBizContent joinDirectBizContent;
        AbstractC74727TUl LIZ;
        long j4;
        MicPositionInfo micPositionData;
        if (this.mView == 0) {
            return;
        }
        EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
        LinkPlayerInfo linkPlayerInfo = null;
        if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
            C0K2.LIZ("Create engine failed rtc sdk load so failed", new Throwable());
            LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
            return;
        }
        Long userId = unifiedReplyInviteMessage.getInvitee().getUserId();
        long j5 = -1;
        if (userId != null) {
            j = userId.longValue();
        } else {
            j = -1;
        }
        if (unifiedReplyInviteMessage.getReplyStatus() == 1) {
            C74838TYs.LJ().LJIIIZ(true);
            LinkUser invitee = unifiedReplyInviteMessage.getInvitee();
            OnLineMicInfo inviteeFixedMicInfo = unifiedReplyInviteMessage.getInviteeFixedMicInfo();
            C74838TYs LJ = C74838TYs.LJ();
            System.currentTimeMillis();
            LJ.getClass();
            C74838TYs.LJ().LJJIII = true;
            Long userId2 = invitee.getUserId();
            String linkMicId = invitee.getLinkMicId();
            if (userId2 != null) {
                TS8.LIZ.LJ(userId2.longValue(), linkMicId);
            }
            if (inviteeFixedMicInfo != null && (micPositionData = inviteeFixedMicInfo.getMicPositionData()) != null) {
                TS8.LIZ.LJFF(micPositionData.getPosition(), linkMicId);
            }
            List LIZIZ = C74896TaO.LIZIZ(j);
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLILLLLZI;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
                Long userId3 = unifiedReplyInviteMessage.getInvitee().getUserId();
                if (userId3 != null) {
                    j4 = userId3.longValue();
                } else {
                    j4 = -1;
                }
                linkPlayerInfo = C76917UGr.LJJIJL(LIZ, j4);
            }
            Long userId4 = unifiedReplyInviteMessage.getInvitee().getUserId();
            if (userId4 != null) {
                j2 = userId4.longValue();
            } else {
                j2 = -1;
            }
            EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
            BizContentWrapper bizContentWrapper = unifiedReplyInviteMessage.getCustomMessage().getBizContentWrapper();
            long j6 = 0;
            if (bizContentWrapper != null && (bizContent = bizContentWrapper.getBizContent()) != null && (multiLiveContent = bizContent.multiLiveContent) != null && (joinDirectBizContent = multiLiveContent.joinDirectIMContent) != null) {
                j3 = joinDirectBizContent.replyImMsgId;
            } else {
                j3 = 0;
            }
            String linkMicId2 = unifiedReplyInviteMessage.getInvitee().getLinkMicId();
            String LJJJLL = C78886Uxe.LJJJLL(C8E.LJ());
            String LJJJJZ = LJJJJZ(linkPlayerInfo);
            Gson gson = C09650Zl.LIZJ;
            String json = GsonProtectorUtils.toJson(gson, C74896TaO.LIZJ(j));
            String json2 = GsonProtectorUtils.toJson(gson, LIZIZ);
            int size = LIZIZ.size();
            int LJIIJ = C74947TbD.LJIIJ(linkPlayerInfo);
            C74838TYs c74838TYs = (C74838TYs) this.LJLLJ.getValue();
            if (c74838TYs != null && (multiLiveAnchorPanelSettings = c74838TYs.LJJI) != null) {
                i = multiLiveAnchorPanelSettings.applierSortSetting;
            } else {
                i = 0;
            }
            C75017TcL.LJIIIZ(j2, LIZJ, j3, linkMicId2, LJJJLL, LJJJJZ, json, json2, size, LJIIJ, i);
            Long userId5 = unifiedReplyInviteMessage.getInvitee().getUserId();
            if (userId5 != null) {
                C75147TeR.LJLJJLL.remove(Long.valueOf(userId5.longValue()));
            }
            InterfaceC31805Ce1 interfaceC31805Ce12 = this.LJLILLLLZI;
            if (interfaceC31805Ce12 != null) {
                Long userId6 = unifiedReplyInviteMessage.getInvitee().getUserId();
                if (userId6 != null) {
                    j6 = userId6.longValue();
                }
                interfaceC31805Ce12.LJIIIZ(j6, "anchor_invite_guest");
            }
        } else {
            Long userId7 = unifiedReplyInviteMessage.getInvitee().getUserId();
            if (userId7 != null) {
                long longValue = userId7.longValue();
                C75147TeR.LIZLLL(longValue, false);
                TZK tzk = this.LJLJL;
                if (tzk != null) {
                    tzk.LJIL(longValue);
                }
            }
        }
        C74838TYs c74838TYs2 = (C74838TYs) this.LJLLJ.getValue();
        Long userId8 = unifiedReplyInviteMessage.getInvitee().getUserId();
        if (userId8 != null) {
            j5 = userId8.longValue();
        }
        c74838TYs2.LJII(j5);
    }

    public final void LJJL(String str, String str2) {
        List list;
        AbstractC74727TUl LIZ;
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLILLLLZI;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
                list = LIZ.LJIJI();
            } else {
                list = null;
            }
            tzc.tv(str, str2, list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74843TYx(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(room, dataChannel, lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJI = room;
        this.LJLJJI = dataChannel;
        this.LJLJJLL = new HashMap<>();
        this.LJLL = new C73318Sq2();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 555));
        this.LJLLJ = C221108m2.LIZIZ(TZP.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(new AqS160S0200000_13(lifecycleOwner, this, 97));
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 556));
        this.LJLLLLLL = new C74660TRw(this);
        this.LJLZ = new TS7(this);
        this.LJZ = C221108m2.LIZIZ(C74662TRy.LJLIL);
        C75559Tl5.LIZIZ.LIZLLL(this);
    }

    @Override // X.TZ8
    public final void LJJJJ(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
        Long l;
        User user;
        User user2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchorMuteGuest ");
        String str = null;
        if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
            l = Long.valueOf(user2.getId());
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(' ');
        LIZ.append(i);
        C0NB.LIZIZ("VoiceChatAnchorPresenter", X1D.LIZIZ(LIZ));
        if (linkPlayerInfo == null || (user = linkPlayerInfo.mUser) == null) {
            return;
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLILLLLZI;
        if (interfaceC31805Ce1 != null) {
            str = interfaceC31805Ce1.LIZIZ(user.getId());
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            TZI tzi = (TZI) this.LJLLLL.getValue();
            tzi.getClass();
            tzi.LIZ(0, user);
            C74824TYe.LIZ.LJIILLIIL(0, 2, str, C74824TYe.LJIILL, "toast_show", false, user.getId());
            return;
        }
        TZI tzi2 = (TZI) this.LJLLLL.getValue();
        tzi2.getClass();
        if (!InterfaceC30442Bx8.d2.LIZJ().booleanValue()) {
            tzi2.LIZ(2, user);
            C74824TYe.LIZ.LJIILLIIL(0, 1, str, C74824TYe.LJIILL, "panel_click", false, user.getId());
            return;
        }
        C47071t1 c47071t1 = new C47071t1(tzi2.LIZ);
        c47071t1.LIZJ = C15380j0.LJIILL(R.string.n_t, C05170If.LIZ(user));
        c47071t1.LJII(C15380j0.LJIILJJIL(R.string.n_s));
        c47071t1.LJIIL(R.string.n_r, new TZH(tzi2, user, str));
        c47071t1.LJIIIZ(R.string.n_q, C78605Ut7.LJLJI);
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-7755569645442626656")).LIZ) {
            LIZ2.show();
        }
        C74824TYe.LIZ.LJIILLIIL(0, 1, str, C74824TYe.LJIILL, "show", false, user.getId());
    }

    @Override // X.TZ8
    public final void LJJJJJL(long j, String str, String source) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        long j2;
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
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLILLLLZI;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIL(j)) != null) {
            User user = linkPlayerInfo.mUser;
            if (user != null) {
                j2 = user.getFollowInfo().getFollowStatus();
            } else {
                j2 = -1;
            }
            C29556Biq.LIZ().getClass();
            C74830TYk.LIZIZ(j, j2, C74983Tbn.LIZJ());
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null) {
                long id = this.LJLIL.getId();
                String str2 = linkPlayerInfo.mInteractIdStr;
                o.LJIIIIZZ(str2, "it.interactId");
                R6.LJJJLL(new C75186Tf4(TZ8.LJJJJI(source), id, j, str2), new TZB(this, linkPlayerInfo, j));
            }
        }
    }

    public final void LJJJLL(int i, long j, String str) {
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
        String LIZIZ = LAV.LIZIZ();
        BizPermitParams bizPermitParams = new BizPermitParams(1800L);
        C0NB.LIZIZ("VoiceChatAnchorPresenter", "permit apply");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LLIIIZ(new C75993Ts5(this.LJLIL.getId(), j, LIZIZ, str, i2, bizPermitParams, 64), new C74844TYy(this, i, j, str));
        }
    }

    @Override // X.TZ8, X.InterfaceC74852TZg
    public final void LJJJI(int i, String str, long j, String str2, String str3, boolean z) {
        if (this.mView == 0) {
            return;
        }
        if (i == 2) {
            LJJJLL(2, j, str2);
            return;
        }
        if (z) {
            if (this.LJLJJLL.containsKey(str2)) {
                TZK tzk = this.LJLJL;
                if (tzk != null) {
                    tzk.LJIIZILJ(j, new Throwable("Current user is permitting"));
                    return;
                }
                return;
            }
            this.LJLJJLL.put(str2, Boolean.TRUE);
            InterfaceC92693kP LJJJJZI = TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(5L).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS26S1100000_13(this, str2, 15));
            this.LJLJLLL = (C73411SrX) LJJJJZI;
            this.LJLL.LIZ(LJJJJZI);
        }
        TS8.LIZ.LJ(j, str2);
        C74838TYs.LJ().LJIIIZ(true);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(MultiGuestAnchorInProgressEvent.class);
        }
        C74838TYs c74838TYs = (C74838TYs) this.LJLLJ.getValue();
        if (c74838TYs != null) {
            c74838TYs.LJII(j);
        }
        if (this.mView != 0) {
            C74838TYs.LJ().LJJIII = true;
            C74838TYs LJ = C74838TYs.LJ();
            System.currentTimeMillis();
            LJ.getClass();
        }
        LJJJLL(i, j, str2);
    }

    @Override // X.TZ8
    public final C75100Tdg LJJJJIZL(DataChannel dataChannel, InterfaceC75119Tdz interfaceC75119Tdz, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i, InterfaceC88472Yns<? super Long, Long> interfaceC88472Yns, InterfaceC88472Yns<? super Long, Integer> interfaceC88472Yns2, String str, C75066Td8 c75066Td8) {
        return new C75101Tdh(dataChannel, interfaceC75119Tdz, multiGuestDataHolder, linkControlDataHolder, i);
    }
}
