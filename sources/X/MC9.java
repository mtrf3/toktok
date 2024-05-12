package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MC9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String widgetTypeName) {
        o.LJIIIZ(widgetTypeName, "widgetTypeName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("widget_type", widgetTypeName);
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("widget_action", linkedHashMap);
        }
    }

    public static void LIZIZ(int i, int i2, String widgetTypeName, String errorMsg) {
        o.LJIIIZ(widgetTypeName, "widgetTypeName");
        o.LJIIIZ(errorMsg, "errorMsg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("request_type", "referral");
        linkedHashMap.put("widget_type", widgetTypeName);
        linkedHashMap.put("status", "referral");
        if (i == 0) {
            linkedHashMap.put("error_code", String.valueOf(i2));
            linkedHashMap.put("error_msg", errorMsg);
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("widget_response", linkedHashMap);
        }
    }
}
