package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Lys, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56030Lys {
    public static JSONObject LIZ(EnumC56031Lyt sourceType, String str) {
        o.LJIIIZ(sourceType, "sourceType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", sourceType.getValue());
        if (sourceType == EnumC56031Lyt.TAB_SWITCH && str != null && !ujb.o.LJJJJJL(str)) {
            jSONObject.put("previous_page", str);
        }
        return jSONObject;
    }
}
