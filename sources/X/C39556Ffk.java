package X;

import com.bytedance.helios.api.consumer.OperateHistory;
import com.bytedance.helios.api.consumer.OperatePairs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ffk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39556Ffk {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Set LIZ(C65903Ptj event) {
        o.LJIIIZ(event, "event");
        if (!event.LJLJJI.isEmpty()) {
            return event.LJLJJI;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Map<Object, ? extends Object> map = event.LJLILLLLZI;
        if (map != null) {
            linkedHashSet.addAll(LIZIZ(map));
        }
        JSONObject jSONObject = event.LJLJI;
        if (jSONObject != null) {
            linkedHashSet.addAll(LIZJ(jSONObject));
        }
        event.LJLJJI = linkedHashSet;
        return linkedHashSet;
    }

    public static java.util.Set LIZIZ(java.util.Map map) {
        if (map == null || map.isEmpty() || !(ORZ.LJLLILLLL(map.keySet()) instanceof String)) {
            return new LinkedHashSet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : new HashMap(map).entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                String str = (String) key;
                Object value = entry.getValue();
                if (value instanceof java.util.Map) {
                    java.util.Map map2 = (java.util.Map) value;
                    if ((!map2.isEmpty()) && (ORZ.LJLLILLLL(map2.keySet()) instanceof String)) {
                        linkedHashSet.addAll(LIZIZ(map2));
                    }
                }
                if (!ujb.o.LJJJJJL(str)) {
                    linkedHashSet.add(str);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return linkedHashSet;
    }

    public static java.util.Set LIZJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new LinkedHashSet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "targetJSONObject.keys()");
        while (keys.hasNext()) {
            String valueOf = String.valueOf(keys.next());
            Object obj = jSONObject.get(valueOf);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof JSONObject) {
                        linkedHashSet.addAll(LIZJ((JSONObject) obj2));
                    }
                }
            } else if (obj instanceof JSONObject) {
                linkedHashSet.addAll(LIZJ((JSONObject) obj));
            }
            if (!ujb.o.LJJJJJL(valueOf)) {
                linkedHashSet.add(valueOf);
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v26, types: [org.json.JSONArray] */
    public static JSONObject LIZLLL(JSONObject jSONObject) {
        Object name;
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "targetJSONObject.keys()");
        while (keys.hasNext()) {
            String valueOf = String.valueOf(keys.next());
            Object obj = jSONObject.get(valueOf);
            if (obj instanceof JSONArray) {
                name = new JSONArray();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof JSONObject) {
                        name.put(LIZLLL((JSONObject) obj2));
                    }
                }
            } else if (obj instanceof JSONObject) {
                name = LIZLLL((JSONObject) obj);
            } else if (obj == null) {
                name = "null";
            } else if (obj instanceof Byte) {
                name = "byte";
            } else if (obj instanceof Short) {
                name = "short";
            } else if (obj instanceof Integer) {
                name = "int";
            } else if (obj instanceof Long) {
                name = "long";
            } else if (obj instanceof Float) {
                name = "float";
            } else if (obj instanceof Character) {
                name = "char";
            } else if (obj instanceof Boolean) {
                name = "boolean";
            } else if (obj instanceof String) {
                name = "string";
            } else {
                name = obj.getClass().getName();
            }
            jSONObject2.put(valueOf, name);
        }
        return jSONObject2;
    }

    public static OperateHistory LJ(java.util.Map map, java.util.Set removeKeys, boolean z) {
        o.LJIIIZ(removeKeys, "removeKeys");
        OperateHistory operateHistory = new OperateHistory("remove", "content", null, 4, null);
        if (map != null && !map.isEmpty() && C65777Prh.LJII(map) && (ORZ.LJLLILLLL(map.keySet()) instanceof String) && !removeKeys.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C65777Prh.LIZJ(map));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (C65777Prh.LJII(value)) {
                    java.util.Map map2 = (java.util.Map) value;
                    if ((!map2.isEmpty()) && (ORZ.LJLLILLLL(map2.keySet()) instanceof String)) {
                        if (value != null) {
                            LJ((java.util.Map) value, removeKeys, z);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        }
                    }
                }
                if ((!ujb.o.LJJJJJL(str)) && !removeKeys.isEmpty()) {
                    Iterator it = removeKeys.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (ujb.o.LJJJJIZL((String) it.next(), str, z)) {
                            arrayList.add(new OperatePairs(str, String.valueOf(C65777Prh.LIZJ(map).remove(str)), null, null, 12, null));
                            break;
                        }
                    }
                }
            }
            operateHistory.setPairs(arrayList);
        }
        return operateHistory;
    }

    public static OperateHistory LJFF(JSONObject jSONObject, java.util.Set removeKeys, boolean z) {
        String str;
        o.LJIIIZ(removeKeys, "removeKeys");
        OperateHistory operateHistory = new OperateHistory("remove", "content", null, 4, null);
        if (jSONObject != null) {
            Iterator<String> keys = new JSONObject(jSONObject.toString()).keys();
            o.LJIIIIZZ(keys, "copyJSONObject.keys()");
            ArrayList arrayList = new ArrayList();
            while (keys.hasNext()) {
                String valueOf = String.valueOf(keys.next());
                Object obj = jSONObject.get(valueOf);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj2 = jSONArray.get(i);
                        if (obj2 instanceof JSONObject) {
                            LJFF((JSONObject) obj2, removeKeys, z);
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    LJFF((JSONObject) obj, removeKeys, z);
                }
                if ((!ujb.o.LJJJJJL(valueOf)) && !removeKeys.isEmpty()) {
                    Iterator it = removeKeys.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (ujb.o.LJJJJIZL((String) it.next(), valueOf, z)) {
                            Object remove = jSONObject.remove(valueOf);
                            if (remove == null || (str = remove.toString()) == null) {
                                str = "null";
                            }
                            arrayList.add(new OperatePairs(valueOf, str, null, null, 12, null));
                        }
                    }
                }
            }
            operateHistory.setPairs(arrayList);
        }
        return operateHistory;
    }
}
