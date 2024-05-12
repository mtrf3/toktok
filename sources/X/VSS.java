package X;

import com.bytedance.netecho.NetechoConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSS {
    public static final ConcurrentHashMap<Long, C45440HsS> LIZ = new ConcurrentHashMap<>();
    public static volatile AtomicLong LIZIZ = new AtomicLong(10);

    static {
        NetechoConfig.INSTANCE.setLoadLibrary(VSV.LJLIL);
    }

    public static void LIZIZ(long j) {
        PthreadThread pthreadThread;
        ConcurrentHashMap<Long, C45440HsS> concurrentHashMap = LIZ;
        C45440HsS c45440HsS = concurrentHashMap.get(Long.valueOf(j));
        if (c45440HsS != null) {
            c45440HsS.LIZ();
            concurrentHashMap.remove(Long.valueOf(j));
        }
        VSQ vsq = VSR.LJFF;
        if (vsq != null && vsq.LJLJI.contains(Long.valueOf(j)) && (pthreadThread = VSR.LJ) != null) {
            pthreadThread.interrupt();
        }
    }

    public static long LIZ(DetectorParam detectorParam, HHM hhm, InterfaceC88471Ynr callback, InterfaceC88472Yns callback2) {
        o.LJIIJ(callback, "callback");
        o.LJIIJ(callback2, "callback2");
        long incrementAndGet = LIZIZ.incrementAndGet();
        ConcurrentHashMap<Long, C45440HsS> concurrentHashMap = LIZ;
        Long valueOf = Long.valueOf(incrementAndGet);
        C45440HsS c45440HsS = new C45440HsS();
        c45440HsS.LIZIZ(detectorParam.startTimeout, new VST(incrementAndGet, detectorParam, hhm, callback, callback2));
        concurrentHashMap.put(valueOf, c45440HsS);
        return incrementAndGet;
    }
}
