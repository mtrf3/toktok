package X;

import Y.IDeS156S0200000_13;

/* renamed from: X.Uxu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78902Uxu implements UDJ {
    public final /* synthetic */ C78907Uxz LIZ;
    public final /* synthetic */ FragmentC78904Uxw LIZIZ;

    @Override // X.UDJ
    public final void cancel() {
        this.LIZ.LIZ();
        C78907Uxz c78907Uxz = this.LIZ;
        c78907Uxz.LJ.LJ("DENY_FROM_RATIONAL", c78907Uxz.LIZJ);
    }

    @Override // X.UDJ
    public final void execute() {
        FragmentC78904Uxw fragmentC78904Uxw = this.LIZIZ;
        C78907Uxz c78907Uxz = this.LIZ;
        fragmentC78904Uxw.getClass();
        int LJJIIJ = C78897Uxp.LJJIIJ(c78907Uxz.LIZJ) & 65535;
        C012403c.LJ("doRequestPermissions: requestCode = ", LJJIIJ, "PermissionFragment");
        fragmentC78904Uxw.LJLIL.LJI(LJJIIJ, c78907Uxz);
        C61099NyR.LIZIZ(c78907Uxz.LIZ, c78907Uxz.LIZIZ).LIZ(c78907Uxz.LIZLLL).LIZJ(new IDeS156S0200000_13(c78907Uxz, fragmentC78904Uxw, 3));
        C78907Uxz c78907Uxz2 = this.LIZ;
        c78907Uxz2.LJ.LIZJ(c78907Uxz2.LIZJ);
    }

    public C78902Uxu(FragmentC78904Uxw fragmentC78904Uxw, C78907Uxz c78907Uxz) {
        this.LIZIZ = fragmentC78904Uxw;
        this.LIZ = c78907Uxz;
    }
}
