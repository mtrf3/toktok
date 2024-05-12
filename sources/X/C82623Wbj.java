package X;

import Y.ARunnableS11S0101000_7;

/* renamed from: X.Wbj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82623Wbj extends AbstractC82626Wbm<Object> {
    public final /* synthetic */ C83683Qe LIZIZ;
    public final /* synthetic */ C15070iV LIZJ;
    public final /* synthetic */ C82622Wbi LIZLLL;

    @Override // X.AbstractC82626Wbm
    public final Object LIZ() {
        C82622Wbi c82622Wbi = this.LIZLLL;
        C83683Qe c83683Qe = this.LIZIZ;
        QBF qbf = new QBF(this.LIZJ);
        if (c82622Wbi.LJIIJJI == null) {
            try {
                Object LIZLLL = c82622Wbi.LIZLLL(c83683Qe, qbf);
                if (LIZLLL != null) {
                    return LIZLLL;
                }
                throw new C79534VJi("impossible");
            } catch (RuntimeException e) {
                c82622Wbi.LJIIJJI = e;
                EVG evg = C82622Wbi.LJIILIIL;
                evg.LIZ.postAtFrontOfQueue(new ARunnableS11S0101000_7(0, e, 17));
                throw e;
            }
        }
        throw c82622Wbi.LJIIJJI;
    }

    public C82623Wbj(C82622Wbi c82622Wbi, C83683Qe c83683Qe, C15070iV c15070iV) {
        this.LIZLLL = c82622Wbi;
        this.LIZIZ = c83683Qe;
        this.LIZJ = c15070iV;
    }
}
