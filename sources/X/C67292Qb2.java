package X;

/* renamed from: X.Qb2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67292Qb2 implements QZL {
    public final java.util.Set<C67365QcD> LIZ;
    public final AbstractC67354Qc2 LIZIZ;
    public final InterfaceC67293Qb3 LIZJ;

    public C67292Qb2(java.util.Set set, C67355Qc3 c67355Qc3, InterfaceC67293Qb3 interfaceC67293Qb3) {
        this.LIZ = set;
        this.LIZIZ = c67355Qc3;
        this.LIZJ = interfaceC67293Qb3;
    }

    @Override // X.QZL
    public final C67360Qc8 LIZ(String str, C67365QcD c67365QcD, InterfaceC67369QcH interfaceC67369QcH) {
        if (this.LIZ.contains(c67365QcD)) {
            return new C67360Qc8(this.LIZIZ, str, c67365QcD, interfaceC67369QcH, this.LIZJ);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{c67365QcD, this.LIZ}));
    }
}
