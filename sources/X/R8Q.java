package X;

/* loaded from: classes12.dex */
public final class R8Q<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C1HQ<String, String> LJ;
    public final /* synthetic */ EnumC69116RAq LJFF;
    public final /* synthetic */ EnumC69113RAn LJI;

    public R8Q(InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, C1HQ<String, String> c1hq, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = c1hq;
        this.LJFF = enumC69116RAq;
        this.LJI = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8K r8k = new R8K(c73516StE, this.LJFF, this.LJI);
        this.LIZ.bi(r8k);
        this.LIZ.r9().LJIIIIZZ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, r8k);
    }
}
