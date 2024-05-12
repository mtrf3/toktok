package X;

import Y.ARunnableS43S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRA implements InterfaceC45863HzH {
    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        if (((Boolean) HRH.LIZ.getValue()).booleanValue()) {
            return;
        }
        HR9 action = HR9.LJLIL;
        o.LJIIIZ(action, "action");
        HRJ.LIZ.execute(new ARunnableS43S0100000_7((Object) action, 137));
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P1;
    }
}
