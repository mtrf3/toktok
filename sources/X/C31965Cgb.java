package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cgb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31965Cgb {
    public final ConcurrentHashMap<Class<?>, InterfaceC31967Cgd<?>> LIZ = new ConcurrentHashMap<>();

    public final <T> T LIZ(Class<T> cls) {
        T t;
        InterfaceC31967Cgd<?> interfaceC31967Cgd = this.LIZ.get(cls);
        if (interfaceC31967Cgd == null || (t = (T) interfaceC31967Cgd.LIZIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void LIZIZ(Class<T> cls, T t) {
        if (t != null) {
            this.LIZ.put(cls, new C31966Cgc(t));
        }
    }
}
