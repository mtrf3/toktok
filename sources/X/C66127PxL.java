package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.PxL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66127PxL {
    public static C66120PxE LIZ(String str) {
        String LIZ;
        boolean z;
        C66120PxE c66120PxE = new C66120PxE(str, null, 0, null, null, null, null, null, false, null, null, 0, 0L, null, null, 0L, false, null, 0, null, null, null, false, null, null, null, null, null, 0L, null, -2, 1023);
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        String LJIIJ = heliosEnvImpl.LJIIJ();
        HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
        InterfaceC66086Pwg interfaceC66086Pwg = heliosEnvImpl2.LIZIZ;
        if (interfaceC66086Pwg == null) {
            LIZ = "";
        } else {
            LIZ = interfaceC66086Pwg.LIZ();
        }
        PQ0 pq0 = PQ0.LJFF;
        o.LJIIIIZZ(pq0, "LifecycleMonitor.get()");
        c66120PxE.LJLJLLL = PQ0.LJ();
        c66120PxE.LJLLI = C64401PPh.LIZ();
        c66120PxE.LJLLILLLL = PQ0.LIZJ();
        String copyOnWriteArrayList = pq0.LIZ.toString();
        o.LJIIIIZZ(copyOnWriteArrayList, "LifecycleMonitor.get().activityStackString");
        c66120PxE.LJLJLJ = copyOnWriteArrayList;
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        String name = LLLLIIIILLL.getName();
        o.LJIIIIZZ(name, "Thread.currentThread().name");
        c66120PxE.LL = name;
        if (LJIIJ == null || ujb.o.LJJJJJL(LJIIJ)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIJ = "null";
        }
        o.LJIIIZ(LJIIJ, "<set-?>");
        c66120PxE.LLFF = LJIIJ;
        if (LIZ == null || ujb.o.LJJJJJL(LIZ)) {
            LIZ = "null";
        }
        o.LJIIIZ(LIZ, "<set-?>");
        c66120PxE.LLFFF = LIZ;
        return c66120PxE;
    }
}
