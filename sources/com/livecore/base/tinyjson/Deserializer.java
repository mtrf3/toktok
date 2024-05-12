package com.livecore.base.tinyjson;

import X.ORS;
import X.ORY;
import com.livecore.base.tinyjson.annotations.Serialized;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class Deserializer {
    public static final Deserializer INSTANCE = new Deserializer();

    private final List<?> asList(JSONArray jSONArray, Type type) {
        Object deserializeSubItem;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj != null && (deserializeSubItem = deserializeSubItem(type, obj)) != null) {
                arrayList.add(deserializeSubItem);
            }
        }
        return arrayList;
    }

    private final Map<String, ?> asMap(JSONObject jSONObject, Type type) {
        Object deserializeSubItem;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "this.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jSONObject.opt(key);
            if (opt != null && (deserializeSubItem = deserializeSubItem(type, opt)) != null) {
                o.LJIIIIZZ(key, "key");
                hashMap.put(key, deserializeSubItem);
            }
        }
        return hashMap;
    }

    private final Object deserializeSubItem(Type type, Object obj) {
        if (type instanceof Class) {
            if (obj instanceof Number) {
                return DefinitionKt.smartCastAs(obj, (Class) type);
            }
            if (!(obj instanceof JSONObject)) {
                return obj;
            }
            return fromJson$default(this, (JSONObject) obj, (Class) type, null, 4, null);
        }
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            o.LJIIIIZZ(actualTypeArguments, "type.actualTypeArguments");
            Type subType = (Type) ORY.LJJJJZI(actualTypeArguments);
            if (obj instanceof JSONObject) {
                o.LJIIIIZZ(subType, "subType");
                return asMap((JSONObject) obj, subType);
            }
            if (obj instanceof JSONArray) {
                o.LJIIIIZZ(subType, "subType");
                return asList((JSONArray) obj, subType);
            }
        }
        return null;
    }

    private final Object getDataFromJson(TreeNode<ReflectProperty> treeNode, JSONObject jSONObject, Class<? extends Object> cls) {
        String str;
        String value;
        TreeNode<ReflectProperty> parent = treeNode.getParent();
        if (parent != null) {
            ArrayList arrayList = new ArrayList();
            while (parent != null && parent.getParent() != null) {
                Serialized serialized = parent.getData().getSerialized();
                if (serialized != null && (value = serialized.value()) != null) {
                    arrayList.add(value);
                }
                parent = parent.getParent();
            }
            Iterator<T> it = ORS.LJJLIIIJL(arrayList).iterator();
            while (it.hasNext()) {
                jSONObject = jSONObject.optJSONObject((String) it.next());
                if (jSONObject == null) {
                    return null;
                }
            }
            Serialized serialized2 = treeNode.getData().getSerialized();
            if (serialized2 == null || (str = serialized2.value()) == null) {
                str = "";
            }
            Object opt = jSONObject.opt(str);
            if ((opt instanceof Number) || (opt instanceof String) || (opt instanceof Boolean) || (opt instanceof JSONObject)) {
                return DefinitionKt.smartCastAs(opt, cls);
            }
            return opt;
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T fromJson(org.json.JSONObject r12, java.lang.Class<T> r13, T r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.livecore.base.tinyjson.Deserializer.fromJson(org.json.JSONObject, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    public static /* synthetic */ Object fromJson$default(Deserializer deserializer, JSONObject jSONObject, Class cls, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return deserializer.fromJson(jSONObject, cls, obj);
    }
}
