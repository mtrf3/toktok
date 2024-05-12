package com.livecore.base.tinyjson;

import X.C113554cx;
import X.C162476Zf;
import X.ORS;
import X.ORY;
import X.OSZ;
import com.livecore.base.tinyjson.ReflectType;
import com.livecore.base.tinyjson.annotations.Serialized;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class Serializer {
    public static final Serializer INSTANCE = new Serializer();

    private final JSONArray asJSONArray(List<? extends Object> list, Type type) {
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends Object> it = list.iterator();
        while (it.hasNext()) {
            Object serializeSubItem = serializeSubItem(type, it.next());
            if (serializeSubItem != null) {
                jSONArray.put(serializeSubItem);
            }
        }
        return jSONArray;
    }

    private final JSONObject asJSONObject(Map<String, ? extends Object> map, Type type) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object serializeSubItem = serializeSubItem(type, entry.getValue());
            if (serializeSubItem != null) {
                jSONObject.put(key, serializeSubItem);
            }
        }
        return jSONObject;
    }

    private final <T> Object getValueFromObject(TreeNode<ReflectProperty> treeNode, T t) {
        TreeNode<ReflectProperty> parent = treeNode.getParent();
        if (parent != null) {
            ArrayList arrayList = new ArrayList();
            while (parent != null && parent.getParent() != null) {
                Field field = parent.getData().getReflectType().getField();
                if (field != null) {
                    arrayList.add(field);
                }
                parent = parent.getParent();
            }
            Iterator<T> it = ORS.LJJLIIIJL(arrayList).iterator();
            while (it.hasNext()) {
                t = (T) ((Field) it.next()).get(t);
                if (t == null) {
                    return null;
                }
            }
            Field field2 = treeNode.getData().getReflectType().getField();
            if (field2 == null) {
                return null;
            }
            return field2.get(t);
        }
        return t;
    }

    private final Object serializeSubItem(Type type, Object obj) {
        if (type instanceof Class) {
            Class<? extends Object> cls = (Class) type;
            if (DefinitionKt.isDirectType(cls)) {
                return obj;
            }
            return toJson(obj, cls);
        }
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            o.LJIIIIZZ(actualTypeArguments, "type.actualTypeArguments");
            Type subType = (Type) ORY.LJJJJZI(actualTypeArguments);
            if (obj instanceof List) {
                if (obj != null) {
                    o.LJIIIIZZ(subType, "subType");
                    return asJSONArray((List) obj, subType);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            }
            if (obj instanceof Map) {
                if (obj != null) {
                    o.LJIIIIZZ(subType, "subType");
                    return asJSONObject((Map) obj, subType);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            }
        }
        return null;
    }

    public final <T> JSONObject toJson(T obj, Class<? extends Object> clazz) {
        JSONObject jSONObject;
        String str;
        JSONObject asJSONObject;
        JSONArray asJSONArray;
        o.LJIIIZ(obj, "obj");
        o.LJIIIZ(clazz, "clazz");
        TreeNode<ReflectProperty> parseAsTree = ClassParser.INSTANCE.parseAsTree(clazz);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ(parseAsTree, new JSONObject()));
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(parseAsTree);
        while (!arrayDeque.isEmpty()) {
            int size = arrayDeque.size();
            for (int i = 0; i < size; i++) {
                TreeNode<ReflectProperty> treeNode = (TreeNode) arrayDeque.removeFirst();
                Iterator<TreeNode<T>> it = treeNode.getChildren().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast(it.next());
                }
                if (treeNode.getParent() == null) {
                    jSONObject = null;
                } else {
                    jSONObject = (JSONObject) ((LinkedHashMap) LJJLIIIIJ).get(treeNode.getParent());
                }
                Serialized serialized = treeNode.getData().getSerialized();
                if (serialized != null) {
                    str = serialized.value();
                } else {
                    str = null;
                }
                ReflectType reflectType = treeNode.getData().getReflectType();
                if (reflectType instanceof ReflectType.DirectType) {
                    Object valueFromObject = INSTANCE.getValueFromObject(treeNode, obj);
                    if (jSONObject != null && valueFromObject != null && str != null) {
                        jSONObject.put(str, valueFromObject);
                    }
                } else if (reflectType instanceof ReflectType.Struct) {
                    Object obj2 = ((LinkedHashMap) LJJLIIIIJ).get(treeNode);
                    if (obj2 == null) {
                        obj2 = new JSONObject();
                        LJJLIIIIJ.put(treeNode, obj2);
                    }
                    if (jSONObject != null && str != null) {
                        jSONObject.put(str, obj2);
                    }
                } else if (reflectType instanceof ReflectType.List) {
                    Serializer serializer = INSTANCE;
                    Object valueFromObject2 = serializer.getValueFromObject(treeNode, obj);
                    if (!(valueFromObject2 instanceof List)) {
                        valueFromObject2 = null;
                    }
                    List<? extends Object> list = (List) valueFromObject2;
                    if (list != null && (asJSONArray = serializer.asJSONArray(list, ((ReflectType.List) reflectType).getMemberType())) != null && jSONObject != null && str != null) {
                        jSONObject.put(str, asJSONArray);
                    }
                } else if (reflectType instanceof ReflectType.Map) {
                    Serializer serializer2 = INSTANCE;
                    Object valueFromObject3 = serializer2.getValueFromObject(treeNode, obj);
                    if (!(valueFromObject3 instanceof Map)) {
                        valueFromObject3 = null;
                    }
                    Map<String, ? extends Object> map = (Map) valueFromObject3;
                    if (map != null && (asJSONObject = serializer2.asJSONObject(map, ((ReflectType.Map) reflectType).getValueType())) != null && jSONObject != null && str != null) {
                        jSONObject.put(str, asJSONObject);
                    }
                } else {
                    throw new C162476Zf();
                }
            }
        }
        Object obj3 = ((LinkedHashMap) LJJLIIIIJ).get(parseAsTree);
        if (obj3 != null) {
            return (JSONObject) obj3;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }
}
