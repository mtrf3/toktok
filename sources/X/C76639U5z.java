package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import kotlin.jvm.internal.o;

/* renamed from: X.U5z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76639U5z implements InterfaceC76768UAy<ReplyResult> {
    public final /* synthetic */ C75911Tql LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<ReplyResult> LJLJI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(ReplyResult replyResult) {
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        if (this.LJLIL.LIZJ == 1) {
            U6E LJJI = this.LJLILLLLZI.LJFF().LJJI();
            LJJI.LIZIZ.LJIILJJIL(new C76701U8j(EnumC75419Tip.StateJoined, null, value.inviteeLinkMicId, null, null, null, 248), null);
            LJJI.LIZJ.invoke(Boolean.TRUE);
            LJJI.LJI.invoke("onReplyAgreeInviteSucceed");
        }
        InterfaceC75414Tik<ReplyResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1167);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<ReplyResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }

    public C76639U5z(C75911Tql c75911Tql, U65 u65, InterfaceC75414Tik<ReplyResult> interfaceC75414Tik) {
        this.LJLIL = c75911Tql;
        this.LJLILLLLZI = u65;
        this.LJLJI = interfaceC75414Tik;
    }
}
