package X;

import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;
import com.bytedance.pumbaa.monitor.adapter.api.IMonitorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Pyd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66207Pyd implements InterfaceC66218Pyo {
    public static final C66207Pyd LIZIZ = new C66207Pyd();
    public static final IMonitorService LIZ = MonitorServiceImpl.LJIILIIL();

    @Override // X.InterfaceC66218Pyo
    public final String name() {
        return "monitorInterceptor";
    }

    @Override // X.InterfaceC66218Pyo
    public final boolean LIZ(C66211Pyh c66211Pyh) {
        if (!o.LJ(c66211Pyh.LJLILLLLZI, "guard")) {
            return LIZ.LJIIIIZZ(c66211Pyh.LJLJI).LJLILLLLZI;
        }
        return false;
    }
}
