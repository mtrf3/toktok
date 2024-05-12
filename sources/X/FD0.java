package X;

import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FD0 implements FD4 {
    public static final FD0 LIZ = new FD0();

    @Override // X.FD4
    public final boolean LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz) {
        return interfaceC60761Nsz instanceof VNS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.FD4
    public final void LIZ(InterfaceC60761Nsz interfaceC60761Nsz, C79604VMa customInfo) {
        o.LJIIJ(customInfo, "customInfo");
        if (!(interfaceC60761Nsz instanceof VNS)) {
            return;
        }
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportCustom((VNS) interfaceC60761Nsz, customInfo);
    }
}
