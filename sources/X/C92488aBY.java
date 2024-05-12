package X;

/* renamed from: X.aBY, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92488aBY extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92488aBY(boolean z, boolean z2) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            interfaceC24520xk2.LJJIIJ(-43357699);
            if (this.LJLIL) {
                C91750Zze.LIZ(interfaceC24520xk2, 0);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            if (this.LJLILLLLZI) {
                C91730ZzK.LJ(interfaceC24520xk2, 0);
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
