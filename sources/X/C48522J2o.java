package X;

/* renamed from: X.J2o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48522J2o implements InterfaceC48516J2i {
    public final /* synthetic */ C48523J2p LIZ;
    public final /* synthetic */ C47322Ihi LIZIZ;
    public final /* synthetic */ AbstractC48521J2n LIZJ;
    public final /* synthetic */ InterfaceC48516J2i LIZLLL;
    public final /* synthetic */ long LJ;

    @Override // X.InterfaceC48516J2i
    public final void LIZ(C47333Iht c47333Iht) {
        C48524J2q c48524J2q = this.LIZ.LIZLLL;
        if (c48524J2q != null) {
            c48524J2q.LIZJ(this.LIZIZ, c47333Iht, this.LIZJ);
        }
        this.LIZ.LJFF = c47333Iht;
        InterfaceC48516J2i interfaceC48516J2i = this.LIZLLL;
        if (interfaceC48516J2i != null) {
            interfaceC48516J2i.LIZ(c47333Iht);
        }
        if (c47333Iht != null && c47333Iht.LIZ()) {
            this.LIZ.LJIIIIZZ = 0;
        } else {
            this.LIZ.LJIIIIZZ++;
        }
        if (J3Y.LIZ) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJ;
            J3Y.LIZ(this.LIZ.LIZIZ, "run end, cost:" + currentTimeMillis + " result:" + c47333Iht);
        }
    }

    public C48522J2o(C48523J2p c48523J2p, C47322Ihi c47322Ihi, AbstractC48521J2n abstractC48521J2n, InterfaceC48516J2i interfaceC48516J2i, long j) {
        this.LIZ = c48523J2p;
        this.LIZIZ = c47322Ihi;
        this.LIZJ = abstractC48521J2n;
        this.LIZLLL = interfaceC48516J2i;
        this.LJ = j;
    }
}
