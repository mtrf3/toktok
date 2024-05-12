package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EP2 {
    public final java.util.Map<String, C36733EbJ> LIZ;

    public EP2(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJFF(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String it = keys.next();
            o.LJFF(it, "it");
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, it);
            o.LJFF(jSONObject2, "jsonObject.getJSONObject(it)");
            linkedHashMap.put(it, new C36733EbJ(it, jSONObject2));
        }
        this.LIZ = linkedHashMap;
    }
}
