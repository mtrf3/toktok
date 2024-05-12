package com.ss.android.ugc.aweme.main;

import X.C46448IKu;
import X.C58096Mr6;

/* loaded from: classes11.dex */
public class MainPageExperimentServiceImpl implements IMainPageExperimentService {
    @Override // com.ss.android.ugc.aweme.main.IMainPageExperimentService
    public final void LIZLLL() {
    }

    public static IMainPageExperimentService LJ() {
        Object LIZ = C58096Mr6.LIZ(IMainPageExperimentService.class, false);
        if (LIZ != null) {
            return (IMainPageExperimentService) LIZ;
        }
        if (C58096Mr6.C2 == null) {
            synchronized (IMainPageExperimentService.class) {
                if (C58096Mr6.C2 == null) {
                    C58096Mr6.C2 = new MainPageExperimentServiceImpl();
                }
            }
        }
        return C58096Mr6.C2;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageExperimentService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageExperimentService
    public final boolean LIZIZ() {
        return C46448IKu.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageExperimentService
    public final void LIZJ() {
    }
}
