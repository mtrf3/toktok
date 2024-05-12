package X;

/* renamed from: X.2Hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C56032Hv extends TBS implements InterfaceC88472Yns<Long, C76800UCe> {
    public C56032Hv(C07190Pz c07190Pz) {
        super(1, c07190Pz, C07190Pz.class, "onFrame", "onFrame(J)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        boolean z;
        long longValue = l.longValue();
        C07190Pz c07190Pz = (C07190Pz) this.receiver;
        if (c07190Pz.LIZJ == Long.MIN_VALUE) {
            c07190Pz.LIZJ = longValue;
        }
        long j = longValue - c07190Pz.LIZJ;
        C25710zf<C1JE<?, ?>> c25710zf = c07190Pz.LIZ;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            C1JE<?, ?>[] c1jeArr = c25710zf.LJLIL;
            int i2 = 0;
            z = true;
            do {
                C1JE<?, ?> c1je = c1jeArr[i2];
                if (!c1je.LJLJL) {
                    c1je.LJLL.LIZIZ.setValue(Boolean.FALSE);
                    if (c1je.LJLJLJ) {
                        c1je.LJLJLJ = false;
                        c1je.LJLJLLL = j;
                    }
                    long j2 = j - c1je.LJLJLLL;
                    c1je.LJLJJL.setValue(c1je.LJLJJLL.LJ(j2));
                    C1J8<?, ?> c1j8 = c1je.LJLJJLL;
                    c1j8.getClass();
                    c1je.LJLJL = C07120Ps.LIZ(c1j8, j2);
                }
                if (!c1je.LJLJL) {
                    z = false;
                }
                i2++;
            } while (i2 < i);
        } else {
            z = true;
        }
        c07190Pz.LIZLLL.setValue(Boolean.valueOf(!z));
        return C76800UCe.LIZ;
    }
}
