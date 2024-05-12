package X;

import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.services.apm.api.IApmAgent;

/* loaded from: classes12.dex */
public final class PEZ implements InterfaceC171106na<IApmAgent> {
    @Override // X.InterfaceC171106na
    public final IApmAgent create() {
        return new ApmAgentServiceImpl();
    }
}
