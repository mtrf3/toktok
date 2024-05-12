package X;

/* renamed from: X.Suh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73607Suh<T> implements Runnable {
    public final InterfaceC73509St7<? super T> LJLIL;
    public final InterfaceC73504St2<T> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LIZ(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73607Suh(C73609Suj c73609Suj, InterfaceC73504St2 interfaceC73504St2) {
        this.LJLIL = c73609Suj;
        this.LJLILLLLZI = interfaceC73504St2;
    }
}
