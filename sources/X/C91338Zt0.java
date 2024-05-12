package X;

/* renamed from: X.Zt0, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91338Zt0 implements InterfaceC47896Iqy {
    public final /* synthetic */ C91061ZoX LJLIL;
    public final /* synthetic */ InterfaceC91059ZoV LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C91338Zt0(C91061ZoX c91061ZoX, C91332Zsu c91332Zsu, long j) {
        this.LJLIL = c91061ZoX;
        this.LJLILLLLZI = c91332Zsu;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC47896Iqy
    public final void LJJIIJZLJL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("  -> seekToTime finish: -> ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        InterfaceC91059ZoV interfaceC91059ZoV = this.LJLILLLLZI;
        if (interfaceC91059ZoV != null) {
            interfaceC91059ZoV.LIZ(this.LJLJI, z);
        }
        this.LJLIL.LJ = false;
    }
}
