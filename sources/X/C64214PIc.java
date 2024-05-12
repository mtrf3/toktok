package X;

/* renamed from: X.PIc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64214PIc {
    public static volatile C64284PKu LIZ;

    public static C64284PKu LIZ() {
        if (LIZ == null) {
            LIZIZ();
        }
        return LIZ;
    }

    public static HandlerThreadC64288PKy LIZIZ() {
        if (LIZ == null) {
            synchronized (C64214PIc.class) {
                if (LIZ == null) {
                    LIZ = new C64284PKu();
                    LIZ.LIZ.start();
                }
            }
        }
        return LIZ.LIZ;
    }
}
