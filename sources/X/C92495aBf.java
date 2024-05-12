package X;

/* renamed from: X.aBf, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92495aBf extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92495aBf(String str, int i) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C21430sl.LIZIZ(this.LJLIL, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LJFF(C21350sd.LIZJ(interfaceC24520xk2), interfaceC24520xk2), C91671ZyN.LIZ(interfaceC24520xk2).LIZJ, 0L, null, null, 262142), interfaceC24520xk2, this.LJLILLLLZI & 14, 0, 32766);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
