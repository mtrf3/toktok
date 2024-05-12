package com.bytedance.android.live.liveinteract.multihost.core.adapter;

import X.AbstractC75865Tq1;
import X.B5A;
import X.B5G;
import X.C0NB;
import X.C0RN;
import X.C17280m4;
import X.C1DH;
import X.C28272B7s;
import X.C29616Bjo;
import X.C30868C9o;
import X.C31731Ccp;
import X.C32208CkW;
import X.C32537Cpp;
import X.C32I;
import X.C38350F3i;
import X.C44432HcC;
import X.C44878HjO;
import X.C47135Ieh;
import X.C48359IyR;
import X.C51029K0z;
import X.C58580Myu;
import X.C5UN;
import X.C61878OQg;
import X.C65777Prh;
import X.C74838TYs;
import X.C75234Tfq;
import X.C75501Tk9;
import X.C75504TkC;
import X.C75588TlY;
import X.C75589TlZ;
import X.C75593Tld;
import X.C75597Tlh;
import X.C75600Tlk;
import X.C75607Tlr;
import X.C75612Tlw;
import X.C75621Tm5;
import X.C75633TmH;
import X.C75635TmJ;
import X.C75642TmQ;
import X.C75648TmW;
import X.C75650TmY;
import X.C75675Tmx;
import X.C75677Tmz;
import X.C75678Tn0;
import X.C75681Tn3;
import X.C75683Tn5;
import X.C75717Tnd;
import X.C75724Tnk;
import X.C75728Tno;
import X.C75732Tns;
import X.C75737Tnx;
import X.C75745To5;
import X.C75768ToS;
import X.C75786Tok;
import X.C75877TqD;
import X.C75878TqE;
import X.C75883TqJ;
import X.C75884TqK;
import X.C75888TqO;
import X.C75889TqP;
import X.C75892TqS;
import X.C75893TqT;
import X.C75894TqU;
import X.C75895TqV;
import X.C75904Tqe;
import X.C75905Tqf;
import X.C75911Tql;
import X.C75914Tqo;
import X.C75924Tqy;
import X.C75926Tr0;
import X.C75930Tr4;
import X.C75931Tr5;
import X.C75934Tr8;
import X.C75935Tr9;
import X.C75939TrD;
import X.C75993Ts5;
import X.C76001TsD;
import X.C76002TsE;
import X.C76005TsH;
import X.C76012TsO;
import X.C76113Tu1;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76696U8e;
import X.C76800UCe;
import X.C76965UIn;
import X.C7MY;
import X.C8E;
import X.CN1;
import X.EnumC31946CgI;
import X.EnumC75419Tip;
import X.EnumC75614Tly;
import X.EnumC75617Tm1;
import X.EnumC75620Tm4;
import X.EnumC75672Tmu;
import X.EnumC75673Tmv;
import X.EnumC75674Tmw;
import X.EnumC75775ToZ;
import X.EnumC75780Toe;
import X.EnumC75909Tqj;
import X.EnumC75915Tqp;
import X.EnumC76178Tv4;
import X.FP1;
import X.FT5;
import X.IRX;
import X.InterfaceC28213B5l;
import X.InterfaceC74805TXl;
import X.InterfaceC75179Tex;
import X.InterfaceC75414Tik;
import X.InterfaceC75441TjB;
import X.InterfaceC75706TnS;
import X.InterfaceC75787Tol;
import X.InterfaceC75922Tqw;
import X.InterfaceC75941TrF;
import X.InterfaceC75973Trl;
import X.InterfaceC76112Tu0;
import X.InterfaceC76620U5g;
import X.InterfaceC76688U7w;
import X.InterfaceC78493UrJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC92693kP;
import X.J8V;
import X.J8W;
import X.JBR;
import X.N2J;
import X.OHQ;
import X.OLS;
import X.OLT;
import X.OLU;
import X.OLX;
import X.ORZ;
import X.OSZ;
import X.TRA;
import X.TW6;
import X.U62;
import X.U65;
import X.U6Y;
import X.U7D;
import X.U8H;
import X.U9O;
import X.UB4;
import X.V10;
import X.X1D;
import X.YE1;
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
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
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
import com.bytedance.android.live.liveinteract.multihost.abtest.MultiHostTimeoutAbTestHelper;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostFullChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStreamStatsEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchSeiBattleIdUpdateChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CoHostInProgressChanged;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.ResumeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostMultiAdatperFixAnr1Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.EnableCoHostDetailedDisableReasonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostLinkUserNPEFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostMultiUserInfoFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostPermissionFallbackSetting;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.LinkmicUser;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class MultiHostMultiAdapterImpl implements IMultiHostMultiAdapter, U62, U6Y, InterfaceC76112Tu0, InterfaceC76620U5g, InterfaceC28213B5l, InterfaceC78493UrJ {
    public boolean LJLIL;
    public InterfaceC74805TXl LJLILLLLZI;
    public InterfaceC75441TjB LJLJI;
    public C75745To5 LJLJJI;
    public DataChannel LJLJLJ;
    public LinkCrossRoomDataHolder LJLL;
    public Room LJLLI;
    public boolean LJLLILLLL;
    public PlayerData LJLLL;
    public InterfaceC92693kP LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final ConcurrentHashMap<Class<?>, List<InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<?>, C76800UCe>>> LJLJJL = new ConcurrentHashMap<>();
    public final C75884TqK LJLJJLL = new C75884TqK();
    public EnumC75620Tm4 LJLJL = EnumC75620Tm4.None;
    public final ConcurrentHashMap<Long, C75883TqJ> LJLJLLL = new ConcurrentHashMap<>();
    public OSZ<Integer, Integer> LJLLJ = new OSZ<>(0, 0);
    public final ConcurrentHashMap<String, Integer> LJZ = new ConcurrentHashMap<>();

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

    @Override // X.InterfaceC75594Tle
    public final boolean LJL(long j, String str) {
        return false;
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

    static {
        new C75931Tr5();
    }

    @Override // X.InterfaceC75594Tle
    public final List<C75883TqJ> LJIILJJIL() {
        long j;
        if (this.LJLJI == null) {
            return C61878OQg.INSTANCE;
        }
        if (this.LJLLI == null) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Room room = this.LJLLI;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C75883TqJ c75883TqJ = this.LJLJLLL.get(Long.valueOf(j));
        if (c75883TqJ != null) {
            arrayList.add(c75883TqJ);
        }
        Collection<C75883TqJ> values = this.LJLJLLL.values();
        o.LJIIIIZZ(values, "coHostUserMap.values");
        ArrayList arrayList2 = new ArrayList();
        for (C75883TqJ c75883TqJ2 : values) {
            C75883TqJ c75883TqJ3 = c75883TqJ2;
            if (!c75883TqJ3.LIZLLL(Long.valueOf(j)) && c75883TqJ3.LJJI == EnumC75909Tqj.LINKED) {
                arrayList2.add(c75883TqJ2);
            }
        }
        arrayList.addAll(ORZ.LLILII(new IDComparatorS41S0000000_13(4), arrayList2));
        return arrayList;
    }

    @Override // X.InterfaceC75594Tle
    public final List<C75883TqJ> LJIL() {
        long j;
        if (this.LJLJI == null) {
            return C61878OQg.INSTANCE;
        }
        if (this.LJLLI == null) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Room room = this.LJLLI;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C75883TqJ c75883TqJ = this.LJLJLLL.get(Long.valueOf(j));
        if (c75883TqJ != null) {
            arrayList.add(c75883TqJ);
        }
        Collection<C75883TqJ> values = this.LJLJLLL.values();
        o.LJIIIIZZ(values, "coHostUserMap.values");
        ArrayList arrayList2 = new ArrayList();
        for (C75883TqJ c75883TqJ2 : values) {
            C75883TqJ c75883TqJ3 = c75883TqJ2;
            if (!c75883TqJ3.LIZLLL(Long.valueOf(j)) && c75883TqJ3.LJJI == EnumC75909Tqj.LINKED) {
                arrayList2.add(c75883TqJ2);
            }
        }
        arrayList.addAll(ORZ.LLILII(new IDComparatorS41S0000000_13(5), arrayList2));
        Collection<C75883TqJ> values2 = this.LJLJLLL.values();
        o.LJIIIIZZ(values2, "coHostUserMap.values");
        ArrayList arrayList3 = new ArrayList();
        for (C75883TqJ c75883TqJ4 : values2) {
            C75883TqJ c75883TqJ5 = c75883TqJ4;
            if (!c75883TqJ5.LIZLLL(Long.valueOf(j)) && c75883TqJ5.LJJI != EnumC75909Tqj.LINKED) {
                arrayList3.add(c75883TqJ4);
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJIIJZLJL() {
        StringBuilder LIZJ = b1.LIZJ("detach", ", isAttached = ");
        FT5.LJ(LIZJ, this.LJLIL, LIZJ, "MultiHostMultiAdapter");
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
        LLJJ("detach");
        this.LJLIL = false;
        LJJJJJ("detach", false);
        this.LJLJLJ = null;
        C75884TqK c75884TqK = this.LJLJJLL;
        c75884TqK.LIZIZ();
        c75884TqK.LIZJ = null;
        this.LJLILLLLZI = null;
        this.LJLL = null;
        this.LJLJJL.clear();
        this.LJLLI = null;
        InterfaceC92693kP interfaceC92693kP = this.LJLLLL;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLZ = false;
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJIJ() {
        if (this.LJLZ && C76265TwT.LIZ.LJJLI != 0) {
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
        C0NB.LJIIIZ("MultiHostMultiAdapter", "onEnterBackground");
        if (this.LJLLILLLL) {
            new C75878TqE().LJIILLIIL("enter_background");
        }
    }

    @Override // X.InterfaceC75594Tle
    public final long LJJLI() {
        String LLLLLLIL;
        Long LJJIZ;
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null && (LLLLLLIL = interfaceC75441TjB.LLLLLLIL()) != null && (LJJIZ = C38350F3i.LJJIZ(LLLLLLIL)) != null) {
            return LJJIZ.longValue();
        }
        return 0L;
    }

    @Override // X.InterfaceC75594Tle
    public final void LJLLLLLL() {
        C0NB.LJIIIZ("MultiHostMultiAdapter", "refreshUserList");
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJJI(null);
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        C0NB.LJIIIZ("MultiHostMultiAdapter", "onEnterForeground");
        if (this.LJLLILLLL) {
            new C75878TqE().LJIILLIIL("enter_foreground");
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void LLIZLLLIL() {
        StringBuilder LIZJ = b1.LIZJ("closeWithModeSwitch", ", state = ");
        LIZJ.append(this.LJLJL);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
        if (this.LJLJL == EnumC75620Tm4.Received) {
            if (((ArrayList) LLJJIJIL("closeWithModeSwitch")).isEmpty()) {
                LLJJ("closeWithModeSwitch");
                return;
            }
            return;
        }
        LLJJ("closeWithModeSwitch");
    }

    public final void LLJJJIL() {
        C0NB.LJIIIZ("MultiHostMultiAdapter", "resetToFullScreen");
        B5A b5a = new B5A(-1, -1, 0, 0, 0, true, this);
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.qv0(PlayerChangeLayoutParamEvent.class, b5a);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void e1() {
        U8H LJJZZI;
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJL();
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
        InterfaceC75441TjB interfaceC75441TjB;
        U8H LJJZZI;
        C76696U8e LJJIII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutSwitched");
        LIZ.append(", ---------");
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJIJIIJIL("onLayoutSwitched") && this.LJLLILLLL && (interfaceC75441TjB = this.LJLJI) != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            LJJIII.LJIIJ(null);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
        U8H LJJZZI;
        C76696U8e LJJIII;
        U8H LJJZZI2;
        C76696U8e LJJIII2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowRefreshFinished");
        LIZ.append(", ---------");
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onWindowRefreshFinished")) {
            return;
        }
        if (this.LJLLILLLL) {
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
        LJJIII.LJIIJ(this.LJLLL);
    }

    @Override // X.InterfaceC75594Tle
    public final void LLF() {
        DataChannel dataChannel;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recoverMultiGuest, isAnchor=");
        LIZ.append(this.LJLLILLLL);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LJLJLJ);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLLILLLL && (dataChannel = this.LJLJLJ) != null) {
            dataChannel.qv0(CoHostInProgressChanged.class, new IRX(2));
        }
    }

    @Override // X.InterfaceC75594Tle
    public final boolean LJJIIJ() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC75594Tle
    public final InterfaceC75441TjB LJJIJL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC75594Tle
    public final EnumC75620Tm4 LLII() {
        return this.LJLJL;
    }

    public static boolean LLJJIJIIJIL(String str) {
        if (C8E.LIZLLL().O70("is_cross_arc_joining_or_linked_inner")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is_cross_arc_joining_or_linked_inner");
            LIZ.append(", true, source=");
            LIZ.append(str);
            LIZ.append(", isCrossArcJoiningOrLinked=true");
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC28213B5l
    public final void J2(C75234Tfq c75234Tfq) {
        InterfaceC75441TjB interfaceC75441TjB;
        U8H LJJZZI;
        C76696U8e LJJIII;
        C0NB.LJIIIZ("MultiHostMultiAdapter", "onPlayerChanged");
        this.LJLLL = new PlayerData(c75234Tfq.LJLIL, c75234Tfq.LJLILLLLZI, c75234Tfq.LJLJI, c75234Tfq.LJLJJI, c75234Tfq.LJLJJL, c75234Tfq.LJLJJLL, c75234Tfq.LJLJL, c75234Tfq.LJLJLJ, c75234Tfq.LJLJLLL, c75234Tfq.LJLL);
        if (!this.LJLLILLLL && (interfaceC75441TjB = this.LJLJI) != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            LJJIII.LJIIJ(this.LJLLL);
        }
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJI(long j) {
        if (this.LJLJI == null) {
            return null;
        }
        return this.LJLJLLL.get(Long.valueOf(j));
    }

    @Override // X.U62
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
        C0NB.LJIIIZ("MultiHostMultiAdapter", "onNeedJoinChannel");
        if (LLJJIJIIJIL("onNeedJoinChannel")) {
            return;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJIIIIZZ(true);
        }
        if (C44432HcC.LIZLLL()) {
            C0NB.LJIIIZ("MultiHostMultiAdapter", "onNeedJoinChannel: canPreJoinChannel");
            LLJILLL(null);
            C0NB.LJIIIZ("MultiHostMultiAdapter", "onNeedJoinChannel: joinChannel");
            interfaceC75941TrF.joinChannel();
            new C75878TqE().LJJJLIIL(0, 0, 0L);
            return;
        }
        LLJILLL(new ARunnableS0S0102200_13(interfaceC75941TrF, SystemClock.uptimeMillis(), 1));
    }

    @Override // X.U62
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
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
        return null;
    }

    @Override // X.U6Y
    public final void LJJIJIIJI(long j) {
        C44878HjO.LIZJ("onInviteGroupTimerTimeout, uid = ", j, "MultiHostMultiAdapter");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.U6Y
    public final void LJJJJI(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyTimerCancel");
        LIZ.append(", uid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onApplyTimerCancel") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_APPLY);
    }

    @Override // X.U6Y
    public final void LJJJJJL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C75877TqD.LJIILIIL = linkMicId;
    }

    @Override // X.U6Y
    public final void LJJJLIIL(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteTimerCancel");
        LIZ.append(", uid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onInviteTimerCancel") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_INVITE);
    }

    @Override // X.U6Y
    public final void LJJJLZIJ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyTimerTimeout");
        LIZ.append(", uid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onApplyTimerTimeout") || this.LJLJI == null) {
            return;
        }
        if (EnableCoHostDetailedDisableReasonSetting.INSTANCE.getValue()) {
            C30868C9o.LIZJ(R.string.kh8);
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c75878TqE.LJIILLIIL("apply_timeout");
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_APPLY);
        LLJJJJ(j);
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        DataChannel dataChannel;
        o.LJIIIZ(seiAppData, "seiAppData");
        if (!LLJJIJIIJIL("onSeiBattleIdUpdated") && (dataChannel = this.LJLJLJ) != null) {
            dataChannel.rv0(MatchSeiBattleIdUpdateChannel.class, seiAppData);
        }
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJJZZIII(boolean z) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelAll");
        LIZ.append(", isCancelApply=");
        LIZ.append(z);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (z) {
            i = R.string.kmj;
        } else {
            i = R.string.kme;
        }
        C30868C9o.LIZJ(i);
        for (Map.Entry<Long, C75883TqJ> entry : this.LJLJLLL.entrySet()) {
            StringBuilder LIZJ = b1.LIZJ("cancelAll", ", user = ");
            LIZJ.append(entry.getValue());
            LIZJ.append(", isCancelApply=");
            LIZJ.append(z);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
            if (entry.getValue().LJ()) {
                C75884TqK c75884TqK = this.LJLJJLL;
                long longValue = entry.getKey().longValue();
                EnumC75915Tqp enumC75915Tqp = EnumC75915Tqp.OTHER;
                c75884TqK.LIZJ(longValue, 0L, enumC75915Tqp);
                this.LJLJJLL.LIZJ(entry.getValue().LIZLLL, 0L, enumC75915Tqp);
            }
        }
        LLJJ("cancelAll");
    }

    @Override // X.U6Y
    public final void LJLJI(long j) {
        C44878HjO.LIZJ("onApplyGroupTimerCancel, uid = ", j, "MultiHostMultiAdapter");
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJLL(String linkMicId) {
        Object obj;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (this.LJLJI == null) {
            return null;
        }
        Iterator it = C5UN.LJJLJLI(this.LJLJLLL).iterator();
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
    }

    @Override // X.U62
    public final void LLFII(U65 session) {
        o.LJIIIZ(session, "session");
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
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onInviteTimerTimeout") || this.LJLJI == null) {
            return;
        }
        if (EnableCoHostDetailedDisableReasonSetting.INSTANCE.getValue()) {
            C30868C9o.LIZJ(R.string.kh8);
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c75878TqE.LJIILLIIL("invite_timeout");
        this.LJLJJLL.LIZJ(j, 0L, EnumC75915Tqp.SDK_INVITE);
        LLJJJJ(j);
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartPushStream");
        LIZ.append(", session = ");
        LIZ.append(session);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJIJIIJIL("onStartPushStream") && this.LJLLILLLL && (dataChannel = this.LJLJLJ) != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(7));
        }
    }

    @Override // X.U6Y
    public final void LLILZIL(long j) {
        C44878HjO.LIZJ("onInviteGroupTimerCancel, uid = ", j, "MultiHostMultiAdapter");
    }

    @Override // X.U6Y
    public final void LLILZLL(long j) {
        C44878HjO.LIZJ("onApplyGroupTimerTimeout, uid = ", j, "MultiHostMultiAdapter");
    }

    @Override // X.InterfaceC76620U5g
    public final void LLJILJIL(InterfaceC75441TjB session) {
        o.LJIIIZ(session, "session");
        EnumC75780Toe LJLJLLL = session.LJLJLLL();
        StringBuilder LIZJ = b1.LIZJ("onSessionCreate", ", session scene = ");
        LIZJ.append(session.scene());
        LIZJ.append(", session type = ");
        LIZJ.append(LJLJLLL);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
        if (!LLJJIJIIJIL("onSessionCreate") && session.scene() == 2 && LJLJLLL == EnumC75780Toe.CoLinkMicSession) {
            session.LLLLLIL(C58580Myu.LIZ);
            LLJJIJI("onSessionCreate");
        }
    }

    public final C75883TqJ LLJILJILJ(long j) {
        C75768ToS c75768ToS;
        User owner;
        C75883TqJ LJI = LJI(C44432HcC.LJI());
        if (LJI == null) {
            LJI = LLJJIII(C44432HcC.LJI());
            Room room = this.LJLLI;
            if (room != null && (owner = room.getOwner()) != null) {
                c75768ToS = C44432HcC.LJIILL(owner);
            } else {
                c75768ToS = null;
            }
            LJI.LJIIZILJ = c75768ToS;
        }
        LJI.LIZLLL = j;
        return LJI;
    }

    public final void LLJILLL(Runnable runnable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("closeMultiGuest, isAnchor=");
        LIZ.append(this.LJLLILLLL);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", callback=");
        LIZ.append(runnable);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        DataChannel dataChannel = this.LJLJLJ;
        if (this.LJLLILLLL) {
            if (dataChannel != null) {
                dataChannel.qv0(CoHostInProgressChanged.class, new IRX(runnable, true));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("closeMultiGuest: exception, dataChannel = null, callback=");
            LIZ2.append(runnable);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    public final void LLJJ(String str) {
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroySession");
        LIZ.append(", source = ");
        LIZ.append(str);
        LIZ.append("  mLinkMicSession = ");
        LIZ.append(interfaceC75441TjB);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
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
        if (interfaceC75441TjB == null) {
            return;
        }
        LLJJI(interfaceC75441TjB, new C75683Tn5(str));
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
        this.LJLJJLL.LIZIZ();
        this.LJLJLLL.clear();
        LLJJJJLIIL(EnumC75620Tm4.None, true);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJII("destroySession");
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJLL;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LJIIIIZZ(false);
        }
        this.LJLZ = false;
        this.LJZ.clear();
    }

    public final C75883TqJ LLJJIII(long j) {
        C75768ToS c75768ToS;
        User owner;
        C75883TqJ LJI = LJI(j);
        if (LJI == null) {
            LJI = new C75883TqJ(j);
            if (C44432HcC.LJI() == j) {
                Room room = this.LJLLI;
                if (room != null && (owner = room.getOwner()) != null) {
                    c75768ToS = C44432HcC.LJIILL(owner);
                } else {
                    c75768ToS = null;
                }
                LJI.LJIIZILJ = c75768ToS;
            }
        }
        this.LJLJLLL.put(Long.valueOf(j), LJI);
        return LJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r2 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJI(java.lang.String r6) {
        /*
            r5 = this;
            X.TjB r2 = r5.LJLJI
            java.lang.String r1 = "ensureSession, source = "
            java.lang.String r0 = " mLinkMicSession = "
            java.lang.StringBuilder r1 = X.C25620zW.LIZIZ(r1, r6, r0)
            r4 = 0
            if (r2 == 0) goto L24
            int r0 = r2.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L15:
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r3 = "MultiHostMultiAdapter"
            X.C0NB.LJIIIZ(r3, r0)
            if (r2 == 0) goto L26
            return
        L24:
            r0 = r4
            goto L15
        L26:
            X.TXl r2 = r5.LJLILLLLZI
            if (r2 == 0) goto L88
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r0 = r5.LJLL
            if (r0 == 0) goto L85
            long r0 = r0.LJFF
        L30:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.TjB r2 = r2.LJ(r0)
            if (r2 == 0) goto L3f
            X.N39 r0 = X.C58580Myu.LIZ
            r2.LLLLLIL(r0)
        L3f:
            X.To5 r1 = r5.LJLJJI
            if (r1 == 0) goto L82
            if (r2 == 0) goto L5d
            X.TTf r0 = r2.LLIIJLIL()
            if (r0 == 0) goto L4e
            r0.LIZ(r1)
        L4e:
            r2.LJJJIL(r5)
            r2.LJJZ(r5)
            X.U8H r0 = r2.LJJZZI()
            if (r0 == 0) goto L5d
            r0.m1(r5)
        L5d:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "ensureSession, mLinkMicSession = "
            r1.append(r0)
            if (r2 == 0) goto L70
            int r0 = r2.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L70:
            r1.append(r4)
            java.lang.String r0 = " register listener finished"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C0NB.LJIIIZ(r3, r0)
            r5.LJLJI = r2
            return
        L82:
            if (r2 == 0) goto L5d
            goto L4e
        L85:
            r0 = 0
            goto L30
        L88:
            r2 = r4
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl.LLJJIJI(java.lang.String):void");
    }

    public final List LLJJIJIL(String str) {
        FP1.LJFF("refuseInvited, source = ", str, "MultiHostMultiAdapter");
        Collection<C75883TqJ> values = this.LJLJLLL.values();
        o.LJIIIIZZ(values, "coHostUserMap.values");
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : values) {
            if (c75883TqJ.LJJI == EnumC75909Tqj.INVITED) {
                arrayList.add(c75883TqJ);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refuseInvited, userList = ");
        LIZ.append(arrayList.size());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C75883TqJ c75883TqJ2 = (C75883TqJ) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("refuseInvited, user = ");
            LIZ2.append(c75883TqJ2);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
            LLFZ(new C75911Tql(c75883TqJ2.LIZIZ, c75883TqJ2.LIZ, 7, (BizReplyParams) null, 24), null, null);
        }
        return arrayList;
    }

    public final void LLJJJ(long j) {
        C44878HjO.LIZJ("removeUser, uid = ", j, "MultiHostMultiAdapter");
        C75883TqJ c75883TqJ = this.LJLJLLL.get(Long.valueOf(j));
        if (c75883TqJ != null) {
            c75883TqJ.LJI(EnumC75909Tqj.IDLE);
        }
        this.LJLJLLL.remove(Long.valueOf(j));
        this.LJLJJLL.LIZLLL(j);
    }

    public final void LLJJJJ(long j) {
        int i;
        int i2;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        List<LinkUser> K9;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryDestroySession");
        LIZ.append(", uid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB == null) {
            return;
        }
        InterfaceC75973Trl LLIIJI2 = interfaceC75441TjB.LLIIJI();
        boolean z = false;
        if (LLIIJI2 != null && (K9 = LLIIJI2.K9()) != null) {
            i = K9.size();
        } else {
            i = 0;
        }
        InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
        if (interfaceC75441TjB2 != null && (LLIIJI = interfaceC75441TjB2.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            i2 = LJJIIZI.size();
        } else {
            i2 = 0;
        }
        if (i + i2 <= 0) {
            z = true;
        }
        LLJJJ(j);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tryDestroySession");
        LIZ2.append(", needDestroy = ");
        FT5.LJ(LIZ2, z, LIZ2, "MultiHostMultiAdapter");
        if (z) {
            LLJJ("tryDestroySession");
        }
    }

    @Override // X.InterfaceC75594Tle
    public final void onSei(C28272B7s c28272B7s) {
        InterfaceC74805TXl interfaceC74805TXl;
        C0NB.LJIIIZ("MultiHostMultiAdapter", "onSei");
        if (!LLJJIJIIJIL("onSei") && (interfaceC74805TXl = this.LJLILLLLZI) != null) {
            interfaceC74805TXl.LJFF(c28272B7s, null);
        }
    }

    @Override // X.U62
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJFF(C76113Tu1 c76113Tu1, InterfaceC75414Tik<ResumeResult> interfaceC75414Tik) {
        boolean z;
        StringBuilder LIZJ = b1.LIZJ("resume", ", channelId = ");
        LIZJ.append(c76113Tu1.LJLILLLLZI);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
        LLJJIJI("resumeCoHost");
        C75878TqE c75878TqE = new C75878TqE();
        if (this.LJLJI != null) {
            z = true;
        } else {
            z = false;
        }
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "getSession", Boolean.valueOf(z), true);
        c75878TqE.LJIILLIIL("resume_multi_host_session");
        C76271TwZ.LIZ.LJLIIL();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        o.LJII(interfaceC75441TjB, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.api.linkcore.api.ICoSession");
        ((InterfaceC75922Tqw) interfaceC75441TjB).LJFF(c76113Tu1, new IDo0S413S0100000_13(this, 13));
    }

    @Override // X.U62
    public final void LJIIIIZZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        long j;
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        C0NB.LJIIIZ("MultiHostMultiAdapter", "onLocalLinkedListWillChange");
        if (LLJJIJIIJIL("onLocalLinkedListWillChange")) {
            return;
        }
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
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            LLJJI(interfaceC75441TjB, new C75737Tnx(false, true, arrayList, arrayList2));
        }
    }

    @Override // X.U62
    public final void LJIIIZ(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        long j;
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
        C0NB.LJIIIZ("MultiHostMultiAdapter", "onLocalLinkedListDidChange");
        if (LLJJIJIIJIL("onLocalLinkedListDidChange")) {
            return;
        }
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
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            LLJJI(interfaceC75441TjB, new C75737Tnx(true, false, arrayList, arrayList2));
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.U62
    public final void LJIIJJI(InterfaceC75441TjB session, LeaveMessage leaveMessage) {
        DataChannel dataChannel;
        long j;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLeaveMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(leaveMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJIJIIJIL("onLeaveMessageReceived") && o.LJ(session, this.LJLJI) && (dataChannel = this.LJLJLJ) != null) {
            Long userId = leaveMessage.getLeftUser().getUserId();
            if (userId != null) {
                j = userId.longValue();
            } else {
                j = 0;
            }
            dataChannel.rv0(LinkCoHostLeaveChannel.class, Long.valueOf(j));
        }
    }

    @Override // X.U62
    public final void LJIIL(long j, long j2) {
        C75877TqD.LJIIL = j;
        C48359IyR.LIZ(j);
    }

    @Override // X.U62
    public final void LJIILL(U65 session, LeaveGroupMessage leaveGroupMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLeaveJoinGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(leaveGroupMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJIILLIIL(String linkMicId, boolean z) {
        InterfaceC75441TjB interfaceC75441TjB;
        long j;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (LLJJIJIIJIL("onAudioMute") || (interfaceC75441TjB = this.LJLJI) == null) {
            return;
        }
        C75883TqJ LJLL = LJLL(linkMicId);
        if (LJLL != null) {
            j = LJLL.LIZ;
        } else {
            j = 0;
        }
        LLJJI(interfaceC75441TjB, new C75588TlY(j, linkMicId, z));
        if (this.LJLLILLLL) {
            new C75878TqE().LJJLI(j, z);
        }
    }

    @Override // X.U62
    public final void LJIJ(U65 u65, JoinChannelMessage joinChannelMessage) {
        TRA.LJIILIIL(u65, joinChannelMessage);
    }

    @Override // X.InterfaceC75720Tng
    public final void LJJ(C75892TqS c75892TqS, InterfaceC75706TnS<OLU> interfaceC75706TnS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inviteReply_new_arc, param = ");
        LIZ.append(c75892TqS);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        LLFZ(new C75911Tql(c75892TqS.LJLJI, c75892TqS.LJLJJI, c75892TqS.LJLJL, (BizReplyParams) null, 24), new IDo0S413S0100000_13(interfaceC75706TnS, 11), c75892TqS.LJLJLJ);
    }

    @Override // X.U62
    public final void LJJII(InterfaceC75441TjB session, CancelInviteMessage cancelInviteMessage) {
        long j;
        LinkMessage linkMessage;
        long j2;
        Object obj;
        long j3;
        long j4;
        long j5;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelInviteMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(cancelInviteMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onCancelInviteMessageReceived") || !o.LJ(session, this.LJLJI) || this.LJLLI == null) {
            return;
        }
        C75878TqE c75878TqE = new C75878TqE();
        Long userId = cancelInviteMessage.getInviter().getUserId();
        if (userId != null) {
            j = userId.longValue();
        } else {
            j = 0;
        }
        ExtraDataWrapper extra = cancelInviteMessage.getCustomMessage().getExtra();
        LinkerInviteContent linkerInviteContent = null;
        if (extra != null) {
            linkMessage = extra.getLinkMessage();
        } else {
            linkMessage = null;
        }
        c75878TqE.LJJIJIIJI(j, linkMessage);
        C75884TqK c75884TqK = this.LJLJJLL;
        Room room = this.LJLLI;
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        c75884TqK.LIZLLL(j2);
        ExtraDataWrapper extra2 = cancelInviteMessage.getCustomMessage().getExtra();
        if (extra2 != null) {
            obj = extra2.getContent();
        } else {
            obj = null;
        }
        if (obj instanceof LinkerInviteContent) {
            linkerInviteContent = (LinkerInviteContent) obj;
        }
        Long roomId = cancelInviteMessage.getInviter().getRoomId();
        if (roomId != null) {
            j3 = roomId.longValue();
        } else {
            j3 = 0;
        }
        Long userId2 = cancelInviteMessage.getInviter().getUserId();
        if (userId2 != null) {
            j4 = userId2.longValue();
        } else {
            j4 = 0;
        }
        Long channelId = cancelInviteMessage.getInviter().getChannelId();
        if (channelId != null) {
            j5 = channelId.longValue();
        } else {
            j5 = 0;
        }
        LLJJI(session, new C75681Tn3(0, j4, j3, j5, C76005TsH.LIZ(linkerInviteContent), false, cancelInviteMessage));
        LLJJ("onCancelInviteMessageReceived");
    }

    @Override // X.U62
    public final void LJJIIZI(String linkMicId, long j) {
        InterfaceC75441TjB interfaceC75441TjB;
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserLeft");
        LIZ.append(" leaveReason = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onUserLeft") || (interfaceC75441TjB = this.LJLJI) == null) {
            return;
        }
        LLJJI(interfaceC75441TjB, new C75934Tr8(j, linkMicId));
    }

    @Override // X.InterfaceC75720Tng
    public final void LJJIJLIJ(C75892TqS c75892TqS, InterfaceC75706TnS<OLU> interfaceC75706TnS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyCancel_new_arc, param = ");
        LIZ.append(c75892TqS);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        LJJLJLI(new C75993Ts5(c75892TqS.LJLJI, c75892TqS.LJLJJI, null, c75892TqS.LJLJJLL, c75892TqS.LJLJL, null, 100), new IDo0S413S0100000_13(interfaceC75706TnS, 8), c75892TqS.LJLJLJ);
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB session, DestroyChannelMessage destroyChannelMessage) {
        LinkMessage linkMessage;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroyChannelMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(destroyChannelMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        EnumC75780Toe LJLJLLL = session.LJLJLLL();
        StringBuilder LIZJ = b1.LIZJ("onDestroyChannelMessageReceived", ", session scene = ");
        LIZJ.append(session.scene());
        LIZJ.append(", session type = ");
        LIZJ.append(LJLJLLL);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
        if (!this.LJLLILLLL && this.LJLJI != null && !LLJJIJIIJIL("onDestroyChannelMessageReceived") && session.scene() == 2 && LJLJLLL == EnumC75780Toe.CoLinkMicSession) {
            C75600Tlk c75600Tlk = new C75600Tlk();
            ExtraDataWrapper extra = destroyChannelMessage.getCustomMessage().getExtra();
            Long l = null;
            if (extra != null) {
                linkMessage = extra.getLinkMessage();
            } else {
                linkMessage = null;
            }
            if (linkMessage != null) {
                AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "message_id", Long.valueOf(linkMessage.getMessageId()), true);
                CommonMessageData commonMessageData = linkMessage.baseMessage;
                if (commonMessageData != null) {
                    l = Long.valueOf(commonMessageData.createTime);
                }
                AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "message_create_time", l, true);
                AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "message_fetch_time", Long.valueOf(linkMessage.timestamp), true);
            }
            c75600Tlk.LJIILLIIL("finish_message");
            this.LJLLLLLL = true;
            LLJJJIL();
            LLJJJJLIIL(EnumC75620Tm4.Finished, false);
            LLJJI(session, new C75501Tk9(false));
            LLJJ("onDestroyChannelMessageReceived");
        }
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
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
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
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelInviteGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(cancelInviteGroupMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC76620U5g
    public final void LJJLIIIIJ(InterfaceC75441TjB interfaceC75441TjB, Long l) {
        EnumC75780Toe LJLJLLL = interfaceC75441TjB.LJLJLLL();
        StringBuilder LIZJ = b1.LIZJ("onSessionDestroy", ", session scene = ");
        LIZJ.append(interfaceC75441TjB.scene());
        LIZJ.append(", session type = ");
        LIZJ.append(LJLJLLL);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
        if (!LLJJIJIIJIL("onSessionDestroy") && interfaceC75441TjB.scene() == 2 && LJLJLLL == EnumC75780Toe.CoLinkMicSession && o.LJ(interfaceC75441TjB.LLLLLLIL(), String.valueOf(LJJLI()))) {
            LLJJ("onSessionDestroy");
        }
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
        LIZ.append("onLayoutSwitch");
        LIZ.append(", layout = ");
        LIZ.append(layout);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onLayoutSwitch") || this.LJLLJ.getFirst().intValue() == 0 || this.LJLLJ.getSecond().intValue() == 0 || (interfaceC75441TjB = this.LJLJI) == null || (LJJZZI = interfaceC75441TjB.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null || (playerRange = LJJIII.getPlayerRange()) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLayoutSwitch");
        LIZ2.append(", rect = ");
        LIZ2.append(playerRange);
        LIZ2.append(", width=");
        LIZ2.append(playerRange.width());
        LIZ2.append(" height=");
        LIZ2.append(playerRange.height());
        LIZ2.append(" switchType = ");
        LIZ2.append(i);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onLayoutSwitch");
        LIZ3.append(", containerSize = ");
        LIZ3.append(this.LJLLJ);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ3));
        if (this.LJLLJ.getFirst().intValue() == playerRange.width() && this.LJLLJ.getSecond().intValue() == playerRange.height()) {
            LLJJJIL();
            return;
        }
        if (this.LJLLLLLL) {
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

    @Override // X.U62
    public final void LJJLIIJ(U65 session, InviteGroupMessage inviteGroupMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(inviteGroupMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJJLIL(U65 u65, InviteMessage inviteMessage) {
        TRA.LIZ(u65, inviteMessage);
    }

    @Override // X.U62
    public final void LJJLJ(U65 session, ReplyInviteGroupMessage replyInviteGroupMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReplyInviteGroupMessageReceived");
        LIZ.append(", message=");
        LIZ.append(replyInviteGroupMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onReplyInviteGroupMessageReceived");
        LIZ2.append(", agreeStatus = ");
        LIZ2.append(replyInviteGroupMessage.getAgreeStatus());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
    }

    @Override // X.U62
    public final void LJJLL(InterfaceC75441TjB session, InviteMessage inviteMessage) {
        Object obj;
        long j;
        LinkMessage linkMessage;
        LinkMessage linkMessage2;
        LinkerInviteMessageExtra LIZIZ;
        EnumC75674Tmw enumC75674Tmw;
        LinkerInviteContent linkerInviteContent;
        int i;
        LinkerInviteMessageExtra linkerInviteMessageExtra;
        LinkerInviteContent linkerInviteContent2;
        LinkerInviteMessageExtra linkerInviteMessageExtra2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        Integer num;
        long j9;
        long j10;
        long j11;
        User owner;
        long j12;
        Long channelId;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(inviteMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        LinkMessage linkMessage3 = null;
        Integer num2 = null;
        if (!o.LJ(session, this.LJLJI)) {
            StringBuilder LIZJ = b1.LIZJ("onInviteMessageReceived", ", session error, session = ");
            LIZJ.append(session.hashCode());
            LIZJ.append(", mLinkMicSession=");
            InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
            if (interfaceC75441TjB != null) {
                num2 = Integer.valueOf(interfaceC75441TjB.hashCode());
            }
            LIZJ.append(num2);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
            return;
        }
        if (this.LJLLI == null) {
            return;
        }
        ExtraDataWrapper extra = inviteMessage.getCustomMessage().getExtra();
        if (extra != null) {
            obj = extra.getContent();
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent");
        LinkerInviteContent linkerInviteContent3 = (LinkerInviteContent) obj;
        int i2 = linkerInviteContent3.linkerInviteMsgExtra.inviteType;
        C75612Tlw.LIZ(i2);
        C75877TqD.LJIILJJIL = "";
        C75612Tlw.LIZJ(this.LJLL, i2);
        C75878TqE c75878TqE = new C75878TqE();
        long j13 = linkerInviteContent3.fromUserId;
        LinkUser inviter = inviteMessage.getInviter();
        long j14 = 0;
        if (inviter != null && (channelId = inviter.getChannelId()) != null) {
            j = channelId.longValue();
        } else {
            j = 0;
        }
        ExtraDataWrapper extra2 = inviteMessage.getCustomMessage().getExtra();
        if (extra2 != null) {
            linkMessage = extra2.getLinkMessage();
        } else {
            linkMessage = null;
        }
        c75878TqE.LJJJJL(j13, j, linkMessage);
        if (LLJJIJIIJIL("onInviteMessageReceived")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("tryRefuseInviteByArcIncompatibleInner");
            LIZ2.append(", source = ");
            LIZ2.append("onInviteMessageReceived");
            C0NB.LJIIIZ("MultiRefuseManager", X1D.LIZIZ(LIZ2));
            Long roomId = inviteMessage.getInviter().getRoomId();
            if (roomId != null) {
                j12 = roomId.longValue();
            } else {
                j12 = 0;
            }
            Long userId = inviteMessage.getInviter().getUserId();
            if (userId != null) {
                j14 = userId.longValue();
            }
            session.LJJLIIIJL(new C75911Tql(j12, j14, 21, (BizReplyParams) null, 24), new J8W());
            return;
        }
        DataChannel dataChannel = this.LJLJLJ;
        ExtraDataWrapper extra3 = inviteMessage.getCustomMessage().getExtra();
        if (extra3 != null) {
            linkMessage2 = extra3.getLinkMessage();
        } else {
            linkMessage2 = null;
        }
        if (linkMessage2 != null && (LIZIZ = linkMessage2.LIZIZ()) != null && linkMessage2.inviteContent != null && LIZIZ.inviterRivalExtra != null) {
            if (dataChannel == null || (enumC75674Tmw = (EnumC75674Tmw) dataChannel.kv0(C29616Bjo.class)) == null) {
                enumC75674Tmw = EnumC75674Tmw.NONE;
            }
            EnumC75620Tm4 LLII = C8E.LIZLLL().LLII();
            if (((LinkCrossRoomDataHolder) C75926Tr0.LIZ.getValue()).LJJJJLI) {
                i = 13;
            } else if (C74838TYs.LJ().LJIIIZ) {
                i = 11;
            } else if (((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nU(dataChannel)) {
                i = 14;
            } else if (C76265TwT.LIZ.LIZ(EnumC76178Tv4.INVITED)) {
                i = 16;
            } else if (!enumC75674Tmw.isMultiCoHost()) {
                i = 3;
            } else if (LLII == EnumC75620Tm4.Linked) {
                i = 24;
            } else if (LLII == EnumC75620Tm4.Received) {
                i = 22;
            } else if (!RandomLinkMicManager.LJIIIIZZ() || ((linkerInviteContent2 = linkMessage2.inviteContent) != null && (linkerInviteMessageExtra2 = linkerInviteContent2.linkerInviteMsgExtra) != null && linkerInviteMessageExtra2.inviteType == EnumC75614Tly.RANDOM_LINK_MIC_INVITE.getType())) {
                if ((!C75650TmY.LIZJ() && !C75650TmY.LIZIZ()) || ((linkerInviteContent = linkMessage2.inviteContent) != null && (linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra) != null && linkerInviteMessageExtra.inviteType == EnumC75614Tly.TOPIC_PAIR.getType())) {
                    i = 0;
                } else {
                    i = 25;
                }
            } else {
                i = 15;
            }
            StringBuilder LJ = C7MY.LJ("tryRefuseInvite, refuseReason = ", i, ", inviteType = ");
            b1.LJ(LJ, linkMessage2.inviteContent.linkerInviteMsgExtra.inviteType, LJ, "MultiRefuseManager");
            LinkerInviteContent linkerInviteContent4 = linkMessage2.inviteContent;
            if (linkerInviteContent4 != null) {
                j2 = linkerInviteContent4.fromUserId;
            } else {
                j2 = 0;
            }
            C75724Tnk.LIZJ(false, i, j2, linkMessage2);
            if (i > 0) {
                if (i == 15 || C8E.LIZLLL().LJJLI() <= 0) {
                    return;
                }
                LinkerInviteContent linkerInviteContent5 = linkMessage2.inviteContent;
                if (linkerInviteContent5 != null) {
                    j3 = linkerInviteContent5.fromUserId;
                    j4 = linkerInviteContent5.fromRoomId;
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                LLFZ(new C75911Tql(j4, j3, i, (BizReplyParams) null, 24), new J8V(), null);
                return;
            }
        }
        LLJJJJLIIL(EnumC75620Tm4.Received, false);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJIIJJI(EnumC75672Tmu.INVITEE);
        }
        C75883TqJ LLJJIII = LLJJIII(linkerInviteContent3.fromUserId);
        LLJJIII.LIZIZ = linkerInviteContent3.fromRoomId;
        LLJJIII.LJI(EnumC75909Tqj.INVITED);
        Long userId2 = inviteMessage.getInviter().getUserId();
        if (userId2 != null) {
            j5 = userId2.longValue();
        } else {
            j5 = 0;
        }
        long LIZIZ2 = MultiHostTimeoutAbTestHelper.LIZIZ(j5, linkerInviteContent3.abTestSetting);
        C75884TqK c75884TqK = this.LJLJJLL;
        EnumC75915Tqp enumC75915Tqp = EnumC75915Tqp.MESSAGE_INVITE;
        Room room = this.LJLLI;
        if (room != null && (owner = room.getOwner()) != null) {
            j6 = owner.getId();
        } else {
            j6 = 0;
        }
        c75884TqK.LIZ(j6, LIZIZ2, enumC75915Tqp);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJLL;
        if (linkCrossRoomDataHolder2 != null) {
            Long userId3 = inviteMessage.getInviter().getUserId();
            if (userId3 != null) {
                j7 = userId3.longValue();
            } else {
                j7 = 0;
            }
            linkCrossRoomDataHolder2.LJJLIIIJLLLLLLLZ = j7;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder3 = this.LJLL;
        if (linkCrossRoomDataHolder3 != null) {
            linkCrossRoomDataHolder3.LJJLIIJ = C44432HcC.LJI();
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder4 = this.LJLL;
        if (linkCrossRoomDataHolder4 != null) {
            Long channelId2 = inviteMessage.getInviter().getChannelId();
            if (channelId2 != null) {
                j8 = channelId2.longValue();
            } else {
                j8 = 0;
            }
            linkCrossRoomDataHolder4.LJFF = j8;
        }
        List<InviterRivalExtra> list = linkerInviteContent3.linkerInviteMsgExtra.otherRivalExtra;
        o.LJIIIIZZ(list, "inviteContent.linkerInviteMsgExtra.otherRivalExtra");
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<InviterRivalExtra> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().userId));
        }
        long j15 = linkerInviteContent3.fromUserId;
        LinkerInviteMessageExtra linkerInviteMessageExtra3 = linkerInviteContent3.linkerInviteMsgExtra;
        if (linkerInviteMessageExtra3 != null) {
            num = Integer.valueOf(linkerInviteMessageExtra3.inviteType);
        } else {
            num = null;
        }
        C75642TmQ.LJJLIIIJJIZ(false, j15, arrayList, num);
        Long roomId2 = inviteMessage.getInviter().getRoomId();
        if (roomId2 != null) {
            j9 = roomId2.longValue();
        } else {
            j9 = 0;
        }
        Long userId4 = inviteMessage.getInviter().getUserId();
        if (userId4 != null) {
            j10 = userId4.longValue();
        } else {
            j10 = 0;
        }
        Long channelId3 = inviteMessage.getInviter().getChannelId();
        if (channelId3 != null) {
            j11 = channelId3.longValue();
        } else {
            j11 = 0;
        }
        MHJoinBizContent LIZ3 = C76005TsH.LIZ(linkerInviteContent3);
        ExtraDataWrapper extra4 = inviteMessage.getCustomMessage().getExtra();
        if (extra4 != null) {
            linkMessage3 = extra4.getLinkMessage();
        }
        MHMessageInfo LIZ4 = C75924Tqy.LIZ(linkMessage3);
        String str = linkerInviteContent3.fromLinkmicIdStr;
        if (str == null) {
            str = "";
        }
        LLJJI(session, new C75678Tn0(0, j10, j9, j11, str, LIZ3, LIZ4, inviteMessage, false));
    }

    @Override // X.InterfaceC75594Tle
    public final C75883TqJ LJJZ(long j, boolean z) {
        C75883TqJ LJI;
        if (!z ? (LJI = LJI(j)) == null || LJI.LIZLLL != C44432HcC.LJI() : (LJI = LJI(C44432HcC.LJI())) == null || LJI.LIZLLL != j) {
            LJI = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCoHostUserWithPlayType, isApply = ");
        LIZ.append(z);
        LIZ.append(", coHostUser = ");
        LIZ.append(LJI);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        return LJI;
    }

    @Override // X.U62
    public final void LJLIIIL(U65 session, GroupChangeMessage groupChangeMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGroupChangeMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(groupChangeMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLIIL(C75904Tqe c75904Tqe, InterfaceC75706TnS<OLT> interfaceC75706TnS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyCancel_new_arc, param = ");
        LIZ.append(c75904Tqe);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        C76002TsE c76002TsE = new C76002TsE(c75904Tqe.LJLJI, c75904Tqe.LJLJJI, null, 28);
        IDo0S413S0100000_13 iDo0S413S0100000_13 = new IDo0S413S0100000_13(interfaceC75706TnS, 7);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cancelApply, param = ");
        LIZ2.append(c76002TsE);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
        if (this.LJLJI == null) {
            return;
        }
        C75883TqJ LJI = LJI(C44432HcC.LJI());
        if (LJI != null) {
            LJI.LJI(EnumC75909Tqj.CANCELING);
        }
        new C75878TqE().LJJIIZ(c76002TsE.LIZIZ, "");
        C75878TqE c75878TqE = new C75878TqE();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB == null) {
            return;
        }
        interfaceC75441TjB.LJJJJIZL(c76002TsE, new C75894TqU(c75878TqE, c76002TsE, iDo0S413S0100000_13, LJI, this));
    }

    @Override // X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB session, int i) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkMicStateChanged");
        LIZ.append(", state = ");
        LIZ.append(i);
        LIZ.append(", mLinkMicSession = ");
        LIZ.append(this.LJLJI);
        LIZ.append(", session = ");
        LIZ.append(session);
        LIZ.append(' ');
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onLinkMicStateChanged")) {
            return;
        }
        if (i != 0) {
            if (i != 6) {
                return;
            }
            if (this.LJLJL == EnumC75620Tm4.Applied) {
                C30868C9o.LIZJ(R.string.mui);
            }
            String LIZIZ = YE1.LIZIZ("onLinkMicStateChanged", ", state = ", i);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("refuseAllUserOnLinkMicFinish, source = ");
            LIZ2.append(LIZIZ);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
            LLJJIJIL(LIZIZ);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("refuseApplied, source = ");
            JBR.LJIIJ(LIZ3, LIZIZ, LIZ3, "MultiHostMultiAdapter");
            Collection<C75883TqJ> values = this.LJLJLLL.values();
            o.LJIIIIZZ(values, "coHostUserMap.values");
            ArrayList arrayList = new ArrayList();
            for (C75883TqJ c75883TqJ : values) {
                if (c75883TqJ.LJJI == EnumC75909Tqj.APPLIED) {
                    arrayList.add(c75883TqJ);
                }
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("refuseApplied, userList = ");
            LIZ4.append(arrayList.size());
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ4));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C75883TqJ c75883TqJ2 = (C75883TqJ) it.next();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("refuseApplied, user = ");
                LIZ5.append(c75883TqJ2);
                C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ5));
                LJJLJLI(new C75993Ts5(c75883TqJ2.LIZIZ, c75883TqJ2.LIZ, null, null, 7, null, 108), null, null);
            }
            LLJJJJLIIL(EnumC75620Tm4.Finished, false);
        }
        LLJJ("onLinkMicStateChanged");
    }

    @Override // X.U6Y
    public final void LJLJL(long j, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyTimerCountDown");
        LIZ.append(", uid = ");
        LIZ.append(j);
        LIZ.append(", timeLeft = ");
        LIZ.append(j2);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onApplyTimerCountDown") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, j2, EnumC75915Tqp.SDK_APPLY);
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLJLJ(C75904Tqe c75904Tqe, InterfaceC75706TnS<OLT> interfaceC75706TnS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inviteCancel_new_arc, param = ");
        LIZ.append(c75904Tqe);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        C76001TsD c76001TsD = new C76001TsD(c75904Tqe.LJLJI, c75904Tqe.LJLJJI, 0L, 60);
        IDo0S413S0100000_13 iDo0S413S0100000_13 = new IDo0S413S0100000_13(interfaceC75706TnS, 10);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cancelInvite, param = ");
        LIZ2.append(c76001TsD);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
        if (this.LJLJI == null) {
            return;
        }
        new C75878TqE().LJJIJIIJIL(c76001TsD.LIZIZ, "");
        C75883TqJ c75883TqJ = this.LJLJLLL.get(Long.valueOf(c76001TsD.LIZIZ));
        if (c75883TqJ != null) {
            c75883TqJ.LJI(EnumC75909Tqj.CANCELING);
        }
        C75878TqE c75878TqE = new C75878TqE();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB == null) {
            return;
        }
        interfaceC75441TjB.LLIIIJ(c76001TsD, new C75895TqV(c75878TqE, c76001TsD, iDo0S413S0100000_13, this));
    }

    @Override // X.U62
    public final void LJLLILLLL(InterfaceC75441TjB session, PermitApplyMessage permitApplyMessage) {
        Long userId;
        LinkerReplyContent linkerReplyContent;
        LinkMessage linkMessage;
        long j;
        long j2;
        long j3;
        long j4;
        LinkMessage linkMessage2;
        String str;
        LinkMessage linkMessage3;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPermitApplyMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(permitApplyMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (!LLJJIJIIJIL("onPermitApplyMessageReceived") && o.LJ(session, this.LJLJI) && (userId = permitApplyMessage.getApprover().getUserId()) != null) {
            long longValue = userId.longValue();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPermitApplyMessageReceived");
            LIZ2.append(", permitUserId = ");
            LIZ2.append(longValue);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
            ExtraDataWrapper extra = permitApplyMessage.getCustomMessage().getExtra();
            C75648TmW c75648TmW = null;
            if (extra != null && (linkMessage3 = extra.getLinkMessage()) != null) {
                linkerReplyContent = linkMessage3.replyContent;
            } else {
                linkerReplyContent = null;
            }
            this.LJLJJLL.LIZLLL(longValue);
            int permitStatus = permitApplyMessage.getPermitStatus();
            boolean z = true;
            if (permitStatus != 1) {
                C75878TqE c75878TqE = new C75878TqE();
                ExtraDataWrapper extra2 = permitApplyMessage.getCustomMessage().getExtra();
                if (extra2 != null) {
                    linkMessage2 = extra2.getLinkMessage();
                } else {
                    linkMessage2 = null;
                }
                c75878TqE.LJJIL(longValue, permitStatus, linkMessage2);
                if (permitStatus != 2 && permitStatus != 5) {
                    z = false;
                }
                if (!C44432HcC.LJIJI(this.LJLJLJ) && z) {
                    LLJJI(session, new C75939TrD());
                }
                C75648TmW c75648TmW2 = B5G.LIZIZ().LJJJ;
                if (c75648TmW2 != null) {
                    str = c75648TmW2.LIZ;
                } else {
                    str = null;
                }
                String str2 = B5G.LIZIZ().LJJLJ;
                LLJJJJ(longValue);
                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                if (str != null) {
                    c75648TmW = new C75648TmW(str);
                }
                LIZIZ.LJJJ = c75648TmW;
                B5G.LIZIZ().LJJLJ = str2;
            } else {
                C75878TqE c75878TqE2 = new C75878TqE();
                ExtraDataWrapper extra3 = permitApplyMessage.getCustomMessage().getExtra();
                if (extra3 != null) {
                    linkMessage = extra3.getLinkMessage();
                } else {
                    linkMessage = null;
                }
                c75878TqE2.LJIIZILJ(longValue, linkMessage);
                LLJILLL(null);
                LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLL;
                if (linkCrossRoomDataHolder != null) {
                    Long channelId = permitApplyMessage.getApprover().getChannelId();
                    if (channelId != null) {
                        j = channelId.longValue();
                    } else {
                        j = 0;
                    }
                    linkCrossRoomDataHolder.LJFF = j;
                }
                LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJLL;
                if (linkCrossRoomDataHolder2 != null) {
                    linkCrossRoomDataHolder2.LJI = longValue;
                }
                LLJJJJLIIL(EnumC75620Tm4.Prepared, false);
            }
            Long roomId = permitApplyMessage.getApprover().getRoomId();
            if (roomId != null) {
                j2 = roomId.longValue();
            } else {
                j2 = 0;
            }
            Long userId2 = permitApplyMessage.getApprover().getUserId();
            if (userId2 != null) {
                j3 = userId2.longValue();
            } else {
                j3 = 0;
            }
            Long channelId2 = permitApplyMessage.getApprover().getChannelId();
            if (channelId2 != null) {
                j4 = channelId2.longValue();
            } else {
                j4 = 0;
            }
            MHPermitJoinBizContent mHPermitJoinBizContent = new MHPermitJoinBizContent();
            if (linkerReplyContent != null) {
                mHPermitJoinBizContent.replyStatus = linkerReplyContent.replyStatus;
                mHPermitJoinBizContent.sourceType = (int) linkerReplyContent.sourceType;
            }
            LLJJI(session, new C75677Tmz(1, permitStatus, j3, j2, j4, mHPermitJoinBizContent, false, permitApplyMessage));
        }
    }

    @Override // X.InterfaceC75720Tng
    public final void LJLLJ(OLX olx, InterfaceC75706TnS<OLS> interfaceC75706TnS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leave_new_arc, param = ");
        LIZ.append(olx);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        LLILLIZIL(new C76012TsO(olx.LJLILLLLZI, olx.LJLJI, null, olx.LJLJJI, 4), new IDo0S413S0100000_13((C75717Tnd) interfaceC75706TnS, 12));
    }

    @Override // X.U62
    public final void LJLLLL(U65 session, ApplyGroupMessage applyGroupMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplyGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(applyGroupMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJLZ(InterfaceC75441TjB session, CreateChannelMessage createChannelMessage) {
        LinkMessage linkMessage;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder;
        o.LJIIIZ(session, "session");
        EnumC75780Toe LJLJLLL = session.LJLJLLL();
        StringBuilder LIZJ = b1.LIZJ("onCreateChannelMessageReceived", ", session scene = ");
        LIZJ.append(session.scene());
        LIZJ.append(", session type = ");
        LIZJ.append(LJLJLLL);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
        if (!this.LJLLILLLL && !LLJJIJIIJIL("onCreateChannelMessageReceived") && session.scene() == 2 && LJLJLLL == EnumC75780Toe.CoLinkMicSession) {
            C75600Tlk c75600Tlk = new C75600Tlk();
            ExtraDataWrapper extra = createChannelMessage.getCustomMessage().getExtra();
            Long l = null;
            if (extra != null) {
                linkMessage = extra.getLinkMessage();
            } else {
                linkMessage = null;
            }
            if (linkMessage != null) {
                AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "message_id", Long.valueOf(linkMessage.getMessageId()), true);
                CommonMessageData commonMessageData = linkMessage.baseMessage;
                if (commonMessageData != null) {
                    l = Long.valueOf(commonMessageData.createTime);
                }
                AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "message_create_time", l, true);
                AbstractC75865Tq1.LJIIIZ(c75600Tlk.LIZLLL, "message_fetch_time", Long.valueOf(linkMessage.timestamp), true);
                if (C75877TqD.LJII == 0) {
                    C75877TqD.LJII = EnumC31946CgI.MULTI_ARCH.getType();
                }
            } else if (C75877TqD.LJII == 0) {
                C75877TqD.LJII = EnumC31946CgI.CROSS_ROOM_ARCH.getType();
            }
            C75877TqD.LJ = SystemClock.uptimeMillis();
            C75877TqD.LJFF = false;
            c75600Tlk.LJIILLIIL("enter_message");
            LLJJIJI("onCreateChannelMessageReceived");
            if (createChannelMessage.getOwner().getChannelId() != null) {
                Long channelId = createChannelMessage.getOwner().getChannelId();
                long j = 0;
                if ((channelId == null || channelId.longValue() != 0) && (linkCrossRoomDataHolder = this.LJLL) != null) {
                    Long channelId2 = createChannelMessage.getOwner().getChannelId();
                    if (channelId2 != null) {
                        j = channelId2.longValue();
                    }
                    linkCrossRoomDataHolder.LJFF = j;
                }
            }
            LLJJI(session, new C75501Tk9(true));
        }
    }

    @Override // X.U62
    public final void LJZ(InterfaceC75441TjB session, CancelApplyMessage cancelApplyMessage) {
        long j;
        LinkMessage linkMessage;
        long j2;
        Object obj;
        long j3;
        long j4;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelApplyMessageReceived");
        LIZ.append(", session = ");
        LIZ.append(session);
        LIZ.append(", message = ");
        LIZ.append(cancelApplyMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onCancelApplyMessageReceived") || !o.LJ(session, this.LJLJI) || this.LJLLI == null) {
            return;
        }
        C75878TqE c75878TqE = new C75878TqE();
        Long userId = cancelApplyMessage.getApplicant().getUserId();
        long j5 = 0;
        if (userId != null) {
            j = userId.longValue();
        } else {
            j = 0;
        }
        ExtraDataWrapper extra = cancelApplyMessage.getCustomMessage().getExtra();
        LinkerInviteContent linkerInviteContent = null;
        if (extra != null) {
            linkMessage = extra.getLinkMessage();
        } else {
            linkMessage = null;
        }
        c75878TqE.LJJIIJZLJL(j, linkMessage);
        C75884TqK c75884TqK = this.LJLJJLL;
        Long userId2 = cancelApplyMessage.getApplicant().getUserId();
        if (userId2 != null) {
            j2 = userId2.longValue();
        } else {
            j2 = 0;
        }
        c75884TqK.LIZLLL(j2);
        ExtraDataWrapper extra2 = cancelApplyMessage.getCustomMessage().getExtra();
        if (extra2 != null) {
            obj = extra2.getContent();
        } else {
            obj = null;
        }
        if (obj instanceof LinkerInviteContent) {
            linkerInviteContent = (LinkerInviteContent) obj;
        }
        Long roomId = cancelApplyMessage.getApplicant().getRoomId();
        if (roomId != null) {
            j3 = roomId.longValue();
        } else {
            j3 = 0;
        }
        Long userId3 = cancelApplyMessage.getApplicant().getUserId();
        if (userId3 != null) {
            j4 = userId3.longValue();
        } else {
            j4 = 0;
        }
        Long channelId = cancelApplyMessage.getApplicant().getChannelId();
        if (channelId != null) {
            j5 = channelId.longValue();
        }
        LLJJI(session, new C75681Tn3(1, j4, j3, j5, C76005TsH.LIZ(linkerInviteContent), false, cancelApplyMessage));
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
        if (LLJJIJIIJIL("onRemoteRender")) {
            return;
        }
        LLJJI(session, new C75607Tlr(linkMicId));
    }

    @Override // X.U62
    public final void LLFF(U65 session, PermitApplyGroupMessage permitApplyGroupMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPermitApplyGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(permitApplyGroupMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPermitApplyGroupMessageReceived");
        LIZ2.append(", agreeStatus = ");
        LIZ2.append(permitApplyGroupMessage.getAgreeStatus());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
    }

    @Override // X.U6Y
    public final void LLIIIILZ(long j, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInviteTimerCountDown");
        LIZ.append(", uid = ");
        LIZ.append(j);
        LIZ.append(", timeLeft = ");
        LIZ.append(j2);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onInviteTimerCountDown") || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZJ(j, j2, EnumC75915Tqp.SDK_INVITE);
    }

    @Override // X.U62
    public final void LLIIIJ(U65 session, RtcStartResultMessage rtcStartResultMessage) {
        String str;
        o.LJIIIZ(session, "session");
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        Room room = this.LJLLI;
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
        U8H LJJZZI;
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
            LJJZZI.LJIILL().put(str, n2j);
        }
    }

    @Override // X.U62
    public final void LLIIJI(U65 session, CancelApplyGroupMessage cancelApplyGroupMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelApplyGroupMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(cancelApplyGroupMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILII(X.InterfaceC75441TjB r22, com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage r23) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl.LLILII(X.TjB, com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage):void");
    }

    @Override // X.U62
    public final void LLILIL(U65 session, P2PGroupChangeMessage p2PGroupChangeMessage) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onP2PGroupChangeMessageReceived");
        LIZ.append(", message = ");
        LIZ.append(p2PGroupChangeMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ee, code lost:
    
        if (r0 == null) goto L50;
     */
    @Override // X.InterfaceC75720Tng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILL(X.C75759ToJ r24, X.InterfaceC75706TnS<X.OLV> r25) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl.LLILL(X.ToJ, X.TnS):void");
    }

    @Override // X.InterfaceC75719Tnf
    public final void LLILLIZIL(C76012TsO c76012TsO, InterfaceC75414Tik<LeaveChannelResult> interfaceC75414Tik) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leave, param = ");
        LIZ.append(c76012TsO);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLJI == null) {
            return;
        }
        C75878TqE c75878TqE = new C75878TqE();
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(8));
        }
        C75878TqE c75878TqE2 = new C75878TqE();
        String str = c76012TsO.LIZ;
        if (str == null) {
            str = "";
        }
        c75878TqE2.LJJJLL(str);
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJLIIIJ(c76012TsO, new C75905Tqf(c75878TqE, c76012TsO, interfaceC75414Tik, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0238, code lost:
    
        r8 = X.EnumC75674Tmw.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x023a, code lost:
    
        r7 = X.C8E.LIZLLL().LLII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0242, code lost:
    
        if (r3 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0244, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0245, code lost:
    
        X.QZP.LIZJ("tryRefuseApply, refuseReason = ", r3, "MultiRefuseManager");
        r0 = r6.inviteContent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x024c, code lost:
    
        if (r0 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024e, code lost:
    
        r0 = r0.fromUserId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0250, code lost:
    
        X.C75724Tnk.LIZJ(true, r3, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0254, code lost:
    
        if (r3 <= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0262, code lost:
    
        if (X.C8E.LIZLLL().LJJLI() > 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0264, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0265, code lost:
    
        r2 = r6.inviteContent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0267, code lost:
    
        if (r2 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0269, code lost:
    
        r0 = r2.fromUserId;
        r14 = r2.fromRoomId;
        r2 = r2.fromLinkmicIdStr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x026f, code lost:
    
        if (r2 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0271, code lost:
    
        LJJLJLI(new X.C75993Ts5(r14, r0, null, r19, r3, null, 100), new X.SFS(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x028a, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028d, code lost:
    
        r0 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02c6, code lost:
    
        r7 = null;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0292, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029d, code lost:
    
        if (X.C76265TwT.LIZ.LIZ(X.EnumC76178Tv4.INVITED) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029f, code lost:
    
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a6, code lost:
    
        if (r8.isMultiCoHost() != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a8, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ac, code lost:
    
        if (X.C75492Tk0.LJLLLL == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ae, code lost:
    
        r3 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b3, code lost:
    
        if (r7 == X.EnumC75620Tm4.Linked) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b5, code lost:
    
        r3 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ba, code lost:
    
        if (r7 != X.EnumC75620Tm4.Received) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02bc, code lost:
    
        r3 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02bf, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c2, code lost:
    
        if (r7 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0236, code lost:
    
        if (r8 == null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILLJJLI(X.InterfaceC75441TjB r27, com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage r28) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl.LLILLJJLI(X.TjB, com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage):void");
    }

    @Override // X.U6Y
    public final void LLIZ(long j, long j2) {
        StringBuilder LIZJ = V10.LIZJ("onApplyGroupTimerCountDown, uid = ", j, ", timeLeft = ");
        C0RN.LJ(LIZJ, j2, LIZJ, "MultiHostMultiAdapter");
    }

    @Override // X.U6Y
    public final void LLJ(long j, long j2) {
        StringBuilder LIZJ = V10.LIZJ("onInviteGroupTimerCountDown, uid = ", j, ", timeLeft = ");
        C0RN.LJ(LIZJ, j2, LIZJ, "MultiHostMultiAdapter");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        if (r3 == null) goto L50;
     */
    @Override // X.InterfaceC75720Tng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJI(X.C75759ToJ r29, X.InterfaceC75706TnS<X.OLV> r30) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl.LLJI(X.ToJ, X.TnS):void");
    }

    @Override // X.U62
    public final void LLJIJIL(U65 u65, ReplyInviteMessage replyInviteMessage) {
        TRA.LJIJJ(u65, replyInviteMessage);
    }

    public final void LLJJI(InterfaceC75441TjB interfaceC75441TjB, Object obj) {
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

    public final void LLJJJJLIIL(EnumC75620Tm4 enumC75620Tm4, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateState, this.state = ");
        LIZ.append(this.LJLJL);
        LIZ.append(" newState = ");
        LIZ.append(enumC75620Tm4);
        LIZ.append(", force = ");
        FT5.LJ(LIZ, z, LIZ, "MultiHostMultiAdapter");
        if (!C75635TmJ.LIZ(this.LJLJL, enumC75620Tm4, z, "MultiHostMultiAdapter")) {
            return;
        }
        EnumC75620Tm4 enumC75620Tm42 = this.LJLJL;
        this.LJLJL = enumC75620Tm4;
        C75635TmJ.LIZIZ(enumC75620Tm42, enumC75620Tm4, z, this.LJLJLJ, this.LJLL, "MultiHostMultiAdapter");
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
            Integer num2 = this.LJZ.get(linkMicId);
            if (num2 != null) {
                num = num2;
            }
            this.LJZ.put(linkMicId, Integer.valueOf(num.intValue() + 1));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteVideoStats");
            LIZ.append(", forward stream faild, linkmicId = ");
            LIZ.append(linkMicId);
            LIZ.append(", cnts: ");
            LIZ.append(this.LJZ.get(linkMicId));
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        } else {
            Integer num3 = this.LJZ.get(linkMicId);
            if (num3 == null) {
                num3 = num;
            }
            if (num3.intValue() >= 5 && f != 0.0f) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onRemoteVideoStats");
                LIZ2.append(", resume cohost, linkmicId = ");
                LIZ2.append(linkMicId);
                LIZ2.append(", pull stream success");
                C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
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
            this.LJZ.put(linkMicId, num);
        }
        Integer num4 = this.LJZ.get(linkMicId);
        if (num4 == null || num4.intValue() != 5 || (dataChannel = this.LJLJLJ) == null) {
            return;
        }
        dataChannel.qv0(MultiCoHostStreamStatsEvent.class, new C75589TlZ(EnumC75775ToZ.FORWARD_STREAM_FAILED, linkMicId));
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        o.LJIIIZ(session, "session");
        if (LLJJIJIIJIL("onNetworkQualityUpdate")) {
            return;
        }
        C75877TqD.LJIIJ = i;
        C75877TqD.LJIIJJI = i2;
    }

    @Override // X.InterfaceC75719Tnf
    public final void LJJLJLI(C75993Ts5 c75993Ts5, InterfaceC75414Tik<PermitResult> interfaceC75414Tik, Map<String, ? extends Object> map) {
        boolean z;
        Object obj;
        long j;
        boolean z2;
        Boolean bool;
        Long l;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply, param = ");
        LIZ.append(c75993Ts5);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLJI == null) {
            return;
        }
        this.LJLJJLL.LIZLLL(c75993Ts5.LIZIZ);
        if (c75993Ts5.LJ == 1) {
            z = true;
        } else {
            z = false;
        }
        Object obj2 = null;
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (map != null) {
            obj2 = map.get("is_turn_off");
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        if (z) {
            new C75878TqE().LJIJ(c75993Ts5.LIZIZ, j);
        } else {
            new C75878TqE().LJJIZ(c75993Ts5.LIZIZ, j, c75993Ts5.LJ, z2);
        }
        C75878TqE c75878TqE = new C75878TqE();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LLIIIZ(c75993Ts5, new C75889TqP(z, c75878TqE, c75993Ts5, this, interfaceC75414Tik));
        }
        if (c75993Ts5.LJ == 1) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLL;
            if (linkCrossRoomDataHolder != null) {
                linkCrossRoomDataHolder.LJ = true;
            }
            LLJJJJLIIL(EnumC75620Tm4.Prepared, false);
        }
    }

    @Override // X.U62
    public final void LJLI(U65 session, LinkUser joinedUser, CustomLinkMessage customLinkMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(joinedUser, "joinedUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserJoined");
        LIZ.append(", message = ");
        LIZ.append(customLinkMessage);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onUserJoined")) {
            return;
        }
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
        boolean z;
        Object obj;
        long j;
        Object obj2;
        boolean z2;
        Boolean bool;
        Long l;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite, param = ");
        LIZ.append(c75911Tql);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        Room LJIILL = C1DH.LJIILL(this.LJLJLJ);
        if (LJIILL == null) {
            return;
        }
        this.LJLJJLL.LIZLLL(LJIILL.getOwnerUserId());
        if (c75911Tql.LIZJ == 1) {
            z = true;
        } else {
            z = false;
        }
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (map != null) {
            obj2 = map.get("is_turn_off");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        if (z) {
            new C75878TqE().LJIJJLI(c75911Tql.LIZIZ, j);
        } else {
            new C75878TqE().LJJJJ(c75911Tql.LIZIZ, j, c75911Tql.LIZJ, z2);
        }
        C75877TqD.LIZIZ = SystemClock.uptimeMillis();
        C75878TqE c75878TqE = new C75878TqE();
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJLIIIJL(c75911Tql, new C75888TqO(z, c75878TqE, c75911Tql, this, interfaceC75414Tik));
        }
        if (c75911Tql.LIZJ == 1) {
            LLJILLL(null);
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLL;
            if (linkCrossRoomDataHolder != null) {
                linkCrossRoomDataHolder.LJ = true;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("replyInvite, replyStatus = ");
            LIZ2.append(c75911Tql.LIZJ);
            LIZ2.append(", dataChannel = ");
            LIZ2.append(this.LJLJLJ);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
            DataChannel dataChannel = this.LJLJLJ;
            if (dataChannel != null) {
                dataChannel.rv0(LinkCrossRoomStateChangeEvent.class, new C32208CkW(4));
            }
            LLJJJJLIIL(EnumC75620Tm4.Prepared, false);
        }
        C75597Tlh.LIZJ(c75911Tql.LIZJ);
    }

    @Override // X.U62
    public final void LLIIZ(U65 session, boolean z, LinkCoreError linkCoreError) {
        o.LJIIIZ(session, "session");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public final void LLJJJJJIL(LinkUser linkUser, EnumC75909Tqj enumC75909Tqj, long j) {
        String str;
        ImageModel imageModel;
        boolean z;
        long longValue;
        EnumC75909Tqj enumC75909Tqj2;
        String str2;
        ImageModel imageModel2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("myBestTeammateUid = ");
        LIZ.append(j);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("myUid = ");
        LIZ2.append(linkUser.getUserId());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
        Long userId = linkUser.getUserId();
        if (userId != null) {
            long longValue2 = userId.longValue();
            C75883TqJ c75883TqJ = this.LJLJLLL.get(Long.valueOf(longValue2));
            if (c75883TqJ == null) {
                c75883TqJ = LLJJIII(longValue2);
            }
            Object extra = linkUser.getExtra();
            long j2 = 0;
            String str3 = "";
            if (extra instanceof CohostListUser) {
                CohostListUser cohostListUser = (CohostListUser) extra;
                Long l = cohostListUser.userId;
                if (l == null || j != l.longValue()) {
                    z = false;
                } else {
                    z = true;
                }
                c75883TqJ.LJIJ = z;
                Long l2 = cohostListUser.roomId;
                if (l2 == null) {
                    longValue = 0;
                } else {
                    longValue = l2.longValue();
                }
                c75883TqJ.LIZIZ = longValue;
                if (LiveCohostMultiUserInfoFixSetting.INSTANCE.isEnable()) {
                    String str4 = cohostListUser.displayId;
                    if (str4 != null && (str2 = cohostListUser.nickName) != null && (imageModel2 = cohostListUser.avatarThumb) != null) {
                        c75883TqJ.LJIIZILJ = new C75768ToS(str4, str2, imageModel2);
                    }
                } else {
                    String str5 = cohostListUser.displayId;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = cohostListUser.nickName;
                    if (str6 == null) {
                        str6 = "";
                    }
                    c75883TqJ.LJIIZILJ = new C75768ToS(str5, str6, cohostListUser.avatarThumb);
                }
                C75675Tmx c75675Tmx = EnumC75674Tmw.Companion;
                int i = cohostListUser.permissionType;
                c75675Tmx.getClass();
                EnumC75674Tmw enumC75674Tmw = EnumC75674Tmw.SUPPORT_MULTI;
                if (i != enumC75674Tmw.getPermissionType()) {
                    enumC75674Tmw = EnumC75674Tmw.NONE;
                }
                o.LJIIIZ(enumC75674Tmw, OHQ.LIZ);
                if (LiveCohostPermissionFallbackSetting.isEnable()) {
                    if (c75883TqJ.LJIILLIIL) {
                        c75883TqJ.LJIILLIIL = false;
                        c75883TqJ.LJIILL = enumC75674Tmw;
                    } else if (c75883TqJ.LJIILL.getPermissionType() > enumC75674Tmw.getPermissionType()) {
                        C75878TqE c75878TqE = new C75878TqE();
                        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "fallback_uid", Long.valueOf(c75883TqJ.LIZ), true);
                        c75878TqE.LJIILLIIL("anchor_list_permission_fallback");
                    } else {
                        c75883TqJ.LJIILL = enumC75674Tmw;
                    }
                } else {
                    c75883TqJ.LJIILL = enumC75674Tmw;
                }
                c75883TqJ.LJIL = cohostListUser.hasTopicPerm;
                Long l3 = cohostListUser.rivalUserId;
                if (l3 != null) {
                    c75883TqJ.LIZLLL = l3.longValue();
                }
                c75883TqJ.LJIILJJIL = cohostListUser.playType;
                Boolean bool = cohostListUser.isLowVersion;
                if (bool != null) {
                    c75883TqJ.LJIJJ = bool.booleanValue();
                }
                Long l4 = cohostListUser.linkedTime;
                if (l4 != null) {
                    c75883TqJ.LJFF = l4.longValue();
                }
                Long l5 = cohostListUser.linkRemainingTime;
                if (l5 != null) {
                    c75883TqJ.LJI = l5.longValue();
                }
                String str7 = cohostListUser.linkmicIdStr;
                if (str7 != null) {
                    c75883TqJ.LJII = str7;
                }
                EnumC75909Tqj enumC75909Tqj3 = c75883TqJ.LJJI;
                if (enumC75909Tqj3 != EnumC75909Tqj.INVITING && enumC75909Tqj3 != EnumC75909Tqj.APPLYING) {
                    C75930Tr4 c75930Tr4 = EnumC75909Tqj.Companion;
                    int i2 = cohostListUser.linkmicUserStatus;
                    c75930Tr4.getClass();
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                enumC75909Tqj2 = EnumC75909Tqj.IDLE;
                            } else {
                                enumC75909Tqj2 = EnumC75909Tqj.INVITED;
                            }
                        } else {
                            enumC75909Tqj2 = EnumC75909Tqj.APPLIED;
                        }
                    } else {
                        enumC75909Tqj2 = EnumC75909Tqj.LINKED;
                    }
                    c75883TqJ.LJI(enumC75909Tqj2);
                }
            } else if (extra instanceof LinkmicUser) {
                if (LiveCohostMultiUserInfoFixSetting.INSTANCE.isEnable()) {
                    LinkmicUser linkmicUser = (LinkmicUser) extra;
                    c75883TqJ.LIZIZ = linkmicUser.roomId;
                    String str8 = linkmicUser.linkMicIdStr;
                    o.LJIIIZ(str8, "<set-?>");
                    c75883TqJ.LJII = str8;
                    String str9 = linkmicUser.displayId;
                    if (str9 != null && (str = linkmicUser.nickName) != null && (imageModel = linkmicUser.avatar) != null) {
                        c75883TqJ.LJIIZILJ = new C75768ToS(str9, str, imageModel);
                    }
                }
            } else {
                o.LJIIIZ(enumC75909Tqj, "<set-?>");
                c75883TqJ.LJJI = enumC75909Tqj;
            }
            Long roomId = linkUser.getRoomId();
            if (roomId != null) {
                j2 = roomId.longValue();
            }
            c75883TqJ.LIZIZ = j2;
            String linkMicId = linkUser.getLinkMicId();
            if (linkMicId != null) {
                str3 = linkMicId;
            }
            c75883TqJ.LJII = str3;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("updateCoHostUserFromLinkUser, multiCoHostUser= ");
            LIZ3.append(c75883TqJ);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ3));
        }
    }

    @Override // X.U62
    public final void LJJLIIIJL(InterfaceC75441TjB session, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        int i2;
        o.LJIIIZ(session, "session");
        if (LLJJIJIIJIL("onLinkMicFinishReason")) {
            return;
        }
        if (linkCoreError != null) {
            i2 = linkCoreError.getErrorCode();
        } else {
            i2 = -1;
        }
        LLJJI(session, new C75935Tr9(i, i2, abnormalDisconnectReason));
        new C75878TqE().LJJJZ(i, linkCoreError);
    }

    @Override // X.InterfaceC75594Tle
    public final void LJJZZI(ViewGroup viewGroup, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, boolean z) {
        OSZ<Integer, Integer> osz;
        U8H LJJZZI;
        U8H LJJZZI2;
        List<LinkmicUser> list;
        long j;
        InterfaceC75973Trl LLIIJI;
        RoomLinkInfo linkMicInfo;
        MultiLiveUserSettings multiLiveUserSettings;
        CoHost coHost;
        List<LinkUser> LJJIIZI;
        int i = 0;
        this.LJLLLLLL = false;
        LLJJIJI("startCoHostUI");
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(viewGroup, new ARunnableS28S0200000_9(viewGroup, this, 6), 3));
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB == null) {
            FP1.LJFF("startCoHostUI", ", return by tempSession=null", "MultiHostMultiAdapter");
            return;
        }
        if (!this.LJLLILLLL) {
            InterfaceC75973Trl LLIIJI2 = interfaceC75441TjB.LLIIJI();
            if (LLIIJI2 != null && (LJJIIZI = LLIIJI2.LJJIIZI()) != null) {
                i = LJJIIZI.size();
            }
            Room room = this.LJLLI;
            if (room == null || (((multiLiveUserSettings = room.multiLiveUserSettings) == null || (coHost = multiLiveUserSettings.coHost) == null || (list = coHost.linkedUsers) == null) && (list = C61878OQg.INSTANCE) == null)) {
                list = C61878OQg.INSTANCE;
            }
            if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null) {
                j = linkMicInfo.channelId;
            } else {
                j = 0;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startCoHostUI");
            LIZ.append(", sdkLinkedSize = ");
            LIZ.append(i);
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startCoHostUI");
            LIZ2.append(", roomLinkedList size = ");
            LIZ2.append(list.size());
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startCoHostUI");
            LIZ3.append(", linkChannelId = ");
            C0RN.LJ(LIZ3, j, LIZ3, "MultiHostMultiAdapter");
            if (i <= 0 && (!list.isEmpty()) && j > 0) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                for (LinkmicUser linkmicUser : list) {
                    Long valueOf = Long.valueOf(linkmicUser.roomId);
                    Long valueOf2 = Long.valueOf(linkmicUser.userId);
                    Long valueOf3 = Long.valueOf(j);
                    String str = linkmicUser.linkMicIdStr;
                    if (!LiveCohostMultiUserInfoFixSetting.INSTANCE.isEnable()) {
                        linkmicUser = null;
                    }
                    arrayList.add(new LinkUser(valueOf, valueOf2, valueOf3, str, null, linkmicUser, null, null, null, null, null, null, 4032, null));
                }
                InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
                if (interfaceC75441TjB2 != null && (LLIIJI = interfaceC75441TjB2.LLIIJI()) != null) {
                    LLIIJI.LJJJIL(new ArrayList(arrayList));
                }
            }
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.lv0(lifecycleOwner, MultiGuestV3VideoSizeChannel.class, new AqS117S0300000_13(this, viewGroup, frameLayout, 1));
            dataChannel.lv0(lifecycleOwner, PIPModeChangeEvent.class, new AqS179S0100000_13(this, 204));
        }
        DataChannel dataChannel2 = this.LJLJLJ;
        if (dataChannel2 != null) {
            osz = (OSZ) dataChannel2.kv0(MultiGuestV3VideoSizeChannel.class);
        } else {
            osz = null;
        }
        InterfaceC75441TjB interfaceC75441TjB3 = this.LJLJI;
        if (interfaceC75441TjB3 != null && (LJJZZI2 = interfaceC75441TjB3.LJJZZI()) != null) {
            LJJZZI2.n1(viewGroup, frameLayout, osz);
        }
        InterfaceC75441TjB interfaceC75441TjB4 = this.LJLJI;
        if (interfaceC75441TjB4 != null && (LJJZZI = interfaceC75441TjB4.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJILLIZJL();
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("startCoHostUI");
        LIZ4.append(", container = ");
        LIZ4.append(viewGroup);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ4));
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
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onWindowStateChanged") || this.LJLJI == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onWindowStateChanged");
        LIZ2.append(", window = ");
        LIZ2.append(window);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onWindowStateChanged");
        LIZ3.append(", oldState = ");
        LIZ3.append(oldState);
        LIZ3.append(", newState = ");
        LIZ3.append(newState);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("onWindowStateChanged");
        LIZ4.append(", isRoomOwnerWindow = ");
        LIZ4.append(window.LJLJI());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ4));
        boolean z = this.LJLLILLLL;
        if (z && oldState == newState) {
            FP1.LJFF("onWindowStateChanged", ", return, oldState == newState", "MultiHostMultiAdapter");
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
        if (window.LJLJI() && window.LJJIL() == EnumC75419Tip.StateLinked && this.LJLLILLLL) {
            C75621Tm5.LJIIIZ(window.LJJ());
        }
        Rect LJJLIIIJ = window.LJJLIIIJ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("onWindowStateChanged");
        LIZ5.append(", rect = ");
        LIZ5.append(LJJLIIIJ);
        LIZ5.append(" width=");
        LIZ5.append(LJJLIIIJ.width());
        LIZ5.append("  height=");
        LIZ5.append(LJJLIIIJ.height());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("onWindowStateChanged");
        LIZ6.append(", ---------");
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ6));
        if (!window.LJLJI() && window.LJJIL() == EnumC75419Tip.StateLinked) {
            LLJJJJLIIL(EnumC75620Tm4.Linked, false);
        }
        C75728Tno c75728Tno = new C75728Tno(window, oldState, newState, 1);
        InterfaceC75441TjB interfaceC75441TjB2 = this.LJLJI;
        if (interfaceC75441TjB2 != null) {
            LLJJI(interfaceC75441TjB2, c75728Tno);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter
    public final void i9(Room room, DataChannel dataChannel, Context context, C75745To5 c75745To5, InterfaceC74805TXl interfaceC74805TXl) {
        Long l;
        boolean z;
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attach_legacy");
        LIZ.append(", dataChannel=");
        LIZ.append(dataChannel);
        LIZ.append(", roomId = ");
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.append(l);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (room == null || context == null) {
            return;
        }
        this.LJLIL = true;
        this.LJLJLJ = dataChannel;
        this.LJLL = B5G.LIZIZ();
        this.LJLLI = room;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLLILLLL = z;
        this.LJLLLL = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this);
        this.LJLJJI = c75745To5;
        this.LJLILLLLZI = interfaceC74805TXl;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.LJIIIZ(this);
        }
        LJJJJJ("attach_legacy", true);
        if (dataChannel == null) {
            return;
        }
        C75884TqK c75884TqK = this.LJLJJLL;
        c75884TqK.getClass();
        c75884TqK.LIZJ = dataChannel;
    }

    @Override // X.U62
    public final void LJZL(InterfaceC75441TjB session, List<LinkUser> linkedUsers, List<LinkUser> applicants, List<LinkUser> invitees, List<LinkUser> willJoinGroupUsers, List<LinkUser> liveUsers, List<LinkUser> invitingList, List<LinkUser> applyingList, String str, CustomLinkMessage customLinkMessage) {
        Object obj;
        Long l;
        boolean z;
        String str2;
        boolean z2;
        DataChannel dataChannel;
        Room room;
        LinkMessage linkMessage;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder;
        ExtraDataWrapper extra;
        BizContentWrapper bizContentWrapper;
        EnumC75617Tm1 enumC75617Tm1;
        Long l2;
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
        LIZ.append(", from = ");
        LIZ.append(str);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (LLJJIJIIJIL("onUserListChanged") || !o.LJ(session, this.LJLJI)) {
            return;
        }
        StringBuilder LIZJ = b1.LIZJ("onUserListChanged", ", before coHostUserMap size = ");
        LIZJ.append(this.LJLJLLL.size());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onUserListChanged");
        LIZ2.append(", linkedUsers size = ");
        LIZ2.append(linkedUsers.size());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onUserListChanged");
        LIZ3.append(", applicants size = ");
        LIZ3.append(applicants.size());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("onUserListChanged");
        LIZ4.append(", invitees size = ");
        LIZ4.append(invitees.size());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ4));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(linkedUsers, 10));
        Iterator<LinkUser> it = linkedUsers.iterator();
        while (it.hasNext()) {
            arrayList2.add(new OSZ(it.next(), EnumC75909Tqj.LINKED));
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(applicants, 10));
        Iterator<LinkUser> it2 = applicants.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new OSZ(it2.next(), EnumC75909Tqj.APPLIED));
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(invitees, 10));
        Iterator<LinkUser> it3 = invitees.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new OSZ(it3.next(), EnumC75909Tqj.INVITED));
        }
        arrayList.addAll(arrayList4);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.LJLJLLL);
        Object obj2 = null;
        if (LiveCohostLinkUserNPEFixSetting.INSTANCE.isEnable()) {
            Iterator it4 = arrayList.iterator();
            long j = 0;
            while (it4.hasNext()) {
                OSZ osz = (OSZ) it4.next();
                LinkUser linkUser = (LinkUser) osz.getFirst();
                StringBuilder LIZJ2 = b1.LIZJ("onUserListChanged", ", foreach state = ");
                LIZJ2.append(osz.getSecond());
                LIZJ2.append(" user = ");
                LIZJ2.append(linkUser);
                C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ2));
                if (linkUser != null) {
                    Object extra2 = linkUser.getExtra();
                    if (extra2 instanceof CohostListUser) {
                        CohostListUser cohostListUser = (CohostListUser) extra2;
                        Long l3 = cohostListUser.userId;
                        Room room2 = this.LJLLI;
                        if (room2 != null) {
                            l2 = Long.valueOf(room2.getOwnerUserId());
                        } else {
                            l2 = null;
                        }
                        if (o.LJ(l3, l2)) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("link uid = ");
                            LIZ5.append(cohostListUser.userId);
                            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ5));
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("bestteammate uid = ");
                            C0RN.LJ(LIZ6, cohostListUser.bestTeammateUid, LIZ6, "MultiHostMultiAdapter");
                            j = cohostListUser.bestTeammateUid;
                        }
                    }
                    LLJJJJJIL(linkUser, (EnumC75909Tqj) osz.getSecond(), j);
                    C65777Prh.LIZJ(hashMap).remove(linkUser.getUserId());
                }
            }
        } else {
            Iterator it5 = arrayList.iterator();
            long j2 = 0;
            while (it5.hasNext()) {
                LinkUser linkUser2 = (LinkUser) ((OSZ) it5.next()).getFirst();
                if (linkUser2 != null) {
                    obj = linkUser2.getExtra();
                } else {
                    obj = null;
                }
                if (obj instanceof CohostListUser) {
                    CohostListUser cohostListUser2 = (CohostListUser) obj;
                    Long l4 = cohostListUser2.userId;
                    Room room3 = this.LJLLI;
                    if (room3 != null) {
                        l = Long.valueOf(room3.getOwnerUserId());
                    } else {
                        l = null;
                    }
                    if (o.LJ(l4, l)) {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("link uid = ");
                        LIZ7.append(cohostListUser2.userId);
                        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ7));
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append("bestteammate uid = ");
                        C0RN.LJ(LIZ8, cohostListUser2.bestTeammateUid, LIZ8, "MultiHostMultiAdapter");
                        j2 = cohostListUser2.bestTeammateUid;
                    }
                }
            }
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                OSZ osz2 = (OSZ) it6.next();
                LinkUser linkUser3 = (LinkUser) osz2.getFirst();
                StringBuilder LIZJ3 = b1.LIZJ("onUserListChanged", ", foreach state = ");
                LIZJ3.append(osz2.getSecond());
                LIZJ3.append(" user = ");
                LIZJ3.append(linkUser3);
                C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ3));
                if (linkUser3 != null) {
                    LLJJJJJIL(linkUser3, (EnumC75909Tqj) osz2.getSecond(), j2);
                    C65777Prh.LIZJ(hashMap).remove(linkUser3.getUserId());
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder LIZJ4 = b1.LIZJ("onUserListChanged", ", remove uid = ");
            LIZJ4.append(((Number) entry.getKey()).longValue());
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ4));
            LLJJJ(((Number) entry.getKey()).longValue());
        }
        StringBuilder LIZJ5 = b1.LIZJ("onUserListChanged", ", after coHostUserMap size = ");
        LIZJ5.append(this.LJLJLLL.size());
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ5));
        for (Map.Entry<Long, C75883TqJ> entry2 : this.LJLJLLL.entrySet()) {
            StringBuilder LIZJ6 = b1.LIZJ("onUserListChanged", ",after user = ");
            LIZJ6.append(entry2.getValue());
            C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZJ6));
        }
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LJLJLLL, "coHostUserMap.values");
        while (true) {
            z = true;
            if (!LIZLLL.hasNext()) {
                break;
            }
            C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
            if (c75883TqJ.LIZ != C44432HcC.LJI() && c75883TqJ.LIZLLL > 0) {
                if (c75883TqJ.LJFF()) {
                    if (C75650TmY.LJI == EnumC75673Tmv.LINKING_SUCCESS) {
                        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJLL;
                        if (linkCrossRoomDataHolder2 != null) {
                            enumC75617Tm1 = linkCrossRoomDataHolder2.LJIIJJI;
                        } else {
                            enumC75617Tm1 = null;
                        }
                        if (enumC75617Tm1 == EnumC75617Tm1.TOPIC_INVITE && LJIILJJIL().size() == 2) {
                        }
                    }
                }
                if (c75883TqJ.LJ()) {
                    long j3 = c75883TqJ.LJI;
                    if (j3 > 0) {
                        this.LJLJJLL.LIZ(c75883TqJ.LIZ, j3 / 1000, EnumC75915Tqp.USER_LIST);
                    }
                }
                this.LJLJJLL.LIZLLL(c75883TqJ.LIZ);
            }
        }
        List<C75883TqJ> LJIL = LJIL();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        LLJJI(session, new C75593Tld(LJIL, str2, customLinkMessage));
        if (hashMap.size() < 2 && LJIL.size() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJLLILLLL && o.LJ(str, "im")) {
            DataChannel dataChannel2 = this.LJLJLJ;
            if (dataChannel2 != null) {
                room = (Room) dataChannel2.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            C75642TmQ c75642TmQ = C75642TmQ.LIZ;
            if (customLinkMessage != null && (bizContentWrapper = customLinkMessage.getBizContentWrapper()) != null) {
                bizContentWrapper.getBizContent();
            }
            c75642TmQ.LJJJI(room, linkedUsers, false);
            c75642TmQ.LJJJJ(room, linkedUsers);
            c75642TmQ.LJJIII(linkedUsers, applicants, invitees);
            C75878TqE c75878TqE = new C75878TqE();
            if (customLinkMessage != null && (extra = customLinkMessage.getExtra()) != null) {
                linkMessage = extra.getLinkMessage();
            } else {
                linkMessage = null;
            }
            c75878TqE.LJJL(linkMessage);
            if (!z2 && (linkCrossRoomDataHolder = this.LJLL) != null) {
                linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = 0L;
                linkCrossRoomDataHolder.LJJLIIJ = 0L;
            }
            LinkCrossRoomDataHolder linkCrossRoomDataHolder3 = this.LJLL;
            if (linkCrossRoomDataHolder3 != null) {
                ArrayList arrayList5 = new ArrayList(C32I.LJJL(linkedUsers, 10));
                Iterator<LinkUser> it7 = linkedUsers.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(it7.next().getUserId());
                }
                linkCrossRoomDataHolder3.LJL = arrayList5;
            }
        }
        DataChannel dataChannel3 = this.LJLJLJ;
        if (dataChannel3 != null) {
            obj2 = dataChannel3.kv0(MultiCoHostFullChannel.class);
        }
        if (linkedUsers.size() != 4) {
            z = false;
        }
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("oldFullState = ");
        LIZ9.append(obj2);
        LIZ9.append(" newFullState = ");
        LIZ9.append(z);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ9));
        if (!o.LJ(obj2, Boolean.valueOf(z)) && (dataChannel = this.LJLJLJ) != null) {
            dataChannel.rv0(MultiCoHostFullChannel.class, Boolean.valueOf(z));
        }
    }
}
