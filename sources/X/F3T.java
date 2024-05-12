package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F3T {
    public final String LIZ;
    public C60737Nsb LIZIZ;
    public final java.util.Map<Class<?>, F2Y<?>> LIZJ;

    public F3T() {
        OFH.LIZLLL.getClass();
        this.LIZ = OFH.LJ();
        this.LIZJ = new ConcurrentHashMap();
    }

    public final <T> F2Y<T> LIZ(Class<T> cls) {
        F2Y<T> f2y = (F2Y) ((ConcurrentHashMap) this.LIZJ).get(cls);
        if (f2y != null) {
            return f2y;
        }
        return null;
    }

    public final void LIZIZ(F3T other) {
        o.LJIIJ(other, "other");
        ((ConcurrentHashMap) this.LIZJ).putAll(other.LIZJ);
    }

    public final <T> T LIZJ(Class<T> cls) {
        T t;
        F2Y f2y = (F2Y) ((ConcurrentHashMap) this.LIZJ).get(cls);
        Object obj = null;
        if (f2y != null && (t = (T) f2y.LIZIZ()) != null && cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        C60737Nsb c60737Nsb = this.LIZIZ;
        if (c60737Nsb != null) {
            obj = c60737Nsb.LIZIZ(cls);
        }
        return (T) obj;
    }

    public final <T> void LJI(Class<T> cls) {
        InterfaceC37788EsK interfaceC37788EsK = (InterfaceC37788EsK) ((ConcurrentHashMap) this.LIZJ).get(cls);
        if (interfaceC37788EsK != null) {
            interfaceC37788EsK.release();
        }
        ((ConcurrentHashMap) this.LIZJ).remove(cls);
    }

    public final <T> void LIZLLL(Class<T> cls, T t) {
        LJ(cls, new F25(t));
    }

    public final <T> void LJ(Class<T> cls, F2Y<? extends T> f2y) {
        InterfaceC37788EsK interfaceC37788EsK = (InterfaceC37788EsK) ((ConcurrentHashMap) this.LIZJ).get(cls);
        if (interfaceC37788EsK != null && interfaceC37788EsK != f2y) {
            interfaceC37788EsK.release();
        }
        ((ConcurrentHashMap) this.LIZJ).put(cls, f2y);
    }

    public final <T> void LJFF(Class<T> cls, T t) {
        LJ(cls, new F26(t));
    }
}
