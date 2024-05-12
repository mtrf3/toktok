package X;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.QBx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66601QBx {
    public static final java.util.Map<Class<?>, QC4> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        hashMap.put(Boolean.class, new QC1());
        hashMap.put(Integer.class, new C66603QBz());
        hashMap.put(Long.class, new QC0());
        hashMap.put(Double.class, new C66602QBy());
        hashMap.put(String.class, new QC2());
        hashMap.put(String[].class, new QC3());
        hashMap.put(JSONArray.class, new C66600QBw());
    }

    public static final Bundle LIZ(JSONObject jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jsonObject.get(key);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(key, LIZ((JSONObject) obj));
                } else {
                    QC4 qc4 = (QC4) ((HashMap) LIZ).get(obj.getClass());
                    if (qc4 != null) {
                        o.LJIIIIZZ(key, "key");
                        qc4.LIZ(bundle, key, obj);
                    } else {
                        throw new IllegalArgumentException(o.LJIILLIIL(obj.getClass(), "Unsupported type: "));
                    }
                }
            }
        }
        return bundle;
    }
}
