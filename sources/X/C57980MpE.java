package X;

import Y.IDeS153S0200000_15;
import Y.IDfS130S0100000_9;
import java.util.List;

/* renamed from: X.MpE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57980MpE implements InterfaceC65462ha<List<? extends InterfaceC57927MoN>> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;

    public C57980MpE(IDeS153S0200000_15 iDeS153S0200000_15) {
        this.LJLIL = iDeS153S0200000_15;
    }

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super List<? extends InterfaceC57927MoN>> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new IDfS130S0100000_9(interfaceC64672gJ, 2), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
