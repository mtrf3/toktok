package X;

import java.util.concurrent.Executor;

/* loaded from: classes19.dex */
public final class ZUH implements InterfaceC89997ZTt<Object, Void> {
    public final /* synthetic */ C89999ZTv LIZ;
    public final /* synthetic */ InterfaceC89997ZTt LIZIZ;
    public final /* synthetic */ Executor LIZJ;
    public final /* synthetic */ C89999ZTv LIZLLL;

    @Override // X.InterfaceC89997ZTt
    public final void LIZ(C89999ZTv c89999ZTv) {
        C89999ZTv c89999ZTv2 = this.LIZLLL;
        C89999ZTv c89999ZTv3 = this.LIZ;
        InterfaceC89997ZTt interfaceC89997ZTt = this.LIZIZ;
        Executor executor = this.LIZJ;
        c89999ZTv2.getClass();
        try {
            executor.execute(new RunnableC90000ZTw(interfaceC89997ZTt, c89999ZTv, c89999ZTv3));
        } catch (Exception unused) {
            c89999ZTv3.LJ();
        }
    }

    public ZUH(InterfaceC89997ZTt interfaceC89997ZTt, C89999ZTv c89999ZTv, C89999ZTv c89999ZTv2, Executor executor) {
        this.LIZLLL = c89999ZTv;
        this.LIZ = c89999ZTv2;
        this.LIZIZ = interfaceC89997ZTt;
        this.LIZJ = executor;
    }
}
