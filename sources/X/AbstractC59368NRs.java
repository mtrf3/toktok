package X;

import java.util.LinkedHashMap;

/* renamed from: X.NRs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59368NRs<KEY, STORE_TYPE> {
    public final InterfaceC88472Yns<KEY, STORE_TYPE> LIZ;
    public final InterfaceC88472Yns<STORE_TYPE, KEY> LIZIZ;
    public final java.util.Map<Class<? extends KEY>, STORE_TYPE> LIZJ = new LinkedHashMap();

    public final <T extends KEY> T LIZ(Class<? extends T> cls) {
        T t;
        Object obj = ((LinkedHashMap) this.LIZJ).get(cls);
        if (obj == null || (t = (T) this.LIZIZ.invoke(obj)) == null) {
            return null;
        }
        return t;
    }

    public AbstractC59368NRs(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88472Yns2;
    }
}
