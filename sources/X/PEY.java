package X;

import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.apm.api.IActivityLifeManager;

/* loaded from: classes12.dex */
public final class PEY implements InterfaceC171106na<IActivityLifeManager> {
    @Override // X.InterfaceC171106na
    public final IActivityLifeManager create() {
        return ActivityLifeObserver.getInstance();
    }
}
