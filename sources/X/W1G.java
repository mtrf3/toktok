package X;

/* loaded from: classes15.dex */
public final class W1G implements X5Z {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJ;
    public final /* synthetic */ String LJFF;

    @Override // X.X5Z
    public final void LIZJ() {
    }

    @Override // X.X5Z
    public final void LIZIZ() {
        C44687HgJ.LJIILJJIL(this.LIZIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ);
        LIZ.append('/');
        LIZ.append(this.LIZLLL);
        LIZ.append('/');
        C44687HgJ.LJIILIIL(X1D.LIZIZ(LIZ));
        this.LJ.invoke();
        C82800Wea.LIZJ(this.LIZLLL, this.LJFF, false, false, "unzip failed");
    }

    @Override // X.X5Z
    public final void LIZ(String str) {
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (str == null) {
            str = "";
        }
        interfaceC88472Yns.invoke(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W1G(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, String str, String str2, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str4) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = interfaceC65784Pro;
        this.LJFF = str4;
    }
}
