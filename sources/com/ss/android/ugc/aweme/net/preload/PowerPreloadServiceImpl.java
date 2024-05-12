package com.ss.android.ugc.aweme.net.preload;

import X.C0M6;
import X.C38826FLq;
import X.C58096Mr6;
import X.C65110Pgw;
import X.C65111Pgx;
import X.C65118Ph4;
import X.PY0;
import com.bytedance.ies.ugc.aweme.network.IPowerPreload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PowerPreloadServiceImpl implements IPowerPreload {
    public static IPowerPreload LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IPowerPreload.class, false);
        if (LIZ != null) {
            return (IPowerPreload) LIZ;
        }
        if (C58096Mr6.l3 == null) {
            synchronized (IPowerPreload.class) {
                if (C58096Mr6.l3 == null) {
                    C58096Mr6.l3 = new PowerPreloadServiceImpl();
                }
            }
        }
        return C58096Mr6.l3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.ugc.aweme.network.IPowerPreload
    public final void LIZ(String str, Map<String, String> map) {
        C65118Ph4 c65118Ph4;
        C38826FLq c38826FLq;
        String str2;
        boolean z;
        if (str.length() == 0 || (c65118Ph4 = C65110Pgw.LIZJ) == null || str.length() == 0) {
            return;
        }
        Set keySet = ((LinkedHashMap) c65118Ph4.LIZ.LJII()).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str3 = (String) obj;
            C0M6<String, C65111Pgx> c0m6 = c65118Ph4.LIZ;
            str3.toString();
            C65111Pgx LIZIZ = c0m6.LIZIZ(str3);
            if (LIZIZ != null && (c38826FLq = LIZIZ.LJLIL) != null && (str2 = c38826FLq.LJIJJ) != null && str2.length() != 0) {
                PY0 LIZJ = PY0.LIZJ(str2);
                if (map == null) {
                    z = o.LJ(C65118Ph4.LIZ(str), C65118Ph4.LIZ(LIZJ.LJFF.LIZ()));
                } else {
                    z = true;
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        String LIZJ2 = LIZJ.LJI.LIZJ((String) entry.getKey());
                        if (LIZJ2 == null) {
                            LIZJ2 = "";
                        }
                        if (!o.LJ(LIZJ2, entry.getValue())) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c65118Ph4.LIZ.LIZLLL(it.next());
        }
    }
}
