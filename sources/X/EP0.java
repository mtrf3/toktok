package X;

import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class EP0 {
    public final java.util.Set<String> LIZ;

    public EP0(JSONObject jSONObject) {
        int length;
        jSONObject.optBoolean("can_skip_confirm");
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            this.LIZ = new HashSet();
            int i = 0;
            do {
                ((HashSet) this.LIZ).add(optJSONArray.optString(i));
                i++;
            } while (i < length);
        }
    }
}
