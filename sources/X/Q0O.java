package X;

import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0O {
    public static boolean LIZ;
    public static IPolicyDecision LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(C36011bB space, Class<? extends InterfaceC66311Q0t>[] clsArr) {
        o.LJIIJ(space, "space");
        java.util.Map<C36011bB, InterfaceC66311Q0t[]> map = Q0P.LIZ;
        if (!map.containsKey(space)) {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends InterfaceC66311Q0t> cls : clsArr) {
                InterfaceC66311Q0t newInstance = cls.newInstance();
                o.LJFF(newInstance, "it.newInstance()");
                arrayList.add(newInstance);
            }
            Object[] array = arrayList.toArray(new InterfaceC66311Q0t[0]);
            if (array != null) {
                map.put(space, array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new Q0C(-1, "duplicate pipeline");
    }

    public static final void LIZ(C36011bB space, String str, int i, Q0W q0w) {
        o.LJIIJ(space, "space");
        C66295Q0d.LIZ.put(C66295Q0d.LIZ(space, str, i), q0w);
    }
}
