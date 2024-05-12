package X;

import Y.IDfS133S0100000_13;

/* renamed from: X.V6u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79208V6u implements InterfaceC65462ha<Boolean> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;

    public C79208V6u(InterfaceC65462ha interfaceC65462ha) {
        this.LJLIL = interfaceC65462ha;
    }

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super Boolean> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new IDfS133S0100000_13(interfaceC64672gJ, 8), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
