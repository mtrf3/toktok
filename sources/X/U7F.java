package X;

import Y.ARunnableS0S0400200_13;
import Y.ARunnableS13S0301000_13;
import Y.ARunnableS14S1100000_13;
import Y.ARunnableS16S0201000_13;
import Y.ARunnableS16S0400000_13;
import Y.ARunnableS24S0300000_13;
import Y.ARunnableS4S1101000_13;
import Y.ARunnableS4S1201000_13;
import Y.ARunnableS5S2100000_13;
import Y.ARunnableS8S1100100_13;
import Y.AfS0S0400100_13;
import Y.AfS1S0100200_13;
import Y.AfS1S1201100_13;
import Y.AfS22S1200000_13;
import Y.AfS24S0400000_13;
import Y.AfS26S1100000_13;
import Y.AfS2S0300100_13;
import Y.AfS3S0200100_13;
import Y.AfS4S1200100_13;
import Y.AfS52S0300000_13;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import Y.AfS8S0100100_13;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.CoHostApi;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LivePkConnectTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReceiveInviteMessageTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiCoHostForbidPreJoinChannelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiCoHostQuickRecommendPreJoinFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinFixChannelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohosArcConflictFixSetting;
import com.bytedance.android.livesdk.model.message.CohostListChangeContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linker.cancel_message.LinkerCancelContent;
import com.bytedance.android.livesdk.model.message.linker.enter_message.LinkerEnterContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.android.livesdk.model.message.linker.leave_message.LinkerLeaveContent;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.ListUser;
import com.bytedance.android.livesdk.model.message.linker.mic_update.LinkerMicIdxUpdateInfo;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkmicInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.controller.MGetABInfosReq;
import webcast.data.multilive_biz.BizResumeParams;

/* loaded from: classes14.dex */
public final class U7F extends U6D {
    public final Room LJ;
    public final int LJFF;
    public final long LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ;
    public final C73318Sq2 LJIIJJI;
    public final C73318Sq2 LJIIL;
    public final java.util.Map<Long, InterfaceC92693kP> LJIILIIL;
    public final CopyOnWriteArrayList<InterfaceC76622U5i> LJIILJJIL;
    public final CopyOnWriteArrayList<UBJ> LJIILL;
    public final C76683U7r LJIILLIIL;
    public final CopyOnWriteArrayList<U6Y> LJIIZILJ;
    public final U7W LJIJ;
    public final C62822Ol8 LJIJI;
    public final C62822Ol8 LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public final java.util.Map<String, InterfaceC92693kP> LJIL;
    public final java.util.Map<String, Boolean> LJJ;
    public boolean LJJI;
    public final C62822Ol8 LJJIFFI;
    public long LJJII;

    @Override // X.InterfaceC76681U7p
    public final void LIZ(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LIZLLL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIIIZZ(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIJ(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIL(LinkLayerMessage message, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILIIL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILJJIL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILL(CR6 message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIILLIIL(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIZILJ(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJJ(LinkLayerMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.U66
    public final void LLLLLLLLL(InterfaceC76768UAy<JoinRtcChannelResult> interfaceC76768UAy) {
    }

    @Override // X.U66
    public final void LLLLLLZZ(DestroyChannelData data, InterfaceC76768UAy<DestroyChannelResult> interfaceC76768UAy) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.U66
    public final void LLLLZIL(KickOutData data, C76602U4o c76602U4o) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.U66
    public final void LLLZ(DSLConfig dSLConfig) {
    }

    @Override // X.U66
    public final void LLLZL(C75952TrQ c75952TrQ, U4V u4v) {
    }

    @Override // X.U66
    public final void LLZ(KickOutAllData kickOutAllData, C76596U4i c76596U4i) {
    }

    @Override // X.U66
    public final void LLZIL(C75951TrP c75951TrP, U4U u4u) {
    }

    @Override // X.U66
    public final void LLZLI(C76690U7y c76690U7y, C76588U4a c76588U4a) {
    }

    @Override // X.U66
    public final void LLZZJLIL(C76684U7s c76684U7s, Long l, long j, boolean z, InterfaceC76768UAy<LeaveGroupResult> interfaceC76768UAy) {
    }

    @Override // X.U66
    public final void LLZZLLIL(ChangeMaxPositionData data, C76601U4n c76601U4n) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.U66
    public final N39 LLZZZZ() {
        return null;
    }

    @Override // X.U66
    public final void e(C75919Tqt c75919Tqt, InterfaceC76768UAy<CancelInviteJoinGroupResult> interfaceC76768UAy) {
    }

    @Override // X.U66
    public final void f(C76689U7x c76689U7x, U4Z u4z) {
    }

    @Override // X.U66
    public final void j(CreateChannelData data, InterfaceC76768UAy<CreateChannelResult> interfaceC76768UAy, BizResumeParams bizResumeParams) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.U66
    public final void m(C75918Tqs c75918Tqs, InterfaceC76768UAy<CancelApplyJoinGroupResult> interfaceC76768UAy) {
    }

    @Override // X.U66
    public final int LIZIZ() {
        return this.LJIILLIIL.LIZ;
    }

    public final boolean LJJIII() {
        Iterator<InterfaceC76622U5i> it = this.LJIILJJIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().LJJLIIIJILLIZJL();
        }
        return z;
    }

    public final U7H LJJIIJZLJL() {
        return (U7H) this.LJIJI.getValue();
    }

    public final U7M LJJIIZ() {
        return (U7M) this.LJIJJLI.getValue();
    }

    public final U7U LJJIIZI() {
        return (U7U) this.LJIJJ.getValue();
    }

    @Override // X.U66
    public final RtcUserInfo LLZL() {
        long j = this.LJI;
        long LIZ = C025908h.LIZ();
        String str = this.LJIIJ;
        if (str == null) {
            str = "";
        }
        return new RtcUserInfo(j, LIZ, str, false, this.LJIIIZ);
    }

    public final void LJJJI() {
        if (LJJIIZ().LJLLLL) {
            LJJIIZ().getClass();
            this.LJIILLIIL.LIZIZ(0);
            LJJIIZI().LJJLIIIJILLIZJL(C78857UxB.LJJIIJ(1476788483, "bpea-linkmic_colinker_stoprtcifjoinchanneladvance"), "stop_join_channel_advance");
            return;
        }
        LJJIIZ().LLLLZLLIL("stopRtcIfJoinChannelAdvance");
    }

    @Override // X.U66
    public final U7U LLLLZLL() {
        return LJJIIZI();
    }

    @Override // X.U66
    public final InterfaceC75973Trl LLZZ() {
        return LJJIIJZLJL();
    }

    @Override // X.U66
    public final InterfaceC76652U6m c() {
        return LJJIIJZLJL();
    }

    @Override // X.U66
    public final boolean d() {
        return LJJIIZ().LJLLLL;
    }

    @Override // X.U66
    public final Room LIZJ() {
        return this.LJ;
    }

    @Override // X.U66
    public final long LJJLI() {
        return this.LJIIIZ;
    }

    @Override // X.U66
    public final java.util.Set<Long> LLLLLL() {
        return OQY.INSTANCE;
    }

    @Override // X.U66
    public final U7W LLLZIIL() {
        return this.LJIJ;
    }

    @Override // X.U66
    public final String LLZLL() {
        return this.LJIIJ;
    }

    @Override // X.U66
    public final int getScene() {
        return this.LJFF;
    }

    @Override // X.U66
    public final /* bridge */ /* synthetic */ C76683U7r k() {
        return this.LJIILLIIL;
    }

    public static final String LJJIJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_callback_CoLinker_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_callback_CoLinker_", i, LIZ2);
    }

    public static final String LJJIJIIJI(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_request_CoLinker_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_request_CoLinker_", i, LIZ2);
    }

    public static final String LJJIJIIJIL(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_CoLinker_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_CoLinker_", i, LIZ2);
    }

    @Override // X.InterfaceC76681U7p
    public final void LJ(CR6 message) {
        String str;
        o.LJIIIZ(message, "message");
        if ((message instanceof LinkMessage) && message != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleApplyMessage:");
            LIZ.append(message);
            U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ));
            LinkMessage linkMessage = (LinkMessage) message;
            LinkerInviteMessageExtra LIZIZ = linkMessage.LIZIZ();
            if (LIZIZ == null || linkMessage.inviteContent == null || LIZIZ.inviterRivalExtra == null) {
                return;
            }
            if (linkMessage.expireTimestamp > 0) {
                U7M LJJIIZ = LJJIIZ();
                linkMessage.LIZ();
                LJJIIZ.getClass();
            }
            LinkerInviteContent linkerInviteContent = linkMessage.inviteContent;
            java.util.Map<Long, Long> map = LJJIIZ().LJLILLLLZI;
            Long valueOf = Long.valueOf(linkerInviteContent.fromUserId);
            Long l = linkerInviteContent.actionId;
            o.LJIIIIZZ(l, "applyContent.actionId");
            ((HashMap) map).put(valueOf, l);
            LJJIIZ().LLLZI(linkMessage.transferExtra);
            LJJIIZ().LJZ = linkerInviteContent.fromLinkmicIdStr;
            LJJIIZ().LJLJL = linkerInviteContent.fromUserId;
            LJJIIZ().LJLL = linkerInviteContent.fromRoomId;
            LJJIIZ().getClass();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || (str = room.getIdStr()) == null) {
                str = "-1";
            }
            String valueOf2 = String.valueOf(LJJIIZ().LJLJL);
            String valueOf3 = String.valueOf(LJJIIZ().LJLL);
            String str2 = LJJIIZ().LJZ;
            if (str2 == null) {
                str2 = "";
            }
            UA9.LJIIIIZZ(this, str, valueOf2, valueOf3, str2, linkMessage.getMessageId());
            U7W u7w = this.LJIJ;
            String valueOf4 = String.valueOf(linkMessage.getMessageId());
            String valueOf5 = String.valueOf(linkMessage.scene);
            String valueOf6 = String.valueOf(linkMessage.messageType);
            String str3 = linkerInviteContent.fromLinkmicIdStr;
            o.LJIIIIZZ(str3, "applyContent.fromLinkmicIdStr");
            U7W.LJIILIIL("apply_message", this, valueOf4, valueOf5, valueOf6, str3, String.valueOf(linkerInviteContent.fromUserId), null);
            if (linkerInviteContent.rtcJoinChannel && !TextUtils.isEmpty(linkerInviteContent.toRtcExtInfo)) {
                U7M LJJIIZ2 = LJJIIZ();
                String str4 = linkerInviteContent.toRtcExtInfo;
                o.LJIIIIZZ(str4, "applyContent.toRtcExtInfo");
                String LJJJIL = LJJJIL(str4);
                if (LJJJIL == null) {
                    LJJJIL = linkerInviteContent.toRtcExtInfo;
                }
                LJJIIZ2.LLLZ(LJJJIL);
            }
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setRoomId(Long.valueOf(linkerInviteContent.fromRoomId));
            builder.setUserId(Long.valueOf(linkerInviteContent.fromUserId));
            builder.setChannelId(Long.valueOf(linkMessage.channelId));
            builder.setLinkMicId(linkerInviteContent.fromLinkmicIdStr);
            LinkUser build = builder.build();
            LJJIIJZLJL().LJJJJZI(build);
            C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, build, message, 30));
        }
    }

    @Override // X.InterfaceC76681U7p
    public final void LJFF(CR6 message) {
        LinkMessage linkMessage;
        LinkerEnterContent linkerEnterContent;
        List<ListUser> list;
        Long valueOf;
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleCreateChannelMessage:");
        LIZ.append(message);
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ));
        if ((message instanceof LinkMessage) && message != null && (linkerEnterContent = (linkMessage = (LinkMessage) message).enterContent) != null && (list = linkerEnterContent.listUsers) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("handleCreateChannelMessage listUser size: ");
            LIZ2.append(list.size());
            U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ2));
            for (ListUser listUser : list) {
                if (listUser.user.getId() == this.LJII) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("handleCreateChannelMessage mRoomOwnerUserId:");
                    LIZ3.append(this.LJII);
                    U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ3));
                    LinkUser.Builder builder = new LinkUser.Builder();
                    builder.setUserId(Long.valueOf(listUser.user.getId()));
                    builder.setLinkMicId(listUser.linkmicIdStr);
                    long j = listUser.channelId;
                    if (j == 0) {
                        valueOf = Long.valueOf(linkMessage.channelId);
                    } else {
                        valueOf = Long.valueOf(j);
                    }
                    builder.setChannelId(valueOf);
                    C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, builder.build(), message, 35));
                }
            }
        }
    }

    @Override // X.InterfaceC76681U7p
    public final void LJI(LinkMessage message) {
        List<CohostListUser> list;
        String str;
        List<CohostListUser> list2;
        o.LJIIIZ(message, "message");
        U4R.LIZLLL("CoLinker", "handleCohostListChanged");
        U7H LJJIIJZLJL = LJJIIJZLJL();
        LJJIIJZLJL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onListChangeMessageReceived message:");
        LIZ.append(message);
        LIZ.append(", createTime:");
        CommonMessageData commonMessageData = message.baseMessage;
        Long l = null;
        if (commonMessageData != null) {
            l = Long.valueOf(commonMessageData.createTime);
        }
        LIZ.append(l);
        U4R.LIZ("CoManager", X1D.LIZIZ(LIZ));
        LJJIIJZLJL.LJIILJJIL = String.valueOf(message.getMessageId());
        long j = message.baseMessage.createTime;
        if (j < LJJIIJZLJL.LJIILIIL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("filter this msg, msg createTime:");
            LIZ2.append(message.baseMessage.createTime);
            LIZ2.append(", oldMsgCreateTime:");
            LIZ2.append(LJJIIJZLJL.LJIILIIL);
            U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ2));
            LLZLLLL(Boolean.FALSE);
            return;
        }
        LJJIIJZLJL.LJIILIIL = j;
        long j2 = message.channelId;
        CohostListChangeContent cohostListChangeContent = message.cohostListChangeContent;
        if (cohostListChangeContent != null && (list2 = cohostListChangeContent.users) != null) {
            LJJIIJZLJL.LJJLIIIJLJLI(j2, list2, message);
        }
        U4R.LIZLLL("CoManager", "updateAllFloatPositionMapByListMessage");
        ArrayList arrayList = new ArrayList();
        CohostListChangeContent cohostListChangeContent2 = message.cohostListChangeContent;
        if (cohostListChangeContent2 != null && (list = cohostListChangeContent2.users) != null) {
            for (CohostListUser cohostListUser : list) {
                if (cohostListUser.linkmicUserStatus == 1 && (str = cohostListUser.linkmicIdStr) != null) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.remove(LJJIIJZLJL.LJIIJ)) {
            ListProtector.add(arrayList, 0, LJJIIJZLJL.LJIIJ);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("tempFloatList size:");
        LIZ3.append(arrayList.size());
        U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ3));
        if (!U7V.LIZ(LJJIIJZLJL.LJII, arrayList)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("update floatPositionArray, pre size:");
            LIZ4.append(LJJIIJZLJL.LJII.size());
            LIZ4.append(", after size:");
            LIZ4.append(arrayList.size());
            U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ4));
            LJJIIJZLJL.LJII = arrayList;
            LJJIIJZLJL.LJJL();
            return;
        }
        LJJIIJZLJL.LJIIZILJ();
    }

    @Override // X.InterfaceC76681U7p
    public final void LJII(LinkMessage message) {
        o.LJIIIZ(message, "message");
        U4R.LIZLLL("CoLinker", "handleCoHostCloseMessage");
        if (this.LJIIIIZZ) {
            if (!LJJIIZ().LL) {
                LJJIJIL(3, null);
                this.LJIILLIIL.LIZIZ(6);
                return;
            }
            return;
        }
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setUserId(0L);
        builder.setLinkMicId("");
        C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, builder.build(), message, 33));
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIIZ(IMessage message) {
        String str;
        Long l;
        Long l2;
        String str2;
        String str3;
        String str4;
        Long l3;
        boolean LJJI;
        int i;
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleInviteMessage:");
        LIZ.append(message);
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ));
        C76129TuH.LIZJ = 2;
        if ((message instanceof LinkMessage) && message != null) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            LinkMessage linkMessage = (LinkMessage) message;
            LinkerInviteContent linkerInviteContent = linkMessage.inviteContent;
            if (linkerInviteContent != null) {
                l = Long.valueOf(linkerInviteContent.fromUserId);
            } else {
                l = null;
            }
            String valueOf2 = String.valueOf(l);
            LinkerInviteContent linkerInviteContent2 = linkMessage.inviteContent;
            if (linkerInviteContent2 != null) {
                l2 = Long.valueOf(linkerInviteContent2.fromRoomId);
            } else {
                l2 = null;
            }
            String valueOf3 = String.valueOf(l2);
            LinkerInviteContent linkerInviteContent3 = linkMessage.inviteContent;
            if (linkerInviteContent3 != null) {
                str2 = linkerInviteContent3.fromLinkmicIdStr;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (linkerInviteContent3 == null || (str3 = linkerInviteContent3.toLinkmicIdStr) == null) {
                str3 = "";
            }
            UA9.LJIJJ(this, valueOf, valueOf2, valueOf3, str2, str3, linkMessage.getMessageId(), false, "");
            U7W u7w = this.LJIJ;
            String valueOf4 = String.valueOf(linkMessage.getMessageId());
            String valueOf5 = String.valueOf(linkMessage.scene);
            String valueOf6 = String.valueOf(linkMessage.messageType);
            LinkerInviteContent linkerInviteContent4 = linkMessage.inviteContent;
            if (linkerInviteContent4 == null || (str4 = linkerInviteContent4.fromLinkmicIdStr) == null) {
                str4 = "";
            }
            if (linkerInviteContent4 != null) {
                l3 = Long.valueOf(linkerInviteContent4.fromUserId);
            } else {
                l3 = null;
            }
            U7W.LJIILIIL("invite_message", this, valueOf4, valueOf5, valueOf6, str4, String.valueOf(l3), null);
            if (LJJIII()) {
                C32014ChO.LIZJ(LJJIJIIJIL(1390), "multiLive is active, callback onFailed", null);
                LJJIJL(11, linkMessage);
                return;
            }
            Iterator<UBJ> it = this.LJIILL.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 = it.next().LIZIZ();
            }
            if (i2 > 1) {
                C32014ChO.LIZJ(LJJIJIIJIL(1395), "MultiHostProcessing, auto refuseInvite", null);
                LJJIJL(4, linkMessage);
                LJIIJJI("destroy_other_co_linker_when_receive_invite_msg", true);
                return;
            }
            if (LiveCohosArcConflictFixSetting.INSTANCE.isEnable()) {
                Iterator<InterfaceC76622U5i> it2 = this.LJIILJJIL.iterator();
                loop1: while (true) {
                    i = 0;
                    while (it2.hasNext()) {
                        List<U62> LLFII = it2.next().LLFII();
                        if (LLFII != null) {
                            i = LLFII.size();
                        }
                    }
                }
                if (i < 1) {
                    C32014ChO.LIZJ(LJJIJIIJIL(1399), "MultiHost not register, auto refuseInvite", null);
                    LJJIJL(21, linkMessage);
                    LJIIJJI("destroy_co_linker_when_session_not_register", true);
                    return;
                }
            }
            if (!((CopyOnWriteArrayList) LJJIIJZLJL().LIZIZ).isEmpty()) {
                C32014ChO.LIZJ(LJJIJIIJIL(1401), "is applying, auto refuse invite", null);
                LJJIJL(3, linkMessage);
                return;
            }
            LinkerInviteMessageExtra LIZIZ = linkMessage.LIZIZ();
            if (LIZIZ == null || linkMessage.inviteContent == null || LIZIZ.inviterRivalExtra == null) {
                return;
            }
            long j = 0;
            if (linkMessage.expireTimestamp > 0 && 1 != 0) {
                if (linkMessage.LIZ() < TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting.INSTANCE.getValue() * 1000) {
                    return;
                }
                U7M LJJIIZ = LJJIIZ();
                linkMessage.LIZ();
                LJJIIZ.getClass();
            } else {
                CommonMessageData commonMessageData = linkMessage.baseMessage;
                if (commonMessageData != null) {
                    j = linkMessage.timestamp - commonMessageData.createTime;
                }
                if (j >= MtCoHostReceiveInviteMessageTimeOutSetting.INSTANCE.getValue() * 1000) {
                    return;
                }
            }
            this.LJIILLIIL.LIZIZ(2);
            LinkerInviteContent linkerInviteContent5 = linkMessage.inviteContent;
            Long l4 = linkerInviteContent5.actionId;
            if (l4 != null) {
                ((HashMap) LJJIIZ().LJLILLLLZI).put(Long.valueOf(linkerInviteContent5.fromUserId), Long.valueOf(l4.longValue()));
            }
            LJJIIZ().LLLZI(linkMessage.transferExtra);
            U7M LJJIIZ2 = LJJIIZ();
            long j2 = linkMessage.channelId;
            LJJIIZ2.LJLJJL = j2;
            LJJIJLIJ(j2);
            LJJIIZ().getClass();
            LJJIIZ().getClass();
            LJJIIZ().LJLZ = linkerInviteContent5.fromLinkmicIdStr;
            this.LJIIJ = linkerInviteContent5.toLinkmicIdStr;
            LJJIIZ().LJLJJLL = linkerInviteContent5.fromUserId;
            LJJIIZ().getClass();
            LJJIIZ().getClass();
            if (LIZIZ.theme != null) {
                U7M LJJIIZ3 = LJJIIZ();
                o.LJIIIIZZ(LIZIZ.theme, "extra.theme");
                LJJIIZ3.getClass();
            }
            LJJIIZ().LJLJLLL = linkerInviteContent5.fromRoomId;
            LJJIIZ().LJLLI = this.LJI;
            int i3 = LIZIZ.inviteType;
            EnumC75615Tlz enumC75615Tlz = EnumC75615Tlz.FOLLOW_INVITE;
            if (i3 == enumC75615Tlz.getType()) {
                U7M LJJIIZ4 = LJJIIZ();
                LJJIIZ4.getClass();
                LJJIIZ4.LJLLJ = enumC75615Tlz;
            } else {
                EnumC75615Tlz enumC75615Tlz2 = EnumC75615Tlz.RECOMMEND_INVITE;
                if (i3 == enumC75615Tlz2.getType()) {
                    U7M LJJIIZ5 = LJJIIZ();
                    LJJIIZ5.getClass();
                    LJJIIZ5.LJLLJ = enumC75615Tlz2;
                } else {
                    EnumC75615Tlz enumC75615Tlz3 = EnumC75615Tlz.RANDOM_LINK_MIC_INVITE;
                    if (i3 == enumC75615Tlz3.getType()) {
                        U7M LJJIIZ6 = LJJIIZ();
                        LJJIIZ6.getClass();
                        LJJIIZ6.LJLLJ = enumC75615Tlz3;
                    } else {
                        EnumC75615Tlz enumC75615Tlz4 = EnumC75615Tlz.RANDOM_LINK_MIC_RECOMMEND;
                        if (i3 == enumC75615Tlz4.getType()) {
                            U7M LJJIIZ7 = LJJIIZ();
                            LJJIIZ7.getClass();
                            LJJIIZ7.LJLLJ = enumC75615Tlz4;
                        } else {
                            EnumC75615Tlz enumC75615Tlz5 = EnumC75615Tlz.RESERVED_INVITE;
                            if (i3 == enumC75615Tlz5.getType()) {
                                U7M LJJIIZ8 = LJJIIZ();
                                LJJIIZ8.getClass();
                                LJJIIZ8.LJLLJ = enumC75615Tlz5;
                            } else {
                                EnumC75615Tlz enumC75615Tlz6 = EnumC75615Tlz.PAIRING_INVITE;
                                if (i3 == enumC75615Tlz6.getType()) {
                                    U7M LJJIIZ9 = LJJIIZ();
                                    LJJIIZ9.getClass();
                                    LJJIIZ9.LJLLJ = enumC75615Tlz6;
                                } else {
                                    EnumC75615Tlz enumC75615Tlz7 = EnumC75615Tlz.PAIRING_ON_RESERVE_INVITE;
                                    if (i3 == enumC75615Tlz7.getType()) {
                                        U7M LJJIIZ10 = LJJIIZ();
                                        LJJIIZ10.getClass();
                                        LJJIIZ10.LJLLJ = enumC75615Tlz7;
                                    } else {
                                        EnumC75615Tlz enumC75615Tlz8 = EnumC75615Tlz.TOPIC_INVITE;
                                        if (i3 == enumC75615Tlz8.getType()) {
                                            U7M LJJIIZ11 = LJJIIZ();
                                            LJJIIZ11.getClass();
                                            LJJIIZ11.LJLLJ = enumC75615Tlz8;
                                        } else {
                                            EnumC75615Tlz enumC75615Tlz9 = EnumC75615Tlz.TOPIC_PAIR;
                                            if (i3 == enumC75615Tlz9.getType()) {
                                                U7M LJJIIZ12 = LJJIIZ();
                                                LJJIIZ12.getClass();
                                                LJJIIZ12.LJLLJ = enumC75615Tlz9;
                                            } else {
                                                EnumC75615Tlz enumC75615Tlz10 = EnumC75615Tlz.WEEKLY_RANK_INVITE;
                                                if (i3 == enumC75615Tlz10.getType()) {
                                                    U7M LJJIIZ13 = LJJIIZ();
                                                    LJJIIZ13.getClass();
                                                    LJJIIZ13.LJLLJ = enumC75615Tlz10;
                                                } else {
                                                    EnumC75615Tlz enumC75615Tlz11 = EnumC75615Tlz.HOURLY_RANK_INVITE;
                                                    if (i3 == enumC75615Tlz11.getType()) {
                                                        U7M LJJIIZ14 = LJJIIZ();
                                                        LJJIIZ14.getClass();
                                                        LJJIIZ14.LJLLJ = enumC75615Tlz11;
                                                    } else {
                                                        EnumC75615Tlz enumC75615Tlz12 = EnumC75615Tlz.WEEKLY_RISING_INVITE;
                                                        if (i3 == enumC75615Tlz12.getType()) {
                                                            U7M LJJIIZ15 = LJJIIZ();
                                                            LJJIIZ15.getClass();
                                                            LJJIIZ15.LJLLJ = enumC75615Tlz12;
                                                        } else {
                                                            EnumC75615Tlz enumC75615Tlz13 = EnumC75615Tlz.DAILY_RANK_HALL_OF_FAME_INVITE;
                                                            if (i3 == enumC75615Tlz13.getType()) {
                                                                U7M LJJIIZ16 = LJJIIZ();
                                                                LJJIIZ16.getClass();
                                                                LJJIIZ16.LJLLJ = enumC75615Tlz13;
                                                            } else {
                                                                EnumC75615Tlz enumC75615Tlz14 = EnumC75615Tlz.RANK_LEAGUE_PRELIMINARY_INVITE;
                                                                if (i3 == enumC75615Tlz14.getType()) {
                                                                    U7M LJJIIZ17 = LJJIIZ();
                                                                    LJJIIZ17.getClass();
                                                                    LJJIIZ17.LJLLJ = enumC75615Tlz14;
                                                                } else {
                                                                    EnumC75615Tlz enumC75615Tlz15 = EnumC75615Tlz.RANK_LEAGUE_SEMIFINAL_INVITE;
                                                                    if (i3 == enumC75615Tlz15.getType()) {
                                                                        U7M LJJIIZ18 = LJJIIZ();
                                                                        LJJIIZ18.getClass();
                                                                        LJJIIZ18.LJLLJ = enumC75615Tlz15;
                                                                    } else {
                                                                        EnumC75615Tlz enumC75615Tlz16 = EnumC75615Tlz.RANK_LEAGUE_FINAL_INVITE;
                                                                        if (i3 == enumC75615Tlz16.getType()) {
                                                                            U7M LJJIIZ19 = LJJIIZ();
                                                                            LJJIIZ19.getClass();
                                                                            LJJIIZ19.LJLLJ = enumC75615Tlz16;
                                                                        } else {
                                                                            EnumC75615Tlz enumC75615Tlz17 = EnumC75615Tlz.DAILY_ROOKIE_RANK;
                                                                            if (i3 == enumC75615Tlz17.getType()) {
                                                                                U7M LJJIIZ20 = LJJIIZ();
                                                                                LJJIIZ20.getClass();
                                                                                LJJIIZ20.LJLLJ = enumC75615Tlz17;
                                                                            } else {
                                                                                EnumC75615Tlz enumC75615Tlz18 = EnumC75615Tlz.RESERVATION_BUBBLE_INVITE;
                                                                                if (i3 == enumC75615Tlz18.getType()) {
                                                                                    U7M LJJIIZ21 = LJJIIZ();
                                                                                    LJJIIZ21.getClass();
                                                                                    LJJIIZ21.LJLLJ = enumC75615Tlz18;
                                                                                } else {
                                                                                    EnumC75615Tlz enumC75615Tlz19 = EnumC75615Tlz.PAIRING_BUBBLE_INVITE;
                                                                                    if (i3 == enumC75615Tlz19.getType()) {
                                                                                        U7M LJJIIZ22 = LJJIIZ();
                                                                                        LJJIIZ22.getClass();
                                                                                        LJJIIZ22.LJLLJ = enumC75615Tlz19;
                                                                                    } else {
                                                                                        EnumC75615Tlz enumC75615Tlz20 = EnumC75615Tlz.MAY_KNOW_INVITE;
                                                                                        if (i3 == enumC75615Tlz20.getType()) {
                                                                                            U7M LJJIIZ23 = LJJIIZ();
                                                                                            LJJIIZ23.getClass();
                                                                                            LJJIIZ23.LJLLJ = enumC75615Tlz20;
                                                                                        } else {
                                                                                            EnumC75615Tlz enumC75615Tlz21 = EnumC75615Tlz.NONE;
                                                                                            if (i3 == enumC75615Tlz21.getType()) {
                                                                                                U7M LJJIIZ24 = LJJIIZ();
                                                                                                LJJIIZ24.getClass();
                                                                                                LJJIIZ24.LJLLJ = enumC75615Tlz21;
                                                                                            } else {
                                                                                                LJJIIZ().LLLLZLLLI(EnumC75615Tlz.ACTIVITY);
                                                                                                LJJIIZ().LJLLJ.setType(LIZIZ.inviteType);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            LJJIIZ().getClass();
            LJJIIZ().LJLJLJ = linkerInviteContent5.secFromUserId;
            if (!TextUtils.isEmpty(linkerInviteContent5.toRtcExtInfo)) {
                U7M LJJIIZ25 = LJJIIZ();
                String str5 = linkerInviteContent5.toRtcExtInfo;
                o.LJIIIIZZ(str5, "inviteContent.toRtcExtInfo");
                String LJJJIL = LJJJIL(str5);
                if (LJJJIL == null) {
                    LJJJIL = linkerInviteContent5.toRtcExtInfo;
                }
                LJJIIZ25.LLLZ(LJJJIL);
                if (MultiCoHostQuickRecommendPreJoinFixSetting.INSTANCE.isEnable()) {
                    if (!MultiCoHostForbidPreJoinChannelSetting.getValue().contains(Integer.valueOf(LIZIZ.inviteType))) {
                        Iterator<InterfaceC76622U5i> it3 = this.LJIILJJIL.iterator();
                        boolean z = false;
                        while (it3.hasNext()) {
                            z = it3.next().LLFFF();
                        }
                        LJJI = LJJI("handleInviteMessage", z);
                    } else {
                        LJJI = false;
                    }
                } else {
                    Iterator<InterfaceC76622U5i> it4 = this.LJIILJJIL.iterator();
                    boolean z2 = false;
                    while (it4.hasNext()) {
                        z2 = it4.next().LLFFF();
                    }
                    LJJI = LJJI("handleInviteMessage", z2);
                }
                U4R.LIZLLL("CoLinker", "linkListenerList size:" + this.LJIILJJIL.size() + ", canPreJoinChannel:" + LJJI + ", rtcJoinChannel:" + linkerInviteContent5.rtcJoinChannel);
                if (LJJI && linkerInviteContent5.rtcJoinChannel && MultiHostPreJoinChannelSetting.INSTANCE.getValue().receiveInviteEnable) {
                    U7U.LJIIZILJ(LJJIIZI(), this, LJJIIZ().LJLLL, false, false, true, true, "business_multi_host_handle_invite_msg", null, 132);
                    LJJIIZ().LJLLLL = true;
                } else {
                    LJJIIZ().LJLLLL = false;
                }
            }
            LJJIIZ().getClass();
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setRoomId(Long.valueOf(linkerInviteContent5.fromRoomId));
            builder.setUserId(Long.valueOf(linkerInviteContent5.fromUserId));
            builder.setChannelId(Long.valueOf(this.LJIIIZ));
            builder.setLinkMicId(linkerInviteContent5.fromLinkmicIdStr);
            LinkUser build = builder.build();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("handleInviteMessage inviter userId:");
            LIZ2.append(linkerInviteContent5.fromUserId);
            LIZ2.append(", inviter linkMicId:");
            LIZ2.append(linkerInviteContent5.fromLinkmicIdStr);
            U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ2));
            C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, build, message, 29));
        }
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIJ(CR6 message) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        LinkmicInfo linkmicInfo;
        String str11;
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleReplyInviteMessage:");
        LIZ.append(message);
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ));
        if (message instanceof LinkMessage) {
            LinkMessage linkMessage = (LinkMessage) message;
            LJJIIZ().LLLZI(linkMessage.transferExtra);
            LinkerReplyContent linkerReplyContent = linkMessage.replyContent;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get reply invite message, replyStatus:");
            LIZ2.append(linkerReplyContent.replyStatus);
            LIZ2.append(", replyContent=");
            LIZ2.append(linkerReplyContent);
            U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ2));
            LinkmicInfo linkmicInfo2 = linkerReplyContent.inviteeLinkmicInfo;
            String str12 = null;
            if (linkmicInfo2 != null) {
                str = linkmicInfo2.linkmicIdStr;
            } else {
                str = null;
            }
            String str13 = "";
            if (str == null) {
                str = "";
            }
            if (LJJIIZ().LLLLZIL(str)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("handleReplyInviteMessage, has receive rtc_msg, message=");
                LIZ3.append(message);
                LIZ3.append(", replyContent=");
                LIZ3.append(linkerReplyContent);
                U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ3));
                return;
            }
            if (linkerReplyContent.replyStatus == 1) {
                LJJIIZ().LJLJI.put(str, Boolean.TRUE);
            }
            UA9.LJJIJLIJ(this, String.valueOf(Long.valueOf(linkerReplyContent.inviteeUid)), linkerReplyContent.replyStatus, linkMessage.getMessageId());
            if (linkerReplyContent.replyStatus == 1 && (str10 = this.LJIIJ) != null && (linkmicInfo = linkerReplyContent.inviteeLinkmicInfo) != null && (str11 = linkmicInfo.linkmicIdStr) != null) {
                this.LJIJ.LIZIZ(U85.INVITER, str10, str11, null);
            }
            String valueOf = String.valueOf(linkMessage.getMessageId());
            String valueOf2 = String.valueOf(linkMessage.scene);
            String valueOf3 = String.valueOf(linkMessage.messageType);
            LinkmicInfo linkmicInfo3 = linkerReplyContent.inviteeLinkmicInfo;
            if (linkmicInfo3 != null) {
                str12 = linkmicInfo3.linkmicIdStr;
            }
            String valueOf4 = String.valueOf(str12);
            String valueOf5 = String.valueOf(Long.valueOf(linkerReplyContent.inviteeUid));
            if (linkerReplyContent.replyStatus == 1) {
                str2 = "agree";
            } else {
                str2 = "reject";
            }
            U7W.LJIILIIL("reply_invite_message", this, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, new OSZ("reply_status", str2));
            OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
            LinkerMicIdxUpdateInfo linkerMicIdxUpdateInfo = linkerReplyContent.inviteeMicIdxUpdateInfo;
            if (linkerMicIdxUpdateInfo != null) {
                i = (int) linkerMicIdxUpdateInfo.micIndex;
            } else {
                i = 0;
            }
            builder.setMicPositionData(new MicPositionInfo(0, i, 0, 0L, 12, null));
            OnLineMicInfo build = builder.build();
            LinkUser.Builder builder2 = new LinkUser.Builder();
            builder2.setUserId(Long.valueOf(linkerReplyContent.inviteeUid));
            builder2.setChannelId(Long.valueOf(linkMessage.channelId));
            LinkmicInfo linkmicInfo4 = linkerReplyContent.inviteeLinkmicInfo;
            if (linkmicInfo4 != null) {
                str3 = linkmicInfo4.linkmicIdStr;
            } else {
                str3 = null;
            }
            builder2.setLinkMicId(str3);
            builder2.setMicPositionData(build);
            builder2.setExtra(linkerReplyContent.inviteeUser);
            LinkUser build2 = builder2.build();
            U7M LJJIIZ = LJJIIZ();
            long j = linkMessage.channelId;
            LJJIIZ.LJLJJL = j;
            LJJIJLIJ(j);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("handleReplyInviteMessage, publicInvitee=");
            LIZ4.append(build2);
            U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ4));
            if (linkerReplyContent.replyStatus == 1) {
                LinkmicInfo linkmicInfo5 = linkerReplyContent.inviteeLinkmicInfo;
                if (linkmicInfo5 != null && (str9 = linkmicInfo5.linkmicIdStr) != null) {
                    LJJIZ(str9, U9X.KICKOUT);
                }
                LinkmicInfo linkmicInfo6 = linkerReplyContent.inviterLinkmicInfo;
                if (linkmicInfo6 != null) {
                    str4 = linkmicInfo6.linkmicIdStr;
                } else {
                    str4 = null;
                }
                this.LJIIJ = str4;
                LJJIIZ().getClass();
                U7M LJJIIZ2 = LJJIIZ();
                LinkmicInfo linkmicInfo7 = linkerReplyContent.inviteeLinkmicInfo;
                if (linkmicInfo7 != null) {
                    str5 = linkmicInfo7.linkmicIdStr;
                } else {
                    str5 = null;
                }
                LJJIIZ2.LJLZ = str5;
                TYR tyr = TS8.LIZ;
                long j2 = linkerReplyContent.inviteeUid;
                if (linkmicInfo7 != null) {
                    str6 = linkmicInfo7.linkmicIdStr;
                } else {
                    str6 = null;
                }
                tyr.LJ(j2, str6);
                LinkmicInfo linkmicInfo8 = linkerReplyContent.inviterLinkmicInfo;
                if (linkmicInfo8 != null) {
                    str7 = linkmicInfo8.rtcExtInfo;
                } else {
                    str7 = null;
                }
                if (!TextUtils.isEmpty(str7)) {
                    U7M LJJIIZ3 = LJJIIZ();
                    LinkmicInfo linkmicInfo9 = linkerReplyContent.inviterLinkmicInfo;
                    if (linkmicInfo9 != null && (str8 = linkmicInfo9.rtcExtInfo) != null) {
                        str13 = str8;
                    }
                    String LJJJIL = LJJJIL(str13);
                    if (LJJJIL == null) {
                        LinkmicInfo linkmicInfo10 = linkerReplyContent.inviterLinkmicInfo;
                        if (linkmicInfo10 != null) {
                            LJJJIL = linkmicInfo10.rtcExtInfo;
                        } else {
                            LJJJIL = null;
                        }
                    }
                    LJJIIZ3.LLLZ(LJJJIL);
                }
                if (linkerReplyContent.sourceType == EnumC75617Tm1.RANDOM_LINK_MIC_RECOMMEND.getType()) {
                    LJJIIZ().LL = false;
                    this.LJIILLIIL.LIZIZ(2);
                }
                if (linkerReplyContent.sourceType == EnumC75617Tm1.TOPIC_PAIR.getType() || linkerReplyContent.sourceType == EnumC75617Tm1.TOPIC_INVITE.getType()) {
                    this.LJIILLIIL.LIZIZ(2);
                }
                U7H LJJIIJZLJL = LJJIIJZLJL();
                LinkUser.Builder builder3 = new LinkUser.Builder();
                builder3.setRoomId(Long.valueOf(this.LJI));
                builder3.setUserId(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                builder3.setLinkMicId(this.LJIIJ);
                builder3.setChannelId(Long.valueOf(this.LJIIIZ));
                OnLineMicInfo.Builder builder4 = new OnLineMicInfo.Builder();
                builder4.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
                builder3.setMicPositionData(builder4.build());
                LJJIIJZLJL.LJJJLZIJ(builder3.build());
                LJJIIJZLJL().LJJLIIIJILLIZJL(this, build2);
            } else {
                LJJIIJZLJL().LJJLIIIJL(build2);
                Long userId = build2.getUserId();
                if (userId != null) {
                    long longValue = userId.longValue();
                    LJJIIJ(longValue);
                    Iterator<U6Y> it = this.LJIIZILJ.iterator();
                    while (it.hasNext()) {
                        it.next().LJJJLIIL(longValue);
                    }
                }
            }
            C15610jN.LIZIZ(new ARunnableS16S0400000_13(build2, this, linkerReplyContent, message, 10));
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIJI(CR6 message) {
        Long l;
        o.LJIIIZ(message, "message");
        if (message instanceof LinkMessage) {
            U4R.LIZLLL("CoLinker", "handleCancelInviteMessage");
            LinkMessage linkMessage = (LinkMessage) message;
            LinkerCancelContent linkerCancelContent = linkMessage.cancelContent;
            Long l2 = null;
            if (linkerCancelContent != null) {
                l = Long.valueOf(linkerCancelContent.inviterUid);
            } else {
                l = null;
            }
            UC0.LJJLIIIIJ(new ARunnableS8S1100100_13(linkMessage.getMessageId(), this, String.valueOf(l), 0));
            U7W u7w = this.LJIJ;
            String valueOf = String.valueOf(linkMessage.getMessageId());
            String valueOf2 = String.valueOf(linkMessage.scene);
            String valueOf3 = String.valueOf(linkMessage.messageType);
            LinkerCancelContent linkerCancelContent2 = linkMessage.cancelContent;
            if (linkerCancelContent2 != null) {
                l2 = Long.valueOf(linkerCancelContent2.inviterUid);
            }
            U7W.LJIILIIL("cancel_invite_message", this, valueOf, valueOf2, valueOf3, "", String.valueOf(l2), null);
            if (!TextUtils.isEmpty(linkMessage.transferExtra)) {
                LJJIIZ().LLLZI(linkMessage.transferExtra);
            }
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setRoomId(0L);
            builder.setUserId(Long.valueOf(linkMessage.cancelContent.inviterUid));
            C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, builder.build(), message, 32));
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIJJ(CR6 message) {
        o.LJIIIZ(message, "message");
        if (message instanceof LinkMessage) {
            U4R.LIZLLL("CoLinker", "handleCancelApplyMessage");
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setRoomId(0L);
            LinkMessage linkMessage = (LinkMessage) message;
            builder.setUserId(Long.valueOf(linkMessage.cancelContent.inviterUid));
            LinkUser build = builder.build();
            LJJIIJZLJL().LJJLIIIJJI(build);
            UC0.LJJLIIIIJ(new ARunnableS8S1100100_13(linkMessage.getMessageId(), this, String.valueOf(build.getUserId()), 3));
            U7W u7w = this.LJIJ;
            U7W.LJIILIIL("cancel_apply_message", this, String.valueOf(linkMessage.getMessageId()), String.valueOf(linkMessage.scene), String.valueOf(linkMessage.messageType), "", String.valueOf(build.getUserId()), null);
            C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, build, message, 31));
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIJJLI(LinkMessage message) {
        String str;
        String linkMicId;
        long j;
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleCoHostLeaveMessage msg:");
        LIZ.append(message);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setUserId(Long.valueOf(message.leaveContent.userId));
        builder.setLinkMicId(message.leaveContent.linkmic_id_str);
        LinkUser build = builder.build();
        UC0.LJJLIIIIJ(new RunnableC76750UAg(0L, message.getMessageId(), this, String.valueOf(build.getUserId())));
        String valueOf = String.valueOf(message.getMessageId());
        String valueOf2 = String.valueOf(message.scene);
        String valueOf3 = String.valueOf(message.messageType);
        String valueOf4 = String.valueOf(build.getUserId());
        LinkerLeaveContent linkerLeaveContent = message.leaveContent;
        if (linkerLeaveContent == null || (str = Long.valueOf(linkerLeaveContent.leaveReason).toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        U7W.LJIILIIL("leave_message", this, valueOf, valueOf2, valueOf3, "", valueOf4, new OSZ("leave_reason", str));
        if (this.LJIIIIZZ) {
            if (message.leaveContent.userId == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                LinkerLeaveContent linkerLeaveContent2 = message.leaveContent;
                if (linkerLeaveContent2 != null) {
                    LinkUser LJIJI = LJJIIJZLJL().LJIJI(linkerLeaveContent2.sendLeaveUid);
                    if (LJIJI != null && (linkMicId = LJIJI.getLinkMicId()) != null) {
                        U7W u7w = this.LJIJ;
                        LinkerLeaveContent linkerLeaveContent3 = message.leaveContent;
                        if (linkerLeaveContent3 != null) {
                            j = linkerLeaveContent3.leaveReason;
                        } else {
                            j = -1;
                        }
                        u7w.LJIIJ(linkMicId, this, false, -1L, j, "");
                    }
                }
                AbnormalDisconnectReason.Builder builder2 = new AbnormalDisconnectReason.Builder();
                builder2.setDisconnectFromUid(message.leaveContent.sendLeaveUid);
                builder2.setDissconnectReason((int) message.leaveContent.leaveReason);
                LJJIJIL(2, builder2.build());
                this.LJIILLIIL.LIZIZ(6);
            }
            Iterator<InterfaceC76622U5i> it = this.LJIILJJIL.iterator();
            while (it.hasNext()) {
                it.next().LJIJJ(this, new LeaveMessage(build, new CustomLinkMessage(message.scene, null, new ExtraDataWrapper(null, message.leaveContent, message.expireTimestamp, message))));
            }
            return;
        }
        if (message.leaveContent.userId == this.LJII) {
            C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, build, message, 34));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
    
        r2 = LJJIJIIJIL(1724);
        r1 = X.X1D.LIZ();
        r1.append("applyHostList not found linkMicId:");
        r1.append(r5);
        r1.append(", no need to join channel");
        X.C32014ChO.LIZJ(r2, X.X1D.LIZIZ(r1), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0135, code lost:
    
        return;
     */
    @Override // X.InterfaceC76681U7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.CR6 r31) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7F.LJIL(X.CR6):void");
    }

    public final void LJJIIJ(long j) {
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((LinkedHashMap) this.LJIILIIL).get(Long.valueOf(j));
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJIILIIL.remove(Long.valueOf(j));
    }

    public final void LJJIJLIJ(long j) {
        this.LJIIIZ = j;
        Iterator<InterfaceC76622U5i> it = this.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJLLL(this.LJIIIZ);
        }
    }

    public final void LJJJ(String str) {
        UC7.LJ("stop noFirstFrameRenderTimeoutCountdown linkMicId:", str, "CoLinker");
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((LinkedHashMap) this.LJIL).get(str);
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJIL.remove(str);
    }

    public final String LJJJIL(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            new com.google.gson.o();
            m LJIIZILJ = com.google.gson.o.LIZ(str).LJIIZILJ();
            LJIIZILJ.LJJIIZ("rtc_business_id", "link_cross_grid_2");
            str2 = String.valueOf(LJIIZILJ);
            return str2;
        } catch (Exception e) {
            String LJJIJIIJIL = LJJIJIIJIL(2548);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("translateBusinessId e = ");
            LIZ.append(e);
            C32014ChO.LIZJ(LJJIJIIJIL, X1D.LIZIZ(LIZ), str2);
            return str2;
        }
    }

    @Override // X.U6D, X.U66
    public final void LLLLL(U6Y listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIZILJ.remove(listener);
    }

    @Override // X.U66
    public final void LLLLLIL(N39 sessionBusinessConfig) {
        o.LJIIIZ(sessionBusinessConfig, "sessionBusinessConfig");
        this.LJJII = sessionBusinessConfig.LIZ;
    }

    @Override // X.U66
    public final void LLLLLZ(InterfaceC76622U5i listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIILJJIL.add(listener);
    }

    @Override // X.U66
    public final void LLLZZIL(U6Y listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIZILJ.add(listener);
    }

    @Override // X.U66
    public final void LLZLLLL(Boolean bool) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateUserList:roomId:");
        LIZ.append(this.LJI);
        LIZ.append(", channelId:");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", isResume:");
        LIZ.append(bool);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        if (this.LJI == 0 && this.LJIIIZ == 0) {
            return;
        }
        this.LJIIJJI.LIZ(((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateUserList(this.LJI, this.LJIIIZ).LJIJI(U9B.LJLIL).LJFF(new C62705OjF()).LJIIJJI(new U7O(this, bool)).LJJII(C76742U9y.LJLIL, C76743U9z.LJLIL));
    }

    @Override // X.U66
    public final void g(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setChannelId:");
        LIZ.append(str);
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ));
        if (str != null) {
            LJJIJLIJ(CastLongProtector.parseLong(str));
        }
        if (!this.LJIIIIZZ) {
            LLZLLLL(Boolean.FALSE);
        }
    }

    @Override // X.U66
    public final C73643SvH getRtcAbInfo(MGetABInfosReq mGetABInfosReq) {
        return ((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).getRtcAbInfo(mGetABInfosReq).LJIILIIL(new AfS65S0100000_13(this, 184));
    }

    public U7F(int i, Room room) {
        long j;
        boolean z;
        this.LJ = room;
        this.LJFF = i;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJI = j;
        this.LJII = room != null ? room.getOwnerUserId() : 0L;
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        this.LJIIJJI = new C73318Sq2();
        this.LJIIL = new C73318Sq2();
        this.LJIILIIL = new LinkedHashMap();
        this.LJIILJJIL = new CopyOnWriteArrayList<>();
        this.LJIILL = new CopyOnWriteArrayList<>();
        C76683U7r c76683U7r = new C76683U7r();
        this.LJIILLIIL = c76683U7r;
        this.LJIIZILJ = new CopyOnWriteArrayList<>();
        this.LJIJ = new U7W();
        this.LJIJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 457));
        this.LJIJJ = C221108m2.LIZIZ(UBI.LJLIL);
        this.LJIJJLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 455));
        this.LJIL = new LinkedHashMap();
        this.LJJ = new LinkedHashMap();
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 454));
        this.LJJIFFI = LIZIZ;
        this.LJJII = 20L;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, cohost:");
        LIZ.append(this);
        LIZ.append(", mIsAnchor:");
        LIZ.append(z);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        c76683U7r.LIZIZ = new AqS179S0100000_13(this, 510);
        c76683U7r.LIZIZ(0);
        LJJIIZI().LIZJ(this, room);
        LJJIIZI().LJJJJIZL((U7G) LIZIZ.getValue());
    }

    @Override // X.InterfaceC76681U7p
    public final void LJIIJJI(String source, boolean z) {
        ILiveStream iLiveStream;
        Boolean bool;
        C73411SrX c73411SrX;
        LiveCore liveCore;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        o.LJIIIZ(source, "source");
        if (this.LJJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("linker is already destroy, this:");
            LIZ.append(this);
            LIZ.append(", source:");
            LIZ.append(source);
            U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
            return;
        }
        this.LJJI = true;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("destroy this:");
        LIZ2.append(this);
        LIZ2.append(", source:");
        LIZ2.append(source);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ2));
        if (this.LJIIIIZZ) {
            U4R.LIZLLL("CoLinker", "try multiCancel");
            JSONArray jSONArray = new JSONArray();
            try {
                Iterator<LinkUser> it = LJJIIJZLJL().LIZJ.iterator();
                while (true) {
                    long j6 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    LinkUser next = it.next();
                    JSONObject jSONObject = new JSONObject();
                    Long roomId = next.getRoomId();
                    if (roomId != null) {
                        j4 = roomId.longValue();
                    } else {
                        j4 = 0;
                    }
                    jSONObject.put("room_id", j4);
                    Long userId = next.getUserId();
                    if (userId != null) {
                        j5 = userId.longValue();
                    } else {
                        j5 = 0;
                    }
                    jSONObject.put("user_id", j5);
                    jSONObject.put("play_type", EnumC75767ToR.PLAYTYPE_INVITE.value);
                    Long channelId = next.getChannelId();
                    if (channelId != null) {
                        j6 = channelId.longValue();
                    }
                    jSONObject.put("channel_id", j6);
                    jSONArray.put(jSONObject);
                }
                Iterator it2 = ((CopyOnWriteArrayList) LJJIIJZLJL().LIZIZ).iterator();
                while (it2.hasNext()) {
                    LinkUser linkUser = (LinkUser) it2.next();
                    JSONObject jSONObject2 = new JSONObject();
                    Long roomId2 = linkUser.getRoomId();
                    if (roomId2 != null) {
                        j = roomId2.longValue();
                    } else {
                        j = 0;
                    }
                    jSONObject2.put("room_id", j);
                    Long userId2 = linkUser.getUserId();
                    if (userId2 != null) {
                        j2 = userId2.longValue();
                    } else {
                        j2 = 0;
                    }
                    jSONObject2.put("user_id", j2);
                    jSONObject2.put("play_type", EnumC75767ToR.PLAYTYPE_APPLY.value);
                    Long channelId2 = linkUser.getChannelId();
                    if (channelId2 != null) {
                        j3 = channelId2.longValue();
                    } else {
                        j3 = 0;
                    }
                    jSONObject2.put("channel_id", j3);
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() > 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("multiCancel cancelUsers:");
                    LIZ3.append(jSONArray);
                    U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ3));
                    long LIZIZ = C31012CFc.LIZIZ();
                    List<LinkUser> list = LJJIIJZLJL().LIZJ;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator<LinkUser> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().getUserId());
                    }
                    List<LinkUser> list2 = LJJIIJZLJL().LIZIZ;
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                    Iterator it4 = ((CopyOnWriteArrayList) list2).iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((LinkUser) it4.next()).getUserId());
                    }
                    UA9.LJFF().LIZIZ(new ARunnableS0S0400200_13(arrayList, arrayList2, this, UC0.LJIJI(this), C31012CFc.LIZIZ(), System.currentTimeMillis(), 0));
                    C65814PsI.LIZ().getClass();
                    CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
                    long j7 = this.LJI;
                    String jSONArray2 = jSONArray.toString();
                    o.LJIIIIZZ(jSONArray2, "cancelUsers.toString()");
                    this.LJIIL.LIZ(coHostApi.multiCancel(j7, jSONArray2, "").LJIILIIL(new AfS8S0100100_13(LIZIZ, this, 22)).LJIIJ(new AfS8S0100100_13(LIZIZ, this, 23)).LJIJI(C78929UyL.LJLJL).LJFF(new C62705OjF()).LJIIJJI(new U82(this)).LJJII(new AfS62S0200000_13(this, 56), new AfS62S0200000_13(this, 55)));
                }
            } catch (JSONException e) {
                String LJJIJIIJIL = LJJIJIIJIL(1158);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("JSONException ");
                LIZ4.append(e);
                C32014ChO.LIZJ(LJJIJIIJIL, X1D.LIZIZ(LIZ4), null);
            }
        }
        for (LinkUser linkUser2 : LJJIIJZLJL().LIZJ) {
            Iterator<U6Y> it5 = this.LJIIZILJ.iterator();
            while (it5.hasNext()) {
                U6Y next2 = it5.next();
                Long userId3 = linkUser2.getUserId();
                if (userId3 != null) {
                    next2.LJJJLIIL(userId3.longValue());
                }
            }
        }
        Iterator it6 = ((CopyOnWriteArrayList) LJJIIJZLJL().LIZIZ).iterator();
        while (it6.hasNext()) {
            LinkUser linkUser3 = (LinkUser) it6.next();
            Iterator<U6Y> it7 = this.LJIIZILJ.iterator();
            while (it7.hasNext()) {
                U6Y next3 = it7.next();
                Long userId4 = linkUser3.getUserId();
                if (userId4 != null) {
                    next3.LJJJJI(userId4.longValue());
                }
            }
        }
        Iterator<UBJ> it8 = this.LJIILL.iterator();
        while (it8.hasNext()) {
            UBJ next4 = it8.next();
            if (next4 == null) {
                U4R.LIZLLL("CoLinker", "listener is null");
            } else {
                next4.LIZ(this);
            }
        }
        U7U LJJIIZI = LJJIIZI();
        UB9 ub9 = LJJIIZI.LJIJ;
        if (ub9 != null) {
            iLiveStream = ub9.getLiveCore();
        } else {
            iLiveStream = null;
        }
        if ((iLiveStream instanceof LiveCore) && (liveCore = (LiveCore) iLiveStream) != null) {
            LJJIIZI.LJJJJLI(liveCore);
        }
        LJJIIZI().LJJJJJL((U7G) this.LJJIFFI.getValue());
        LJJIIZI().LJI(source);
        U7H LJJIIJZLJL = LJJIIJZLJL();
        LJJIIJZLJL.getClass();
        C73411SrX c73411SrX2 = LJJIIJZLJL.LJIIJJI;
        if (c73411SrX2 != null) {
            bool = Boolean.valueOf(c73411SrX2.isDisposed());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool) && (c73411SrX = LJJIIJZLJL.LJIIJJI) != null) {
            c73411SrX.dispose();
        }
        LJJIIJZLJL.LIZLLL.clear();
        LJJIIJZLJL.LJ.clear();
        LJJIIJZLJL.LJFF.clear();
        LJJIIJZLJL.LIZ.clear();
        ((CopyOnWriteArrayList) LJJIIJZLJL.LIZIZ).clear();
        LJJIIJZLJL.LIZJ.clear();
        ((ArrayList) LJJIIJZLJL.LJIIIIZZ).clear();
        ((ArrayList) LJJIIJZLJL.LJIIIZ).clear();
        U7U LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 instanceof U7U) {
            LJJIIZI2.LJJJJJL(LJJIIJZLJL);
        }
        this.LJIILL.clear();
        U4R.LIZLLL("CoLinker", "subscriptions.clear");
        this.LJIIJJI.LIZLLL();
        this.LJIILLIIL.LIZIZ(0);
        this.LJIILLIIL.LIZIZ = null;
        LJJIIZ().LLLLZLLIL("destroy");
        this.LJIJ.LIZJ();
    }

    public final boolean LJJI(String str, boolean z) {
        C75745To5 invoke;
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(U44.LINKER.getValue());
        LIZ.append("_CoLinker_preJoin");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!z) {
            if (MultiHostPreJoinFixChannelSetting.INSTANCE.isEnable()) {
                InterfaceC65784Pro<C75745To5> interfaceC65784Pro = this.LIZIZ;
                if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
                    boolean booleanValue = invoke.LJIIIIZZ.invoke().booleanValue();
                    if (booleanValue) {
                        bool = Boolean.valueOf(booleanValue);
                    } else {
                        InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = invoke.LJIIIZ;
                        if (interfaceC65784Pro2 != null) {
                            bool = interfaceC65784Pro2.invoke();
                        } else {
                            bool = null;
                        }
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("canPreJoinChannel correct, ");
                    LIZ2.append(bool);
                    LIZ2.append(" ,source: ");
                    LIZ2.append(str);
                    C32014ChO.LIZJ(LIZIZ, X1D.LIZIZ(LIZ2), null);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("canPreJoinChannel error, source: ");
                LIZ3.append(str);
                C32014ChO.LIZJ(LIZIZ, X1D.LIZIZ(LIZ3), null);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("canPreJoinChannel final: ");
            LIZ4.append(z);
            LIZ4.append(", source: ");
            LIZ4.append(str);
            C32014ChO.LIZ(LIZIZ, X1D.LIZIZ(LIZ4));
        }
        return z;
    }

    public final void LJJIJIL(int i, AbnormalDisconnectReason abnormalDisconnectReason) {
        String disconnectFromLinkMicId;
        Long userId;
        if (abnormalDisconnectReason != null) {
            long j = 0;
            if (abnormalDisconnectReason.getDisconnectFromUid() == 0 && (disconnectFromLinkMicId = abnormalDisconnectReason.getDisconnectFromLinkMicId()) != null && !ujb.o.LJJJJJL(disconnectFromLinkMicId)) {
                U7H LJJIIJZLJL = LJJIIJZLJL();
                String disconnectFromLinkMicId2 = abnormalDisconnectReason.getDisconnectFromLinkMicId();
                if (disconnectFromLinkMicId2 != null) {
                    LinkUser LJI = LJJIIJZLJL.LJI(disconnectFromLinkMicId2);
                    if (LJI != null && (userId = LJI.getUserId()) != null) {
                        j = userId.longValue();
                    }
                    AbnormalDisconnectReason.copy$default(abnormalDisconnectReason, j, null, null, 0, null, 30, null);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        C15610jN.LIZIZ(new ARunnableS16S0201000_13(i, this, abnormalDisconnectReason, 6));
    }

    public final void LJJIJL(int i, LinkMessage linkMessage) {
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", Long.valueOf(linkMessage.channelId));
        hashMap.put("guest_user_id", Long.valueOf(linkMessage.inviteContent.fromUserId));
        hashMap.put("reply_status", Integer.valueOf(i));
        String str = linkMessage.transferExtra;
        o.LJIIIIZZ(str, "linkMessage.transferExtra");
        hashMap.put("transparent_extra", str);
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(this.LJI);
        builder.setUserId(linkMessage.inviteContent.fromUserId);
        ReplyInviteData.Builder builder2 = new ReplyInviteData.Builder(builder.build());
        builder2.setReplyStatus(i);
        builder2.setCoHostData(hashMap);
        ReplyInviteData build = builder2.build();
        C15610jN.LIZIZ(new ARunnableS24S0300000_13(this, linkMessage, build, 28));
        C15610jN.LIZIZ(new ARunnableS13S0301000_13(this, linkMessage, build, i, 5));
        LLLLZI(build, new U89(this, linkMessage, build, i, SystemClock.uptimeMillis()));
    }

    public final void LJJIZ(String str, U9X u9x) {
        long value;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            value = this.LJJII;
        } else {
            value = LivePkConnectTimeoutIntervalSetting.INSTANCE.getValue();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start noFirstFrameRenderTimeoutCountdown time:");
        LIZ.append(value);
        LIZ.append(", linkMicId:");
        LIZ.append(str);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        InterfaceC92693kP LJJJLIIL = C265112h.LIZ(TMC.LJJI(value, TimeUnit.SECONDS)).LJJJLIIL(new AfS22S1200000_13((Object) this, (AbstractC74705TTp) u9x, (InterfaceC88472Yns<? super InterfaceC60987Nwd<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe>) str, (String) 7), new AfS26S1100000_13(this, str, 12));
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((LinkedHashMap) this.LJIL).get(str);
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJIL.put(str, LJJJLIIL);
        this.LJIIJJI.LIZ(LJJJLIIL);
    }

    @Override // X.U66
    public final void LLLLLLZ(C76113Tu1 resumeParam, U6A u6a) {
        String str;
        o.LJIIIZ(resumeParam, "resumeParam");
        List<CohostListUser> list = resumeParam.LJLJI;
        LJJIJLIJ(resumeParam.LJLILLLLZI);
        LJJIIZ().LJLJJL = this.LJIIIZ;
        Iterator<CohostListUser> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            CohostListUser cohostListUser = null;
            if (it.hasNext()) {
                CohostListUser next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    CohostListUser cohostListUser2 = next;
                    Long l = cohostListUser2.userId;
                    long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                    if (l != null && l.longValue() == currentUserId) {
                        LJJIIZ().getClass();
                        this.LJIIJ = cohostListUser2.linkmicIdStr;
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                U7H LJJIIJZLJL = LJJIIJZLJL();
                LinkUser.Builder builder = new LinkUser.Builder();
                builder.setRoomId(Long.valueOf(this.LJI));
                builder.setUserId(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                builder.setLinkMicId(this.LJIIJ);
                builder.setChannelId(Long.valueOf(this.LJIIIZ));
                OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                builder2.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
                builder.setMicPositionData(builder2.build());
                LJJIIJZLJL.LJJJLZIJ(builder.build());
                if (i != 0) {
                    ListProtector.add(list, 0, ListProtector.remove(list, i));
                }
                LJJIIJZLJL().LJJLIIIJLJLI(this.LJIIIZ, list, null);
                U7H LJJIIJZLJL2 = LJJIIJZLJL();
                LJJIIJZLJL2.getClass();
                U4R.LIZLLL("CoManager", "updateAllFloatPositionMapByResume");
                ArrayList arrayList = new ArrayList();
                for (CohostListUser cohostListUser3 : list) {
                    if (cohostListUser3.linkmicUserStatus == 1 && (str = cohostListUser3.linkmicIdStr) != null) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.remove(LJJIIJZLJL2.LJIIJ)) {
                    ListProtector.add(arrayList, 0, LJJIIJZLJL2.LJIIJ);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("tempFloatList size:");
                LIZ.append(arrayList.size());
                U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ));
                if (!U7V.LIZ(LJJIIJZLJL2.LJII, arrayList)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("update floatPositionArray, pre size:");
                    LIZ2.append(LJJIIJZLJL2.LJII.size());
                    LIZ2.append(", after size:");
                    LIZ2.append(arrayList.size());
                    U4R.LIZLLL("CoManager", X1D.LIZIZ(LIZ2));
                    LJJIIJZLJL2.LJII = arrayList;
                    LJJIIJZLJL2.LJJL();
                } else {
                    LJJIIJZLJL2.LJIIZILJ();
                }
                for (CohostListUser cohostListUser4 : list) {
                    Long l2 = cohostListUser4.userId;
                    long currentUserId2 = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                    if (l2 == null || l2.longValue() != currentUserId2) {
                        cohostListUser = cohostListUser4;
                        break;
                    }
                }
                CohostListUser cohostListUser5 = cohostListUser;
                if (cohostListUser5 != null) {
                    String str2 = cohostListUser5.linkmicIdStr;
                    o.LJIIIIZZ(str2, "it.linkmicIdStr");
                    LJJIZ(str2, U9X.LEAVE);
                }
                if (!TextUtils.isEmpty(resumeParam.LJLIL)) {
                    U7M LJJIIZ = LJJIIZ();
                    String LJJJIL = LJJJIL(resumeParam.LJLIL);
                    if (LJJJIL == null) {
                        LJJJIL = resumeParam.LJLIL;
                    }
                    LJJIIZ.LLLZ(LJJJIL);
                    this.LJIILLIIL.LIZIZ(2);
                    U7U.LJIIZILJ(LJJIIZI(), this, LJJIIZ().LJLLL, false, false, false, false, "business_multi_host_resume", new AqS179S0100000_13(u6a, 511), 60);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.U66
    public final void LLLLZ(CancelInviteData data, InterfaceC76768UAy<CancelInviteResult> interfaceC76768UAy) {
        o.LJIIIZ(data, "data");
        LJJII(data.getInvitee().getRoomId(), data.getInvitee().getUserId(), interfaceC76768UAy);
    }

    @Override // X.U66
    public final void LLLLZI(ReplyInviteData data, InterfaceC76768UAy<ReplyResult> interfaceC76768UAy) {
        Object obj;
        long j;
        String str;
        long j2;
        Long l;
        o.LJIIIZ(data, "data");
        int replyStatus = data.getReplyStatus();
        java.util.Map<String, Object> coHostData = data.getCoHostData();
        Object obj2 = null;
        if (coHostData != null) {
            obj = coHostData.get("channel_id");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            j = l.longValue();
        } else {
            j = LJJIIZ().LJLJJL;
        }
        long userId = data.getInviter().getUserId();
        java.util.Map<String, Object> coHostData2 = data.getCoHostData();
        if (coHostData2 != null) {
            obj2 = coHostData2.get("transparent_extra");
        }
        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
            str = LJJIIZ().LJZI;
        }
        StringBuilder LIZLLL = C1FJ.LIZLLL("replyInvite replyStatus:", replyStatus, ", inviter userId:", userId);
        LIZLLL.append(", inviter linkMicId:");
        LIZLLL.append(LJJIIZ().LJLZ);
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZLLL));
        long LIZIZ = C31012CFc.LIZIZ();
        String remoteUserId = String.valueOf(userId);
        o.LJIIIZ(remoteUserId, "remoteUserId");
        UC0.LJJLIIIIJ(new ARunnableS4S1101000_13(replyStatus, this, remoteUserId, 3));
        long LIZIZ2 = C31012CFc.LIZIZ();
        CoHostApi coHostApi = (CoHostApi) Q7L.LIZIZ(CoHostApi.class);
        long j3 = this.LJI;
        Long l2 = (Long) ((HashMap) LJJIIZ().LJLILLLLZI).get(Long.valueOf(userId));
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        long j4 = LJJIIZ().LJLJLLL;
        if (str == null) {
            str = "";
        }
        this.LJIIJJI.LIZ(coHostApi.reply(j, j3, replyStatus, userId, j2, j4, str).LJIILIIL(new U7P(this, userId, replyStatus, LIZIZ, data, LIZIZ2)).LJIIJ(new U7S(this, userId, replyStatus, LIZIZ, data)).LJIJI(U99.LJLIL).LJFF(new C62705OjF()).LJIIJJI(new U7I(replyStatus, this, data)).LJJII(new AfS65S0100000_13(interfaceC76768UAy, 183), new AfS65S0100000_13(interfaceC76768UAy, 176)));
    }

    @Override // X.U66
    public final void LLLZIL(PermitApplyData data, InterfaceC76768UAy<PermitResult> interfaceC76768UAy) {
        long j;
        Object obj;
        String str;
        o.LJIIIZ(data, "data");
        int permitStatus = data.getPermitStatus();
        long userId = data.getApplicant().getUserId();
        long roomId = data.getApplicant().getRoomId();
        String applicantLinkMicId = data.getApplicant().getLinkMicId();
        StringBuilder LIZLLL = C1FJ.LIZLLL("permitApply permitStatus:", permitStatus, ", applicantUserId:", userId);
        C0MT.LIZLLL(LIZLLL, ", applicantRoomId:", roomId, ", applicantLinkMicId:");
        LIZLLL.append(applicantLinkMicId);
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZLLL));
        long LIZIZ = C31012CFc.LIZIZ();
        o.LJIIIZ(applicantLinkMicId, "applicantLinkMicId");
        UC0.LJJLIIIIJ(new ARunnableS4S1101000_13(permitStatus, this, applicantLinkMicId, 2));
        long LIZIZ2 = C31012CFc.LIZIZ();
        CoHostApi coHostApi = (CoHostApi) Q7L.LIZIZ(CoHostApi.class);
        long j2 = this.LJIIIZ;
        long j3 = this.LJI;
        Long l = (Long) ((HashMap) LJJIIZ().LJLILLLLZI).get(Long.valueOf(userId));
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        java.util.Map<String, Object> custom = data.getCustom();
        if (custom != null) {
            obj = custom.get("transparent_extra");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        this.LJIIJJI.LIZ(coHostApi.permit(j2, j3, permitStatus, userId, roomId, j, str).LJIILIIL(new U7Q(this, applicantLinkMicId, permitStatus, LIZIZ, data, LIZIZ2)).LJIIJ(new AfS1S1201100_13(LIZIZ, applicantLinkMicId, this, permitStatus, data, 1)).LJIJI(U97.LJLIL).LJFF(new C62705OjF()).LJIIJJI(new U7J(permitStatus, this, data, userId)).LJJII(new AfS65S0100000_13(interfaceC76768UAy, 181), new AfS52S0300000_13(this, data, interfaceC76768UAy, 7)));
    }

    @Override // X.U66
    public final void LLLZZ(LeaveChannelData data, InterfaceC76768UAy<LeaveChannelResult> interfaceC76768UAy) {
        String str;
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leaveChannel, channelId:");
        LIZ.append(LJJIIZ().LJLJJL);
        LIZ.append(", roomId:");
        LIZ.append(LJJIIZ().LJLIL);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        int leaveReason = data.getLeaveReason();
        AbnormalDisconnectReason.Builder builder = new AbnormalDisconnectReason.Builder();
        builder.setDisconnectFromUid(data.getNotSuggestToUid());
        builder.setDissconnectReason(data.getLeaveReason());
        builder.setDisconnectSource(data.getLeaveSource());
        builder.setDisconnectFromLinkMicId(data.getLeavedLinkMicId());
        LJJIJIL(leaveReason, builder.build());
        long LIZIZ = C31012CFc.LIZIZ();
        String leaveSource = data.getLeaveSource();
        int leaveReason2 = data.getLeaveReason();
        o.LJIIIZ(leaveSource, "leaveSource");
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new ARunnableS4S1201000_13(leaveReason2, this, LIZJ, leaveSource, 6));
        C65814PsI.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
        long j = LJJIIZ().LJLJJL;
        long j2 = LJJIIZ().LJLIL;
        long notSuggestToUid = data.getNotSuggestToUid();
        java.util.Map<String, Object> custom = data.getCustom();
        Object obj = null;
        if (custom != null) {
            obj = custom.get("transparent_extra");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = LJJIIZ().LJZI;
        }
        coHostApi.leave(j, j2, notSuggestToUid, str).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, data, 41)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, data, 42)).LJIJI(U96.LJLIL).LJFF(new C62705OjF()).LJIIJJI(new U7R(this)).LJJII(new AfS65S0100000_13(interfaceC76768UAy, 179), new AfS65S0100000_13(interfaceC76768UAy, 180));
    }

    @Override // X.U66
    public final void h(CancelApplyData data, InterfaceC76768UAy<CancelApplyResult> interfaceC76768UAy) {
        long j;
        long j2;
        o.LJIIIZ(data, "data");
        LiveRoomUser targetUser = data.getTargetUser();
        if (targetUser != null) {
            j = targetUser.getRoomId();
        } else {
            j = LJJIIZ().LJLLI;
        }
        LiveRoomUser targetUser2 = data.getTargetUser();
        if (targetUser2 != null) {
            j2 = targetUser2.getUserId();
        } else {
            j2 = LJJIIZ().LJLJJLL;
        }
        StringBuilder LIZJ = V10.LIZJ("cancelApply targetRoomId:", j, ", targetUid:");
        LIZJ.append(j2);
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZJ));
        LJJIFFI(j, j2, interfaceC76768UAy);
    }

    public final void LJJIFFI(long j, long j2, InterfaceC76768UAy<CancelApplyResult> interfaceC76768UAy) {
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setRoomId(Long.valueOf(j));
        builder.setUserId(Long.valueOf(j2));
        LinkUser build = builder.build();
        LinkUser.Builder builder2 = new LinkUser.Builder();
        builder2.setRoomId(Long.valueOf(this.LJI));
        builder2.setUserId(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LinkUser build2 = builder2.build();
        long j3 = 0;
        if (j > 0 && this.LJIIIZ > 0 && j2 > 0) {
            long LIZIZ = C31012CFc.LIZIZ();
            String remoteUserId = String.valueOf(j2);
            o.LJIIIZ(remoteUserId, "remoteUserId");
            UC0.LJJLIIIIJ(new ARunnableS14S1100000_13(this, remoteUserId, 17));
            C65814PsI.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
            long j4 = LJJIIZ().LJLJJL;
            long j5 = this.LJI;
            String str = LJJIIZ().LJLJLJ;
            int i = this.LJFF;
            Long l = (Long) ((HashMap) LJJIIZ().LJLILLLLZI).get(Long.valueOf(j2));
            if (l != null) {
                j3 = l.longValue();
            }
            this.LJIIJJI.LIZ(coHostApi.cancel(j4, j5, j, j2, str, i, j3, U4E.Apply.val, LJJIIZ().LJZI).LJIILIIL(new AfS1S0100200_13(this, j2, LIZIZ, 3)).LJIIJ(new AfS1S0100200_13(this, j2, LIZIZ, 4)).LJIJI(U9C.LJLIL).LJFF(new C62705OjF()).LJJII(new AfS0S0400100_13(this, j2, build, build2, interfaceC76768UAy, 2), new AfS0S0400100_13(this, j2, build, build2, interfaceC76768UAy, 3)));
        }
    }

    public final void LJJII(long j, long j2, InterfaceC76768UAy<CancelInviteResult> interfaceC76768UAy) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite inviteeRoomId:");
        LIZ.append(j);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setRoomId(Long.valueOf(j));
        builder.setUserId(Long.valueOf(j2));
        LinkUser build = builder.build();
        long j3 = 0;
        if (j > 0 && this.LJIIIZ > 0 && j2 > 0) {
            long LIZIZ = C31012CFc.LIZIZ();
            UC0.LJJLIIIIJ(new ARunnableS8S1100100_13(-1L, this, String.valueOf(build.getUserId()), 1));
            C65814PsI.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
            long j4 = LJJIIZ().LJLJJL;
            long j5 = LJJIIZ().LJLIL;
            String str = LJJIIZ().LJLJLJ;
            int i = this.LJFF;
            Long l = (Long) ((HashMap) LJJIIZ().LJLILLLLZI).get(Long.valueOf(j2));
            if (l != null) {
                j3 = l.longValue();
            }
            this.LJIIJJI.LIZ(coHostApi.cancel(j4, j5, j, j2, str, i, j3, U4E.Invite.val, LJJIIZ().LJZI).LJIILIIL(new AfS1S0100200_13(this, j2, LIZIZ, 5)).LJIIJ(new AfS1S0100200_13(this, j2, LIZIZ, 6)).LJIJI(U9D.LJLIL).LJFF(new C62705OjF()).LJJII(new AfS2S0300100_13(j2, this, build, interfaceC76768UAy, 3), new AfS2S0300100_13(j2, this, build, interfaceC76768UAy, 4)));
        }
    }

    @Override // X.U66
    public final void LLLLLLLZIL(InviteData data, InterfaceC76768UAy<InviteResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> canPreJoinChannelAction) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z;
        Object obj6;
        Object obj7;
        String str;
        Object obj8;
        Object obj9;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(canPreJoinChannelAction, "canPreJoinChannelAction");
        String str2 = null;
        if (LJJIII()) {
            C32014ChO.LIZJ(LJJIJIIJI(296), "multiLive is active, callback onFailed", null);
            interfaceC76768UAy.LIZJ(new LinkCoreError(99880001, "multiLive is active"), null);
            return;
        }
        java.util.Map<String, Object> custom = data.getCustom();
        if (custom == null || (obj = custom.get("check_perception_center")) == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setRoomId(Long.valueOf(data.getInvitee().getRoomId()));
        builder.setUserId(Long.valueOf(data.getInvitee().getUserId()));
        builder.setExtra("local");
        LinkUser build = builder.build();
        LJJIIJZLJL().LJJJLL(build);
        U7M LJJIIZ = LJJIIZ();
        LJJIIZ.LL = true;
        LJJIIZ.LJLJJLL = data.getInvitee().getUserId();
        java.util.Map<String, Object> custom2 = data.getCustom();
        Object obj10 = "";
        if (custom2 == null || (obj2 = custom2.get("sec_to_user_id")) == null) {
            obj2 = "";
        }
        LJJIIZ.LJLJLJ = (String) obj2;
        LJJIIZ.LJLLI = data.getInvitee().getRoomId();
        LJJIIZ.LJLJLLL = this.LJI;
        if (data.getExpireTimeInSeconds() > 0) {
            LJJIL(U4E.Invite.val, data.getInvitee().getUserId(), data.getInvitee().getRoomId(), data.getExpireTimeInSeconds());
        }
        long LIZIZ = C31012CFc.LIZIZ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            str2 = room.getIdStr();
        }
        UA9.LJIJJLI(this, String.valueOf(str2), String.valueOf(data.getInvitee().getUserId()), String.valueOf(data.getInvitee().getRoomId()));
        C65814PsI.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZIZ(CoHostApi.class);
        long roomId = data.getInvitee().getRoomId();
        long userId = data.getInvitee().getUserId();
        java.util.Map<String, Object> custom3 = data.getCustom();
        if (custom3 == null || (obj3 = custom3.get("sec_to_user_id")) == null) {
            obj3 = "";
        }
        String str3 = (String) obj3;
        long j = this.LJI;
        java.util.Map<String, Object> custom4 = data.getCustom();
        if (custom4 == null || (obj4 = custom4.get("invite_type")) == null) {
            obj4 = 0;
        }
        int intValue = ((Integer) obj4).intValue();
        java.util.Map<String, Object> custom5 = data.getCustom();
        if (custom5 == null || (obj5 = custom5.get("match_type")) == null) {
            obj5 = 0;
        }
        int intValue2 = ((Integer) obj5).intValue();
        if (LJJIIJZLJL().LIZJ.size() > 1 || LJJIIJZLJL().LIZLLL.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        long j2 = this.LJIIIZ;
        int expireTimeInSeconds = (int) data.getExpireTimeInSeconds();
        java.util.Map<String, Object> custom6 = data.getCustom();
        if (custom6 == null || (obj6 = custom6.get("need_withdraw")) == null) {
            obj6 = Boolean.FALSE;
        }
        boolean booleanValue2 = ((Boolean) obj6).booleanValue();
        java.util.Map<String, Object> custom7 = data.getCustom();
        if (custom7 != null) {
            obj7 = custom7.get("transparent_extra");
        } else {
            obj7 = null;
        }
        if (!(obj7 instanceof String) || (str = (String) obj7) == null) {
            str = "";
        }
        java.util.Map<String, Object> custom8 = data.getCustom();
        if (custom8 == null || (obj8 = custom8.get("tag_type")) == null) {
            obj8 = 0;
        }
        int intValue3 = ((Integer) obj8).intValue();
        java.util.Map<String, Object> custom9 = data.getCustom();
        if (custom9 != null && (obj9 = custom9.get("tag_value")) != null) {
            obj10 = obj9;
        }
        this.LJIIJJI.LIZ(coHostApi.invite(12, roomId, userId, str3, j, intValue, intValue2, z, j2, expireTimeInSeconds, booleanValue2, str, intValue3, (String) obj10, booleanValue, B5G.LIZIZ().LJLIL).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, data, 43)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, build, 44)).LJIJI(U98.LJLIL).LJFF(new C62705OjF()).LJIIJJI(new U7L(this, build, data, interfaceC76768UAy, canPreJoinChannelAction)).LJJII(new AfS65S0100000_13(interfaceC76768UAy, 182), new AfS24S0400000_13(this, build, data, interfaceC76768UAy, 10)));
    }

    @Override // X.U66
    public final void LLLZLZ(ApplyData data, InterfaceC76768UAy<ApplyResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> canPreJoinChannelAction) {
        Object obj;
        Long l;
        Long l2;
        String str;
        Long l3;
        Long l4;
        Object obj2;
        long j;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Integer num;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(canPreJoinChannelAction, "canPreJoinChannelAction");
        String str2 = null;
        if (LJJIII()) {
            U4R.LIZLLL("CoLinker", "multiLive is active, callback onFailed");
            interfaceC76768UAy.LIZJ(new LinkCoreError(99880001, "multiLive is active"), null);
            return;
        }
        java.util.Map<String, Object> custom = data.getCustom();
        if (custom == null || (obj = custom.get("check_perception_center")) == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LiveRoomUser targetUser = data.getTargetUser();
        if (targetUser != null) {
            l = Long.valueOf(targetUser.getUserId());
        } else {
            l = null;
        }
        LiveRoomUser targetUser2 = data.getTargetUser();
        if (targetUser2 != null) {
            l2 = Long.valueOf(targetUser2.getRoomId());
        } else {
            l2 = null;
        }
        if (l == null || l2 == null) {
            String LJJIJIIJI = LJJIJIIJI(701);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("apply:targetUserId:");
            LIZ.append(l);
            LIZ.append(" or targetRoomId:");
            LIZ.append(l2);
            LIZ.append(" is null");
            C32014ChO.LIZJ(LJJIJIIJI, X1D.LIZIZ(LIZ), null);
            return;
        }
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setRoomId(l2);
        builder.setUserId(l);
        LinkUser build = builder.build();
        LinkUser.Builder builder2 = new LinkUser.Builder();
        builder2.setRoomId(Long.valueOf(this.LJI));
        builder2.setUserId(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LinkUser build2 = builder2.build();
        LJJIIJZLJL().LJJJLIIL(build);
        LJJIIJZLJL().LJJJJZI(build2);
        U7M LJJIIZ = LJJIIZ();
        LJJIIZ.getClass();
        LJJIIZ.LJLJJLL = l.longValue();
        LJJIIZ.LJLLI = l2.longValue();
        LJJIIZ.LJLJLLL = this.LJI;
        this.LJIILLIIL.LIZIZ(2);
        if (data.getExpireTimeInSeconds() > 0) {
            LJJIL(U4E.Apply.val, l.longValue(), l2.longValue(), data.getExpireTimeInSeconds());
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("apply toRoomId:");
        LIZ2.append(l2);
        LIZ2.append(", toUserId:");
        LIZ2.append(l);
        LIZ2.append(", expireTimeInSeconds:");
        LIZ2.append(data.getExpireTimeInSeconds());
        U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ2));
        long LIZIZ = C31012CFc.LIZIZ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (str = room.getIdStr()) == null) {
            str = "-1";
        }
        LiveRoomUser targetUser3 = data.getTargetUser();
        if (targetUser3 != null) {
            l3 = Long.valueOf(targetUser3.getUserId());
        } else {
            l3 = null;
        }
        String valueOf = String.valueOf(l3);
        LiveRoomUser targetUser4 = data.getTargetUser();
        if (targetUser4 != null) {
            l4 = Long.valueOf(targetUser4.getRoomId());
        } else {
            l4 = null;
        }
        UA9.LJIIIZ(this, str, valueOf, String.valueOf(l4));
        C65814PsI.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
        long j2 = this.LJI;
        long expireTimeInSeconds = data.getExpireTimeInSeconds();
        java.util.Map<String, Object> custom2 = data.getCustom();
        if (custom2 != null) {
            obj2 = custom2.get("source_type");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
            j = num.intValue();
        } else {
            j = 1;
        }
        java.util.Map<String, Object> custom3 = data.getCustom();
        if (custom3 == null || (obj3 = custom3.get("need_withdraw")) == null) {
            obj3 = Boolean.FALSE;
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        java.util.Map<String, Object> custom4 = data.getCustom();
        if (custom4 != null) {
            obj4 = custom4.get("transparent_extra");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str2 = (String) obj4;
        }
        Object obj7 = "";
        if (str2 == null) {
            str2 = "";
        }
        java.util.Map<String, Object> custom5 = data.getCustom();
        if (custom5 == null || (obj5 = custom5.get("tag_type")) == null) {
            obj5 = 0;
        }
        int intValue = ((Integer) obj5).intValue();
        java.util.Map<String, Object> custom6 = data.getCustom();
        if (custom6 != null && (obj6 = custom6.get("tag_value")) != null) {
            obj7 = obj6;
        }
        this.LJIIJJI.LIZ(coHostApi.apply(l2.longValue(), l.longValue(), j2, j, expireTimeInSeconds, booleanValue2, str2, intValue, (String) obj7, booleanValue, B5G.LIZIZ().LJLIL).LJIILIIL(new AfS3S0200100_13(LIZIZ, this, l, 39)).LJIIJ(new AfS3S0200100_13(LIZIZ, this, l, 40)).LJIJI(U95.LJLIL).LJFF(new C62705OjF()).LJIIJJI(new U7K(this, build, l, interfaceC76768UAy, canPreJoinChannelAction, l2)).LJJII(new AfS65S0100000_13(interfaceC76768UAy, 178), new AfS24S0400000_13(this, build, l, interfaceC76768UAy, 9)));
    }

    @Override // X.U66
    public final void i(String linkMicId, long j, EnumC76739U9v kickOutType) {
        Long roomId;
        String str;
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(kickOutType, "kickOutType");
        if (j == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("kickOutCoHost:linkMicId:");
            LIZ.append(linkMicId);
            LIZ.append(", leaveReason:");
            LIZ.append(j);
            U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
            LinkUser LJI = LJJIIJZLJL().LJI(linkMicId);
            Long l = null;
            if (LJI != null) {
                l = LJI.getUserId();
            }
            LinkUser LJI2 = LJJIIJZLJL().LJI(linkMicId);
            if (LJI2 == null || (roomId = LJI2.getRoomId()) == null || l == null) {
                return;
            }
            long LIZIZ = C31012CFc.LIZIZ();
            int i = C76741U9x.LIZ[kickOutType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "kickout_rtc_stream_close";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str = "kickout_none";
                }
            } else {
                str = "kickout_rtc_stream_timeout";
            }
            UC0.LJJLIIIIJ(new ARunnableS5S2100000_13(this, linkMicId, str, 2));
            C65814PsI.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
            long j2 = LJJIIZ().LJLJJL;
            long j3 = LJJIIZ().LJLIL;
            long longValue = l.longValue();
            long longValue2 = roomId.longValue();
            int i2 = kickOutType.val;
            String str2 = LJJIIZ().LJZI;
            if (str2 == null) {
                str2 = "";
            }
            this.LJIIJJI.LIZ(coHostApi.kickOut(j2, j3, longValue, longValue2, i2, str2).LJIILIIL(new AfS4S1200100_13(this, LIZIZ, linkMicId, kickOutType, 1)).LJIIJ(new AfS4S1200100_13(this, LIZIZ, linkMicId, kickOutType, 2)).LJIJI(U9A.LJLIL).LJFF(new C62705OjF()).LJJII(U9Y.LJLIL, new AfS65S0100000_13(this, 177)));
        }
    }

    public final void LJJIL(int i, long j, long j2, long j3) {
        if (!this.LJIILIIL.containsKey(Long.valueOf(j))) {
            AbstractC73672Svk.LJJIJIIJIL(1L, j3, 0L, 1L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new U7N(this, j, i, j3, j2));
        }
    }
}
