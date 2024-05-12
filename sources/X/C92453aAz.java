package X;

import android.view.View;
import java.util.List;

/* renamed from: X.aAz, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92453aAz extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
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
    public final /* synthetic */ boolean LJLLJ;
    public final /* synthetic */ InterfaceC70422pa LJLLL;
    public final /* synthetic */ View LJLLLL;
    public final /* synthetic */ List<String> LJLLLLLL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLZ;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJZL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92453aAz(String str, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i, String str2, String str3, boolean z, boolean z2, String str4, int i2, int i3, boolean z3, InterfaceC70422pa interfaceC70422pa, View view, List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
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
        this.LJLLJ = z3;
        this.LJLLL = interfaceC70422pa;
        this.LJLLLL = view;
        this.LJLLLLLL = list;
        this.LJLZ = interfaceC24760y8;
        this.LJZ = interfaceC88472Yns3;
        this.LJZI = interfaceC65784Pro;
        this.LJZL = interfaceC65784Pro2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        C40431iJ LJ;
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
            C92458aB4 c92458aB4 = C92458aB4.LJLIL;
            if (this.LJLL.length() == 0) {
                LJ = null;
            } else {
                LJ = C1DJ.LJ(interfaceC24520xk2, -819890637, new C92463aB9(this.LJLL, this.LJLLJ, this.LJLLI, this.LJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLZ, this.LJZ, this.LJZI, this.LJZL));
            }
            int i2 = this.LJLLI;
            int i3 = i2 >> 15;
            int i4 = ((i2 << 6) & 234881024) | (i2 & 14) | 14155776 | ((i2 >> 9) & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344);
            int i5 = this.LJLLILLLL;
            editText.LIZ(str, interfaceC07790Sh, interfaceC88472Yns, interfaceC88472Yns2, i, c18880oe, null, c1u3, str2, str3, z, z2, false, c92458aB4, LJ, null, true, 1, null, interfaceC24520xk2, i4 | ((i5 << 27) & 1879048192), ((i5 >> 3) & 14) | 1188760960 | ((i5 >> 12) & 112));
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
