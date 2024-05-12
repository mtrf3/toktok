package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes13.dex */
public final class SYP {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(SYQ.LJLIL);

    public final <T extends InterfaceC117044ia> T LIZ(Class<T> cls) {
        T t;
        Object obj = ((java.util.Map) this.LIZ.getValue()).get(cls);
        InterfaceC117044ia interfaceC117044ia = null;
        if (!(obj instanceof InterfaceC117044ia) || (t = (T) obj) == null) {
            Iterator it = ((java.util.Map) this.LIZ.getValue()).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (cls.isAssignableFrom(entry.getValue().getClass())) {
                    interfaceC117044ia = (InterfaceC117044ia) entry.getValue();
                    break;
                }
            }
            return (T) interfaceC117044ia;
        }
        return t;
    }
}
