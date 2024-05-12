package X;

/* renamed from: X.Igc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47254Igc implements Runnable {
    public final /* synthetic */ C47255Igd LJLIL;

    public final void LIZ() {
        C16880lQ.LLLZ("PreRenderTask do pre render. aid:%s", new Object[]{this.LJLIL.LJLJI.getKey()});
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepareNext: setSurface:");
        LIZ.append(this.LJLIL.LJLILLLLZI.getSurface());
        X1D.LIZIZ(LIZ);
        C47255Igd c47255Igd = this.LJLIL;
        c47255Igd.LJLIL.LJIIIIZZ(C46810IYs.LIZ(c47255Igd.LJLJI, c47255Igd.LJLILLLLZI.getSurface()));
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

    public RunnableC47254Igc(C47255Igd c47255Igd) {
        this.LJLIL = c47255Igd;
    }
}
