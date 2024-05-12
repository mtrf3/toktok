package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LzA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56048LzA {
    public static JSONObject LIZ(EnumC56031Lyt deeplinkFrom, String str) {
        o.LJIIIZ(deeplinkFrom, "deeplinkFrom");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deeplink_schema", str);
        jSONObject.put("deeplink_from", deeplinkFrom.getValue());
        return jSONObject;
    }
}
