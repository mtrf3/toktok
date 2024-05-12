package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aDv, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92635aDv extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ int LJLLI;
    public final /* synthetic */ boolean LJLLILLLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92635aDv(String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i, String str2, String str3, boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i2, int i3, boolean z3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC88472Yns2;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLJLLL = interfaceC65784Pro;
        this.LJLL = i2;
        this.LJLLI = i3;
        this.LJLLILLLL = z3;
        this.LJLLJ = interfaceC65784Pro2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        int i;
        InterfaceC07790Sh it = interfaceC07790Sh;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(it, "it");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk2.LJIJJ(it)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if (((intValue & 91) ^ 18) != 0 || !interfaceC24520xk2.LIZ()) {
            C18880oe c18880oe = new C18880oe(3, 0, 11);
            C92157a6D c92157a6D = new C92157a6D();
            String str = this.LJLIL;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = this.LJLJI;
            int i2 = this.LJLJJI;
            String str2 = this.LJLJJL;
            String str3 = this.LJLJJLL;
            boolean z = this.LJLJL;
            boolean z2 = this.LJLJLJ;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLLL;
            C40431iJ LJ = C1DJ.LJ(interfaceC24520xk2, -819894135, new C92637aDx(this.LJLLILLLL, z2, this.LJLLJ));
            int i3 = this.LJLL;
            int i4 = i3 >> 3;
            int i5 = this.LJLLI;
            C92026a46.LIZ(str, it, interfaceC88472Yns, interfaceC88472Yns2, i2, c18880oe, null, c92157a6D, str2, str3, z, z2, false, interfaceC65784Pro, null, LJ, false, 0, null, interfaceC24520xk2, ((i3 << 18) & 234881024) | (i3 & 14) | ((intValue << 3) & 112) | (i4 & 896) | (i4 & 7168) | ((i3 >> 15) & 57344) | ((i5 << 21) & 1879048192), ((i5 >> 9) & 14) | 196608 | ((i5 >> 12) & 112) | ((i5 << 6) & 7168), 479296);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
