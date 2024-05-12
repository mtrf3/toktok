package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class q extends u {
    public final /* synthetic */ Method LIZ;
    public final /* synthetic */ Object LIZIZ;

    @Override // com.google.gson.internal.u
    public final <T> T LIZIZ(Class<T> cls) {
        u.LIZ(cls);
        return (T) this.LIZ.invoke(this.LIZIZ, cls);
    }

    public q(Object obj, Method method) {
        this.LIZ = method;
        this.LIZIZ = obj;
    }
}
