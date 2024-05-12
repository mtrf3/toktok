package X;

/* renamed from: X.JfP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC49727JfP implements Runnable {
    public static final RunnableC49727JfP LJLIL = new RunnableC49727JfP();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (C49786JgM.LIZ > 0) {
                C10K.LIZJ(new CallableC36894Edu(System.currentTimeMillis() - C49786JgM.LIZ));
                C49786JgM.LIZ = 0L;
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
