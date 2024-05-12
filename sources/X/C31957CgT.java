package X;

import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CgT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31957CgT extends C78685UuP {
    public final /* synthetic */ C31954CgQ LJLJJL;

    public C31957CgT(C31954CgQ c31954CgQ) {
        this.LJLJJL = c31954CgQ;
    }

    @Override // X.C78685UuP
    public final void LJJL(O1I resourceInfo) {
        int i;
        java.util.Map<String, Object> map;
        o.LJIIIZ(resourceInfo, "resourceInfo");
        C31954CgQ c31954CgQ = this.LJLJJL;
        if (resourceInfo.LJIIIIZZ == EnumC60490Noc.GECKO) {
            i = 1;
        } else {
            i = 0;
        }
        c31954CgQ.LJLJJI = i;
        c31954CgQ.LJLJL.LIZ(c31954CgQ.LJLL, c31954CgQ.LJLJLJ, new AqS171S0100000_5(c31954CgQ, 69), new AqS171S0100000_5(this.LJLJJL, 70));
        C31954CgQ c31954CgQ2 = this.LJLJJL;
        VNS vns = c31954CgQ2.LJLJJLL;
        Object obj = c31954CgQ2.LJLJL.LIZJ.get("__globalProps");
        if (obj instanceof java.util.Map) {
            map = (java.util.Map) obj;
        } else {
            map = null;
        }
        vns.setGlobalProps(map);
        C31954CgQ c31954CgQ3 = this.LJLJJL;
        C31933Cg5.LIZJ(c31954CgQ3.LJLJJI, c31954CgQ3.LIZ(new OSZ[0]));
    }
}
