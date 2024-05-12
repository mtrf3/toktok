package X;

/* renamed from: X.Vs6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81090Vs6<T> implements InterfaceC47046IdG {
    public final /* synthetic */ C73305Spp LIZ;
    public final /* synthetic */ C81078Vru LIZIZ;
    public final /* synthetic */ C81075Vrr LIZJ;
    public final /* synthetic */ android.net.Uri LIZLLL;
    public final /* synthetic */ int LJ;

    public C81090Vs6(int i, android.net.Uri uri, C73305Spp c73305Spp, C81078Vru c81078Vru, C81075Vrr c81075Vrr) {
        this.LIZ = c73305Spp;
        this.LIZIZ = c81078Vru;
        this.LIZJ = c81075Vrr;
        this.LIZLLL = uri;
        this.LJ = i;
    }

    @Override // X.InterfaceC47046IdG
    public final void onResult(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            this.LIZ.setVisibility(0);
            this.LIZ.LJFF();
            this.LIZIZ.setVisibility(8);
        } else {
            this.LIZ.setVisibility(8);
            this.LIZIZ.setVisibility(0);
        }
        C81075Vrr c81075Vrr = this.LIZJ;
        android.net.Uri uri = this.LIZLLL;
        int i = this.LJ;
        C81078Vru c81078Vru = this.LIZIZ;
        C73305Spp c73305Spp = this.LIZ;
        c81075Vrr.getClass();
        W5F LJFF = W5U.LJFF(uri);
        LJFF.LIZJ = c81075Vrr.LJLILLLLZI;
        LJFF.LJIIIZ(new C81089Vs5(i, uri, c73305Spp, c81078Vru, c81075Vrr));
    }
}
