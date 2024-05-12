package X;

/* loaded from: classes14.dex */
public final class USC implements USO {
    @Override // X.USO
    public final C77202URq LIZ(C77207URv c77207URv) {
        C77202URq c77202URq;
        synchronized (USW.LIZ) {
            if (USW.LIZIZ == null) {
                USW.LIZIZ = new C77202URq(c77207URv);
                c77202URq = USW.LIZIZ;
                if (c77202URq == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                c77202URq = null;
            }
        }
        return c77202URq;
    }

    @Override // X.USO
    public final USE LIZIZ(C77210URy c77210URy) {
        return new USE(c77210URy);
    }
}
