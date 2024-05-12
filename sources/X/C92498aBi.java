package X;

/* renamed from: X.aBi, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92498aBi extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92498aBi(boolean z, int i) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C92066a4k.LIZ(this.LJLIL, interfaceC24520xk2, (this.LJLILLLLZI >> 3) & 14);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
