package X;

/* renamed from: X.1gK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39201gK implements InterfaceC273715p {
    public int LJLIL;
    public int LJLILLLLZI;
    public long LJLJI = C78996UzQ.LIZIZ(0, 0);
    public long LJLJJI = C274615y.LIZIZ;

    public /* synthetic */ Object LJIIJJI() {
        return null;
    }

    public abstract void LJL(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns);

    public final long LJJZ() {
        int i = this.LJLIL;
        long j = this.LJLJI;
        return C78939UyV.LIZ((i - ((int) (j >> 32))) / 2, (this.LJLILLLLZI - C23490w5.LIZIZ(j)) / 2);
    }

    public int LJJZZI() {
        return C23490w5.LIZIZ(this.LJLJI);
    }

    public int LJJZZIII() {
        return (int) (this.LJLJI >> 32);
    }

    public final void LJLI() {
        this.LJLIL = C78842Uww.LJIIL((int) (this.LJLJI >> 32), C23360vs.LJIIIZ(this.LJLJJI), C23360vs.LJII(this.LJLJJI));
        this.LJLILLLLZI = C78842Uww.LJIIL(C23490w5.LIZIZ(this.LJLJI), C23360vs.LJIIIIZZ(this.LJLJJI), C23360vs.LJI(this.LJLJJI));
    }

    public final void LJLIIIL(long j) {
        if (!C23490w5.LIZ(this.LJLJI, j)) {
            this.LJLJI = j;
            LJLI();
        }
    }

    public final void LJLIIL(long j) {
        if (!C23360vs.LIZIZ(this.LJLJJI, j)) {
            this.LJLJJI = j;
            LJLI();
        }
    }
}
