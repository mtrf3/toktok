package X;

/* renamed from: X.JfO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC49726JfO implements Runnable {
    public static final RunnableC49726JfO LJLIL = new RunnableC49726JfO();

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
