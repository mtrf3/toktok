package X;

/* renamed from: X.UnE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78240UnE implements InterfaceC40159FpT {
    public final InterfaceC40159FpT LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLIL.close();
    }

    @Override // X.NV7
    public final void refresh() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLIL.refresh();
    }

    public C78240UnE(C78215Ump c78215Ump) {
        this.LJLIL = c78215Ump;
    }
}
