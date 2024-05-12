package X;

import android.os.Bundle;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OPZ {
    public static void LIZ(int i) {
        Bundle LIZ = C0H1.LIZ("user_type", "existing");
        LIZ.putString("result", String.valueOf(i));
        try {
            AppLogNewUtils.LIZJ("age_range_select_response", LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZJ(String str) {
        try {
            AppLogNewUtils.LIZJ("age_range_select_ymd_show", AnonymousClass036.LIZJ("user_type", "existing", "page_name", str));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZIZ(int i, String str) {
        Bundle LIZ = C0H1.LIZ("user_type", "existing");
        LIZ.putString("is_submit", String.valueOf(i));
        LIZ.putString("page_name", str);
        try {
            AppLogNewUtils.LIZJ("age_range_select_ymd_response", LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJ(String str, java.util.Map builder, java.util.Map logParams) {
        o.LJIIIZ(builder, "builder");
        o.LJIIIZ(logParams, "logParams");
        builder.putAll(logParams);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : builder.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        AppLogNewUtils.onEventV3(str, jSONObject);
    }

    public static void LIZLLL(int i, int i2, long j, String service) {
        o.LJIIIZ(service, "service");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("service", service);
        c198517qh.LIZ.put("code", Integer.valueOf(i2));
        JSONObject LJ = c198517qh.LJ();
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("duration", Long.valueOf(j));
        C09900aA.LJIIJ("compliance_age_gate_api", i, LJ, c198517qh2.LJ(), null);
    }
}
