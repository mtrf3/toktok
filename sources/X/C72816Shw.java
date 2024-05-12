package X;

import com.bytedance.jedi.arch.JediViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Shw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72816Shw implements InterfaceC72817Shx {
    public boolean LIZ = true;

    @Override // X.InterfaceC72817Shx
    public final <S extends InterfaceC61312at, VM extends JediViewModel<S>, T extends InterfaceC72022SOk<S, VM>> T create(Class<VM> clazz) {
        o.LJIIJ(clazz, "clazz");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(clazz.getName());
        LIZ.append("_MiddlewareBinding");
        String LIZIZ = X1D.LIZIZ(LIZ);
        try {
            if (!this.LIZ) {
                return null;
            }
            java.util.Map<String, Class<?>> map = C126564xw.LIZ;
            Object obj = ((LinkedHashMap) map).get(LIZIZ);
            if (((Class) obj) == null && map.containsKey(LIZIZ)) {
                this.LIZ = false;
                return null;
            }
            Class<?> cls = (Class) obj;
            if (cls == null) {
                cls = Class.forName(LIZIZ);
                map.put(LIZIZ, cls);
            }
            Object newInstance = cls.newInstance();
            if (!(newInstance instanceof InterfaceC72022SOk)) {
                newInstance = null;
            }
            T t = (T) newInstance;
            if (t == null) {
                return null;
            }
            this.LIZ = false;
            return t;
        } catch (Exception unused) {
            C126564xw.LIZ.put(LIZIZ, null);
            this.LIZ = false;
            return null;
        }
    }
}
