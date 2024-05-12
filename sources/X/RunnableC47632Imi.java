package X;

/* renamed from: X.Imi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47632Imi implements Runnable {
    public InterfaceC47775Ip1 LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL != null) {
                try {
                    C46496IMq.LIZJ();
                    this.LJLIL.release();
                    this.LJLIL = null;
                } catch (Exception e) {
                    e.toString();
                    C46496IMq.LIZJ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47632Imi(InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLIL = interfaceC47775Ip1;
    }
}
