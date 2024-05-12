package X;

/* loaded from: classes12.dex */
public final class PVL extends PVM {
    public final C39745Fin LJLIL;
    public final long LJLILLLLZI;

    @Override // X.PVM
    public final PW3 source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // X.PVM
    public final long contentLength() {
        return this.LJLILLLLZI;
    }

    @Override // X.PVM
    public final C39745Fin contentType() {
        return this.LJLIL;
    }

    public PVL(C39745Fin c39745Fin, long j) {
        this.LJLIL = c39745Fin;
        this.LJLILLLLZI = j;
    }
}
