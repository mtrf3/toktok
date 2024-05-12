package X;

/* renamed from: X.I2k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45970I2k implements WSH {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public InterfaceC82086WJm LJLJJL;

    @Override // X.WSH
    public final boolean enable() {
        return true;
    }

    @Override // X.WSH
    public final WT3 provideScene() {
        return null;
    }

    @Override // X.WSH
    public final WSF createBottomTabItem(C45850Hz4 c45850Hz4) {
        return new WSF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new C45969I2j(c45850Hz4, this));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        this.LJLJJL = c45850Hz4.LIZIZ();
    }

    public C45970I2k(String str, String str2, String str3, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = z;
    }
}
