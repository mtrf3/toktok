package X;

/* renamed from: X.Syx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73871Syx implements Runnable {
    public final InterfaceC73872Syy LJLIL;
    public final long LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZ(this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73871Syx(long j, InterfaceC73872Syy interfaceC73872Syy) {
        this.LJLILLLLZI = j;
        this.LJLIL = interfaceC73872Syy;
    }
}
