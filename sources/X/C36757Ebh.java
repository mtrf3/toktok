package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.SortedMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ebh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36757Ebh {
    public static C36760Ebk LIZ(JSONObject jSONObject) {
        SortedMap<String, String> sortedMap;
        String string = JSONObjectProtectorUtils.getString(jSONObject, "page_url");
        o.LJFF(string, "requestObject.getString(\"page_url\")");
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "request");
        o.LJFF(jSONObject2, "requestObject.getJSONObject(\"request\")");
        C36760Ebk c36760Ebk = new C36760Ebk(string, new C36758Ebi(jSONObject2), JSONObjectProtectorUtils.getLong(jSONObject, "timestamp"), JSONObjectProtectorUtils.getLong(jSONObject, "expires"));
        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "response");
        new C36754Ebe();
        o.LJFF(jSONObject3, "this");
        C36754Ebe c36754Ebe = new C36754Ebe();
        JSONObject optJSONObject = jSONObject3.optJSONObject("headers");
        SortedMap<String, String> sortedMap2 = null;
        if (optJSONObject != null) {
            sortedMap = C36748EbY.LIZLLL(optJSONObject);
        } else {
            sortedMap = null;
        }
        c36754Ebe.LIZJ = sortedMap;
        c36754Ebe.LIZIZ = jSONObject3.optString("body");
        c36754Ebe.LIZLLL = jSONObject3.optInt("status_code");
        JSONObject optJSONObject2 = jSONObject3.optJSONObject("extra");
        if (optJSONObject2 != null) {
            sortedMap2 = C36748EbY.LIZLLL(optJSONObject2);
        }
        c36754Ebe.LJ = sortedMap2;
        c36760Ebk.LJFF = c36754Ebe;
        return c36760Ebk;
    }
}
