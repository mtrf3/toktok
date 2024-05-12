package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TY8 implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ TY7 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ TYF LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult replyResult) {
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        C75017TcL.LJIILJJIL("in_liveroom");
        this.LJLIL.LJIIIIZZ(value, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        this.LJLIL.LIZIZ(this.LJLJJI, this.LJLILLLLZI, error, th);
        C74824TYe.LJJLIIIIJ(th);
    }

    public TY8(TY7 ty7, long j, TYF tyf, long j2) {
        this.LJLIL = ty7;
        this.LJLILLLLZI = j;
        this.LJLJI = tyf;
        this.LJLJJI = j2;
    }
}
