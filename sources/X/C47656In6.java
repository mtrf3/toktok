package X;

/* renamed from: X.In6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47656In6 {
    public static C47656In6 LJI;
    public int LIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LIZIZ = -1;
    public boolean LJ = true;
    public boolean LJFF = true;

    public static synchronized C47656In6 LIZ() {
        C47656In6 c47656In6;
        synchronized (C47656In6.class) {
            if (LJI == null) {
                LJI = new C47656In6();
            }
            c47656In6 = LJI;
        }
        return c47656In6;
    }
}
