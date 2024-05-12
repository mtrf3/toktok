package X;

import Y.ARunnableS0S0200200_13;
import Y.ARunnableS0S2100100_13;
import Y.ARunnableS12S1200000_13;
import Y.ARunnableS13S0301000_13;
import Y.ARunnableS14S1100000_13;
import Y.ARunnableS24S0300000_13;
import Y.ARunnableS2S0501000_13;
import Y.ARunnableS2S3100000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.ARunnableS4S1101000_13;
import Y.ARunnableS4S1201000_13;
import Y.ARunnableS5S2100000_13;
import Y.ARunnableS8S1100100_13;
import Y.ARunnableS9S0200100_13;
import Y.AfS19S0210000_13;
import Y.AfS24S0400000_13;
import Y.AfS2S0200200_13;
import Y.AfS2S0300100_13;
import Y.AfS33S0201000_13;
import Y.AfS3S0200100_13;
import Y.AfS3S0501000_13;
import Y.AfS52S0300000_13;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import Y.AfS8S0100100_13;
import Y.IDaS222S0100000_13;
import Y.IDhS106S0100000_13;
import Y.IDhS72S0200000_13;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ApplyBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ReplyBizContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.ApplyRequestParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.CancelApplyParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.CancelInviteParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.ChangeLayoutParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.CreateChannelParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.DestroyChannelParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.InitConfig;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.InviteParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.JoinChannelParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.JoinDirectParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.KickOutParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LeaveChannelParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkCommonBean;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.PermitParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.PositionConfig;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.ReplyInviteParam;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.UserBean;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCoHostCreateChannelRetrySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostMatchResumeBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostLeaveChannelBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostUidAndRoomIdNotCorrectBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCohostForwardRoomsTimestampCheckSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcAbSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSdkApplyStateInterceptionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelConf;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestModeratorBlackScreenFixSwitch;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyContent;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.KickOutContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.RTCEngineConfig;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyInviteContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.avframework.livestreamv2.core.interact.Client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS42S0210000_13;
import kotlin.jvm.internal.AqS67S1200000_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.controller.KickOutAllGuestsParam;
import tikcast.linkmic.controller.MGetABInfosReq;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;
import webcast.data.multilive_biz.BizInviteParams;
import webcast.data.multilive_biz.BizResumeParams;
import webcast.im.KickOutBizContent;

/* loaded from: classes14.dex */
public final class U7T extends U6D {
    public final Room LJ;
    public final int LJFF;
    public long LJI = -1;
    public final CopyOnWriteArrayList<InterfaceC76622U5i> LJII = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC76675U7j> LJIIIIZZ = new CopyOnWriteArrayList<>();
    public final U7U LJIIIZ;
    public String LJIIJ;
    public final U7Z LJIIJJI;
    public final C76669U7d LJIIL;
    public final long LJIILIIL;
    public final C76683U7r LJIILJJIL;
    public final C73318Sq2 LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final U67 LJIIZILJ;
    public DSLConfig LJIJ;
    public DSLConfig LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public final long LJIL;
    public final long LJJ;
    public String LJJI;
    public N39 LJJIFFI;
    public boolean LJJII;
    public final U7W LJJIII;
    public final ConcurrentHashMap<String, InterfaceC92693kP> LJJIIJ;
    public final ConcurrentHashMap<String, InterfaceC92693kP> LJJIIJZLJL;
    public final ConcurrentHashMap<String, Long> LJJIIZ;
    public final ConcurrentHashMap<String, U9N> LJJIIZI;
    public final ConcurrentHashMap<String, U9N> LJJIJ;
    public final List<LinkLayerListUser> LJJIJIIJI;
    public volatile boolean LJJIJIIJIL;
    public C73495Sst LJJIJIL;
    public C73495Sst LJJIJL;
    public C73495Sst LJJIJLIJ;
    public C73495Sst LJJIL;
    public C73495Sst LJJIZ;
    public C73543Stf LJJJ;
    public C73495Sst LJJJI;
    public C73495Sst LJJJIL;
    public C73495Sst LJJJJ;
    public C73495Sst LJJJJI;
    public C73495Sst LJJJJIZL;
    public C73495Sst LJJJJJ;
    public C73495Sst LJJJJJL;
    public C73495Sst LJJJJL;
    public C73495Sst LJJJJLI;
    public C73543Stf LJJJJLL;
    public C73543Stf LJJJJZ;
    public C73543Stf LJJJJZI;
    public C73543Stf LJJJLIIL;
    public C73543Stf LJJJLL;
    public C73543Stf LJJJLZIJ;
    public C73543Stf LJJJZ;
    public final C62822Ol8 LJJL;
    public final C62822Ol8 LJJLI;
    public final C62822Ol8 LJJLIIIIJ;
    public C76677U7l LJJLIIIJ;
    public final C62822Ol8 LJJLIIIJILLIZJL;
    public final C62822Ol8 LJJLIIIJJI;
    public final ConcurrentHashSet<String> LJJLIIIJJIZ;
    public long LJJLIIIJL;
    public long LJJLIIIJLJLI;

    public static String LJJIIZI(long j) {
        if (j != 0) {
            if (j == 10001) {
                return "finish_reason_host_trigger";
            }
            if (j == 10002) {
                return "finish_reason_m_sequence_permission_finish";
            }
            if (j == 10004) {
                return "finish_reason_live_ended";
            }
            if (j == 10003) {
                return "finish_reason_interrupt_by_co_host";
            }
            if (j == 10010) {
                return "finish_reason_illegal_live";
            }
            if (j == 10011) {
                return "finish_reason_rtc_err";
            }
        }
        return "finish_reason_unknown";
    }

    @Override // X.InterfaceC76681U7p
    public final void LJI(LinkMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJII(LinkMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIJJLI(LinkMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.U66
    public final void LLLLLLZ(C76113Tu1 resumeParam, U6A u6a) {
        o.LJIIIZ(resumeParam, "resumeParam");
    }

    @Override // X.U6D, X.U66
    public final boolean LLZLLIL() {
        return true;
    }

    @Override // X.U66
    public final void LLZLLLL(Boolean bool) {
    }

    @Override // X.U66
    public final void i(String linkMicId, long j, EnumC76739U9v kickOutType) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(kickOutType, "kickOutType");
    }

    @Override // X.U66
    public final int LIZIZ() {
        return this.LJIILJJIL.LIZ;
    }

    public final void LJJII() {
        BTJ.LIZLLL(this.LJJIJIL);
        BTJ.LIZLLL(this.LJJIJL);
        BTJ.LIZLLL(this.LJJIJLIJ);
        BTJ.LIZLLL(this.LJJIL);
        BTJ.LIZLLL(this.LJJIZ);
        BTJ.LIZLLL(this.LJJJ);
        BTJ.LIZLLL(this.LJJJI);
        BTJ.LIZLLL(this.LJJJIL);
        BTJ.LIZLLL(this.LJJJJ);
        BTJ.LIZLLL(this.LJJJJI);
        BTJ.LIZLLL(this.LJJJJIZL);
        BTJ.LIZLLL(this.LJJJJJ);
        BTJ.LIZLLL(this.LJJJJJL);
        BTJ.LIZLLL(this.LJJJJL);
        BTJ.LIZLLL(this.LJJJJLI);
        BTJ.LIZLLL(this.LJJJJLL);
        BTJ.LIZLLL(this.LJJJJZ);
        BTJ.LIZLLL(this.LJJJJZI);
        BTJ.LIZLLL(this.LJJJLIIL);
        BTJ.LIZLLL(this.LJJJLL);
        BTJ.LIZLLL(this.LJJJLZIJ);
        BTJ.LIZLLL(this.LJJJZ);
        this.LJJIJIL = null;
        this.LJJIJL = null;
        this.LJJIJLIJ = null;
        this.LJJIL = null;
        this.LJJIZ = null;
        this.LJJJ = null;
        this.LJJJI = null;
        this.LJJJIL = null;
        this.LJJJJ = null;
        this.LJJJJI = null;
        this.LJJJJIZL = null;
        this.LJJJJJ = null;
        this.LJJJJJL = null;
        this.LJJJJL = null;
        this.LJJJJLI = null;
        this.LJJJJLL = null;
        this.LJJJJZ = null;
        this.LJJJJZI = null;
        this.LJJJLIIL = null;
        this.LJJJLL = null;
        this.LJJJLZIJ = null;
        this.LJJJZ = null;
    }

    public final U71 LJJIJIIJIL() {
        return (U71) this.LJJLIIIJJI.getValue();
    }

    public final C76662U6w LJJIZ() {
        return (C76662U6w) this.LJJLI.getValue();
    }

    public final boolean LJJJIL() {
        Room room = this.LJ;
        if (room == null || this.LJIILIIL != room.getOwnerUserId()) {
            return false;
        }
        return true;
    }

    @Override // X.U6D, X.U66
    public final boolean LLLLLILLIL() {
        if (this.LJJIJIIJIL && this.LJJIJIIJI.size() < 2) {
            return true;
        }
        return false;
    }

    @Override // X.U6D, X.U66
    public final java.util.Set<Long> LLLLLJLJLL() {
        return ((C76679U7n) this.LJJLIIIJILLIZJL.getValue()).LIZ();
    }

    @Override // X.U6D, X.U66
    public final boolean LLLLZLLIL() {
        if (this.LJJIJIIJIL && this.LJJIJIIJI.size() >= 2) {
            return true;
        }
        return false;
    }

    @Override // X.U66
    public final String LLZLL() {
        String linkMicId;
        LinkUser LJIJI = this.LJIIJJI.LJIJI(B83.LIZ().LIZIZ().getCurrentUserId());
        if (LJIJI != null && (linkMicId = LJIJI.getLinkMicId()) != null) {
            return linkMicId;
        }
        return "";
    }

    @Override // X.U66
    public final boolean d() {
        MultiHostPreJoinChannelConf value = MultiHostPreJoinChannelSetting.INSTANCE.getValue();
        if (!value.sendInviteEnable && !value.receiveInviteEnable) {
            return false;
        }
        Iterator<InterfaceC76622U5i> it = this.LJII.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            if (next.LLFFF()) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJIL) + (((C16880lQ.LLJIJIL(this.LJI) * 31) + this.LJFF) * 31);
    }

    @Override // X.U6D, X.U66
    public final boolean n8() {
        Boolean bool;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        N39 n39 = this.LJJIFFI;
        if (n39 != null && (interfaceC65784Pro = n39.LIZJ) != null) {
            bool = interfaceC65784Pro.invoke();
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    @Override // X.U6D, X.U66
    public final void reset() {
        UC7.LJ("reset start source=", "resetGroupData", "Linker");
        this.LJIILJJIL.LIZIZ(0);
        LJJIIZ("resetGroupData", "leave_with_reset", false, null, C61878OQg.INSTANCE);
    }

    public final GroupPlayer LJJIL() {
        long j = 0;
        if (MtCoHostUidAndRoomIdNotCorrectBugfixSetting.isEnable()) {
            GroupPlayer groupPlayer = new GroupPlayer();
            groupPlayer.channelId = this.LJI;
            Player player = new Player(0L, 0L, 3, null);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
            }
            player.roomId = j;
            player.uid = C025908h.LIZ();
            groupPlayer.user = player;
            return groupPlayer;
        }
        GroupPlayer groupPlayer2 = new GroupPlayer();
        groupPlayer2.channelId = this.LJI;
        Player player2 = new Player(0L, 0L, 3, null);
        Room room2 = this.LJ;
        if (room2 != null) {
            j = room2.getId();
        }
        player2.roomId = j;
        player2.uid = this.LJIILIIL;
        groupPlayer2.user = player2;
        return groupPlayer2;
    }

    @Override // X.U66
    public final java.util.Set<Long> LLLLLL() {
        return LJJIJIIJIL().LJFF;
    }

    @Override // X.U66
    public final RtcUserInfo LLZL() {
        long j;
        if (MtCoHostUidAndRoomIdNotCorrectBugfixSetting.isEnable()) {
            C76732U9o c76732U9o = new C76732U9o();
            c76732U9o.LJ = this.LJI;
            c76732U9o.LIZLLL = this.LJJII;
            c76732U9o.LIZJ = this.LJJI;
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            c76732U9o.LIZ = j;
            c76732U9o.LIZIZ = C025908h.LIZ();
            return c76732U9o.LIZ();
        }
        C76732U9o c76732U9o2 = new C76732U9o();
        c76732U9o2.LJ = this.LJI;
        c76732U9o2.LIZLLL = this.LJJII;
        c76732U9o2.LIZJ = this.LJJI;
        c76732U9o2.LIZ = this.LJIL;
        c76732U9o2.LIZIZ = this.LJIILIIL;
        return c76732U9o2.LIZ();
    }

    @Override // X.U66
    public final Room LIZJ() {
        return this.LJ;
    }

    @Override // X.U66
    public final long LJJLI() {
        return this.LJI;
    }

    @Override // X.U6D, X.U66
    public final boolean LLLLJI() {
        return this.LJJIJIIJIL;
    }

    @Override // X.U66
    public final /* bridge */ /* synthetic */ U7U LLLLZLL() {
        return this.LJIIIZ;
    }

    @Override // X.U66
    public final U7W LLLZIIL() {
        return this.LJJIII;
    }

    @Override // X.U66
    public final /* bridge */ /* synthetic */ InterfaceC75973Trl LLZZ() {
        return this.LJIIJJI;
    }

    @Override // X.U6D, X.U66
    public final DSLConfig LLZZZIL() {
        return this.LJIJ;
    }

    @Override // X.U66
    public final N39 LLZZZZ() {
        return this.LJJIFFI;
    }

    @Override // X.U66
    public final InterfaceC76652U6m c() {
        return this.LJIIL;
    }

    @Override // X.U66
    public final int getScene() {
        return this.LJFF;
    }

    @Override // X.U66
    public final /* bridge */ /* synthetic */ C76683U7r k() {
        return this.LJIILJJIL;
    }

    public static String LJJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                new com.google.gson.o();
                m LJIIZILJ = com.google.gson.o.LIZ(str).LJIIZILJ();
                LJIIZILJ.LJJIIZ("rtc_business_id", "link_cross_grid_2");
                return String.valueOf(LJIIZILJ);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("translateBusinessId e = ");
                LIZ.append(e);
                U4R.LIZIZ("Linker", X1D.LIZIZ(LIZ));
            }
        }
        return null;
    }

    public static void LJJIII(InterfaceC92693kP interfaceC92693kP) {
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C29306Beo.LJJJJI(interfaceC92693kP);
        }
    }

    public static List LJJJI(List list) {
        List<LinkLayerListUser> list2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AllListUser allListUser = ((GroupChannelUser) it.next()).allUser;
                if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Player player = it2.next().linkUser;
                        if (player != null) {
                            arrayList.add(Long.valueOf(player.uid));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final String LJJJJI(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_callback_CoLinker_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_callback_Linker_", i, LIZ2);
    }

    public static final String LJJJJIZL(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_request_Linker_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_request_Linker_", i, LIZ2);
    }

    public static final String LJJJJJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_Linker_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_Linker_", i, LIZ2);
    }

    @Override // X.InterfaceC76681U7p
    public final void LIZ(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleLeaveJoinGroupMessage start messageId=");
        LIZ.append(message.getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new C76667U7b(this, message));
    }

    @Override // X.InterfaceC76681U7p
    public final void LIZLLL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handlePermitJoinGroupMessage start messageId=");
        LIZ.append(message.getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS160S0200000_13(this, message, 35));
    }

    @Override // X.InterfaceC76681U7p
    public final void LJ(CR6 message) {
        ApplyBizContent applyBizContent;
        String str;
        Long l;
        String str2;
        String str3;
        String str4;
        Long l2;
        Player player;
        Long l3;
        Long l4;
        Player player2;
        Player player3;
        MultiLiveContent multiLiveContent;
        o.LJIIIZ(message, "message");
        if (message instanceof LinkLayerMessage) {
            String LJJJJJ = LJJJJJ(1950);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleApplyMessage receive apply message, cur channel id ");
            LIZ.append(this.LJI);
            LIZ.append(", content= ");
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) message;
            LIZ.append(linkLayerMessage.applyContent);
            LIZ.append(", bizContent= ");
            BusinessContent businessContent = linkLayerMessage.bizContent;
            String str5 = null;
            if (businessContent != null && (multiLiveContent = businessContent.multiLiveContent) != null) {
                applyBizContent = multiLiveContent.applyIMContent;
            } else {
                applyBizContent = null;
            }
            LIZ.append(applyBizContent);
            C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
            if (!LinkCoreModelKt.currentUserIsAnchor() && LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
                String LJJJJJ2 = LJJJJJ(2927);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("moderatorHandleApplyMessage receive apply message, cur channel id ");
                C72972SkS.LJI(LIZ2, this.LJI, LIZ2, LJJJJJ2);
                return;
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            ApplyContent applyContent = linkLayerMessage.applyContent;
            if (applyContent != null && (player3 = applyContent.applicant) != null) {
                l = Long.valueOf(player3.uid);
            } else {
                l = null;
            }
            String valueOf2 = String.valueOf(l);
            Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room2 != null) {
                str2 = room2.getIdStr();
            } else {
                str2 = null;
            }
            String valueOf3 = String.valueOf(str2);
            ApplyContent applyContent2 = linkLayerMessage.applyContent;
            if (applyContent2 == null || (str3 = applyContent2.applicantLinkMicId) == null) {
                str3 = "-1";
            }
            UA9.LJIIIIZZ(this, valueOf, valueOf2, valueOf3, str3, linkLayerMessage.getMessageId());
            U7W u7w = this.LJJIII;
            ApplyContent applyContent3 = linkLayerMessage.applyContent;
            if (applyContent3 == null || (str4 = applyContent3.applicantLinkMicId) == null) {
                str4 = "";
            }
            if (applyContent3 != null && (player2 = applyContent3.applicant) != null) {
                l2 = Long.valueOf(player2.uid);
            } else {
                l2 = null;
            }
            J7I.LJIIJ(u7w, "apply_message", this, linkLayerMessage, str4, String.valueOf(l2), null, false, null, 224);
            ApplyContent applyContent4 = linkLayerMessage.applyContent;
            if (applyContent4 != null) {
                player = applyContent4.applicant;
            } else {
                player = null;
            }
            LinkUser.Builder builder = new LinkUser.Builder();
            if (player != null) {
                l3 = Long.valueOf(player.roomId);
            } else {
                l3 = null;
            }
            builder.setRoomId(l3);
            if (player != null) {
                l4 = Long.valueOf(player.uid);
            } else {
                l4 = null;
            }
            builder.setUserId(l4);
            builder.setChannelId(Long.valueOf(linkLayerMessage.channelId));
            ApplyContent applyContent5 = linkLayerMessage.applyContent;
            if (applyContent5 != null) {
                str5 = applyContent5.applicantLinkMicId;
            }
            builder.setLinkMicId(str5);
            LinkUser build = builder.build();
            LJJJLL(2);
            U7B u7b = new U7B();
            u7b.LIZ = LLZL();
            u7b.LIZIZ = this.LJIIJ;
            U7A u7a = new U7A(u7b);
            Iterator<InterfaceC76675U7j> it = this.LJIIIIZZ.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL(this, u7a);
            }
            C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, build, message, 12));
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJFF(CR6 message) {
        Player player;
        Long l;
        o.LJIIIZ(message, "message");
        if (message instanceof LinkLayerMessage) {
            String LJJJJJ = LJJJJJ(1865);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleCreateChannelMessage receive CreateChannelMessage cur channel id ");
            LIZ.append(this.LJI);
            LIZ.append(", message id ");
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) message;
            C72972SkS.LJI(LIZ, linkLayerMessage.channelId, LIZ, LJJJJJ);
            LJJJJLL(linkLayerMessage.channelId);
            long messageId = linkLayerMessage.getMessageId();
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS9S0200100_13(this, LIZJ, messageId, 2));
            Long l2 = null;
            J7I.LJIIJ(this.LJJIII, "create_channel_message", this, linkLayerMessage, "", "", null, false, null, 224);
            CreateChannelContent createChannelContent = linkLayerMessage.createChannelContent;
            String str = null;
            if (createChannelContent != null) {
                player = createChannelContent.owner;
            } else {
                player = null;
            }
            LinkUser.Builder builder = new LinkUser.Builder();
            if (player != null) {
                l = Long.valueOf(player.roomId);
            } else {
                l = null;
            }
            builder.setRoomId(l);
            if (player != null) {
                l2 = Long.valueOf(player.uid);
            }
            builder.setUserId(l2);
            CreateChannelContent createChannelContent2 = linkLayerMessage.createChannelContent;
            if (createChannelContent2 != null) {
                str = createChannelContent2.ownerLinkMicId;
            }
            builder.setLinkMicId(str);
            builder.setChannelId(Long.valueOf(this.LJI));
            LinkUser build = builder.build();
            LJJJLL(1);
            Iterator<InterfaceC76675U7j> it = this.LJIIIIZZ.iterator();
            while (it.hasNext()) {
                it.next().LJIL(this);
            }
            C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, build, message, 15));
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, r2) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156 A[LOOP:0: B:53:0x0150->B:55:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r23) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJIIIIZZ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0115, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00de, code lost:
    
        if (r0 != null) goto L41;
     */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.ss.ugc.live.sdk.message.data.IMessage r27) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJIIIZ(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIJ(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleCancelJoinGroupMessage start messageId=");
        LIZ.append(message.getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS160S0200000_13(this, message, 40));
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILIIL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleGroupChangeMessage start messageId=");
        LIZ.append(message.getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS160S0200000_13(this, message, 42));
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILJJIL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleJoinGroupMessage start messageId=");
        LIZ.append(message.getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS160S0200000_13(this, message, 43));
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILL(CR6 message) {
        KickOutBizContent kickOutBizContent;
        String kickOutReason;
        Long l;
        Long l2;
        boolean z;
        Player player;
        Long l3;
        Long l4;
        long j;
        int i;
        MultiLiveContent multiLiveContent;
        KickOutBizContent kickOutBizContent2;
        Player player2;
        Player player3;
        MultiLiveContent multiLiveContent2;
        o.LJIIIZ(message, "message");
        if (message instanceof LinkLayerMessage) {
            String LJJJJJ = LJJJJJ(3604);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleKickOutMessage receive kick out message, cur channel id ");
            LIZ.append(this.LJI);
            LIZ.append(", messageContent= ");
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) message;
            LIZ.append(linkLayerMessage.kickOutContent);
            LIZ.append(", bizContent= ");
            BusinessContent businessContent = linkLayerMessage.bizContent;
            Integer num = null;
            if (businessContent != null && (multiLiveContent2 = businessContent.multiLiveContent) != null) {
                kickOutBizContent = multiLiveContent2.kickOutBizContent;
            } else {
                kickOutBizContent = null;
            }
            LIZ.append(kickOutBizContent);
            C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
            KickOutContent kickOutContent = linkLayerMessage.kickOutContent;
            if (kickOutContent != null) {
                kickOutReason = KickOutReason.Companion.stateToString(kickOutContent.kickOutReason);
            } else {
                kickOutReason = "unknown";
            }
            KickOutContent kickOutContent2 = linkLayerMessage.kickOutContent;
            if (kickOutContent2 != null && (player3 = kickOutContent2.leftUser) != null) {
                l = Long.valueOf(player3.uid);
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            long messageId = linkLayerMessage.getMessageId();
            o.LJIIIZ(kickOutReason, "kickOutReason");
            UC0.LJJLIIIIJ(new ARunnableS0S2100100_13(messageId, valueOf, kickOutReason, this, 1));
            U7W u7w = this.LJJIII;
            KickOutContent kickOutContent3 = linkLayerMessage.kickOutContent;
            if (kickOutContent3 != null && (player2 = kickOutContent3.leftUser) != null) {
                l2 = Long.valueOf(player2.uid);
            } else {
                l2 = null;
            }
            String valueOf2 = String.valueOf(l2);
            OSZ osz = new OSZ("kickout_reason", kickOutReason);
            BusinessContent businessContent2 = linkLayerMessage.bizContent;
            int i2 = 0;
            if (businessContent2 != null && (multiLiveContent = businessContent2.multiLiveContent) != null && (kickOutBizContent2 = multiLiveContent.kickOutBizContent) != null && kickOutBizContent2.operatorLinkAdminType == 1) {
                z = true;
            } else {
                z = false;
            }
            J7I.LJIIJ(u7w, "kick_out_message", this, linkLayerMessage, "", valueOf2, osz, z, null, 128);
            this.LJJIII.LIZJ();
            KickOutContent kickOutContent4 = linkLayerMessage.kickOutContent;
            if (kickOutContent4 != null) {
                player = kickOutContent4.leftUser;
            } else {
                player = null;
            }
            LinkUser.Builder builder = new LinkUser.Builder();
            if (player != null) {
                l3 = Long.valueOf(player.roomId);
            } else {
                l3 = null;
            }
            builder.setRoomId(l3);
            if (player != null) {
                l4 = Long.valueOf(player.uid);
            } else {
                l4 = null;
            }
            builder.setUserId(l4);
            builder.setChannelId(Long.valueOf(this.LJI));
            U7Z u7z = this.LJIIJJI;
            Long userId = builder.getUserId();
            if (userId != null) {
                j = userId.longValue();
            } else {
                j = -1;
            }
            LinkUser LJIJI = u7z.LJIJI(j);
            if (LJIJI != null) {
                LJIJI.getLinkMicId();
            }
            LinkUser build = builder.build();
            KickOutContent kickOutContent5 = linkLayerMessage.kickOutContent;
            if (kickOutContent5 != null) {
                i = kickOutContent5.kickOutReason;
            } else {
                i = 0;
            }
            OnLineMicInfo build2 = new OnLineMicInfo.Builder().build();
            Long userId2 = build.getUserId();
            U7B u7b = new U7B();
            u7b.LIZ = LLZL();
            u7b.LIZIZ = this.LJIIJ;
            if (userId2 != null) {
                u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(userId2, build2));
            }
            U7A u7a = new U7A(u7b);
            Long userId3 = build.getUserId();
            long j2 = this.LJIILIIL;
            if (userId3 != null && userId3.longValue() == j2) {
                LJJJLL(1);
            }
            java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Long, OnLineMicInfo> entry : map.entrySet()) {
                    RtcUserInfo rtcUserInfo = u7a.LIZ;
                    if (rtcUserInfo != null && entry.getKey().longValue() == rtcUserInfo.getUserId()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    this.LJIIIZ.LJJLIIIJILLIZJL(C78857UxB.LJJIIJ(1476788483, "bpea-linkmic_normalrtc_onKickOutMessage"), "leave_with_kicked_out");
                }
            }
            Iterator<InterfaceC76675U7j> it = this.LJIIIIZZ.iterator();
            while (it.hasNext()) {
                it.next().LJIIIZ(this, u7a);
            }
            C15610jN.LIZIZ(new ARunnableS13S0301000_13(this, build, message, i, 4));
            KickOutContent kickOutContent6 = linkLayerMessage.kickOutContent;
            if (kickOutContent6 != null) {
                if (KickOutReason.Companion.isKickoutException(kickOutContent6.kickOutReason)) {
                    C75516TkO c75516TkO = C75516TkO.LIZ;
                    KickOutContent kickOutContent7 = linkLayerMessage.kickOutContent;
                    if (kickOutContent7 != null) {
                        i2 = KickOutReason.Companion.toExceptionType(kickOutContent7.kickOutReason);
                    }
                    String valueOf3 = String.valueOf(this.LJI);
                    String valueOf4 = String.valueOf(this.LJJI);
                    KickOutContent kickOutContent8 = linkLayerMessage.kickOutContent;
                    if (kickOutContent8 != null) {
                        num = Integer.valueOf(kickOutContent8.kickOutReason);
                    }
                    c75516TkO.LIZ(i2, "kick out by host", C65618Pp8.of("mChannelId", valueOf3, "mSelfLinkMicId", valueOf4, "kickOutReason", String.valueOf(num)));
                    return;
                }
                return;
            }
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILLIIL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleP2PGroupChangeMessage start messageId=");
        LIZ.append(message.getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS42S0210000_13(this, message, true, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0164, code lost:
    
        if (r9 != null) goto L23;
     */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r11) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJIIZILJ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage):void");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIJ(CR6 message) {
        ReplyBizContent replyBizContent;
        String str;
        String str2;
        InterfaceC92693kP interfaceC92693kP;
        InterfaceC92693kP interfaceC92693kP2;
        Player player;
        Long l;
        Long l2;
        String str3;
        Player player2;
        Long l3;
        Long l4;
        int i;
        MultiLiveContent multiLiveContent;
        o.LJIIIZ(message, "message");
        if (message instanceof LinkLayerMessage) {
            String LJJJJJ = LJJJJJ(3155);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleReplyInviteMessage receive reply invite message, cur channel id ");
            LIZ.append(this.LJI);
            LIZ.append(", content= ");
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) message;
            LIZ.append(linkLayerMessage.replyInviteContent);
            LIZ.append(", bizContent= ");
            BusinessContent businessContent = linkLayerMessage.bizContent;
            String str4 = null;
            MicPositionData micPositionData = null;
            if (businessContent != null && (multiLiveContent = businessContent.multiLiveContent) != null) {
                replyBizContent = multiLiveContent.replyIMContent;
            } else {
                replyBizContent = null;
            }
            LIZ.append(replyBizContent);
            C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
            if (LinkCoreModelKt.currentUserIsAnchor() || !LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
                String LJJJJJ2 = LJJJJJ(3177);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("anchorHandleReplyInviteMessage receive reply invite message, cur channel id ");
                C72972SkS.LJI(LIZ2, this.LJI, LIZ2, LJJJJJ2);
                ReplyInviteContent replyInviteContent = linkLayerMessage.replyInviteContent;
                if (replyInviteContent != null && (str2 = replyInviteContent.inviteeLinkMicId) != null && this.LJJIIJZLJL.containsKey(str2) && (interfaceC92693kP = this.LJJIIJZLJL.get(str2)) != null && !interfaceC92693kP.isDisposed() && (interfaceC92693kP2 = this.LJJIIJZLJL.get(str2)) != null) {
                    interfaceC92693kP2.dispose();
                }
                ReplyInviteContent replyInviteContent2 = linkLayerMessage.replyInviteContent;
                if (replyInviteContent2 != null && replyInviteContent2.replyStatus == 1) {
                    U7W u7w = this.LJJIII;
                    U85 u85 = U85.INVITER;
                    if (replyInviteContent2 != null) {
                        str4 = replyInviteContent2.inviteeLinkMicId;
                    }
                    u7w.LIZ(u85, str4, Long.valueOf(C31012CFc.LIZIZ()));
                    ReplyInviteContent replyInviteContent3 = linkLayerMessage.replyInviteContent;
                    if (replyInviteContent3 != null && (str = replyInviteContent3.inviteeLinkMicId) != null && !this.LJJIJ.containsKey(str)) {
                        this.LJJIJ.put(str, U9N.MESSAGE);
                        LJJIIJZLJL(linkLayerMessage);
                        return;
                    }
                    return;
                }
                LJJIIJZLJL(linkLayerMessage);
                return;
            }
            String LJJJJJ3 = LJJJJJ(3182);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("moderatorHandleReplyInviteMessage receive reply invite message, cur channel id ");
            C72972SkS.LJI(LIZ3, this.LJI, LIZ3, LJJJJJ3);
            ReplyInviteContent replyInviteContent4 = linkLayerMessage.replyInviteContent;
            if (replyInviteContent4 != null) {
                player = replyInviteContent4.invitee;
            } else {
                player = null;
            }
            LinkUser.Builder builder = new LinkUser.Builder();
            if (player != null) {
                l = Long.valueOf(player.roomId);
            } else {
                l = null;
            }
            builder.setRoomId(l);
            if (player != null) {
                l2 = Long.valueOf(player.uid);
            } else {
                l2 = null;
            }
            builder.setUserId(l2);
            builder.setChannelId(Long.valueOf(linkLayerMessage.channelId));
            ReplyInviteContent replyInviteContent5 = linkLayerMessage.replyInviteContent;
            if (replyInviteContent5 != null) {
                str3 = replyInviteContent5.inviteeLinkMicId;
            } else {
                str3 = null;
            }
            builder.setLinkMicId(str3);
            LinkUser build = builder.build();
            ReplyInviteContent replyInviteContent6 = linkLayerMessage.replyInviteContent;
            if (replyInviteContent6 != null) {
                player2 = replyInviteContent6.inviteOperatorUser;
            } else {
                player2 = null;
            }
            LinkUser.Builder builder2 = new LinkUser.Builder();
            if (player2 != null) {
                l3 = Long.valueOf(player2.roomId);
            } else {
                l3 = null;
            }
            builder2.setRoomId(l3);
            if (player2 != null) {
                l4 = Long.valueOf(player2.uid);
            } else {
                l4 = null;
            }
            builder2.setUserId(l4);
            builder2.setChannelId(Long.valueOf(linkLayerMessage.channelId));
            LinkUser build2 = builder2.build();
            ReplyInviteContent replyInviteContent7 = linkLayerMessage.replyInviteContent;
            if (replyInviteContent7 != null) {
                i = replyInviteContent7.replyStatus;
            } else {
                i = 0;
            }
            if (replyInviteContent7 != null) {
                micPositionData = replyInviteContent7.positionData;
            }
            OnLineMicInfo LIZLLL = U7V.LIZLLL(micPositionData);
            if (LIZLLL == null) {
                LIZLLL = new OnLineMicInfo.Builder().build();
            }
            C15610jN.LIZIZ(new ARunnableS2S0501000_13(this, build, i, LIZLLL, linkLayerMessage, build2, 1));
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0087, code lost:
    
        if (r1 != null) goto L25;
     */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.CR6 r18) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJIJI(X.CR6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        if (r1 != null) goto L21;
     */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.CR6 r17) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJIJJ(X.CR6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x00ec, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02d1, code lost:
    
        if (r1.replyStatus == 1) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02b6, code lost:
    
        if (r1 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        if (r15 != null) goto L52;
     */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.CR6 r29) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJIL(X.CR6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0092, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b A[LOOP:0: B:72:0x0165->B:74:0x016b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0 A[LOOP:1: B:78:0x019a->B:80:0x01a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r23) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJJ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00b6, code lost:
    
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0073, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r19) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJJIIJ(com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage):void");
    }

    public final void LJJIIJZLJL(LinkLayerMessage linkLayerMessage) {
        Long l;
        int i;
        String str;
        Long l2;
        String str2;
        Player player;
        Long l3;
        Long l4;
        String str3;
        Player player2;
        Long l5;
        Long l6;
        MicPositionData micPositionData;
        long j;
        Player player3;
        Player player4;
        if (this.LJIJJLI) {
            C32014ChO.LJFF(LJJJJJ(2091), "doHandleReplyInviteMessage return, because isDestroyChannelRequesting is true");
            return;
        }
        String LJJJJJ = LJJJJJ(2094);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleReplyInviteMessage receive reply message, cur channel id ");
        C72972SkS.LJI(LIZ, this.LJI, LIZ, LJJJJJ);
        ReplyInviteContent replyInviteContent = linkLayerMessage.replyInviteContent;
        String str4 = null;
        if (replyInviteContent != null && (player4 = replyInviteContent.invitee) != null) {
            l = Long.valueOf(player4.uid);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        ReplyInviteContent replyInviteContent2 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent2 != null) {
            i = replyInviteContent2.replyStatus;
        } else {
            i = 0;
        }
        UA9.LJJIJLIJ(this, valueOf, i, linkLayerMessage.getMessageId());
        U7W u7w = this.LJJIII;
        ReplyInviteContent replyInviteContent3 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent3 == null || (str = replyInviteContent3.inviteeLinkMicId) == null) {
            str = "";
        }
        if (replyInviteContent3 != null && (player3 = replyInviteContent3.invitee) != null) {
            l2 = Long.valueOf(player3.uid);
        } else {
            l2 = null;
        }
        String valueOf2 = String.valueOf(l2);
        ReplyInviteContent replyInviteContent4 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent4 != null && replyInviteContent4.replyStatus == 1) {
            str2 = "agree";
        } else {
            str2 = "reject";
        }
        int i2 = 0;
        J7I.LJIIJ(u7w, "reply_invite_message", this, linkLayerMessage, str, valueOf2, new OSZ("reply_status", str2), false, null, 192);
        ReplyInviteContent replyInviteContent5 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent5 != null) {
            player = replyInviteContent5.invitee;
        } else {
            player = null;
        }
        LinkUser.Builder builder = new LinkUser.Builder();
        if (player != null) {
            l3 = Long.valueOf(player.roomId);
        } else {
            l3 = null;
        }
        builder.setRoomId(l3);
        if (player != null) {
            l4 = Long.valueOf(player.uid);
        } else {
            l4 = null;
        }
        builder.setUserId(l4);
        builder.setChannelId(Long.valueOf(linkLayerMessage.channelId));
        ReplyInviteContent replyInviteContent6 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent6 != null) {
            str3 = replyInviteContent6.inviteeLinkMicId;
        } else {
            str3 = null;
        }
        builder.setLinkMicId(str3);
        LinkUser build = builder.build();
        ReplyInviteContent replyInviteContent7 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent7 != null) {
            player2 = replyInviteContent7.inviteOperatorUser;
        } else {
            player2 = null;
        }
        LinkUser.Builder builder2 = new LinkUser.Builder();
        if (player2 != null) {
            l5 = Long.valueOf(player2.roomId);
        } else {
            l5 = null;
        }
        builder2.setRoomId(l5);
        if (player2 != null) {
            l6 = Long.valueOf(player2.uid);
        } else {
            l6 = null;
        }
        builder2.setUserId(l6);
        builder2.setChannelId(Long.valueOf(linkLayerMessage.channelId));
        LinkUser build2 = builder2.build();
        ReplyInviteContent replyInviteContent8 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent8 != null) {
            i2 = replyInviteContent8.replyStatus;
        }
        if (replyInviteContent8 != null) {
            micPositionData = replyInviteContent8.positionData;
        } else {
            micPositionData = null;
        }
        OnLineMicInfo LIZLLL = U7V.LIZLLL(micPositionData);
        if (LIZLLL == null) {
            LIZLLL = new OnLineMicInfo.Builder().build();
        }
        Long userId = build.getUserId();
        U7B u7b = new U7B();
        C76732U9o c76732U9o = new C76732U9o();
        c76732U9o.LIZLLL = false;
        c76732U9o.LJ = linkLayerMessage.channelId;
        ReplyInviteContent replyInviteContent9 = linkLayerMessage.replyInviteContent;
        if (replyInviteContent9 != null) {
            str4 = replyInviteContent9.inviteeLinkMicId;
        }
        c76732U9o.LIZJ = str4;
        long j2 = 0;
        if (player != null) {
            j = player.roomId;
        } else {
            j = 0;
        }
        c76732U9o.LIZ = j;
        if (player != null) {
            j2 = player.uid;
        }
        c76732U9o.LIZIZ = j2;
        u7b.LIZ = c76732U9o.LIZ();
        u7b.LIZIZ = this.LJIIJ;
        if (userId != null) {
            u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(userId, LIZLLL));
        }
        InterfaceC92693kP LJJJJZI = AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS3S0501000_13(this, build, i2, LIZLLL, linkLayerMessage, build2, 2)).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJJZI(new AfS33S0201000_13(i2, this, new U7A(u7b), 3));
        C73318Sq2 compositeDisposable = this.LJIILL;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJJJZI);
    }

    public final List<LinkUser> LJJIJLIJ(GroupChannelAllUser groupChannelAllUser) {
        List<GroupChannelUser> list;
        AllListUser allListUser;
        List<LinkLayerListUser> list2;
        ArrayList arrayList = new ArrayList();
        if (groupChannelAllUser != null && (list = groupChannelAllUser.user) != null) {
            for (GroupChannelUser groupChannelUser : list) {
                if (groupChannelUser.status == 3 && (allListUser = groupChannelUser.allUser) != null && (list2 = allListUser.linkedList) != null) {
                    for (LinkLayerListUser linkLayerListUser : list2) {
                        Iterator<LinkUser> it = this.LJIIJJI.LJJIIZI().iterator();
                        while (true) {
                            Long l = null;
                            if (it.hasNext()) {
                                LinkUser next = it.next();
                                Long userId = next.getUserId();
                                Player player = linkLayerListUser.linkUser;
                                if (player != null) {
                                    l = Long.valueOf(player.uid);
                                }
                                if (o.LJ(userId, l)) {
                                    if (next != null) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final CreateChannelResult LJJJJJL(R2P<CreateChannelResponse> r2p) {
        CreateChannelResponse createChannelResponse;
        boolean z;
        String LJJJJI = LJJJJI(1563);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreateChannelSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, this.LJI, LIZ, LJJJJI);
        if (r2p == null || (createChannelResponse = r2p.data) == null) {
            return null;
        }
        this.LJJI = createChannelResponse.selfLinkMicId;
        C74838TYs.LJ().LJIILIIL = createChannelResponse.selfLinkMicId;
        this.LJJII = true;
        long j = createChannelResponse.channelId;
        if (j > 0) {
            LJJJJLL(j);
        }
        this.LJIIJ = U7V.LJIIIZ(createChannelResponse.rtcInfo, this.LJI);
        U7B u7b = new U7B();
        u7b.LIZ = LLZL();
        u7b.LIZIZ = this.LJIIJ;
        U7A u7a = new U7A(u7b);
        Integer num = createChannelResponse.isResume;
        if (num == null || num.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        this.LJJIJIIJIL = z;
        if (this.LJJIJIIJIL && MtCoHostCrossRoomPushSDKSetting.isEnable() && this.LJFF == 2 && LiveCohostMatchResumeBugfixSetting.INSTANCE.getValue() && LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume()) {
            LJJJLL(2);
            U7U.LJIIZILJ(this.LJIIIZ, this, this.LJIIJ, false, false, false, false, "businees_multi_host_cross_resume", null, 188);
        }
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            if (this.LJFF == 4) {
                LJJJLL(1);
            }
        } else {
            LJJJLL(1);
        }
        Iterator<InterfaceC76675U7j> it = this.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LJJII(this, u7a);
        }
        return new CreateChannelResult(createChannelResponse.multiGuestRespExtra, this.LJJIJIIJIL, null, createChannelResponse);
    }

    public final void LJJJJL(InterfaceC76675U7j listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIIIZZ.add(listener);
    }

    public final void LJJJJLI(InterfaceC76622U5i listener) {
        o.LJIIIZ(listener, "listener");
        this.LJII.remove(listener);
    }

    public final void LJJJJLL(long j) {
        this.LJI = j;
        Iterator<InterfaceC76622U5i> it = this.LJII.iterator();
        while (it.hasNext()) {
            it.next().LJLLL(this.LJI);
        }
    }

    public final boolean LJJJLL(int i) {
        return this.LJIILJJIL.LIZIZ(i);
    }

    @Override // X.U66
    public final void LLLLLIL(N39 sessionBusinessConfig) {
        o.LJIIIZ(sessionBusinessConfig, "sessionBusinessConfig");
        String LJJJJJ = LJJJJJ(5915);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSessionBusinessConfig: ");
        LIZ.append(sessionBusinessConfig);
        LIZ.append(",\n scene: ");
        LIZ.append(this.LJFF);
        C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
        this.LJJIFFI = sessionBusinessConfig;
        LJJIZ().LIZLLL = sessionBusinessConfig.LIZ;
    }

    @Override // X.U6D, X.U66
    public final void LLLLLLJ(long j) {
        InterfaceC92693kP remove = LJJIJIIJIL().LIZJ.remove(Long.valueOf(j));
        if (remove == null) {
            return;
        }
        C29306Beo.LJJJJI(remove);
    }

    @Override // X.U66
    public final void LLLLLLLLL(InterfaceC76768UAy<JoinRtcChannelResult> interfaceC76768UAy) {
        String LJJJJIZL = LJJJJIZL(1437);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("forceJoinRtcChannel start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        if (this.LJFF == 4) {
            C76766UAw.LIZJ.LIZJ(new ARunnableS32S0200000_13(this, interfaceC76768UAy, 85));
        }
    }

    @Override // X.U66
    public final void LLLLLZ(InterfaceC76622U5i listener) {
        o.LJIIIZ(listener, "listener");
        this.LJII.add(listener);
    }

    @Override // X.U66
    public final void LLLZ(DSLConfig dSLConfig) {
        this.LJIJI = dSLConfig;
    }

    @Override // X.U66
    public final void LLLZZIL(U6Y listener) {
        o.LJIIIZ(listener, "listener");
        this.LJJLIIIJ = new C76677U7l(listener, this);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(U7T.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.linkcore.Linker");
        U7T u7t = (U7T) obj;
        if (this.LJI == u7t.LJI && this.LJFF == u7t.LJFF && this.LJIL == u7t.LJIL) {
            return true;
        }
        return false;
    }

    @Override // X.U66
    public final void g(String str) {
        String LJJJJJ = LJJJJJ(411);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setChannelId start channelId=");
        LIZ.append(str);
        C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
        if (str == null) {
            return;
        }
        LJJJJLL(CastLongProtector.parseLong(str));
    }

    @Override // X.U66
    public final C73643SvH getRtcAbInfo(MGetABInfosReq mGetABInfosReq) {
        return ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).getRtcAbInfo(mGetABInfosReq).LJIILIIL(new AfS65S0100000_13(this, 147));
    }

    public U7T(int i, Room room) {
        long j;
        this.LJ = room;
        this.LJFF = i;
        U7U u7u = new U7U();
        this.LJIIIZ = u7u;
        this.LJIIJ = "";
        U7Z u7z = new U7Z();
        this.LJIIJJI = u7z;
        C76669U7d c76669U7d = new C76669U7d();
        this.LJIIL = c76669U7d;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        this.LJIILIIL = currentUserId;
        C76683U7r c76683U7r = new C76683U7r();
        this.LJIILJJIL = c76683U7r;
        this.LJIILL = new C73318Sq2();
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(U75.LJLIL);
        this.LJIILLIIL = LIZIZ;
        if (room != null) {
            j = room.getId();
        } else {
            j = -1;
        }
        this.LJIL = j;
        this.LJJ = room != null ? room.getOwnerUserId() : -1L;
        this.LJJIII = new U7W();
        this.LJJIIJ = new ConcurrentHashMap<>();
        this.LJJIIJZLJL = new ConcurrentHashMap<>();
        this.LJJIIZ = new ConcurrentHashMap<>();
        this.LJJIIZI = new ConcurrentHashMap<>();
        this.LJJIJ = new ConcurrentHashMap<>();
        this.LJJIJIIJI = FII.LIZ();
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS163S0100000_13(this, 413));
        this.LJJL = LIZIZ2;
        this.LJJLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 414));
        this.LJJLIIIIJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 415));
        this.LJJLIIIJILLIZJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 420));
        this.LJJLIIIJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 419));
        if (MtCoHostLeaveChannelBugfixSetting.isEnable()) {
            if (i == 4) {
                U70 u70 = (U70) LIZIZ.getValue();
                u70.getClass();
                u70.LIZIZ = this;
                LJJJJL(u70);
                u7u.LJJJJIZL(u70);
            }
        } else {
            U70 u702 = (U70) LIZIZ.getValue();
            u702.getClass();
            u702.LIZIZ = this;
            LJJJJL(u702);
            u7u.LJJJJIZL(u702);
        }
        if (LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.INSTANCE.getValue().enable) {
            if (MtCoHostLeaveChannelBugfixSetting.isEnable()) {
                if (i == 4) {
                    U67 u67 = new U67();
                    this.LJIIZILJ = u67;
                    u67.LIZ(this, currentUserId);
                }
            } else {
                U67 u672 = new U67();
                this.LJIIZILJ = u672;
                u672.LIZ(this, currentUserId);
            }
        }
        u7z.LIZ = this;
        LJJJJL((C76666U7a) u7z.LJIJ.getValue());
        c76669U7d.LIZLLL = room;
        c76669U7d.LJ = this;
        LJJJJL((C76670U7e) c76669U7d.LJIIL.getValue());
        u7u.LJJJJIZL((InterfaceC76734U9q) c76669U7d.LJIILIIL.getValue());
        u7u.LIZJ(this, room);
        u7u.LJJJJIZL((U77) LIZIZ2.getValue());
        c76683U7r.LIZIZ = new AqS179S0100000_13(this, 479);
        this.LJJLIIIJJIZ = new ConcurrentHashSet<>();
    }

    public static Long LJJIJIIJI(GroupChannelAllUser groupChannelAllUser, long j) {
        List<GroupChannelUser> list;
        List<LinkLayerListUser> list2;
        if (groupChannelAllUser != null && (list = groupChannelAllUser.user) != null) {
            for (GroupChannelUser groupChannelUser : list) {
                AllListUser allListUser = groupChannelUser.allUser;
                if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it = list2.iterator();
                    while (it.hasNext()) {
                        Player player = it.next().linkUser;
                        if (player != null && player.uid == j) {
                            return Long.valueOf(groupChannelUser.channelId);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static String LJJIJL(GroupChannelAllUser groupChannelAllUser, long j) {
        List<GroupChannelUser> list;
        List<LinkLayerListUser> list2;
        if (groupChannelAllUser != null && (list = groupChannelAllUser.user) != null) {
            Iterator<GroupChannelUser> it = list.iterator();
            while (it.hasNext()) {
                AllListUser allListUser = it.next().allUser;
                if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                    for (LinkLayerListUser linkLayerListUser : list2) {
                        Player player = linkLayerListUser.linkUser;
                        if (player != null && player.uid == j) {
                            return linkLayerListUser.linkMicId;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIJJI(String source, boolean z) {
        o.LJIIIZ(source, "source");
        String LJJJJJ = LJJJJJ(352);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroy start cur channelId ");
        LIZ.append(this.LJI);
        LIZ.append(", state ");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append("， source ");
        LIZ.append(source);
        C32014ChO.LIZJ(LJJJJJ, X1D.LIZIZ(LIZ), null);
        U7V.LJIILJJIL(new U7Y(this, source, z));
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIL(LinkLayerMessage message, InterfaceC65784Pro interfaceC65784Pro) {
        Player player;
        Long l;
        long j;
        o.LJIIIZ(message, "message");
        String LJJJJJ = LJJJJJ(2533);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleDestroyChannelMessage receive message=");
        LIZ.append(message.getMessageId());
        C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
        FinishChannelContent finishChannelContent = message.finishContent;
        Long l2 = null;
        if (finishChannelContent != null) {
            player = finishChannelContent.owner;
        } else {
            player = null;
        }
        LinkUser.Builder builder = new LinkUser.Builder();
        if (player != null) {
            l = Long.valueOf(player.roomId);
        } else {
            l = null;
        }
        builder.setRoomId(l);
        if (player != null) {
            l2 = Long.valueOf(player.uid);
        }
        builder.setUserId(l2);
        builder.setChannelId(Long.valueOf(this.LJI));
        U7Z u7z = this.LJIIJJI;
        Long userId = builder.getUserId();
        if (userId != null) {
            j = userId.longValue();
        } else {
            j = -1;
        }
        LinkUser LJIJI = u7z.LJIJI(j);
        if (LJIJI != null) {
            LJIJI.getLinkMicId();
        }
        LinkUser build = builder.build();
        J7I.LJIIJ(this.LJJIII, "destroy_channel_message", this, message, "", "", null, false, null, 224);
        LJJJLL(0);
        InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS24S0400000_13(this, message, build, interfaceC65784Pro, 7)).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJLIIL(new AfS65S0100000_13(this, 156), new AfS65S0100000_13(this, 157));
        C73318Sq2 compositeDisposable = this.LJIILL;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJJLIIL);
        String valueOf = String.valueOf(this.LJI);
        if (!MultiGuestRtcAbSwitcherSetting.INSTANCE.isEnable()) {
            return;
        }
        C0NB.LIZIZ("RtcAbUtil", "release cache with channelId");
        if (valueOf == null) {
            return;
        }
        try {
            C76680U7o.LIZ.remove(valueOf);
        } catch (Throwable th) {
            C0NB.LJFF("RtcAbUtil", "release error:", th);
        }
    }

    @Override // X.U66
    public final void LLLLLLZZ(DestroyChannelData data, InterfaceC76768UAy<DestroyChannelResult> interfaceC76768UAy) {
        o.LJIIIZ(data, "data");
        this.LJIJJLI = true;
        String LJJJJIZL = LJJJJIZL(663);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyChannel start cur channelId ");
        LIZ.append(this.LJI);
        LIZ.append(", state ");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        DestroyChannelParam destroyChannelParam = new DestroyChannelParam(null, null, null, null, 15, null);
        destroyChannelParam.channelId = Long.valueOf(this.LJI);
        destroyChannelParam.common = U7V.LJIIIIZZ(this.LJFF, data.getCustomData());
        destroyChannelParam.player = new UserBean(this.LJIL, this.LJIILIIL);
        destroyChannelParam.finishReason = Long.valueOf(data.getFinishReason());
        long LIZIZ = C31012CFc.LIZIZ();
        String LJJIIZI = LJJIIZI(data.getFinishReason());
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new ARunnableS12S1200000_13(this, LIZJ, LJJIIZI, 3));
        if (!this.LJJII) {
            C75516TkO c75516TkO = C75516TkO.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("mChannelId", String.valueOf(this.LJI));
            linkedHashMap.put("mSelfLinkMicId", String.valueOf(this.LJJI));
            linkedHashMap.put("mRoomId", String.valueOf(this.LJIL));
            linkedHashMap.put("mUserId", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            c75516TkO.LIZ(412, "audience call finish", linkedHashMap);
        }
        InterfaceC92693kP LJJII = C76857UEj.LJII(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).destroyChannelRequest(destroyChannelParam), "destroy channel").LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, data, 24)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, data, 25)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 11)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS52S0300000_13(this, interfaceC76768UAy, data, 5), new AfS62S0200000_13(this, interfaceC76768UAy, 48));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJI = (C73495Sst) LJJII;
    }

    @Override // X.U6D, X.U66
    public final void LLLLLZIL(PermitApplyData data, C76600U4m c76600U4m) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(1096);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorPermitApply start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" data=");
        LIZ.append(data);
        LIZ.append(", anchorId=");
        LIZ.append(this.LJJ);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        PermitParam permitParam = new PermitParam(null, null, null, null, null, 0, null, null, 255, null);
        permitParam.applicant = new UserBean(data.getApplicant().getRoomId(), data.getApplicant().getUserId());
        permitParam.approver = new UserBean(this.LJIL, this.LJJ);
        permitParam.operator = new UserBean(this.LJIL, this.LJIILIIL);
        permitParam.channelId = Long.valueOf(this.LJI);
        permitParam.common = U7V.LJII(this.LJFF);
        permitParam.permitStatus = data.getPermitStatus();
        permitParam.bizPermitParams = data.getBizPermitParams();
        if (MultiGuestModeratorBlackScreenFixSwitch.getValue()) {
            permitParam.dsl = U7V.LJFF(data.getLayoutDSLConfig());
        }
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).permitApply(permitParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, data, this, 9)).LJIIJ(new AfS3S0200100_13(LIZIZ, data, this, 10)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 8)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, c76600U4m, 29), new AfS62S0200000_13(this, c76600U4m, 30));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJJ = (C73495Sst) LJJII;
    }

    @Override // X.U6D, X.U66
    public final void LLLLLZL(DirectJoinData joinData, C76637U5x c76637U5x) {
        String str;
        o.LJIIIZ(joinData, "joinData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinDirect start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" joinData=");
        LIZ.append(joinData);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        String str2 = null;
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        String inviterUserId = String.valueOf(joinData.getSelf().getUserId());
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            str2 = room2.getIdStr();
        }
        String valueOf2 = String.valueOf(str2);
        o.LJIIIZ(inviterUserId, "inviterUserId");
        UC0.LJJLIIIIJ(new ARunnableS2S3100000_13(this, inviterUserId, valueOf2, valueOf, 2));
        JoinDirectParam joinDirectParam = new JoinDirectParam(null, null, null, null, 15, null);
        joinDirectParam.self = new UserBean(joinData.getSelf().getRoomId(), joinData.getSelf().getUserId());
        joinDirectParam.channelId = Long.valueOf(joinData.getChannelId());
        joinDirectParam.common = U7V.LJII(this.LJFF);
        joinDirectParam.multiGuestReqExtra = joinData.getBizJoinDirectParams();
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).joinDirect(joinDirectParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, joinData, 29)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, joinData, 30)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS72S0200000_13(this, joinData, 8)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(c76637U5x, this, 50), new AfS62S0200000_13(c76637U5x, this, 52));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJIJLIJ = (C73495Sst) LJJII;
    }

    @Override // X.U66
    public final void LLLLZ(CancelInviteData data, InterfaceC76768UAy<CancelInviteResult> interfaceC76768UAy) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(1110);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        String inviteeUserId = String.valueOf(data.getInvitee().getUserId());
        long timeOutInterval = data.getTimeOutInterval();
        o.LJIIIZ(inviteeUserId, "inviteeUserId");
        UC0.LJJLIIIIJ(new ARunnableS8S1100100_13(timeOutInterval, this, inviteeUserId, 1));
        CancelInviteParam cancelInviteParam = new CancelInviteParam(null, null, null, null, null, 31, null);
        cancelInviteParam.inviter = new UserBean(this.LJIL, this.LJIILIIL);
        cancelInviteParam.invitee = new UserBean(data.getInvitee().getRoomId(), data.getInvitee().getUserId());
        cancelInviteParam.channelId = Long.valueOf(this.LJI);
        cancelInviteParam.common = U7V.LJIIIIZZ(this.LJFF, data.getCustomData());
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).cancelInvite(cancelInviteParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, data, 21)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, data, 22)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS72S0200000_13(this, data, 6)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, interfaceC76768UAy, 44), new AfS62S0200000_13(this, interfaceC76768UAy, 45));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJJI = (C73495Sst) LJJII;
        C75516TkO c75516TkO = C75516TkO.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("channelId: ");
        LIZ2.append(this.LJI);
        LIZ2.append(" linkmicId: ");
        LIZ2.append(this.LJJI);
        c75516TkO.LIZ(100, X1D.LIZIZ(LIZ2), null);
    }

    @Override // X.U66
    public final void LLLLZI(ReplyInviteData data, InterfaceC76768UAy<ReplyResult> interfaceC76768UAy) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(1038);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        String remoteUserId = String.valueOf(data.getInviter().getUserId());
        int replyStatus = data.getReplyStatus();
        o.LJIIIZ(remoteUserId, "remoteUserId");
        UC0.LJJLIIIIJ(new ARunnableS4S1101000_13(replyStatus, this, remoteUserId, 3));
        ReplyInviteParam replyInviteParam = new ReplyInviteParam(null, null, null, null, null, 0, null, 127, null);
        replyInviteParam.invitee = new UserBean(this.LJIL, this.LJIILIIL);
        replyInviteParam.inviter = new UserBean(data.getInviter().getRoomId(), data.getInviter().getUserId());
        replyInviteParam.channelId = Long.valueOf(this.LJI);
        replyInviteParam.common = U7V.LJII(this.LJFF);
        replyInviteParam.replyStatus = data.getReplyStatus();
        replyInviteParam.bizReplyParams = data.getBizReplyParams();
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            replyInviteParam.inviteOperator = new UserBean(this.LJIL, data.getInviteOperatorUid());
        }
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).replyInvite(replyInviteParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS2S0200200_13(data, this, C31012CFc.LIZIZ(), LIZIZ, 1)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, data, 26)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS72S0200000_13(this, data, 4)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, interfaceC76768UAy, 35), new AfS62S0200000_13(this, interfaceC76768UAy, 36));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJIJL = (C73495Sst) LJJII;
    }

    @Override // X.U66
    public final void LLLLZIL(KickOutData data, C76602U4o c76602U4o) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(1248);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOut channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LIZJ(LJJJJIZL, X1D.LIZIZ(LIZ), null);
        long LIZIZ = C31012CFc.LIZIZ();
        String remoteLinkMicId = data.getGuest().getLinkMicId();
        String kickOutReason = KickOutReason.Companion.stateToString(data.getKickOutReason());
        o.LJIIIZ(remoteLinkMicId, "remoteLinkMicId");
        o.LJIIIZ(kickOutReason, "kickOutReason");
        UC0.LJJLIIIIJ(new ARunnableS5S2100000_13(this, remoteLinkMicId, kickOutReason, 2));
        KickOutParam kickOutParam = new KickOutParam(null, null, null, null, null, 0, 63, null);
        kickOutParam.owner = new UserBean(this.LJIL, this.LJIILIIL);
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            kickOutParam.operator = new UserBean(this.LJIL, this.LJIILIIL);
        }
        kickOutParam.kickOutReason = data.getKickOutReason();
        kickOutParam.guest = new UserBean(data.getGuest().getRoomId(), data.getGuest().getUserId());
        kickOutParam.channelId = Long.valueOf(this.LJI);
        kickOutParam.common = U7V.LJII(this.LJFF);
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).kickOut(kickOutParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, data, this, 6)).LJIIJ(new AfS3S0200100_13(LIZIZ, data, this, 8)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS72S0200000_13(this, data, 1)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, c76602U4o, 27), new AfS62S0200000_13(this, c76602U4o, 28));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJJJ = (C73495Sst) LJJII;
    }

    @Override // X.U66
    public final void LLLZIL(PermitApplyData data, InterfaceC76768UAy<PermitResult> interfaceC76768UAy) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(966);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        String applicantLinkMicId = data.getApplicant().getLinkMicId();
        int permitStatus = data.getPermitStatus();
        o.LJIIIZ(applicantLinkMicId, "applicantLinkMicId");
        UC0.LJJLIIIIJ(new ARunnableS4S1101000_13(permitStatus, this, applicantLinkMicId, 2));
        PermitParam permitParam = new PermitParam(null, null, null, null, null, 0, null, null, 255, null);
        permitParam.applicant = new UserBean(data.getApplicant().getRoomId(), data.getApplicant().getUserId());
        permitParam.approver = new UserBean(this.LJIL, this.LJIILIIL);
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            permitParam.operator = new UserBean(this.LJIL, this.LJIILIIL);
        }
        permitParam.channelId = Long.valueOf(this.LJI);
        permitParam.common = U7V.LJII(this.LJFF);
        permitParam.permitStatus = data.getPermitStatus();
        permitParam.dsl = U7V.LJFF(data.getLayoutDSLConfig());
        permitParam.bizPermitParams = data.getBizPermitParams();
        this.LJIJ = permitParam.dsl;
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).permitApply(permitParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS2S0200200_13(data, this, C31012CFc.LIZIZ(), LIZIZ, 0)).LJIIJ(new AfS3S0200100_13(LIZIZ, data, this, 23)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS72S0200000_13(this, data, 7)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, interfaceC76768UAy, 46), new AfS62S0200000_13(this, interfaceC76768UAy, 47));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJIL = (C73495Sst) LJJII;
    }

    @Override // X.U66
    public final void LLLZL(C75952TrQ c75952TrQ, U4V u4v) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reply invite group");
        LIZ.append(" start data=");
        LIZ.append(c75952TrQ);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS102S0300000_13(c75952TrQ, this, u4v, 15));
    }

    @Override // X.U6D, X.U66
    public final void LLLZLL(String str, InterfaceC76768UAy<RechargeResult> interfaceC76768UAy) {
        UC7.LJ("recharge start source=", str, "Linker");
        U7V.LJIILJJIL(new AqS67S1200000_13(str, (String) this, (U7T) interfaceC76768UAy, (InterfaceC76768UAy<RechargeResult>) 0));
    }

    @Override // X.U66
    public final void LLLZZ(LeaveChannelData data, InterfaceC76768UAy<LeaveChannelResult> interfaceC76768UAy) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(734);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leaveChannel start Leave channel cur channelId ");
        LIZ.append(this.LJI);
        LIZ.append(", state ");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(", data ");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        C76129TuH.LJII = false;
        if (this.LJI <= 0) {
            C32014ChO.LIZJ(LJJJJIZL(739), "leaveChannel mChannelId <= 0L", null);
            C15610jN.LIZIZ(new ARunnableS49S0100000_13(interfaceC76768UAy, 167));
            return;
        }
        LeaveChannelParam leaveChannelParam = new LeaveChannelParam(null, null, null, 0, null, 31, null);
        leaveChannelParam.channelId = Long.valueOf(this.LJI);
        leaveChannelParam.common = U7V.LJII(this.LJFF);
        leaveChannelParam.player = new UserBean(this.LJIL, this.LJIILIIL);
        leaveChannelParam.leaveReason = data.getLeaveReason();
        leaveChannelParam.bizLeaveParams = data.getBizLeaveParams();
        long LIZIZ = C31012CFc.LIZIZ();
        String leaveSource = data.getLeaveSource();
        int leaveReason = data.getLeaveReason();
        o.LJIIIZ(leaveSource, "leaveSource");
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new ARunnableS4S1201000_13(leaveReason, this, LIZJ, leaveSource, 6));
        C65814PsI.LIZ().getClass();
        InterfaceC92693kP LJJII = ((LinkMicApi) C65814PsI.LIZJ(LinkMicApi.class)).leaveChannelRequest(leaveChannelParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, data, 19)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, data, 20)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 10)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, interfaceC76768UAy, 42), new AfS62S0200000_13(this, interfaceC76768UAy, 43));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJIL = (C73495Sst) LJJII;
    }

    @Override // X.U66
    public final void LLZ(KickOutAllData kickOutAllData, C76596U4i c76596U4i) {
        Long l;
        String LJJJJIZL = LJJJJIZL(2196);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOutAll channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(kickOutAllData);
        C32014ChO.LIZJ(LJJJJIZL, X1D.LIZIZ(LIZ), null);
        long LIZIZ = C31012CFc.LIZIZ();
        List<LinkUser> LJJIIZI = this.LJIIJJI.LJJIIZI();
        ArrayList arrayList = new ArrayList();
        for (LinkUser linkUser : LJJIIZI) {
            LinkUser linkUser2 = linkUser;
            if (linkUser2.getUserId() != null) {
                Long userId = linkUser2.getUserId();
                Room room = this.LJ;
                if (room != null) {
                    l = Long.valueOf(room.getOwnerUserId());
                } else {
                    l = null;
                }
                if (!o.LJ(userId, l)) {
                    arrayList.add(linkUser);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String linkMicId = ((LinkUser) it.next()).getLinkMicId();
            if (linkMicId != null) {
                String kickOutAllReason = KickOutReason.Companion.stateToString(kickOutAllData.getKickOutReason());
                o.LJIIIZ(kickOutAllReason, "kickOutAllReason");
                UC0.LJJLIIIIJ(new ARunnableS5S2100000_13(this, linkMicId, kickOutAllReason, 1));
            }
        }
        KickOutAllGuestsParam kickOutAllGuestsParam = new KickOutAllGuestsParam();
        kickOutAllData.getCustomData();
        kickOutAllGuestsParam.common = LJJIJIL(this, null, 1);
        kickOutAllGuestsParam.channelId = this.LJI;
        kickOutAllGuestsParam.myself = new Player(this.LJIL, this.LJIILIIL);
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).kickOutAll(kickOutAllGuestsParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, kickOutAllData, 11)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, kickOutAllData, 12)).LJIJI(new IDhS72S0200000_13(this, kickOutAllData, 2)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, c76596U4i, 32), new AfS62S0200000_13(this, c76596U4i, 33));
        C73318Sq2 compositeDisposable = this.LJIILL;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJII);
    }

    @Override // X.U66
    public final void LLZIL(C75951TrP c75951TrP, U4U u4u) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permit apply group");
        LIZ.append(" start data=");
        LIZ.append(c75951TrP);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS102S0300000_13(c75951TrP, this, u4u, 11));
    }

    @Override // X.U66
    public final void LLZLI(C76690U7y c76690U7y, C76588U4a c76588U4a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite group");
        LIZ.append(" start data=");
        LIZ.append(c76690U7y);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS102S0300000_13(c76690U7y, this, c76588U4a, 12));
    }

    @Override // X.U66
    public final void LLZZLLIL(ChangeMaxPositionData data, C76601U4n c76601U4n) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(1379);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeMaxPosition start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new ARunnableS32S0200000_13(this, LIZJ, 142));
        ChangeLayoutParam changeLayoutParam = new ChangeLayoutParam(null, null, null, null, null, 0, null, 127, null);
        changeLayoutParam.channelId = Long.valueOf(this.LJI);
        changeLayoutParam.operator = new UserBean(this.LJIL, this.LJIILIIL);
        changeLayoutParam.common = U7V.LJIIIIZZ(this.LJFF, data.getCustomData());
        changeLayoutParam.positionConfig = new PositionConfig(data.getMaxPosition());
        changeLayoutParam.layoutId = data.getLayoutId();
        changeLayoutParam.extra = data.getBizChangeLayoutParams();
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            changeLayoutParam.sceneVersion = data.getSceneVersion();
        }
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).changeLayout(changeLayoutParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS8S0100100_13(LIZIZ, this, 20)).LJIIJ(new AfS8S0100100_13(LIZIZ, this, 21)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 13)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, c76601U4n, 49), new AfS62S0200000_13(this, c76601U4n, 51));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJJL = (C73495Sst) LJJII;
    }

    @Override // X.U6D, X.U66
    public final void a(JoinChannelData data, U6B u6b) {
        o.LJIIIZ(data, "data");
        LJJJJ(data.getBizJoinChannelParams(), false, u6b);
    }

    @Override // X.U66
    public final void e(C75919Tqt c75919Tqt, InterfaceC76768UAy<CancelInviteJoinGroupResult> interfaceC76768UAy) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel invite join group");
        LIZ.append(" start data=");
        LIZ.append(c75919Tqt);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new C76686U7u(c75919Tqt, this, interfaceC76768UAy));
    }

    @Override // X.U66
    public final void f(C76689U7x c76689U7x, U4Z u4z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply group");
        LIZ.append(" data=");
        LIZ.append(c76689U7x);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new AqS102S0300000_13(c76689U7x, this, u4z, 16));
    }

    @Override // X.U66
    public final void h(CancelApplyData data, InterfaceC76768UAy<CancelApplyResult> interfaceC76768UAy) {
        String str;
        User owner;
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(1183);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelApply start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (owner = room.getOwner()) == null || (str = owner.getIdStr()) == null) {
            str = "-1";
        }
        UC0.LJJLIIIIJ(new ARunnableS14S1100000_13(this, str, 17));
        CancelApplyParam cancelApplyParam = new CancelApplyParam(null, null, null, null, 15, null);
        cancelApplyParam.applicant = new UserBean(this.LJIL, this.LJIILIIL);
        cancelApplyParam.channelId = Long.valueOf(this.LJI);
        cancelApplyParam.common = U7V.LJII(this.LJFF);
        cancelApplyParam.bizCancelApplyParams = data.getBizCancelApplyParams();
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).cancelApply(cancelApplyParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS8S0100100_13(LIZIZ, this, 16)).LJIIJ(new AfS8S0100100_13(LIZIZ, this, 17)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 9)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, interfaceC76768UAy, 40), new AfS62S0200000_13(this, interfaceC76768UAy, 41));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJJIZL = (C73495Sst) LJJII;
    }

    @Override // X.U6D, X.U66
    public final void l(KickOutData data, C76599U4l c76599U4l) {
        o.LJIIIZ(data, "data");
        String LJJJJIZL = LJJJJIZL(1488);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorKickOut channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LIZJ(LJJJJIZL, X1D.LIZIZ(LIZ), null);
        long LIZIZ = C31012CFc.LIZIZ();
        KickOutParam kickOutParam = new KickOutParam(null, null, null, null, null, 0, 63, null);
        kickOutParam.owner = new UserBean(this.LJIL, this.LJJ);
        kickOutParam.operator = new UserBean(this.LJIL, this.LJIILIIL);
        kickOutParam.kickOutReason = data.getKickOutReason();
        kickOutParam.guest = new UserBean(data.getGuest().getRoomId(), data.getGuest().getUserId());
        kickOutParam.channelId = Long.valueOf(this.LJI);
        kickOutParam.common = U7V.LJII(this.LJFF);
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).kickOut(kickOutParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS3S0200100_13(LIZIZ, data, this, 31)).LJIIJ(new AfS3S0200100_13(LIZIZ, data, this, 32)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 5)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, c76599U4l, 24), new AfS62S0200000_13(this, c76599U4l, 25));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJJJL = (C73495Sst) LJJII;
    }

    @Override // X.U66
    public final void m(C75918Tqs c75918Tqs, InterfaceC76768UAy<CancelApplyJoinGroupResult> interfaceC76768UAy) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel apply group");
        LIZ.append(" start data=");
        LIZ.append(c75918Tqs);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new C76687U7v(c75918Tqs, this, interfaceC76768UAy));
    }

    public static C73531StT LJJIFFI(C73470SsU c73470SsU, ConcurrentHashSet concurrentHashSet, String str) {
        return new C73531StT(c73470SsU, new C76656U6q(concurrentHashSet, str));
    }

    public static LinkCommon LJJIJIL(U7T u7t, String str, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        u7t.getClass();
        LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, null, 31, null);
        linkCommon.scene = u7t.LJFF;
        linkCommon.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        linkCommon.live_id = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        linkCommon.source = str;
        linkCommon.extraMap = null;
        return linkCommon;
    }

    public static GroupPlayer LJJJ(long j, long j2, long j3) {
        Player player = new Player(0L, 0L, 3, null);
        player.roomId = j;
        player.uid = j2;
        GroupPlayer groupPlayer = new GroupPlayer();
        groupPlayer.channelId = j3;
        groupPlayer.user = player;
        return groupPlayer;
    }

    public final void LJJJJ(BizJoinChannelParams bizJoinChannelParams, boolean z, InterfaceC76768UAy<JoinChannelResult> interfaceC76768UAy) {
        AbstractC73745Swv c73652SvQ;
        String LJJJJIZL = LJJJJIZL(1474);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinChannel start bizJoinChannelParams=");
        LIZ.append(bizJoinChannelParams);
        LIZ.append(" channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new ARunnableS32S0200000_13(this, LIZJ, 137));
        JoinChannelParam joinChannelParam = new JoinChannelParam(null, 0L, null, null, 15, null);
        joinChannelParam.channelId = this.LJI;
        joinChannelParam.operater = new UserBean(this.LJIL, this.LJIILIIL);
        joinChannelParam.common = U7V.LJII(this.LJFF);
        joinChannelParam.bizJoinChannelParams = bizJoinChannelParams;
        C72242sW c72242sW = new C72242sW();
        InterfaceC73471SsV joinChannel = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).joinChannel(joinChannelParam);
        U93 u93 = new U93(c72242sW);
        joinChannel.getClass();
        if (joinChannel instanceof InterfaceC31876CfA) {
            c73652SvQ = ((InterfaceC31876CfA) joinChannel).LIZJ();
        } else {
            c73652SvQ = new C73652SvQ(joinChannel);
        }
        c73652SvQ.getClass();
        InterfaceC92693kP LJJII = new C73648SvM(new C73785SxZ(c73652SvQ, u93)).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, c72242sW, 17)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, c72242sW, 18)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJII(new AfS62S0200000_13(this, interfaceC76768UAy, 39), new AfS19S0210000_13(this, z, interfaceC76768UAy, 6));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJJJLI = (C73495Sst) LJJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJJJZ(int i, String str, boolean z) {
        long j;
        String LJJJJJ = LJJJJJ(2577);
        StringBuilder LJ = AnonymousClass028.LJ("stopInteract start source=", str, " reason=", i, " needInvokeLeave=");
        LJ.append(z);
        LJ.append(" mIsOwnerForRtcRoom=");
        LJ.append(this.LJJII);
        LJ.append(' ');
        C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LJ));
        java.util.Map map = null;
        Object[] objArr = 0;
        if (LJJJIL()) {
            if (this.LJFF == 2) {
                LJJJLL(0);
                LLZZJLIL(new C76684U7s(this.LJIL, this.LJIILIIL, this.LJI, new BizLeaveJoinGroupParams(), str), null, 0L, false, new C76632U5s(this, str));
                return true;
            }
            if (!LJJJLL(0)) {
                return false;
            }
            if (o.LJ(str, "rtc_error")) {
                j = 10011;
            } else {
                j = 0;
            }
            LLLLLLZZ(new DestroyChannelData(j, map, 2, objArr == true ? 1 : 0), null);
            return true;
        }
        if (this.LJFF == 2) {
            LJJJLL(0);
            return true;
        }
        if (this.LJIILJJIL.LIZ == 0 || !LJJJLL(1) || !z) {
            return false;
        }
        LeaveChannelData.Builder builder = new LeaveChannelData.Builder();
        builder.setBizLeaveParams(null);
        builder.setLeaveSource(str);
        builder.setLeaveReason(i);
        LLLZZ(builder.build(), null);
        return true;
    }

    @Override // X.U66
    public final void LLLLLLLZIL(InviteData data, InterfaceC76768UAy<InviteResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> canPreJoinChannelAction) {
        String str;
        String str2;
        long j;
        long j2;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(canPreJoinChannelAction, "canPreJoinChannelAction");
        String LJJJJIZL = LJJJJIZL(911);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(data.getInvitee().getUserId());
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            str2 = room2.getIdStr();
        } else {
            str2 = null;
        }
        UA9.LJIJJLI(this, valueOf, valueOf2, String.valueOf(str2));
        U71 LJJIJIIJIL = LJJIJIIJIL();
        int i = this.LJFF;
        C76673U7h c76673U7h = new C76673U7h(LIZIZ, interfaceC76768UAy, data, this);
        LJJIJIIJIL.getClass();
        if (LJJIJIIJIL.LIZLLL.contains(Long.valueOf(data.getInvitee().getUserId()))) {
            c76673U7h.LIZ(LinkCoreError.Companion.getINVITE_SENT_TARGET_USER(), null, null);
            return;
        }
        long userId = data.getInvitee().getUserId();
        LJJIJIIJIL.LIZLLL.put(Long.valueOf(userId), data);
        ((CopyOnWriteArraySet) LJJIJIIJIL.LJFF).add(Long.valueOf(userId));
        InviteParam inviteParam = new InviteParam(null, null, null, null, null, null, null, null, null, 511, null);
        Room room3 = LJJIJIIJIL.LIZ.LJ;
        if (room3 != null) {
            j = room3.getId();
        } else {
            j = 0;
        }
        inviteParam.inviter = new UserBean(j, LJJIJIIJIL.LJ);
        inviteParam.invitee = new UserBean(data.getInvitee().getRoomId(), data.getInvitee().getUserId());
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            Room room4 = LJJIJIIJIL.LIZ.LJ;
            if (room4 != null) {
                j2 = room4.getId();
            } else {
                j2 = 0;
            }
            inviteParam.operator = new UserBean(j2, LJJIJIIJIL.LJ);
        }
        inviteParam.common = U7V.LJIIIIZZ(i, data.getCustomData());
        inviteParam.config = new InitConfig(new PositionConfig(data.getMaxPosition()));
        inviteParam.position = U7V.LIZIZ(data.getOnLineMicInfo());
        inviteParam.channelId = Long.valueOf(data.getChannelId());
        inviteParam.dsl = U7V.LJFF(data.getLayoutDSLConfig());
        BizInviteParams bizInviteParams = new BizInviteParams();
        bizInviteParams.source = data.getSource();
        inviteParam.extra = bizInviteParams;
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).invite(inviteParam).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJII(new AfS2S0300100_13(userId, LJJIJIIJIL, c76673U7h, data, 5), new AfS3S0200100_13(userId, LJJIJIIJIL, c76673U7h, 46));
        C73318Sq2 compositeDisposable = LJJIJIIJIL.LIZIZ;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJII);
    }

    @Override // X.U6D, X.U66
    public final void LLLLZLLLI(InviteData data, C76595U4h c76595U4h, InterfaceC65784Pro canPreJoinChannelAction) {
        long j;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(canPreJoinChannelAction, "canPreJoinChannelAction");
        String LJJJJIZL = LJJJJIZL(977);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moderatorInvite start channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" data=");
        LIZ.append(data);
        LIZ.append(", anchorId=");
        LIZ.append(this.LJJ);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        long LIZIZ = C31012CFc.LIZIZ();
        C76679U7n c76679U7n = (C76679U7n) this.LJJLIIIJILLIZJL.getValue();
        int i = this.LJFF;
        long j2 = this.LJJ;
        C76672U7g c76672U7g = new C76672U7g(LIZIZ, c76595U4h, data, this);
        c76679U7n.getClass();
        if (c76679U7n.LIZ().contains(Long.valueOf(data.getInvitee().getUserId()))) {
            c76672U7g.LIZ(LinkCoreError.Companion.getINVITE_SENT_TARGET_USER(), null, null);
            return;
        }
        long userId = data.getInvitee().getUserId();
        ((CopyOnWriteArraySet) c76679U7n.LIZLLL).add(Long.valueOf(userId));
        InviteParam inviteParam = new InviteParam(null, null, null, null, null, null, null, null, null, 511, null);
        Room room = c76679U7n.LIZ.LJ;
        long j3 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        inviteParam.inviter = new UserBean(j, j2);
        inviteParam.invitee = new UserBean(data.getInvitee().getRoomId(), data.getInvitee().getUserId());
        Room room2 = c76679U7n.LIZ.LJ;
        if (room2 != null) {
            j3 = room2.getId();
        }
        inviteParam.operator = new UserBean(j3, c76679U7n.LIZJ);
        inviteParam.common = U7V.LJIIIIZZ(i, data.getCustomData());
        inviteParam.config = new InitConfig(new PositionConfig(data.getMaxPosition()));
        inviteParam.position = U7V.LIZIZ(data.getOnLineMicInfo());
        inviteParam.channelId = Long.valueOf(data.getChannelId());
        inviteParam.dsl = U7V.LJFF(data.getLayoutDSLConfig());
        BizInviteParams bizInviteParams = new BizInviteParams();
        bizInviteParams.source = data.getSource();
        inviteParam.extra = bizInviteParams;
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).invite(inviteParam).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJII(new AfS3S0200100_13(userId, c76679U7n, c76672U7g, 47), new AfS3S0200100_13(userId, c76679U7n, c76672U7g, 48));
        C73318Sq2 compositeDisposable = c76679U7n.LIZIZ;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJII);
    }

    @Override // X.U66
    public final void LLLZLZ(ApplyData data, InterfaceC76768UAy<ApplyResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> canPreJoinChannelAction) {
        String str;
        String idStr;
        User owner;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(canPreJoinChannelAction, "canPreJoinChannelAction");
        String LJJJJIZL = LJJJJIZL(807);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply start, channelId=");
        LIZ.append(this.LJI);
        LIZ.append(" state=");
        LIZ.append(this.LJIILJJIL.LIZ);
        LIZ.append(" data=");
        LIZ.append(data);
        C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
        int i = this.LJIILJJIL.LIZ;
        long j = this.LJI;
        String str2 = null;
        if (j > 0 && j != data.getChannelId()) {
            C32014ChO.LIZJ(LJJJJIZL(821), "apply mChannelId > 0 && mChannelId != data.channelId", null);
            C15610jN.LIZIZ(new ARunnableS49S0100000_13(interfaceC76768UAy, 165));
            return;
        }
        if (i == 2 && !MultiGuestSdkApplyStateInterceptionSetting.INSTANCE.isFix()) {
            C32014ChO.LIZJ(LJJJJIZL(831), "apply curState == LinkMicState.WAITING", null);
            C15610jN.LIZIZ(new ARunnableS49S0100000_13(interfaceC76768UAy, 166));
            return;
        }
        long LIZIZ = C31012CFc.LIZIZ();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null) {
            str2 = room.getIdStr();
        }
        String str3 = "-1";
        if (str2 == null) {
            str2 = "-1";
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 == null || (owner = room2.getOwner()) == null || (str = owner.getIdStr()) == null) {
            str = "-1";
        }
        Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room3 != null && (idStr = room3.getIdStr()) != null) {
            str3 = idStr;
        }
        UA9.LJIIIZ(this, str2, str, str3);
        ApplyRequestParam applyRequestParam = new ApplyRequestParam(null, null, null, null, null, 31, null);
        applyRequestParam.applicant = new UserBean(this.LJIL, this.LJIILIIL);
        applyRequestParam.position = U7V.LIZIZ(data.getOnLineMicInfo());
        applyRequestParam.channelId = Long.valueOf(data.getChannelId());
        applyRequestParam.common = U7V.LJII(this.LJFF);
        applyRequestParam.bizApplyParams = data.getBizApplyParams();
        InterfaceC92693kP LJJII = ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).applyRequest(applyRequestParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS8S0100100_13(LIZIZ, this, 14)).LJIIJ(new AfS8S0100100_13(LIZIZ, this, 15)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS72S0200000_13(this, data, 5)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0200000_13(this, interfaceC76768UAy, 37), new AfS62S0200000_13(this, interfaceC76768UAy, 38));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = this.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
        }
        this.LJJIJIL = (C73495Sst) LJJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.U66
    public final void j(CreateChannelData data, InterfaceC76768UAy<CreateChannelResult> interfaceC76768UAy, BizResumeParams bizResumeParams) {
        o.LJIIIZ(data, "data");
        String str = "";
        if (this.LJFF == 4) {
            String LJJJJIZL = LJJJJIZL(570);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createChannel start create channel cur channelId ");
            LIZ.append(this.LJI);
            LIZ.append(", state ");
            LIZ.append(this.LJIILJJIL.LIZ);
            LIZ.append(" data=");
            LIZ.append(data);
            C32014ChO.LJFF(LJJJJIZL, X1D.LIZIZ(LIZ));
            if (this.LJIILJJIL.LIZ != 0) {
                C32014ChO.LJFF(LJJJJIZL(574), "createChannel getLinkMicState() != LinkMicState.IDLE");
                C15610jN.LIZIZ(new ARunnableS49S0100000_13(interfaceC76768UAy, 162));
                return;
            }
            LinkCommonBean LJII = U7V.LJII(this.LJFF);
            UserBean userBean = new UserBean(this.LJIL, this.LJIILIIL);
            InitConfig initConfig = new InitConfig(new PositionConfig(data.getMaxPosition()));
            String layoutId = data.getLayoutId();
            if (layoutId != null) {
                str = layoutId;
            }
            CreateChannelParam createChannelParam = new CreateChannelParam(LJII, userBean, initConfig, str, data.getBizCreateChannelParams(), data.getLiveRoomMode());
            long LIZIZ = C31012CFc.LIZIZ();
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS32S0200000_13(this, LIZJ, 143));
            C65814PsI.LIZ().getClass();
            InterfaceC92693kP LJJII = ((LinkMicApi) C65814PsI.LIZJ(LinkMicApi.class)).crateChannelRequest(createChannelParam).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS8S0100100_13(LIZIZ, this, 10)).LJIIJ(new AfS8S0100100_13(LIZIZ, this, 11)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 7)).LJIILL(new IDhS72S0200000_13(this, bizResumeParams, 3)).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS24S0400000_13(this, interfaceC76768UAy, data, bizResumeParams, 5), new AfS24S0400000_13(this, interfaceC76768UAy, data, bizResumeParams, 6));
            if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                C73318Sq2 compositeDisposable = this.LJIILL;
                o.LJIIIZ(compositeDisposable, "compositeDisposable");
                compositeDisposable.LIZ(LJJII);
            }
            this.LJJIZ = (C73495Sst) LJJII;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("createChannel start create channel currentChannelId=");
        LIZ2.append(this.LJI);
        LIZ2.append(", state=");
        LIZ2.append(this.LJIILJJIL.LIZ);
        LIZ2.append(" data=");
        LIZ2.append(data);
        LIZ2.append(" scene=");
        LIZ2.append(this.LJFF);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ2));
        LinkCommonBean LJII2 = U7V.LJII(this.LJFF);
        UserBean userBean2 = new UserBean(this.LJIL, this.LJIILIIL);
        InitConfig initConfig2 = new InitConfig(new PositionConfig(data.getMaxPosition()));
        String layoutId2 = data.getLayoutId();
        if (layoutId2 != null) {
            str = layoutId2;
        }
        CreateChannelParam createChannelParam2 = new CreateChannelParam(LJII2, userBean2, initConfig2, str, null, data.getLiveRoomMode(), 16, 0 == true ? 1 : 0);
        long LIZIZ2 = C31012CFc.LIZIZ();
        C76762UAs LIZJ2 = UA9.LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS32S0200000_13(this, LIZJ2, 143));
        C65814PsI.LIZ().getClass();
        C73543Stf LJIIJ = new C73671Svj(C76857UEj.LJII(((LinkMicApi) C65814PsI.LIZJ(LinkMicApi.class)).crateChannelRequest(createChannelParam2), "create channel").LJIL(LinkmicCoHostCreateChannelRetrySetting.INSTANCE.getValue()).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS8S0100100_13(LIZIZ2, this, 18)).LJIIJ(new AfS8S0100100_13(LIZIZ2, this, 19)).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJI(new IDhS106S0100000_13(this, 12)).LJIJJ(C73969T1h.LIZIZ()).LJIILIIL(new AfS65S0100000_13(interfaceC76768UAy, 162)).LJIIJ(new AfS65S0100000_13(interfaceC76768UAy, 163))).LJIIIIZZ().LJIIJ(new AfS65S0100000_13(this, 165), new IDaS222S0100000_13(this, 10));
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable2 = this.LJIILL;
            o.LJIIIZ(compositeDisposable2, "compositeDisposable");
            compositeDisposable2.LIZ(LJIIJ);
        }
        this.LJJJ = LJIIJ;
    }

    public final void LJJIJ(List list, long j, List list2, long j2) {
        MtCohostForwardRoomsTimestampCheckSetting mtCohostForwardRoomsTimestampCheckSetting = MtCohostForwardRoomsTimestampCheckSetting.INSTANCE;
        if (mtCohostForwardRoomsTimestampCheckSetting.getValue() && j2 < this.LJJLIIIJLJLI) {
            U4R.LIZLLL("Linker", "forwardStreamToRooms timestamp is not valid");
            return;
        }
        if (!C113554cx.LJJLIL(this.LJIIJJI.LJ).containsKey(Long.valueOf(j))) {
            U4R.LIZLLL("Linker", "forwardStreamToRooms group channel id is not in usermanager record");
            return;
        }
        if (mtCohostForwardRoomsTimestampCheckSetting.getValue() && !this.LJIIIZ.LIZJ && !this.LJIIIZ.LIZ) {
            U4R.LIZLLL("Linker", "forwardStreamToRooms rtc engine is not initializing or initialized");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("forwardStreamToRooms groupChannelId=");
        LIZ.append(j);
        LIZ.append(" groupRTCExtraInfo=");
        LIZ.append(list);
        LIZ.append(" groupChannelUsers=");
        LIZ.append(ORZ.LLD(list2, ",", null, null, U88.LJLIL, 30));
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        this.LJJLIIIJLJLI = j2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RTCExtraInfo rTCExtraInfo = (RTCExtraInfo) it.next();
            RTCEngineConfig rTCEngineConfig = rTCExtraInfo.config;
            if (rTCEngineConfig != null) {
                String LJFF = C38393F4z.LJFF(rTCExtraInfo);
                long j3 = rTCEngineConfig.rtcChannelId;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        GroupChannelUser groupChannelUser = (GroupChannelUser) next;
                        if (groupChannelUser.channelId == j3 && groupChannelUser.status == 3) {
                            if (next != null) {
                                arrayList.add(new Client.ForwardRoomInfo(String.valueOf(j3), LJFF));
                            }
                        }
                    }
                }
            }
        }
        U7U u7u = this.LJIIIZ;
        u7u.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("forwardStreamToRoomsWhenAvailable forwardRoomList=");
        LIZ2.append(ORZ.LLD(arrayList, ",", null, null, C64392POy.LJLIL, 30));
        LIZ2.append(" rtcChannelJoined=");
        LIZ2.append(u7u.LJJIJIIJI);
        LIZ2.append(" currentForwarding=");
        LIZ2.append(u7u.LJJIJL);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ2));
        u7u.LJJIJIL = arrayList;
        if (u7u.LIZLLL) {
            if (arrayList.isEmpty()) {
                if (u7u.LJJIJL) {
                    U4R.LIZLLL("RtcManager", "stopForwardStreamToRooms");
                    u7u.LJJIJL = false;
                    U66 u66 = u7u.LJIIIZ;
                    if (u66 != null) {
                        long LIZIZ = C31012CFc.LIZIZ();
                        long currentTimeMillis = System.currentTimeMillis();
                        C76762UAs LIZJ = UA9.LIZJ();
                        LIZJ.getClass();
                        UC0.LJJLIIIIJ(new ARunnableS0S0200200_13(u66, LIZJ, LIZIZ, currentTimeMillis, 1));
                    }
                    Client client = u7u.LJII;
                    if (client != null) {
                        client.stopForwardStreamToRooms();
                    }
                }
            } else if (!u7u.LJJIJL) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("startForwardStreamToRooms forwardRoomList=");
                LIZ3.append(ORZ.LLD(arrayList, ",", null, null, C64393POz.LJLIL, 30));
                U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ3));
                u7u.LJJIJL = true;
                U66 u662 = u7u.LJIIIZ;
                if (u662 != null) {
                    UA9.LJJIL(u662, arrayList, C31012CFc.LIZIZ(), System.currentTimeMillis());
                }
                Client client2 = u7u.LJII;
                if (client2 != null) {
                    client2.startForwardStreamToRooms(arrayList);
                }
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("updateForwardStreamToRooms forwardRoomList=");
                LIZ4.append(ORZ.LLD(arrayList, ",", null, null, PP0.LJLIL, 30));
                U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ4));
                u7u.LJJIJL = true;
                U66 u663 = u7u.LJIIIZ;
                if (u663 != null) {
                    UA9.LJJIL(u663, arrayList, C31012CFc.LIZIZ(), System.currentTimeMillis());
                }
                Client client3 = u7u.LJII;
                if (client3 != null) {
                    client3.updateForwardStreamToRooms(arrayList);
                }
            }
        }
        U86 u86 = (U86) this.LJJLIIIIJ.getValue();
        u86.getClass();
        U7V.LJIILJJIL(new AqS160S0200000_13(list2, (List<GroupChannelUser>) u86, (U86) 59));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r15.equals("rtc_error") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r15.equals("rtc_start_failed") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
    
        if (r15.equals("leave_only_one") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI(java.lang.String r14, java.lang.String r15, boolean r16, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError r17) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.LJJJJZI(java.lang.String, java.lang.String, boolean, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError):void");
    }

    public final void LJJIIZ(String str, String str2, boolean z, LinkCoreError linkCoreError, List<Long> list) {
        U7V.LJIILJJIL(new U7X(str, this, z, list, str2, linkCoreError));
    }

    @Override // X.U66
    public final void LLZZJLIL(C76684U7s c76684U7s, Long l, long j, boolean z, InterfaceC76768UAy<LeaveGroupResult> interfaceC76768UAy) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leave group");
        LIZ.append(" start data=");
        LIZ.append(c76684U7s);
        LIZ.append(" leaveGroupChannelId=");
        LIZ.append(l);
        LIZ.append(" stayGroupChannelId=");
        LIZ.append(j);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7V.LJIILJJIL(new C76685U7t(c76684U7s, l, j, this, z, interfaceC76768UAy));
    }
}
