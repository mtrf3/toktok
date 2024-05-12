package com.ss.android.ugc.aweme.traffic;

import X.C09900aA;
import X.C58096Mr6;
import X.PN9;
import X.X1D;
import com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class TrafficMonitorService implements ITrafficMonitorApi {
    public static ITrafficMonitorApi LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ITrafficMonitorApi.class, false);
        if (LIZ != null) {
            return (ITrafficMonitorApi) LIZ;
        }
        if (C58096Mr6.I7 == null) {
            synchronized (ITrafficMonitorApi.class) {
                if (C58096Mr6.I7 == null) {
                    C58096Mr6.I7 = new TrafficMonitorService();
                }
            }
        }
        return C58096Mr6.I7;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi
    public final void LIZ(String str, JSONObject jSONObject) {
        if (o.LJ(str, "download_common")) {
            try {
                if (o.LJ(jSONObject.optString("status", ""), "download_success")) {
                    long optLong = jSONObject.optLong("total_bytes", 0L);
                    jSONObject.optString("url", "");
                    String optString = jSONObject.optString("url_path", "");
                    String optString2 = jSONObject.optString("event_page", "");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(optString2);
                    LIZ.append(':');
                    LIZ.append(optString);
                    C09900aA.LJIIZILJ(optLong, X1D.LIZIZ(LIZ), "downloader", "");
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi
    public final void LIZIZ(long j, String str) {
        PN9.LIZLLL(j, "ttnet", str, true);
    }
}
