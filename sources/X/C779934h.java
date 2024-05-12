package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.34h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C779934h {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, String str3, String str4, Boolean bool) {
        String str5;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "eventSender");
        if (str == null) {
            str = "";
        }
        LIZ3.put("enter_from", str);
        LIZ3.put("click_response", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ3.put("group_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        LIZ3.put("author_id", str4);
        if (o.LJ(bool, Boolean.TRUE)) {
            str5 = "tv_icon";
        } else {
            str5 = "share_icon";
        }
        LIZ3.put("click_from", str5);
        LIZ2.LIZIZ("casting_to_tv_response", LIZ3);
    }

    public static void LIZ(String str, String str2, String str3, String str4, boolean z, Integer num, String str5, String str6, Long l, boolean z2) {
        String str7;
        String str8;
        Integer num2;
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        if (num == null) {
            str7 = "";
        } else {
            num.intValue();
            str7 = num.toString();
        }
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            str8 = "success";
        } else {
            str8 = "fail";
        }
        jSONObject.put("result", str8);
        jSONObject.put("error_name", str4);
        jSONObject.put("app_id", str7);
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("tv_device_name", str5);
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("casting_device_id", str6);
        jSONObject.put("is_tt_app", String.valueOf(true));
        if (l != null) {
            num2 = Integer.valueOf((int) l.longValue());
        } else {
            num2 = null;
        }
        jSONObject.put("duration", num2);
        jSONObject.put("enter_from", str3);
        if (str == null) {
            str = "";
        }
        jSONObject.put("group_id", str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("author_id", str2);
        jSONObject.put("is_casting", String.valueOf(z));
        eventSender.LIZ("casting_device_connect_result", jSONObject);
    }
}
