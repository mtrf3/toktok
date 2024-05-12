package X;

/* renamed from: X.aAi, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92436aAi extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ int LJLLI;
    public final /* synthetic */ int LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92436aAi(int i, int i2, int i3, InterfaceC07790Sh interfaceC07790Sh, String str, String str2, String str3, String str4, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, boolean z, boolean z2) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC88472Yns2;
        this.LJLJJL = i;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = str4;
        this.LJLLI = i2;
        this.LJLLILLLL = i3;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        C40431iJ c40431iJ;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            InterfaceC91774a02 editText = C91665ZyH.LIZ().getEditText();
            String str = this.LJLIL;
            InterfaceC07790Sh interfaceC07790Sh = this.LJLILLLLZI;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLJI;
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = this.LJLJJI;
            int i = this.LJLJJL;
            C18880oe c18880oe = new C18880oe(3, 0, 11);
            InterfaceC14810i5.LIZ.getClass();
            C1U3 c1u3 = C1U3.LIZIZ;
            String str2 = this.LJLJJLL;
            String str3 = this.LJLJL;
            boolean z = this.LJLJLJ;
            boolean z2 = this.LJLJLLL;
            C92440aAm c92440aAm = C92440aAm.LJLIL;
            String str4 = this.LJLL;
            if (str4 == null || str4.length() == 0) {
                c40431iJ = null;
            } else {
                c40431iJ = C1DJ.LJ(interfaceC24520xk2, -819892730, new C92455aB1(this.LJLL, this.LJLLI));
            }
            int i2 = this.LJLLI;
            int i3 = i2 >> 6;
            editText.LIZ(str, interfaceC07790Sh, interfaceC88472Yns, interfaceC88472Yns2, i, c18880oe, null, c1u3, str2, str3, z, z2, false, c92440aAm, c40431iJ, null, true, 1, null, interfaceC24520xk2, (i2 & 14) | 14155776 | (i2 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | ((i2 << 15) & 234881024) | (1879048192 & (i2 << 6)), ((i2 >> 24) & 14) | 1188760960 | ((this.LJLLILLLL << 3) & 112));
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
