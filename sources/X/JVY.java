package X;

/* loaded from: classes9.dex */
public final class JVY implements Runnable {
    public static final JVY LJLIL = new JVY();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            JVZ jvz = JVW.LIZ;
            if (jvz != null) {
                long currentTimeMillis = System.currentTimeMillis();
                jvz.LJIIJ = true;
                C10K.LJII(3000L).LIZLLL(new JVX(jvz, currentTimeMillis));
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}