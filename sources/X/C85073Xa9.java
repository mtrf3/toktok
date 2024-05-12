package X;

/* renamed from: X.Xa9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85073Xa9 implements InterfaceC47896Iqy {
    public final /* synthetic */ C85089XaP LJLIL;
    public final /* synthetic */ InterfaceC85082XaI LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C85073Xa9(C85089XaP c85089XaP, C85075XaB c85075XaB, long j) {
        this.LJLIL = c85089XaP;
        this.LJLILLLLZI = c85075XaB;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC47896Iqy
    public final void LJJIIJZLJL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("  -> seekToTime finish: -> ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        InterfaceC85082XaI interfaceC85082XaI = this.LJLILLLLZI;
        if (interfaceC85082XaI != null) {
            interfaceC85082XaI.LIZ(this.LJLJI, z);
        }
        this.LJLIL.LJ = false;
    }
}
