package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25U extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, ? extends C76800UCe>, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC14810i5 LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJLJ;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJLLL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLL;
    public final /* synthetic */ InterfaceC21550sx LJLLI;
    public final /* synthetic */ int LJLLILLLL;
    public final /* synthetic */ int LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25U(String str, boolean z, boolean z2, InterfaceC14810i5 interfaceC14810i5, C1OH c1oh, boolean z3, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4, InterfaceC21550sx interfaceC21550sx, int i, int i2) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = interfaceC14810i5;
        this.LJLJJL = c1oh;
        this.LJLJJLL = z3;
        this.LJLJL = interfaceC88471Ynr;
        this.LJLJLJ = interfaceC88471Ynr2;
        this.LJLJLLL = interfaceC88471Ynr3;
        this.LJLL = interfaceC88471Ynr4;
        this.LJLLI = interfaceC21550sx;
        this.LJLLILLLL = i;
        this.LJLLJ = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, ? extends C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, Integer num) {
        int i;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, ? extends C76800UCe> innerTextField = interfaceC88471Ynr;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(innerTextField, "innerTextField");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk2.LJIJJ(innerTextField)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 91) != 18 || !interfaceC24520xk2.LIZ()) {
            C21600t2 c21600t2 = C21600t2.LIZ;
            String str = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            boolean z2 = this.LJLJI;
            InterfaceC14810i5 interfaceC14810i5 = this.LJLJJI;
            C1OH c1oh = this.LJLJJL;
            boolean z3 = this.LJLJJLL;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr2 = this.LJLJL;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr3 = this.LJLJLJ;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr4 = this.LJLJLLL;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr5 = this.LJLL;
            InterfaceC21550sx interfaceC21550sx = this.LJLLI;
            int i2 = this.LJLLILLLL;
            int i3 = ((i2 >> 3) & 896) | (i2 & 14) | ((intValue << 3) & 112);
            int i4 = this.LJLLJ;
            int i5 = i4 >> 3;
            int i6 = (i5 & 458752) | i3 | (i5 & 7168) | ((i4 << 9) & 57344) | ((i4 << 18) & 3670016);
            int i7 = i2 << 3;
            c21600t2.LIZJ(str, innerTextField, z, z2, interfaceC14810i5, c1oh, z3, interfaceC88471Ynr2, interfaceC88471Ynr3, interfaceC88471Ynr4, interfaceC88471Ynr5, interfaceC21550sx, null, interfaceC24520xk2, i6 | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), ((i2 >> 27) & 14) | 3072 | ((i4 >> 21) & 112), 4096);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
