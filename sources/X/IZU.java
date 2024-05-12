package X;

/* loaded from: classes9.dex */
public final class IZU extends C46742IWc {
    public InterfaceC46826IZi LJLJI;
    public InterfaceC46803IYl LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public final IZV LJLLILLLL;
    public final C46802IYk LJLLJ;

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player != null) {
            player.LLJL(new IZZ(this));
        }
    }

    public IZU(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
        this.LJLLILLLL = new IZV(this);
        this.LJLLJ = new C46802IYk(this);
    }
}
