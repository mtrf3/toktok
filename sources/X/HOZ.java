package X;

import Y.ARunnableS43S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HOZ implements InterfaceC45863HzH {
    public final ActivityC45651qj LJLIL;
    public final WM7 LJLILLLLZI;

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        this.LJLIL.runOnUiThread(new ARunnableS43S0100000_7(this, 141));
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
        return EnumC45752HxU.P1;
    }

    public HOZ(ActivityC45651qj activity, WM7 wm7) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = wm7;
    }
}
