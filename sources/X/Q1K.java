package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1K {
    public static final ThreadLocal<List<InterfaceC65784Pro<C76800UCe>>> LIZ = new ThreadLocal<>();
    public static final ThreadLocal<Boolean> LIZIZ = new ThreadLocal<>();

    public static final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (Q1A.LJIIIZ) {
            if (o.LJ(LIZIZ.get(), Boolean.TRUE)) {
                ThreadLocal<List<InterfaceC65784Pro<C76800UCe>>> threadLocal = LIZ;
                if (threadLocal.get() == null) {
                    threadLocal.set(new ArrayList());
                }
                List<InterfaceC65784Pro<C76800UCe>> list = threadLocal.get();
                if (list != null) {
                    list.add(interfaceC65784Pro);
                    return;
                }
                return;
            }
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
