package X;

/* renamed from: X.6wL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176536wL {
    public static volatile C176536wL LJ;
    public final boolean LIZ = true;
    public final boolean LIZIZ = true;
    public final boolean LIZJ = true;
    public final boolean LIZLLL = true;

    public static C176536wL LIZ() {
        if (LJ == null) {
            synchronized (C176536wL.class) {
                if (LJ == null) {
                    LJ = new C176536wL();
                }
            }
        }
        return LJ;
    }
}
