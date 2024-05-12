package X;

import Y.AObjectS143S0100000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.OnSelfWindowCreatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3GuestOpenStatusDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.liveinteract.voicechat.main.common.BackgroundTimeOutEvent;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestLinkMicHeadSetToast;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLivePerceptionSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TQV extends AbstractC31497CXt<InterfaceC74617TQf> implements OnMessageListener {
    public static final /* synthetic */ int LLFII = 0;
    public final Room LJLIL;
    public InterfaceC74605TPt LJLJI;
    public boolean LJLJJI;
    public VoiceChatUserInfoFragment LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public MultiGuestV3GuestBeInvitedDialog LJLJLLL;
    public GuestBusinessUserManager LJLL;
    public final C74740TUy LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public TTT LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public C277116x LJZ;
    public final C62822Ol8 LJZI;
    public String LJZL;
    public Boolean LL;
    public boolean LLD;
    public boolean LLF;
    public final TRL LLFF;
    public final C74618TQg LLFFF;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;
    public EnumC74703TTn LJLILLLLZI = EnumC74703TTn.NONE;
    public boolean LJLJJL = true;

    public final void LJJJJJL() {
        SurfaceView surfaceView;
        String str;
        U8H LJJZZI;
        InterfaceC74695TTf LLIIJLIL;
        if (this.LLD && this.LLF) {
            C0NB.LJIIIZ("VoiceChatWatchPresenter", "startPushStream");
            InterfaceC74605TPt interfaceC74605TPt = this.LJLJI;
            if (interfaceC74605TPt != null) {
                interfaceC74605TPt.LIZLLL();
            }
            Object obj = this.LJLJI;
            String str2 = null;
            if ((obj instanceof SurfaceView) && (surfaceView = (SurfaceView) obj) != null) {
                C87277YNd.LJJIIZ(surfaceView);
            } else {
                surfaceView = null;
            }
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
                LLIIJLIL.LJIIL(TokenCert.Companion.with("bpea-voice-linkmic_guestpre_pushstreamforpreviewahead"));
            }
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LJJZZI = R62.LJJZZI()) != null) {
                LJJZZI.LJJLIL(surfaceView);
            }
            if (1 == MultiGuestV3GuestLinkMicHeadSetToast.getValue()) {
                if (C31026CFq.LIZ.LIZIZ()) {
                    C30868C9o.LIZJ(R.string.n_0);
                    str = "connected";
                } else {
                    C30868C9o.LIZJ(R.string.n9z);
                    str = "try_headphones";
                }
                String str3 = this.LJLLILLLL;
                int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
                EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
                boolean z = getMultiGuestDataHolder().LJ;
                IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                if (iInteractService != null) {
                    str2 = iInteractService.BF(false, this.LJLIL);
                }
                boolean z2 = !getMultiGuestDataHolder().LIZLLL;
                String LIZLLL = C74838TYs.LJ().LIZLLL();
                o.LJIIIIZZ(LIZLLL, "inst().linkMicId");
                C75457TjR.LJIILLIIL(str, str3, LJJJJZI, LIZJ, z, str2, z2, LIZLLL);
            }
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

    public final void resetStateToNormal() {
        this.dataChannel.qv0(InteractStateChangeEvent.class, new TW6(4));
        C74740TUy.LIZLLL().LJI(0);
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((InterfaceC74617TQf) t).X9(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        TRS trs;
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 2) {
            stopInteract("leave_with_detach_view", false, false, 0);
        }
        C8E.LJ().X3(this.LLFFF);
        resetStateToNormal();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        TTT ttt = this.LJLLL;
        if ((ttt instanceof AbstractC31497CXt) && ttt != null) {
            ttt.detachView();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (trs = (TRS) C79004UzY.LJIL(dataChannel2, TQ8.class)) != null) {
            trs.LIZLLL(this.LLFF);
            trs.release();
        }
        C88207Yjb.LJIJ();
        C88207Yjb.LJIILL();
        C74838TYs.LJ().LJIIIIZZ = true;
        super.detachView();
    }

    public final long getUserId() {
        return C025908h.LIZ();
    }

    public TQV(Room room) {
        this.LJLIL = room;
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "inst()");
        this.LJLLI = LIZLLL;
        this.LJLLILLLL = "";
        this.LJLLLLLL = true;
        this.LJLZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 164));
        this.LJZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 163));
        this.LLFF = new TRL(this);
        C75559Tl5.LIZIZ.LIZLLL(this);
        this.LLFFF = new C74618TQg(this);
    }

    public static boolean LJJJJJ(String str) {
        if (o.LJ(str, "leave_source_user_click_cancel_in_preview") || o.LJ(str, "leave_source_user_timeout_cancel_in_preview") || (o.LJ(str, "play_pip_window") && LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC74617TQf interfaceC74617TQf) {
        Context context;
        TQW tqw;
        Room room;
        IMessageManager iMessageManager;
        super.attachView((TQV) interfaceC74617TQf);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            GuestBusinessUserManager guestBusinessUserManager = new GuestBusinessUserManager(room, C78886Uxe.LJJJLIIL(C8E.LJ()), iMessageManager, (LifecycleOwner) this.mView);
            this.LJLL = guestBusinessUserManager;
            C75559Tl5.LIZIZ.LJI(guestBusinessUserManager, "MULTI_GUEST_V3_GUEST_USER_MANAGER");
            guestBusinessUserManager.LJLLILLLL = getMultiGuestDataHolder();
            guestBusinessUserManager.LJ(this.LLFF);
            guestBusinessUserManager.init();
            TQW tqw2 = (TQW) dataChannel.kv0(C74971Tbb.class);
            if (tqw2 != null) {
                tqw2.LIZIZ(guestBusinessUserManager);
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (tqw = (TQW) dataChannel2.kv0(C74971Tbb.class)) != null) {
            tqw.LIZIZ(new N4U(new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap()));
        }
        C8E.LJ().e3(this.LLFFF);
        Room room2 = this.LJLIL;
        DataChannel dataChannel3 = this.dataChannel;
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
        if (interfaceC31336CRo != null) {
            context = interfaceC31336CRo.getContext();
        } else {
            context = null;
        }
        TTT ttt = new TTT(new TTZ(context, room2, dataChannel3), this);
        ttt.attachView((TTT) interfaceC74617TQf);
        this.LJLLL = ttt;
        User owner = this.LJLIL.getOwner();
        ((InterfaceC29856Bng) ((LinkApi) Q7L.LIZIZ(LinkApi.class)).isShowGuestLinkHint(this.LJLIL.getId(), owner.getId(), owner.getSecUid(), true).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(autoDispose())).LIZJ(new AfS65S0100000_13(this, 99), C72970SkQ.LJLIL);
        C74838TYs.LJ().LJIIIIZZ = true;
        IMessageManager iMessageManager2 = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        if (iMessageManager2 != null && MultiLivePerceptionSetting.isEnable()) {
            iMessageManager2.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this);
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.mv0(LinkInRoomGuestReplySucceedEvent.class, this, new AqS179S0100000_13(this, 247));
            dataChannel4.mv0(LinkInRoomGuestReplyFailedEvent.class, this, new AqS179S0100000_13(this, 248));
            dataChannel4.mv0(MultiGuestV3GuestOpenStatusDialogEvent.class, this, new AqS179S0100000_13(this, 249));
            dataChannel4.mv0(BackgroundTimeOutEvent.class, this, new AqS179S0100000_13(this, LiveCoverMinSizeSetting.DEFAULT));
            dataChannel4.mv0(OnSelfWindowCreatedEvent.class, this, new AqS179S0100000_13(this, 251));
        }
    }

    public final void leaveAction(boolean z) {
        LiveDialogFragment liveDialogFragment;
        if (this.mView == 0) {
            return;
        }
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = this.LJLJJLL;
        if (voiceChatUserInfoFragment != null && (liveDialogFragment = voiceChatUserInfoFragment.LJLJI) != null) {
            liveDialogFragment.dismiss();
        }
        C74740TUy.LIZLLL().LIZLLL = 0L;
        resetStateToNormal();
        C74776TWi.LJIIIZ(this.dataChannel);
        if (z) {
            C74838TYs.LJ().getClass();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        PerceptionMessage perceptionMessage;
        PerceptionMessage perceptionMessage2;
        PerceptionDialogInfo perceptionDialogInfo;
        InterfaceC31336CRo interfaceC31336CRo;
        C277116x c277116x;
        C277116x c277116x2 = null;
        if ((iMessage instanceof PerceptionMessage) && (perceptionMessage = (PerceptionMessage) iMessage) != null && (perceptionMessage2 = (PerceptionMessage) iMessage) != null && (perceptionDialogInfo = perceptionMessage2.dialog) != null) {
            int i = perceptionDialogInfo.scene;
            if ((i != 1 && i != 7 && i != 4 && i != 5) || (interfaceC31336CRo = (InterfaceC31336CRo) this.mView) == null) {
                return;
            }
            if (i == 7) {
                long userId = getUserId();
                long id = this.LJLIL.getId();
                DataChannel dataChannel = this.dataChannel;
                o.LJIIIIZZ(dataChannel, "dataChannel");
                c277116x2 = new C277116x(userId, id, dataChannel);
            }
            this.LJZ = c277116x2;
            PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
            if (perceptionDialogInfo2 != null) {
                Context context = interfaceC31336CRo.getContext();
                o.LJIIIIZZ(context, "context");
                T t = this.mView;
                o.LJII(t, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                C0NP.LIZJ(perceptionDialogInfo2, context, (LifecycleOwner) t, (InterfaceC74834TYo) this.LJLZ.getValue(), new AObjectS143S0100000_13(this, 2), new AObjectS143S0100000_13(this, 3), new AqS195S0100000_13(perceptionMessage, 15), this.dataChannel);
            }
            PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage2.dialog;
            if (perceptionDialogInfo3 == null || (c277116x = this.LJZ) == null) {
                return;
            }
            c277116x.LIZIZ(perceptionDialogInfo3.countDownTime * 1000);
        }
    }

    public static void LJJJJI(TQV tqv, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            LJJJJIZL(tqv, 1, null, new AqS195S0100000_13(tqv, 31), 30);
            return;
        }
        LJJJJIZL(tqv, 0, new AqS195S0100000_13(tqv, 32), null, 46);
    }

    public final void exitInteractInNormalWay(String str, boolean z, int i) {
        if (this.mView == 0) {
            return;
        }
        stopInteract(str, z, LJJJJJ(str), i);
    }

    public final void stopInteract(String str, boolean z, boolean z2, int i) {
        String str2;
        U8H LJJZZI;
        if (this.mView == 0) {
            return;
        }
        this.LLD = false;
        this.LLF = false;
        C29556Biq.LIZ().getClass();
        C74736TUu.LJIJJLI(str, C74983Tbn.LIZJ(), false);
        if (o.LJ(str, "quick_leave_normally")) {
            str2 = "leave_normally";
        } else {
            str2 = str;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.LJJJ = true;
        }
        getMultiGuestDataHolder().LJJIJLIJ = -1;
        C74838TYs.LJ().LJIIIZ(false);
        if ((z2 || (this.LJLJLJ && !o.LJ(str, "leave_with_kicked_out") && !o.LJ(str, "leave_with_detach_view"))) && (this.LJLJJL || !LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt())) {
            if (!this.LJLJL) {
                C74838TYs.LJ().LJJIIZ = true;
                this.LJLJL = true;
                C75159Ted.LIZ.getClass();
                C75159Ted.LIZJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("position:leaveChannel; roomId:");
                LIZ.append(this.LJLIL.getId());
                TYQ.LIZLLL("LinkIn_leave", X1D.LIZIZ(LIZ));
                BizLeaveParams bizLeaveParams = new BizLeaveParams(this.LJLIL.getOwner().getId());
                InterfaceC75441TjB R62 = C8E.LJ().R6();
                if (R62 != null) {
                    R62.LJJLIIIJ(new C76012TsO(str2, 0L, bizLeaveParams, i, 2), new TQL(this, z));
                }
            }
        } else {
            leaveAction(false);
            this.LJLJJL = true;
        }
        C74951TbH.LIZLLL(this.dataChannel, str, false);
        this.LJLJLJ = false;
        C74838TYs.LJ().LJI();
        TYQ.LJFF("LinkIn_turnOffEngine", "");
        C74824TYe.LJJLIIJ("connection_end");
        InterfaceC74605TPt interfaceC74605TPt = this.LJLJI;
        if (interfaceC74605TPt != null) {
            interfaceC74605TPt.release(TokenCert.Companion.with("bpea-voice-linkmic_guestpre_releaselivevideoclient"));
        }
        this.LJLJI = null;
        MultiGuestDialogManager LIZ2 = TS1.LIZ();
        if (LIZ2 != null) {
            LIZ2.iv0(C74623TQl.LJLIL);
        }
        TQ6.LIZIZ = "";
        C75027TcV.LIZLLL = 0L;
    }

    public static void LJJJJIZL(TQV tqv, int i, AqS195S0100000_13 aqS195S0100000_13, AqS195S0100000_13 aqS195S0100000_132, int i2) {
        AqS195S0100000_13 aqS195S0100000_133 = aqS195S0100000_13;
        AqS195S0100000_13 aqS195S0100000_134 = aqS195S0100000_132;
        if ((i2 & 16) != 0) {
            aqS195S0100000_133 = null;
        }
        if ((i2 & 32) != 0) {
            aqS195S0100000_134 = null;
        }
        C74770TWc.LIZIZ(tqv.LJLIL, tqv.dataChannel, (InterfaceC74617TQf) tqv.mView, i, false, null, null, aqS195S0100000_133, aqS195S0100000_134);
    }
}
