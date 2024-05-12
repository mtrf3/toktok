package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFQ {
    public static final List<WeakReference<LLY>> LIZ = new ArrayList();

    public static void LIZ(InterfaceC88472Yns interfaceC88472Yns) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else {
                interfaceC88472Yns.invoke(obj);
            }
        }
    }

    public static void LIZIZ(LLY observer) {
        o.LJIIIZ(observer, "observer");
        ((ArrayList) LIZ).add(new WeakReference(observer));
    }

    public static void LIZJ(LLY obs) {
        o.LJIIIZ(obs, "obs");
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            if (o.LJ(obs, ((Reference) it.next()).get())) {
                it.remove();
                return;
            }
        }
    }
}
