package X;

import com.ss.android.ugc.aweme.ecommerce.ab.EcomSlardarReportWhiteList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.J7u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48658J7u {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, java.util.Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            LIZIZ(str, jSONObject);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ECLogger: failed to convert ");
            LIZ2.append(str);
            LIZ2.append(" from json to map");
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZIZ(String eventName, JSONObject jSONObject) {
        Iterator<String> keys;
        o.LJIIIZ(eventName, "eventName");
        if (C70855RrP.LIZ.contains(eventName) && jSONObject != null) {
            jSONObject.put("traceparent", PII.LIZIZ());
        }
        FMX.LJIILJJIL(eventName, jSONObject);
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new JDW(eventName, null, jSONObject), 2);
        try {
            EcomSlardarReportWhiteList.LIZ.getClass();
            C62822Ol8 c62822Ol8 = EcomSlardarReportWhiteList.LIZJ;
            if (((java.util.Map) c62822Ol8.getValue()).containsKey(eventName)) {
                EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem ecomSlardarReportWhiteItem = (EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem) ((java.util.Map) c62822Ol8.getValue()).get(eventName);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject != null && (keys = jSONObject.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = jSONObject.get(next);
                        if (ecomSlardarReportWhiteItem != null) {
                            List<String> category = ecomSlardarReportWhiteItem.getCategory();
                            if (category != null && category.contains(next)) {
                                jSONObject3.put(next, obj);
                                if (ecomSlardarReportWhiteItem != null) {
                                }
                            }
                            List<String> metric = ecomSlardarReportWhiteItem.getMetric();
                            if (metric != null && metric.contains(next)) {
                                jSONObject2.put(next, obj);
                            }
                        }
                    }
                }
                C09900aA.LJI(eventName, jSONObject3, jSONObject2, null);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
