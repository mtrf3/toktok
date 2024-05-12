package X;

import Y.ARunnableS45S0100000_9;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZE {
    public static final ConcurrentHashMap<SZH, Long> LIZ = new ConcurrentHashMap<>();

    public static void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        Executor executor = SZI.LIZIZ;
        if (executor == null) {
            interfaceC65784Pro.invoke();
        } else {
            executor.execute(new ARunnableS45S0100000_9(interfaceC65784Pro, 8));
        }
    }

    public static void LIZ(String tag, C65776Prg c65776Prg) {
        o.LJIIIZ(tag, "tag");
        if (!SZI.LIZJ || !C37306EkY.LIZ(c65776Prg)) {
            return;
        }
        LIZJ(new SZG(c65776Prg, tag, SystemClock.elapsedRealtimeNanos()));
    }

    public static void LIZIZ(C65776Prg c65776Prg, String tag, InterfaceC65784Pro paramsProvider) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(paramsProvider, "paramsProvider");
        if (!SZI.LIZJ || !C37306EkY.LIZ(c65776Prg)) {
            return;
        }
        LIZJ(new SZF(c65776Prg, tag, SystemClock.elapsedRealtimeNanos(), paramsProvider, C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())));
    }

    public static void LIZLLL(String str, float f, InterfaceC65784Pro interfaceC65784Pro) {
        IJW ijw;
        if (IRF.LIZ(f) && (ijw = SZI.LIZ) != null) {
            ijw.report(str, (java.util.Map) interfaceC65784Pro.invoke());
        }
    }

    public static Object LJ(C65776Prg c65776Prg, SZD szd, InterfaceC65784Pro action) {
        o.LJIIIZ(action, "action");
        if (!SZI.LIZJ || !C37306EkY.LIZ(c65776Prg)) {
            return action.invoke();
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Object invoke = action.invoke();
        szd.LIZ = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        szd.LIZIZ = o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper());
        LIZJ(new AqS159S0200000_12(c65776Prg, szd, 2));
        return invoke;
    }

    public static void LJFF(C65776Prg c65776Prg, float f, InterfaceC88472Yns listener) {
        o.LJIIIZ(listener, "listener");
        if (IRF.LIZ(f)) {
            String name = C39557Ffl.LIZ(c65776Prg).getName();
            ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC88472Yns<?, C76800UCe>>> concurrentHashMap = C37306EkY.LIZ;
            CopyOnWriteArrayList<InterfaceC88472Yns<?, C76800UCe>> copyOnWriteArrayList = concurrentHashMap.get(name);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                concurrentHashMap.put(name, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(listener);
        }
    }
}
