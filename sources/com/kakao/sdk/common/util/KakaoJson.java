package com.kakao.sdk.common.util;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.c;
import com.google.gson.e;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.kakao.sdk.common.json.Exclude;
import com.kakao.sdk.common.json.KakaoTypeAdapterFactory;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KakaoJson {
    public static final KakaoJson INSTANCE = new KakaoJson();
    public static final Gson base;
    public static final e internalBuilder;
    public static final KakaoJson$kakaoExclusionStrategy$1 kakaoExclusionStrategy;
    public static final Gson pretty;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.kakao.sdk.common.util.KakaoJson$kakaoExclusionStrategy$1, com.google.gson.a] */
    static {
        ?? r4 = new a() { // from class: com.kakao.sdk.common.util.KakaoJson$kakaoExclusionStrategy$1
            @Override // com.google.gson.a
            public boolean shouldSkipClass(Class<?> cls) {
                return false;
            }

            @Override // com.google.gson.a
            public boolean shouldSkipField(b bVar) {
                o.LJI(bVar);
                if (bVar.LIZ.getAnnotation(Exclude.class) != null) {
                    return true;
                }
                return false;
            }
        };
        kakaoExclusionStrategy = r4;
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new KakaoTypeAdapterFactory());
        eVar.LIZJ = c.LOWER_CASE_WITH_UNDERSCORES;
        Excluder LJ = eVar.LIZ.LJ(r4, true, false);
        eVar.LIZ = LJ;
        eVar.LIZ = LJ.LJ(r4, false, true);
        internalBuilder = eVar;
        base = eVar.LIZ();
        eVar.LJIILIIL = true;
        pretty = eVar.LIZ();
    }

    public final Gson getBase() {
        return base;
    }

    public final Gson getPretty() {
        return pretty;
    }

    public final <T> String toJson(T t) {
        String json = GsonProtectorUtils.toJson(base, t);
        o.LJIIIIZZ(json, "base.toJson(model)");
        return json;
    }

    public final <T> T fromJson(String string, Type type1) {
        o.LJIIIZ(string, "string");
        o.LJIIIZ(type1, "type1");
        return (T) GsonProtectorUtils.fromJson(base, string, type1);
    }

    public final <T> List<T> listFromJson(String string, Class<T> type) {
        o.LJIIIZ(string, "string");
        o.LJIIIZ(type, "type");
        Object fromJson = GsonProtectorUtils.fromJson(base, string, TypeToken.getParameterized(List.class, type).getType());
        o.LJIIIIZZ(fromJson, "base.fromJson(string, TypeToken.getParameterized(List::class.java, type).type)");
        return (List) fromJson;
    }

    public final <T> T parameterizedFromJson(String string, Type type1, Type type2) {
        o.LJIIIZ(string, "string");
        o.LJIIIZ(type1, "type1");
        o.LJIIIZ(type2, "type2");
        return (T) GsonProtectorUtils.fromJson(base, string, TypeToken.getParameterized(type1, type2).getType());
    }
}
