package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VkP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80613VkP implements InterfaceC80616VkS {
    public final /* synthetic */ C80612VkO LIZ;

    @Override // X.InterfaceC80616VkS
    public final void LIZ() {
        C80612VkO c80612VkO = this.LIZ;
        C80611VkN c80611VkN = c80612VkO.LJLIL;
        o.LJI(c80611VkN);
        if (c80611VkN.LJLLLL == 0) {
            C80611VkN c80611VkN2 = c80612VkO.LJLIL;
            o.LJI(c80611VkN2);
            c80611VkN2.LJFF(1);
            c80612VkO.LJLJJI += c80612VkO.LJLJJL;
        } else {
            C80611VkN c80611VkN3 = c80612VkO.LJLIL;
            o.LJI(c80611VkN3);
            c80611VkN3.LJFF(0);
            c80612VkO.LJLJJI -= c80612VkO.LJLJJL;
        }
        C8TY c8ty = c80612VkO.LJLLI;
        if (c8ty != null) {
            c8ty.LIZ(c80612VkO.LJLJJI);
        }
    }

    public C80613VkP(C80612VkO c80612VkO) {
        this.LIZ = c80612VkO;
    }
}
