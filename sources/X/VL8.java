package X;

/* loaded from: classes15.dex */
public final class VL8 implements Runnable {
    public static final VL8 LJLIL = new VL8();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!VL7.LJFF) {
                VL7.LJII = null;
                Runnable runnable = VL7.LJIIIIZZ;
                if (runnable != null) {
                    runnable.run();
                }
                VL7.LJIIIIZZ = null;
                C55537Lqv c55537Lqv = VL7.LJII;
                if (c55537Lqv != null) {
                    c55537Lqv.LIZJ();
                }
                VL7.LJII = null;
                VL7.LJIIIIZZ = null;
                VL7.LJFF = true;
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
