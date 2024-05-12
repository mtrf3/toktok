package X;

/* renamed from: X.2LE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2LE implements Runnable {
    public static final C2LE LJLIL = new C2LE();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C2LF c2lf = C80X.LJII;
            if (c2lf != null) {
                C80X.LJI.removeCallbacks(C80X.LJIIIIZZ);
                C80X.LJFF = null;
                C80X.LJ = null;
                c2lf.call();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
