package X;

import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CgS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31956CgS extends C78685UuP {
    public final /* synthetic */ C31955CgR LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    @Override // X.C78685UuP
    public final void LJJL(O1I resourceInfo) {
        int i;
        Object obj;
        java.util.Map<String, ? extends Object> map;
        o.LJIIIZ(resourceInfo, "resourceInfo");
        C31955CgR c31955CgR = this.LJLJJL;
        if (resourceInfo.LJIIIIZZ == EnumC60490Noc.GECKO) {
            i = 1;
        } else {
            i = 0;
        }
        c31955CgR.LJLLILLLL = i;
        C31886CfK c31886CfK = c31955CgR.LJLJJLL;
        if (c31886CfK != null) {
            String str = this.LJLJJLL;
            C29265Be9 c29265Be9 = c31955CgR.LJLJLJ;
            if (c29265Be9 != null) {
                c29265Be9.LIZ(str, c31886CfK, new AqS171S0100000_5(c31955CgR, 667), new AqS171S0100000_5(c31955CgR, 668));
            }
        }
        C31955CgR c31955CgR2 = this.LJLJJL;
        VNS vns = c31955CgR2.LJLJL;
        if (vns != null) {
            C29265Be9 c29265Be92 = c31955CgR2.LJLJLJ;
            java.util.Map<String, Object> map2 = null;
            if (c29265Be92 != null && (map = c29265Be92.LIZJ) != null) {
                obj = map.get("__globalProps");
            } else {
                obj = null;
            }
            if (obj instanceof java.util.Map) {
                map2 = (java.util.Map) obj;
            }
            vns.setGlobalProps(map2);
        }
        C31955CgR c31955CgR3 = this.LJLJJL;
        C31933Cg5.LIZJ(c31955CgR3.LJLLILLLL, c31955CgR3.LJIIIZ(new OSZ[0]));
    }

    public C31956CgS(C31955CgR c31955CgR, String str) {
        this.LJLJJL = c31955CgR;
        this.LJLJJLL = str;
    }
}
