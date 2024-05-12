package com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp;

import X.C58096Mr6;
import X.IGD;
import X.MDY;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class RealTimeSplashNPManagerImpl implements IRealTimeSplashNPManager {
    public static IRealTimeSplashNPManager LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IRealTimeSplashNPManager.class, false);
        if (LIZ != null) {
            return (IRealTimeSplashNPManager) LIZ;
        }
        if (C58096Mr6.LJJIFFI == null) {
            synchronized (IRealTimeSplashNPManager.class) {
                if (C58096Mr6.LJJIFFI == null) {
                    C58096Mr6.LJJIFFI = new RealTimeSplashNPManagerImpl();
                }
            }
        }
        return C58096Mr6.LJJIFFI;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.IRealTimeSplashNPManager
    public final void LIZ(String str) {
        if (str == null || str.length() == 0 || MDY.LJ == null || MDY.LIZLLL != null) {
            return;
        }
        MDY.LIZLLL = str;
        MDY.LIZJ = Long.valueOf(IGD.LIZ());
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.IRealTimeSplashNPManager
    public final void LIZIZ(String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        MDY.LJ = sourceId;
    }
}
