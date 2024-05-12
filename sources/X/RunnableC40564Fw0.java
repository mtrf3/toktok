package X;

/* renamed from: X.Fw0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40564Fw0 implements Runnable {
    public final /* synthetic */ C40561Fvx LJLIL;
    public final /* synthetic */ C40565Fw1 LJLILLLLZI;

    public RunnableC40564Fw0(C40565Fw1 c40565Fw1, C40561Fvx c40561Fvx) {
        this.LJLILLLLZI = c40565Fw1;
        this.LJLIL = c40561Fvx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (this.LJLILLLLZI.LIZIZ) {
                InterfaceC40563Fvz<? super ResultT> interfaceC40563Fvz = this.LJLILLLLZI.LIZJ;
                if (interfaceC40563Fvz != 0) {
                    interfaceC40563Fvz.onSuccess(this.LJLIL.LJFF());
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
