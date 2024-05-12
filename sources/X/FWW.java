package X;

/* loaded from: classes7.dex */
public final class FWW implements Runnable {
    public static final FWW LJLIL = new FWW();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                C48236IwS.LJIIZILJ();
                C48236IwS.LIZLLL = true;
                C48236IwS.LJ.countDown();
            } catch (Throwable th) {
                C48236IwS.LIZLLL = true;
                C48236IwS.LJ.countDown();
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
