package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KFR {
    public final KAK LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public boolean LJFF;
    public final java.util.Map<String, Object> LJI;

    public KFR(KAK tab) {
        o.LJIIIZ(tab, "tab");
        this.LIZ = tab;
        this.LJFF = true;
        this.LJI = new LinkedHashMap();
    }

    public final void LIZLLL(C50948Jz6 c50948Jz6) {
        int value;
        String str;
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJI);
        if (c50948Jz6 != null) {
            value = c50948Jz6.getEcSearchEntranceValue();
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        KB0 LIZLLL = KB1.LIZLLL(value);
        String str2 = "";
        if (c50948Jz6 == null || (str = c50948Jz6.getEnterSearchFrom()) == null) {
            str = "";
        }
        LJJLIL.put("enter_search_from", str);
        LJJLIL.put("traceparent", PII.LIZIZ());
        LJJLIL.put("search_type", LIZLLL.getValue());
        String LIZ = Z9N.LIZIZ.LIZ();
        if (LIZ != null) {
            str2 = LIZ;
        }
        LJJLIL.put("search_id", str2);
        if (c50948Jz6 != null) {
            LJJLIL.put("root_enter_from_type", Integer.valueOf(c50948Jz6.getEcSearchEntranceValue()));
        }
        C76542zS.LIZ("rd_ec_search_page_start", LJJLIL);
    }

    public final void LJ(String str) {
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJI);
        LJJLIL.put(WM7.SCENE_SERVICE, str);
        LJJLIL.put("native_request_count", 0);
        LJJLIL.put("request_count", 0);
        if (o.LJ(str, "search_exit")) {
            LJJLIL.put("has_result", Integer.valueOf(this.LIZLLL ? 1 : 0));
            LJJLIL.put("exit_duration", Long.valueOf(System.currentTimeMillis() - this.LJ));
        }
        LJJLIL.put("visiable", 0);
        C76542zS.LIZ("rd_ec_search_request_trace", LJJLIL);
    }

    public static void LIZ(KFR kfr, String str, String str2, int i) {
        java.util.Map<String, Object> map = kfr.LJI;
        map.put("enter_method", str);
        map.put("enter_from", str2);
        map.put("is_native_request", 1);
        map.put("trace_type", 0);
        map.put("request_count", Integer.valueOf(i));
        map.put("tab_name", kfr.LIZ.getTabName());
    }

    public static /* synthetic */ void LIZJ(KFR kfr, C50948Jz6 c50948Jz6, boolean z, int i, int i2) {
        int i3 = i;
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        kfr.LIZIZ(c50948Jz6, z, i3, 0, "/aweme/v1/search/ecom/order/", 0L);
    }

    public final void LIZIZ(C50948Jz6 c50948Jz6, boolean z, int i, int i2, String str, long j) {
        String str2;
        if (z) {
            this.LIZJ = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        if (z) {
            str2 = "rd_ec_request_send";
        } else {
            str2 = "rd_ec_request_result";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = ((LinkedHashMap) this.LJI).get("tab_name");
        Object obj2 = obj;
        if (obj == null) {
            obj2 = "";
        }
        linkedHashMap.put("page_name", obj2);
        linkedHashMap.put("request_method", "template");
        linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - this.LIZIZ));
        Object obj3 = ((LinkedHashMap) this.LJI).get("enter_from");
        if (obj3 != null) {
            linkedHashMap.put("enter_from", obj3);
        }
        linkedHashMap.put("request_type", Integer.valueOf(!this.LJFF ? 1 : 0));
        if (!z) {
            linkedHashMap.put("api_duration", Long.valueOf(currentTimeMillis));
            linkedHashMap.put("is_success", Integer.valueOf(i));
            linkedHashMap.put("item_count", Integer.valueOf(i2));
            linkedHashMap.put("params", 0);
        }
        linkedHashMap.put("api_path", str);
        linkedHashMap.put("cursor", Long.valueOf(j));
        if (c50948Jz6 != null) {
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(c50948Jz6.getEcSearchEntranceValue()));
        }
        C76542zS.LIZ(str2, linkedHashMap);
        if (!z) {
            this.LJFF = false;
        }
    }
}
