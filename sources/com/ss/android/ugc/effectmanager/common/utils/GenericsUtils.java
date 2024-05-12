package com.ss.android.ugc.effectmanager.common.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes6.dex */
public class GenericsUtils {
    public static Class getSuperClassGenericType(Class cls) {
        return getSuperClassGenericType(cls, 0);
    }

    public static Class getSuperClassGenericType(Class cls, int i) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        if (i >= actualTypeArguments.length || i < 0) {
            return Object.class;
        }
        Type type = actualTypeArguments[i];
        if (!(type instanceof Class)) {
            return Object.class;
        }
        return (Class) type;
    }
}
