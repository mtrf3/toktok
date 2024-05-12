package X;

/* renamed from: X.aHb, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92863aHb extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ int LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92863aHb(String str, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, String str2, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str4, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, int i, int i2) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = str4;
        this.LJLJL = interfaceC65784Pro2;
        this.LJLJLJ = interfaceC88471Ynr2;
        this.LJLJLLL = interfaceC65784Pro3;
        this.LJLL = i;
        this.LJLLI = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            String str = this.LJLIL;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            String str3 = this.LJLJJI;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
            String str4 = this.LJLJJLL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJL;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr2 = this.LJLJLJ;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLJLLL;
            int i = this.LJLL >> 3;
            C91984a3Q.LIZJ(str, interfaceC88471Ynr, str2, str3, interfaceC65784Pro, str4, interfaceC65784Pro2, interfaceC88471Ynr2, interfaceC65784Pro3, interfaceC24520xk2, (i & 29360128) | (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | ((this.LJLLI << 18) & 234881024), 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
