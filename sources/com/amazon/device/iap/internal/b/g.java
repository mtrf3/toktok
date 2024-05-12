package com.amazon.device.iap.internal.b;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements com.amazon.device.iap.internal.b {
    public static final Map<Class, Class> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(com.amazon.device.iap.internal.c.class, c.class);
        hashMap.put(com.amazon.device.iap.internal.a.class, f.class);
    }

    @Override // com.amazon.device.iap.internal.b
    public <T> Class<T> a(Class<T> cls) {
        return a.get(cls);
    }
}
