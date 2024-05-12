package X;

/* renamed from: X.SxF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73765SxF implements Runnable {
    public final InterfaceC73651SvP LJLIL;
    public final long LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.request(this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73765SxF(long j, InterfaceC73651SvP interfaceC73651SvP) {
        this.LJLIL = interfaceC73651SvP;
        this.LJLILLLLZI = j;
    }
}
