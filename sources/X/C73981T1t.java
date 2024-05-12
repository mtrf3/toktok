package X;

import kotlin.jvm.internal.o;

/* renamed from: X.T1t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73981T1t extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC11440ce, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC88473Ynt<V6O<Object>, InterfaceC24520xk, Integer, C76800UCe> LJLIL;
    public final /* synthetic */ V6O<Object> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C73981T1t(InterfaceC88473Ynt<? super V6O<Object>, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, V6O<Object> v6o, int i) {
        super(3);
        this.LJLIL = interfaceC88473Ynt;
        this.LJLILLLLZI = v6o;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC11440ce item, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(item, "$this$item");
        if ((intValue & 81) != 16 || !interfaceC24520xk2.LIZ()) {
            InterfaceC88473Ynt<V6O<Object>, InterfaceC24520xk, Integer, C76800UCe> interfaceC88473Ynt = this.LJLIL;
            V6O<Object> v6o = this.LJLILLLLZI;
            int i = this.LJLJI >> 6;
            interfaceC88473Ynt.invoke(v6o, interfaceC24520xk2, Integer.valueOf((i & 112) | (i & 14)));
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
