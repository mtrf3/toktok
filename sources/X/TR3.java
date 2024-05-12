package X;

/* loaded from: classes14.dex */
public final class TR3 implements Runnable {
    public static final TR3 LJLIL = new TR3();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onEnterForeGround, backgroundStartTimeMills=");
            LIZ2.append(TR8.LIZLLL);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            LJIILIIL.getClass();
            C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ);
            if (TR8.LIZLLL > 0) {
                TR8.LIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
