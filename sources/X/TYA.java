package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYA implements InterfaceC75414Tik<DirectJoinResult> {
    public final /* synthetic */ TY7 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ TYF LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(DirectJoinResult directJoinResult) {
        BizJoinDirectResponseData bizJoinDirectResponseData;
        DirectJoinResult value = directJoinResult;
        o.LJIIIZ(value, "value");
        C75159Ted.LIZ.getClass();
        C75159Ted.LJFF(1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinDirect success resp:");
        LIZ.append(value.joinDirectResp);
        C0NB.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", X1D.LIZIZ(LIZ));
        BizJoinDirectResponse bizJoinDirectResponse = value.joinDirectResp;
        if (bizJoinDirectResponse != null && (bizJoinDirectResponseData = bizJoinDirectResponse.responseData) != null) {
            this.LJLIL.LJIIIIZZ(new ReplyResult(null, null, new BizReplyResponse(new BizReplyResponseData(bizJoinDirectResponseData.linkTypePermission, bizJoinDirectResponseData.layoutTypeAction, bizJoinDirectResponseData.fixMicNumAction)), null, 8, null), this.LJLILLLLZI, this.LJLJI);
        }
        C74838TYs.LJ().LJJIIZ = false;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        this.LJLIL.LIZIZ(this.LJLJJI, this.LJLILLLLZI, error, th);
    }

    public TYA(TY7 ty7, long j, TYF tyf, long j2) {
        this.LJLIL = ty7;
        this.LJLILLLLZI = j;
        this.LJLJI = tyf;
        this.LJLJJI = j2;
    }
}
