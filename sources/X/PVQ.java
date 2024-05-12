package X;

/* loaded from: classes12.dex */
public final class PVQ extends PVM {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final PW3 LJLJI;

    @Override // X.PVM
    public final C39745Fin contentType() {
        String str = this.LJLIL;
        if (str != null) {
            return C39745Fin.LIZJ(str);
        }
        return null;
    }

    @Override // X.PVM
    public final long contentLength() {
        return this.LJLILLLLZI;
    }

    @Override // X.PVM
    public final PW3 source() {
        return this.LJLJI;
    }

    public PVQ(String str, long j, C64532PUi c64532PUi) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = c64532PUi;
    }
}
