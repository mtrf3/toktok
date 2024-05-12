package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestStartRtcJoinChannelEvent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveLayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.TXy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74818TXy implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ TVA LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult replyResult) {
        int i;
        int i2;
        TY4 ty4;
        BizReplyResponseData bizReplyResponseData;
        BizReplyResponseData bizReplyResponseData2;
        long j;
        BizReplyResponseData bizReplyResponseData3;
        BizReplyResponseData bizReplyResponseData4;
        TVD tvd;
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        TYP.LIZ("GameLinkGuestBeInvitedPresenter", "reply invite succeed", false);
        TY4 ty42 = this.LJLIL.LIZ;
        if (ty42 != null) {
            ty42.LJJLJ();
        }
        BizReplyResponse bizReplyResponse = value.multiGuestRespExtra;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bizReplyResponse ");
        LIZ.append(bizReplyResponse);
        TYP.LIZJ("GameLinkGuestBeInvitedPresenter", X1D.LIZIZ(LIZ));
        if (bizReplyResponse != null && (bizReplyResponseData4 = bizReplyResponse.responseData) != null) {
            long j2 = bizReplyResponseData4.linkTypePermission;
            TVA tva = this.LJLIL;
            if (j2 == 2 && (tvd = (TVD) tva.LIZLLL.getValue()) != null) {
                tvd.LJIIZILJ = 2;
                tvd.LJIJJLI = 2;
                C74740TUy.LIZLLL().LJIIJJI = 2;
            }
        }
        TYR tyr = TS8.LIZ;
        String LIZ2 = tyr.LIZ(this.LJLILLLLZI);
        if (TextUtils.isEmpty(LIZ2)) {
            C74838TYs.LJ().LJIILIIL = LIZ2;
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                tyr.LJ(room.getOwnerUserId(), LIZ2);
            }
        }
        TVD tvd2 = (TVD) this.LJLIL.LIZLLL.getValue();
        if (tvd2 != null) {
            if (bizReplyResponse != null && (bizReplyResponseData3 = bizReplyResponse.responseData) != null) {
                j = bizReplyResponseData3.linkTypePermission;
            } else {
                j = 0;
            }
            tvd2.LIZJ(j);
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
        DataChannel dataChannel = this.LJLIL.LIZJ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomGuestStartRtcJoinChannelEvent.class, "");
        }
        DataChannel dataChannel2 = this.LJLIL.LIZJ;
        if (dataChannel2 != null) {
            dataChannel2.qv0(LinkInRoomGuestReplySucceedEvent.class, new C74633TQv(multiLiveLayoutInfo));
        }
        TY4 ty43 = this.LJLIL.LIZ;
        if (ty43 != null && ty43.LLLLLLLLL() && (ty4 = this.LJLIL.LIZ) != null) {
            ty4.LLILLJJLI();
        }
        TTV.LIZ().LJJ = "invite";
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        TY4 ty4;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reply invite failed, ");
        LIZ.append(X4Q.LJIILLIIL(th));
        TYP.LIZ("GameLinkGuestBeInvitedPresenter", X1D.LIZIZ(LIZ), false);
        TVA tva = this.LJLIL;
        long j = this.LJLILLLLZI;
        TY4 ty42 = tva.LIZ;
        if (ty42 != null) {
            ty42.LJJLJ();
        }
        tva.LIZIZ(10021, j, "leave_source_reply_invite_failed");
        TY4 ty43 = tva.LIZ;
        if (ty43 != null && ty43.LLLLLLLLL() && (ty4 = tva.LIZ) != null) {
            ty4.LJJLIIIJL(th);
        }
    }

    public C74818TXy(TVA tva, long j, long j2) {
        this.LJLIL = tva;
        this.LJLILLLLZI = j;
    }
}
