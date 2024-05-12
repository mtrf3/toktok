package com.livecore.base.tinyjson;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class TinyJson {
    public static final TinyJson INSTANCE = new TinyJson();

    public static final <T> T fromJson(JSONObject jSONObject, Class<T> cls) {
        return (T) fromJson$default(jSONObject, cls, null, 4, null);
    }

    public static final <T> JSONObject toJson(T obj, Class<T> clazz) {
        o.LJIIIZ(obj, "obj");
        o.LJIIIZ(clazz, "clazz");
        return Serializer.INSTANCE.toJson(obj, clazz);
    }

    public static final <T> T fromJson(JSONObject json, Class<T> clazz, T t) {
        o.LJIIIZ(json, "json");
        o.LJIIIZ(clazz, "clazz");
        return (T) Deserializer.INSTANCE.fromJson(json, clazz, t);
    }

    public static /* synthetic */ Object fromJson$default(JSONObject jSONObject, Class cls, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return fromJson(jSONObject, cls, obj);
    }
}
