package X;

/* renamed from: X.aB1, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92455aB1 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92455aB1(String str, int i) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91665ZyH.LIZ().getFormPrefix().LIZ(this.LJLIL, false, C92443aAp.LJLIL, interfaceC24520xk2, ((this.LJLILLLLZI >> 6) & 14) | 4528);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
