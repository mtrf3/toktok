package X;

/* loaded from: classes12.dex */
public final class PVO extends PVM {
    public final /* synthetic */ C39745Fin LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ PW3 LJLJI;

    @Override // X.PVM
    public final long contentLength() {
        return this.LJLILLLLZI;
    }

    @Override // X.PVM
    public final C39745Fin contentType() {
        return this.LJLIL;
    }

    @Override // X.PVM
    public final PW3 source() {
        return this.LJLJI;
    }

    public PVO(C39745Fin c39745Fin, long j, PW3 pw3) {
        this.LJLIL = c39745Fin;
        this.LJLILLLLZI = j;
        this.LJLJI = pw3;
    }
}
