package com.ss.android.ugc.aweme.launcher;

import X.C58096Mr6;

/* loaded from: classes7.dex */
public class LauncherServiceImpl implements ILauncherService {
    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void isDebug() {
    }

    public static ILauncherService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(ILauncherService.class, false);
        if (LIZ != null) {
            return (ILauncherService) LIZ;
        }
        if (C58096Mr6.V1 == null) {
            synchronized (ILauncherService.class) {
                if (C58096Mr6.V1 == null) {
                    C58096Mr6.V1 = new LauncherServiceImpl();
                }
            }
        }
        return C58096Mr6.V1;
    }
}
