package X;

import Y.IDfS23S0200000_7;

/* renamed from: X.Gcg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41914Gcg implements InterfaceC65462ha<String> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ C41911Gcd LJLILLLLZI;

    public C41914Gcg(InterfaceC65462ha interfaceC65462ha, C41911Gcd c41911Gcd) {
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = c41911Gcd;
    }

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super String> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new IDfS23S0200000_7(interfaceC64672gJ, this.LJLILLLLZI, 1), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
