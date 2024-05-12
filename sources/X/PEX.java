package X;

import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.services.apm.api.IMonitorLogManager;

/* loaded from: classes12.dex */
public final class PEX implements InterfaceC171106na<IMonitorLogManager> {
    @Override // X.InterfaceC171106na
    public final IMonitorLogManager create() {
        return new MonitorLogManagerImpl();
    }
}
