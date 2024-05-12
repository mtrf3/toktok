package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import ujb.o;

/* renamed from: X.Aoq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27380Aoq {
    public final java.util.Map<String, Object> LIZ;
    public final java.util.Map<String, Object> LIZIZ;
    public final String LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String str, String str2) {
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LIZIZ);
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJJLIL;
        Object obj = linkedHashMap.get("page_name");
        String str3 = "";
        if (obj == null) {
            obj = "";
        }
        LJJLIL.put("previous_page", obj);
        LJJLIL.put("page_name", "select_region");
        if (str2 == null) {
            str2 = "";
        }
        LJJLIL.put("sub_page_name", str2);
        if (str == null) {
            str = "";
        }
        LJJLIL.put("button_name", str);
        LJJLIL.put("if_auto_location", Integer.valueOf(this.LJ ? 1 : 0));
        Object obj2 = linkedHashMap.get("location");
        Object obj3 = obj2;
        if (obj2 == null) {
            obj3 = "unKnown";
        }
        LJJLIL.put("location", obj3);
        Object remove = LJJLIL.remove("page_info");
        if (remove == null) {
            remove = "";
        }
        LJJLIL.put("fill_type", remove);
        Object obj4 = linkedHashMap.get("entrance_info");
        if (obj4 != 0) {
            str3 = obj4;
        }
        LJJLIL.put("entrance_info", str3);
        C76542zS.LIZ("tiktokec_button_click", LJJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C76800UCe LIZIZ(int i, String str, String str2) {
        if (str2 == null || o.LJJJJJL(str2)) {
            return null;
        }
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LIZIZ);
        Object remove = LJJLIL.remove("page_info");
        String str3 = "";
        if (remove == null) {
            remove = "";
        }
        LJJLIL.put("fill_type", remove);
        LJJLIL.put("previous_page", this.LIZJ);
        LJJLIL.put("page_name", "select_region");
        LJJLIL.put("sub_page_name", str2);
        LJJLIL.put("if_auto_location", Integer.valueOf(this.LJ ? 1 : 0));
        if (kotlin.jvm.internal.o.LJ(str, "Select Zipcode")) {
            LJJLIL.put("option_cnt", Integer.valueOf(i));
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJJLIL;
        Object obj = linkedHashMap.get("location");
        Object obj2 = obj;
        if (obj == null) {
            obj2 = "unKnown";
        }
        LJJLIL.put("location", obj2);
        Object obj3 = linkedHashMap.get("entrance_info");
        if (obj3 != 0) {
            str3 = obj3;
        }
        LJJLIL.put("entrance_info", str3);
        C76542zS.LIZ("tiktokec_enter_page", LJJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(String str, String quitType, boolean z) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.o.LJIIIZ(quitType, "quitType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZIZ);
        java.util.Map<String, Object> map = this.LIZIZ;
        String str2 = "";
        if (map == null || (obj = ((LinkedHashMap) map).get("entrance_info")) == null) {
            obj = "";
        }
        linkedHashMap.put("entrance_info", obj);
        linkedHashMap.put("previous_page", this.LIZJ);
        linkedHashMap.put("page_name", "select_region");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("sub_page_name", str);
        linkedHashMap.put("quit_type", quitType);
        linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
        if (this.LIZLLL != -1) {
            linkedHashMap.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - this.LIZLLL));
        }
        linkedHashMap.put("if_auto_location", Integer.valueOf(this.LJ ? 1 : 0));
        if (this.LJ) {
            linkedHashMap.put("if_updated", Integer.valueOf(this.LJFF ? 1 : 0));
        }
        java.util.Map<String, Object> map2 = this.LIZIZ;
        if (map2 != null && (obj2 = ((LinkedHashMap) map2).get("page_info")) != 0) {
            str2 = obj2;
        }
        linkedHashMap.put("fill_type", str2);
        C76542zS.LIZ("tiktokec_stay_page", linkedHashMap);
    }

    public C27380Aoq(String str, String str2, String str3, String str4, Integer num, boolean z, java.util.Map<String, ? extends Object> map) {
        this.LIZ = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZIZ = linkedHashMap;
        this.LIZJ = "shipping_address";
        this.LIZLLL = -1L;
        str4 = str4 == null ? "shipping_address" : str4;
        this.LIZJ = str4;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("previous_page", str4);
        linkedHashMap.put("page_name", str4);
        linkedHashMap.put("location", str2);
        linkedHashMap.put("is_fullscreen", V1M.LJJJJZ(z));
        if (str != null) {
            linkedHashMap.put("page_info", str);
        }
        if (str3 != null) {
            linkedHashMap.put("entrance_info", str3);
        }
        if (num != null) {
            C61845OOz.LIZLLL(num, linkedHashMap, "is_with_delivery_info");
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
    }
}
