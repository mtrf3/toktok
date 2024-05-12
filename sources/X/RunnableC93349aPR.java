package X;

/* renamed from: X.aPR, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public class RunnableC93349aPR implements Runnable {
    public final int LJLIL;
    public final /* synthetic */ C93396aQC LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } finally {
                if (LIZ) {
                }
            }
        } catch (InterruptedException unused) {
        }
        this.LJLILLLLZI.LJII(this.LJLIL);
    }

    public RunnableC93349aPR(C93396aQC c93396aQC, int i) {
        this.LJLILLLLZI = c93396aQC;
        this.LJLIL = i;
    }
}
