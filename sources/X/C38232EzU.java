package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EzU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38232EzU extends AbstractC38233EzV {
    public C38232EzU() {
        this.LIZ = "hybridkit_default_bid";
        if (F2F.LIZJ.compareAndSet(false, true)) {
            C86290Xtm.LIZ();
            List<Class<? extends AbstractC37780EsC>> list = F2F.LIZ;
            ArrayList LJ = AnonymousClass391.LJ(list, "bridge");
            for (Class<? extends AbstractC37780EsC> cls : list) {
                try {
                    AbstractC37780EsC newInstance = cls.newInstance();
                    newInstance.LIZIZ(new C31926Cfy());
                    C37773Es5 c37773Es5 = new C37773Es5(newInstance);
                    LJ.add(c37773Es5);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("transform ");
                    LIZ.append(c37773Es5.getName());
                    LIZ.append(" success.");
                    String msg = X1D.LIZIZ(LIZ);
                    o.LJIIJ(msg, "msg");
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("transform ");
                    LIZ2.append(C16880lQ.LJLLJ(cls));
                    LIZ2.append(" failed, error = ");
                    LIZ2.append(e.getMessage());
                    String msg2 = X1D.LIZIZ(LIZ2);
                    o.LJIIJ(msg2, "msg");
                }
            }
            Iterator it = LJ.iterator();
            while (it.hasNext()) {
                ((ArrayList) F2F.LIZIZ).add(it.next());
            }
            C58255Mtf.LIZ();
        }
        this.LIZIZ = F2F.LIZIZ;
    }
}
