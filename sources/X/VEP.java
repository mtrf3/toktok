package X;

/* loaded from: classes15.dex */
public final class VEP extends QXX {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VES LJLILLLLZI;
    public final /* synthetic */ VEQ LJLJI;

    @Override // X.QXX
    public final void LLLILZJ(VEH<byte[]> veh) {
        if (veh.LIZIZ == -3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lynx service exception, retry with other fetchers, url: ");
            C13870gZ.LIZJ(LIZ, this.LJLIL, LIZ, 3, "LynxExternalResourceFetcherWrapper");
            this.LJLJI.LIZ(this.LJLIL, this.LJLILLLLZI);
            return;
        }
        this.LJLILLLLZI.LIZ(veh.LIZJ, veh.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VEP(VEQ veq, String str, VES ves) {
        super((Object) null);
        this.LJLJI = veq;
        this.LJLIL = str;
        this.LJLILLLLZI = ves;
    }
}
