package X;

/* loaded from: classes6.dex */
public final class C22 implements Runnable {
    public static final C22 LJLIL = new C22();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            RunnableC30666C1u runnableC30666C1u = C2S.LIZ;
            if (runnableC30666C1u != null) {
                C15610jN.LIZ().removeCallbacks(runnableC30666C1u);
            }
            C2S.LIZ = null;
        } finally {
            if (LIZ) {
            }
        }
    }
}
