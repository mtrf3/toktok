package com.amazon.device.iap.internal;

import com.amazon.device.iap.internal.b.g;

/* loaded from: classes.dex */
public final class e {
    public static final String a = e.class.getName();
    public static volatile boolean b;
    public static volatile boolean c;
    public static volatile c d;
    public static volatile a e;
    public static volatile b f;

    public static boolean a() {
        if (c) {
            return b;
        }
        synchronized (e.class) {
            if (c) {
                return b;
            }
            try {
                e.class.getClassLoader().loadClass("com.amazon.android.Kiwi");
                b = false;
            } catch (Throwable unused) {
                b = true;
            }
            c = true;
            return b;
        }
    }

    public static c b() {
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    d = (c) a(c.class);
                }
            }
        }
        return d;
    }

    public static a c() {
        if (e == null) {
            synchronized (e.class) {
                if (e == null) {
                    e = (a) a(a.class);
                }
            }
        }
        return e;
    }

    public static b d() {
        if (f == null) {
            synchronized (e.class) {
                if (f == null) {
                    if (a()) {
                        f = new com.amazon.device.iap.internal.a.d();
                    } else {
                        f = new g();
                    }
                }
            }
        }
        return f;
    }

    public static <T> T a(Class<T> cls) {
        try {
            return d().a(cls).newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
