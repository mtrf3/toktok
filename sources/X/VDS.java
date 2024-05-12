package X;

import X.C0M9;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VDS implements Callable<VDW> {
    @Override // java.util.concurrent.Callable
    public final VDW call() {
        String sb;
        C1HQ c1hq = VDR.LJIILLIIL;
        if (c1hq == null) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("{ \"IpMap\":{");
            Iterator it = ((C0M9.e) c1hq.values()).iterator();
            int i = 0;
            while (true) {
                C0M7 c0m7 = (C0M7) it;
                if (!c0m7.hasNext()) {
                    break;
                }
                C36783Ec7 c36783Ec7 = ((VDT) c0m7.next()).LIZLLL;
                if (c36783Ec7 != null) {
                    if (i != 0) {
                        sb2.append(",");
                    }
                    sb2.append(c36783Ec7.toString());
                    i++;
                }
            }
            sb2.append("}}");
            sb = sb2.toString();
        }
        VDO vdo = VDN.LIZIZ().LIZIZ;
        vdo.getClass();
        StringBuilder LIZ = X1D.LIZ();
        String LIZ2 = VDO.LIZ(JBR.LJFF(LIZ, vdo.LIZ, "/video/live/qos/v2/ipSettings", LIZ), vdo.LIZJ);
        sb.toString();
        return new VDW(new JSONObject(vdo.LIZIZ.LIZ(LIZ2, sb.getBytes("UTF-8"))));
    }
}
