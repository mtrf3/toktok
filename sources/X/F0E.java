package X;

import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class F0E {
    public final java.util.Map<Class<?>, F0F<?>> LIZ = new LinkedHashMap();

    public final <T> T LIZ(Class<T> cls) {
        T t;
        F0F f0f = (F0F) ((LinkedHashMap) this.LIZ).get(cls);
        if (f0f == null || (t = (T) f0f.LIZIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void LIZIZ(Class<T> cls, F0F<T> f0f) {
        F0F f0f2 = (F0F) ((LinkedHashMap) this.LIZ).get(cls);
        if (f0f2 != null) {
            f0f2.release();
        }
        this.LIZ.put(cls, f0f);
    }
}
