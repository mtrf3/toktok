package com.ss.android.ugc.aweme.legacy;

import X.C38457F7l;
import X.C58096Mr6;
import X.InterfaceC38454F7i;
import com.google.gson.m;
import com.ss.android.ugc.aweme.setting.IAbTestManager;

/* loaded from: classes7.dex */
public class AbTestManagerImpl implements IAbTestManager {
    public final C38457F7l LIZ = C38457F7l.LIZIZ;

    public static IAbTestManager LJFF() {
        Object LIZ = C58096Mr6.LIZ(IAbTestManager.class, false);
        if (LIZ != null) {
            return (IAbTestManager) LIZ;
        }
        if (C58096Mr6.Z1 == null) {
            synchronized (IAbTestManager.class) {
                if (C58096Mr6.Z1 == null) {
                    C58096Mr6.Z1 = new AbTestManagerImpl();
                }
            }
        }
        return C58096Mr6.Z1;
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZIZ(m mVar) {
        this.LIZ.LIZIZ(mVar);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZLLL(boolean z) {
        this.LIZ.LIZLLL(true);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LJ(InterfaceC38454F7i interfaceC38454F7i) {
        this.LIZ.LJ(interfaceC38454F7i);
    }
}
