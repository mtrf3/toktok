package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J59 implements J3L {
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
            ArrayList arrayList = (ArrayList) b.LJIILL("server_feature_embedding_vector", hashMap);
            if (arrayList != null && !arrayList.isEmpty()) {
                int vectorLength = j5m.getVectorLength();
                int vectorNum = j5m.getVectorNum();
                int size = arrayList.size();
                for (int i2 = 0; i2 < vectorNum && i2 < size; i2++) {
                    String str = (String) ListProtector.get(arrayList, i2);
                    if (!TextUtils.isEmpty(str)) {
                        String optString = new JSONObject(str).optString(feature);
                        if (!TextUtils.isEmpty(optString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                            Float[] fArr2 = new Float[vectorLength];
                            for (int i3 = 0; i3 < vectorLength; i3++) {
                                fArr2[i3] = Float.valueOf(0.0f);
                            }
                            J5L.LIZ(optString, fArr2, vectorLength);
                            for (int i4 = 0; i4 < vectorLength; i4++) {
                                fArr[(i2 * vectorLength) + i4] = fArr2[i4];
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C44384HbQ.LJJ("ml#evaluator", "embedding vector evaluate error: ", th);
        }
        if (C40507Fv5.LIZ) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("embedding vector feature: ", feature, " embedding: ");
            LIZIZ.append(Arrays.toString(fArr));
            LIZIZ.append(" len: ");
            LIZIZ.append(length);
            X1D.LIZIZ(LIZIZ);
        }
        hashMap.put(feature, fArr);
    }
}
