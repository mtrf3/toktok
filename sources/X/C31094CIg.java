package X;

/* renamed from: X.CIg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31094CIg {
    public static volatile C31094CIg LIZIZ;
    public boolean LIZ;

    public static C31094CIg LIZ() {
        if (LIZIZ == null) {
            synchronized (C31094CIg.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C31094CIg();
                }
            }
        }
        return LIZIZ;
    }
}
