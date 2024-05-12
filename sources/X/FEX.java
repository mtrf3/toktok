package X;

/* loaded from: classes7.dex */
public final class FEX implements InterfaceC64435PQp {
    public static volatile FEX LIZIZ;
    public volatile boolean LIZ;

    public static FEX LIZIZ() {
        if (LIZIZ == null) {
            synchronized (FEX.class) {
                if (LIZIZ == null) {
                    LIZIZ = new FEX();
                }
            }
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC64435PQp
    public final void LIZ(int i) {
        if (C00F.LIZ(31744, 0, "power_mode_gecko_block_type", true) == 2) {
            if (C40010Fn4.LIZJ().LJ()) {
                EBC.LIZ.LJIIIIZZ(new long[0]);
                this.LIZ = true;
            } else {
                if (!this.LIZ || C40010Fn4.LIZJ().LJ()) {
                    return;
                }
                if (!EBB.LIZ) {
                    EBC.LIZ.LJIIJJI();
                }
                this.LIZ = false;
            }
        }
    }
}
