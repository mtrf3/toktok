package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HXA implements InterfaceC45863HzH {
    public final Activity LJLIL;

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        this.LJLIL.runOnUiThread(HXC.LJLIL);
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

    public HXA(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
    }
}
