package X;

import Y.ACallableS110S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZQ implements InterfaceC45863HzH {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(HZS.LJLIL);

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        int LIZ = C45866HzK.LIZ();
        if (LIZ != 1) {
            if (LIZ != 2) {
                EnumC45752HxU enumC45752HxU = EnumC45752HxU.P1;
                o.LJIIIIZZ(enumC45752HxU, "super.getTaskPriority()");
                return enumC45752HxU;
            }
            return EnumC45752HxU.P3;
        }
        return EnumC45752HxU.P2;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        if (C45866HzK.LIZIZ()) {
            C10K.LIZJ(new ACallableS110S0100000_7(this, 28));
        } else {
            HZU.LIZ().LJFF(null);
        }
    }
}
