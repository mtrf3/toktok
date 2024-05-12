package com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash;

import X.C10H;
import X.C55738LuA;
import X.C58096Mr6;
import X.IGD;
import X.MDU;
import X.MDW;
import X.OSZ;

/* loaded from: classes10.dex */
public final class RealTimeSplashManagerImpl implements IRealTimeSplashManager {
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final void release() {
        MDW.LIZJ = null;
        try {
            C10H c10h = MDW.LIZ;
            if (c10h != null) {
                c10h.LIZ();
            }
        } catch (IllegalStateException unused) {
        }
        MDW.LIZ = null;
        MDW.LIZIZ = null;
        MDW.LJ = MDU.DEFAULT;
    }

    public static IRealTimeSplashManager LJFF() {
        Object LIZ = C58096Mr6.LIZ(IRealTimeSplashManager.class, false);
        if (LIZ != null) {
            return (IRealTimeSplashManager) LIZ;
        }
        if (C58096Mr6.LJJI == null) {
            synchronized (IRealTimeSplashManager.class) {
                if (C58096Mr6.LJJI == null) {
                    C58096Mr6.LJJI = new RealTimeSplashManagerImpl();
                }
            }
        }
        return C58096Mr6.LJJI;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final OSZ<String, MDU> LIZ() {
        return new OSZ<>(MDW.LIZIZ, MDW.LJ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final long LJ() {
        return IGD.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final boolean LIZJ() {
        return MDW.LJII;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final void LIZIZ(boolean z) {
        MDW.LJII = z;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final void LIZLLL(C55738LuA c55738LuA) {
        MDW.LIZJ = null;
        if (MDW.LJ == MDU.DEFAULT) {
            MDW.LIZIZ();
        }
        if (MDW.LJ == MDU.REQUEST_START) {
            MDW.LIZJ = c55738LuA;
        } else {
            c55738LuA.LIZ(MDW.LJ);
        }
    }
}
