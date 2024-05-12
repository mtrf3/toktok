package X;

/* renamed from: X.Igb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47253Igb implements Runnable {
    public final InterfaceC46811IYt LJLIL;
    public final /* synthetic */ C47256Ige LJLILLLLZI;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayCommand: setSurface:");
        LIZ.append(this.LJLILLLLZI.LIZIZ.getSurface());
        X1D.LIZIZ(LIZ);
        C47256Ige c47256Ige = this.LJLILLLLZI;
        c47256Ige.LIZ.setSurface(c47256Ige.LIZIZ.getSurface());
        this.LJLILLLLZI.LIZ.LJIIL(C46810IYs.LIZ(this.LJLIL, null));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47253Igb(C47256Ige c47256Ige, InterfaceC46811IYt interfaceC46811IYt) {
        this.LJLILLLLZI = c47256Ige;
        this.LJLIL = interfaceC46811IYt;
    }
}
