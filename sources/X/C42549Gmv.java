package X;

/* renamed from: X.Gmv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42549Gmv {
    public static final C5H3 LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        boolean z;
        boolean z2;
        C5H3 LIZ2 = C221108m2.LIZ(EnumC221088m0.NONE, C42550Gmw.LJLIL);
        LIZ = LIZ2;
        boolean z3 = true;
        if ((((Number) LIZ2.getValue()).intValue() & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        if ((((Number) LIZ2.getValue()).intValue() & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ = z2;
        if ((((Number) LIZ2.getValue()).intValue() & 4) == 0) {
            z3 = false;
        }
        LIZLLL = z3;
    }
}
