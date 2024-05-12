package X;

/* renamed from: X.aF4, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92706aF4 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public static final C92706aF4 LJLIL = new C92706aF4();

    public C92706aF4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91856a1M.LIZJ(new C92326a8w("We have received your payment and started processing. It may takes about 10 minutes to process."), new C92283a8F("hello"), null, C92712aFA.LJLIL, interfaceC24520xk2, 3136, 4);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
