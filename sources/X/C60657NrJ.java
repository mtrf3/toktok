package X;

/* renamed from: X.NrJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60657NrJ extends OM2 {
    public final /* synthetic */ C60658NrK LJLIL;

    @Override // X.OM2
    public final void LJFF() {
        InterfaceC60656NrI interfaceC60656NrI = this.LJLIL.LJLJL;
        if (interfaceC60656NrI != null) {
            interfaceC60656NrI.onDestroy();
        }
        super.LJFF();
    }

    @Override // X.AbstractC60536NpM
    public final /* bridge */ /* synthetic */ AbstractC60629Nqr getExtension() {
        return this.LJLIL;
    }

    public C60657NrJ(C60658NrK c60658NrK) {
        this.LJLIL = c60658NrK;
    }

    @Override // X.OM2
    public final void LJJIFFI(String str) {
        InterfaceC60656NrI interfaceC60656NrI;
        if (str != null && (interfaceC60656NrI = this.LJLIL.LJLJL) != null) {
            interfaceC60656NrI.loadUrl(str);
        }
        super.LJJIFFI(str);
    }

    @Override // X.OM2
    public final void LJJII(String str, java.util.Map<String, String> map) {
        InterfaceC60656NrI interfaceC60656NrI;
        if (str != null && (interfaceC60656NrI = this.LJLIL.LJLJL) != null) {
            interfaceC60656NrI.loadUrl(str);
        }
        super.LJJII(str, map);
    }
}
