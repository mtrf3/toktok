package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q4G {
    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static Q4I LIZ(JSONObject jSONObject) {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject(OHQ.LIZIZ).getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString2 = optJSONObject.optString(OHQ.LIZ);
                o.LJIIIIZZ(optString2, OHQ.LIZ);
                if (optString2.length() != 0 && !o.LJ(optString2, "installed") && (optString = optJSONObject.optString("status")) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(optString2);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(optString2);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(optString2);
                    }
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new Q4I(arrayList, arrayList2, arrayList3);
    }
}
