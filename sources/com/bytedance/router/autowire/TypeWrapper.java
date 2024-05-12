package com.bytedance.router.autowire;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes6.dex */
public class TypeWrapper<T> {
    public final Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    public Type getType() {
        return this.type;
    }
}
