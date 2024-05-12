package X;

/* loaded from: classes14.dex */
public final class TR4 implements Runnable {
    public static final TR4 LJLIL = new TR4();

    public static void LIZ() {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEnterBackGround, backgroundStartTimeMills=");
        LIZ.append(TR8.LIZLLL);
        LIZ.append(", isAudienceOnline=");
        LIZ.append(TR8.LIZ);
        LIZ.append(", isVideoMute=");
        LIZ.append(TR8.LIZIZ());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ);
        if (TR8.LIZLLL == 0 && TR8.LIZ && !TR8.LIZIZ()) {
            TR8.LIZLLL = System.currentTimeMillis();
            C28733BPl LJIILIIL2 = C28733BPl.LJIILIIL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("backgroundStartTimeMills, backgroundStartTimeMills=");
            LIZ2.append(TR8.LIZLLL);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            LJIILIIL2.getClass();
            C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
