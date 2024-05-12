package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2zS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76542zS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, java.util.Map params) {
        o.LJIIIZ(params, "params");
        JSONObject jSONObject = new JSONObject();
        Object obj = "";
        try {
            for (Map.Entry entry : params.entrySet()) {
                obj = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C48658J7u.LIZIZ(str, jSONObject);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("ECLoggerUtils, sendLog2: fail send event ", str, ", key = ");
            LIZIZ.append((String) obj);
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZIZ));
        }
    }

    public static void LIZJ(String eventName, InterfaceC88472Yns buildParams) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(buildParams, "buildParams");
        JSONObject jSONObject = new JSONObject();
        C27943Axv c27943Axv = new C27943Axv();
        buildParams.invoke(c27943Axv);
        Object obj = "";
        try {
            for (Map.Entry entry : ((HashMap) c27943Axv.LIZ).entrySet()) {
                obj = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C48658J7u.LIZIZ(eventName, jSONObject);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("ECLoggerUtils, sendLog4: fail send event ", eventName, ", key = ");
            LIZIZ.append((String) obj);
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZIZ));
        }
    }

    public static void LIZLLL(String str, java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = "";
        try {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                obj = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C48658J7u.LIZIZ(str, jSONObject);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("ECLoggerUtils, sendLog2: fail send event ", str, ", key = ");
            LIZIZ.append((String) obj);
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZIZ));
            C113554cx.LJJJLIIL();
        }
    }

    public static void LJ(String str, InterfaceC88472Yns interfaceC88472Yns) {
        JSONObject jSONObject = new JSONObject();
        C27943Axv c27943Axv = new C27943Axv();
        interfaceC88472Yns.invoke(c27943Axv);
        Object obj = "";
        try {
            for (Map.Entry entry : ((HashMap) c27943Axv.LIZ).entrySet()) {
                obj = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C48658J7u.LIZIZ(str, jSONObject);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("ECLoggerUtils, sendLog4: fail send event ", str, ", key = ");
            LIZIZ.append((String) obj);
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZIZ));
            C113554cx.LJJJLIIL();
        }
    }

    public static void LIZIZ(String eventName, java.util.Map params, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        JSONObject jSONObject = new JSONObject();
        Object obj = "";
        try {
            java.util.Map LJJLIL = C113554cx.LJJLIL(params);
            interfaceC88472Yns.invoke(LJJLIL);
            for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
                obj = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C48658J7u.LIZIZ(eventName, jSONObject);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("ECLoggerUtils, sendLog3: fail send event ", eventName, ", key = ");
            LIZIZ.append((String) obj);
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZIZ));
        }
    }
}
