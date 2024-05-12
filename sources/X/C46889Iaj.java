package X;

/* renamed from: X.Iaj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46889Iaj extends C46742IWc {
    public final C46890Iak LJLJI;

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        int i = this.LJLILLLLZI.s7().get(59, 0);
        player.LJLLLL(664, i);
        if (1 == i) {
            player.LIZ.LLZZJLIL = this.LJLJI;
        }
    }

    public C46889Iaj(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
        this.LJLJI = new C46890Iak(this);
    }
}
