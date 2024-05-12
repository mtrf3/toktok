package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.PxC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66118PxC implements InterfaceC66039Pvv {
    public static final C66118PxC LIZIZ = new C66118PxC();
    public static final java.util.Set<InterfaceC66040Pvw> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 1;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        Object obj;
        Object[] parameters;
        o.LJIIIZ(event, "event");
        if (LIZ.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = event.LJLJI;
        InterfaceC35988EAm interfaceC35988EAm = null;
        if (i == 102003 || i == 102004) {
            Object[] parameters2 = event.LLI.getParameters();
            if (parameters2 != null && parameters2.length >= 2) {
                if (parameters2 != null) {
                    obj = parameters2[1];
                } else {
                    obj = null;
                }
                linkedHashMap.put("settingsKey", String.valueOf(obj));
            }
        } else if (i == 102900 && (parameters = event.LLI.getParameters()) != null && parameters.length >= 1) {
            o.LJI(parameters);
            Object obj2 = parameters[0];
            if (!(obj2 instanceof String)) {
                if (obj2 instanceof Object[]) {
                    obj2 = ORY.LJJJJLL((Object[]) obj2, " ", null, null, null, 62);
                } else {
                    obj2 = "";
                }
            }
            linkedHashMap.put("cmd", obj2);
        }
        linkedHashMap.put("apiId", Integer.valueOf(event.LJLJI));
        linkedHashMap.put("resourceId", event.LJLILLLLZI);
        linkedHashMap.put("className", event.LLIIL);
        linkedHashMap.put("memberName", event.LLIILII);
        linkedHashMap.put("isBackgroundInvoke", Boolean.valueOf(event.LJLJLLL));
        linkedHashMap.put("pageName", event.LJLLI);
        linkedHashMap.put("pageHashcode", Integer.valueOf(event.LJLLILLLL));
        linkedHashMap.put("pageStack", event.LJLJLJ);
        linkedHashMap.put("invokeTime", Long.valueOf(event.LJLLJ));
        linkedHashMap.put("isReflection", Boolean.valueOf(event.LJZI));
        linkedHashMap.put("userRegion", event.LLFF);
        linkedHashMap.put("threadName", event.LL);
        linkedHashMap.put("throwable", event.LJLJJLL);
        Iterator<InterfaceC35988EAm> it = C66112Px6.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC35988EAm next = it.next();
            if (next.LIZ().contains(Integer.valueOf(event.LJLJI))) {
                interfaceC35988EAm = next;
                break;
            }
        }
        InterfaceC35988EAm interfaceC35988EAm2 = interfaceC35988EAm;
        if (interfaceC35988EAm2 != null) {
            linkedHashMap.putAll(interfaceC35988EAm2.LJ(event.LLI.getParameters()));
        }
        Iterator<InterfaceC66040Pvw> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }
}
