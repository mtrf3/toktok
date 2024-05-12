package X;

/* renamed from: X.aF3, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92705aF3 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public static final C92705aF3 LJLIL = new C92705aF3();

    public C92705aF3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91856a1M.LIZJ(new C92108a5Q(EnumC92109a5R.UNKNOWN, "thanks for your payment"), new C92283a8F("hello"), null, C92710aF8.LJLIL, interfaceC24520xk2, 3136, 4);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
