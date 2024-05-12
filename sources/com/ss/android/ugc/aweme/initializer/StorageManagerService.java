package com.ss.android.ugc.aweme.initializer;

import X.EF7;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.services.IStorageManagerService;

/* loaded from: classes11.dex */
public final class StorageManagerService implements IStorageManagerService {
    @Override // com.ss.android.ugc.aweme.services.IStorageManagerService
    public final void launchDiskManagerActivity() {
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//setting/diskmanager");
        buildRoute.addFlags(268435456);
        buildRoute.open();
    }
}
