package com.bytedance.android.live.liveinteract.multihost.core.adapter;

import X.AbstractC75865Tq1;
import X.B5A;
import X.B5G;
import X.C00F;
import X.C05170If;
import X.C06510Nj;
import X.C07780Sg;
import X.C0MT;
import X.C0NB;
import X.C0RN;
import X.C17280m4;
import X.C1FL;
import X.C28272B7s;
import X.C30868C9o;
import X.C31731Ccp;
import X.C32208CkW;
import X.C32537Cpp;
import X.C32I;
import X.C38350F3i;
import X.C44432HcC;
import X.C44878HjO;
import X.C48359IyR;
import X.C51029K0z;
import X.C58580Myu;
import X.C5UN;
import X.C61845OOz;
import X.C61878OQg;
import X.C65777Prh;
import X.C75234Tfq;
import X.C75501Tk9;
import X.C75504TkC;
import X.C75588TlY;
import X.C75589TlZ;
import X.C75597Tlh;
import X.C75600Tlk;
import X.C75607Tlr;
import X.C75612Tlw;
import X.C75619Tm3;
import X.C75621Tm5;
import X.C75633TmH;
import X.C75635TmJ;
import X.C75642TmQ;
import X.C75648TmW;
import X.C75677Tmz;
import X.C75681Tn3;
import X.C75683Tn5;
import X.C75728Tno;
import X.C75732Tns;
import X.C75737Tnx;
import X.C75745To5;
import X.C75749To9;
import X.C75759ToJ;
import X.C75768ToS;
import X.C75786Tok;
import X.C75869Tq5;
import X.C75873Tq9;
import X.C75877TqD;
import X.C75878TqE;
import X.C75880TqG;
import X.C75881TqH;
import X.C75883TqJ;
import X.C75884TqK;
import X.C75885TqL;
import X.C75890TqQ;
import X.C75891TqR;
import X.C75892TqS;
import X.C75893TqT;
import X.C75896TqW;
import X.C75898TqY;
import X.C75899TqZ;
import X.C75900Tqa;
import X.C75901Tqb;
import X.C75902Tqc;
import X.C75903Tqd;
import X.C75904Tqe;
import X.C75910Tqk;
import X.C75911Tql;
import X.C75912Tqm;
import X.C75914Tqo;
import X.C75917Tqr;
import X.C75918Tqs;
import X.C75919Tqt;
import X.C75934Tr8;
import X.C75935Tr9;
import X.C75939TrD;
import X.C75951TrP;
import X.C75952TrQ;
import X.C75993Ts5;
import X.C76005TsH;
import X.C76117Tu5;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76611U4x;
import X.C76684U7s;
import X.C76689U7x;
import X.C76690U7y;
import X.C76696U8e;
import X.C76800UCe;
import X.C76965UIn;
import X.C78934UyQ;
import X.C8E;
import X.CMB;
import X.CN1;
import X.EnumC31946CgI;
import X.EnumC75419Tip;
import X.EnumC75614Tly;
import X.EnumC75620Tm4;
import X.EnumC75672Tmu;
import X.EnumC75775ToZ;
import X.EnumC75780Toe;
import X.EnumC75909Tqj;
import X.EnumC75915Tqp;
import X.FP1;
import X.FT5;
import X.IRX;
import X.InterfaceC28213B5l;
import X.InterfaceC74695TTf;
import X.InterfaceC74805TXl;
import X.InterfaceC75179Tex;
import X.InterfaceC75414Tik;
import X.InterfaceC75441TjB;
import X.InterfaceC75706TnS;
import X.InterfaceC75787Tol;
import X.InterfaceC75923Tqx;
import X.InterfaceC75941TrF;
import X.InterfaceC75973Trl;
import X.InterfaceC76112Tu0;
import X.InterfaceC76620U5g;
import X.InterfaceC76688U7w;
import X.InterfaceC78493UrJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC92693kP;
import X.JBR;
import X.N2J;
import X.OLS;
import X.OLT;
import X.OLU;
import X.OLV;
import X.OLX;
import X.ORZ;
import X.OSZ;
import X.TRA;
import X.TW6;
import X.U62;
import X.U65;
import X.U6Y;
import X.U7D;
import X.U8E;
import X.U8H;
import X.U9O;
import X.UB4;
import X.V10;
import X.X1D;
import Y.ARunnableS0S0102200_13;
import Y.ARunnableS28S0200000_9;
import Y.IDComparatorS41S0000000_13;
import Y.IDLListenerS58S0200000_4;
import Y.IDo0S413S0100000_13;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.AdjustVideoInteractStreamBottomEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkCoHostLeaveChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.event.PlayerChangeLayoutParamEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorBroadcastResolutionChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3ShowEmptyViewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStreamStatsEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchSeiBattleIdUpdateChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CoHostInProgressChanged;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PlayerData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCross2v2ManagerFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomFixAudienceSessionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostMultiAdatperFixAnr1Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.EnableCoHostDetailedDisableReasonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostCrossExclusiveFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostCrossUserInfoFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioSupportCohostSetting;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.LinkmicUser;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;
import webcast.data.cohost_biz.BizJoinGroupParams;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;
import webcast.data.cohost_biz.BizPermitJoinGroupParams;
import webcast.im.CohostContent;
import webcast.im.GroupChangeContent;
import webcast.im.PermitJoinGroupBizContent;

/* loaded from: classes14.dex */
public class MultiHostCrossAdapterImpl implements IMultiHostCrossAdapter, U62, U6Y, InterfaceC76112Tu0, InterfaceC76620U5g, InterfaceC28213B5l, InterfaceC78493UrJ {
    public static final C75873Tq9 LLFFF = new C75873Tq9();
    public static boolean LLFII;
    public static boolean LLFZ;
    public boolean LJLIL;
    public InterfaceC74805TXl LJLILLLLZI;
    public InterfaceC75441TjB LJLJI;
    public C75745To5 LJLJJI;
    public DataChannel LJLJLJ;
    public LinkCrossRoomDataHolder LJLJLLL;
    public Room LJLL;
    public boolean LJLLI;
    public PlayerData LJLLJ;
    public boolean LJLLL;
    public InterfaceC92693kP LJLLLL;
    public int LJLZ;
    public boolean LJZ;
    public long LJZL;
    public long LL;
    public boolean LLD;
    public final ConcurrentHashMap<Class<?>, List<InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe>>> LJLJJL = new ConcurrentHashMap<>();
    public final C75884TqK LJLJJLL = new C75884TqK();
    public EnumC75620Tm4 LJLJL = EnumC75620Tm4.None;
    public OSZ<Integer, Integer> LJLLILLLL = new OSZ<>(0, 0);
    public final C75880TqG LJLLLLLL = new C75880TqG();
    public final ConcurrentHashMap<String, Integer> LJZI = new ConcurrentHashMap<>();
    public final C75881TqH LLF = new C75881TqH(this);
    public final U8E LLFF = new U8E();

    @Override // X.U62
    public final void LJ(long j, int i) {
    }

    @Override // X.U62
    public final void LJIJI(String str, String str2) {
    }

    @Override // X.U62
    public final void LJIJJ(Map<String, String> map) {
    }

    @Override // X.U62
    public final void LJJIFFI() {
    }

    @Override // X.U62
    public final void LJJIJIL(String linkMicId, boolean z, boolean z2) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJJIZ(String[] strArr, boolean[] zArr, int[] iArr) {
    }

    @Override // X.U62
    public final void LJJJJZI(U65 session, String str) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // X.InterfaceC75594Tle
    public final List<C75883TqJ> LJIILJJIL() {
        if (this.LJLJI == null) {
            return C61878OQg.INSTANCE;
        }
        if (this.LJLL == null) {
            return C61878OQg.INSTANCE;
        }
        return this.LJLLLLLL.LIZJ();
    }

    @Override // X.InterfaceC75594Tle
    public final List<C75883TqJ> LJIL() {
        if (this.LJLJI == null) {
            return C61878OQg.INSTANCE;
        }
        if (this.LJLL == null) {
            return C61878OQg.INSTANCE;
        }
        C75880TqG c75880TqG = this.LJLLLLLL;
        Room room = c75880TqG.LIZ;
        if (room == null) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        long ownerUserId = room.getOwnerUserId();
        C75883TqJ c75883TqJ = c75880TqG.LIZIZ.get(Long.valueOf(ownerUserId));
        if (c75883TqJ != null) {
            arrayList.add(c75883TqJ);
        }
        Collection<C75883TqJ> values = c75880TqG.LIZIZ.values();
        o.LJIIIIZZ(values, "userMap.values");
        ArrayList arrayList2 = new ArrayList();
        for (C75883TqJ c75883TqJ2 : values) {
            C75883TqJ c75883TqJ3 = c75883TqJ2;
            if (!c75883TqJ3.LIZLLL(Long.valueOf(ownerUserId)) && c75883TqJ3.LJJI == EnumC75909Tqj.LINKED) {
                arrayList2.add(c75883TqJ2);
            }
        }
        arrayList.addAll(ORZ.LLILII(new IDComparatorS41S0000000_13(10), arrayList2));
        Collection<C75883TqJ> values2 = c75880TqG.LIZIZ.values();
        o.LJIIIIZZ(values2, "userMap.values");
        ArrayList arrayList3 = new ArrayList();
        for (C75883TqJ c75883TqJ4 : values2) {
            C75883TqJ c75883TqJ5 = c75883TqJ4;
            if (!c75883TqJ5.LIZLLL(Long.valueOf(ownerUserId)) && c75883TqJ5.LJJI != EnumC75909Tqj.LINKED) {
                arrayList3.add(c75883TqJ4);
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJIIJZLJL() {
        StringBuilder LIZJ = b1.LIZJ("detach", ", isAttached = ");
        FT5.LJ(LIZJ, this.LJLIL, LIZJ, "MultiHostCrossAdapter");
        if (!this.LJLIL) {
            return;
        }
        InterfaceC74805TXl interfaceC74805TXl = this.LJLILLLLZI;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.LJIIIIZZ(this);
        }
        InterfaceC74805TXl interfaceC74805TXl2 = this.LJLILLLLZI;
        if (interfaceC74805TXl2 != null) {
            interfaceC74805TXl2.dispose();
        }
        LLJJJ("detach");
        C75880TqG c75880TqG = this.LJLLLLLL;
        c75880TqG.LIZIZ.clear();
        c75880TqG.LIZLLL.clear();
        ((ArrayList) c75880TqG.LIZJ).clear();
        c75880TqG.LJFF.clear();
        c75880TqG.LIZ = null;
        this.LJLIL = false;
        LJJJJJ("detach", false);
        this.LJLJLJ = null;
        C75884TqK c75884TqK = this.LJLJJLL;
        c75884TqK.LIZIZ();
        c75884TqK.LIZJ = null;
        this.LJLILLLLZI = null;
        this.LJLJLLL = null;
        this.LJLJJL.clear();
        this.LJLL = null;
        InterfaceC92693kP interfaceC92693kP = this.LJLLLL;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        LLFII = false;
        LLFZ = false;
        this.LJZ = false;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
        InterfaceC75441TjB interfaceC75441TjB;
        U8H LJJZZI;
        C76696U8e LJJIII;
        if (LLJJJJLIIL("onLayoutSwitched") && this.LJLLI && (interfaceC75441TjB = this.LJLJI) != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            LJJIII.LJIIJ(null);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJIJ() {
        if (this.LJZ && C76265TwT.LIZ.LJJLI != 0) {
            return true;
        }
        return false;
    }

    @Override // X.U62
    public final void LJJIJIIJIL() {
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.pv0(AnchorBroadcastResolutionChangeEvent.class);
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
        if (this.LJLLI) {
            new C75878TqE().LJIILLIIL("enter_background");
        }
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJJJLI() {
        if (!this.LJLIL) {
            LLFII = MtCoHostCrossRoomPushSetting.isEnable();
            LLFZ = MtCoHostCrossRoomPushSDKSetting.isEnable();
        }
        if (LLFZ && (LLFII || !this.LJLLI)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75594Tle
    public final long LJJLI() {
        InterfaceC75973Trl LLIIJI;
        Long LJJIJIIJI;
        if (this.LJLLI) {
            InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
            if (interfaceC75441TjB == null || (LLIIJI = interfaceC75441TjB.LLIIJI()) == null || (LJJIJIIJI = LLIIJI.LJJIJIIJI()) == null) {
                return 0L;
            }
            return LJJIJIIJI.longValue();
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
        if (linkCrossRoomDataHolder == null) {
            return 0L;
        }
        return linkCrossRoomDataHolder.LJFF;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
        U8H LJJZZI;
        C76696U8e LJJIII;
        U8H LJJZZI2;
        C76696U8e LJJIII2;
        if (!LLJJJJLIIL("onWindowRefreshFinished")) {
            return;
        }
        if (this.LJLLI) {
            InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
            if (interfaceC75441TjB != null && (LJJZZI2 = interfaceC75441TjB.LJJZZI()) != null && (LJJIII2 = LJJZZI2.LJJIII()) != null) {
                LJJIII2.LJIIJ(null);
                return;
            }
            return;
        }
        InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
        if (interfaceC75441TjB2 == null || (LJJZZI = interfaceC75441TjB2.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null) {
            return;
        }
        LJJIII.LJIIJ(this.LJLLJ);
    }

    @Override // X.InterfaceC75594Tle
    public final void LJLLLLLL() {
        C0NB.LJIIIZ("MultiHostCrossAdapter", "refreshUserList");
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJJI(null);
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        if (this.LJLLI) {
            new C75878TqE().LJIILLIIL("enter_foreground");
        }
    }

    @Override // X.InterfaceC75594Tle
    public final long LLIILZL() {
        String LLLLLLIL;
        Long LJJIZ;
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null && (LLLLLLIL = interfaceC75441TjB.LLLLLLIL()) != null && (LJJIZ = C38350F3i.LJJIZ(LLLLLLIL)) != null) {
            return LJJIZ.longValue();
        }
        return 0L;
    }

    public final void LLJLL() {
        C0NB.LJIIIZ("MultiHostCrossAdapter", "resetToFullScreen");
        B5A b5a = new B5A(-1, -1, 0, 0, 0, true, this);
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.qv0(PlayerChangeLayoutParamEvent.class, b5a);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final long S6() {
        if (this.LL != LJJLI()) {
            return this.LL;
        }
        return 0L;
    }

    @Override // X.InterfaceC75594Tle
    public final void e1() {
        InterfaceC75441TjB interfaceC75441TjB;
        U8H LJJZZI;
        if (LLJJIJIIJIL("unregisterBusinessExtraInfoListener") && (interfaceC75441TjB = this.LJLJI) != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJL();
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJJJLL() {
        InterfaceC75441TjB interfaceC75441TjB;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomClose");
        LIZ.append(", finishReason=");
        LIZ.append(3);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        new C75878TqE().LJJJZ(3, null);
        if (!LLJJJJLIIL("onRoomClose") || (interfaceC75441TjB = this.LJLJI) == null) {
            return;
        }
        LLJJJIL(interfaceC75441TjB, new C75935Tr9(3, -1, null));
    }

    @Override // X.InterfaceC75594Tle
    public final void LLF() {
        DataChannel dataChannel;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recoverMultiGuest, isAnchor=");
        LIZ.append(this.LJLLI);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LJLJLJ);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLLI && (dataChannel = this.LJLJLJ) != null) {
            dataChannel.qv0(CoHostInProgressChanged.class, new IRX(2));
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void LLIZLLLIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("closeWithModeSwitch, state = ");
        LIZ.append(this.LJLJL);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LJLLJ(new OLX("leave_with_mode_switch", 0L, 62), new C75869Tq5());
        if (this.LJLJL == EnumC75620Tm4.Received) {
            LLJLILLLLZIIL("closeWithModeSwitch", true);
        } else {
            LLJLILLLLZIIL("closeWithModeSwitch", true);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJIIJ() {
        return this.LJZ;
    }

    @Override // X.InterfaceC75594Tle
    public final InterfaceC75441TjB LJJIJL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC75594Tle
    public final EnumC75620Tm4 LLII() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC75594Tle
    public final boolean q3() {
        return this.LLD;
    }

    public static boolean LLJJJJLIIL(String str) {
        if (C8E.LIZLLL().eU("is_cross_arc_active_inner")) {
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("is_cross_arc_active_inner");
        LIZ.append(", false, source=");
        LIZ.append(str);
        LIZ.append(", isCrossArcActiveInner=false");
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        return false;
    }

    @Override // X.InterfaceC28213B5l
    public final void J2(C75234Tfq c75234Tfq) {
        InterfaceC75441TjB interfaceC75441TjB;
        U8H LJJZZI;
        C76696U8e LJJIII;
        this.LJLLJ = new PlayerData(c75234Tfq.LJLIL, c75234Tfq.LJLILLLLZI, c75234Tfq.LJLJI, c75234Tfq.LJLJJI, c75234Tfq.LJLJJL, c75234Tfq.LJLJJLL, c75234Tfq.LJLJL, c75234Tfq.LJLJLJ, c75234Tfq.LJLJLLL, c75234Tfq.LJLL);
        if (!this.LJLLI && (interfaceC75441TjB = this.LJLJI) != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            LJJIII.LJIIJ(this.LJLLJ);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJI(long j) {
        if (this.LJLJI == null) {
            return null;
        }
        return this.LJLLLLLL.LIZLLL(j);
    }

    @Override // X.U62
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
        C0NB.LJIIIZ("MultiHostCrossAdapter", "onNeedJoinChannel");
        if (!LLJJJJLIIL("onNeedJoinChannel")) {
            return;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJIIIIZZ(true);
        }
        if (C44432HcC.LIZLLL()) {
            C0NB.LJIIIZ("MultiHostCrossAdapter", "onNeedJoinChannel: canPreJoinChannel");
            LLJJIJIL(null);
            C0NB.LJIIIZ("MultiHostCrossAdapter", "onNeedJoinChannel: joinChannel");
            interfaceC75941TrF.joinChannel();
            new C75878TqE().LJJJLIIL(0, 0, 0L);
            return;
        }
        LLJJIJIL(new ARunnableS0S0102200_13(interfaceC75941TrF, SystemClock.uptimeMillis(), 0));
    }

    @Override // X.U62
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPreResetImmediately");
        LIZ.append(", source=");
        LIZ.append(source);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LLJILLL(source);
    }

    @Override // X.U62
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.U62
    public final InterfaceC76688U7w LJJIII(U65 session) {
        o.LJIIIZ(session, "session");
        return C75885TqL.LIZ;
    }

    @Override // X.U6Y
    public final void LJJIJIIJI(long j) {
        String LIZ = C61845OOz.LIZ("onInviteGroupTimerTimeout, uid=", j);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ);
        LIZ2.append(", uid = ");
        LIZ2.append(j);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        if (!LLJJJJLIIL(LIZ) || this.LJLJI == null) {
            return;
        }
        if (EnableCoHostDetailedDisableReasonSetting.INSTANCE.getValue()) {
            C30868C9o.LIZJ(R.string.kh8);
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c75878TqE.LJIILLIIL("invite_timeout");
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_INVITE);
        LLJLLIL(j, LIZ);
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.U6Y
    public final void LJJJJI(long j) {
        C44878HjO.LIZJ("onApplyTimerCancel, uid = ", j, "MultiHostCrossAdapter");
    }

    @Override // X.U6Y
    public final void LJJJJJL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C75877TqD.LJIILIIL = linkMicId;
    }

    @Override // X.U6Y
    public final void LJJJLIIL(long j) {
        C44878HjO.LIZJ("onInviteTimerCancel, uid = ", j, "MultiHostCrossAdapter");
    }

    @Override // X.U6Y
    public final void LJJJLZIJ(long j) {
        C44878HjO.LIZJ("onApplyTimerTimeout, uid = ", j, "MultiHostCrossAdapter");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        DataChannel dataChannel;
        o.LJIIIZ(seiAppData, "seiAppData");
        if (LLJJJJLIIL("onSeiBattleIdUpdated") && (dataChannel = this.LJLJLJ) != null) {
            dataChannel.rv0(MatchSeiBattleIdUpdateChannel.class, seiAppData);
        }
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJJZZIII(boolean z) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelAll_cross_arc");
        LIZ.append(", isCancelApply=");
        LIZ.append(z);
        LIZ.append(", mLinkMicSession = ");
        LIZ.append(this.LJLJI);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (z) {
            i = R.string.kmj;
        } else {
            i = R.string.kme;
        }
        C30868C9o.LIZJ(i);
        for (Map.Entry<Long, C75883TqJ> entry : this.LJLLLLLL.LIZIZ.entrySet()) {
            StringBuilder LIZJ = b1.LIZJ("cancelAll_cross_arc", ", user = ");
            LIZJ.append(entry.getValue());
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            if (entry.getValue().LJ()) {
                C75884TqK c75884TqK = this.LJLJJLL;
                long longValue = entry.getKey().longValue();
                EnumC75915Tqp enumC75915Tqp = EnumC75915Tqp.OTHER;
                c75884TqK.LIZJ(longValue, 0L, enumC75915Tqp);
                this.LJLJJLL.LIZJ(entry.getValue().LIZLLL, 0L, enumC75915Tqp);
            }
        }
        if (LiveCoHostCrossExclusiveFixSetting.INSTANCE.isEnable()) {
            if (this.LJLJL == EnumC75620Tm4.Linked) {
                LLJILLL("cancelAll_cross_arc");
                return;
            } else {
                LLJLILLLLZIIL("cancelAll_cross_arc", true);
                return;
            }
        }
        LLJLILLLLZIIL("cancelAll_cross_arc", true);
    }

    @Override // X.U6Y
    public final void LJLJI(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyGroupTimerCancel");
        LIZ.append(", uid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onApplyGroupTimerCancel") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_APPLY);
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJLL(String linkMicId) {
        Object obj;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (this.LJLJI == null) {
            return null;
        }
        C75880TqG c75880TqG = this.LJLLLLLL;
        c75880TqG.getClass();
        Iterator it = C5UN.LJJLJLI(c75880TqG.LIZIZ).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (TextUtils.equals(((C75883TqJ) ((OSZ) obj).getSecond()).LJII, linkMicId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        OSZ osz = (OSZ) obj;
        if (osz == null) {
            return null;
        }
        return (C75883TqJ) osz.getSecond();
    }

    @Override // X.U62
    public final void LLD(U65 session) {
        o.LJIIIZ(session, "session");
        C0NB.LJIIIZ("MultiHostCrossAdapter", "onLinkMicLayoutEndAsAudience");
        if (!LLJJJJLIIL("onLinkMicLayoutEndAsAudience")) {
            return;
        }
        long LJJLI = LJJLI();
        StringBuilder LIZJ = b1.LIZJ("onLinkMicLayoutEndAsAudience", ", inner_channel_id = ");
        LIZJ.append(session.LLLLLLIL());
        LIZJ.append(", group_channel_id = ");
        LIZJ.append(LJJLI);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
        if (!this.LJLLI) {
            new C75600Tlk().LJIILLIIL("widget_unload");
            this.LJLLL = true;
            LLJLL();
            LLJLLL(EnumC75620Tm4.Finished, false);
            LLJJJIL(session, new C75501Tk9(false));
            LLJLILLLLZIIL("onLinkMicLayoutEndAsAudience", true);
            if (LiveGameLiveStudioSupportCohostSetting.INSTANCE.isExperimentGroup()) {
                if (C78934UyQ.LJIL(this.LJLJLJ) == LiveMode.LIVE_STUDIO || C78934UyQ.LJIL(this.LJLJLJ) == LiveMode.THIRD_PARTY) {
                    C30868C9o.LIZJ(R.string.muw);
                }
            }
        }
    }

    @Override // X.U62
    public final void LLFII(U65 session) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder;
        o.LJIIIZ(session, "session");
        C0NB.LJIIIZ("MultiHostCrossAdapter", "onLinkMicLayoutBeginAsAudience");
        if (!LLJJJJLIIL("onLinkMicLayoutBeginAsAudience")) {
            return;
        }
        long LJJLI = LJJLI();
        StringBuilder LIZJ = b1.LIZJ("onLinkMicLayoutBeginAsAudience", ", inner_channel_id = ");
        LIZJ.append(session.LLLLLLIL());
        LIZJ.append(", group_channel_id = ");
        LIZJ.append(LJJLI);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
        if (!this.LJLLI) {
            this.LJLLL = false;
            C75600Tlk c75600Tlk = new C75600Tlk();
            C75877TqD.LJII = EnumC31946CgI.CROSS_ROOM_ARCH.getType();
            C75877TqD.LJ = SystemClock.uptimeMillis();
            C75877TqD.LJFF = false;
            c75600Tlk.LJIILLIIL("widget_load");
            if (LJJLI > 0 && (linkCrossRoomDataHolder = this.LJLJLLL) != null) {
                linkCrossRoomDataHolder.LJFF = LJJLI;
            }
            LLJJJIL(session, new C75501Tk9(true));
        }
    }

    @Override // X.InterfaceC75594Tle
    public final long LLI(long j) {
        Long l = this.LJLJJLL.LIZIZ.get(Long.valueOf(j));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Override // X.U6Y
    public final void LLIIII(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteTimerTimeout");
        LIZ.append(", uid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LLIILII(C28272B7s sei) {
        o.LJIIIZ(sei, "sei");
    }

    @Override // X.U62
    public final UB4 LLIL(InterfaceC75441TjB session) {
        o.LJIIIZ(session, "session");
        return C75914Tqo.LIZ;
    }

    @Override // X.U62
    public final void LLILZ(U65 session) {
        DataChannel dataChannel;
        o.LJIIIZ(session, "session");
        if (LLJJJJLIIL("onStartPushStream") && this.LJLLI && (dataChannel = this.LJLJLJ) != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(7));
        }
    }

    @Override // X.U6Y
    public final void LLILZIL(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteGroupTimerCancel");
        LIZ.append(", uid=");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onInviteGroupTimerCancel") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_INVITE);
    }

    @Override // X.U6Y
    public final void LLILZLL(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyGroupTimerTimeout");
        LIZ.append(", uid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onApplyGroupTimerTimeout") || this.LJLJI == null) {
            return;
        }
        if (EnableCoHostDetailedDisableReasonSetting.INSTANCE.getValue()) {
            C30868C9o.LIZJ(R.string.kh8);
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c75878TqE.LJIILLIIL("apply_timeout");
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_APPLY);
        LLJLLIL(j, "onApplyGroupTimerTimeout");
    }

    @Override // X.InterfaceC76620U5g
    public final void LLJILJIL(InterfaceC75441TjB session) {
        o.LJIIIZ(session, "session");
        EnumC75780Toe LJLJLLL = session.LJLJLLL();
        StringBuilder LIZJ = b1.LIZJ("onSessionCreate", ", session scene = ");
        LIZJ.append(session.scene());
        LIZJ.append(", session type = ");
        LIZJ.append(LJLJLLL);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
        if (session.scene() == 2 && LJLJLLL == EnumC75780Toe.LiveLinkMicSession) {
            session.LLLLLIL(C58580Myu.LIZ);
            InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
            if (interfaceC75441TjB == null) {
                StringBuilder LIZJ2 = b1.LIZJ("onSessionCreate", ", session change, oldSession=");
                LIZJ2.append(this.LJLJI);
                LIZJ2.append(", newSession=");
                LIZJ2.append(session);
                LIZJ2.append(", init newSession");
                C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ2));
                this.LJLJI = session;
                LLJJJJJIL(session);
                return;
            }
            if (!o.LJ(interfaceC75441TjB, session)) {
                StringBuilder LIZJ3 = b1.LIZJ("onSessionCreate", ", session change, oldSession=");
                LIZJ3.append(this.LJLJI);
                LIZJ3.append(", newSession=");
                LIZJ3.append(session);
                LIZJ3.append(", destroy oldSession");
                C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ3));
                LLJJJ("onSessionCreate");
                this.LJLJI = session;
                LLJJJJJIL(session);
                return;
            }
            StringBuilder LIZJ4 = b1.LIZJ("onSessionCreate", ", session same, oldSession=");
            LIZJ4.append(this.LJLJI);
            LIZJ4.append(", newSession=");
            LIZJ4.append(session);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ4));
        }
    }

    public final C75883TqJ LLJILJILJ(long j) {
        C75768ToS c75768ToS;
        User owner;
        C75880TqG c75880TqG = this.LJLLLLLL;
        c75880TqG.getClass();
        C75883TqJ LIZLLL = c75880TqG.LIZLLL(C44432HcC.LJI());
        if (LIZLLL == null) {
            LIZLLL = c75880TqG.LIZ(C44432HcC.LJI());
            Room room = c75880TqG.LIZ;
            if (room != null && (owner = room.getOwner()) != null) {
                c75768ToS = C44432HcC.LJIILL(owner);
            } else {
                c75768ToS = null;
            }
            LIZLLL.LJIIZILJ = c75768ToS;
        }
        LIZLLL.LIZLLL = j;
        return LIZLLL;
    }

    public final void LLJILLL(String str) {
        StringBuilder LIZLLL = C1FL.LIZLLL("cancelAndRefuseAllInternal", ", source = ", str, ", isAnchor=");
        FT5.LJ(LIZLLL, this.LJLLI, LIZLLL, "MultiHostCrossAdapter");
        if (!this.LJLLI || !LLJJIJIIJIL("cancelAndRefuseAllInternal") || this.LJLJI == null) {
            return;
        }
        ConcurrentHashMap<Long, C75883TqJ> userMap = this.LJLLLLLL.LIZIZ;
        boolean z = this.LJLLI;
        o.LJIIIZ(userMap, "userMap");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelAndRefuseAll");
        LIZ.append(", source = ");
        LIZ.append("cancelAndRefuseAllInternal");
        LIZ.append(", isAnchor=");
        LIZ.append(z);
        C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZ));
        if (!z) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("refuseAllUser");
        LIZ2.append(", source = ");
        LIZ2.append("cancelAndRefuseAll");
        C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZ2));
        Collection<C75883TqJ> values = userMap.values();
        o.LJIIIIZZ(values, "userMap.values");
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : values) {
            C75883TqJ c75883TqJ2 = c75883TqJ;
            if (c75883TqJ2.LJJI == EnumC75909Tqj.INVITED && c75883TqJ2.LJFF() && c75883TqJ2.LJJIII != null) {
                arrayList.add(c75883TqJ);
            }
        }
        StringBuilder LIZLLL2 = C1FL.LIZLLL("auto_refuseInvited_new_arc", ", source = ", "cancelAndRefuseAll", ", invited userList.size = ");
        LIZLLL2.append(arrayList.size());
        C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C75883TqJ c75883TqJ3 = (C75883TqJ) it.next();
            StringBuilder LIZLLL3 = C1FL.LIZLLL("auto_refuseInvited_new_arc", ", source = ", "cancelAndRefuseAll", ", invited user.uid=");
            LIZLLL3.append(c75883TqJ3.LIZ);
            LIZLLL3.append(", user.rivalUserId=");
            C0RN.LJ(LIZLLL3, c75883TqJ3.LIZLLL, LIZLLL3, "MultiHostPreLeaveCheckHelper");
            long j = c75883TqJ3.LIZIZ;
            long j2 = c75883TqJ3.LIZ;
            long j3 = c75883TqJ3.LIZJ;
            BizPermitJoinGroupParams bizPermitJoinGroupParams = new BizPermitJoinGroupParams();
            bizPermitJoinGroupParams.replyStatus = 18;
            LLJLIL(new C75952TrQ(j, j2, j3, 2, bizPermitJoinGroupParams, "reset"), null, null);
        }
        Collection<C75883TqJ> values2 = userMap.values();
        o.LJIIIIZZ(values2, "userMap.values");
        ArrayList arrayList2 = new ArrayList();
        for (C75883TqJ c75883TqJ4 : values2) {
            C75883TqJ c75883TqJ5 = c75883TqJ4;
            if (c75883TqJ5.LJJI == EnumC75909Tqj.APPLIED && c75883TqJ5.LJFF() && c75883TqJ5.LJJIII != null) {
                arrayList2.add(c75883TqJ4);
            }
        }
        StringBuilder LIZLLL4 = C1FL.LIZLLL("auto_refuseApplied_new_arc", ", source = ", "cancelAndRefuseAll", ", applied userList.size = ");
        LIZLLL4.append(arrayList2.size());
        C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL4));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C75883TqJ c75883TqJ6 = (C75883TqJ) it2.next();
            StringBuilder LIZLLL5 = C1FL.LIZLLL("auto_refuseApplied_new_arc", ", source = ", "cancelAndRefuseAll", ", applied user.uid=");
            LIZLLL5.append(c75883TqJ6.LIZ);
            LIZLLL5.append(", user.rivalUserId=");
            C0RN.LJ(LIZLLL5, c75883TqJ6.LIZLLL, LIZLLL5, "MultiHostPreLeaveCheckHelper");
            long j4 = c75883TqJ6.LIZIZ;
            long j5 = c75883TqJ6.LIZ;
            long j6 = c75883TqJ6.LIZJ;
            BizPermitJoinGroupParams bizPermitJoinGroupParams2 = new BizPermitJoinGroupParams();
            bizPermitJoinGroupParams2.replyStatus = 18;
            LLJL(new C75951TrP(j4, j5, j6, 2, bizPermitJoinGroupParams2, "reset"), null, null);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("cancelAllUser");
        LIZ3.append(", source = ");
        LIZ3.append("cancelAndRefuseAll");
        C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZ3));
        Collection<C75883TqJ> values3 = userMap.values();
        o.LJIIIIZZ(values3, "userMap.values");
        ArrayList arrayList3 = new ArrayList();
        for (C75883TqJ c75883TqJ7 : values3) {
            C75883TqJ c75883TqJ8 = c75883TqJ7;
            if (c75883TqJ8.LJJI == EnumC75909Tqj.INVITED && c75883TqJ8.LJFF() && c75883TqJ8.LJJIII == null) {
                arrayList3.add(c75883TqJ7);
            }
        }
        StringBuilder LIZLLL6 = C1FL.LIZLLL("auto_cancelInvited_new_arc", ", source = ", "cancelAndRefuseAll", ", invited userList.size = ");
        LIZLLL6.append(arrayList3.size());
        C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL6));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C75883TqJ c75883TqJ9 = (C75883TqJ) it3.next();
            StringBuilder LIZLLL7 = C1FL.LIZLLL("auto_cancelInvited_new_arc", ", source = ", "cancelAndRefuseAll", ", invited user.uid=");
            LIZLLL7.append(c75883TqJ9.LIZ);
            LIZLLL7.append(", user.rivalUserId=");
            LIZLLL7.append(c75883TqJ9.LIZLLL);
            C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL7));
            LLJJIII(new C75919Tqt(c75883TqJ9.LIZIZ, c75883TqJ9.LIZ, c75883TqJ9.LIZJ, "reset"), null);
        }
        Collection<C75883TqJ> values4 = userMap.values();
        o.LJIIIIZZ(values4, "userMap.values");
        ArrayList arrayList4 = new ArrayList();
        for (C75883TqJ c75883TqJ10 : values4) {
            C75883TqJ c75883TqJ11 = c75883TqJ10;
            if (c75883TqJ11.LJJI == EnumC75909Tqj.APPLIED && c75883TqJ11.LJFF() && c75883TqJ11.LJJIII == null) {
                arrayList4.add(c75883TqJ10);
            }
        }
        StringBuilder LIZLLL8 = C1FL.LIZLLL("auto_cancelApplied_new_arc", ", source = ", "cancelAndRefuseAll", ", handler userList.size = ");
        LIZLLL8.append(arrayList4.size());
        C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL8));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            C75883TqJ c75883TqJ12 = (C75883TqJ) it4.next();
            if (LiveCoHostCrossExclusiveFixSetting.INSTANCE.isEnable()) {
                if (c75883TqJ12.LJIIIIZZ && c75883TqJ12.LJIIIZ) {
                    StringBuilder LIZLLL9 = C1FL.LIZLLL("auto_cancelApplied_new_arc", ", source = ", "cancelAndRefuseAll", ", handler user.uid=");
                    LIZLLL9.append(c75883TqJ12.LIZ);
                    LIZLLL9.append(", user.rivalUserId=");
                    LIZLLL9.append(c75883TqJ12.LIZLLL);
                    LIZLLL9.append(", is 2v2=true");
                    C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL9));
                    LLJJI(new C75918Tqs(c75883TqJ12.LJIIL, c75883TqJ12.LJIIJJI, c75883TqJ12.LJIILIIL, "reset"), null);
                    return;
                }
                StringBuilder LIZLLL10 = C1FL.LIZLLL("auto_cancelApplied_new_arc", ", source = ", "cancelAndRefuseAll", ", handler user.uid=");
                LIZLLL10.append(c75883TqJ12.LIZ);
                LIZLLL10.append(", user.rivalUserId=");
                LIZLLL10.append(c75883TqJ12.LIZLLL);
                LIZLLL10.append(", is 2v2=false");
                C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL10));
                LLJJI(new C75918Tqs(c75883TqJ12.LIZIZ, c75883TqJ12.LIZ, c75883TqJ12.LIZJ, "reset"), null);
            } else {
                StringBuilder LIZLLL11 = C1FL.LIZLLL("auto_cancelApplied_new_arc", ", source = ", "cancelAndRefuseAll", ", handler user.uid=");
                LIZLLL11.append(c75883TqJ12.LIZ);
                LIZLLL11.append(", user.rivalUserId=");
                LIZLLL11.append(c75883TqJ12.LIZLLL);
                C0NB.LJIIIZ("MultiHostPreLeaveCheckHelper", X1D.LIZIZ(LIZLLL11));
                LLJJI(new C75918Tqs(c75883TqJ12.LIZIZ, c75883TqJ12.LIZ, c75883TqJ12.LIZJ, "reset"), null);
            }
        }
    }

    public final void LLJJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelAndRefuseAllOnLeave");
        LIZ.append(", source=");
        LIZ.append(str);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LLJILLL("cancelAndRefuseAllOnLeave");
    }

    public final boolean LLJJIJIIJIL(String str) {
        if (this.LJLJI != null) {
            return true;
        }
        StringBuilder LIZLLL = C1FL.LIZLLL("checkLinkMicSession", ", false, source=", str, ", mLinkMicSession=");
        LIZLLL.append(this.LJLJI);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZLLL));
        return false;
    }

    public final void LLJJIJIL(Runnable runnable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("closeMultiGuest, isAnchor=");
        LIZ.append(this.LJLLI);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", callback=");
        LIZ.append(runnable);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        DataChannel dataChannel = this.LJLJLJ;
        if (this.LJLLI) {
            if (dataChannel != null) {
                dataChannel.qv0(CoHostInProgressChanged.class, new IRX(runnable, true));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("closeMultiGuest: exception, dataChannel = null, callback=");
            LIZ2.append(runnable);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    public final void LLJJJ(String str) {
        LLJLILLLLZIIL("destroyGroupSession", true);
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyGroupSession");
        LIZ.append(", source = ");
        LIZ.append(str);
        LIZ.append("  mLinkMicSession = ");
        LIZ.append(interfaceC75441TjB);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (interfaceC75441TjB == null) {
            return;
        }
        LLJJJIL(interfaceC75441TjB, new C75683Tn5(str));
        interfaceC75441TjB.LLIILII(this);
        U8H LJJZZI = interfaceC75441TjB.LJJZZI();
        if (LJJZZI != null) {
            LJJZZI.p1(this);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dispose_");
        LIZ2.append(str);
        interfaceC75441TjB.LJJLI(X1D.LIZIZ(LIZ2));
        interfaceC75441TjB.LLLLL(this);
        this.LJLJI = null;
    }

    public final void LLJJJJJIL(InterfaceC75441TjB interfaceC75441TjB) {
        String cohostLayoutId;
        InterfaceC74695TTf LLIIJLIL;
        if (interfaceC75441TjB == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initLinkMicSession");
            LIZ.append(", source=");
            LIZ.append("onSessionCreate");
            LIZ.append(", return by session=null");
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
            return;
        }
        interfaceC75441TjB.LLLLLIL(C58580Myu.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initLinkMicSession");
        LIZ2.append(", source=");
        LIZ2.append("onSessionCreate");
        LIZ2.append(", mLinkMicSession = ");
        LIZ2.append(Integer.valueOf(interfaceC75441TjB.hashCode()));
        LIZ2.append(", register listener finished");
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("initLinkMicSession");
        LIZ3.append(", session scene = ");
        LIZ3.append(Integer.valueOf(interfaceC75441TjB.scene()));
        LIZ3.append(", session type = ");
        LIZ3.append(interfaceC75441TjB.LJLJLLL());
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
        C75745To5 c75745To5 = this.LJLJJI;
        if (c75745To5 != null && (LLIIJLIL = interfaceC75441TjB.LLIIJLIL()) != null) {
            LLIIJLIL.LIZ(c75745To5);
        }
        interfaceC75441TjB.LJJJIL(this);
        interfaceC75441TjB.LJJZ(this);
        U8H LJJZZI = interfaceC75441TjB.LJJZZI();
        if (LJJZZI != null) {
            LJJZZI.m1(this);
        }
        if (this.LJLLI) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("initLinkMicSession");
            LIZ4.append(", source=");
            LIZ4.append("onSessionCreate");
            LIZ4.append(", anchor createChannel start");
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ4));
            if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
                cohostLayoutId = "2003";
            } else {
                cohostLayoutId = MultiCohostAreaExpandSetting.INSTANCE.getCohostLayoutId();
            }
            interfaceC75441TjB.LLILL(new C76611U4x(4, cohostLayoutId, null, null), new C75898TqY(this, interfaceC75441TjB), null);
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("initLinkMicSession");
        LIZ5.append(", source=");
        LIZ5.append("onSessionCreate");
        LIZ5.append(", audience create session success");
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ5));
    }

    @Override // X.InterfaceC75594Tle
    public final void onSei(C28272B7s c28272B7s) {
        InterfaceC74805TXl interfaceC74805TXl;
        C0NB.LJIIIZ("MultiHostCrossAdapter", "onSei");
        if (LLJJJJLIIL("onSei") && (interfaceC74805TXl = this.LJLILLLLZI) != null) {
            interfaceC74805TXl.LJFF(c28272B7s, null);
        }
    }

    public static void LLJJJJ(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, String str) {
        Integer num;
        if (multiHostCrossAdapterImpl.LJJJJLI()) {
            InterfaceC75441TjB interfaceC75441TjB = multiHostCrossAdapterImpl.LJLJI;
            MtCoHostCrossRoomFixAudienceSessionSetting.isEnable();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ensureGroupSession");
            LIZ.append(", source=");
            LIZ.append(str);
            LIZ.append(", mLinkMicSession=");
            InterfaceC75441TjB interfaceC75441TjB2 = null;
            if (interfaceC75441TjB != null) {
                num = Integer.valueOf(interfaceC75441TjB.hashCode());
            } else {
                num = null;
            }
            LIZ.append(num);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
            if (interfaceC75441TjB != null) {
                return;
            }
            if (multiHostCrossAdapterImpl.LJLLI) {
                StringBuilder LIZJ = b1.LIZJ("ensureGroupSession", ", obtainSession, isAnchor=");
                LIZJ.append(multiHostCrossAdapterImpl.LJLLI);
                LIZJ.append(", source=");
                LIZJ.append(str);
                C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
                InterfaceC74805TXl interfaceC74805TXl = multiHostCrossAdapterImpl.LJLILLLLZI;
                if (interfaceC74805TXl != null) {
                    interfaceC75441TjB2 = interfaceC74805TXl.LIZJ(2, null);
                }
            } else {
                String valueOf = String.valueOf(C44432HcC.LJIILIIL(multiHostCrossAdapterImpl.LJLL));
                StringBuilder LIZJ2 = b1.LIZJ("ensureGroupSession", ", obtainSession, isAnchor=");
                LIZJ2.append(multiHostCrossAdapterImpl.LJLLI);
                LIZJ2.append(", source=");
                LIZJ2.append(str);
                LIZJ2.append(", innerChannelId=");
                JBR.LJIIJ(LIZJ2, valueOf, LIZJ2, "MultiHostCrossAdapter");
                InterfaceC74805TXl interfaceC74805TXl2 = multiHostCrossAdapterImpl.LJLILLLLZI;
                if (interfaceC74805TXl2 != null) {
                    interfaceC75441TjB2 = interfaceC74805TXl2.LIZJ(2, valueOf);
                }
            }
            multiHostCrossAdapterImpl.LJLJI = interfaceC75441TjB2;
            if (interfaceC75441TjB2 != null) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ensureGroupSession");
            LIZ2.append(", source=");
            LIZ2.append(str);
            LIZ2.append(", return by session=null");
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("checkIsGroupEnable");
        LIZ3.append(", false, source=");
        LIZ3.append("ensureGroupSession");
        LIZ3.append(", isGroupEnable=false");
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
        FP1.LJFF("ensureGroupSession", ", return", "MultiHostCrossAdapter");
    }

    @Override // X.U62
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJIIIIZZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        long j;
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        ArrayList arrayList = new ArrayList();
        Iterator<LinkUser> it = oldLinkedList.iterator();
        while (true) {
            long j2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Long userId = it.next().getUserId();
            if (userId != null) {
                j2 = userId.longValue();
            }
            C75883TqJ LJI = LJI(j2);
            if (LJI != null) {
                arrayList.add(LJI);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<LinkUser> it2 = newLinkedList.iterator();
        while (it2.hasNext()) {
            Long userId2 = it2.next().getUserId();
            if (userId2 != null) {
                j = userId2.longValue();
            } else {
                j = 0;
            }
            C75883TqJ LJI2 = LJI(j);
            if (LJI2 != null) {
                arrayList2.add(LJI2);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalLinkedListWillChange, oldList.size=");
        LIZ.append(arrayList.size());
        LIZ.append(", newList.size=");
        LIZ.append(arrayList2.size());
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLocalLinkedListWillChange, oldList=");
        LIZ2.append(arrayList);
        LIZ2.append(", newList=");
        LIZ2.append(arrayList2);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            LLJJJIL(interfaceC75441TjB, new C75737Tnx(false, true, arrayList, arrayList2));
        }
    }

    @Override // X.U62
    public final void LJIIIZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        long j;
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        ArrayList arrayList = new ArrayList();
        Iterator<LinkUser> it = oldLinkedList.iterator();
        while (true) {
            long j2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Long userId = it.next().getUserId();
            if (userId != null) {
                j2 = userId.longValue();
            }
            C75883TqJ LJI = LJI(j2);
            if (LJI != null) {
                arrayList.add(LJI);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<LinkUser> it2 = newLinkedList.iterator();
        while (it2.hasNext()) {
            Long userId2 = it2.next().getUserId();
            if (userId2 != null) {
                j = userId2.longValue();
            } else {
                j = 0;
            }
            C75883TqJ LJI2 = LJI(j);
            if (LJI2 != null) {
                arrayList2.add(LJI2);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalLinkedListDidChange, oldList.size=");
        LIZ.append(arrayList.size());
        LIZ.append(", newList.size=");
        LIZ.append(arrayList2.size());
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLocalLinkedListDidChange, oldList=");
        LIZ2.append(arrayList);
        LIZ2.append(", newList=");
        LIZ2.append(arrayList2);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            LLJJJIL(interfaceC75441TjB, new C75737Tnx(true, false, arrayList, arrayList2));
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.U62
    public final void LJIIJJI(InterfaceC75441TjB session, LeaveMessage leaveMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLeaveMessageReceived, message = ");
        LIZ.append(leaveMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJIIL(long j, long j2) {
        C75877TqD.LJIIL = j;
        C48359IyR.LIZ(j);
    }

    @Override // X.U62
    public final void LJIILL(U65 session, LeaveGroupMessage leaveGroupMessage) {
        long j;
        Player player;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLeaveJoinGroupMessageReceived");
        LIZ.append(", operator = ");
        LIZ.append(leaveGroupMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onLeaveJoinGroupMessageReceived") || !LLJJIJIIJIL("onLeaveJoinGroupMessageReceived")) {
            return;
        }
        if (this.LJLL == null) {
            StringBuilder LIZJ = b1.LIZJ("onLeaveJoinGroupMessageReceived", ", return room=");
            LIZJ.append(this.LJLL);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            return;
        }
        GroupPlayer operator = leaveGroupMessage.getOperator();
        if (operator != null && (player = operator.user) != null) {
            j = player.uid;
        } else {
            j = 0;
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.rv0(LinkCoHostLeaveChannel.class, Long.valueOf(j));
        }
    }

    @Override // X.U62
    public final void LJIILLIIL(String linkMicId, boolean z) {
        InterfaceC75441TjB interfaceC75441TjB;
        long j;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (!LLJJJJLIIL("onAudioMute") || (interfaceC75441TjB = this.LJLJI) == null) {
            return;
        }
        C75883TqJ LJLL = LJLL(linkMicId);
        if (LJLL != null) {
            j = LJLL.LIZ;
        } else {
            j = 0;
        }
        LLJJJIL(interfaceC75441TjB, new C75588TlY(j, linkMicId, z));
        if (this.LJLLI) {
            new C75878TqE().LJJLI(j, z);
        }
    }

    @Override // X.U62
    public final void LJIJ(U65 u65, JoinChannelMessage joinChannelMessage) {
        TRA.LJIILIIL(u65, joinChannelMessage);
    }

    @Override // X.InterfaceC75720Tng
    public final void LJJ(C75892TqS c75892TqS, InterfaceC75706TnS<OLU> interfaceC75706TnS) {
        int i;
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inviteReply_new_arc");
        LIZ.append(", param = ");
        LIZ.append(c75892TqS);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (c75892TqS.LJLJL == 1) {
            i = 1;
        } else {
            i = 2;
        }
        long j = c75892TqS.LJLJI;
        long j2 = c75892TqS.LJLJJI;
        long j3 = c75892TqS.LJLJJL;
        BizPermitJoinGroupParams bizPermitJoinGroupParams = new BizPermitJoinGroupParams();
        bizPermitJoinGroupParams.replyStatus = c75892TqS.LJLJL;
        MHJoinReplyBizContent mHJoinReplyBizContent = c75892TqS.LJLL;
        if (mHJoinReplyBizContent != null) {
            i2 = mHJoinReplyBizContent.sourceType;
        } else {
            i2 = 0;
        }
        bizPermitJoinGroupParams.sourceType = i2;
        LLJLIL(new C75952TrQ(j, j2, j3, i, bizPermitJoinGroupParams, "inviteReply_new_arc"), c75892TqS.LJLJLJ, new IDo0S413S0100000_13(interfaceC75706TnS, 5));
    }

    @Override // X.U62
    public final void LJJII(InterfaceC75441TjB session, CancelInviteMessage cancelInviteMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelInviteMessageReceived, message = ");
        LIZ.append(cancelInviteMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJJIIZI(String linkMicId, long j) {
        InterfaceC75441TjB interfaceC75441TjB;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (!LLJJJJLIIL("onUserLeft") || (interfaceC75441TjB = this.LJLJI) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserLeft leaveReason = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LLJJJIL(interfaceC75441TjB, new C75934Tr8(j, linkMicId));
    }

    @Override // X.InterfaceC75720Tng
    public final void LJJIJLIJ(C75892TqS c75892TqS, InterfaceC75706TnS<OLU> interfaceC75706TnS) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyPermit_new_arc");
        LIZ.append(", param = ");
        LIZ.append(c75892TqS);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (c75892TqS.LJLJL == 1) {
            i = 1;
        } else {
            i = 2;
        }
        long j = c75892TqS.LJLJI;
        long j2 = c75892TqS.LJLJJI;
        long j3 = c75892TqS.LJLJJL;
        BizPermitJoinGroupParams bizPermitJoinGroupParams = new BizPermitJoinGroupParams();
        bizPermitJoinGroupParams.replyStatus = c75892TqS.LJLJL;
        LLJL(new C75951TrP(j, j2, j3, i, bizPermitJoinGroupParams, "applyPermit_new_arc"), c75892TqS.LJLJLJ, new IDo0S413S0100000_13(interfaceC75706TnS, 3));
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB session, DestroyChannelMessage destroyChannelMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroyChannelMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(destroyChannelMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJJJIL(InterfaceC75441TjB interfaceC75441TjB, KickOutMessage kickOutMessage) {
        TRA.LJIILL(interfaceC75441TjB, kickOutMessage);
    }

    @Override // X.U62
    public final void LJJJJ(U65 u65, DirectJoinMessage directJoinMessage) {
        TRA.LJIILJJIL(u65, directJoinMessage);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC75594Tle
    public final void LJJJJJ(String str, boolean z) {
        boolean z2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableSDK, isAttached = ");
        C76965UIn.LIZJ(LIZ, this.LJLIL, ", enable = ", z, ",mLinkMicManager is null:");
        if (this.LJLILLLLZI == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ.append(z2);
        LIZ.append(", source = ");
        LIZ.append(str);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!this.LJLIL) {
            return;
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75504TkC.class)).LIZ = Boolean.valueOf(z);
        }
        InterfaceC74805TXl interfaceC74805TXl = this.LJLILLLLZI;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.X6(!z);
        }
    }

    @Override // X.U62
    public final void LJJJJL(U65 u65, PermitApplyMessage permitApplyMessage) {
        TRA.LIZIZ(u65, permitApplyMessage);
    }

    @Override // X.U62
    public final void LJJJLL(U65 u65, LinkCoreError linkCoreError) {
        TRA.LJJIIJ(u65, linkCoreError);
    }

    @Override // X.InterfaceC75594Tle
    public final <T> void LJJJZ(Class<T> cls, InterfaceC88471Ynr<? super InterfaceC75441TjB, ? super C75732Tns<T>, C76800UCe> handler) {
        List<InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe>> list;
        o.LJIIIZ(handler, "handler");
        if (!this.LJLJJL.containsKey(cls)) {
            this.LJLJJL.put(cls, new ArrayList());
        }
        if (C65777Prh.LJFF(2, handler) && handler != null && (list = this.LJLJJL.get(cls)) != null) {
            list.add(handler);
        }
    }

    @Override // X.U62
    public final void LJJL(U65 session, CancelInviteGroupMessage cancelInviteGroupMessage) {
        long j;
        long j2;
        long j3;
        Player player;
        Player player2;
        o.LJIIIZ(session, "session");
        if (!LLJJJJLIIL("onCancelInviteGroupMessageReceived")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelInviteGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(cancelInviteGroupMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJIJIIJIL("onCancelInviteGroupMessageReceived")) {
            return;
        }
        if (this.LJLL == null) {
            StringBuilder LIZJ = b1.LIZJ("onCancelInviteGroupMessageReceived", ", return room=");
            LIZJ.append(this.LJLL);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            return;
        }
        if (cancelInviteGroupMessage.getOperator() == null) {
            StringBuilder LIZJ2 = b1.LIZJ("onCancelInviteGroupMessageReceived", ", return joinUser=");
            LIZJ2.append(cancelInviteGroupMessage.getOperator());
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ2));
            return;
        }
        GroupPlayer operator = cancelInviteGroupMessage.getOperator();
        long j4 = 0;
        if (operator != null && (player2 = operator.user) != null) {
            j = player2.uid;
        } else {
            j = 0;
        }
        GroupPlayer operator2 = cancelInviteGroupMessage.getOperator();
        if (operator2 != null && (player = operator2.user) != null) {
            j2 = player.roomId;
        } else {
            j2 = 0;
        }
        GroupPlayer operator3 = cancelInviteGroupMessage.getOperator();
        if (operator3 != null) {
            j3 = operator3.channelId;
        } else {
            j3 = 0;
        }
        C75883TqJ LJI = LJI(j);
        if (LJI != null) {
            LJI.LIZIZ("onCancelInviteGroupMessageReceived");
        }
        new C75878TqE().LJJIJIIJI(j, cancelInviteGroupMessage.getLinkLayerMessage());
        C75884TqK c75884TqK = this.LJLJJLL;
        Room room = this.LJLL;
        if (room != null) {
            j4 = room.getOwnerUserId();
        }
        c75884TqK.LIZLLL(j4);
        LLJJJIL(session, new C75681Tn3(0, j, j2, j3, C76005TsH.LIZIZ(null), true, cancelInviteGroupMessage));
        LLJLLIL(j, "onCancelInviteGroupMessageReceived");
    }

    @Override // X.InterfaceC76620U5g
    public final void LJJLIIIIJ(InterfaceC75441TjB interfaceC75441TjB, Long l) {
        EnumC75780Toe LJLJLLL = interfaceC75441TjB.LJLJLLL();
        StringBuilder LIZJ = b1.LIZJ("onSessionDestroy", ", session scene = ");
        LIZJ.append(interfaceC75441TjB.scene());
        LIZJ.append(", session type = ");
        LIZJ.append(LJLJLLL);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        InterfaceC75441TjB interfaceC75441TjB;
        U8H LJJZZI;
        C76696U8e LJJIII;
        Rect playerRange;
        U8H LJJZZI2;
        C76696U8e LJJIII2;
        Rect containerAllRange;
        DataChannel dataChannel;
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutSwitch, layout = ");
        LIZ.append(layout);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onLayoutSwitch") || this.LJLLILLLL.getFirst().intValue() == 0 || this.LJLLILLLL.getSecond().intValue() == 0 || (interfaceC75441TjB = this.LJLJI) == null || (LJJZZI = interfaceC75441TjB.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null || (playerRange = LJJIII.getPlayerRange()) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLayoutSwitch, rect = ");
        LIZ2.append(playerRange);
        LIZ2.append(", width=");
        LIZ2.append(playerRange.width());
        LIZ2.append(" height=");
        LIZ2.append(playerRange.height());
        LIZ2.append(" switchType = ");
        LIZ2.append(i);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onLayoutSwitch, containerSize = ");
        LIZ3.append(this.LJLLILLLL);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
        if (this.LJLLILLLL.getFirst().intValue() == playerRange.width() && this.LJLLILLLL.getSecond().intValue() == playerRange.height()) {
            LLJLL();
            return;
        }
        if (this.LJLLL) {
            return;
        }
        DataChannel dataChannel2 = this.LJLJLJ;
        if (dataChannel2 != null) {
            dataChannel2.pv0(MultiGuestV3ShowEmptyViewEvent.class);
        }
        B5A b5a = new B5A(playerRange.width(), playerRange.height(), playerRange.top, playerRange.left, playerRange.right - playerRange.width(), false, this);
        DataChannel dataChannel3 = this.LJLJLJ;
        if (dataChannel3 != null) {
            dataChannel3.qv0(PlayerChangeLayoutParamEvent.class, b5a);
        }
        InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
        if (interfaceC75441TjB2 == null || (LJJZZI2 = interfaceC75441TjB2.LJJZZI()) == null || (LJJIII2 = LJJZZI2.LJJIII()) == null || (containerAllRange = LJJIII2.getContainerAllRange()) == null || (dataChannel = this.LJLJLJ) == null) {
            return;
        }
        dataChannel.rv0(AdjustVideoInteractStreamBottomEvent.class, new C31731Ccp(containerAllRange.top, containerAllRange.bottom));
    }

    @Override // X.U62
    public final void LJJLIIIJLJLI(InterfaceC75441TjB session, C75745To5 c75745To5) {
        o.LJIIIZ(session, "session");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0350, code lost:
    
        if (r6 != null) goto L176;
     */
    /* JADX WARN: Type inference failed for: r7v30, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.util.ArrayList] */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIJ(X.U65 r30, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage r31) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl.LJJLIIJ(X.U65, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage):void");
    }

    @Override // X.U62
    public final void LJJLIL(U65 u65, InviteMessage inviteMessage) {
        TRA.LIZ(u65, inviteMessage);
    }

    @Override // X.U62
    public final void LJJLJ(U65 session, ReplyInviteGroupMessage replyInviteGroupMessage) {
        long j;
        int type;
        long j2;
        long j3;
        CohostContent cohostContent;
        boolean z;
        boolean z2;
        String str;
        C75648TmW c75648TmW;
        Player player;
        CohostContent cohostContent2;
        PermitJoinGroupBizContent permitJoinGroupBizContent;
        Player player2;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReplyInviteGroupMessageReceived");
        LIZ.append(", message=");
        LIZ.append(replyInviteGroupMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onReplyInviteGroupMessageReceived") || !LLJJIJIIJIL("onReplyInviteGroupMessageReceived")) {
            return;
        }
        if (this.LJLL == null) {
            StringBuilder LIZJ = b1.LIZJ("onReplyInviteGroupMessageReceived", ", return room=");
            LIZJ.append(this.LJLL);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            return;
        }
        if (replyInviteGroupMessage.getApprover() == null) {
            StringBuilder LIZJ2 = b1.LIZJ("onReplyInviteGroupMessageReceived", ", return approver=");
            LIZJ2.append(replyInviteGroupMessage.getApprover());
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ2));
            return;
        }
        int agreeStatus = replyInviteGroupMessage.getAgreeStatus();
        GroupPlayer approver = replyInviteGroupMessage.getApprover();
        if (approver != null && (player2 = approver.user) != null) {
            j = player2.uid;
        } else {
            j = 0;
        }
        BusinessContent businessContent = replyInviteGroupMessage.getBusinessContent();
        if (businessContent != null && (cohostContent2 = businessContent.cohostContent) != null && (permitJoinGroupBizContent = cohostContent2.permitJoinGroupBizContent) != null) {
            type = permitJoinGroupBizContent.sourceType;
        } else {
            type = EnumC75614Tly.NONE.getType();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onReplyInviteGroupMessageReceived");
        LIZ2.append(", reply inviteeUserId = ");
        LIZ2.append(j);
        LIZ2.append(", replyStatus=");
        LIZ2.append(agreeStatus);
        LIZ2.append(", sourceType=");
        LIZ2.append(type);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        GroupPlayer approver2 = replyInviteGroupMessage.getApprover();
        if (approver2 != null && (player = approver2.user) != null) {
            j2 = player.roomId;
        } else {
            j2 = 0;
        }
        GroupPlayer approver3 = replyInviteGroupMessage.getApprover();
        if (approver3 != null) {
            j3 = approver3.channelId;
        } else {
            j3 = 0;
        }
        this.LJLJJLL.LIZLLL(j);
        C75612Tlw.LIZIZ(type, agreeStatus);
        PermitJoinGroupBizContent permitJoinGroupBizContent2 = null;
        if (agreeStatus != 1) {
            new C75878TqE().LJJJIL(j, agreeStatus, replyInviteGroupMessage.getLinkLayerMessage());
            if (agreeStatus == 2 || agreeStatus == 5) {
                z = true;
            } else {
                z = false;
            }
            if (type == EnumC75614Tly.RANDOM_LINK_MIC_INVITE.getType() || type == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND.getType() || type == EnumC75614Tly.TOPIC_RECOMMEND.getType() || type == EnumC75614Tly.TOPIC_PAIR.getType()) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !z2;
            if (!C44432HcC.LJIJI(this.LJLJLJ) && z && z3) {
                LLJJJIL(session, new C75939TrD());
            }
            C75648TmW c75648TmW2 = B5G.LIZIZ().LJJJ;
            if (c75648TmW2 != null) {
                str = c75648TmW2.LIZ;
            } else {
                str = null;
            }
            String str2 = B5G.LIZIZ().LJJLJ;
            LLJLLIL(j, "onReplyInviteGroupMessageReceived");
            LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
            if (str != null) {
                c75648TmW = new C75648TmW(str);
            } else {
                c75648TmW = null;
            }
            LIZIZ.LJJJ = c75648TmW;
            B5G.LIZIZ().LJJLJ = str2;
        } else {
            new C75878TqE().LJIJJ(j, replyInviteGroupMessage.getLinkLayerMessage());
            LLJJIJIL(null);
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
            if (linkCrossRoomDataHolder != null) {
                linkCrossRoomDataHolder.LJFF = LJJLI();
            }
            LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJLJLLL;
            if (linkCrossRoomDataHolder2 != null) {
                linkCrossRoomDataHolder2.LJI = j;
            }
            LLJLLL(EnumC75620Tm4.Prepared, false);
        }
        BusinessContent businessContent2 = replyInviteGroupMessage.getBusinessContent();
        if (businessContent2 != null && (cohostContent = businessContent2.cohostContent) != null) {
            permitJoinGroupBizContent2 = cohostContent.permitJoinGroupBizContent;
        }
        MHPermitJoinBizContent mHPermitJoinBizContent = new MHPermitJoinBizContent();
        if (permitJoinGroupBizContent2 != null) {
            mHPermitJoinBizContent.replyStatus = permitJoinGroupBizContent2.replyStatus;
            mHPermitJoinBizContent.sourceType = permitJoinGroupBizContent2.sourceType;
        }
        LLJJJIL(session, new C75677Tmz(0, agreeStatus, j, j2, j3, mHPermitJoinBizContent, true, replyInviteGroupMessage));
    }

    @Override // X.U62
    public final void LJJLL(InterfaceC75441TjB session, InviteMessage inviteMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteMessageReceived, message = ");
        LIZ.append(inviteMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r3 != null) goto L13;
     */
    @Override // X.InterfaceC75594Tle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C75883TqJ LJJZ(long r8, boolean r10) {
        /*
            r7 = this;
            X.TjB r0 = r7.LJLJI
            r6 = 0
            if (r0 != 0) goto L6
            return r6
        L6:
            X.TqG r2 = r7.LJLLLLLL
            if (r10 == 0) goto L3e
            r2.getClass()
            long r0 = X.C44432HcC.LJI()
            X.TqJ r3 = r2.LIZLLL(r0)
            if (r3 == 0) goto L3d
            long r1 = r3.LIZLLL
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L3d
            r6 = r3
            if (r3 == 0) goto L3d
        L20:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getUserWithPlayType, isApply = "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", coHostUser = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MultiHostCrossUserManager"
            X.C0NB.LJIIIZ(r0, r1)
        L3d:
            return r6
        L3e:
            X.TqJ r5 = r2.LIZLLL(r8)
            if (r5 == 0) goto L3d
            long r3 = r5.LIZLLL
            long r1 = X.C44432HcC.LJI()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
            r6 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl.LJJZ(long, boolean):X.TqJ");
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJL(long j, String str) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        ArrayList arrayList3;
        boolean z3;
        ArrayList arrayList4;
        boolean z4;
        boolean z5 = false;
        if (!C8E.LIZLLL().eU("isInvitingByMe")) {
            z = false;
        } else {
            if (LiveCohostCrossUserInfoFixSetting.INSTANCE.isEnable()) {
                List<C75883TqJ> LJIL = LJIL();
                arrayList = new ArrayList();
                for (C75883TqJ c75883TqJ : LJIL) {
                    C75883TqJ c75883TqJ2 = c75883TqJ;
                    if (c75883TqJ2.LJJI.isInviting() && c75883TqJ2.LJFF() && c75883TqJ2.LJJIII == null && c75883TqJ2.LIZ != j) {
                        arrayList.add(c75883TqJ);
                    }
                }
            } else {
                List<C75883TqJ> LJIL2 = LJIL();
                arrayList = new ArrayList();
                for (C75883TqJ c75883TqJ3 : LJIL2) {
                    C75883TqJ c75883TqJ4 = c75883TqJ3;
                    if (c75883TqJ4.LJJI == EnumC75909Tqj.INVITED && c75883TqJ4.LJFF() && c75883TqJ4.LJJIII == null && c75883TqJ4.LIZ != j) {
                        arrayList.add(c75883TqJ3);
                    }
                }
            }
            z = !arrayList.isEmpty();
        }
        if (!C8E.LIZLLL().eU("isMeBeInvited")) {
            z2 = false;
        } else {
            if (LiveCohostCrossUserInfoFixSetting.INSTANCE.isEnable()) {
                List<C75883TqJ> LJIL3 = LJIL();
                arrayList2 = new ArrayList();
                for (C75883TqJ c75883TqJ5 : LJIL3) {
                    C75883TqJ c75883TqJ6 = c75883TqJ5;
                    if (c75883TqJ6.LJJI.isInviting() && c75883TqJ6.LJFF() && c75883TqJ6.LJJIII != null && c75883TqJ6.LIZ != j) {
                        arrayList2.add(c75883TqJ5);
                    }
                }
            } else {
                List<C75883TqJ> LJIL4 = LJIL();
                arrayList2 = new ArrayList();
                for (C75883TqJ c75883TqJ7 : LJIL4) {
                    C75883TqJ c75883TqJ8 = c75883TqJ7;
                    if (c75883TqJ8.LJJI == EnumC75909Tqj.INVITED && c75883TqJ8.LJFF() && c75883TqJ8.LJJIII != null && c75883TqJ8.LIZ != j) {
                        arrayList2.add(c75883TqJ7);
                    }
                }
            }
            z2 = !arrayList2.isEmpty();
        }
        if (!C8E.LIZLLL().eU("isApplyingByMe")) {
            z3 = false;
        } else {
            if (LiveCohostCrossUserInfoFixSetting.INSTANCE.isEnable()) {
                List<C75883TqJ> LJIL5 = LJIL();
                arrayList3 = new ArrayList();
                for (C75883TqJ c75883TqJ9 : LJIL5) {
                    C75883TqJ c75883TqJ10 = c75883TqJ9;
                    if (c75883TqJ10.LJJI.isApplying() && c75883TqJ10.LJFF() && c75883TqJ10.LJJIII == null && c75883TqJ10.LIZ != j) {
                        arrayList3.add(c75883TqJ9);
                    }
                }
            } else {
                List<C75883TqJ> LJIL6 = LJIL();
                arrayList3 = new ArrayList();
                for (C75883TqJ c75883TqJ11 : LJIL6) {
                    C75883TqJ c75883TqJ12 = c75883TqJ11;
                    if (c75883TqJ12.LJJI == EnumC75909Tqj.APPLIED && c75883TqJ12.LJFF() && c75883TqJ12.LJJIII == null && c75883TqJ12.LIZ != j) {
                        arrayList3.add(c75883TqJ11);
                    }
                }
            }
            z3 = !arrayList3.isEmpty();
        }
        if (!C8E.LIZLLL().eU("isMeBeApplied")) {
            z4 = false;
        } else {
            if (LiveCohostCrossUserInfoFixSetting.INSTANCE.isEnable()) {
                List<C75883TqJ> LJIL7 = LJIL();
                arrayList4 = new ArrayList();
                for (C75883TqJ c75883TqJ13 : LJIL7) {
                    C75883TqJ c75883TqJ14 = c75883TqJ13;
                    if (c75883TqJ14.LJJI.isApplying() && c75883TqJ14.LJFF() && c75883TqJ14.LJJIII != null && c75883TqJ14.LIZ != j) {
                        arrayList4.add(c75883TqJ13);
                    }
                }
            } else {
                List<C75883TqJ> LJIL8 = LJIL();
                arrayList4 = new ArrayList();
                for (C75883TqJ c75883TqJ15 : LJIL8) {
                    C75883TqJ c75883TqJ16 = c75883TqJ15;
                    if (c75883TqJ16.LJJI == EnumC75909Tqj.APPLIED && c75883TqJ16.LJFF() && c75883TqJ16.LJJIII != null && c75883TqJ16.LIZ != j) {
                        arrayList4.add(c75883TqJ15);
                    }
                }
            }
            z4 = !arrayList4.isEmpty();
        }
        if (z || z2 || z3 || z4) {
            z5 = true;
        }
        StringBuilder LIZLLL = C00F.LIZLLL("isWaitingByMe=", z5, ", isInvitingByMe=", z, ", isMeBeInvited=");
        C76965UIn.LIZJ(LIZLLL, z2, ", isApplyingByMe=", z3, ", isMeBeApplied=");
        FT5.LJ(LIZLLL, z4, LIZLLL, "MultiHostConflictHelper");
        return z5;
    }

    @Override // X.U62
    public final void LJLIIIL(U65 session, GroupChangeMessage groupChangeMessage) {
        long j;
        GroupChangeContent groupChangeContent;
        GroupChannelAllUser groupChannelAllUser;
        o.LJIIIZ(session, "session");
        if (this.LJLLI) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGroupChangeMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(groupChangeMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (LLJJJJLIIL("onGroupChangeMessageReceived") && !this.LJLLI) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
            if (linkCrossRoomDataHolder != null) {
                LinkLayerMessage linkLayerMessage = groupChangeMessage.getLinkLayerMessage();
                if (linkLayerMessage != null && (groupChangeContent = linkLayerMessage.groupChangeContent) != null && (groupChannelAllUser = groupChangeContent.groupUser) != null) {
                    j = groupChannelAllUser.groupChannelId;
                } else {
                    j = 0;
                }
                linkCrossRoomDataHolder.LJFF = j;
            }
            LLJJLIIIJLLLLLLLZ(session, groupChangeMessage.getBusinessContent(), "onGroupChangeMessageReceived", "im");
        }
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLIIL(C75904Tqe c75904Tqe, InterfaceC75706TnS<OLT> interfaceC75706TnS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyCancel_new_arc");
        LIZ.append(", param = ");
        LIZ.append(c75904Tqe);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LLJJI(new C75918Tqs(c75904Tqe.LJLJI, c75904Tqe.LJLJJI, c75904Tqe.LJLJJL, "applyCancel_new_arc"), new IDo0S413S0100000_13(interfaceC75706TnS, 2));
    }

    @Override // X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB session, int i) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkMicStateChanged");
        LIZ.append(", state = ");
        LIZ.append(i);
        LIZ.append(" , mLinkMicSession = ");
        LIZ.append(this.LJLJI);
        LIZ.append(", session = ");
        LIZ.append(session);
        LIZ.append(' ');
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onLinkMicStateChanged") || !LLJJIJIIJIL("onLinkMicStateChanged")) {
            return;
        }
        if (i != 0 && i != 6) {
            return;
        }
        boolean z = false;
        if (i == 6) {
            if (this.LJLJL == EnumC75620Tm4.Applied) {
                C30868C9o.LIZJ(R.string.mui);
            }
            LLJLLL(EnumC75620Tm4.Finished, false);
            z = true;
        }
        LLJLILLLLZIIL("onLinkMicStateChanged", z);
    }

    @Override // X.U6Y
    public final void LJLJL(long j, long j2) {
        StringBuilder LIZJ = V10.LIZJ("onApplyTimerCountDown, uid = ", j, ", timeLeft = ");
        C0RN.LJ(LIZJ, j2, LIZJ, "MultiHostCrossAdapter");
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLJLJ(C75904Tqe c75904Tqe, InterfaceC75706TnS<OLT> interfaceC75706TnS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inviteCancel_new_arc");
        LIZ.append(", param = ");
        LIZ.append(c75904Tqe);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LLJJIII(new C75919Tqt(c75904Tqe.LJLJI, c75904Tqe.LJLJJI, c75904Tqe.LJLJJL, "inviteCancel_new_arc"), new IDo0S413S0100000_13(interfaceC75706TnS, 4));
    }

    @Override // X.U62
    public final void LJLLILLLL(InterfaceC75441TjB session, PermitApplyMessage permitApplyMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPermitApplyMessageReceived, message = ");
        LIZ.append(permitApplyMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLLJ(OLX olx, InterfaceC75706TnS<OLS> interfaceC75706TnS) {
        long j;
        long j2;
        long j3;
        String LLLLLLIL;
        Long LJJIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leave_new_arc");
        LIZ.append(", param = ");
        LIZ.append(olx);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        ArrayList arrayList = (ArrayList) B5G.LIZIZ().LJJJZ;
        arrayList.clear();
        arrayList.addAll(C8E.LIZLLL().LJIILJJIL());
        LLJJ("leave_new_arc");
        Room room = this.LJLL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Room room2 = this.LJLL;
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        } else {
            j2 = 0;
        }
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null && (LLLLLLIL = interfaceC75441TjB.LLLLLLIL()) != null && (LJJIZ = C38350F3i.LJJIZ(LLLLLLIL)) != null) {
            j3 = LJJIZ.longValue();
        } else {
            j3 = 0;
        }
        BizLeaveJoinGroupParams bizLeaveJoinGroupParams = new BizLeaveJoinGroupParams();
        bizLeaveJoinGroupParams.notSuggestToUid = olx.LJLJI;
        C76684U7s c76684U7s = new C76684U7s(j, j2, j3, bizLeaveJoinGroupParams, "leave_new_arc", olx.LJLILLLLZI);
        C75910Tqk c75910Tqk = new C75910Tqk(this, interfaceC75706TnS);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("leaveGroup");
        LIZ2.append(", param = ");
        LIZ2.append(c76684U7s);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        if (!LLJJJJLIIL("leaveGroup") || !LLJJIJIIJIL("leaveGroup")) {
            return;
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(8));
        }
        InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
        if (interfaceC75441TjB2 == null) {
            return;
        }
        interfaceC75441TjB2.LJLJJI(c76684U7s, new C75912Tqm(c75910Tqk, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ef, code lost:
    
        r0 = r0.user;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f1, code lost:
    
        if (r0 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f3, code lost:
    
        r5 = r0.roomId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f5, code lost:
    
        r0 = r28.getJoinUser();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f9, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fb, code lost:
    
        r9 = r0.channelId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fd, code lost:
    
        LJJIJLIJ(new X.C75892TqS(1, r5, r7, r9, null, r12, null, null, null, X.C05040Hs.LIZIZ("refuseApply"), 464), new X.C30591Hz());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0217, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0218, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021b, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021e, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0269, code lost:
    
        LLJLLL(X.EnumC75620Tm4.Received, false);
        r6 = r26.LJLJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0271, code lost:
    
        if (r6 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0273, code lost:
    
        r6.LJIIJJI(X.EnumC75672Tmu.HANDLER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027e, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostFullLinkMonitorSetting.INSTANCE.isEnable() == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0280, code lost:
    
        LLJILJILJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0283, code lost:
    
        r9 = r26.LJLLLLLL.LIZ(r0);
        r9.LIZIZ = r3;
        r9.LJI(X.EnumC75909Tqj.APPLIED);
        r9.LIZLLL = X.C44432HcC.LJI();
        r9.LJJIII = r28;
        r26.LJLJJLL.LIZ(r0, com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReplyTimeOutSetting.INSTANCE.getValue(), X.EnumC75915Tqp.MESSAGE_APPLY);
        r9 = r26.LJLJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02b0, code lost:
    
        if (r9 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b2, code lost:
    
        if (r8 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b4, code lost:
    
        r5 = r8.joinGroupMsgExtra;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b6, code lost:
    
        if (r5 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b8, code lost:
    
        r6 = java.lang.Integer.valueOf((int) r5.sourceType);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02bf, code lost:
    
        X.C75642TmQ.LJJLIIIJJIZ(true, r0, r7, r6);
        r5 = r28.getBusinessContent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02c8, code lost:
    
        if (r5 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ca, code lost:
    
        r5 = r5.cohostContent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cc, code lost:
    
        if (r5 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ce, code lost:
    
        r5 = r5.joinGroupBizContent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d0, code lost:
    
        r22 = X.C76005TsH.LIZIZ(r5);
        r5 = r26.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d6, code lost:
    
        if (r5 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d8, code lost:
    
        r5 = r5.LLIIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02dc, code lost:
    
        if (r5 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02de, code lost:
    
        r5 = r5.LJIJI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02e2, code lost:
    
        if (r5 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02e4, code lost:
    
        r21 = r5.getLinkMicId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e8, code lost:
    
        if (r21 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ec, code lost:
    
        LLJJJIL(r27, new X.C75678Tn0(1, r0, r3, r15, r21, r22, X.C75924Tqy.LIZ(r28.getLinkLayerMessage()), r28, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0306, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ea, code lost:
    
        r21 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0307, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0309, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x030b, code lost:
    
        r9.LJJLIIIJLLLLLLLZ = r0;
        r9.LJJLIIJ = X.C44432HcC.LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0229, code lost:
    
        if (X.C76265TwT.LIZ.LIZ(X.EnumC76178Tv4.INVITED) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x022b, code lost:
    
        r12 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0232, code lost:
    
        if (r13.isMultiCoHost() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0234, code lost:
    
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0238, code lost:
    
        if (r12 == X.EnumC75620Tm4.Linked) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x023a, code lost:
    
        r12 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x023d, code lost:
    
        if (r17 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x023f, code lost:
    
        r12 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x024d, code lost:
    
        if (X.C8E.LIZLLL().eU("tryRefuseApplyForCrossArc") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0257, code lost:
    
        if (X.C8E.LIZLLL().LJL(r5, "tryRefuseApplyForCrossArc") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0259, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x025c, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0261, code lost:
    
        if (r10 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ae, code lost:
    
        if (r13 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b0, code lost:
    
        r13 = X.EnumC75674Tmw.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b2, code lost:
    
        r12 = X.C8E.LIZLLL().LLII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bc, code lost:
    
        if (X.C75492Tk0.LJLLLL == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01be, code lost:
    
        r12 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c0, code lost:
    
        r10 = X.X1D.LIZ();
        r10.append("tryRefuseApply, refuseReason = ");
        r10.append(r12);
        X.C0NB.LJIIIZ("MultiHostCrossRefuseManager", X.X1D.LIZIZ(r10));
        X.C75724Tnk.LIZJ(true, r12, r5, r28.getLinkLayerMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
    
        if (r12 <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dd, code lost:
    
        r0 = r28.getJoinUser();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e1, code lost:
    
        if (r0 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        r0 = r0.user;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e5, code lost:
    
        if (r0 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        r7 = r0.uid;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = r28.getJoinUser();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
    
        if (r0 == null) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLLL(X.U65 r27, com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage r28) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl.LJLLLL(X.U65, com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage):void");
    }

    @Override // X.U62
    public final void LJLZ(InterfaceC75441TjB session, CreateChannelMessage createChannelMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreateChannelMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(createChannelMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJZ(InterfaceC75441TjB session, CancelApplyMessage cancelApplyMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelApplyMessageReceived, session = ");
        LIZ.append(session);
        LIZ.append(", message = ");
        LIZ.append(cancelApplyMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC75594Tle
    public final <T> void LJZI(Class<T> cls, InterfaceC88471Ynr<? super InterfaceC75441TjB, ? super C75732Tns<T>, C76800UCe> handler) {
        o.LJIIIZ(handler, "handler");
        List<InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe>> list = this.LJLJJL.get(cls);
        if (list != null) {
            C65777Prh.LIZ(list).remove(handler);
        }
    }

    @Override // X.U62
    public final void LL(InterfaceC75441TjB session, String linkMicId) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        if (!LLJJJJLIIL("onRemoteRender")) {
            return;
        }
        LLJJJIL(session, new C75607Tlr(linkMicId));
    }

    @Override // X.U62
    public final void LLFF(U65 session, PermitApplyGroupMessage permitApplyGroupMessage) {
        long j;
        long j2;
        long j3;
        long j4;
        CohostContent cohostContent;
        Player player;
        Player player2;
        String str;
        C75648TmW c75648TmW;
        Player player3;
        o.LJIIIZ(session, "session");
        if (!LLJJJJLIIL("onPermitApplyGroupMessageReceived")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPermitApplyGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(permitApplyGroupMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPermitApplyGroupMessageReceived");
        LIZ2.append(", agreeStatus = ");
        LIZ2.append(permitApplyGroupMessage.getAgreeStatus());
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        if (!LLJJIJIIJIL("onPermitApplyGroupMessageReceived")) {
            return;
        }
        if (this.LJLL == null) {
            StringBuilder LIZJ = b1.LIZJ("onPermitApplyGroupMessageReceived", ", return room=");
            LIZJ.append(this.LJLL);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            return;
        }
        if (permitApplyGroupMessage.getApprover() == null) {
            StringBuilder LIZJ2 = b1.LIZJ("onPermitApplyGroupMessageReceived", ", return approver=");
            LIZJ2.append(permitApplyGroupMessage.getApprover());
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ2));
            return;
        }
        int agreeStatus = permitApplyGroupMessage.getAgreeStatus();
        GroupPlayer approver = permitApplyGroupMessage.getApprover();
        if (approver != null && (player3 = approver.user) != null) {
            j = player3.uid;
        } else {
            j = 0;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onPermitApplyGroupMessageReceived");
        LIZ3.append(", permit permitUserId = ");
        LIZ3.append(j);
        LIZ3.append(", permitStatus=");
        b1.LJ(LIZ3, agreeStatus, LIZ3, "MultiHostCrossAdapter");
        this.LJLJJLL.LIZLLL(j);
        PermitJoinGroupBizContent permitJoinGroupBizContent = null;
        boolean z = true;
        if (agreeStatus != 1) {
            new C75878TqE().LJJIL(j, agreeStatus, permitApplyGroupMessage.getLinkLayerMessage());
            LLJLLIL(C44432HcC.LJI(), "onPermitApplyGroupMessageReceived");
            if (agreeStatus != 2 && agreeStatus != 5) {
                z = false;
            }
            if (!C44432HcC.LJIJI(this.LJLJLJ) && z) {
                LLJJJIL(session, new C75939TrD());
            }
            C75648TmW c75648TmW2 = B5G.LIZIZ().LJJJ;
            if (c75648TmW2 != null) {
                str = c75648TmW2.LIZ;
            } else {
                str = null;
            }
            String str2 = B5G.LIZIZ().LJJLJ;
            LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
            if (str != null) {
                c75648TmW = new C75648TmW(str);
            } else {
                c75648TmW = null;
            }
            LIZIZ.LJJJ = c75648TmW;
            B5G.LIZIZ().LJJLJ = str2;
        } else {
            new C75878TqE().LJIIZILJ(j, permitApplyGroupMessage.getLinkLayerMessage());
            LLJJIJIL(null);
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
            if (linkCrossRoomDataHolder != null) {
                linkCrossRoomDataHolder.LJFF = LJJLI();
            }
            LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJLJLLL;
            if (linkCrossRoomDataHolder2 != null) {
                linkCrossRoomDataHolder2.LJI = j;
            }
            LLJLLL(EnumC75620Tm4.Prepared, false);
        }
        GroupPlayer approver2 = permitApplyGroupMessage.getApprover();
        if (approver2 != null && (player2 = approver2.user) != null) {
            j2 = player2.roomId;
        } else {
            j2 = 0;
        }
        GroupPlayer approver3 = permitApplyGroupMessage.getApprover();
        if (approver3 != null && (player = approver3.user) != null) {
            j3 = player.uid;
        } else {
            j3 = 0;
        }
        GroupPlayer approver4 = permitApplyGroupMessage.getApprover();
        if (approver4 != null) {
            j4 = approver4.channelId;
        } else {
            j4 = 0;
        }
        BusinessContent businessContent = permitApplyGroupMessage.getBusinessContent();
        if (businessContent != null && (cohostContent = businessContent.cohostContent) != null) {
            permitJoinGroupBizContent = cohostContent.permitJoinGroupBizContent;
        }
        MHPermitJoinBizContent mHPermitJoinBizContent = new MHPermitJoinBizContent();
        if (permitJoinGroupBizContent != null) {
            mHPermitJoinBizContent.replyStatus = permitJoinGroupBizContent.replyStatus;
            mHPermitJoinBizContent.sourceType = permitJoinGroupBizContent.sourceType;
        }
        LLJJJIL(session, new C75677Tmz(1, agreeStatus, j3, j2, j4, mHPermitJoinBizContent, true, permitApplyGroupMessage));
    }

    @Override // X.U6Y
    public final void LLIIIILZ(long j, long j2) {
        StringBuilder LIZJ = V10.LIZJ("onInviteTimerCountDown, uid = ", j, ", timeLeft = ");
        C0RN.LJ(LIZJ, j2, LIZJ, "MultiHostCrossAdapter");
    }

    @Override // X.U62
    public final void LLIIIJ(U65 session, RtcStartResultMessage rtcStartResultMessage) {
        String str;
        o.LJIIIZ(session, "session");
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        Room room = this.LJLL;
        if (room != null) {
            str = C17280m4.LIZ(room);
        } else {
            str = null;
        }
        boolean gt = iInteractService.gt(str);
        if (gt) {
            C0NB.LJIIIZ("MultiGuestV3AnchorPresenter", "onRtcStartResult: inPunish=true");
            ((IInteractService) CN1.LIZ(IInteractService.class)).rd("live_anchor_mute_mic", C51029K0z.LJJIIZI(new OSZ("MuteMicState", CardStruct.IStatusCode.DEFAULT)));
            session.LJII().LIZLLL("business_mute_source_audio_mute_punish", gt);
            ((U7D) session.LIZLLL()).LIZIZ(Boolean.valueOf(gt), "Client.muteLocalAudio", "business_mute_source_audio_mute_punish", "just for fake audio capture");
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void LLIIIL(String str, N2J n2j) {
        InterfaceC75441TjB interfaceC75441TjB;
        U8H LJJZZI;
        if (LLJJIJIIJIL("registerBusinessExtraInfoListener") && (interfaceC75441TjB = this.LJLJI) != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
            LJJZZI.LJIILL().put(str, n2j);
        }
    }

    @Override // X.U62
    public final void LLIIJI(U65 session, CancelApplyGroupMessage cancelApplyGroupMessage) {
        long j;
        long j2;
        Player player;
        Player player2;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelApplyGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(cancelApplyGroupMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onCancelApplyGroupMessageReceived") || !LLJJIJIIJIL("onCancelApplyGroupMessageReceived")) {
            return;
        }
        if (this.LJLL == null) {
            StringBuilder LIZJ = b1.LIZJ("onCancelApplyGroupMessageReceived", ", return room=");
            LIZJ.append(this.LJLL);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            return;
        }
        if (cancelApplyGroupMessage.getOperator() == null) {
            StringBuilder LIZJ2 = b1.LIZJ("onCancelApplyGroupMessageReceived", ", return joinUser=");
            LIZJ2.append(cancelApplyGroupMessage.getOperator());
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ2));
            return;
        }
        GroupPlayer operator = cancelApplyGroupMessage.getOperator();
        long j3 = 0;
        if (operator != null && (player2 = operator.user) != null) {
            j = player2.uid;
        } else {
            j = 0;
        }
        GroupPlayer operator2 = cancelApplyGroupMessage.getOperator();
        if (operator2 != null && (player = operator2.user) != null) {
            j2 = player.roomId;
        } else {
            j2 = 0;
        }
        GroupPlayer operator3 = cancelApplyGroupMessage.getOperator();
        if (operator3 != null) {
            j3 = operator3.channelId;
        }
        C75883TqJ LJI = LJI(j);
        if (LJI != null) {
            LJI.LIZIZ("onCancelApplyGroupMessageReceived");
        }
        new C75878TqE().LJJIIJZLJL(j, cancelApplyGroupMessage.getLinkLayerMessage());
        this.LJLJJLL.LIZLLL(j);
        LLJJJIL(session, new C75681Tn3(1, j, j2, j3, C76005TsH.LIZIZ(null), true, cancelApplyGroupMessage));
        if (MtCoHostCross2v2ManagerFixSetting.INSTANCE.isEnable()) {
            LLJLLIL(j, "onCancelApplyGroupMessageReceived");
        }
    }

    @Override // X.U62
    public final void LLILII(InterfaceC75441TjB session, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReplyInviteMessageReceived, message = ");
        LIZ.append(replyInviteMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LLILIL(U65 session, P2PGroupChangeMessage p2PGroupChangeMessage) {
        o.LJIIIZ(session, "session");
        if (!this.LJLLI) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onP2PGroupChangeMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(p2PGroupChangeMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (LLJJJJLIIL("onP2PGroupChangeMessageReceived") && this.LJLLI) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
            if (linkCrossRoomDataHolder != null) {
                linkCrossRoomDataHolder.LJFF = LJJLI();
            }
            new C75878TqE().LJJL(p2PGroupChangeMessage.getLinkLayerMessage());
            LLJJL(session, p2PGroupChangeMessage.getBusinessContent(), "onP2PGroupChangeMessageReceived", "im");
        }
    }

    @Override // X.InterfaceC75720Tng
    public final void LLILL(C75759ToJ param, InterfaceC75706TnS<OLV> interfaceC75706TnS) {
        Object obj;
        CMB cmb;
        Object obj2;
        boolean z;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        Object obj5;
        String str;
        Object obj6;
        boolean z2;
        Boolean bool;
        Integer num;
        Integer num2;
        Boolean bool2;
        Object obj7;
        String str2;
        int i3;
        Integer num3;
        o.LJIIIZ(param, "param");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply_new_arc");
        LIZ.append(", param = ");
        LIZ.append(param);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        Map<String, Object> map = param.LJLJLJ;
        Object obj8 = null;
        if (map != null) {
            obj = map.get("check_perception_center");
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        if (o.LJ(obj, Boolean.TRUE)) {
            String valueOf = String.valueOf(param.LJLJI);
            Map<String, Object> map2 = param.LJLJLJ;
            if (map2 != null) {
                obj7 = map2.get("sec_to_user_id");
            } else {
                obj7 = null;
            }
            if (obj7 instanceof String) {
                str2 = (String) obj7;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            String valueOf2 = String.valueOf(param.LJLILLLLZI);
            String LIZ2 = C05170If.LIZ(null);
            o.LJIIIIZZ(LIZ2, "getDisplayName(dataHolder?.inviteeUser)");
            C75619Tm3 c75619Tm3 = EnumC75614Tly.Companion;
            Map<String, Object> map3 = param.LJLJLJ;
            if (map3 != null) {
                obj8 = map3.get("source_type");
            }
            if ((obj8 instanceof Integer) && (num3 = (Integer) obj8) != null) {
                i3 = num3.intValue();
            } else {
                i3 = 0;
            }
            c75619Tm3.getClass();
            cmb = new CMB(new C75749To9(valueOf, str2, valueOf2, LIZ2, C75619Tm3.LIZ(i3), C61878OQg.INSTANCE, null, "", true, 2112));
        } else {
            cmb = null;
        }
        Map<String, Object> map4 = param.LJLJLJ;
        if (map4 != null) {
            obj2 = map4.get("check_perception_center");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Boolean) && (bool2 = (Boolean) obj2) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        Map<String, Object> map5 = param.LJLJLJ;
        if (map5 != null) {
            obj3 = map5.get("source_type");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Integer) && (num2 = (Integer) obj3) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        Map<String, Object> map6 = param.LJLJLJ;
        if (map6 != null) {
            obj4 = map6.get("tag_type");
        } else {
            obj4 = null;
        }
        if ((obj4 instanceof Integer) && (num = (Integer) obj4) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Map<String, Object> map7 = param.LJLJLJ;
        if (map7 != null) {
            obj5 = map7.get("tag_value");
        } else {
            obj5 = null;
        }
        if (obj5 instanceof String) {
            str = (String) obj5;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Map<String, Object> map8 = param.LJLJLJ;
        if (map8 != null) {
            obj6 = map8.get("need_withdraw");
        } else {
            obj6 = null;
        }
        if ((obj6 instanceof Boolean) && (bool = (Boolean) obj6) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        long j = param.LJLILLLLZI;
        long j2 = param.LJLJI;
        long j3 = param.LJLJJI;
        Long valueOf3 = Long.valueOf(param.LJLJJL);
        long j4 = param.LJLJJLL;
        BizJoinGroupParams bizJoinGroupParams = new BizJoinGroupParams();
        bizJoinGroupParams.sourceType = i;
        bizJoinGroupParams.checkPerceptionCenter = z;
        bizJoinGroupParams.tagType = i2;
        bizJoinGroupParams.tagValue = str;
        bizJoinGroupParams.needWithdraw = z2;
        C76689U7x c76689U7x = new C76689U7x(j, j2, j3, valueOf3, j4, bizJoinGroupParams, this.LLFF);
        Map<String, Object> map9 = param.LJLJLJ;
        C75902Tqc c75902Tqc = new C75902Tqc(interfaceC75706TnS, this, cmb);
        if (!LLJJJJLIIL("applyGroup") || !LLJJIJI(j3, j2, "applyGroup")) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("applyGroup");
        LIZ3.append(", param = ");
        LIZ3.append(c76689U7x);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
        LLJJJJ(this, "applyGroup");
        LLJLLL(EnumC75620Tm4.Applied, false);
        C75883TqJ LLJILJILJ = LLJILJILJ(j2);
        LLJILJILJ.LJIIJJI = j2;
        LLJILJILJ.LJIIL = j;
        LLJILJILJ.LJIILIIL = j3;
        LLJILJILJ.LJI(EnumC75909Tqj.APPLYING);
        if (map9 != null) {
            String str4 = (String) map9.get("request_id");
            if (str4 != null) {
                str3 = str4;
            }
            LLJILJILJ.LJIJJLI = str3;
            if (map9 instanceof HashMap) {
                ((HashMap) map9).remove("user_info");
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("applyGroup");
        LIZ4.append(", add user = ");
        LIZ4.append(LLJILJILJ);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ4));
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJIIJJI(EnumC75672Tmu.APPLY);
        }
        C75877TqD.LIZJ = SystemClock.uptimeMillis();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB == null) {
            return;
        }
        interfaceC75441TjB.LJJJJZI(c76689U7x, new C75891TqR(LLJILJILJ, this, c76689U7x, c75902Tqc));
    }

    @Override // X.U62
    public final void LLILLJJLI(InterfaceC75441TjB session, ApplyMessage applyMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyMessageReceived, message = ");
        LIZ.append(applyMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U6Y
    public final void LLIZ(long j, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyGroupTimerCountDown");
        LIZ.append(", uid = ");
        LIZ.append(j);
        LIZ.append(", timeLeft = ");
        LIZ.append(j2);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onApplyGroupTimerCountDown") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, j2, EnumC75915Tqp.SDK_APPLY);
    }

    @Override // X.U6Y
    public final void LLJ(long j, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteGroupTimerCountDown");
        LIZ.append(", uid = ");
        LIZ.append(j);
        LIZ.append(", timeLeft = ");
        LIZ.append(j2);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onInviteGroupTimerCountDown") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, j2, EnumC75915Tqp.SDK_INVITE);
    }

    @Override // X.InterfaceC75720Tng
    public final void LLJI(C75759ToJ param, InterfaceC75706TnS<OLV> interfaceC75706TnS) {
        Object obj;
        CMB cmb;
        Object obj2;
        boolean z;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        Object obj5;
        String str;
        Object obj6;
        boolean z2;
        Boolean bool;
        Integer num;
        Integer num2;
        Boolean bool2;
        Object obj7;
        String str2;
        int i3;
        Integer num3;
        o.LJIIIZ(param, "param");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite_new_arc");
        LIZ.append(", param = ");
        LIZ.append(param);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        Map<String, Object> map = param.LJLJLJ;
        Object obj8 = null;
        if (map != null) {
            obj = map.get("check_perception_center");
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        if (o.LJ(obj, Boolean.TRUE)) {
            String valueOf = String.valueOf(param.LJLJI);
            Map<String, Object> map2 = param.LJLJLJ;
            if (map2 != null) {
                obj7 = map2.get("sec_to_user_id");
            } else {
                obj7 = null;
            }
            if (obj7 instanceof String) {
                str2 = (String) obj7;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            String valueOf2 = String.valueOf(param.LJLILLLLZI);
            String LIZ2 = C05170If.LIZ(null);
            o.LJIIIIZZ(LIZ2, "getDisplayName(dataHolder?.inviteeUser)");
            C75619Tm3 c75619Tm3 = EnumC75614Tly.Companion;
            Map<String, Object> map3 = param.LJLJLJ;
            if (map3 != null) {
                obj8 = map3.get("invite_type");
            }
            if ((obj8 instanceof Integer) && (num3 = (Integer) obj8) != null) {
                i3 = num3.intValue();
            } else {
                i3 = 0;
            }
            c75619Tm3.getClass();
            cmb = new CMB(new C75749To9(valueOf, str2, valueOf2, LIZ2, C75619Tm3.LIZ(i3), C61878OQg.INSTANCE, null, "", true, 2112));
        } else {
            cmb = null;
        }
        Map<String, Object> map4 = param.LJLJLJ;
        if (map4 != null) {
            obj2 = map4.get("check_perception_center");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Boolean) && (bool2 = (Boolean) obj2) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        Map<String, Object> map5 = param.LJLJLJ;
        if (map5 != null) {
            obj3 = map5.get("invite_type");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Integer) && (num2 = (Integer) obj3) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        Map<String, Object> map6 = param.LJLJLJ;
        if (map6 != null) {
            obj4 = map6.get("tag_type");
        } else {
            obj4 = null;
        }
        if ((obj4 instanceof Integer) && (num = (Integer) obj4) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Map<String, Object> map7 = param.LJLJLJ;
        if (map7 != null) {
            obj5 = map7.get("tag_value");
        } else {
            obj5 = null;
        }
        if (obj5 instanceof String) {
            str = (String) obj5;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Map<String, Object> map8 = param.LJLJLJ;
        if (map8 != null) {
            obj6 = map8.get("need_withdraw");
        } else {
            obj6 = null;
        }
        if ((obj6 instanceof Boolean) && (bool = (Boolean) obj6) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        long j = param.LJLILLLLZI;
        long j2 = param.LJLJI;
        long j3 = param.LJLJJI;
        Long valueOf3 = Long.valueOf(param.LJLJJL);
        long j4 = param.LJLJJLL;
        BizJoinGroupParams bizJoinGroupParams = new BizJoinGroupParams();
        bizJoinGroupParams.sourceType = i;
        bizJoinGroupParams.checkPerceptionCenter = z;
        bizJoinGroupParams.tagType = i2;
        bizJoinGroupParams.tagValue = str;
        bizJoinGroupParams.needWithdraw = z2;
        C76690U7y c76690U7y = new C76690U7y(j, j2, j3, valueOf3, j4, bizJoinGroupParams, this.LLFF);
        Map<String, Object> map9 = param.LJLJLJ;
        C75903Tqd c75903Tqd = new C75903Tqd(interfaceC75706TnS, this, cmb);
        if (!LLJJJJLIIL("inviteGroup")) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("inviteGroup");
        LIZ3.append(", param = ");
        LIZ3.append(c76690U7y);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
        if (!LLJJIJI(j3, j2, "inviteGroup")) {
            return;
        }
        LLJJJJ(this, "inviteGroup");
        LLJLLL(EnumC75620Tm4.Invited, false);
        C75883TqJ LIZ4 = this.LJLLLLLL.LIZ(j2);
        LIZ4.LIZLLL = C44432HcC.LJI();
        LIZ4.LJJIFFI = true;
        LIZ4.LJI(EnumC75909Tqj.INVITING);
        C75880TqG c75880TqG = this.LJLLLLLL;
        c75880TqG.getClass();
        int size = c75880TqG.LIZLLL.size();
        c75880TqG.LIZLLL.put(Long.valueOf(LIZ4.LIZ), LIZ4);
        int size2 = c75880TqG.LIZLLL.size();
        LIZ4.LJJII = "local";
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("addLocalInvitingUser, uid = ");
        C06510Nj.LIZIZ(LIZ5, LIZ4.LIZ, ", beforeSize=", size);
        LIZ5.append(", afterSize=");
        LIZ5.append(size2);
        C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZ5));
        if (map9 != null) {
            LIZ4.LJIIZILJ = (C75768ToS) map9.get("user_info");
            String str4 = (String) map9.get("request_id");
            if (str4 != null) {
                str3 = str4;
            }
            LIZ4.LJIJJLI = str3;
            if (map9 instanceof HashMap) {
                ((HashMap) map9).remove("user_info");
            }
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJIIJJI(EnumC75672Tmu.INVITER);
        }
        C75877TqD.LIZ = SystemClock.uptimeMillis();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB == null) {
            return;
        }
        interfaceC75441TjB.LJJLIL(c76690U7y, new C75890TqQ(LIZ4, this, c76690U7y, c75903Tqd));
    }

    @Override // X.U62
    public final void LLJIJIL(U65 u65, ReplyInviteMessage replyInviteMessage) {
        TRA.LJIJJ(u65, replyInviteMessage);
    }

    public final void LLJJI(C75918Tqs c75918Tqs, IDo0S413S0100000_13 iDo0S413S0100000_13) {
        if (!LLJJJJLIIL("cancelApplyGroup") || !LLJJIJIIJIL("cancelApplyGroup") || !LLJJIJI(c75918Tqs.LJLJI, c75918Tqs.LJLILLLLZI, "cancelApplyGroup")) {
            return;
        }
        C75883TqJ LJI = LJI(C44432HcC.LJI());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelApplyGroup");
        LIZ.append(", param = ");
        LIZ.append(c75918Tqs);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (LJI != null) {
            LJI.LJI(EnumC75909Tqj.CANCELING);
        }
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJLIIJ(c75918Tqs, new C75900Tqa(iDo0S413S0100000_13, LJI, this));
        }
    }

    public final void LLJJIII(C75919Tqt c75919Tqt, IDo0S413S0100000_13 iDo0S413S0100000_13) {
        if (!LLJJJJLIIL("cancelInviteGroup") || !LLJJIJIIJIL("cancelInviteGroup") || !LLJJIJI(c75919Tqt.LJLJI, c75919Tqt.LJLILLLLZI, "cancelInviteGroup")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInviteGroup");
        LIZ.append(", param = ");
        LIZ.append(c75919Tqt);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        C75883TqJ LJI = LJI(c75919Tqt.LJLILLLLZI);
        if (LJI != null) {
            LJI.LJI(EnumC75909Tqj.CANCELING);
        }
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LLJI(c75919Tqt, new C75901Tqb(iDo0S413S0100000_13, this, c75919Tqt));
        }
    }

    public final void LLJJJIL(InterfaceC75441TjB interfaceC75441TjB, Object obj) {
        if (MtCoHostMultiAdatperFixAnr1Setting.INSTANCE.isEnable()) {
            List<InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe>> list = this.LJLJJL.get(obj.getClass());
            if (list != null) {
                Iterator<InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().invoke(interfaceC75441TjB, new C75732Tns<>(obj));
                }
                return;
            }
            return;
        }
        List<InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe>> list2 = this.LJLJJL.get(obj.getClass());
        if (list2 != null) {
            for (InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe> interfaceC88471Ynr : list2) {
                if (interfaceC88471Ynr != null) {
                    interfaceC88471Ynr.invoke(interfaceC75441TjB, new C75732Tns<>(obj));
                }
            }
        }
    }

    public final void LLJLILLLLZIIL(String str, boolean z) {
        InterfaceC75441TjB interfaceC75441TjB;
        StringBuilder LIZLLL = C1FL.LIZLLL("resetGroupData", ", source = ", str, ", mLinkMicSession = ");
        LIZLLL.append(this.LJLJI);
        LIZLLL.append(", isResetSession=");
        LIZLLL.append(z);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZLLL));
        LLJILLL("resetGroupData");
        if (z && (interfaceC75441TjB = this.LJLJI) != null) {
            interfaceC75441TjB.LJI("resetGroupData");
        }
        C75877TqD.LIZ();
        C75893TqT.LIZ = 0L;
        C75893TqT.LIZLLL = 0L;
        C75893TqT.LJII = 0L;
        C75893TqT.LJ = 0L;
        C75893TqT.LJI = 0L;
        C75893TqT.LJFF = false;
        C75893TqT.LIZJ = false;
        C75893TqT.LJIIIZ = false;
        C75893TqT.LJIIJ = 0L;
        C75893TqT.LJIIJJI = false;
        C75633TmH.LIZ();
        C75642TmQ.LJJLIIIJLLLLLLLZ();
        this.LJLJJLL.LIZIZ();
        C75880TqG c75880TqG = this.LJLLLLLL;
        c75880TqG.LIZIZ.clear();
        c75880TqG.LIZLLL.clear();
        ((ArrayList) c75880TqG.LIZJ).clear();
        ((ArrayList) C75917Tqr.LIZ).clear();
        LLJLLL(EnumC75620Tm4.None, true);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJII("resetGroupData");
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJLJLLL;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LJIIIIZZ(false);
        }
        this.LL = 0L;
        this.LJZL = 0L;
        this.LJZ = false;
        this.LJZI.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0106, code lost:
    
        if (r4 <= 0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLLIL(long r15, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl.LLJLLIL(long, java.lang.String):void");
    }

    public final void LLJLLL(EnumC75620Tm4 enumC75620Tm4, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateState, this.state = ");
        LIZ.append(this.LJLJL);
        LIZ.append(" newState = ");
        LIZ.append(enumC75620Tm4);
        LIZ.append(", force = ");
        FT5.LJ(LIZ, z, LIZ, "MultiHostCrossAdapter");
        if (!C75635TmJ.LIZ(this.LJLJL, enumC75620Tm4, z, "MultiHostCrossAdapter")) {
            return;
        }
        if (enumC75620Tm4 == EnumC75620Tm4.Linked && this.LJZL == 0) {
            this.LJZL = LJJLI();
        }
        EnumC75620Tm4 enumC75620Tm42 = this.LJLJL;
        this.LJLJL = enumC75620Tm4;
        C75635TmJ.LIZIZ(enumC75620Tm42, enumC75620Tm4, z, this.LJLJLJ, this.LJLJLLL, "MultiHostCrossAdapter");
    }

    public static boolean LLJJIJI(long j, long j2, String str) {
        if (j > 0) {
            StringBuilder LIZLLL = C1FL.LIZLLL("checkInnerChannelId", ", true, source=", str, ", checkInnerChannelId=");
            LIZLLL.append(j);
            LIZLLL.append(", targetId=");
            LIZLLL.append(j2);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZLLL));
            return true;
        }
        if (C76117Tu5.LIZIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("test block by : innerChannelId=0, targetId=");
            LIZ.append(j2);
            C30868C9o.LJI(X1D.LIZIZ(LIZ));
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j2), true);
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "source", str, true);
        c75878TqE.LJIILLIIL("cross_adapter_check_inner_channel_id");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkInnerChannelId");
        LIZ2.append(", false, source=");
        LIZ2.append(str);
        C0MT.LIZLLL(LIZ2, ", checkInnerChannelId=", j, ", targetId=");
        C0RN.LJ(LIZ2, j2, LIZ2, "MultiHostCrossAdapter");
        return false;
    }

    @Override // X.U62
    public final void LJIIZILJ(String linkMicId, float f, float f2) {
        boolean z;
        String str;
        DataChannel dataChannel;
        o.LJIIIZ(linkMicId, "linkMicId");
        Integer num = 0;
        if (f2 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && f == 0.0f) {
            Integer num2 = this.LJZI.get(linkMicId);
            if (num2 != null) {
                num = num2;
            }
            this.LJZI.put(linkMicId, Integer.valueOf(num.intValue() + 1));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteVideoStats");
            LIZ.append(", forward stream faild, linkmicId = ");
            LIZ.append(linkMicId);
            LIZ.append(", cnts: ");
            LIZ.append(this.LJZI.get(linkMicId));
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        } else {
            Integer num3 = this.LJZI.get(linkMicId);
            if (num3 == null) {
                num3 = num;
            }
            if (num3.intValue() >= 5 && f != 0.0f) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onRemoteVideoStats");
                LIZ2.append(", resume cohost, linkmicId = ");
                LIZ2.append(linkMicId);
                LIZ2.append(", pull stream success");
                C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
                C75883TqJ LJLL = C8E.LIZLLL().LJLL(linkMicId);
                if (LJLL == null || (str = Long.valueOf(LJLL.LIZ).toString()) == null) {
                    str = "";
                }
                C76271TwZ.LIZ.LJLJJL(str);
                DataChannel dataChannel2 = this.LJLJLJ;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(MultiCoHostStreamStatsEvent.class, new C75589TlZ(EnumC75775ToZ.NORMAL, linkMicId));
                }
            }
            this.LJZI.put(linkMicId, num);
        }
        Integer num4 = this.LJZI.get(linkMicId);
        if (num4 == null || num4.intValue() != 5 || (dataChannel = this.LJLJLJ) == null) {
            return;
        }
        dataChannel.qv0(MultiCoHostStreamStatsEvent.class, new C75589TlZ(EnumC75775ToZ.FORWARD_STREAM_FAILED, linkMicId));
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        o.LJIIIZ(session, "session");
        if (!LLJJJJLIIL("onNetworkQualityUpdate")) {
            return;
        }
        C75877TqD.LJIIJ = i;
        C75877TqD.LJIIJJI = i2;
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJJLJLI(C75993Ts5 c75993Ts5, InterfaceC75414Tik<PermitResult> interfaceC75414Tik, Map<String, ? extends Object> map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply, param = ");
        LIZ.append(c75993Ts5);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJLI(U65 session, LinkUser joinedUser, CustomLinkMessage customLinkMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(joinedUser, "joinedUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserJoined, message = ");
        LIZ.append(customLinkMessage);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        o.LJ(session, this.LJLJI);
    }

    @Override // X.U62
    public final void LJLJLLL(U65 u65, String str, String str2) {
        TRA.LJJIJIIJIL(u65, str, str2);
    }

    @Override // X.U62
    public final void LJLLI(InterfaceC75441TjB interfaceC75441TjB, String str, String str2) {
        TRA.LJJIII(interfaceC75441TjB, str, str2);
    }

    @Override // X.InterfaceC75719Tnf
    public final void LLFZ(C75911Tql c75911Tql, InterfaceC75414Tik<ReplyResult> interfaceC75414Tik, Map<String, ? extends Object> map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite, param = ");
        LIZ.append(c75911Tql);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LLIIZ(U65 session, boolean z, LinkCoreError linkCoreError) {
        o.LJIIIZ(session, "session");
    }

    public final void LLJL(C75951TrP c75951TrP, Map map, IDo0S413S0100000_13 iDo0S413S0100000_13) {
        boolean z;
        if (!LLJJJJLIIL("permitApplyGroup") || !LLJJIJIIJIL("permitApplyGroup")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApplyGroup");
        LIZ.append(", param = ");
        LIZ.append(c75951TrP);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        this.LJLJJLL.LIZLLL(c75951TrP.LJLILLLLZI);
        C75883TqJ LJI = LJI(c75951TrP.LJLILLLLZI);
        if (LJI != null) {
            LJI.LIZIZ("permitApplyGroup");
        }
        if (c75951TrP.LJLJJI == 1) {
            z = true;
        } else {
            z = false;
        }
        C75885TqL.LIZJ = map;
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJIIJ(c75951TrP, new C75896TqW(this, c75951TrP, iDo0S413S0100000_13, z));
        }
        if (c75951TrP.LJLJJI == 1) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
            if (linkCrossRoomDataHolder != null) {
                linkCrossRoomDataHolder.LJ = true;
            }
            LLJLLL(EnumC75620Tm4.Prepared, false);
        }
    }

    public final void LLJLIL(C75952TrQ c75952TrQ, Map map, IDo0S413S0100000_13 iDo0S413S0100000_13) {
        if (!LLJJJJLIIL("replyInviteGroup") || !LLJJIJIIJIL("replyInviteGroup")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInviteGroup");
        LIZ.append(", param = ");
        LIZ.append(c75952TrQ);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLL == null) {
            return;
        }
        this.LJLJJLL.LIZLLL(C44432HcC.LJI());
        C75883TqJ LJI = LJI(c75952TrQ.LJLILLLLZI);
        if (LJI != null) {
            LJI.LIZIZ("replyInviteGroup");
        }
        C75885TqL.LIZIZ = map;
        C75877TqD.LIZIZ = SystemClock.uptimeMillis();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LIZJ(c75952TrQ, new C75899TqZ(this, c75952TrQ, iDo0S413S0100000_13));
        }
        if (c75952TrQ.LJLJJI == 1) {
            LLJJIJIL(null);
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJLLL;
            if (linkCrossRoomDataHolder != null) {
                linkCrossRoomDataHolder.LJ = true;
            }
            StringBuilder LIZJ = b1.LIZJ("replyInviteGroup", ", replyStatus = ");
            LIZJ.append(c75952TrQ.LJLJJI);
            LIZJ.append(", dataChannel = ");
            LIZJ.append(this.LJLJLJ);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            DataChannel dataChannel = this.LJLJLJ;
            if (dataChannel != null) {
                dataChannel.rv0(LinkCrossRoomStateChangeEvent.class, new C32208CkW(4));
            }
            LLJLLL(EnumC75620Tm4.Prepared, false);
        }
        C75597Tlh.LIZJ(c75952TrQ.LJLJJI);
    }

    @Override // X.U62
    public final void LJJLIIIJL(InterfaceC75441TjB session, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        int i2;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkMicFinishReason");
        LIZ.append(", finishReason=");
        LIZ.append(i);
        LIZ.append(", error=");
        LIZ.append(linkCoreError);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onLinkMicFinishReason")) {
            return;
        }
        if (linkCoreError != null) {
            i2 = linkCoreError.getErrorCode();
        } else {
            i2 = -1;
        }
        LLJJJIL(session, new C75935Tr9(i, i2, abnormalDisconnectReason));
        new C75878TqE().LJJJZ(i, linkCoreError);
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJZZI(ViewGroup viewGroup, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, boolean z) {
        OSZ<Integer, Integer> osz;
        U8H LJJZZI;
        U8H LJJZZI2;
        List<LinkmicUser> list;
        InterfaceC75973Trl LLIIJI;
        MultiLiveUserSettings multiLiveUserSettings;
        CoHost coHost;
        List<LinkUser> LJJIIZI;
        int i = 0;
        this.LJLLL = false;
        LLJJJJ(this, "startCoHostUI");
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(viewGroup, new ARunnableS28S0200000_9(viewGroup, this, 5), 3));
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB == null) {
            FP1.LJFF("startCoHostUI", ", return by tempSession=null", "MultiHostCrossAdapter");
            return;
        }
        if (!this.LJLLI) {
            InterfaceC75973Trl LLIIJI2 = interfaceC75441TjB.LLIIJI();
            if (LLIIJI2 != null && (LJJIIZI = LLIIJI2.LJJIIZI()) != null) {
                i = LJJIIZI.size();
            }
            Room room = this.LJLL;
            if (room == null || (((multiLiveUserSettings = room.multiLiveUserSettings) == null || (coHost = multiLiveUserSettings.coHost) == null || (list = coHost.linkedUsers) == null) && (list = C61878OQg.INSTANCE) == null)) {
                list = C61878OQg.INSTANCE;
            }
            long LJIILIIL = C44432HcC.LJIILIIL(room);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startCoHostUI, sdkLinkedSize = ");
            LIZ.append(i);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startCoHostUI, roomLinkedList size = ");
            LIZ2.append(list.size());
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startCoHostUI, linkChannelId = ");
            LIZ3.append(LJIILIIL);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
            if (z && (!list.isEmpty()) && LJIILIIL > 0) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                for (LinkmicUser linkmicUser : list) {
                    arrayList.add(new LinkUser(Long.valueOf(linkmicUser.roomId), Long.valueOf(linkmicUser.userId), Long.valueOf(LJIILIIL), linkmicUser.linkMicIdStr, null, linkmicUser, null, null, null, null, null, null, 4032, null));
                }
                C75880TqG c75880TqG = this.LJLLLLLL;
                InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
                c75880TqG.getClass();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("updateAnchorForAudienceEnterRoom");
                LIZ4.append(", source=");
                LIZ4.append("startCoHostUI");
                LIZ4.append(", linkedList = ");
                LIZ4.append(arrayList);
                C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZ4));
                if (c75880TqG.LIZ == null) {
                    StringBuilder LIZLLL = C1FL.LIZLLL("updateAnchorForAudienceEnterRoom", ", source=", "startCoHostUI", ", return room=");
                    LIZLLL.append(c75880TqG.LIZ);
                    C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL));
                } else {
                    StringBuilder LIZLLL2 = C1FL.LIZLLL("updateAnchorForAudienceEnterRoom", ", source=", "startCoHostUI", ", before coHostUserMap size = ");
                    LIZLLL2.append(c75880TqG.LIZIZ.size());
                    C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL2));
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("updateAnchorForAudienceEnterRoom");
                    LIZ5.append(", source=");
                    LIZ5.append("startCoHostUI");
                    LIZ5.append(", linkedUsers size = ");
                    LIZ5.append(arrayList.size());
                    C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZ5));
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new OSZ(it.next(), EnumC75909Tqj.LINKED));
                    }
                    arrayList2.addAll(arrayList3);
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(c75880TqG.LIZIZ);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        OSZ osz2 = (OSZ) it2.next();
                        LinkUser linkUser = (LinkUser) osz2.getFirst();
                        StringBuilder LIZLLL3 = C1FL.LIZLLL("updateAnchorForAudienceEnterRoom", ", source=", "startCoHostUI", ", foreach state = ");
                        LIZLLL3.append(osz2.getSecond());
                        LIZLLL3.append(" user = ");
                        LIZLLL3.append(linkUser);
                        C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL3));
                        c75880TqG.LJI(interfaceC75441TjB2, (LinkUser) osz2.getFirst(), (EnumC75909Tqj) osz2.getSecond(), null, false, false, new HashSet(), "updateAnchorForAudienceEnterRoom", true);
                        C65777Prh.LIZJ(hashMap).remove(linkUser.getUserId());
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        StringBuilder LIZLLL4 = C1FL.LIZLLL("updateAnchorForAudienceEnterRoom", ", source=", "startCoHostUI", ", remove uid = ");
                        LIZLLL4.append(((Number) entry.getKey()).longValue());
                        C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL4));
                        c75880TqG.LJFF(((Number) entry.getKey()).longValue());
                    }
                    C0NB.LJIIIZ("MultiHostCrossUserManager", "updateAnchorForAudienceEnterRoom, source=startCoHostUI, after coHostUserMap size = " + c75880TqG.LIZIZ.size());
                    for (Map.Entry<Long, C75883TqJ> entry2 : c75880TqG.LIZIZ.entrySet()) {
                        StringBuilder LIZLLL5 = C1FL.LIZLLL("updateAnchorForAudienceEnterRoom", ", source=", "startCoHostUI", ", after user = ");
                        LIZLLL5.append(entry2.getValue());
                        C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL5));
                    }
                }
                InterfaceC75441TjB interfaceC75441TjB3 = this.LJLJI;
                if (interfaceC75441TjB3 != null && (LLIIJI = interfaceC75441TjB3.LLIIJI()) != null) {
                    LLIIJI.LJJJIL(new ArrayList(arrayList));
                }
            }
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.lv0(lifecycleOwner, MultiGuestV3VideoSizeChannel.class, new AqS117S0300000_13(this, viewGroup, frameLayout, 0));
            dataChannel.lv0(lifecycleOwner, PIPModeChangeEvent.class, new AqS179S0100000_13(this, 203));
        }
        DataChannel dataChannel2 = this.LJLJLJ;
        if (dataChannel2 != null) {
            osz = (OSZ) dataChannel2.kv0(MultiGuestV3VideoSizeChannel.class);
        } else {
            osz = null;
        }
        InterfaceC75441TjB interfaceC75441TjB4 = this.LJLJI;
        if (interfaceC75441TjB4 != null && (LJJZZI2 = interfaceC75441TjB4.LJJZZI()) != null) {
            LJJZZI2.n1(viewGroup, frameLayout, osz);
        }
        InterfaceC75441TjB interfaceC75441TjB5 = this.LJLJI;
        if (interfaceC75441TjB5 != null && (LJJZZI = interfaceC75441TjB5.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJILLIZJL();
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("startCoHostUI, container = ");
        LIZ6.append(viewGroup);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ6));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0663 A[LOOP:5: B:106:0x065d->B:108:0x0663, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x068a A[LOOP:6: B:111:0x0684->B:113:0x068a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019a A[LOOP:0: B:31:0x0194->B:33:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d0 A[LOOP:1: B:36:0x02ca->B:38:0x02d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0587  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJL(X.InterfaceC75441TjB r33, com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r34, java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl.LLJJL(X.TjB, com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent, java.lang.String, java.lang.String):void");
    }

    public final void LLJJLIIIJLLLLLLLZ(InterfaceC75441TjB session, BusinessContent businessContent, String str, String str2) {
        List<LinkUser> LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserListChangeForAudience");
        LIZ.append(", source=");
        LIZ.append(str);
        LIZ.append(", message = ");
        LIZ.append(businessContent);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLLI || !LLJJJJLIIL("onUserListChangeForAudience") || !LLJJIJIIJIL("onUserListChangeForAudience")) {
            return;
        }
        if (this.LJLL == null) {
            StringBuilder LIZJ = b1.LIZJ("onUserListChangeForAudience", ", return room=");
            LIZJ.append(this.LJLL);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
            return;
        }
        C75880TqG c75880TqG = this.LJLLLLLL;
        c75880TqG.getClass();
        o.LJIIIZ(session, "session");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onUserListChangeForAudience");
        LIZ2.append(", source=");
        LIZ2.append(str);
        LIZ2.append(", message = ");
        LIZ2.append(businessContent);
        C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZ2));
        if (c75880TqG.LIZ == null) {
            StringBuilder LIZJ2 = b1.LIZJ("onUserListChangeForAudience", ", return room=");
            LIZJ2.append(c75880TqG.LIZ);
            C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZJ2));
            return;
        }
        LiveCohostCrossUserInfoFixSetting liveCohostCrossUserInfoFixSetting = LiveCohostCrossUserInfoFixSetting.INSTANCE;
        if (liveCohostCrossUserInfoFixSetting.isEnable()) {
            if (o.LJ(str2, "im")) {
                LJFF = session.LLIIJI().LJJIJIL();
            } else {
                LJFF = session.LLIIJI().LJFF();
            }
        } else {
            LJFF = session.LLIIJI().LJFF();
        }
        StringBuilder LIZLLL = C1FL.LIZLLL("onUserListChangeForAudience", ", source=", str, ", sync_before coHostUserMap size = ");
        LIZLLL.append(c75880TqG.LIZIZ.size());
        C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onUserListChangeForAudience");
        LIZ3.append(", source=");
        LIZ3.append(str);
        LIZ3.append(", linkedUsers size = ");
        LIZ3.append(LJFF.size());
        C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZ3));
        if (liveCohostCrossUserInfoFixSetting.isEnable() && LJFF.isEmpty()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("onUserListChangeForAudience");
            LIZ4.append(", source=");
            LIZ4.append(str);
            LIZ4.append(", return by linkedUsers isEmpty");
            C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZ4));
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJFF, 10));
        Iterator<LinkUser> it = LJFF.iterator();
        while (it.hasNext()) {
            arrayList2.add(new OSZ(it.next(), EnumC75909Tqj.LINKED));
        }
        arrayList.addAll(arrayList2);
        HashMap hashMap = new HashMap();
        hashMap.putAll(c75880TqG.LIZIZ);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz = (OSZ) it2.next();
            LinkUser linkUser = (LinkUser) osz.getFirst();
            StringBuilder LIZLLL2 = C1FL.LIZLLL("onUserListChangeForAudience", ", source=", str, ", foreach state = ");
            LIZLLL2.append(osz.getSecond());
            LIZLLL2.append(", user = ");
            LIZLLL2.append(linkUser);
            C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL2));
            c75880TqG.LJI(session, (LinkUser) osz.getFirst(), (EnumC75909Tqj) osz.getSecond(), businessContent, false, false, new HashSet(), "onUserListChangeForAudience", false);
            C65777Prh.LIZJ(hashMap).remove(linkUser.getUserId());
            c75880TqG = c75880TqG;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder LIZLLL3 = C1FL.LIZLLL("onUserListChangeForAudience", ", source=", str, ", remove uid = ");
            LIZLLL3.append(((Number) entry.getKey()).longValue());
            C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL3));
            c75880TqG.LJFF(((Number) entry.getKey()).longValue());
        }
        StringBuilder LIZIZ = C07780Sg.LIZIZ("onUserListChangeForAudience, source=", str, ", sync_after coHostUserMap size = ");
        LIZIZ.append(c75880TqG.LIZIZ.size());
        C0NB.LJIIIZ("MultiHostCrossUserManager", LIZIZ.toString());
        for (Map.Entry<Long, C75883TqJ> entry2 : c75880TqG.LIZIZ.entrySet()) {
            StringBuilder LIZLLL4 = C1FL.LIZLLL("onUserListChangeForAudience", ",source=", str, ", sync_after user = ");
            LIZLLL4.append(entry2.getValue());
            C0NB.LJIIIZ("MultiHostCrossUserManager", X1D.LIZIZ(LIZLLL4));
        }
        Iterator<InterfaceC75923Tqx> it3 = c75880TqG.LJFF.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(session, str, str2);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        int i;
        U8H LJJZZI;
        C76696U8e LJJIII;
        List<InterfaceC75179Tex> allLayoutWindows;
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowStateChanged");
        LIZ.append(", mLinkMicSession = ");
        LIZ.append(this.LJLJI);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onWindowStateChanged")) {
            FP1.LJFF("onWindowStateChanged", ", return, isCrossArcActiveInner = false", "MultiHostCrossAdapter");
            return;
        }
        if (!LLJJIJIIJIL("onWindowStateChanged")) {
            FP1.LJFF("onWindowStateChanged", ", return, checkLinkMicSession = false", "MultiHostCrossAdapter");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onWindowStateChanged");
        LIZ2.append(", window = ");
        LIZ2.append(window);
        LIZ2.append(", isRoomOwnerWindow = ");
        LIZ2.append(window.LJLJI());
        LIZ2.append(", oldState = ");
        LIZ2.append(oldState);
        LIZ2.append(", newState = ");
        LIZ2.append(newState);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        boolean z = this.LJLLI;
        if (z && oldState == newState) {
            C0NB.LJIIIZ("MultiHostCrossAdapter", "onWindowStateChanged, return, oldState == newState");
            return;
        }
        if (z) {
            InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
            if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null && (allLayoutWindows = LJJIII.getAllLayoutWindows()) != null) {
                i = allLayoutWindows.size();
            } else {
                i = 0;
            }
            new C75878TqE().LJJLIIIJJI(window, i, LJI(window.LJJIIJZLJL()));
        }
        if (window.LJLJI() && window.LJJIL() == EnumC75419Tip.StateLinked && this.LJLLI) {
            C75621Tm5.LJIIIZ(window.LJJ());
        }
        Rect LJJLIIIJ = window.LJJLIIIJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onWindowStateChanged, rect = ");
        LIZ3.append(LJJLIIIJ);
        LIZ3.append(" width=");
        LIZ3.append(LJJLIIIJ.width());
        LIZ3.append("  height=");
        LIZ3.append(LJJLIIIJ.height());
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ3));
        C0NB.LJIIIZ("MultiHostCrossAdapter", "onWindowStateChanged, ---------");
        if (!window.LJLJI() && window.LJJIL() == EnumC75419Tip.StateLinked) {
            LLJLLL(EnumC75620Tm4.Linked, false);
        }
        C75728Tno c75728Tno = new C75728Tno(window, oldState, newState, 1);
        InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
        if (interfaceC75441TjB2 != null) {
            LLJJJIL(interfaceC75441TjB2, c75728Tno);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter
    public final void i9(Room room, DataChannel dataChannel, Context context, C75745To5 c75745To5, InterfaceC74805TXl interfaceC74805TXl) {
        boolean z;
        Boolean bool;
        if (room == null || context == null) {
            return;
        }
        StringBuilder LIZJ = b1.LIZJ("attach_cross", ", roomId = ");
        LIZJ.append(Long.valueOf(room.getId()));
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZJ));
        this.LJLIL = true;
        this.LJLJLJ = dataChannel;
        this.LJLJLLL = B5G.LIZIZ();
        this.LJLL = room;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLLI = z;
        this.LJLLLL = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this);
        C75880TqG c75880TqG = this.LJLLLLLL;
        c75880TqG.LIZ = room;
        C75881TqH listener = this.LLF;
        c75880TqG.getClass();
        o.LJIIIZ(listener, "listener");
        if (!c75880TqG.LJFF.contains(listener)) {
            c75880TqG.LJFF.add(listener);
        }
        this.LJLJJI = c75745To5;
        this.LJLILLLLZI = interfaceC74805TXl;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.LJIIIZ(this);
        }
        LLJJJJ(this, "attach_cross");
        LJJJJJ("attach_cross", true);
        if (dataChannel == null) {
            return;
        }
        C75884TqK c75884TqK = this.LJLJJLL;
        c75884TqK.getClass();
        c75884TqK.LIZJ = dataChannel;
    }

    @Override // X.U62
    public final void LJZL(InterfaceC75441TjB session, List<LinkUser> linkedUsers, List<LinkUser> applicants, List<LinkUser> invitees, List<LinkUser> willJoinGroupUsers, List<LinkUser> liveUsers, List<LinkUser> invitingList, List<LinkUser> applyingList, String str, CustomLinkMessage customLinkMessage) {
        BizContentWrapper bizContentWrapper;
        BizContentWrapper bizContentWrapper2;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkedUsers, "linkedUsers");
        o.LJIIIZ(applicants, "applicants");
        o.LJIIIZ(invitees, "invitees");
        o.LJIIIZ(willJoinGroupUsers, "willJoinGroupUsers");
        o.LJIIIZ(liveUsers, "liveUsers");
        o.LJIIIZ(invitingList, "invitingList");
        o.LJIIIZ(applyingList, "applyingList");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserListChanged");
        LIZ.append(", linkedUsers.size=");
        LIZ.append(linkedUsers.size());
        LIZ.append(", applicants.size=");
        LIZ.append(applicants.size());
        LIZ.append(", invitees.size=");
        LIZ.append(invitees.size());
        LIZ.append(", willJoinGroupUsers.size=");
        LIZ.append(willJoinGroupUsers.size());
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJJJLIIL("onUserListChanged") || !o.LJ(session, this.LJLJI)) {
            return;
        }
        BusinessContent businessContent = null;
        if (this.LJLLI) {
            if (customLinkMessage != null && (bizContentWrapper2 = customLinkMessage.getBizContentWrapper()) != null) {
                businessContent = bizContentWrapper2.getBizContent();
            }
            LLJJL(session, businessContent, "onUserListChanged", "local");
            return;
        }
        if (customLinkMessage != null && (bizContentWrapper = customLinkMessage.getBizContentWrapper()) != null) {
            businessContent = bizContentWrapper.getBizContent();
        }
        LLJJLIIIJLLLLLLLZ(session, businessContent, "onUserListChanged", "local");
    }
}
