package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.monitor;

import X.C40658FxW;
import X.C47261Igj;
import X.C70902RsA;
import X.C70905RsD;
import X.EDN;
import X.EDO;
import X.EDT;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS48S1200000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ParamResultHandler implements IResultHandler {
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final List<Class<? extends EDT>> LIZIZ() {
        return C47261Igj.LJJIJ(EDN.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final void LIZ(long j, String scene, String uri, List list) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(uri, "uri");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ParamResultHandler: ");
        LIZ.append(((ArrayList) list).size());
        String message = X1D.LIZIZ(LIZ);
        o.LJIIIZ(message, "message");
        if (!r2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) C40658FxW.LJJZZIII(list, EDN.class)).iterator();
            while (it.hasNext()) {
                EDN edn = (EDN) it.next();
                arrayList.add(edn);
                for (EDO error : edn.LIZJ) {
                    C70902RsA c70902RsA = new C70902RsA(scene);
                    o.LJIIIZ(error, "error");
                    c70902RsA.LJII(new AqS48S1200000_6(c70902RsA, uri, error, 0));
                    c70902RsA.LIZJ(false);
                }
            }
            C70905RsD c70905RsD = new C70905RsD(scene, j);
            c70905RsD.LJII(new AqS48S1200000_6(c70905RsD, (C70905RsD) uri, (String) arrayList, (List<EDN>) 1));
            c70905RsD.LIZJ(false);
        }
    }
}
