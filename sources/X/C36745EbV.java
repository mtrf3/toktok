package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.EbV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36745EbV {
    public static final java.util.Map<Class<?>, Object> LIZ = new ConcurrentHashMap();

    public static void LIZ(Class cls, String str) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls2.getClass().isAssignableFrom(cls.getClass())) {
                Object newInstance = cls2.newInstance();
                if (newInstance == null) {
                    new Throwable();
                } else {
                    ((ConcurrentHashMap) LIZ).put(cls, newInstance);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
