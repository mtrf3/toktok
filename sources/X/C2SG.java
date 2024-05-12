package X;

/* renamed from: X.2SG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SG {
    public static int LIZ() {
        Object LIZ;
        try {
            FFL.LJIIIZ().getClass();
            LIZ = Integer.valueOf(FFL.LJIIJ(31744, 0, "pdp_search_entrance_type", true));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num = (Integer) LIZ;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
