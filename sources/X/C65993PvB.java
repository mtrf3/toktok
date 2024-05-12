package X;

import Y.ARunnableS47S0100000_11;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PvB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65993PvB implements InterfaceC66066PwM {
    public InterfaceC65994PvC LIZ;

    @Override // X.InterfaceC66066PwM
    public final String LIZ() {
        return "ExceptionEvent";
    }

    @Override // X.InterfaceC66066PwM
    public final void LIZIZ(InterfaceC66068PwO aEvent) {
        String name;
        o.LJIIIZ(aEvent, "aEvent");
        C65852Psu c65852Psu = (C65852Psu) aEvent;
        C65977Puv c65977Puv = C65972Puq.LIZIZ;
        if (c65977Puv != null && c65977Puv.LJLJI) {
            String LIZIZ = C37115EhT.LIZIZ(c65852Psu.LJLILLLLZI);
            String valueOf = String.valueOf(LIZIZ.hashCode());
            java.util.Map map = c65852Psu.LJLJJI;
            if (map == null) {
                map = new LinkedHashMap();
            }
            map.put("StackHash", valueOf);
            map.put("SDKVersion", "5.2.0-rc.4");
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            map.put("SettingsVersion", heliosEnvImpl.LJIIJ.version);
            InterfaceC65994PvC interfaceC65994PvC = this.LIZ;
            if (interfaceC65994PvC != null) {
                String str = c65852Psu.LJLJI;
                Thread thread = c65852Psu.LJLIL;
                if (thread == null || (name = thread.getName()) == null) {
                    Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                    o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                    name = LLLLIIIILLL.getName();
                }
                o.LJIIIIZZ(name, "thread?.name ?: Thread.currentThread().name");
                HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
                interfaceC65994PvC.LIZIZ(LIZIZ, str, name, map, C113554cx.LJJL(new OSZ("StackHash", valueOf), new OSZ("Label", c65852Psu.LJLJI), new OSZ("EventType", "HeliosException"), new OSZ("SDKVersion", "5.2.0-rc.4"), new OSZ("SettingsVersion", heliosEnvImpl2.LJIIJ.version)));
            }
            C65977Puv c65977Puv2 = C65972Puq.LIZIZ;
            if (c65977Puv2 != null && c65977Puv2.LJLJJI) {
                long currentTimeMillis = System.currentTimeMillis();
                C66043Pvz.LIZLLL(currentTimeMillis - C66043Pvz.LJ, currentTimeMillis, 5000L);
            }
            HeliosEnvImpl heliosEnvImpl3 = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl3, "HeliosEnvImpl.get()");
            if (heliosEnvImpl3.LJFF() && c65852Psu.LJLJJL) {
                C93G.LIZ().post(new ARunnableS47S0100000_11(c65852Psu, 6));
            }
        }
    }
}
