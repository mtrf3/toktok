package X;

/* renamed from: X.3RE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RE extends AbstractC65781Prl implements InterfaceC65784Pro<C3R2> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ EnumC84123Rw LJLJJI;
    public final /* synthetic */ Boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RE(boolean z, boolean z2, String str, EnumC84123Rw enumC84123Rw, Boolean bool, boolean z3, String str2) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = str;
        this.LJLJJI = enumC84123Rw;
        this.LJLJJL = bool;
        this.LJLJJLL = z3;
        this.LJLJL = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C3R2 invoke() {
        C3R9 c3r9 = new C3R9(2, this.LJLIL);
        boolean z = this.LJLILLLLZI;
        String str = this.LJLJI;
        EnumC84123Rw enumC84123Rw = this.LJLJJI;
        Boolean bool = this.LJLJJL;
        boolean z2 = this.LJLJJLL;
        String str2 = this.LJLJL;
        c3r9.LJI = true;
        c3r9.LJIIIZ = true;
        c3r9.LJIIIIZZ = z;
        c3r9.LIZLLL = str;
        c3r9.LJIIJJI = enumC84123Rw;
        c3r9.LJIIJ = !z;
        c3r9.LIZJ = bool;
        c3r9.LJIILL = z2;
        c3r9.LJIJ = str2;
        return new C3R2(c3r9);
    }
}
