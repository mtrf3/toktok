package X;

import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJA {
    public static final ConcurrentLinkedQueue<PJB> LIZ = new ConcurrentLinkedQueue<>();
    public static boolean LIZIZ;

    public static boolean LIZ() {
        if (LJIIJ("custom_event_settings", "npth_simple_setting", "disable_kill_history") == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (LJIIJ("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LJIIJ("custom_event_settings", "npth_simple_setting", "enable_gwp_asan") == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LJIIJ("custom_event_settings", "npth_simple_setting", "enable_native_heap_track") == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJ() {
        if (LJIIJ("custom_event_settings", "npth_simple_setting", "enable_simplify_crash_request") == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJFF() {
        if (LJIIJ("custom_event_settings", "npth_simple_setting", "enable_upload_os_meminfo") == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL() {
        if (PKZ.LIZ && LJI() != null) {
            return true;
        }
        return false;
    }

    public static JSONObject LJI() {
        PJ9 pj9 = PJ9.LJFF.get(PK0.LIZIZ().LIZ());
        if (pj9 != null) {
            return pj9.LIZ;
        }
        return null;
    }

    public static void LJIILIIL() {
        String LJFF = PJC.LJFF(LJI(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain");
        JSONArray LIZJ = PJC.LIZJ(LJI(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain_list");
        if (TextUtils.isEmpty(LJFF) || LIZJ == null || LIZJ.length() == 0) {
            C78685UuP.LJJJLL();
        } else if (LJFF.equals(C77321UWf.LJLIL)) {
            C78685UuP.LJJJLL();
        } else {
            int i = 0;
            while (true) {
                if (i < LIZJ.length()) {
                    if (LJFF.equals(LIZJ.optString(0))) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("setDomainName:");
                        LIZ2.append(LJFF);
                        X1D.LIZIZ(LIZ2);
                        C78685UuP.LJJJLL();
                        C77321UWf.LJLIL = LJFF;
                        break;
                    }
                    i++;
                } else {
                    C78685UuP.LJJJLL();
                    break;
                }
            }
        }
        Iterator<PJB> it = LIZ.iterator();
        while (it.hasNext()) {
            PJB next = it.next();
            if (!LIZIZ) {
                next.LIZ();
            }
            next.LIZIZ();
        }
        LIZIZ = true;
    }

    public static int LJIIJ(String... strArr) {
        return PJC.LIZLLL(LJI(), -1, strArr);
    }

    public static boolean LJII(Object obj, String str) {
        JSONObject jSONObject;
        PJ9 LIZIZ2 = PJ9.LIZIZ(obj);
        if (LIZIZ2 == null || (jSONObject = LIZIZ2.LIZ) == null) {
            return false;
        }
        if (LIZIZ2.LIZJ == null) {
            JSONObject LJ = PJC.LJ(jSONObject, "exception_modules", "exception", "metric_sampling", "test");
            LIZIZ2.LIZJ = LJ;
            if (LJ == null) {
                LIZIZ2.LIZJ = new JSONObject();
            }
        }
        if (Math.random() > LIZIZ2.LIZJ.optDouble(str, 1.0d)) {
            return false;
        }
        return true;
    }

    public static int LJIIIIZZ(int i, String... strArr) {
        return PJC.LIZLLL(LJI(), i, strArr);
    }

    public static boolean LJIIIZ(Object obj, String str) {
        PJ9 LIZIZ2 = PJ9.LIZIZ(obj);
        if (LIZIZ2 == null || LIZIZ2.LIZ == null) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return LIZIZ2.LJ;
        }
        if (LIZIZ2.LIZIZ == null) {
            JSONObject LJ = PJC.LJ(LIZIZ2.LIZ, "custom_event_settings", "allow_log_type", "test");
            LIZIZ2.LIZIZ = LJ;
            if (LJ == null) {
                LIZIZ2.LIZIZ = new JSONObject();
            }
        }
        if (LIZIZ2.LIZIZ.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(Object obj, String str) {
        JSONObject jSONObject;
        PJ9 LIZIZ2 = PJ9.LIZIZ(obj);
        if (LIZIZ2 == null || (jSONObject = LIZIZ2.LIZ) == null) {
            return false;
        }
        if (LIZIZ2.LIZLLL == null) {
            JSONObject LJ = PJC.LJ(jSONObject, "custom_event_settings", "allow_service_name", "test");
            LIZIZ2.LIZLLL = LJ;
            if (LJ == null) {
                LIZIZ2.LIZLLL = new JSONObject();
            }
        }
        if (LIZIZ2.LIZLLL.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    public static void LJIILJJIL(JSONArray jSONArray, boolean z) {
        java.util.Map<String, String> map;
        if (jSONArray == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fromnet ");
        LIZ2.append(z);
        LIZ2.append(" : ");
        LIZ2.append(jSONArray);
        X1D.LIZIZ(LIZ2);
        C78685UuP.LJJJLZIJ();
        String LIZ3 = PK0.LIZIZ().LIZ();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= jSONArray.length()) {
                break;
            }
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String next = optJSONObject.keys().next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("update config ");
                LIZ4.append(next);
                LIZ4.append(" : ");
                LIZ4.append(optJSONObject2);
                X1D.LIZIZ(LIZ4);
                C78685UuP.LJJJLL();
                PJ9 pj9 = PJ9.LJFF.get(next);
                if (pj9 != null) {
                    pj9.LIZ = optJSONObject2;
                    if (optJSONObject2 == null || PJC.LIZLLL(optJSONObject2, 0, "exception_modules", "exception", "enable_upload") != 1) {
                        z2 = false;
                    }
                    pj9.LJ = z2;
                } else {
                    new PJ8(optJSONObject2, next);
                }
                if (TextUtils.equals(LIZ3, next)) {
                    LJIILIIL();
                }
                PJ7.LIZJ(next, z);
            } catch (Throwable unused) {
            }
            i++;
        }
        if (z || (map = PJ7.LJ) == null || map.isEmpty() || PJ7.LJ.size() < PJV.LIZ.size()) {
            try {
                PJ7.LJ();
                PK8.LJIILL(new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/configFile"), PJ9.LIZJ());
                if (PJ7.LIZ == null) {
                    PJ7.LIZ = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/configInvalid");
                }
                PK8.LJIIZILJ(PJ7.LIZ, PJ7.LJ);
            } catch (Throwable unused2) {
            }
            C78685UuP.LJJJLL();
        }
    }
}
