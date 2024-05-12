package X;

/* renamed from: X.Vrs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81076Vrs extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ C81075Vrr LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C81078Vru LJLJJI;
    public final /* synthetic */ C73305Spp LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81076Vrs(int i, android.net.Uri uri, C73305Spp c73305Spp, C81078Vru c81078Vru, C81075Vrr c81075Vrr) {
        super(0);
        this.LJLIL = uri;
        this.LJLILLLLZI = c81075Vrr;
        this.LJLJI = i;
        this.LJLJJI = c81078Vru;
        this.LJLJJL = c73305Spp;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        android.net.Uri uri = this.LJLIL;
        if (uri != null) {
            C81075Vrr c81075Vrr = this.LJLILLLLZI;
            int i = this.LJLJI;
            C81078Vru c81078Vru = this.LJLJJI;
            C73305Spp c73305Spp = this.LJLJJL;
            c81075Vrr.getClass();
            InterfaceC70869Rrd LIZJ = W5U.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZJ(uri, new C81090Vs6(i, uri, c73305Spp, c81078Vru, c81075Vrr));
            }
        }
        return C76800UCe.LIZ;
    }
}
