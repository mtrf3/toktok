package X;

/* renamed from: X.2SD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SD {
    public static final boolean LIZ() {
        Object LIZ;
        try {
            FFL.LJIIIZ().getClass();
            boolean z = true;
            if (!FFL.LJ(31744, "ec_vertical_search_chunk_request_enable_v4", true, false)) {
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
