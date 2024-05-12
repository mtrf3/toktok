package X;

/* renamed from: X.WAt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81859WAt implements WB6 {
    public static C81859WAt LIZ;

    @Override // X.WB6
    public final void LIZ(PML pml) {
    }

    public static synchronized C81859WAt LIZIZ() {
        C81859WAt c81859WAt;
        synchronized (C81859WAt.class) {
            if (LIZ == null) {
                LIZ = new C81859WAt();
            }
            c81859WAt = LIZ;
        }
        return c81859WAt;
    }
}
