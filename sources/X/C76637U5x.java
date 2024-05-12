package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U5x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76637U5x implements InterfaceC76768UAy<DirectJoinResult> {
    public final /* synthetic */ C35749E1h LJLIL;
    public final /* synthetic */ U65 LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<DirectJoinResult> LJLJI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(DirectJoinResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinDirect success param=");
        LIZ.append(this.LJLIL);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        BizJoinDirectParams bizJoinDirectParams = this.LJLIL.LIZ;
        if (bizJoinDirectParams != null && bizJoinDirectParams.replyType == 1) {
            U6E LJJI = this.LJLILLLLZI.LJFF().LJJI();
            LJJI.LIZJ.invoke(Boolean.TRUE);
            LJJI.LJI.invoke("onJoinDirectSucceed");
        }
        InterfaceC75414Tik<DirectJoinResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinDirect fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        U4R.LIZIZ("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<DirectJoinResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }

    public C76637U5x(C35749E1h c35749E1h, U65 u65, InterfaceC75414Tik<DirectJoinResult> interfaceC75414Tik) {
        this.LJLIL = c35749E1h;
        this.LJLILLLLZI = u65;
        this.LJLJI = interfaceC75414Tik;
    }
}
