package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6Y extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC10180ac, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ V7H LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6Y(V7H v7h, int i) {
        super(3);
        this.LJLIL = v7h;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC10180ac item, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(item, "$this$item");
        if ((intValue & 81) != 16 || !interfaceC24520xk2.LIZ()) {
            V5R.LIZLLL(null, this.LJLIL, interfaceC24520xk2, (this.LJLILLLLZI >> 21) & 112, 1);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
