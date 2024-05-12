package X;

/* renamed from: X.LUc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54334LUc {
    public static volatile C54334LUc LIZIZ;
    public boolean LIZ;

    public static C54334LUc LIZ() {
        if (LIZIZ == null) {
            synchronized (C54334LUc.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C54334LUc();
                }
            }
        }
        return LIZIZ;
    }
}
