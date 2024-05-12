package com.ss.android.ugc.aweme.app.services;

import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import X.RunnableC38648FEu;
import com.ss.android.ugc.aweme.main.LauncherAssem;
import com.ss.android.ugc.aweme.router.RouterOpen;

/* loaded from: classes7.dex */
public final class LauncherService implements ILauncherService {
    @Override // com.ss.android.ugc.aweme.app.services.ILauncherService
    public final C65776Prg LIZJ() {
        return C65352Pkq.LIZ(LauncherAssem.class);
    }

    public static ILauncherService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(ILauncherService.class, false);
        if (LIZ != null) {
            return (ILauncherService) LIZ;
        }
        if (C58096Mr6.LLILL == null) {
            synchronized (ILauncherService.class) {
                if (C58096Mr6.LLILL == null) {
                    C58096Mr6.LLILL = new LauncherService();
                }
            }
        }
        return C58096Mr6.LLILL;
    }

    @Override // com.ss.android.ugc.aweme.app.services.ILauncherService
    public final RouterOpen LIZ() {
        return new RouterOpen();
    }

    @Override // com.ss.android.ugc.aweme.app.services.ILauncherService
    public final void LIZIZ() {
        new RunnableC38648FEu().run();
    }
}
