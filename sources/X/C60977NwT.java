package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NwT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60977NwT {
    public static final C188727au LIZ = new C188727au();
    public static final java.util.Map<String, String> LIZIZ = new LinkedHashMap();

    public static String LIZJ() {
        String str = C60983NwZ.LIZ;
        if (o.LJ(str, "safe") || o.LJ(str, "loading")) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    public static void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(LIZ.LIZ);
        c188727au.LJI("edge_type", C60983NwZ.LIZ);
        c188727au.LJI("button_name", str);
        FMX.LJIIL("edge_case_click", c188727au.LIZ);
    }

    public static void LIZIZ(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "url");
        LIZLLL.LJIIIIZZ(LIZ.LIZ);
        LIZLLL.LJI("edge_type", C60983NwZ.LIZ);
        if (C60983NwZ.LIZ()) {
            LIZLLL.LJI("scc_url", str);
            LIZLLL.LJI("scc_logid", C35975E9z.LIZJ);
            LIZLLL.LJI("scc_reason", C35975E9z.LIZIZ);
        }
        FMX.LJIIL("edge_case_show", LIZLLL.LIZ);
    }

    public static void LIZLLL(JSONObject jSONObject) {
        if (jSONObject == null) {
            ((LinkedHashMap) LIZIZ).clear();
            return;
        }
        for (Map.Entry<String, Object> entry : JsonExtKt.toMap(jSONObject).entrySet()) {
            LIZIZ.put(entry.getKey(), entry.getValue().toString());
        }
    }

    public static void LJ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(LIZ.LIZ);
        c188727au.LJI("button_name", str);
        c188727au.LJI("is_edge_case", LIZJ());
        String str2 = (String) ((LinkedHashMap) LIZIZ).get("business_event_keys_button_click");
        if (C78685UuP.LJJJZ(str2)) {
            FMX.LJIIL(str2, c188727au.LIZ);
        } else {
            FMX.LJIIL("search_webpage_button_click", c188727au.LIZ);
        }
    }

    public static void LJFF(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(LIZ.LIZ);
        c188727au.LJI("button_name", str);
        c188727au.LJI("is_edge_case", LIZJ());
        FMX.LJIIL("search_webpage_button_show", c188727au.LIZ);
    }

    public static void LJI(long j) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(LIZ.LIZ);
        c188727au.LJI("duration", String.valueOf(System.currentTimeMillis() - j));
        if (C60986Nwc.LJ) {
            c188727au.LIZLLL(C60986Nwc.LJFF, "page_num");
            C60986Nwc.LJFF = 0;
        }
        String str = (String) ((LinkedHashMap) LIZIZ).get("business_event_keys_stay_time");
        if (C78685UuP.LJJJZ(str)) {
            FMX.LJIIL(str, c188727au.LIZ);
        } else {
            FMX.LJIIL("search_webpage_stay_time", c188727au.LIZ);
        }
    }
}
