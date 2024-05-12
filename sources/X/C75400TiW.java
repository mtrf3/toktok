package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TiW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75400TiW implements TQW {
    public final java.util.Map<Class<? extends Object>, InterfaceC75402TiY> LIZ = new HashMap();
    public final java.util.Map<Class<? extends Object>, InterfaceC75402TiY> LIZIZ = new HashMap();

    @Override // X.TQW
    public final <T> T LIZ(Class<T> cls) {
        T t = (T) ((HashMap) this.LIZ).get(cls);
        if (t == null) {
            T t2 = (T) ((HashMap) this.LIZIZ).get(cls);
            if (t2 == null) {
                return null;
            }
            return t2;
        }
        return t;
    }

    @Override // X.TQW
    public final void LIZIZ(InterfaceC75402TiY service) {
        o.LJIIIZ(service, "service");
        service.LJJJJI();
        Class<Object> LLIIJI = service.LLIIJI();
        if (LLIIJI != null && LLIIJI.isAssignableFrom(service.getClass())) {
            ((HashMap) this.LIZ).put(LLIIJI, service);
        }
    }
}
