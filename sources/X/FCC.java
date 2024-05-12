package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FCC {
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();

    public FCC(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("includes");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excludes");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String includePattern = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(includePattern)) {
                    List<String> list = this.LIZ;
                    o.LJIIIIZZ(includePattern, "includePattern");
                    ((ArrayList) list).add(includePattern);
                }
            }
        }
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String excludePattern = optJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(excludePattern)) {
                    List<String> list2 = this.LIZIZ;
                    o.LJIIIIZZ(excludePattern, "excludePattern");
                    ((ArrayList) list2).add(excludePattern);
                }
            }
        }
    }
}
