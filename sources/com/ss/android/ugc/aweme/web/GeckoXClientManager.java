package com.ss.android.ugc.aweme.web;

import X.C58096Mr6;
import X.C61520OCm;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GeckoXClientManager implements IGeckoXClientManager {
    public final HashMap<String, C61520OCm> LIZ = new HashMap<>();
    public final Map<String, C61520OCm> LIZIZ = new LinkedHashMap();

    public static IGeckoXClientManager LJ() {
        Object LIZ = C58096Mr6.LIZ(IGeckoXClientManager.class, false);
        if (LIZ != null) {
            return (IGeckoXClientManager) LIZ;
        }
        if (C58096Mr6.e8 == null) {
            synchronized (IGeckoXClientManager.class) {
                if (C58096Mr6.e8 == null) {
                    C58096Mr6.e8 = new GeckoXClientManager();
                }
            }
        }
        return C58096Mr6.e8;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final C61520OCm LIZIZ(String str) {
        C61520OCm c61520OCm;
        synchronized (this.LIZIZ) {
            c61520OCm = (C61520OCm) ((LinkedHashMap) this.LIZIZ).get(str);
        }
        return c61520OCm;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final C61520OCm LIZLLL(String str) {
        C61520OCm c61520OCm;
        if (str == null || str.length() == 0) {
            return null;
        }
        synchronized (this.LIZ) {
            c61520OCm = this.LIZ.get(str);
        }
        return c61520OCm;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final void LIZ(String str, C61520OCm c61520OCm) {
        synchronized (this.LIZIZ) {
            this.LIZIZ.put(str, c61520OCm);
        }
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final void LIZJ(String accessKey, C61520OCm c61520OCm) {
        o.LJIIIZ(accessKey, "accessKey");
        synchronized (this.LIZ) {
            this.LIZ.put(accessKey, c61520OCm);
        }
    }
}
