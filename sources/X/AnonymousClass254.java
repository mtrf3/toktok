package X;

/* renamed from: X.254, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass254 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C0X9 LJLJI;
    public final /* synthetic */ InterfaceC21550sx LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass254(int i, int i2, C0X9 c0x9, InterfaceC21550sx interfaceC21550sx, boolean z, boolean z2) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = c0x9;
        this.LJLJJI = interfaceC21550sx;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            C21600t2 c21600t2 = C21600t2.LIZ;
            boolean z = this.LJLIL;
            boolean z2 = this.LJLILLLLZI;
            C0X9 c0x9 = this.LJLJI;
            InterfaceC21550sx interfaceC21550sx = this.LJLJJI;
            int i = this.LJLJJL;
            c21600t2.LIZ(z, z2, c0x9, interfaceC21550sx, null, 0.0f, 0.0f, interfaceC24520xk2, ((i >> 9) & 896) | ((i >> 6) & 14) | 12582912 | ((i >> 15) & 112) | ((this.LJLJJLL << 6) & 7168), 112);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
