package X;

import android.app.Application;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q0T {
    public static Application LIZ;
    public static final Q0Y LIZIZ = new Q0Y();

    public static void LIZ(C66297Q0f c66297Q0f) {
        Integer num;
        String str;
        JSONObject jSONObject;
        String str2;
        Integer num2;
        String str3;
        String str4;
        String str5;
        String[] strArr;
        Cert cert;
        Cert cert2;
        Object obj;
        Object obj2;
        JSONObject jSONObject2 = new JSONObject();
        OHW ohw = c66297Q0f.LIZ;
        if (ohw != null) {
            num = ohw.LJ;
        } else {
            num = null;
        }
        jSONObject2.put("entryCategory", num);
        jSONObject2.put("eventLevel", c66297Q0f.LJFF.getValue());
        OHW ohw2 = c66297Q0f.LIZ;
        if (ohw2 != null) {
            str = ohw2.LIZJ;
        } else {
            str = null;
        }
        jSONObject2.put("entryToken", str);
        jSONObject2.put("eventType", c66297Q0f.LIZIZ);
        Application application = LIZ;
        if (application != null) {
            jSONObject2.put("processName", C36835Ecx.LIZ(application));
            jSONObject2.put("status", c66297Q0f.LIZJ);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("costTime", Float.valueOf(((float) c66297Q0f.LJ.LIZIZ.LIZ()) / 1000000.0f));
            jSONObject3.put("threadCostTime", c66297Q0f.LJ.LIZJ.LIZ());
            if (o.LJ(c66297Q0f.LIZIZ, "RulerChecker")) {
                java.util.Map<String, Object> map = c66297Q0f.LJII;
                if (map != null) {
                    obj2 = map.get("rulerCost");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof Long)) {
                    obj2 = null;
                }
                Long l = (Long) obj2;
                if (l != null) {
                    jSONObject3.put("rulerCost", Float.valueOf(((float) l.longValue()) / 1000000.0f));
                }
            }
            if (o.LJ(c66297Q0f.LIZIZ, "ConditionChecker")) {
                java.util.Map<String, Object> map2 = c66297Q0f.LJII;
                if (map2 != null) {
                    obj = map2.get("parseConditionCostTime");
                } else {
                    obj = null;
                }
                if (!(obj instanceof Long)) {
                    obj = null;
                }
                Long l2 = (Long) obj;
                if (l2 != null) {
                    jSONObject3.put("parseConditionCostTime", Float.valueOf(((float) l2.longValue()) / 1000000.0f));
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            OHW ohw3 = c66297Q0f.LIZ;
            if (ohw3 != null && (cert2 = ohw3.LIZIZ) != null) {
                jSONObject = cert2.toJSON();
            } else {
                jSONObject = null;
            }
            jSONObject4.put("cert", jSONObject);
            OHW ohw4 = c66297Q0f.LIZ;
            if (ohw4 != null && (cert = ohw4.LIZIZ) != null) {
                str2 = cert.certToken();
            } else {
                str2 = null;
            }
            jSONObject4.put("certToken", str2);
            OHW ohw5 = c66297Q0f.LIZ;
            if (ohw5 != null) {
                num2 = ohw5.LJ;
            } else {
                num2 = null;
            }
            jSONObject4.put("entryCategory", num2);
            OHW ohw6 = c66297Q0f.LIZ;
            if (ohw6 != null) {
                str3 = ohw6.LIZJ;
            } else {
                str3 = null;
            }
            jSONObject4.put("entryToken", str3);
            jSONObject4.put("eventLevel", c66297Q0f.LJFF.getValue());
            jSONObject4.put("costTime", Float.valueOf(((float) c66297Q0f.LJ.LIZIZ.LIZ()) / 1000000.0f));
            jSONObject4.put("threadCostTime", c66297Q0f.LJ.LIZJ.LIZ());
            jSONObject4.put("eventType", c66297Q0f.LIZIZ);
            Application application2 = LIZ;
            if (application2 != null) {
                jSONObject4.put("processName", C36835Ecx.LIZ(application2));
                jSONObject4.put("status", c66297Q0f.LIZJ);
                jSONObject4.put("msg", c66297Q0f.LIZLLL);
                OHW ohw7 = c66297Q0f.LIZ;
                if (ohw7 != null && (strArr = ohw7.LIZLLL) != null && ORY.LJJIJIIJIL("contact", strArr)) {
                    str4 = "bpea_event_contact";
                } else {
                    OHW ohw8 = c66297Q0f.LIZ;
                    if (ohw8 != null && (str5 = ohw8.LIZJ) != null) {
                        if (ujb.o.LJJJLIIL(str5, "locationSDK", false)) {
                            str4 = "bpea_event_locationSDK";
                        } else if (ujb.o.LJJJLIIL(str5, "LiveCore", false)) {
                            str4 = "bpea_event_LiveCore";
                        } else if (ujb.o.LJJJLIIL(str5, "camera", false)) {
                            str4 = "bpea_event_camera";
                        } else if (ujb.o.LJJJLIIL(str5, "audio", false)) {
                            str4 = "bpea_event_microphone";
                        } else if (ujb.o.LJJJLIIL(str5, "media", false)) {
                            str4 = "bpea_event_media";
                        } else if (ujb.o.LJJJLIIL(str5, OHQ.LIZ, false)) {
                            str4 = "bpea_event_permission";
                        } else if (ujb.o.LJJJLIIL(str5, "clipboard", false)) {
                            str4 = "bpea_event_clipboard";
                        } else if (ujb.o.LJJJLIIL(str5, "location", false)) {
                            str4 = "bpea_event_location";
                        }
                    }
                    str4 = "bpea_event";
                }
                C66310Q0s.LIZIZ.monitorEvent(str4, jSONObject2, jSONObject3, jSONObject4);
                return;
            }
            o.LJIJI("application");
            throw null;
        }
        o.LJIJI("application");
        throw null;
    }

    public static void LIZIZ(C66297Q0f c66297Q0f) {
        String str;
        String str2;
        Cert cert;
        String str3;
        Cert cert2;
        String str4;
        Cert cert3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bpea_error_code", String.valueOf(c66297Q0f.LIZJ));
        String str5 = c66297Q0f.LIZLLL;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("bpea_error_msg", str5);
        OHW ohw = c66297Q0f.LIZ;
        if (ohw == null || (cert3 = ohw.LIZIZ) == null || (str = cert3.certToken()) == null) {
            str = "";
        }
        linkedHashMap.put("bpea_cert_token", str);
        OHW ohw2 = c66297Q0f.LIZ;
        if (ohw2 == null || (str2 = ohw2.LIZJ) == null) {
            str2 = "";
        }
        linkedHashMap.put("bpea_entry_token", str2);
        linkedHashMap.put("bpea_event_level", String.valueOf(c66297Q0f.LJFF.getValue()));
        linkedHashMap.put("bpea_event_type", c66297Q0f.LIZIZ);
        java.util.Map<String, Object> map = c66297Q0f.LJII;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (str4 = value.toString()) == null) {
                    str4 = "";
                }
                linkedHashMap.put(key, str4);
            }
        }
        Throwable th = c66297Q0f.LJI;
        String str6 = null;
        if (th == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("custom error:code=");
            LIZ2.append(c66297Q0f.LIZJ);
            LIZ2.append(" msg=");
            LIZ2.append(c66297Q0f.LIZLLL);
            LIZ2.append(" cert=");
            OHW ohw3 = c66297Q0f.LIZ;
            if (ohw3 != null && (cert2 = ohw3.LIZIZ) != null) {
                str3 = cert2.certToken();
            } else {
                str3 = null;
            }
            LIZ2.append(str3);
            th = new C66312Q0u(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("bpea_custom_error_");
        LIZ3.append(c66297Q0f.LIZJ);
        LIZ3.append('_');
        OHW ohw4 = c66297Q0f.LIZ;
        if (ohw4 != null && (cert = ohw4.LIZIZ) != null) {
            str6 = cert.certToken();
        }
        LIZ3.append(str6);
        String message = X1D.LIZIZ(LIZ3);
        o.LJIIIZ(message, "message");
        IExceptionMonitor iExceptionMonitor = Q0M.LIZ;
        if (iExceptionMonitor != null) {
            iExceptionMonitor.monitorThrowable(th, message, linkedHashMap);
        }
    }
}
