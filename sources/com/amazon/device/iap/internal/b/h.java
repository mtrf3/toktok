package com.amazon.device.iap.internal.b;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {
    public static final /* synthetic */ boolean b = true;
    public final Map<String, Object> a = new HashMap();

    public Object a() {
        return this.a.get("RESPONSE");
    }

    public void b() {
        this.a.remove("RESPONSE");
    }

    public void a(Object obj) {
        if (b || obj != null) {
            this.a.put("RESPONSE", obj);
            return;
        }
        throw new AssertionError();
    }

    public Object a(String str) {
        return this.a.get(str);
    }

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }
}
