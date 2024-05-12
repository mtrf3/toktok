package X;

import java.util.concurrent.Executor;

/* renamed from: X.Fw1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40565Fw1<ResultT> implements InterfaceC40569Fw5<ResultT> {
    public final Executor LIZ;
    public final Object LIZIZ = new Object();
    public final InterfaceC40563Fvz<? super ResultT> LIZJ;

    public C40565Fw1(Executor executor, InterfaceC40563Fvz<? super ResultT> interfaceC40563Fvz) {
        this.LIZ = executor;
        this.LIZJ = interfaceC40563Fvz;
    }

    @Override // X.InterfaceC40569Fw5
    public final void LIZ(C40561Fvx c40561Fvx) {
        if (c40561Fvx.LJI()) {
            synchronized (this.LIZIZ) {
                if (this.LIZJ == null) {
                    return;
                }
                this.LIZ.execute(new RunnableC40564Fw0(this, c40561Fvx));
            }
        }
    }
}
