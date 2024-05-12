package com.ss.android.ugc.aweme.modeo;

import X.C82622Wbi;
import X.WMH;
import X.WTG;
import android.app.Application;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ModeoImitDefaultImpl implements IModeoInit {
    @Override // com.ss.android.ugc.aweme.modeo.IModeoInit
    public final WTG getRecordMonitorComponent(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.modeo.IModeoInit
    public final void initModeoEnv(Application application) {
        o.LJIIIZ(application, "application");
    }

    @Override // com.ss.android.ugc.aweme.modeo.IModeoInit
    public final boolean isModeoVersion() {
        return false;
    }
}
