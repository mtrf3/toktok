package com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter;

import X.AbstractC31497CXt;
import X.AbstractC73638SvC;
import X.B5G;
import X.B83;
import X.BJM;
import X.BU9;
import X.BY3;
import X.BY9;
import X.BYP;
import X.BYQ;
import X.BYR;
import X.BZI;
import X.BZJ;
import X.C00F;
import X.C025908h;
import X.C03880Dg;
import X.C05170If;
import X.C05630Jz;
import X.C09650Zl;
import X.C0EM;
import X.C0K2;
import X.C0NB;
import X.C0NP;
import X.C0NQ;
import X.C15380j0;
import X.C15N;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C24130x7;
import X.C277116x;
import X.C28467BFf;
import X.C28787BRn;
import X.C28906BWc;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29494Bhq;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29927Bop;
import X.C30725C4b;
import X.C30864C9k;
import X.C30868C9o;
import X.C31026CFq;
import X.C31811Ce7;
import X.C32039Chn;
import X.C32777Cth;
import X.C34K;
import X.C38350F3i;
import X.C38951fv;
import X.C45243HpH;
import X.C47071t1;
import X.C47261Igj;
import X.C5H3;
import X.C60903NvH;
import X.C65232Piu;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C74622TQk;
import X.C74629TQr;
import X.C74666TSc;
import X.C74667TSd;
import X.C74668TSe;
import X.C74671TSh;
import X.C74672TSi;
import X.C74673TSj;
import X.C74674TSk;
import X.C74675TSl;
import X.C74676TSm;
import X.C74677TSn;
import X.C74678TSo;
import X.C74680TSq;
import X.C74681TSr;
import X.C74682TSs;
import X.C74683TSt;
import X.C74684TSu;
import X.C74696TTg;
import X.C74740TUy;
import X.C74746TVe;
import X.C74748TVg;
import X.C74764TVw;
import X.C74768TWa;
import X.C74837TYr;
import X.C74838TYs;
import X.C75187Tf5;
import X.C75516TkO;
import X.C75745To5;
import X.C76002TsE;
import X.C76012TsO;
import X.C76800UCe;
import X.C77156UPw;
import X.C78857UxB;
import X.C78866UxK;
import X.C78895Uxn;
import X.C9O;
import X.C9W;
import X.CN1;
import X.EnumC31509CYf;
import X.EnumC38440F6u;
import X.EnumC74704TTo;
import X.EnumC74778TWk;
import X.EnumC74991Tbv;
import X.InterfaceC06390Mx;
import X.InterfaceC24140x8;
import X.InterfaceC29205BdB;
import X.InterfaceC29405BgP;
import X.InterfaceC29856Bng;
import X.InterfaceC31336CRo;
import X.InterfaceC65784Pro;
import X.InterfaceC74605TPt;
import X.InterfaceC74686TSw;
import X.InterfaceC74695TTf;
import X.InterfaceC74708TTs;
import X.InterfaceC74834TYo;
import X.InterfaceC75441TjB;
import X.InterfaceC75973Trl;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.JBR;
import X.Q7L;
import X.T16;
import X.TQI;
import X.TS1;
import X.TS9;
import X.TSA;
import X.TSB;
import X.TSC;
import X.TSE;
import X.TSG;
import X.TSH;
import X.TSU;
import X.TSV;
import X.TSX;
import X.TSY;
import X.TSZ;
import X.TT0;
import X.TT1;
import X.TT2;
import X.TT7;
import X.TTL;
import X.TTO;
import X.TTQ;
import X.TTR;
import X.TTV;
import X.TU2;
import X.TU4;
import X.TV2;
import X.TVD;
import X.TW6;
import X.TWL;
import X.TYP;
import X.V1B;
import X.X1D;
import Y.ACListenerS29S0400000_5;
import Y.AObjectS143S0100000_13;
import Y.AfS52S0300000_13;
import Y.AfS65S0100000_13;
import Y.IDcS17S0300000_13;
import Y.IDo0S413S0100000_13;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.InteractDebugInfoEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestStartRtcJoinChannelEvent;
import com.bytedance.android.live.liveinteract.api.LinkMicAudienceCancelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.room.GuestCopyrightViolationEvent;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.api.GameLinkApi;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkMediaManageFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkMediaManagePanel;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.AnchorPermitGuestEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.DobDialogCanceledEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.EditBirthFailedWithoutConfirm;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.EditBirthSucc;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkPlayerMuteAudioEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkStateChangeEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestDisconnectByWindowEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestReplyAnchorEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.RealGoLivePreviewDestroyEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.ShowGuestDisconnectDialogEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.utils.GameLinkPreviewPanelCloseEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.utils.GameLinkPreviewPanelOpenEvent;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundUseMediaFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestPauseTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkRemoveConnectSuccReportSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestDisconnectFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3CancelApplyOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestLinkMicHeadSetToast;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLivePerceptionSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.AgeRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AqS109S0300000_5;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.StateReqCommon;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.ChangeStateReq;
import webcast.im.LinkStateMessage;

/* loaded from: classes14.dex */
public final class GameLinkGuestPresenter extends AbstractC31497CXt<TSX> implements OnMessageListener, WeakHandler.IHandler {
    public static final TSE Companion = new TSE();
    public String anchorInvitationPosition;
    public TT1 applyOptPresenter;
    public TT2 beInvitedOptPresenter;
    public String beInvitedSharePlatform;
    public final AtomicLong clientCachedStateVersion;
    public int clientControllerStatus;
    public final C5H3 compositeDisposable$delegate;
    public C277116x copyrightPerceptionHelper;
    public TSV dialogView;
    public String extRtcInfo;
    public final TTR gamelinkManager;
    public GameLinkGuestBeInvitedDialog guestBeInvitedDialog;
    public String guestInviteType;
    public C74668TSe guestLinkListener;
    public Boolean hadEnterBackgroundOnce;
    public WeakHandler handler;
    public boolean isCanceling;
    public boolean isEnterBackground;
    public boolean isGuest;
    public boolean isLeavingChannel;
    public final C73849Syb<Boolean> isNetworkAvailable;
    public boolean isTurningOffEngine;
    public boolean isWaitingState;
    public int lastNetworkState;
    public final C5H3 linkMessageCenter$delegate;
    public final TS9 linkMicEventListener;
    public final C74740TUy linkPlayerState;
    public final TT7 linkStateMsgListener;
    public InterfaceC74605TPt liveVideoClient;
    public final DataChannel mDataChannel;
    public final C5H3 multiGuestDataHolder$delegate;
    public GameLinkMediaManagePanel multiLiveGuestPreviewDialog;
    public final C5H3 networkBroadcastReceiver$delegate;
    public final C9W networkStatusListener;
    public EnumC74704TTo replyAnchorState;
    public final Room room;
    public EnumC74778TWk serverLayoutType;
    public String sourceOfLeave;
    public final C5H3 taskDispatcher$delegate;
    public final InterfaceC74708TTs userListChangeListener;

    public static void com_bytedance_android_livesdk_comp_impl_game_linkmic_presenter_GameLinkGuestPresenter_com_bytedance_android_live_design_app_LiveDialog_show(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-2469330823873512576")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public final void doCheckPermissionByAccept() {
        doCheckLinkPermission$default(this, 1, false, null, null, null, new AqS195S0100000_13(this, 17), 30, null);
    }

    public final void handleRtcChannelJoined() {
        TYP.LIZ("GameLinkGuestPresenter", "receive RtcChannelJoined msg", false);
        this.isGuest = true;
        TSX tsx = (TSX) this.mView;
        if (tsx != null) {
            tsx.becomeGuest();
        }
    }

    public final void onReceiveManagePanelCloseEvent() {
        this.multiLiveGuestPreviewDialog = null;
    }

    public final void onStartSuccess() {
        String str;
        RtcUserInfo LLLLLJIL;
        boolean z;
        AgeRestricted ageRestricted;
        AgeRestricted ageRestricted2;
        User owner;
        if (this.mView == 0) {
            return;
        }
        TYP.LIZLLL("OnStartSuccess", "position:LinkIn_Guest");
        B5G.LIZIZ().LJJIIZI = System.currentTimeMillis();
        C74740TUy.LIZLLL().LJI(2);
        String interactId = getInteractId();
        if (interactId != null) {
            syncMuteStatMsgWhenAnchorNotInRtc(interactId);
        }
        if (!LiveSdkRemoveConnectSuccReportSetting.INSTANCE.isEnable()) {
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            C32039Chn c32039Chn = new C32039Chn();
            if (room != null && (owner = room.getOwner()) != null) {
                c32039Chn.LIZ = owner.getId();
                c32039Chn.LIZIZ = currentUserId;
            }
            String str2 = B5G.LIZIZ().LJJIFFI;
            if (!TextUtils.isEmpty(str2)) {
                if (str2 != null) {
                    hashMap.put("request_id", str2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (room != null && (ageRestricted2 = room.ageRestricted) != null && ageRestricted2.ageInterval == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                hashMap.put("is_invitee_mature", CardStruct.IStatusCode.DEFAULT);
                hashMap.put("is_inviter_mature", CardStruct.IStatusCode.DEFAULT);
            } else if (room != null && (ageRestricted = room.ageRestricted) != null && ageRestricted.ageInterval == 4) {
                hashMap.put("is_invitee_mature", "1");
                hashMap.put("is_inviter_mature", "1");
            }
            BZI LIZ = C28787BRn.LIZ("connection_success");
            LIZ.LJJIFFI(hashMap);
            BZJ bzj = LIZ.LIZ;
            if (bzj != null) {
                bzj.LIZLLL(c32039Chn);
            }
            LIZ.LJJIIJZLJL();
        }
        String joinType = this.guestInviteType;
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLLLLJIL = R6.LLLLLJIL()) != null) {
            str = LLLLLJIL.getLinkMicId();
        } else {
            str = null;
        }
        long currentUserId2 = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        o.LJIIIZ(joinType, "joinType");
        C74696TTg.LIZ = System.currentTimeMillis();
        C74696TTg.LIZIZ = joinType;
        if (str == null) {
            str = "";
        }
        C74696TTg.LIZJ = str;
        C74696TTg.LIZLLL = String.valueOf(currentUserId2);
        JSONObject LIZJ = C65232Piu.LIZJ("log_name", "ttlive_multilive_multi_guest_start");
        LIZJ.put("way", this.guestInviteType);
        String jSONObject = LIZJ.toString();
        o.LJIIIIZZ(jSONObject, "aLogParams.toString()");
        C0NB.LJIIIZ("GameLinkGuestStart", jSONObject);
        DataChannel dataChannel = this.mDataChannel;
        getVendor().name();
        dataChannel.qv0(InteractDebugInfoEvent.class, new V1B());
        if (this.replyAnchorState == EnumC74704TTo.FAILED) {
            stopInteract$default(this, "reply", false, false, false, 10021, 8, null);
        } else {
            if (!C74838TYs.LJ().LJJIIJZLJL) {
                return;
            }
            pushStreamForPreviewAhead();
        }
    }

    private final void detachGoLiveOptPresenter() {
        BY9 by9;
        BY9 by92;
        Object obj = this.beInvitedOptPresenter;
        if ((obj instanceof AbstractC31497CXt) && (by92 = (BY9) obj) != null) {
            by92.detachView();
        }
        Object obj2 = this.applyOptPresenter;
        if ((obj2 instanceof AbstractC31497CXt) && (by9 = (BY9) obj2) != null) {
            by9.detachView();
        }
    }

    private final C73318Sq2 getCompositeDisposable() {
        return (C73318Sq2) this.compositeDisposable$delegate.getValue();
    }

    private final C75187Tf5 getLinkMessageCenter() {
        return (C75187Tf5) this.linkMessageCenter$delegate.getValue();
    }

    private final C9O getNetworkBroadcastReceiver() {
        return (C9O) this.networkBroadcastReceiver$delegate.getValue();
    }

    private final InterfaceC74834TYo getTaskDispatcher() {
        return (InterfaceC74834TYo) this.taskDispatcher$delegate.getValue();
    }

    private final void initLinkMessageSubScribe() {
        this.gamelinkManager.e3(this.linkMicEventListener);
    }

    private final void onUnrecoverableErrorHappened() {
        stopInteract$default(this, "rtc_error", false, false, false, 10031, 8, null);
    }

    private final boolean preCheckOfInviteMessage() {
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
        if (interfaceC31336CRo != null && interfaceC31336CRo.getContext() != null) {
            EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
            if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
                LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
                C75516TkO.LIZ.LIZ(101, "linkmic aab is unavailable when invite!", null);
                return false;
            }
            return true;
        }
        return true;
    }

    private final void releaseLiveVideoClient() {
        InterfaceC74605TPt interfaceC74605TPt = this.liveVideoClient;
        if (interfaceC74605TPt != null) {
            interfaceC74605TPt.release(C78857UxB.LJJIIJ(1476788483, "bpea-game_linkmic_guestpre_releaselivevideoclient"));
        }
        this.liveVideoClient = null;
    }

    private final void requestGuestLinkHintSetting() {
        User owner = this.room.getOwner();
        ((InterfaceC29856Bng) ((LinkApi) Q7L.LIZIZ(LinkApi.class)).isShowGuestLinkHint(this.room.getId(), owner.getId(), owner.getSecUid(), true).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(autoDispose())).LIZJ(new AfS65S0100000_13(this, 75), TSU.LJLIL);
    }

    private final void resetStateToNormal() {
        this.mDataChannel.qv0(InteractStateChangeEvent.class, new TW6(4));
        C74740TUy.LIZLLL().LJI(0);
        T t = this.mView;
        if (t == 0) {
            return;
        }
        this.isGuest = false;
        ((TSX) t).becomeNormalAudience();
    }

    public final StateReqCommon buildCommonReq() {
        long j;
        String LLLLLLIL;
        Long LJJIZ;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        StateReqCommon stateReqCommon = new StateReqCommon();
        stateReqCommon.scene = this.gamelinkManager.scene();
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        long j2 = 0;
        if (R6 != null && (LLLLLLIL = R6.LLLLLLIL()) != null && (LJJIZ = C38350F3i.LJJIZ(LLLLLLIL)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        stateReqCommon.channelId = j;
        stateReqCommon.appId = iHostAppContext.appId();
        stateReqCommon.liveId = iHostAppContext.liveId();
        Room LJJIL = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
        if (LJJIL != null) {
            j2 = LJJIL.getId();
        }
        stateReqCommon.myself = new Player(j2, C025908h.LIZ());
        return stateReqCommon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC31497CXt, X.BY9
    public void detachView() {
        C0NB.LJIIIZ("GameLinkGuestPresenter", "detachView");
        if (TTV.LIZ().LIZIZ == 0) {
            C74838TYs.LJ().LJIIIIZZ = false;
        }
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if ((num == null || num.intValue() != 1) && this.isWaitingState) {
            C0K2.LIZ("Player state of audience is invalid!", new Throwable());
        }
        TT0 LJ = this.gamelinkManager.LJ();
        if (LJ != null) {
            LJ.LJ(this.userListChangeListener);
        }
        getCompositeDisposable().LIZLLL();
        DataChannel dataChannel = this.mDataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        detachGoLiveOptPresenter();
        BU9.LIZ = null;
        BU9.LIZIZ = null;
        BU9.LIZJ = null;
        BU9.LIZLLL = null;
        BU9.LJ = null;
        if (TTV.LIZ().LIZIZ == 0) {
            stopInteract$default(this, "leave_with_detach_view", false, false, false, 0, 8, null);
            resetStateToNormal();
        }
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        C74668TSe c74668TSe = this.guestLinkListener;
        if (c74668TSe != null) {
            C75187Tf5 linkMessageCenter = getLinkMessageCenter();
            linkMessageCenter.getClass();
            if (((ArrayList) linkMessageCenter.LJLIL).contains(c74668TSe)) {
                ((ArrayList) linkMessageCenter.LJLIL).remove(c74668TSe);
            }
        }
        C75187Tf5 linkMessageCenter2 = getLinkMessageCenter();
        TT7 listener = this.linkStateMsgListener;
        linkMessageCenter2.getClass();
        o.LJIIIZ(listener, "listener");
        if (((ArrayList) linkMessageCenter2.LJLIL).contains(listener)) {
            ((ArrayList) linkMessageCenter2.LJLIL).remove(listener);
        }
        getNetworkBroadcastReceiver().LIZJ(this.networkStatusListener);
        getNetworkBroadcastReceiver().LIZLLL();
        super.detachView();
    }

    public final void dismissGuestBeInvitedDialog() {
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog = this.guestBeInvitedDialog;
        boolean z = false;
        if (gameLinkGuestBeInvitedDialog != null && gameLinkGuestBeInvitedDialog.isShowing()) {
            z = true;
        }
        if (z) {
            GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog2 = this.guestBeInvitedDialog;
            if (gameLinkGuestBeInvitedDialog2 != null) {
                gameLinkGuestBeInvitedDialog2.dismiss();
            }
            this.guestBeInvitedDialog = null;
        }
        this.beInvitedSharePlatform = null;
        this.anchorInvitationPosition = null;
    }

    public final InterfaceC29205BdB<C28467BFf<MultiLiveGuestInfoList>> fetchUserListData() {
        long j;
        long j2;
        boolean z;
        String str;
        AbstractC73638SvC listByType;
        if (this.mView == 0) {
            return null;
        }
        try {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
                j2 = room.getOwnerUserId();
            } else {
                j = 0;
                j2 = 0;
            }
            if (j != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (j2 != 0) {
                    GameLinkApi gameLinkApi = (GameLinkApi) TTL.LIZ(GameLinkApi.class, "get().getService(GameLinkApi::class.java)");
                    InterfaceC75441TjB R6 = this.gamelinkManager.R6();
                    if (R6 == null || (str = R6.LLLLLLIL()) == null) {
                        str = "-1";
                    }
                    listByType = gameLinkApi.getListByType(j, j2, CastLongProtector.parseLong(str), C47261Igj.LJJIJIIJI(1, 2).toString(), 0, 12);
                    return (InterfaceC29205BdB) listByType.LIZLLL(autoDisposeWithTransformer());
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final String getInteractId() {
        RtcUserInfo LLLLLJIL;
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLLLLJIL = R6.LLLLLJIL()) != null) {
            return LLLLLJIL.getLinkMicId();
        }
        return null;
    }

    public final TVD getMultiGuestDataHolder() {
        return (TVD) this.multiGuestDataHolder$delegate.getValue();
    }

    public final void getSuspendReason() {
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
        if (interfaceC31336CRo != null) {
            C0NQ.LIZ(interfaceC31336CRo.getContext(), interfaceC31336CRo, 13, getTaskDispatcher(), new AqS171S0100000_5(this, 375));
        }
    }

    public final void handleHostOpenMicInvite() {
        LinkListUser linkListUser;
        TU4 LIZ;
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
        Context context = null;
        if (interfaceC31336CRo == null || interfaceC31336CRo.getContext() == null) {
            return;
        }
        C34K c34k = new C34K();
        TT0 LJ = this.gamelinkManager.LJ();
        if (LJ != null && (LIZ = LJ.LIZ()) != null) {
            linkListUser = C60903NvH.LJIIZILJ(LIZ, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        } else {
            linkListUser = null;
        }
        InterfaceC31336CRo interfaceC31336CRo2 = (InterfaceC31336CRo) this.mView;
        if (interfaceC31336CRo2 != null) {
            context = interfaceC31336CRo2.getContext();
        }
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.n9v);
        c47071t1.LJII(C15380j0.LJIILJJIL(R.string.n9u));
        c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.n9x), new IDcS17S0300000_13(this, linkListUser, c34k, 2));
        c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.kg7), C74676TSm.LJLIL);
        com_bytedance_android_livesdk_comp_impl_game_linkmic_presenter_GameLinkGuestPresenter_com_bytedance_android_live_design_app_LiveDialog_show(c47071t1.LIZ());
        reportLog(linkListUser, false, "show", false);
    }

    public final boolean isAnchor() {
        Room room = this.room;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && room != null && room.getOwnerUserId() == LIZIZ.getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public final boolean isEngineOn() {
        if (this.gamelinkManager.LIZIZ() == 5 || this.gamelinkManager.LIZIZ() == 4) {
            return true;
        }
        return false;
    }

    public final void onDetachWidget() {
        C0NB.LJIIIZ("GameLinkGuestPresenter", "onDetachWidget");
        DataChannel dataChannel = this.mDataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        this.gamelinkManager.X3(this.linkMicEventListener);
    }

    public final void onEnterBackground() {
        Boolean bool;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        C0NB.LJIIIZ("GameLinkGuestPresenter", "onEnterBackground");
        this.isEnterBackground = true;
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
            LLIIJLIL2.LIZJ(true);
        }
        if (isEngineOn()) {
            TYP.LIZIZ("GameLinkGuestPresenter", "onEnterBackground, isEngineOn: true");
            getMultiGuestDataHolder().getClass();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(GameLinkGuestMuteAudioEvent.class, new C74674TSk(false, "business_mute_enter_background"));
            }
            InterfaceC75441TjB R62 = this.gamelinkManager.R6();
            if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
                LLIIJLIL.pause();
            }
            InterfaceC74605TPt interfaceC74605TPt = this.liveVideoClient;
            if (interfaceC74605TPt != null) {
                interfaceC74605TPt.LIZJ(C78857UxB.LJJIIJ(1476788484, "game_linkmic_guestpre_onenterbackground"));
            }
            C74837TYr.LJIIIIZZ("guest_pause");
            C74696TTg.LIZ("guest_pause");
        } else {
            TYP.LIZIZ("GameLinkGuestPresenter", "onEnterBackground, isEngineOn: false");
        }
        if (C29306Beo.LJIL(this.hadEnterBackgroundOnce)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onEnterBackgroundExecuteOncePart, hadEnterBackgroundOnce: ");
            LIZ.append(this.hadEnterBackgroundOnce);
            TYP.LIZIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ));
            this.hadEnterBackgroundOnce = Boolean.TRUE;
            if (LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
                TSX tsx = (TSX) this.mView;
                if (tsx != null) {
                    bool = Boolean.valueOf(tsx.isInPipMode());
                } else {
                    bool = null;
                }
                boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
                Room room = this.room;
                if (C74838TYs.LJ().LJJ > 0) {
                    if (MultiGuestV3PipSetting.INSTANCE.getValue()) {
                        if (!LJJIFFI) {
                            C74746TVe.LIZJ(null, room, 3);
                        }
                    } else {
                        C74746TVe.LIZJ(null, room, 3);
                    }
                }
            }
            if (isEngineOn()) {
                TYP.LIZIZ("GameLinkGuestPresenter", "sendMsgCloseInteractDelayed");
                WeakHandler weakHandler = this.handler;
                if (weakHandler != null) {
                    weakHandler.sendEmptyMessageDelayed(140000, LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue() * 1000);
                }
            }
        }
    }

    public final void onEnterForeground() {
        Boolean bool;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        int i;
        TU4 LIZ;
        long j;
        int i2;
        InterfaceC29405BgP LIZIZ;
        C0NB.LJIIIZ("GameLinkGuestPresenter", "onEnterForeground");
        Boolean bool2 = null;
        if (isEngineOn() && this.isEnterBackground) {
            C74696TTg.LIZ = System.currentTimeMillis();
            String str = this.guestInviteType;
            String interactId = getInteractId();
            if (interactId == null) {
                interactId = "";
            }
            String str2 = this.anchorInvitationPosition;
            if (str2 == null) {
                str2 = "others";
            }
            String str3 = this.beInvitedSharePlatform;
            if (str3 == null) {
                str3 = "room";
            }
            TT0 LJ = this.gamelinkManager.LJ();
            if (LJ != null && (LIZ = LJ.LIZ()) != null) {
                B83 LIZ2 = B83.LIZ();
                if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null) {
                    j = ((C29374Bfu) LIZIZ).getCurrentUserId();
                } else {
                    j = 0;
                }
                List LJ2 = LIZ.LJ();
                if ((LJ2 instanceof Collection) && LJ2.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it = LJ2.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        User user = ((LinkListUser) it.next()).user;
                        if (user == null || user.getId() != j) {
                            i2++;
                            if (i2 < 0) {
                                C47261Igj.LJJJJIZL();
                                throw null;
                            }
                        }
                    }
                }
                Integer valueOf = Integer.valueOf(i2);
                if (valueOf != null) {
                    i = valueOf.intValue();
                    DataChannel dataChannel = this.dataChannel;
                    o.LJIIIIZZ(dataChannel, "dataChannel");
                    TWL.LJIILIIL(str, interactId, str2, str3, i, dataChannel, EnumC74991Tbv.NORMAL, 128);
                }
            }
            i = 0;
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            TWL.LJIILIIL(str, interactId, str2, str3, i, dataChannel2, EnumC74991Tbv.NORMAL, 128);
        }
        this.isEnterBackground = false;
        getMultiGuestDataHolder().getClass();
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
            LLIIJLIL2.LIZJ(false);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onEnterForground ");
        LIZ3.append(isEngineOn());
        LIZ3.append(' ');
        LIZ3.append(this.gamelinkManager.LIZIZ());
        TYP.LIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ3), true);
        if (isEngineOn()) {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.qv0(GameLinkGuestMuteAudioEvent.class, new C74674TSk(getMultiGuestDataHolder().LJIIIIZZ, "business_mute_enter_foreground"));
            }
            InterfaceC75441TjB R62 = this.gamelinkManager.R6();
            if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
                LLIIJLIL.resume();
            }
            InterfaceC74605TPt interfaceC74605TPt = this.liveVideoClient;
            if (interfaceC74605TPt != null) {
                interfaceC74605TPt.LJIIJ(C78857UxB.LJJIIJ(1476788234, "bpea-game_linkmic_guestpre_onenterforeground"));
            }
            InterfaceC74605TPt interfaceC74605TPt2 = this.liveVideoClient;
            if (interfaceC74605TPt2 != null && (interfaceC74605TPt2 instanceof InterfaceC24140x8)) {
                ((InterfaceC24140x8) interfaceC74605TPt2).LJIIJJI(C78857UxB.LJJIIJ(1476788483, "bpea-game_linkmic_guestpre_switchcameraimpl"), false);
            }
        }
        if (C29306Beo.LJJ(this.hadEnterBackgroundOnce)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("onEnterForegroundExecuteOncePart, hadEnterBackgroundOnce: ");
            LIZ4.append(this.hadEnterBackgroundOnce);
            TYP.LIZIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ4));
            MultiGuestV3PipSetting multiGuestV3PipSetting = MultiGuestV3PipSetting.INSTANCE;
            if (multiGuestV3PipSetting.getValue()) {
                TSX tsx = (TSX) this.mView;
                if (tsx != null) {
                    bool = Boolean.valueOf(tsx.isInPipMode());
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    return;
                }
            }
            this.hadEnterBackgroundOnce = Boolean.FALSE;
            WeakHandler weakHandler = this.handler;
            if (weakHandler != null) {
                weakHandler.removeCallbacksAndMessages(null);
            }
            if (LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
                TSX tsx2 = (TSX) this.mView;
                if (tsx2 != null) {
                    bool2 = Boolean.valueOf(tsx2.isInPipMode());
                }
                boolean LJJIFFI = C29306Beo.LJJIFFI(bool2);
                if (C74838TYs.LJ().LJJ > 0) {
                    if (multiGuestV3PipSetting.getValue()) {
                        if (!LJJIFFI) {
                            C74746TVe.LIZLLL("live_play");
                            return;
                        }
                        return;
                    }
                    C74746TVe.LIZLLL("live_play");
                }
            }
        }
    }

    public final void onPrepareSurfaceViewInPreviewFragmentForLinkMicView() {
        View view;
        ViewGroup viewGroup;
        InterfaceC74605TPt interfaceC74605TPt = this.liveVideoClient;
        Object obj = interfaceC74605TPt;
        if (interfaceC74605TPt == null) {
            InterfaceC74605TPt liveVideoClient = getLiveVideoClient(false);
            getMultiGuestDataHolder().LJIILL = liveVideoClient;
            obj = liveVideoClient;
        }
        ViewParent viewParent = null;
        if (obj instanceof SurfaceView) {
            view = (View) obj;
            if (view != null) {
                viewParent = view.getParent();
            }
        } else {
            view = null;
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(view, viewGroup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pushStreamForPreviewAhead() {
        /*
            r2 = this;
            X.TPt r1 = r2.liveVideoClient
            if (r1 != 0) goto L11
            r0 = 0
            X.TPt r1 = r2.getLiveVideoClient(r0)
            X.TVD r0 = r2.getMultiGuestDataHolder()
            r0.LJIILL = r1
            if (r1 == 0) goto L14
        L11:
            r1.LIZLLL()
        L14:
            java.lang.String r1 = "bpea-game_linkmic_guestpre_pushstreamforpreviewahead"
            r0 = 1476788234(0x5806000a, float:5.893389E14)
            X.UxG r0 = X.C78857UxB.LJJIIJ(r0, r1)
            r2.rtcStartForPreview(r0)
            r2.headsetToast()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter.pushStreamForPreviewAhead():void");
    }

    public final void syncGuestVideoViewState() {
        if (this.liveVideoClient == null) {
            this.liveVideoClient = getMultiGuestDataHolder().LJIILL;
        }
    }

    private final boolean hasNoPermission() {
        if (getMultiGuestDataHolder().LJIJI != 0 && (getMultiGuestDataHolder().LJIIZILJ == -1 || getMultiGuestDataHolder().LJIIZILJ == 0)) {
            return true;
        }
        return false;
    }

    private final void headsetToast() {
        String str;
        String str2;
        if (1 == MultiGuestV3GuestLinkMicHeadSetToast.getValue()) {
            if (C31026CFq.LIZ.LIZIZ()) {
                C30868C9o.LIZJ(R.string.n_0);
                str = "connected";
            } else {
                C30868C9o.LIZJ(R.string.n9z);
                str = "try_headphones";
            }
            String guestInviteType = this.guestInviteType;
            int i = C74838TYs.LJ().LJJ;
            String LJI = TWL.LJI(false, this.room);
            boolean z = true ^ getMultiGuestDataHolder().LJIIIIZZ;
            String LIZLLL = C74838TYs.LJ().LIZLLL();
            o.LJIIIIZZ(LIZLLL, "inst().linkMicId");
            o.LJIIIZ(guestInviteType, "guestInviteType");
            HashMap LIZ = C45243HpH.LIZ("toast_type", str, "guest_invite_type", guestInviteType);
            LIZ.put("guest_cnt", String.valueOf(i));
            LIZ.put("layout_setting", TWL.LJFF().getFirst());
            LIZ.put("window_setting", TWL.LJFF().getSecond());
            LIZ.put("camera_status", "off");
            LIZ.put("guest_permission", LJI);
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.put("is_muted", str2);
            LIZ.put("link_id", LIZLLL);
            TWL.LJIL("livesdk_guest_connection_success_toast", LIZ);
        }
    }

    public final long getUserId() {
        return C025908h.LIZ();
    }

    public final Config.Vendor getVendor() {
        C74838TYs.LJ().getClass();
        Config.Vendor fromValue = Config.Vendor.fromValue(0);
        o.LJIIIIZZ(fromValue, "inst().vendor");
        return fromValue;
    }

    public final void onEndSuccess() {
        C74838TYs.LJ().LJI();
        this.isTurningOffEngine = false;
        this.clientControllerStatus = -1;
        TYP.LIZLLL("onEndSuccess", "position:LinkIn_Guest");
        this.mDataChannel.qv0(InteractDebugInfoEvent.class, new V1B());
        this.extRtcInfo = null;
    }

    public final void turnOffEngine() {
        C74838TYs.LJ().LJI();
        TYP.LIZLLL("LinkIn_turnOffEngine", "");
        if (TWL.LJ != null) {
            HashMap hashMap = new HashMap();
            TWL.LIZ(hashMap);
            hashMap.put("trigger", "connection_end");
            EnumC74778TWk enumC74778TWk = TWL.LJ;
            TWL.LJ = null;
            hashMap.put("layout_setting", TWL.LJFF().getFirst());
            hashMap.put("window_setting", TWL.LJFF().getSecond());
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - TWL.LJFF));
            TWL.LJIL("livesdk_multilive_mode_connection_duration", hashMap);
            if (enumC74778TWk != TWL.LIZJ) {
                TWL.LJIJI("connection_end", enumC74778TWk);
            }
        }
        releaseLiveVideoClient();
    }

    public final TT1 getApplyOptPresenter() {
        return this.applyOptPresenter;
    }

    public final TT2 getBeInvitedOptPresenter() {
        return this.beInvitedOptPresenter;
    }

    public final TTR getGamelinkManager() {
        return this.gamelinkManager;
    }

    public final Room getRoom() {
        return this.room;
    }

    public final String getSourceOfLeave() {
        return this.sourceOfLeave;
    }

    private final void checkLinkPermissionAhead(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        if (hasNoPermission()) {
            MultiLiveUserSettings multiLiveUserSettings = this.room.multiLiveUserSettings;
            if (multiLiveUserSettings != null && multiLiveUserSettings.P()) {
                C74764TVw c74764TVw = new C74764TVw(0, getMultiGuestDataHolder().LJIJJ, Long.valueOf(getMultiGuestDataHolder().LJIJI));
                TSX tsx = (TSX) this.mView;
                if (tsx != null) {
                    tsx.onCheckPermissionFailedV3(c74764TVw);
                    return;
                }
                return;
            }
            handlePermissionInfoIsNullForSafe(interfaceC88472Yns);
            return;
        }
        int i = getMultiGuestDataHolder().LJIIZILJ;
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(Integer.valueOf(i));
    }

    private final String generateMultiLiveSuspendedContent(LatestBanRecordInfo latestBanRecordInfo) {
        String LJIILJJIL;
        if (latestBanRecordInfo != null) {
            if (latestBanRecordInfo.isBannedForever) {
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lt9);
                o.LJIIIIZZ(LJIILJJIL2, "{\n            ResUtil.ge…_permanent_ban)\n        }");
                return LJIILJJIL2;
            }
            Date date = new Date((latestBanRecordInfo.banTime + latestBanRecordInfo.banDuration) * 1000);
            String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.lv4);
            o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_guest_temporary_ban)");
            Locale locale = Locale.ENGLISH;
            String format = new SimpleDateFormat("HH:mm", locale).format(date);
            o.LJIIIIZZ(format, "SimpleDateFormat(\"HH:mm\"…ale.ENGLISH).format(date)");
            String LJJJJZ = ujb.o.LJJJJZ(LJIILJJIL3, "{time}", format, false);
            String format2 = new SimpleDateFormat("dd-MM-yyyy", locale).format(date);
            o.LJIIIIZZ(format2, "SimpleDateFormat(\"dd-MM-…ale.ENGLISH).format(date)");
            LJIILJJIL = ujb.o.LJJJJZ(LJJJJZ, "{date}", format2, false);
        } else {
            LJIILJJIL = C15380j0.LJIILJJIL(R.string.moo);
        }
        o.LJIIIIZZ(LJIILJJIL, "{\n            info?.let …on_ban_forever)\n        }");
        return LJIILJJIL;
    }

    private final InterfaceC74605TPt getLiveVideoClient(boolean z) {
        InterfaceC24140x8 interfaceC24140x8;
        if (getMultiGuestDataHolder().LJIILL != null) {
            InterfaceC74605TPt interfaceC74605TPt = getMultiGuestDataHolder().LJIILL;
            if ((interfaceC74605TPt instanceof InterfaceC24140x8) && (interfaceC24140x8 = (InterfaceC24140x8) interfaceC74605TPt) != null && !interfaceC24140x8.LJIILIIL()) {
                this.liveVideoClient = getMultiGuestDataHolder().LJIILL;
                return getMultiGuestDataHolder().LJIILL;
            }
        }
        TVD mDataHolder = getMultiGuestDataHolder();
        o.LJIIIZ(mDataHolder, "mDataHolder");
        C24130x7 c24130x7 = new C24130x7();
        c24130x7.LIZ = C74740TUy.LIZLLL().LJ;
        c24130x7.LIZIZ = C74740TUy.LIZLLL().LJFF;
        c24130x7.LJ = 1;
        c24130x7.LJI = z;
        c24130x7.LJFF = false;
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        InterfaceC74605TPt createLinkVideoView = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLinkVideoView(LIZLLL, c24130x7, null, this.dataChannel);
        this.liveVideoClient = createLinkVideoView;
        return createLinkVideoView;
    }

    private final void handlePermissionInfoIsNullForSafe(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        C74768TWa.LIZIZ(this.room, this.mDataChannel, (TSX) this.mView, 0, false, null, null, new AqS175S0200000_13(this, (GameLinkGuestPresenter) interfaceC88472Yns, (InterfaceC88472Yns<? super Integer, C76800UCe>) 3), null);
    }

    private final void initGoLiveOptPresenter(TSX tsx) {
        Context context;
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
        if (interfaceC31336CRo != null) {
            context = interfaceC31336CRo.getContext();
        } else {
            context = null;
        }
        TTO tto = new TTO(context, this.gamelinkManager, this);
        tto.attachView((TTO) tsx);
        this.beInvitedOptPresenter = tto;
        TTQ ttq = new TTQ(this.gamelinkManager, this);
        ttq.attachView((TTQ) tsx);
        this.applyOptPresenter = ttq;
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null) {
            R6.LLLLLLL(C74680TSq.LJLIL);
        }
    }

    private final boolean isKickOutReasonable(Integer num) {
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    private final boolean needForceCallLeaveChannel(String str) {
        if (o.LJ(str, "leave_source_user_click_cancel_in_preview") || o.LJ(str, "leave_source_user_timeout_cancel_in_preview")) {
            return true;
        }
        return false;
    }

    private final void rtcStartForPreview(Cert cert) {
        InterfaceC74695TTf LLIIJLIL;
        C0NB.LJIIIZ("GameLinkGuestPresenter", "rtcStartForPreview");
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            LLIIJLIL.LJIIL(cert);
        }
        if (this.isEnterBackground) {
            onEnterBackground();
        } else {
            onEnterForeground();
        }
    }

    private final void syncMuteStatMsgWhenAnchorNotInRtc(String str) {
        Object obj;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage(null, null, null, null, 0L, null, null, 127, null);
        linkLayerRTCMessage.generateId();
        LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam(null, 0, 0, null, null, false, 63, null);
        ArrayList arrayList = new ArrayList();
        TVD multiGuestDataHolder = getMultiGuestDataHolder();
        if (str == null) {
            multiGuestDataHolder.getClass();
            obj = Boolean.FALSE;
        } else {
            obj = ((Map) multiGuestDataHolder.LJIIL.getValue()).get(str);
            if (obj == null) {
                obj = Boolean.FALSE;
            }
        }
        arrayList.add(new LinkLayerRTCMessageUser(str, -1, o.LJ(obj, Boolean.TRUE) ? 1 : 0, 1));
        linkLayerRTCMessageParam.getUsers().addAll(arrayList);
        linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
        linkLayerRTCMessage.setMethod("linkMicSDKVideoMute");
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
            o.LJIIIIZZ(json, "get().toJson(cmd)");
            LLIIJLIL2.sendRoomMessage(json);
        }
        linkLayerRTCMessage.setMethod("linkMicSDKAudioMute");
        InterfaceC75441TjB R62 = this.gamelinkManager.R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            String json2 = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
            o.LJIIIIZZ(json2, "get().toJson(cmd)");
            LLIIJLIL.sendRoomMessage(json2);
        }
    }

    public final void ackStateMessage(LinkStateMessage linkStateMessage) {
        sendMessageAck(linkStateMessage.getMessageId(), 1);
    }

    @Override // X.AbstractC31497CXt
    public void attachView(TSX tsx) {
        Context context;
        TU4 LIZ;
        super.attachView((GameLinkGuestPresenter) tsx);
        C0NB.LJIIIZ("GameLinkGuestPresenter", "attachView");
        this.handler = new WeakHandler(this);
        initGoLiveOptPresenter(tsx);
        C74838TYs.LJ().LJIIIIZZ = true;
        TT0 LJ = this.gamelinkManager.LJ();
        if (LJ != null) {
            LJ.LIZLLL(this.userListChangeListener);
        }
        TT0 LJ2 = this.gamelinkManager.LJ();
        if (LJ2 != null && LJ2.isInit()) {
            TT0 LJ3 = this.gamelinkManager.LJ();
            if (LJ3 != null && (LIZ = LJ3.LIZ()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = LIZ.LIZLLL().iterator();
                while (it.hasNext()) {
                    arrayList.add(TV2.LIZ((LinkListUser) it.next()));
                }
                TSX tsx2 = (TSX) this.mView;
                if (tsx2 != null) {
                    tsx2.onPlayerListChange(arrayList);
                }
            }
        } else {
            TT0 LJ4 = this.gamelinkManager.LJ();
            if (LJ4 != null) {
                LJ4.init();
            }
        }
        IMessageManager iMessageManager = (IMessageManager) this.mDataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null && MultiLivePerceptionSetting.isEnable()) {
            iMessageManager.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this);
        }
        C74668TSe c74668TSe = new C74668TSe(this);
        this.guestLinkListener = c74668TSe;
        C75187Tf5 linkMessageCenter = getLinkMessageCenter();
        linkMessageCenter.getClass();
        ((ArrayList) linkMessageCenter.LJLIL).add(c74668TSe);
        C75187Tf5 linkMessageCenter2 = getLinkMessageCenter();
        TT7 listener = this.linkStateMsgListener;
        linkMessageCenter2.getClass();
        o.LJIIIZ(listener, "listener");
        ((ArrayList) linkMessageCenter2.LJLIL).add(listener);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.mView;
        if (lifecycleOwner != null) {
            DataChannelGlobal.LJLJJI.nv0(lifecycleOwner, lifecycleOwner, MultiGuestLiveSuspended.class, new AqS179S0100000_13(this, 301));
        }
        DataChannel dataChannel = this.mDataChannel;
        dataChannel.mv0(LinkInRoomGuestStartRtcJoinChannelEvent.class, this, new AqS179S0100000_13(this, 302));
        dataChannel.mv0(LinkInRoomGuestReplySucceedEvent.class, this, new AqS179S0100000_13(this, 303));
        dataChannel.mv0(LinkInRoomGuestReplyFailedEvent.class, this, new AqS179S0100000_13(this, 304));
        dataChannel.mv0(LinkMicAudienceCancelEvent.class, this, new AqS179S0100000_13(this, 305));
        dataChannel.mv0(GameLinkGuestMuteAudioEvent.class, this, new AqS179S0100000_13(this, 306));
        dataChannel.mv0(GuestDisconnectByWindowEvent.class, this, new AqS179S0100000_13(this, 288));
        dataChannel.mv0(ShowGuestDisconnectDialogEvent.class, this, new AqS179S0100000_13(this, 289));
        dataChannel.mv0(DobDialogCanceledEvent.class, this, new AqS179S0100000_13(this, BuildConfig.VERSION_CODE));
        dataChannel.mv0(EditBirthSucc.class, this, new AqS179S0100000_13(this, 291));
        dataChannel.mv0(EditBirthFailedWithoutConfirm.class, this, new AqS179S0100000_13(this, 292));
        dataChannel.mv0(LiveEndEvent.class, this, new AqS179S0100000_13(this, 293));
        dataChannel.mv0(AnchorPermitGuestEvent.class, this, new AqS179S0100000_13(this, 294));
        dataChannel.mv0(GuestReplyAnchorEvent.class, this, new AqS179S0100000_13(this, 295));
        dataChannel.mv0(GuestJoinChannelWhenAnchorPermitEvent.class, this, new AqS179S0100000_13(this, 296));
        dataChannel.mv0(GameLinkPreviewPanelOpenEvent.class, this, new AqS179S0100000_13(this, 297));
        dataChannel.mv0(GameLinkPreviewPanelCloseEvent.class, this, new AqS179S0100000_13(this, 298));
        dataChannel.mv0(RealGoLivePreviewDestroyEvent.class, this, new AqS179S0100000_13(this, 299));
        dataChannel.mv0(GuestCopyrightViolationEvent.class, this, new AqS179S0100000_13(this, 300));
        requestGuestLinkHintSetting();
        initLinkMessageSubScribe();
        long id = this.room.getId();
        long ownerUserId = this.room.getOwnerUserId();
        if (C32777Cth.LIZ(0.1f, "ttlive_multi_guest_v3_open_record")) {
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJI(jSONObject, "live_type", "live_studio");
            C05630Jz.LJI(jSONObject, "use_role", "audience");
            C05630Jz.LJI(jSONObject, "version", String.valueOf(3));
            C05630Jz.LJI(jSONObject, "room_id", String.valueOf(id));
            C05630Jz.LJI(jSONObject, "anchor_id", String.valueOf(ownerUserId));
            C0K2.LJIIIIZZ("ttlive_multi_guest_v3_open_record", 0, jSONObject);
        }
        C31026CFq.LIZ.LJ();
        C9O networkBroadcastReceiver = getNetworkBroadcastReceiver();
        if (tsx == null || (context = tsx.getContext()) == null) {
            return;
        }
        networkBroadcastReceiver.LIZ(context);
        ((ArrayList) getNetworkBroadcastReceiver().LIZJ).add(new WeakReference(this.networkStatusListener));
    }

    public final void cancel(String cancelSource) {
        o.LJIIIZ(cancelSource, "cancelSource");
        if (this.isCanceling || this.mView == 0) {
            return;
        }
        this.isCanceling = true;
        if (!MultiGuestV3CancelApplyOptSetting.INSTANCE.getValue()) {
            C74838TYs.LJ().LJJIIZ = true;
        }
        BizCancelApplyParams bizCancelApplyParams = new BizCancelApplyParams(this.room.getOwner().getId());
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 == null) {
            return;
        }
        R6.LJJJJIZL(new C76002TsE(0L, 0L, bizCancelApplyParams, 23), new IDo0S413S0100000_13(this, 15));
    }

    public final void changeNetworkState(int i) {
        if (this.lastNetworkState == i) {
            return;
        }
        if (!MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getSyncNetworkState()) {
            C0NB.LJIIIZ("GameLinkGuestPresenter", "changeNetworkState newNetworkState return as getSyncNetworkState is false");
            return;
        }
        this.lastNetworkState = i;
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.stateType = 6;
        changeStateReq.networkState = i;
        changeState(changeStateReq, TSA.LJLIL);
    }

    public final void checkLinkPermissionAhead$livegamelinkmic_impl_release(int i) {
        checkLinkPermissionAhead(new AqS179S0100000_13(this, 287));
    }

    public final void diffAndEmitStateChange(LinkStateMessage linkStateMessage) {
        if (this.clientCachedStateVersion.get() >= linkStateMessage.version) {
            return;
        }
        this.mDataChannel.qv0(GameLinkStateChangeEvent.class, linkStateMessage);
        List<LinkUserState> list = linkStateMessage.userStates;
        if (list != null) {
            for (LinkUserState linkUserState : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("userState:");
                LIZ.append(linkUserState);
                LIZ.append("[linkmic_id=");
                LIZ.append(linkUserState.linkmicId);
                LIZ.append(", audioMuted=");
                LIZ.append(linkUserState.audioMuted);
                LIZ.append(", onlineUserState=");
                LIZ.append(linkUserState.onlineUserState);
                TYP.LIZJ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ));
            }
        }
    }

    public final String getThrowableMsg(Throwable th) {
        if (!(th instanceof C29401Dk)) {
            if (th != null) {
                return th.getMessage();
            }
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errMsg:");
        C29401Dk c29401Dk = (C29401Dk) th;
        LIZ.append(c29401Dk.getMessage());
        LIZ.append(", errCode:");
        LIZ.append(c29401Dk.getErrorCode());
        return X1D.LIZIZ(LIZ);
    }

    public final void handleCancelMessage(CancelInviteMessage cancelInviteMessage) {
        dismissGuestBeInvitedDialog();
        TSX tsx = (TSX) this.mView;
        if (tsx != null) {
            tsx.dismissApplyDialogIfNeed();
        }
    }

    public final void handleJoinChannelFailed(Throwable th) {
        TYP.LIZ("GameLinkGuestPresenter", "joinChannel failed", false);
        if (th != null) {
            logThrowable(th);
        }
        TSX tsx = (TSX) this.mView;
        if (tsx != null) {
            tsx.onJoinChannelFailed(th);
        }
    }

    public final void handleJoinChannelSucceed(String str) {
        TYP.LIZ("GameLinkGuestPresenter", "joinChannel succeed", false);
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
    }

    public final void handleKickOutMessage(KickOutMessage kickOutMessage) {
        TSX tsx;
        C74740TUy.LIZLLL().LIZLLL = 0L;
        TSY tsy = TSY.LJIIJ;
        if (tsy != null) {
            tsy.LIZ();
        }
        if (!isKickOutReasonable(Integer.valueOf(kickOutMessage.getKickOutReason())) && (tsx = (TSX) this.mView) != null) {
            tsx.showKickOutDialog();
        }
        TTV.LIZ().LIZ = false;
        stopInteract$default(this, "leave_with_kicked_out", false, false, false, 0, 8, null);
        MultiGuestDialogManager LIZ = TS1.LIZ();
        if (LIZ != null) {
            LIZ.iv0(C74622TQk.LJLIL);
        }
    }

    public final void handleLeaveMessage(LeaveMessage leaveMessage) {
        TSX tsx;
        C74740TUy.LIZLLL().LIZLLL = 0L;
        if (TTV.LIZ().LIZ && (tsx = (TSX) this.mView) != null) {
            tsx.showKickOutDialog();
        }
        stopInteract$default(this, "leave_normally", false, false, false, 0, 8, null);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Boolean bool;
        TSX tsx = (TSX) this.mView;
        if (tsx != null) {
            bool = Boolean.valueOf(tsx.isViewValid());
        } else {
            bool = null;
        }
        if (!C29306Beo.LJIL(bool) && message != null && 140000 == message.what) {
            TYP.LIZIZ("GameLinkGuestPresenter", "handleMsgCloseInteract");
            exitInteractInNormalWay$default(this, "leave_with_background", false, 10013, 2, null);
        }
    }

    public final void handlePermitMessage(PermitApplyMessage permitApplyMessage) {
        boolean z;
        String str;
        C74748TVg c74748TVg;
        TSX tsx;
        String l;
        InterfaceC75973Trl LLIIJI;
        LinkUser LJIJI;
        Boolean bool;
        if (permitApplyMessage == null) {
            return;
        }
        EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
        if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
            C0K2.LIZ("Create engine failed rtc sdk load so failed", new Throwable());
            LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
            return;
        }
        boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(enumC38440F6u);
        boolean isPluginAvailable2 = LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.QUIC);
        boolean isPluginAvailable3 = LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.RTS);
        boolean isPluginAvailable4 = LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.CMAF);
        StringBuilder LIZLLL = C00F.LIZLLL("handlePermitMessage LINK_MIC = ", isPluginAvailable, " QUIC = ", isPluginAvailable2, "  RTS = ");
        LIZLLL.append(isPluginAvailable3);
        LIZLLL.append(" CMAF = ");
        LIZLLL.append(isPluginAvailable4);
        TYP.LIZJ("GameLinkGuestPresenter", X1D.LIZIZ(LIZLLL));
        this.isWaitingState = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(PIPStatusData.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (this.isEnterBackground || z) {
            leaveAction$default(this, false, 1, null);
            return;
        }
        if (C74838TYs.LJ().LJJIIZ) {
            C31811Ce7.LIZLLL("GameLinkGuestPresenter", "receive permit message, but guest is leaving or already left");
            return;
        }
        C74838TYs LJ = C74838TYs.LJ();
        LJ.LJIILIIL = permitApplyMessage.getApprover().getLinkMicId();
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        String str2 = "";
        if (R6 == null || (LLIIJI = R6.LLIIJI()) == null || (LJIJI = LLIIJI.LJIJI(currentUserId)) == null || (str = LJIJI.getLinkMicId()) == null) {
            str = "";
        }
        LJ.LJIILJJIL = str;
        TSY tsy = TSY.LJIIJ;
        if (tsy != null) {
            String LIZLLL2 = LJ.LIZLLL();
            o.LJIIIIZZ(LIZLLL2, "dataHolder.linkMicId");
            tsy.LJI = LIZLLL2;
        }
        TSY tsy2 = TSY.LJIIJ;
        if (tsy2 != null) {
            Long channelId = permitApplyMessage.getApprover().getChannelId();
            if (channelId != null && (l = channelId.toString()) != null) {
                str2 = l;
            }
            tsy2.LJFF = str2;
        }
        LJ.LJII(this.room.getOwnerUserId());
        TT1 tt1 = this.applyOptPresenter;
        if (tt1 != null) {
            c74748TVg = tt1.LJIIIIZZ(getMultiGuestDataHolder().LJIIZILJ);
        } else {
            c74748TVg = null;
        }
        TSX tsx2 = (TSX) this.mView;
        if (tsx2 != null && tsx2.isApplyDialogShowing() && (tsx = (TSX) this.mView) != null) {
            tsx.forceDismissApplyDialog();
        }
        if (c74748TVg instanceof C74748TVg) {
            TSX tsx3 = (TSX) this.mView;
            if (tsx3 != null) {
                tsx3.showPreviewDialogWhenAnchorPermit(c74748TVg);
            }
        } else {
            TSX tsx4 = (TSX) this.mView;
            if (tsx4 != null) {
                tsx4.showPreviewDialogWhenAnchorPermit(null);
            }
        }
        TTV.LIZ().LIZ = true;
        C74838TYs.LJ().LJIIIZ(true);
        TTV.LIZ().LJ = true;
        this.guestInviteType = "guest_apply_anchor";
        C74696TTg.LIZIZ = "guest_apply_anchor";
    }

    public final void handleRTCInitMessage(C75745To5 c75745To5) {
        if (!this.isEnterBackground && this.mView != 0 && c75745To5 != null) {
            InterfaceC74605TPt liveVideoClient = getLiveVideoClient(false);
            this.gamelinkManager.LIZ(new C75745To5(c75745To5.LIZ, c75745To5.LIZIZ, new TSB(liveVideoClient), false, false, null, null, false, null, null, 2032));
            this.liveVideoClient = liveVideoClient;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handleRejectMessage(PermitApplyMessage permitApplyMessage) {
        TT0 LJ;
        Integer num = (Integer) this.linkPlayerState.LIZIZ;
        if (num == null || num.intValue() != 1) {
            return;
        }
        this.linkPlayerState.LJI(0);
        String str = "";
        if (this.dialogView != null && (LJ = this.gamelinkManager.LJ()) != null) {
            LJ.LIZJ("", null);
        }
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.nwd));
        getMultiGuestDataHolder().LJIIZILJ = -1;
        long userId = getUserId();
        int i = TTV.LIZ().LJIIJJI;
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(userId));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("action_type", BJM.LIZLLL());
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            if (idStr != null) {
                str = idStr;
            }
            hashMap.put("room_id", str);
            hashMap.put("connected_guest_cnt", String.valueOf(i));
            hashMap.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            TWL.LJIL("livesdk_guest_refused_connection_show", hashMap);
        }
        DataChannel dataChannel = this.dataChannel;
        if (!TV2.LJIILIIL(TV2.LJI())) {
            TV2.LJIIIIZZ(dataChannel);
        }
    }

    public final void leaveAction(boolean z) {
        if (this.mView == 0) {
            return;
        }
        TSV tsv = this.dialogView;
        if (tsv != null) {
            tsv.LLJL();
        }
        C74740TUy.LIZLLL().LIZLLL = 0L;
        resetStateToNormal();
        DataChannel dataChannel = this.dataChannel;
        if (!TV2.LJIILIIL(TV2.LJI())) {
            TV2.LJIIIIZZ(dataChannel);
        }
        if (z) {
            C74838TYs.LJ().getClass();
        }
    }

    public final void onFirstRemoteVideoFrameRender(String str) {
        if (this.mView == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Guest; interactId:");
        LIZ.append(str);
        TYP.LIZLLL("OnFirstRemoteVideoFrame", X1D.LIZIZ(LIZ));
        TTV.LIZ().LJFF = this.room.getIdStr();
        this.mDataChannel.qv0(InteractStateChangeEvent.class, new TW6(3));
    }

    public final boolean onInterceptPunishedMessageNew$livegamelinkmic_impl_release(PerceptionMessage perceptionMessage) {
        T t;
        Context context;
        C277116x c277116x;
        if (!MultiLivePerceptionSetting.isEnable() || perceptionMessage == null || perceptionMessage.dialog == null || (t = this.mView) == 0) {
            return false;
        }
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) t;
        if (interfaceC31336CRo != null && (context = interfaceC31336CRo.getContext()) != null) {
            PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
            if (perceptionDialogInfo != null) {
                T t2 = this.mView;
                o.LJII(t2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                C0NP.LIZLLL(perceptionDialogInfo, context, (LifecycleOwner) t2, getTaskDispatcher(), null, new AqS195S0100000_13(perceptionMessage, 18), 88);
            }
            PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
            if (perceptionDialogInfo2 != null && (c277116x = this.copyrightPerceptionHelper) != null) {
                c277116x.LIZIZ(perceptionDialogInfo2.countDownTime);
            }
            DataChannelGlobal.LJLJJI.rv0(MultiGuestLiveSuspended.class);
        }
        return true;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        PerceptionMessage perceptionMessage;
        PerceptionMessage perceptionMessage2;
        PerceptionDialogInfo perceptionDialogInfo;
        InterfaceC31336CRo interfaceC31336CRo;
        C277116x c277116x;
        C277116x c277116x2 = null;
        if ((iMessage instanceof PerceptionMessage) && (perceptionMessage = (PerceptionMessage) iMessage) != null && (perceptionMessage2 = (PerceptionMessage) iMessage) != null && (perceptionDialogInfo = perceptionMessage2.dialog) != null) {
            int i = perceptionDialogInfo.scene;
            if ((i != 4 && i != 5 && i != 7) || (interfaceC31336CRo = (InterfaceC31336CRo) this.mView) == null) {
                return;
            }
            if (i == 7) {
                long userId = getUserId();
                long id = this.room.getId();
                DataChannel dataChannel = this.dataChannel;
                o.LJIIIIZZ(dataChannel, "dataChannel");
                c277116x2 = new C277116x(userId, id, dataChannel);
            }
            this.copyrightPerceptionHelper = c277116x2;
            PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
            if (perceptionDialogInfo2 != null) {
                Context context = interfaceC31336CRo.getContext();
                o.LJIIIIZZ(context, "context");
                T t = this.mView;
                o.LJII(t, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                C0NP.LIZJ(perceptionDialogInfo2, context, (LifecycleOwner) t, getTaskDispatcher(), new AObjectS143S0100000_13(this, 4), new AObjectS143S0100000_13(this, 5), new AqS175S0200000_13(perceptionMessage, iMessage, 4), this.dataChannel);
            }
            PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage2.dialog;
            if (perceptionDialogInfo3 == null || (c277116x = this.copyrightPerceptionHelper) == null) {
                return;
            }
            c277116x.LIZIZ(perceptionDialogInfo3.countDownTime * 1000);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onReceiveManagePanelOpenEvent(TQI tqi) {
        FragmentManager fragmentManager;
        if (((Integer) C74740TUy.LIZLLL().LIZIZ).intValue() != 0 && (fragmentManager = (FragmentManager) this.mDataChannel.kv0(C29494Bhq.class)) != null) {
            C74684TSu openData = onReceiveManagePanelOpenEvent$getMultiGuestLinkedPreviewPanelOpenData(this, tqi);
            GameLinkMediaManagePanel gameLinkMediaManagePanel = this.multiLiveGuestPreviewDialog;
            if (gameLinkMediaManagePanel != null && gameLinkMediaManagePanel.isShowing()) {
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            TTR linkManager = this.gamelinkManager;
            o.LJIIIZ(openData, "openData");
            o.LJIIIZ(linkManager, "linkManager");
            GameLinkMediaManagePanel gameLinkMediaManagePanel2 = new GameLinkMediaManagePanel();
            gameLinkMediaManagePanel2.dataChannel = dataChannel;
            gameLinkMediaManagePanel2.LJLIL = GameLinkMediaManageFragment.vl(gameLinkMediaManagePanel2, dataChannel, openData.LJLIL, openData.LJLILLLLZI, linkManager);
            C78866UxK.LJIJJ(gameLinkMediaManagePanel2, 3, true, true, null, 0, 240);
            gameLinkMediaManagePanel2.show(fragmentManager, "MultiLiveGuestPreviewDialog");
            this.multiLiveGuestPreviewDialog = gameLinkMediaManagePanel2;
        }
    }

    public final void onTurnOffEngine(String str) {
        TVD multiGuestDataHolder = getMultiGuestDataHolder();
        multiGuestDataHolder.getClass();
        C0NB.LIZIZ("GameLinkDataHolder", "onLinkMicDisconnect");
        multiGuestDataHolder.LJIIIIZZ = true;
        ((Map) multiGuestDataHolder.LJIIL.getValue()).clear();
        multiGuestDataHolder.LJIILIIL = 0;
        multiGuestDataHolder.LJIILL = null;
    }

    public final void onUserJoined(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Guest; interactId:");
        LIZ.append(str);
        TYP.LIZLLL("OnUserJoined", X1D.LIZIZ(LIZ));
        getMultiGuestDataHolder();
        getMultiGuestDataHolder().LJIILIIL++;
        if (getMultiGuestDataHolder().LJIILIIL == 1) {
            Integer valueOf = Integer.valueOf(getMultiGuestDataHolder().LJIIJJI + 1);
            HashMap hashMap = new HashMap();
            TWL.LIZ(hashMap);
            hashMap.put("trigger", "connection_start");
            TWL.LJ();
            EnumC74778TWk enumC74778TWk = EnumC74778TWk.FLOATING;
            if (enumC74778TWk != null) {
                TWL.LJ = enumC74778TWk;
            }
            hashMap.put("layout_setting", TWL.LJFF().getFirst());
            hashMap.put("window_setting", TWL.LJFF().getSecond());
            if (valueOf != null) {
                C0EM.LIZJ(valueOf, hashMap, "guest_cnt");
            }
            TWL.LJIL("livesdk_multilive_mode_connection_start", hashMap);
            TWL.LJFF = System.currentTimeMillis();
            TWL.LJIJJ("connection_start", enumC74778TWk, null);
        }
    }

    public final void setDialogView(TSV tsv) {
        this.dialogView = tsv;
    }

    public final void tryToShowInvitedDialog(C74629TQr c74629TQr) {
        TU2 tu2;
        if (preCheckOfInviteMessage()) {
            TT2 tt2 = this.beInvitedOptPresenter;
            if (tt2 != null) {
                tu2 = tt2.LIZ();
            } else {
                tu2 = null;
            }
            this.beInvitedSharePlatform = c74629TQr.LJ;
            this.anchorInvitationPosition = c74629TQr.LJFF;
            showInvitedDialog(false, false, tu2);
        }
        C74838TYs.LJ().LJIILJJIL = c74629TQr.LIZ;
        TSY tsy = TSY.LJIIJ;
        String str = "";
        if (tsy != null) {
            String str2 = c74629TQr.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            tsy.LJI = str2;
            String str3 = c74629TQr.LIZIZ;
            if (str3 != null) {
                str = str3;
            }
            tsy.LJFF = str;
        }
    }

    private final void changeState(ChangeStateReq changeStateReq, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        changeStateReq.common = buildCommonReq();
        changeStateReq.clientTime = C30725C4b.LIZ();
        ((InterfaceC29856Bng) ((GameLinkApi) Q7L.LIZIZ(GameLinkApi.class)).changeState(changeStateReq).LJJJJL(new C77156UPw(this.isNetworkAvailable)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(autoDispose())).LIZJ(new AfS52S0300000_13(interfaceC88472Yns, this, changeStateReq, 2), new AfS65S0100000_13(interfaceC88472Yns, 76));
    }

    public static final C74684TSu onReceiveManagePanelOpenEvent$getMultiGuestLinkedPreviewPanelOpenData(GameLinkGuestPresenter gameLinkGuestPresenter, TQI tqi) {
        String str;
        String str2;
        String str3 = "";
        if (tqi == null || (str = tqi.LIZ) == null) {
            str = "";
        }
        String str4 = gameLinkGuestPresenter.getMultiGuestDataHolder().LJJ;
        if (str4 == null) {
            str4 = "";
        }
        if (tqi != null && (str2 = tqi.LIZIZ) != null) {
            str3 = str2;
        }
        return new C74684TSu(str, str4, str3);
    }

    private final void onRemoteAudioMute(String key, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("interactId = ");
        LIZ.append(key);
        LIZ.append(" mute:");
        LIZ.append(z);
        LIZ.append(",userid=");
        LIZ.append(getUserId());
        TYP.LIZJ("onRemoteAudioMute/guest", X1D.LIZIZ(LIZ));
        TVD multiGuestDataHolder = getMultiGuestDataHolder();
        multiGuestDataHolder.getClass();
        o.LJIIIZ(key, "key");
        ((Map) multiGuestDataHolder.LJIIL.getValue()).put(key, Boolean.valueOf(z));
        this.mDataChannel.qv0(GameLinkPlayerMuteAudioEvent.class, new C74677TSn(key, z));
    }

    private final void sendMessageAck(long j, int i) {
        GameLinkApi gameLinkApi = (GameLinkApi) Q7L.LIZIZ(GameLinkApi.class);
        AckStateReq ackStateReq = new AckStateReq();
        ackStateReq.common = buildCommonReq();
        ackStateReq.msgId = j;
        ackStateReq.msgType = i;
        ackStateReq.clientReceiveTime = System.currentTimeMillis();
        gameLinkApi.sendMessageAck(ackStateReq).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C74675TSl.LJLIL, C74671TSh.LJLIL);
    }

    private final void switchAudio(boolean z, String str) {
        InterfaceC74695TTf LLIIJLIL;
        String interactId;
        if (this.isEnterBackground && z && LinkMicMultiGuestV3BackgroundUseMediaFixSetting.INSTANCE.getValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchAudio is filtered because it is in the background, source: ");
            LIZ.append(str);
            TYP.LIZJ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ));
            return;
        }
        if (LinkMicMultiGuestV3BackgroundUseMediaFixSetting.INSTANCE.getValue() && (interactId = getInteractId()) != null) {
            TVD multiGuestDataHolder = getMultiGuestDataHolder();
            multiGuestDataHolder.getClass();
            ((Map) multiGuestDataHolder.LJIIL.getValue()).put(interactId, Boolean.valueOf(!z));
        }
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            LLIIJLIL.switchAudio(z);
            LLIIJLIL.LJIIIZ(str, z);
            LLIIJLIL.LIZLLL(str, !z);
        }
        StringBuilder LJI = JBR.LJI("switchAudio=isAudioEnable:", z, " , userid:");
        LJI.append(getUserId());
        TYP.LIZJ("GameLinkGuestPresenter", X1D.LIZIZ(LJI));
        InterfaceC74605TPt interfaceC74605TPt = this.liveVideoClient;
        if (interfaceC74605TPt == null || !(interfaceC74605TPt instanceof InterfaceC24140x8)) {
            return;
        }
        if (!z) {
            interfaceC74605TPt.LJFF(true, C78857UxB.LJJIIJ(1476788234, "bpea-game_linkmic_guestpre_switchaudio_true"));
        } else {
            interfaceC74605TPt.LJFF(false, C78857UxB.LJJIIJ(1476788483, "bpea-game_linkmic_guestpre_switchaudio_false"));
        }
    }

    public final void changeAudioStateAndSwitchAudio(boolean z, String str) {
        int i;
        switchAudio(z, str);
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.stateType = 3;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        changeStateReq.audioMuted = i;
        changeState(changeStateReq, C74681TSr.LJLIL);
        if (o.LJ(str, "business_mute_enter_background")) {
            ChangeStateReq changeStateReq2 = new ChangeStateReq();
            changeStateReq2.stateType = 2;
            changeStateReq2.onlineUserState = 2;
            changeState(changeStateReq2, C74682TSs.LJLIL);
            return;
        }
        if (!o.LJ(str, "business_mute_enter_foreground")) {
            return;
        }
        ChangeStateReq changeStateReq3 = new ChangeStateReq();
        changeStateReq3.stateType = 2;
        changeStateReq3.onlineUserState = 1;
        changeState(changeStateReq3, C74683TSt.LJLIL);
    }

    public final void onEndFailed(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Guest; code:");
        LIZ.append(i);
        LIZ.append("; desc:");
        LIZ.append(str);
        TYP.LIZLLL("OnEndFailed", X1D.LIZIZ(LIZ));
        this.isTurningOffEngine = false;
    }

    public final void onError(int i, String str) {
        C30868C9o.LIZJ(R.string.sun);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Guest; code:");
        LIZ.append(i);
        LIZ.append("; message:");
        LIZ.append(str);
        TYP.LIZLLL("OnError", X1D.LIZIZ(LIZ));
        String str2 = BYR.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onError: ");
        LIZ2.append(str);
        TYP.LIZIZ(str2, X1D.LIZIZ(LIZ2));
        onUnrecoverableErrorHappened();
    }

    public final void onRoomMsgReceived(String str, String message) {
        LinkLayerRTCMessageParam param;
        ArrayList<LinkLayerRTCMessageUser> users;
        o.LJIIIZ(message, "message");
        try {
            LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) C09650Zl.LIZIZ.LJI(message, LinkLayerRTCMessage.class);
            if (linkLayerRTCMessage != null) {
                Long timeStamp = linkLayerRTCMessage.getTimeStamp();
                if (timeStamp != null && timeStamp.longValue() > 0) {
                    C30725C4b.LIZ();
                }
                if (o.LJ(linkLayerRTCMessage.getMethod(), "linkMicSDKAudioMute") && (param = linkLayerRTCMessage.getParam()) != null && (users = param.getUsers()) != null) {
                    Iterator<LinkLayerRTCMessageUser> it = users.iterator();
                    while (it.hasNext()) {
                        LinkLayerRTCMessageUser next = it.next();
                        if (!o.LJ(next.getLinkMicId(), getInteractId())) {
                            String linkMicId = next.getLinkMicId();
                            boolean z = true;
                            if (next.getAudioMute() != 1) {
                                z = false;
                            }
                            onRemoteAudioMute(linkMicId, z);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C0NB.LJFF("GameLinkUtil", "", e);
        }
    }

    public final void onStartFailed(int i, String str) {
        if (this.mView == 0) {
            return;
        }
        C74838TYs.LJ().LJI();
        C30868C9o.LIZJ(R.string.sum);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Guest; code:");
        LIZ.append(i);
        LIZ.append("; desc:");
        LIZ.append(str);
        TYP.LIZLLL("OnStartFailed", X1D.LIZIZ(LIZ));
        TSX tsx = (TSX) this.mView;
        if (tsx != null) {
            tsx.onInteractFailed();
        }
    }

    public final void onUserLeft(String str, long j) {
        if (this.mView == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Guest; interactId:");
        LIZ.append(str);
        TYP.LIZLLL("OnUserLeaved", X1D.LIZIZ(LIZ));
        getMultiGuestDataHolder();
        TVD multiGuestDataHolder = getMultiGuestDataHolder();
        multiGuestDataHolder.LJIILIIL--;
    }

    public final void openSuspendDetailsPage(Context context, LatestBanRecordInfo latestBanRecordInfo) {
        int i;
        String str;
        if (latestBanRecordInfo != null) {
            i = latestBanRecordInfo.banSource;
            str = latestBanRecordInfo.detailUrl;
        } else {
            i = 1;
            str = null;
        }
        C28906BWc.LIZ(context, i, str, "link_mic", new AqS171S0100000_5(context, 376));
    }

    public final void showBanDialog(Context context, BYP byp) {
        LifecycleOwner lifecycleOwner;
        if (byp != null) {
            T t = this.mView;
            if (t instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) t;
            } else {
                lifecycleOwner = null;
            }
            C0NQ.LIZ(context, lifecycleOwner, byp.type, getTaskDispatcher(), new AqS109S0300000_5(this, context, lifecycleOwner, 1));
            return;
        }
        try {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void showGoLivePreviewDialog(Long l, int i) {
        TVD LIZ;
        long j;
        TSX tsx = (TSX) this.mView;
        if (tsx != null) {
            if (l != null || ((LIZ = TTV.LIZ()) != null && (l = Long.valueOf(LIZ.LJIJ)) != null)) {
                j = l.longValue();
            } else {
                j = 0;
            }
            tsx.tryToShowGoLivePreviewDialogWhenAccepted(false, null, null, j, i);
        }
    }

    public final void exitInteractInNormalWay(String source, boolean z, int i) {
        o.LJIIIZ(source, "source");
        C0NB.LJIIIZ("GameLinkGuestPresenter", "exitInteractInNormalWay");
        if (this.mView == 0) {
            return;
        }
        stopInteract(source, z, false, needForceCallLeaveChannel(source), i);
    }

    public final void exitInteractInNormalWayAfterFeedback(@InterfaceC74686TSw String disconnectionType, String str, int i) {
        String str2;
        String str3;
        InterfaceC74686TSw.LIZIZ.getClass();
        o.LJIIIZ(disconnectionType, "disconnectionType");
        if (o.LJ(disconnectionType, "profile_page")) {
            str2 = "quick_leave_normally";
        } else {
            str2 = "leave_normally";
        }
        this.sourceOfLeave = str2;
        TSY tsy = TSY.LJIIJ;
        if (tsy != null) {
            TSZ tsz = new TSZ(disconnectionType);
            MultiGuestDisconnectFeedbackUrlSetting multiGuestDisconnectFeedbackUrlSetting = MultiGuestDisconnectFeedbackUrlSetting.INSTANCE;
            boolean LJIJJLI = C29306Beo.LJIJJLI(multiGuestDisconnectFeedbackUrlSetting.getUrl());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("canShowFeedbackDialogBeforeDisconnected ");
            LIZ.append(LJIJJLI);
            LIZ.append(' ');
            LIZ.append(true);
            LIZ.append(' ');
            C74678TSo.LIZ(X1D.LIZIZ(LIZ));
            if (LJIJJLI) {
                Room room = tsy.LIZ;
                User guestUser = tsy.LIZIZ;
                TVD tvd = (TVD) tsy.LJ.getValue();
                if (tvd != null) {
                    str3 = tvd.LIZ();
                } else {
                    str3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
                }
                o.LJIIIZ(room, "room");
                o.LJIIIZ(guestUser, "guestUser");
                tsz.LJLJI = String.valueOf(guestUser.getId());
                String LIZ2 = C05170If.LIZ(room.getOwner());
                o.LJIIIIZZ(LIZ2, "getDisplayName(room.owner)");
                tsz.LJLJJI = LIZ2;
                tsz.LJLJJL = String.valueOf(room.getOwnerUserId());
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = "";
                }
                tsz.LJLJJLL = idStr;
                tsz.LJLILLLLZI = 484;
                tsz.LJLJL = str3;
                tsz.LJLJLJ = 1;
                C29682Bks LIZIZ = C29683Bkt.LIZIZ(multiGuestDisconnectFeedbackUrlSetting.getUrl());
                LIZIZ.LJIIJ(tsz.LJLILLLLZI, BY3.DP);
                C29682Bks.LJIJI(LIZIZ, 8);
                LIZIZ.LJJI("guest_id", tsz.LJLJI);
                LIZIZ.LJJI("room_id", tsz.LJLJJLL);
                LIZIZ.LJJI("anchor_id", tsz.LJLJJL);
                LIZIZ.LJJI("disconnection_type", tsz.LJLIL);
                LIZIZ.LJJI("guest_permission", String.valueOf(tsz.LJLJL));
                LIZIZ.LJJI("username", tsz.LJLJJI);
                LIZIZ.LJJI("multi_guest_disconnect_feedback", String.valueOf(tsz.LJLJLJ));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("linkmic_id", tsy.LJI);
                jSONObject.put("channel_id", tsy.LJFF);
                jSONObject.put("room_id", tsz.LJLJJLL);
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
                LIZIZ.LJJI("track_info", jSONObject2);
                LIZIZ.LJIJJ("bottom");
                LIZIZ.LJIIIZ("bottom");
                LIZIZ.LJIILIIL(2);
                ((HashMap) LIZIZ.LIZ).put("keyboard_compat", "1");
                Uri LIZ3 = LIZIZ.LIZ();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("showFeedbackLynxDialog ");
                LIZ4.append(LIZ3);
                C74678TSo.LIZ(X1D.LIZIZ(LIZ4));
                tsy.LIZ();
                InterfaceC06390Mx LIZ5 = CN1.LIZ(IHybridContainerService.class);
                o.LJIIIIZZ(LIZ5, "getService(T::class.java)");
                Context context = tsy.LIZJ;
                String uri = LIZ3.toString();
                o.LJIIIIZZ(uri, "lynxUrl.toString()");
                tsy.LJIIIIZZ = ((IHybridContainerService) LIZ5).Vs0(context, uri, null);
                TSX tsx = (TSX) this.mView;
                if (tsx != null) {
                    tsx.forceDismissApplyDialog();
                    return;
                }
                return;
            }
        }
        exitInteractInNormalWay$default(this, String.valueOf(this.sourceOfLeave), false, i, 2, null);
    }

    public final void handleUserTalkStateUpdated(List<String> list, List<Boolean> list2, List<Integer> list3) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty() || list3 == null || list3.isEmpty()) {
            return;
        }
        int size = list.size();
        String LIZLLL = C74838TYs.LJ().LIZLLL();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals((String) ListProtector.get(list, i2), LIZLLL) && C29306Beo.LJJIFFI((Boolean) ListProtector.get(list2, i2)) && ((Number) ListProtector.get(list3, i2)).intValue() > 0) {
                i = ((Number) ListProtector.get(list3, i2)).intValue();
            }
        }
        if (i > 0) {
            InterfaceC74605TPt interfaceC74605TPt = this.liveVideoClient;
            if (interfaceC74605TPt == null) {
                return;
            }
            interfaceC74605TPt.LJIIIIZZ();
            return;
        }
        InterfaceC74605TPt interfaceC74605TPt2 = this.liveVideoClient;
        if (interfaceC74605TPt2 == null) {
            return;
        }
        interfaceC74605TPt2.LJI();
    }

    public final void leaveChannel(String source, boolean z, int i) {
        o.LJIIIZ(source, "source");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leaveChannel(source=");
        LIZ.append(source);
        LIZ.append(", stopByLeaveMsg=");
        LIZ.append(z);
        LIZ.append(", leaveReason=");
        LIZ.append(i);
        TYP.LIZJ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ));
        if (this.isLeavingChannel) {
            return;
        }
        C74838TYs.LJ().LJJIIZ = true;
        this.isLeavingChannel = true;
        BizLeaveParams bizLeaveParams = new BizLeaveParams(this.room.getOwner().getId());
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null) {
            R6.LJJLIIIJ(new C76012TsO(source, 0L, bizLeaveParams, i, 2), new TSG(this, source, z));
        }
    }

    public final void popUpSuspendedDialog(LatestBanRecordInfo latestBanRecordInfo, Context context, LifecycleOwner lifecycleOwner) {
        String str;
        if (latestBanRecordInfo != null && (latestBanRecordInfo.banSource == 0 || (Long.valueOf(latestBanRecordInfo.banDuration) != null && (latestBanRecordInfo == null || latestBanRecordInfo.banDuration <= 0)))) {
            C30868C9o.LIZJ(R.string.nfo);
            return;
        }
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LIZIZ = lifecycleOwner;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILLIIL(R.string.lv6);
        c47071t1.LJII(generateMultiLiveSuspendedContent(latestBanRecordInfo));
        c47071t1.LJIIL(R.string.lv7, BYQ.LJLIL);
        LiveDialog LIZ = c47071t1.LIZ();
        C15N c15n = new C15N();
        c15n.LIZ(R.string.lv8, context);
        c15n.LIZIZ = new ACListenerS29S0400000_5(this, context, latestBanRecordInfo, LIZ, 0);
        LIZ.LJJ(new C38951fv(c15n));
        com_bytedance_android_livesdk_comp_impl_game_linkmic_presenter_GameLinkGuestPresenter_com_bytedance_android_live_design_app_LiveDialog_show(LIZ);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_linkmic_ban");
        LIZ2.LJIIZILJ();
        LIZ2.LJIIL("show");
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            str = "anchor";
        } else {
            str = "guest";
        }
        LIZ2.LJIJJ(str, "user_type");
        LIZ2.LJJIIJZLJL();
    }

    public final void showInvitedDialog(boolean z, boolean z2, TU2 tu2) {
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog;
        TTR gameLinkManager = this.gamelinkManager;
        o.LJIIIZ(gameLinkManager, "gameLinkManager");
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog2 = new GameLinkGuestBeInvitedDialog();
        gameLinkGuestBeInvitedDialog2.LJLJLLL = gameLinkManager;
        gameLinkGuestBeInvitedDialog2.LJLJL = tu2;
        gameLinkGuestBeInvitedDialog2.LJLJLJ = z;
        this.guestBeInvitedDialog = (GameLinkGuestBeInvitedDialog) C78866UxK.LJIJJ(gameLinkGuestBeInvitedDialog2, 1, false, false, C47261Igj.LJJIJIIJI(2, 3), 0, 218);
        FragmentManager fragmentManager = (FragmentManager) this.mDataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog3 = this.guestBeInvitedDialog;
            if (gameLinkGuestBeInvitedDialog3 != null && gameLinkGuestBeInvitedDialog3.isShowing() && (gameLinkGuestBeInvitedDialog = this.guestBeInvitedDialog) != null) {
                gameLinkGuestBeInvitedDialog.dismiss();
            }
            GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog4 = this.guestBeInvitedDialog;
            if (gameLinkGuestBeInvitedDialog4 != null) {
                gameLinkGuestBeInvitedDialog4.show(fragmentManager, GameLinkGuestPresenter.class.toString());
            }
            if (!z2) {
                doCheckLinkPermission$default(this, 2, false, null, null, null, null, 62, null);
            }
        }
        int i = TTV.LIZ().LJIIJJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_guest_receive_anchor_apply");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ("anchor_invite_guest", "guest_connection_type");
        LIZ.LJIJJ("live_studio", "live_type");
        LIZ.LJIJJ("room", "receive_invitation_platform");
        C78895Uxn.LIZIZ(LIZ, "others", "anchor_invite_position", i, "connected_guest_cnt");
        LIZ.LJIJJ(TWL.LJFF().getFirst(), "layout_setting");
        LIZ.LJIJJ(TWL.LJFF().getSecond(), "window_setting");
        LIZ.LJJIIJZLJL();
    }

    public GameLinkGuestPresenter(Room room, TTR gamelinkManager, DataChannel mDataChannel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(gamelinkManager, "gamelinkManager");
        o.LJIIIZ(mDataChannel, "mDataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.room = room;
        this.gamelinkManager = gamelinkManager;
        this.mDataChannel = mDataChannel;
        this.multiGuestDataHolder$delegate = C221108m2.LIZIZ(C74673TSj.LJLIL);
        this.linkMessageCenter$delegate = C221108m2.LIZIZ(C74672TSi.LJLIL);
        this.networkBroadcastReceiver$delegate = C221108m2.LIZIZ(C30864C9k.LJLIL);
        this.networkStatusListener = new C74667TSd(this);
        this.isNetworkAvailable = new C73849Syb<>();
        if (gamelinkManager.LJ() == null) {
            gamelinkManager.LJIIIZ(lifecycleOwner, mDataChannel);
        }
        this.replyAnchorState = EnumC74704TTo.NONE;
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "inst()");
        this.linkPlayerState = LIZLLL;
        this.guestInviteType = "";
        this.clientCachedStateVersion = new AtomicLong(0L);
        this.taskDispatcher$delegate = C221108m2.LIZIZ(new AqS163S0100000_13(this, 205));
        this.compositeDisposable$delegate = C221108m2.LIZIZ(TSH.LJLIL);
        this.linkStateMsgListener = new C74666TSc(this);
        this.userListChangeListener = new TSC(this);
        this.linkMicEventListener = new TS9(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkLinkPermissionAhead$default(GameLinkGuestPresenter gameLinkGuestPresenter, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC88472Yns = null;
        }
        gameLinkGuestPresenter.checkLinkPermissionAhead(interfaceC88472Yns);
    }

    public static /* synthetic */ void leaveAction$default(GameLinkGuestPresenter gameLinkGuestPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        gameLinkGuestPresenter.leaveAction(z);
    }

    private final void reportChangeStateEvent(int i, int i2, int i3, Throwable th) {
        String str;
        String str2;
        RtcUserInfo LLLLLJIL;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_change_state_result", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("change_state_result");
        LIZ.LJIJJ(Integer.valueOf(i), "state_type");
        LIZ.LJIJJ(Integer.valueOf(i2), "is_succeed");
        LIZ.LJIJJ(Integer.valueOf(i3), "error_code");
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        LIZ.LJIJJ(str, "error_msg");
        InterfaceC75441TjB R6 = this.gamelinkManager.R6();
        if (R6 != null && (LLLLLJIL = R6.LLLLLJIL()) != null) {
            str2 = LLLLLJIL.getLinkMicId();
        } else {
            str2 = null;
        }
        C1FL.LJI(LIZ, str2, "link_id");
    }

    public final void reportLog(LinkListUser linkListUser, boolean z, String str, boolean z2) {
        String str2;
        long j;
        User user;
        TWL twl = TWL.LIZ;
        TT0 LJ = this.gamelinkManager.LJ();
        if (LJ != null) {
            if (linkListUser != null && (user = linkListUser.user) != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            str2 = LJ.LIZIZ(j);
        } else {
            str2 = null;
        }
        twl.LJIIIZ(TV2.LIZJ(linkListUser, getMultiGuestDataHolder()), str2, str, "normal");
    }

    public static /* synthetic */ void changeAudioStateAndSwitchAudio$default(GameLinkGuestPresenter gameLinkGuestPresenter, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "business_unknown";
        }
        gameLinkGuestPresenter.changeAudioStateAndSwitchAudio(z, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r0 != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void stopInteract(java.lang.String r6, boolean r7, boolean r8, boolean r9, int r10) {
        /*
            r5 = this;
            T extends X.91o r0 = r5.mView
            if (r0 != 0) goto Lc
            java.lang.String r1 = "GameLinkGuestPresenter"
            java.lang.String r0 = "stopInteract:viewInterface==null"
            X.C0NB.LJIIIZ(r1, r0)
            return
        Lc:
            X.C74837TYr.LJIIIIZZ(r6)
            int r0 = r6.hashCode()
            java.lang.String r2 = "quick_leave_normally"
            java.lang.String r3 = "leave_with_detach_view"
            java.lang.String r1 = "leave_normally"
            java.lang.String r4 = "leave_with_kicked_out"
            switch(r0) {
                case -2033363707: goto L91;
                case -1331253956: goto L88;
                case -700436896: goto L7e;
                case 1608498638: goto L74;
                default: goto L1e;
            }
        L1e:
            java.lang.String r0 = "others"
        L20:
            X.C74696TTg.LIZ(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r2)
            if (r0 == 0) goto L72
        L29:
            r2 = 1
            if (r9 != 0) goto L3b
        L2d:
            X.TVD r0 = X.TTV.LIZ()
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L44
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r4)
            if (r0 != 0) goto L44
        L3b:
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r3)
            r5.leaveChannel(r1, r7, r10)
            if (r0 == 0) goto L66
        L44:
            X.TVD r1 = r5.getMultiGuestDataHolder()
            r0 = -1
            r1.LJIIZILJ = r0
            X.TYs r0 = X.C74838TYs.LJ()
            r1 = 0
            r0.LJIIIZ(r1)
            X.TVD r0 = X.TTV.LIZ()
            r0.LJ = r1
            r0 = 0
            leaveAction$default(r5, r1, r2, r0)
            X.TVD r0 = X.TTV.LIZ()
            r0.LIZ = r1
            r5.turnOffEngine()
        L66:
            com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager r1 = X.TS1.LIZ()
            if (r1 == 0) goto L71
            X.TQl r0 = X.C74623TQl.LJLIL
            r1.iv0(r0)
        L71:
            return
        L72:
            r1 = r6
            goto L29
        L74:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L7b
            goto L1e
        L7b:
            java.lang.String r0 = "guest_over_quickly"
            goto L20
        L7e:
            boolean r0 = r6.equals(r3)
            if (r0 != 0) goto L85
            goto L1e
        L85:
            java.lang.String r0 = "connection_end"
            goto L20
        L88:
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "guest_over"
            goto L20
        L91:
            boolean r0 = r6.equals(r4)
            if (r0 != 0) goto L98
            goto L1e
        L98:
            java.lang.String r0 = "anchor_kick_out_guest"
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter.stopInteract(java.lang.String, boolean, boolean, boolean, int):void");
    }

    public static /* synthetic */ void switchAudio$default(GameLinkGuestPresenter gameLinkGuestPresenter, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "business_unknown";
        }
        gameLinkGuestPresenter.switchAudio(z, str);
    }

    private final void doCheckLinkPermission(int i, boolean z, InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super Long, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super Long, ? super Integer, C76800UCe> interfaceC88471Ynr2) {
        C74768TWa.LIZIZ(this.room, this.mDataChannel, (TSX) this.mView, i, z, interfaceC88472Yns, interfaceC65784Pro, interfaceC88471Ynr, interfaceC88471Ynr2);
    }

    public static /* synthetic */ void exitInteractInNormalWay$default(GameLinkGuestPresenter gameLinkGuestPresenter, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        gameLinkGuestPresenter.exitInteractInNormalWay(str, z, i);
    }

    public static /* synthetic */ void leaveChannel$default(GameLinkGuestPresenter gameLinkGuestPresenter, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        gameLinkGuestPresenter.leaveChannel(str, z, i);
    }

    public static /* synthetic */ void showInvitedDialog$default(GameLinkGuestPresenter gameLinkGuestPresenter, boolean z, boolean z2, TU2 tu2, int i, Object obj) {
        if ((i & 4) != 0) {
            tu2 = null;
        }
        gameLinkGuestPresenter.showInvitedDialog(z, z2, tu2);
    }

    public static /* synthetic */ void reportChangeStateEvent$default(GameLinkGuestPresenter gameLinkGuestPresenter, int i, int i2, int i3, Throwable th, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            th = null;
        }
        gameLinkGuestPresenter.reportChangeStateEvent(i, i2, i3, th);
    }

    public static /* synthetic */ void stopInteract$default(GameLinkGuestPresenter gameLinkGuestPresenter, String str, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        gameLinkGuestPresenter.stopInteract(str, z, z2, z3, i);
    }

    public static /* synthetic */ void doCheckLinkPermission$default(GameLinkGuestPresenter gameLinkGuestPresenter, int i, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2, int i2, Object obj) {
        InterfaceC88471Ynr interfaceC88471Ynr3 = interfaceC88471Ynr;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        boolean z2 = z;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        InterfaceC88471Ynr interfaceC88471Ynr4 = null;
        if ((i2 & 4) != 0) {
            interfaceC88472Yns2 = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC65784Pro2 = null;
        }
        if ((i2 & 16) != 0) {
            interfaceC88471Ynr3 = null;
        }
        if ((i2 & 32) == 0) {
            interfaceC88471Ynr4 = interfaceC88471Ynr2;
        }
        gameLinkGuestPresenter.doCheckLinkPermission(i, z2, interfaceC88472Yns2, interfaceC65784Pro2, interfaceC88471Ynr3, interfaceC88471Ynr4);
    }
}
