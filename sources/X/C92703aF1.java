package X;

/* renamed from: X.aF1, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92703aF1 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public static final C92703aF1 LJLIL = new C92703aF1();

    public C92703aF1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91856a1M.LIZIZ(C47261Igj.LJJIJIIJI(new C91872a1c("title", "hello", null), new C91872a1c("amount", "100", null)), null, interfaceC24520xk2, 0, 2);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
