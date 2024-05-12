package X;

/* renamed from: X.J2b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48509J2b implements InterfaceC48516J2i {
    public final /* synthetic */ C48511J2d LIZ;
    public final /* synthetic */ InterfaceC48512J2e LIZIZ;
    public final /* synthetic */ IFF LIZJ;

    @Override // X.InterfaceC48516J2i
    public final void LIZ(C47333Iht c47333Iht) {
        if (c47333Iht != null) {
            C48044ItM c48044ItM = new C48044ItM();
            c48044ItM.LIZ = c47333Iht.LIZ;
            c48044ItM.LIZIZ = c47333Iht.LIZIZ;
            c48044ItM.LIZJ = c47333Iht.LIZJ;
            c48044ItM.LIZLLL = c47333Iht.LIZLLL;
            if (c48044ItM.LIZ()) {
                this.LIZ.LIZIZ = c48044ItM;
            }
            InterfaceC48512J2e interfaceC48512J2e = this.LIZIZ;
            if (interfaceC48512J2e != null) {
                interfaceC48512J2e.LIZ(c47333Iht.LIZ(), c47333Iht.LJ, c48044ItM, this.LIZJ);
                return;
            }
            return;
        }
        InterfaceC48512J2e interfaceC48512J2e2 = this.LIZIZ;
        if (interfaceC48512J2e2 == null) {
            return;
        }
        interfaceC48512J2e2.LIZ(false, -5, null, this.LIZJ);
    }

    public C48509J2b(C48511J2d c48511J2d, InterfaceC48512J2e interfaceC48512J2e, IFF iff) {
        this.LIZ = c48511J2d;
        this.LIZIZ = interfaceC48512J2e;
        this.LIZJ = iff;
    }
}
