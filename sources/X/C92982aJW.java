package X;

import kotlin.jvm.internal.IDqS445S0100000_31;

/* renamed from: X.aJW, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92982aJW extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92982aJW(int i, String str, String str2, Object obj) {
        super(2);
        this.LJLIL = obj;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C92037a4H.LIZ(null, C1DJ.LJ(interfaceC24520xk2, -819892263, new IDqS445S0100000_31(this.LJLIL, 16)), C1DJ.LJ(interfaceC24520xk2, -819892418, new C92981aJV(this.LJLILLLLZI, this.LJLJI, this.LJLJJI)), null, interfaceC24520xk2, 432, 9);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
