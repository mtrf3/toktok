package X;

import java.util.LinkedHashMap;

/* renamed from: X.34G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "location_services_setting", "action", "delete");
        LIZIZ.put("result", str);
        FMX.LJIIL("delete_location_history_result", LIZIZ);
    }

    public static void LIZIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "location_services_setting");
        linkedHashMap.put("action", str);
        FMX.LJIIL("response_delete_location_history", linkedHashMap);
    }

    public static void LIZJ(String str, String str2, Integer num, InterfaceC88472Yns interfaceC88472Yns) {
        LinkedHashMap LIZ2 = C0JU.LIZ("enter_from", "location_services_setting");
        if (str2 != null) {
            LIZ2.put("enter_method", str2);
        }
        LIZ2.put("is_allow", String.valueOf(num));
        interfaceC88472Yns.invoke(LIZ2);
        FMX.LJIIL(str, LIZ2);
    }
}
