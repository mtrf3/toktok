package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.E8j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35933E8j {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static Object LIZIZ(Object obj, Class cls, Class cls2) {
        Object linkedHashMap;
        if (o.LJ(cls2, Object.class) && (obj instanceof InterfaceC35934E8k)) {
            return ((InterfaceC35934E8k) obj).getValue();
        }
        if ((obj instanceof Integer) || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || obj == null) {
            return obj;
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            linkedHashMap = new ArrayList(C32I.LJJL(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                linkedHashMap.add(LIZIZ(it.next(), cls, cls2));
            }
        } else if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), LIZIZ(entry.getValue(), cls, cls2));
            }
        } else {
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                return obj;
            }
            XBaseModel xBaseModel = (XBaseModel) cls.cast(obj);
            if (xBaseModel != null) {
                return xBaseModel.convert();
            }
            return null;
        }
        return linkedHashMap;
    }

    public static void LIZ(boolean z, String str, List list, Object obj) {
        if (z) {
            if (obj instanceof Collection) {
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return;
                }
                for (Object obj2 : iterable) {
                    if (list != null && (!ORZ.LJLJJI(obj2, list))) {
                    }
                }
                return;
            }
            if (list == null || !(!ORZ.LJLJJI(obj, list))) {
                return;
            }
            throw new EGN(i0.LJFF(str, " is not valid"));
        }
    }
}
