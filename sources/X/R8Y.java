package X;

/* loaded from: classes12.dex */
public final class R8Y<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ java.util.Map<String, String> LIZLLL;
    public final /* synthetic */ EnumC69116RAq LJ;
    public final /* synthetic */ EnumC69113RAn LJFF;

    public R8Y(InterfaceC69056R8i interfaceC69056R8i, String str, int i, java.util.Map<String, String> map, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = map;
        this.LJ = enumC69116RAq;
        this.LJFF = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8Z r8z = new R8Z(c73516StE, this.LJ, this.LJFF);
        this.LIZ.bi(r8z);
        this.LIZ.r9().LJIIL(this.LIZIZ, this.LIZJ, 1, "", this.LIZLLL, r8z);
    }
}
