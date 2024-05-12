package X;

import java.util.concurrent.Executor;

/* renamed from: X.Fw3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40567Fw3<ResultT> implements InterfaceC40569Fw5<ResultT> {
    public final Executor LIZ;
    public final Object LIZIZ = new Object();
    public final InterfaceC40570Fw6 LIZJ;

    public C40567Fw3(Executor executor, InterfaceC40570Fw6 interfaceC40570Fw6) {
        this.LIZ = executor;
        this.LIZJ = interfaceC40570Fw6;
    }

    @Override // X.InterfaceC40569Fw5
    public final void LIZ(C40561Fvx c40561Fvx) {
        if (c40561Fvx.LJI()) {
            return;
        }
        synchronized (this.LIZIZ) {
            if (this.LIZJ == null) {
                return;
            }
            this.LIZ.execute(new RunnableC40568Fw4(this, c40561Fvx));
        }
    }
}
