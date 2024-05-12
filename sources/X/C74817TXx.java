package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.TXx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74817TXx implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ TVA LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult replyResult) {
        BizReplyResponseData bizReplyResponseData;
        String str;
        TY4 ty4;
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        TYP.LIZ("GameLinkGuestBeInvitedPresenter", "reply invite succeed", false);
        BizReplyResponse bizReplyResponse = value.multiGuestRespExtra;
        if (bizReplyResponse != null) {
            bizReplyResponseData = bizReplyResponse.responseData;
        } else {
            bizReplyResponseData = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bizReplyResponseData ");
        LIZ.append(bizReplyResponseData);
        TYP.LIZJ("oneVn_PbUtil", X1D.LIZIZ(LIZ));
        TY4 ty42 = this.LJLIL.LIZ;
        if (ty42 != null && ty42.LLLLLLLLL() && (ty4 = this.LJLIL.LIZ) != null) {
            ty4.LLLLIILL(true);
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (this.LJLILLLLZI == 1) {
            str = "whole_live";
        } else {
            str = "normal";
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_refuse_connection_invitation");
        LIZ2.LJIIZILJ();
        if (room != null) {
            LIZ2.LJIJJ(Long.valueOf(room.getId()), "room_id");
            if (room.getOwner() != null) {
                LIZ2.LJIJJ(Long.valueOf(room.getOwner().getId()), "anchor_id");
            }
            if (room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
                LIZ2.LJIJJ(Long.valueOf(room.getOwner().getFollowInfo().getFollowStatus()), "anchor_relationship");
            }
        }
        LIZ2.LJIJJ(str, "refused_way");
        LIZ2.LJIJJ(Integer.valueOf(TTV.LIZ().LJIIJJI), "connected_guest_cnt");
        LIZ2.LJIJJ(Long.valueOf(currentUserId), "user_id");
        LIZ2.LJJIIJZLJL();
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
        TY4 ty42 = tva.LIZ;
        if (ty42 != null && ty42.LLLLLLLLL() && (ty4 = tva.LIZ) != null) {
            ty4.LLLLIILL(false);
        }
    }

    public C74817TXx(TVA tva, long j, long j2, int i) {
        this.LJLIL = tva;
        this.LJLILLLLZI = i;
    }
}
