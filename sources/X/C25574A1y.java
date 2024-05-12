package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.A1y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25574A1y {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", str2);
        c198517qh.LIZ.put("status", Integer.valueOf(i));
        C8HX.LIZIZ(str, "", c198517qh.LJ());
    }

    public static void LIZJ(String str, String str2, String error_code) {
        o.LJIIIZ(error_code, "error_code");
        LIZIZ(1, "compliance_api_status", str, str2, error_code);
    }

    public static void LIZLLL(String str, java.util.Map map, boolean z) {
        if (z) {
            return;
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", str);
        if (map != null) {
            c198517qh.LIZLLL("error_message", map.toString());
        }
        C8HX.LIZIZ("compliance_assert", "", c198517qh.LJ());
    }

    public static void LJFF(int i, String str, String str2, String error_code) {
        o.LJIIIZ(error_code, "error_code");
        LIZIZ(i, "tns_api_status", str, str2, error_code);
    }

    public static void LIZIZ(int i, String str, String str2, String str3, String str4) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", str2);
        c198517qh.LIZ.put("status", Integer.valueOf(i));
        c198517qh.LIZ.put("error_message", str4);
        c198517qh.LIZ.put("tns_logId", str3);
        C8HX.LIZIZ(str, "", c198517qh.LJ());
    }

    public static void LJ(long j, java.util.Map map, String path, int i, String logId) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(logId, "logId");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("total_duration", Long.valueOf(j));
        JSONObject LJ = c198517qh.LJ();
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("url_path", path);
        c198517qh2.LIZ.put("status_code", Integer.valueOf(i));
        if (logId.length() > 0) {
            c198517qh2.LIZLLL("log_id", logId);
        }
        C198517qh c198517qh3 = new C198517qh();
        if (map != null) {
            for (String str : map.keySet()) {
                c198517qh3.LIZLLL(str, (String) map.get(str));
            }
        }
        try {
            C09900aA.LJI("compliance_biz_network", c198517qh2.LJ(), LJ, c198517qh3.LJ());
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
