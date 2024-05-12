package X;

/* renamed from: X.3LR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LR {
    public static final C3LR LIZ = new C3LR();
    public static C3LD LIZIZ;

    public static C3LD LIZ() {
        C3LD c3ld = LIZIZ;
        if (c3ld == null) {
            synchronized (C3LR.class) {
                c3ld = LIZIZ;
                if (c3ld == null) {
                    c3ld = new C3LD();
                    LIZIZ = c3ld;
                }
            }
        }
        return c3ld;
    }
}
