package com.ss.android.ugc.quota;

import X.C1FJ;
import X.M2Y;
import X.M2Z;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public class BDNetworkTagManager {
    public static volatile BDNetworkTagManager LIZJ;
    public M2Y LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(true);

    public static BDNetworkTagManager LIZIZ() {
        if (LIZJ == null) {
            synchronized (BDNetworkTagManager.class) {
                if (LIZJ == null) {
                    LIZJ = new BDNetworkTagManager();
                }
            }
        }
        return LIZJ;
    }

    public final String LIZ(M2Z m2z) {
        if (!this.LIZIZ.get()) {
            StringBuilder sb = new StringBuilder("t=");
            sb.append(m2z.triggerType());
            sb.append(";n=");
            sb.append(this.LIZ.LIZJ() ? 1 : 0);
            sb.append(";s=");
            sb.append(this.LIZ.LIZIZ());
            Map<String, String> extra = m2z.extra();
            if (extra != null) {
                for (Map.Entry<String, String> entry : extra.entrySet()) {
                    sb.append(";");
                    sb.append((String) C1FJ.LIZJ(sb, entry.getKey(), "=", entry));
                }
            }
            return sb.toString();
        }
        return "";
    }
}
