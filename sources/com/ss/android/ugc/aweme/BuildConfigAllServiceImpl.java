package com.ss.android.ugc.aweme;

import X.C58096Mr6;
import X.F78;
import ujb.o;

/* loaded from: classes7.dex */
public class BuildConfigAllServiceImpl implements IBuildConfigAllService {
    @Override // com.ss.android.ugc.aweme.IBuildConfigAllService
    public final void LIZ() {
    }

    public static IBuildConfigAllService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IBuildConfigAllService.class, false);
        if (LIZ != null) {
            return (IBuildConfigAllService) LIZ;
        }
        if (C58096Mr6.LJJJZ == null) {
            synchronized (IBuildConfigAllService.class) {
                if (C58096Mr6.LJJJZ == null) {
                    C58096Mr6.LJJJZ = new BuildConfigAllServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJJZ;
    }

    @Override // com.ss.android.ugc.aweme.IBuildConfigAllService
    public final boolean LIZIZ() {
        if (o.LJJJJIZL("startupTest", F78.LIZ, true) || o.LJJJJIZL("MTraceStartup", F78.LIZ, true) || o.LJJJJIZL("MTraceStartupDiff", F78.LIZ, true)) {
            return true;
        }
        return false;
    }
}
