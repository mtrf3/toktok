package X;

/* renamed from: X.Iga, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47252Iga implements Runnable {
    public final /* synthetic */ C47256Ige LJLIL;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResumeCommand: setSurface:");
        LIZ.append(this.LJLIL.LIZIZ.getSurface());
        X1D.LIZIZ(LIZ);
        C47256Ige c47256Ige = this.LJLIL;
        c47256Ige.LIZ.setSurface(c47256Ige.LIZIZ.getSurface());
        this.LJLIL.LIZ.resume();
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

    public RunnableC47252Iga(C47256Ige c47256Ige) {
        this.LJLIL = c47256Ige;
    }
}
