package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.2yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76212yv {
    public static final HashMap<String, List<InterfaceC76162yq>> LIZ = new HashMap<>();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C76232yx.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ() {
        C76222yw c76222yw = C76222yw.LJLIL;
        Iterator it = ((CopyOnWriteArraySet) LIZIZ.getValue()).iterator();
        while (it.hasNext()) {
            c76222yw.invoke(it.next());
        }
    }

    public static InterfaceC76162yq LIZ(String convId) {
        o.LJIIIZ(convId, "convId");
        HashMap<String, List<InterfaceC76162yq>> hashMap = LIZ;
        synchronized (hashMap) {
            List<InterfaceC76162yq> list = hashMap.get(convId);
            if (list != null && !list.isEmpty()) {
                return (InterfaceC76162yq) ORZ.LLFF(list);
            }
            return null;
        }
    }
}
