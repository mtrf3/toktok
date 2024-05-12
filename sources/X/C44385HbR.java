package X;

/* renamed from: X.HbR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44385HbR {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;

    public static int LIZ() {
        return C00F.LIZ(31744, 0, "ecom_pdp_header_video", true);
    }

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (LIZ() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        LIZ();
        if (LIZ() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZIZ = z2;
        if (LIZ() == 3) {
            z3 = true;
        }
        LIZJ = z3;
    }
}
