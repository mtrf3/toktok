package X;

/* renamed from: X.LUa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54332LUa {
    public static volatile C54332LUa LIZIZ;
    public final C54335LUd LIZ = new C54335LUd();

    public static C54332LUa LIZ() {
        if (LIZIZ == null) {
            synchronized (C54332LUa.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C54332LUa();
                }
            }
        }
        return LIZIZ;
    }
}
