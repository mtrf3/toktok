package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KFQ {
    public final KE0 LIZ;
    public final KEP LIZIZ;
    public final int LIZJ;
    public long LIZLLL;
    public long LJ;
    public boolean LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ = true;
    public final java.util.Map<String, Object> LJIIIZ = new LinkedHashMap();

    public final void LIZLLL() {
        int value;
        String str;
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        Integer valueOf;
        String LJFF;
        InterfaceC51365KDx LIZ2;
        C50948Jz6 ha2;
        InterfaceC51365KDx LIZ3;
        C50948Jz6 ha3;
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJIIIZ);
        KEP kep = this.LIZIZ;
        if (kep != null && (LIZ3 = kep.LIZ()) != null && (ha3 = LIZ3.ha()) != null) {
            value = ha3.getEcSearchEntranceValue();
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        KB0 LIZLLL = KB1.LIZLLL(value);
        KEP kep2 = this.LIZIZ;
        String str2 = "";
        if (kep2 == null || (LIZ2 = kep2.LIZ()) == null || (ha2 = LIZ2.ha()) == null || (str = ha2.getEnterSearchFrom()) == null) {
            str = "";
        }
        LJJLIL.put("enter_search_from", str);
        LJJLIL.put("traceparent", PII.LIZIZ());
        LJJLIL.put("search_type", LIZLLL.getValue());
        KE0 ke0 = this.LIZ;
        if (ke0 != null && (LJFF = ke0.LJFF()) != null) {
            str2 = LJFF;
        }
        LJJLIL.put("search_id", str2);
        KEP kep3 = this.LIZIZ;
        if (kep3 != null && (LIZ = kep3.LIZ()) != null && (ha = LIZ.ha()) != null && (valueOf = Integer.valueOf(ha.getEcSearchEntranceValue())) != null) {
            LJJLIL.put("root_enter_from_type", Integer.valueOf(valueOf.intValue()));
        }
        C76542zS.LIZ("rd_ec_search_page_start", LJJLIL);
    }

    public final void LJ(String str) {
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJIIIZ);
        LJJLIL.put(WM7.SCENE_SERVICE, str);
        LJJLIL.put("native_request_count", 0);
        LJJLIL.put("request_count", 0);
        if (o.LJ(str, "search_exit")) {
            LJJLIL.put("has_result", Integer.valueOf(this.LJFF ? 1 : 0));
            LJJLIL.put("exit_duration", Long.valueOf(System.currentTimeMillis() - this.LJI));
        }
        LJJLIL.put("visiable", Integer.valueOf(this.LJII ? 1 : 0));
        C76542zS.LIZ("rd_ec_search_request_trace", LJJLIL);
    }

    public KFQ(KE0 ke0, KEP kep, int i) {
        this.LIZ = ke0;
        this.LIZIZ = kep;
        this.LIZJ = i;
    }

    public static void LIZ(KFQ kfq, String str, String str2, int i) {
        String str3;
        KEA LIZIZ;
        java.util.Map<String, Object> map = kfq.LJIIIZ;
        map.put("enter_method", str);
        map.put("enter_from", str2);
        map.put("is_native_request", 1);
        map.put("trace_type", 0);
        map.put("request_count", Integer.valueOf(i));
        map.put("index", Integer.valueOf(kfq.LIZJ));
        KEP kep = kfq.LIZIZ;
        if (kep == null || (LIZIZ = kep.LIZIZ()) == null || (str3 = LIZIZ.LIZJ(kfq.LIZJ)) == null) {
            str3 = "";
        }
        map.put("tab_name", str3);
    }

    public final void LIZIZ(int i, int i2, long j, String str, boolean z) {
        String str2;
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        Integer valueOf;
        if (z) {
            this.LJ = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJ;
        if (z) {
            str2 = "rd_ec_request_send";
        } else {
            str2 = "rd_ec_request_result";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = ((LinkedHashMap) this.LJIIIZ).get("tab_name");
        Object obj2 = obj;
        if (obj == null) {
            obj2 = "";
        }
        linkedHashMap.put("page_name", obj2);
        linkedHashMap.put("request_method", "template");
        linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - this.LIZLLL));
        Object obj3 = ((LinkedHashMap) this.LJIIIZ).get("enter_from");
        if (obj3 != null) {
            linkedHashMap.put("enter_from", obj3);
        }
        linkedHashMap.put("request_type", Integer.valueOf(!this.LJIIIIZZ ? 1 : 0));
        if (!z) {
            linkedHashMap.put("api_duration", Long.valueOf(currentTimeMillis));
            linkedHashMap.put("is_success", Integer.valueOf(i));
            linkedHashMap.put("item_count", Integer.valueOf(i2));
            linkedHashMap.put("params", 0);
        }
        linkedHashMap.put("api_path", str);
        linkedHashMap.put("cursor", Long.valueOf(j));
        KEP kep = this.LIZIZ;
        if (kep != null && (LIZ = kep.LIZ()) != null && (ha = LIZ.ha()) != null && (valueOf = Integer.valueOf(ha.getEcSearchEntranceValue())) != null) {
            C61845OOz.LIZLLL(valueOf, linkedHashMap, "root_enter_from_type");
        }
        C76542zS.LIZ(str2, linkedHashMap);
        if (!z) {
            this.LJIIIIZZ = false;
        }
    }

    public static /* synthetic */ void LIZJ(KFQ kfq, boolean z, int i, int i2, String str, int i3) {
        int i4 = i;
        int i5 = i2;
        if ((i3 & 2) != 0) {
            i4 = 0;
        }
        if ((i3 & 4) != 0) {
            i5 = 0;
        }
        kfq.LIZIZ(i4, i5, 0L, str, z);
    }
}
