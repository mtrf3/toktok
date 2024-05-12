package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class r extends u {
    public final /* synthetic */ Method LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // com.google.gson.internal.u
    public final <T> T LIZIZ(Class<T> cls) {
        u.LIZ(cls);
        return (T) this.LIZ.invoke(null, cls, Integer.valueOf(this.LIZIZ));
    }

    public r(int i, Method method) {
        this.LIZ = method;
        this.LIZIZ = i;
    }
}
