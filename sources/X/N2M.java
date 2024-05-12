package X;

import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N2M implements N2P {
    @Override // X.N2P
    public final void LIZ(JSONObject jSONObject, String key, Object obj) {
        o.LJIIIZ(key, "key");
        JSONArray jSONArray = new JSONArray();
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            jSONArray.put(str);
        }
        jSONObject.put(key, jSONArray);
    }
}
