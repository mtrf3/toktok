package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aAS, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92420aAS extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92420aAS(int i, int i2, String str, String str2, String str3, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, boolean z, boolean z2) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC88472Yns2;
        this.LJLJJL = i;
        this.LJLJJLL = str3;
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLJLLL = i2;
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
            C92149a65 c92149a65 = new C92149a65();
            String str = this.LJLIL;
            if (str == null) {
                str = "12.345.678/9012-34";
            }
            String str2 = this.LJLILLLLZI;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLJI;
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = this.LJLJJI;
            int i2 = this.LJLJJL;
            String str3 = this.LJLJJLL;
            boolean z = this.LJLJL;
            boolean z2 = this.LJLJLJ;
            int i3 = this.LJLJLLL;
            int i4 = i3 >> 3;
            String str4 = str;
            C92026a46.LIZ(str2, it, interfaceC88472Yns, interfaceC88472Yns2, i2, c18880oe, null, c92149a65, str3, str4, z, z2, false, null, null, null, false, 0, null, interfaceC24520xk2, ((intValue << 3) & 112) | (i3 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | ((i3 << 18) & 234881024), ((i3 >> 21) & 14) | ((i3 >> 24) & 112), 520256);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}