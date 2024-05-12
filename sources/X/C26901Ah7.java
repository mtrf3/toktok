package X;

import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ah7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26901Ah7 {
    public static void LIZ(InterfaceC26903Ah9 interfaceC26903Ah9) {
        IEventCenter LJ = EventCenter.LJ();
        HashSet<String> remove = C26902Ah8.LIZ.remove(interfaceC26903Ah9);
        if (remove != null) {
            Iterator<String> it = remove.iterator();
            while (it.hasNext()) {
                String eventName = it.next();
                o.LJIIIIZZ(eventName, "eventName");
                LJ.LIZIZ(eventName, interfaceC26903Ah9);
            }
        }
    }

    public static void LIZIZ(InterfaceC26903Ah9 interfaceC26903Ah9, String... eventNames) {
        o.LJIIIZ(eventNames, "eventNames");
        IEventCenter LJ = EventCenter.LJ();
        HashSet<String> hashSet = C26902Ah8.LIZ.get(interfaceC26903Ah9);
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        for (String str : eventNames) {
            LJ.LIZJ(str, interfaceC26903Ah9);
        }
        ORS.LJJLIIIJJIZ(hashSet, eventNames);
        C26902Ah8.LIZ.put(interfaceC26903Ah9, hashSet);
    }
}
