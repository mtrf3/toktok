package X;

/* renamed from: X.aF5, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92707aF5 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public static final C92707aF5 LJLIL = new C92707aF5();

    public C92707aF5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91856a1M.LIZJ(new C92328a8y("We have received your payment and started processing. It may takes about 10 minutes to process.", "1231415411", "asdfasdfasfafads", "MOMO", "1000"), new C92283a8F("hello"), null, C92714aFC.LJLIL, interfaceC24520xk2, 3136, 4);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
