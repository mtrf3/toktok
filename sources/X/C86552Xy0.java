package X;

/* renamed from: X.Xy0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86552Xy0 {
    public static final Object LIZ = new Object();
    public static volatile C86552Xy0 LIZIZ;

    public static void LIZ() {
        synchronized (LIZ) {
        }
    }

    public C86552Xy0() {
        if (LIZIZ == null) {
        } else {
            throw new RuntimeException("Illegal access.");
        }
    }
}
