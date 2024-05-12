package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a4Q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92046a4Q {
    public static InterfaceC88471Ynr<? super String, ? super JSONObject, C76800UCe> LIZ = C92985aJZ.LJLIL;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;

    public static void LIZ(String eventName, JSONObject content) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(content, "content");
        InterfaceC88471Ynr<? super String, ? super JSONObject, C76800UCe> interfaceC88471Ynr = LIZ;
        try {
            String str = LIZLLL;
            if (str != null) {
                content.put("order_id", str);
            }
            String str2 = LIZIZ;
            if (str2 != null) {
                content.put("merchant_id", str2);
            }
            String str3 = LIZJ;
            if (str3 != null) {
                content.put("merchant_user_id", str3);
            }
            String str4 = LJ;
            if (str4 != null) {
                content.put("device_source", str4);
            }
            content.put("sdk_version", "1.0.6-tiktok");
            content.put("os_version", C92045a4P.LIZ);
            content.put("product_type", "instant_payment");
        } catch (Throwable unused) {
        }
        interfaceC88471Ynr.invoke(eventName, content);
    }
}
