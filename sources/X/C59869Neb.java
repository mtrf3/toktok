package X;

import java.util.LinkedHashMap;

/* renamed from: X.Neb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59869Neb {
    public final java.util.Map<Class<?>, InterfaceC59876Nei<?>> LIZ = new LinkedHashMap();

    public final <T> T LIZ(Class<T> cls) {
        T t;
        InterfaceC59876Nei interfaceC59876Nei = (InterfaceC59876Nei) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC59876Nei == null || (t = (T) interfaceC59876Nei.LIZIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void LIZIZ(Class<T> cls, InterfaceC59876Nei<? extends T> interfaceC59876Nei) {
        InterfaceC59876Nei interfaceC59876Nei2 = (InterfaceC59876Nei) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC59876Nei2 != null) {
            interfaceC59876Nei2.release();
        }
        this.LIZ.put(cls, interfaceC59876Nei);
    }
}
