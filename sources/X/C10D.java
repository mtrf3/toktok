package X;

/* renamed from: X.10D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10D {
    public static final C10D LIZIZ = new C10D();
    public static final int LIZJ;
    public static final int LIZLLL;
    public final C10C LIZ = new C10C();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        LIZJ = availableProcessors + 1;
        LIZLLL = (availableProcessors * 2) + 1;
    }
}
