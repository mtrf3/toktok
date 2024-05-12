package X;

import android.text.TextUtils;
import com.google.gson.internal.b;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J5A implements J3L {
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        HashMap<String, Object> hashMap = c48545J3l.LIZ;
        J5M j5m = c48545J3l.LIZLLL;
        String feature = j5m.getFeature();
        int length = j5m.getLength();
        String type = j5m.getType();
        Float[] fArr = new Float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = Float.valueOf(0.0f);
        }
        try {
            String str = (String) b.LJIILL("server_feature_embedding_map", hashMap);
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(feature);
                if (!TextUtils.isEmpty(optString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                    J5L.LIZ(optString, fArr, length);
                }
            }
        } catch (Throwable th) {
            C44384HbQ.LJJ("ml#evaluator", "embedding evaluate error: ", th);
        }
        hashMap.put(feature, fArr);
    }
}
