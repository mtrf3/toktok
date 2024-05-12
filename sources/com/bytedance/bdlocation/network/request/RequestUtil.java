package com.bytedance.bdlocation.network.request;

import X.EJ6;
import X.M2Z;
import android.util.Pair;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.ss.android.ugc.quota.BDNetworkTagManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public class RequestUtil {
    public static List<EJ6> jsonHeaderList(List<EJ6> list) {
        Pair env;
        if (list == null) {
            list = new ArrayList<>();
        }
        if (BDLocationConfig.isDebug() && !BDLocationConfig.isOnline() && (env = BDLocationConfig.getEnv()) != null) {
            list.add(new EJ6((String) env.first, "1"));
            list.add(new EJ6("x-tt-env", (String) env.second));
        }
        list.add(new EJ6("Content-Type", "application/json"));
        return list;
    }

    public static List<EJ6> headerList(List<EJ6> list, final int i) {
        Pair env;
        if (list == null) {
            list = new ArrayList<>();
        }
        if (BDLocationConfig.isDebug() && !BDLocationConfig.isOnline() && (env = BDLocationConfig.getEnv()) != null) {
            list.add(new EJ6((String) env.first, "1"));
            list.add(new EJ6("x-tt-env", (String) env.second));
        }
        try {
            String LIZ = BDNetworkTagManager.LIZIZ().LIZ(new M2Z() { // from class: com.bytedance.bdlocation.network.request.RequestUtil.1
                @Override // X.M2Z
                public Map<String, String> extra() {
                    return null;
                }

                @Override // X.M2Z
                public int triggerType() {
                    return i;
                }
            });
            if (LIZ != null) {
                list.add(new EJ6("x-tt-request-tag", LIZ));
            }
        } catch (Exception | NoClassDefFoundError unused) {
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> headerMap(java.util.Map<java.lang.String, java.lang.String> r3, final int r4) {
        /*
            if (r3 != 0) goto L7
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L7:
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r0 == 0) goto L27
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isOnline()
            if (r0 != 0) goto L27
            android.util.Pair r2 = com.bytedance.bdlocation.client.BDLocationConfig.getEnv()
            if (r2 == 0) goto L27
            java.lang.Object r1 = r2.first
            java.lang.String r0 = "1"
            r3.put(r1, r0)
            java.lang.String r1 = "x-tt-env"
            java.lang.Object r0 = r2.second
            r3.put(r1, r0)
        L27:
            com.ss.android.ugc.quota.BDNetworkTagManager r1 = com.ss.android.ugc.quota.BDNetworkTagManager.LIZIZ()     // Catch: java.lang.Throwable -> L3b
            com.bytedance.bdlocation.network.request.RequestUtil$2 r0 = new com.bytedance.bdlocation.network.request.RequestUtil$2     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3b
            java.lang.String r0 = "x-tt-request-tag"
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L3b
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.network.request.RequestUtil.headerMap(java.util.Map, int):java.util.Map");
    }
}
