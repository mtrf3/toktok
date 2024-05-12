package X;

import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;

/* renamed from: X.PvA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65992PvA implements InterfaceC65994PvC {
    public final IExceptionMonitor LIZ;

    @Override // X.InterfaceC65994PvC
    public final void LIZ() {
        this.LIZ.setDebugMode(true);
    }

    public C65992PvA(IExceptionMonitor iExceptionMonitor) {
        this.LIZ = iExceptionMonitor;
    }

    @Override // X.InterfaceC65994PvC
    public final void LIZIZ(String str, String str2, String str3, java.util.Map map, java.util.Map map2) {
        HH1.LIZ(str, "javaStack", str2, "message", str3, "threadName");
        this.LIZ.monitorThrowable(str, str2, "helios_log_type", "EnsureNotReachHere", str3, true, map, map2);
    }
}
