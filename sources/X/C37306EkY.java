package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.EkY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37306EkY {
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC88472Yns<?, C76800UCe>>> LIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(InterfaceC65350Pko event) {
        o.LJIIIZ(event, "event");
        return LIZ.containsKey(C39557Ffl.LIZ(event).getName());
    }

    public static void LIZIZ(InterfaceC65350Pko event, InterfaceC37307EkZ params) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(params, "params");
        CopyOnWriteArrayList<InterfaceC88472Yns<?, C76800UCe>> copyOnWriteArrayList = LIZ.get(C39557Ffl.LIZ(event).getName());
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC88472Yns<?, C76800UCe>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC88472Yns<?, C76800UCe> next = it.next();
                o.LJII(next, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function1<PARAMS of com.bytedance.arch.tracker.EventListenerHolder.invokeListener$lambda$1, kotlin.Unit>{ com.bytedance.arch.tracker.TrackerKt.TrackEventListener<PARAMS of com.bytedance.arch.tracker.EventListenerHolder.invokeListener$lambda$1> }");
                C65777Prh.LJ(1, next);
                next.invoke(params);
            }
        }
    }
}
