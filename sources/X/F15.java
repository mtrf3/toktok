package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class F15 extends AbstractC31941CgD {
    public final EnumC37847EtH LIZ = EnumC37847EtH.WEB;

    @Override // X.AbstractC31941CgD
    public final EnumC37847EtH LIZ() {
        return this.LIZ;
    }

    public static C78531Urv LIZLLL(java.util.Map map) {
        if (map != null) {
            return new C78531Urv(C38382F4o.LIZLLL(map));
        }
        return null;
    }

    public final void LIZJ(F14 f14, C31889CfN c31889CfN) {
        Iterator it = C113554cx.LJJLIIIJLLLLLLLZ(((C31901CfZ) c31889CfN.LIZ.getValue()).LIZ).entrySet().iterator();
        while (it.hasNext()) {
            f14.LIZ((String) ((Map.Entry) it.next()).getKey(), new F12(this, f14, c31889CfN));
        }
    }
}
