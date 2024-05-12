package X;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66832jn {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.lang.String r5, java.lang.String r6) {
        /*
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$MonitorDetailModel> r0 = com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.MonitorDetailModel.class
            com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$MonitorDetailModel r3 = com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.LIZ
            java.lang.String r2 = "ec_client_exception_monitor"
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0, r3)
            com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$MonitorDetailModel r0 = (com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.MonitorDetailModel) r0
            if (r0 != 0) goto L14
            r0 = r3
        L14:
            boolean r0 = r0.enable
            r4 = 1
            if (r0 == 0) goto L31
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$MonitorDetailModel> r0 = com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.MonitorDetailModel.class
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0, r3)
            com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$MonitorDetailModel r0 = (com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.MonitorDetailModel) r0
            if (r0 != 0) goto L28
            r0 = r3
        L28:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$EventLimitedModel> r0 = r0.eventLimitedList
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L31
            return r4
        L31:
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$MonitorDetailModel> r0 = com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.MonitorDetailModel.class
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0, r3)
            com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$MonitorDetailModel r0 = (com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.MonitorDetailModel) r0
            if (r0 != 0) goto L8c
        L3f:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$EventLimitedModel> r0 = r3.eventLimitedList
            java.lang.Object r1 = r0.get(r5)
            com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings$EventLimitedModel r1 = (com.ss.android.ugc.aweme.ecommerce.ab.EcClientExceptionMonitorSettings.EventLimitedModel) r1
            java.lang.String r0 = "TEA"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L6f
            if (r1 == 0) goto L89
            float r0 = r1.teaSamplingRate
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L57:
            if (r0 == 0) goto L89
            float r3 = r0.floatValue()
        L5d:
            X.V0R r0 = X.V0Q.Default
            r2 = 100
            int r0 = r0.nextInt(r2)
            float r1 = (float) r0
            float r0 = (float) r2
            float r3 = r3 * r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6d
        L6c:
            return r4
        L6d:
            r4 = 0
            goto L6c
        L6f:
            java.lang.String r0 = "Slardar"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L80
            if (r1 == 0) goto L89
            float r0 = r1.slardarSamplingRate
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L57
        L80:
            if (r1 == 0) goto L89
            float r0 = r1.serverSamplingRate
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L57
        L89:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L5d
        L8c:
            r3 = r0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66832jn.LJ(java.lang.String, java.lang.String):boolean");
    }

    public static void LIZ(Integer num, String str, java.util.Map map) {
        if (str != null && map != null) {
            map.put("error_message", str);
        }
        if (num != null) {
            int intValue = num.intValue();
            if (map != null) {
                map.put("error_code", Integer.valueOf(intValue));
            }
        }
    }

    public static void LIZJ(Integer num, String str, String str2, java.util.Map map) {
        if (!LJ(str, "TEA")) {
            return;
        }
        LIZ(num, str2, map);
        C76542zS.LIZJ(str, new AqS170S0100000_4(map, (java.util.Map<Integer, String>) 373));
    }

    public static void LIZLLL(Integer num, String str, String str2, java.util.Map map) {
        java.util.Map map2;
        LIZJ(num, str, str2, map);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(num);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (!LJ(LIZIZ, "Slardar")) {
            return;
        }
        LIZ(num, str2, map);
        int LIZIZ2 = Q7K.LIZIZ("ec_client_monitor_exception_report", 0);
        if (LIZIZ2 == 1 || LIZIZ2 == 3) {
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new OSZ(entry.getKey(), entry.getValue().toString()));
                }
                map2 = C113554cx.LJJLIIIJLJLI(arrayList);
            } else {
                map2 = null;
            }
            C78983UzD.LJIILLIIL(LIZIZ, map2);
        }
        if ((LIZIZ2 != 2 && LIZIZ2 != 3) || map == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(map));
        C09900aA.LJI(LIZIZ, jSONObject, jSONObject, jSONObject);
    }

    public static void LIZIZ(String str, EnumC53638L3i sceneType, Integer num, String str2, java.util.Map map) {
        o.LJIIIZ(sceneType, "sceneType");
        LIZLLL(num, str, str2, map);
        if (!LJ(str, "Server")) {
            return;
        }
        LIZ(num, str2, map);
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C67272kV(sceneType, num, map, null), 2);
    }
}
