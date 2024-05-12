package com.kakao.sdk.common.json;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KakaoTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        Class<? super T> rawType = type.getRawType();
        if (rawType != null) {
            if (o.LJ(rawType, Date.class)) {
                return new KakaoDateTypeAdapter();
            }
            if (rawType.isEnum()) {
                return new KakaoEnumTypeAdapter(rawType);
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
    }
}
