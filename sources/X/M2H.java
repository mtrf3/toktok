package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class M2H implements InterfaceC39861Fkf {
    public final ConcurrentHashMap<Class<?>, M2E<?>> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC39861Fkf
    public final M2H LIZLLL() {
        M2H m2h = new M2H();
        for (Map.Entry<Class<?>, M2E<?>> entry : this.LIZ.entrySet()) {
            m2h.LIZ.put(entry.getKey(), new M2G(entry.getValue().LIZIZ()));
        }
        return m2h;
    }

    @Override // X.InterfaceC39861Fkf
    public final void release() {
        Iterator<Map.Entry<Class<?>, M2E<?>>> it = this.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            Object LIZIZ = it.next().getValue().LIZIZ();
            if (LIZIZ instanceof M2J) {
                ((M2J) LIZIZ).release();
            } else {
                it.remove();
            }
        }
    }

    @Override // X.InterfaceC39861Fkf
    public final <T> T LIZ(Class<T> cls) {
        T t;
        M2E<?> m2e = this.LIZ.get(cls);
        if (m2e == null || (t = (T) m2e.LIZIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // X.InterfaceC39861Fkf
    public final <T> void LIZIZ(Class<T> cls) {
        this.LIZ.remove(cls);
    }

    @Override // X.InterfaceC39861Fkf
    public final <T> void LIZJ(Class<T> cls, T t) {
        if (t != null) {
            if (t instanceof M2I) {
                if (this.LIZ.get(cls) == null) {
                    this.LIZ.put(cls, new M2G(t));
                    return;
                }
                Object LIZ = LIZ(cls);
                while (LIZ instanceof M2I) {
                    M2I m2i = (M2I) LIZ;
                    if (m2i.next() == null) {
                        ((M2I) LIZ).LJIILIIL(t);
                        return;
                    }
                    LIZ = m2i.next();
                }
                return;
            }
            this.LIZ.put(cls, new M2G(t));
            return;
        }
        this.LIZ.put(cls, new M2G(null));
    }
}
