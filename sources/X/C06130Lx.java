package X;

/* renamed from: X.0Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06130Lx {
    public static volatile C06130Lx LIZIZ;
    public int LIZ;

    public static C06130Lx LIZ() {
        if (LIZIZ == null) {
            synchronized (C06130Lx.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C06130Lx();
                }
            }
        }
        return LIZIZ;
    }
}
