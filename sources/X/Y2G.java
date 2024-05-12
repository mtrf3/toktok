package X;

import Y.ACallableS61S0300000_15;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(Class cls, Y2J y2j) {
        LIZJ(cls, y2j, true, C61878OQg.INSTANCE);
    }

    public static void LIZ(Class cls, List list, Y3P y3p) {
        Object newInstance = cls.newInstance();
        o.LJIIIIZZ(newInstance, "eventClz.newInstance()");
        AbstractC63695OzD abstractC63695OzD = (AbstractC63695OzD) newInstance;
        Class[] LIZ2 = C62843OlT.LIZ(cls.getName());
        if (LIZ2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Class cls2 : LIZ2) {
                if (InterfaceC60152Xr.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            List<InterfaceC54035LIp> LIZ3 = y3p.LIZ(arrayList);
            if (LIZ3 != null) {
                Iterator<InterfaceC54035LIp> it = LIZ3.iterator();
                while (it.hasNext()) {
                    abstractC63695OzD.LJ(it.next());
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                abstractC63695OzD.LJ((InterfaceC54035LIp) it2.next());
                arrayList2.add(abstractC63695OzD);
            }
            abstractC63695OzD.LJFF();
        }
    }

    public static final void LIZIZ(InterfaceC55235Lm3 vScope, Class cls, List extraParams, boolean z) {
        o.LJIIIZ(vScope, "vScope");
        o.LJIIIZ(extraParams, "extraParams");
        LIZJ(cls, new Y2F(vScope), z, extraParams);
    }

    public static final void LIZJ(Class<? extends AbstractC63695OzD> cls, Y3P groupListProvider, boolean z, List<? extends InterfaceC54035LIp> extraParams) {
        o.LJIIIZ(groupListProvider, "groupListProvider");
        o.LJIIIZ(extraParams, "extraParams");
        if (z) {
            C10K.LIZIZ(new ACallableS61S0300000_15(cls, extraParams, groupListProvider, 1), FMX.LIZIZ(), null);
        } else {
            LIZ(cls, extraParams, groupListProvider);
        }
    }

    public static void LJ(Class cls, InterfaceC55235Lm3 interfaceC55235Lm3, List list, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            list = C61878OQg.INSTANCE;
        }
        LIZIZ(interfaceC55235Lm3, cls, list, z);
    }
}
