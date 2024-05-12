package X;

import android.app.Application;
import android.widget.Toast;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.api.consumer.ReportParam;
import com.bytedance.helios.network.NetworkComponent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ptx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65917Ptx {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0279, code lost:
    
        if (r0.contains("content") != true) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.PYQ r18) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65917Ptx.LIZLLL(X.PYQ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r0 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r7 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e8, code lost:
    
        if (r8 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.PYQ r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65917Ptx.LIZIZ(X.PYQ, java.lang.String):void");
    }

    public static void LIZJ(ApmEvent apmEvent, List list) {
        java.util.Map<String, Object> category = apmEvent.mCategories;
        java.util.Map<String, Object> metric = apmEvent.mMetrics;
        java.util.Map<String, Object> logExtra = apmEvent.mExtras;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReportParam reportParam = (ReportParam) it.next();
            String type = reportParam.getType();
            int hashCode = type.hashCode();
            if (hashCode != -2012801195) {
                if (hashCode != -1077545552) {
                    if (hashCode == 50511102 && type.equals("category")) {
                        String key = reportParam.getKey();
                        Object value = reportParam.getValue();
                        o.LJIIIIZZ(category, "category");
                        LIZ(key, value, category, reportParam.isCheckConflict());
                    }
                } else if (type.equals("metric")) {
                    String key2 = reportParam.getKey();
                    Object value2 = reportParam.getValue();
                    o.LJIIIIZZ(metric, "metric");
                    LIZ(key2, value2, metric, reportParam.isCheckConflict());
                }
            } else if (type.equals("log_extra")) {
                String key3 = reportParam.getKey();
                Object value3 = reportParam.getValue();
                o.LJIIIIZZ(logExtra, "logExtra");
                LIZ(key3, value3, logExtra, reportParam.isCheckConflict());
            }
        }
    }

    public static void LIZ(String str, Object obj, java.util.Map map, boolean z) {
        C65935PuF appInfo;
        Application application;
        NetworkConfig networkConfig;
        List<String> list;
        if (obj != null && !o.LJ(obj, 0) && !o.LJ(obj, -1) && !o.LJ(obj, "[]") && !o.LJ(obj, "{}")) {
            if (!(obj instanceof String) || !ujb.o.LJJJJJL((CharSequence) obj)) {
                if (!(obj instanceof Collection) || !((Collection) obj).isEmpty()) {
                    if ((obj instanceof java.util.Map) && ((java.util.Map) obj).isEmpty()) {
                        return;
                    }
                    NetworkComponent networkComponent = NetworkComponent.INSTANCE;
                    SettingsModel settings = networkComponent.getSettings();
                    if (settings != null && (networkConfig = settings.networkConfig) != null && (list = networkConfig.reportBlockList) != null && list.contains(str)) {
                        return;
                    }
                    if (networkComponent.isOffLineEnv() && z && map.containsKey(str) && (appInfo = networkComponent.getAppInfo()) != null && (application = appInfo.LJLIL) != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("\"pns_network\" APM custom event has conflict key: ");
                        LIZ2.append(str);
                        C16880lQ.LLZILL(Toast.makeText(application, X1D.LIZIZ(LIZ2), 0));
                    }
                    map.put(str, obj);
                }
            }
        }
    }
}
