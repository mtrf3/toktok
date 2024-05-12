package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NVv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59475NVv {
    public final java.util.Map LIZ = new LinkedHashMap();
    public boolean LIZIZ;

    public abstract List<InterfaceC59479NVz<?>> LIZ();

    public static Object LIZIZ(AbstractC59475NVv abstractC59475NVv, String str) {
        abstractC59475NVv.getClass();
        for (InterfaceC59479NVz<?> interfaceC59479NVz : abstractC59475NVv.LIZ()) {
            if (o.LJ(interfaceC59479NVz.getKey(), str)) {
                return interfaceC59479NVz.getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void LIZJ(Class<R> cls, R r, InterfaceC48224IwG interfaceC48224IwG) {
        EA8 ea8;
        if (interfaceC48224IwG != null) {
            interfaceC48224IwG.LIZIZ(cls, r);
            if (!this.LIZIZ) {
                Iterator<InterfaceC59479NVz<?>> it = LIZ().iterator();
                while (it.hasNext()) {
                    it.next().LIZ(interfaceC48224IwG);
                }
                this.LIZIZ = true;
                return;
            }
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC88472Yns == null || !C65777Prh.LJFF(1, interfaceC88472Yns) || (ea8 = (EA8) interfaceC88472Yns.invoke(r)) == null) {
            Iterator<InterfaceC59479NVz<?>> it2 = LIZ().iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(cls, r);
            }
        } else {
            Iterator<InterfaceC59479NVz<?>> it3 = LIZ().iterator();
            while (it3.hasNext()) {
                ((InterfaceC59479NVz) it3.next()).LIZIZ(ea8.LJLIL, ea8.LJLILLLLZI);
            }
        }
    }
}
