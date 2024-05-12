package X;

import Y.IDfS14S0300000_13;

/* loaded from: classes14.dex */
public final class V1N<T> implements InterfaceC65462ha<T> {
    public final InterfaceC65462ha<T> LJLIL;
    public final InterfaceC88472Yns<T, Object> LJLILLLLZI;
    public final InterfaceC88471Ynr<Object, Object, Boolean> LJLJI;

    public V1N(InterfaceC65462ha interfaceC65462ha) {
        V1Y v1y = V1X.LIZ;
        V1V v1v = V1X.LIZIZ;
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = v1y;
        this.LJLJI = v1v;
    }

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = (T) C94103mg.LIZ;
        Object collect = this.LJLIL.collect(new IDfS14S0300000_13(this, c68322mC, interfaceC64672gJ, 0), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
