package X;

/* renamed from: X.JwZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50791JwZ implements Runnable {
    public static final RunnableC50791JwZ LJLIL = new RunnableC50791JwZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        C50789JwX c50789JwX;
        try {
            C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
            if (c50789JwX2 != null && c50789JwX2.LIZJ > 0) {
                c50789JwX2.LJJIIJZLJL = System.currentTimeMillis() - c50789JwX2.LIZJ;
                if (c50789JwX2.LIZIZ == 0 && (c50789JwX = C50768JwC.LIZIZ) != null && c50789JwX.LIZJ != 0) {
                    C38995FSd.LIZLLL().execute(RunnableC50787JwV.LJLIL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
