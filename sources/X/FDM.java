package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FDM {
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final List<C38596FCu> LIZJ = new ArrayList();

    public FDM(JSONObject jSONObject) {
        JSONArray names;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("param_validator");
        if (optJSONObject2 != null && (names = optJSONObject2.names()) != null && names.length() > 0) {
            int length = names.length();
            for (int i = 0; i < length; i++) {
                String paramKey = names.optString(i);
                if (!TextUtils.isEmpty(paramKey) && (optJSONObject = optJSONObject2.optJSONObject(paramKey)) != null) {
                    List<C38596FCu> list = this.LIZJ;
                    o.LJIIIIZZ(paramKey, "paramKey");
                    ((ArrayList) list).add(new C38596FCu(paramKey, optJSONObject));
                }
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("param_includes");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length2 = optJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String paramInclude = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(paramInclude)) {
                    List<String> list2 = this.LIZ;
                    o.LJIIIIZZ(paramInclude, "paramInclude");
                    ((ArrayList) list2).add(paramInclude);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("param_excludes");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            int length3 = optJSONArray2.length();
            for (int i3 = 0; i3 < length3; i3++) {
                String paramExclude = optJSONArray2.optString(i3);
                if (!TextUtils.isEmpty(paramExclude)) {
                    List<String> list3 = this.LIZIZ;
                    o.LJIIIIZZ(paramExclude, "paramExclude");
                    ((ArrayList) list3).add(paramExclude);
                }
            }
        }
    }
}
