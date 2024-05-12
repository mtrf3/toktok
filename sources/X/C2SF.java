package X;

/* renamed from: X.2SF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SF {
    public static boolean LIZ() {
        Object LIZ;
        try {
            FFL.LJIIIZ().getClass();
            boolean z = true;
            if (FFL.LJIIJ(31744, 0, "ec_pdp_image_format_size_opt", true) != 1) {
                z = false;
            }
            LIZ = Boolean.valueOf(z);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Boolean bool = Boolean.FALSE;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = bool;
        }
        return ((Boolean) LIZ).booleanValue();
    }
}
