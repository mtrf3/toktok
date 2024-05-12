package X;

import com.lynx.tasm.base.LLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class VEZ {
    public static volatile VEZ LIZIZ;
    public final java.util.Map<Class<? extends InterfaceC39538FfS>, InterfaceC39538FfS> LIZ;

    public static VEZ LIZIZ() {
        if (LIZIZ == null) {
            synchronized (VEZ.class) {
                if (LIZIZ == null) {
                    LIZIZ = new VEZ();
                }
            }
        }
        return LIZIZ;
    }

    public VEZ() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZ = concurrentHashMap;
        concurrentHashMap.put(VA4.class, new VA5());
        concurrentHashMap.put(InterfaceC79401VEf.class, new C79399VEd());
        concurrentHashMap.put(InterfaceC79400VEe.class, new C79398VEc());
        concurrentHashMap.put(InterfaceC79397VEb.class, new C79396VEa());
        concurrentHashMap.put(InterfaceC39939Flv.class, new C50763Jw7());
    }

    public final <T extends InterfaceC39538FfS> T LIZ(Class<T> cls) {
        if (((ConcurrentHashMap) this.LIZ).containsKey(cls)) {
            return (T) ((ConcurrentHashMap) this.LIZ).get(cls);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(cls));
        LIZ.append(" is unregistered");
        LLog.LIZLLL(4, "LynxServiceCenter", X1D.LIZIZ(LIZ));
        return null;
    }
}
