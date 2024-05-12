package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestStartRtcJoinChannelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveLayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TY7 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJFF;
    public final TYD LIZ;
    public final DataChannel LIZIZ;
    public final boolean LIZJ;
    public final C31657Cbd LIZLLL;
    public final C62822Ol8 LJ;

    static {
        TBT tbt = new TBT(TY7.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJFF = new InterfaceC74236TBo[]{tbt};
    }

    public final MultiGuestDataHolder LIZ() {
        return (MultiGuestDataHolder) this.LIZLLL.LIZ(this, LJFF[0]);
    }

    public final void LIZJ() {
        ((C73318Sq2) this.LJ.getValue()).LIZLLL();
    }

    public static final void LJIIIZ(long j) {
        C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).turnOffInvitation(j)).LJJJLIIL(TYB.LJLIL, TYC.LJLIL);
    }

    public final void LJ(long j, long j2) {
        int i;
        int i2;
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog;
        MultiGuestDataHolder LIZ = LIZ();
        if (LIZ != null) {
            i = LIZ.LJ("reply");
        } else {
            i = 2;
        }
        TYD tyd = this.LIZ;
        if ((tyd instanceof MultiGuestV3GuestBeInvitedDialog) && (multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) tyd) != null && multiGuestV3GuestBeInvitedDialog.xl()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.LIZJ) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null) {
                R6.LLILZ(new C35749E1h(new BizJoinDirectParams(i, 2, C74800TXg.LIZ())), new TY9(this, j, j2, i2));
                return;
            }
            return;
        }
        C75911Tql c75911Tql = new C75911Tql(j, j2, 2, new BizReplyParams(i, i2), 16);
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null) {
            R62.LJJLIIIJL(c75911Tql, new TY6(this, j, j2, i2));
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LIZJ();
    }

    public TY7(TYD tyd, DataChannel dataChannel, boolean z) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = tyd;
        this.LIZIZ = dataChannel;
        this.LIZJ = z;
        TYQ.LIZ("MultiGuestV3GuestBeInvitedPresenter", "init");
        this.LIZLLL = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
        this.LJ = C221108m2.LIZIZ(C74692TTc.LJLIL);
    }

    public final void LJFF(int i, long j, String str) {
        C74838TYs.LJ().LJJIIZ = true;
        BizLeaveParams bizLeaveParams = new BizLeaveParams(j);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJJLIIIJ(new C76012TsO(str, 0L, bizLeaveParams, i, 2), new TQJ(str, this));
        }
    }

    public final void LJI(long j, long j2, LinkCoreError linkCoreError) {
        TYD tyd;
        StringBuilder LIZJ = V10.LIZJ("onRefuseFailed roomId:", j, " anchorId:");
        LIZJ.append(j2);
        LIZJ.append(" error:");
        LIZJ.append(linkCoreError);
        C0NB.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", X1D.LIZIZ(LIZJ));
        TYD tyd2 = this.LIZ;
        if (tyd2 != null && tyd2.LLLLLLLLL() && (tyd = this.LIZ) != null) {
            tyd.LLLLIILL(false);
        }
    }

    public final void LJII(int i, long j, long j2) {
        String str;
        TYD tyd;
        StringBuilder LIZJ = V10.LIZJ("onRefuseSuccess roomId:", j, " anchorId:");
        C06510Nj.LIZIZ(LIZJ, j2, " isTurnOffInvitation:", i);
        C0NB.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", X1D.LIZIZ(LIZJ));
        TYD tyd2 = this.LIZ;
        if (tyd2 != null && tyd2.LLLLLLLLL() && (tyd = this.LIZ) != null) {
            tyd.LLLLIILL(true);
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (i == 1) {
            str = "whole_live";
        } else {
            str = "normal";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_guest_refuse_connection_invitation");
        LIZ.LJIIZILJ();
        if (room != null) {
            LIZ.LJIJJ(Long.valueOf(room.getId()), "room_id");
            if (room.getOwner() != null) {
                LIZ.LJIJJ(Long.valueOf(room.getOwner().getId()), "anchor_id");
            }
            if (room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
                LIZ.LJIJJ(Long.valueOf(room.getOwner().getFollowInfo().getFollowStatus()), "anchor_relationship");
            }
        }
        LIZ.LJIJJ(str, "refused_way");
        LIZ.LJIJJ(Integer.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())), "connected_guest_cnt");
        C30869C9p.LIZ(currentUserId, LIZ, "user_id");
    }

    public final void LJIIIIZZ(ReplyResult replyResult, long j, TYF tyf) {
        int i;
        int i2;
        TYD tyd;
        BizReplyResponseData bizReplyResponseData;
        BizReplyResponseData bizReplyResponseData2;
        long j2;
        BizReplyResponseData bizReplyResponseData3;
        BizReplyResponseData bizReplyResponseData4;
        MultiGuestDataHolder LIZ;
        TYD tyd2 = this.LIZ;
        if (tyd2 != null) {
            tyd2.LJJLJ();
        }
        BizReplyResponse bizReplyResponse = replyResult.multiGuestRespExtra;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onReplyInviteSuccess bizReplyResponse ");
        LIZ2.append(bizReplyResponse);
        C0NB.LJIIIZ("MultiGuestV3GuestBeInvitedPresenter", X1D.LIZIZ(LIZ2));
        if (bizReplyResponse != null && (bizReplyResponseData4 = bizReplyResponse.responseData) != null && bizReplyResponseData4.linkTypePermission == 2 && (LIZ = LIZ()) != null) {
            LIZ.LIZ();
        }
        TYR tyr = TS8.LIZ;
        String LIZ3 = tyr.LIZ(j);
        if (TextUtils.isEmpty(LIZ3)) {
            C74838TYs.LJ().LJIILIIL = LIZ3;
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                tyr.LJ(room.getOwnerUserId(), LIZ3);
            }
        }
        MultiGuestDataHolder LIZ4 = LIZ();
        if (LIZ4 != null) {
            if (bizReplyResponse != null && (bizReplyResponseData3 = bizReplyResponse.responseData) != null) {
                j2 = bizReplyResponseData3.linkTypePermission;
            } else {
                j2 = 0;
            }
            LIZ4.LJIIZILJ(j2);
        }
        MultiLiveLayoutInfo multiLiveLayoutInfo = new MultiLiveLayoutInfo();
        if (bizReplyResponse != null && (bizReplyResponseData2 = bizReplyResponse.responseData) != null) {
            i = bizReplyResponseData2.layoutTypeAction;
        } else {
            i = 0;
        }
        multiLiveLayoutInfo.anchorNewLayout = i;
        multiLiveLayoutInfo.userMultiLiveLayout = true;
        if (bizReplyResponse != null && (bizReplyResponseData = bizReplyResponse.responseData) != null) {
            i2 = bizReplyResponseData.fixMicNumAction;
        } else {
            i2 = 0;
        }
        multiLiveLayoutInfo.fixSwitchOn = i2;
        this.LIZIZ.qv0(LinkInRoomGuestStartRtcJoinChannelEvent.class, "");
        this.LIZIZ.qv0(LinkInRoomGuestReplySucceedEvent.class, new C74633TQv(multiLiveLayoutInfo));
        TYD tyd3 = this.LIZ;
        if (tyd3 != null && tyd3.LLLLLLLLL() && (tyd = this.LIZ) != null) {
            tyd.LLILLJJLI();
        }
        if (tyf != null) {
            tyf.LIZ();
        }
    }

    public final void LIZIZ(long j, long j2, LinkCoreError linkCoreError, Throwable th) {
        TYD tyd;
        TYD tyd2 = this.LIZ;
        if (tyd2 != null) {
            tyd2.LJJLJ();
        }
        if ((linkCoreError.getErrorCode() != 10004 && linkCoreError.getErrorCode() != 31007) || !LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt()) {
            LJFF(10021, j2, "leave_source_reply_invite_failed");
        }
        TYD tyd3 = this.LIZ;
        if (tyd3 != null && tyd3.LLLLLLLLL() && (tyd = this.LIZ) != null) {
            tyd.LJJLIIIJL(th);
        }
    }

    public final void LIZLLL(long j, long j2, int i, TYF tyf, long j3) {
        int i2;
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog;
        int i3;
        MultiGuestDataHolder LIZ = LIZ();
        if (LIZ != null) {
            i2 = LIZ.LJ("reply");
        } else {
            i2 = 2;
        }
        TYD tyd = this.LIZ;
        if (tyd instanceof MultiGuestV3GuestBeInvitedDialog) {
            multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) tyd;
        } else {
            multiGuestV3GuestBeInvitedDialog = null;
        }
        if (multiGuestV3GuestBeInvitedDialog != null && multiGuestV3GuestBeInvitedDialog.xl()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.LIZJ) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null) {
                R6.LLILZ(new C35749E1h(new BizJoinDirectParams(i2, 1, C74800TXg.LIZ())), new TYA(this, j2, tyf, j));
                return;
            }
            return;
        }
        C75911Tql c75911Tql = new C75911Tql(j, j2, 1, new BizReplyParams(i2, i3), j3);
        MultiGuestDataHolder LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.LJJJJI = "invite";
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null) {
            R62.LJJLIIIJL(c75911Tql, new TY8(this, j2, tyf, j));
        }
    }
}
