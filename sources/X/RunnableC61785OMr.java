package X;

/* renamed from: X.OMr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61785OMr implements Runnable {
    public static final RunnableC61785OMr LJLIL = new RunnableC61785OMr();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (C61780OMm.LIZLLL) {
                if (IWF.LJJLIIIIJ().isPlaying()) {
                    IWF.LJJLIIIIJ().LJIILJJIL();
                    C61780OMm.LJ = true;
                } else {
                    C61780OMm.LJIIIZ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
