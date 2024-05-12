package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class s extends u {
    public final /* synthetic */ Method LIZ;

    public s(Method method) {
        this.LIZ = method;
    }

    @Override // com.google.gson.internal.u
    public final <T> T LIZIZ(Class<T> cls) {
        u.LIZ(cls);
        return (T) this.LIZ.invoke(null, cls, Object.class);
    }
}
