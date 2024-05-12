package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EsE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37782EsE {
    public static final List<InterfaceC38186Eyk> LIZ(C31926Cfy c31926Cfy, F3T bulletProviderFactory, List<? extends InterfaceC37776Es8> processors, String namespace) {
        o.LJIIJ(bulletProviderFactory, "bulletProviderFactory");
        o.LJIIJ(processors, "processors");
        o.LJIIJ(namespace, "namespace");
        java.util.Map LIZIZ = C37848EtI.LIZIZ(EnumC37847EtH.ALL, namespace);
        if (LIZIZ != null) {
            java.util.Map LJJLIIIJLLLLLLLZ = C113554cx.LJJLIIIJLLLLLLLZ(LIZIZ);
            ArrayList arrayList = new ArrayList(LJJLIIIJLLLLLLLZ.size());
            Iterator it = LJJLIIIJLLLLLLLZ.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(C37781EsD.LIZ((InterfaceC37774Es6) ((Class) ((Map.Entry) it.next()).getValue()).newInstance(), c31926Cfy, bulletProviderFactory, processors, null, 16));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}
