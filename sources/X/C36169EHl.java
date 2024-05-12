package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.IDLXDynamic;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EHl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36169EHl {
    public static final JSONArray LIZ(List<?> source) {
        o.LJIIJ(source, "source");
        JSONArray jSONArray = new JSONArray();
        List LJLL = ORZ.LJLL(source);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJLL, 10));
        for (Object obj : LJLL) {
            if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
                obj = obj instanceof List ? LIZ((List) obj) : obj instanceof java.util.Map ? LIZIZ((java.util.Map) obj) : obj instanceof IDLXDynamic ? C77357UXp.LJJJJLL((IDLXDynamic) obj) : obj instanceof XBaseModel ? ((XBaseModel) obj).toJSON() : null;
            }
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                jSONArray.put(next);
            }
        }
        return jSONArray;
    }

    public static final JSONObject LIZIZ(java.util.Map<?, ?> source) {
        o.LJIIJ(source, "source");
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(source.size());
        for (Map.Entry<?, ?> entry : source.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (!(value instanceof Integer) && !(value instanceof Long) && !(value instanceof String) && !(value instanceof Boolean) && !(value instanceof Double)) {
                value = value instanceof List ? LIZ((List) value) : value instanceof java.util.Map ? LIZIZ((java.util.Map) value) : value instanceof IDLXDynamic ? C77357UXp.LJJJJLL((IDLXDynamic) value) : value instanceof XBaseModel ? ((XBaseModel) value).toJSON() : null;
            }
            arrayList.add(new OSZ(key, value));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            Object first = osz.getFirst();
            if (first != null && (first instanceof String)) {
                jSONObject.put((String) first, osz.getSecond());
            }
        }
        return jSONObject;
    }
}
