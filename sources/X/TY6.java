package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TY6 implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ TY7 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult replyResult) {
        BizReplyResponseData bizReplyResponseData;
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        BizReplyResponse bizReplyResponse = value.multiGuestRespExtra;
        if (bizReplyResponse != null) {
            bizReplyResponseData = bizReplyResponse.responseData;
        } else {
            bizReplyResponseData = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bizReplyResponseData ");
        LIZ.append(bizReplyResponseData);
        C0NB.LJIIIZ("MultiGuestV3GuestBeInvitedPresenter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJII(this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        this.LJLIL.LJI(this.LJLILLLLZI, this.LJLJI, error);
        C74824TYe.LJJLIIIIJ(th);
    }

    public TY6(TY7 ty7, long j, long j2, int i) {
        this.LJLIL = ty7;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = i;
    }
}
