package X;

import Y.AfS57S0100000_5;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.CpQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32512CpQ implements InterfaceC32548Cq0 {
    public final /* synthetic */ C32500CpE LIZ;

    public C32512CpQ(C32500CpE c32500CpE) {
        this.LIZ = c32500CpE;
    }

    @Override // X.InterfaceC32548Cq0
    public final void LIZ(C32543Cpv stateManager, EnumC32542Cpu event) {
        o.LJIIIZ(stateManager, "stateManager");
        o.LJIIIZ(event, "event");
        int i = C32541Cpt.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C32500CpE c32500CpE = this.LIZ;
            c32500CpE.LLFF.LIZLLL();
            C76930UHe c76930UHe = c32500CpE.LLD;
            if (c76930UHe == null) {
                return;
            }
            c76930UHe.setVisibility(8);
            View view = c32500CpE.LJLL;
            if (view != null) {
                view.setVisibility(8);
            }
            c32500CpE.LJLL = null;
            return;
        }
        C32500CpE c32500CpE2 = this.LIZ;
        c32500CpE2.LLFF.LIZ(C79004UzY.LJJJJL(C73943T0h.LIZ().LJ(C32525Cpd.class), new AfS57S0100000_5(c32500CpE2, 11)));
    }
}
