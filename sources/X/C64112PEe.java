package X;

import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.services.apm.api.ILaunchTrace;

/* renamed from: X.PEe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64112PEe implements InterfaceC171106na<ILaunchTrace> {
    @Override // X.InterfaceC171106na
    public final ILaunchTrace create() {
        return new LaunchTraceImpl();
    }
}
