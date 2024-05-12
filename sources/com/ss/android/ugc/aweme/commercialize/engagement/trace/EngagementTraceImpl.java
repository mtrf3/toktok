package com.ss.android.ugc.aweme.commercialize.engagement.trace;

import X.C113554cx;
import X.C58096Mr6;
import X.IEW;
import X.OSZ;
import com.ss.android.ugc.aweme.commerce.omid.AdOmSdkManagerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.AdOmSdkManagerService;
import java.util.Map;

/* loaded from: classes11.dex */
public final class EngagementTraceImpl implements EngagementTrace {
    public final AdOmSdkManagerService LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace
    public final synchronized Map<String, Object> LIZ() {
        OSZ[] oszArr;
        int LJIIIIZZ;
        oszArr = new OSZ[2];
        long currentPosition = this.LIZ.getCurrentPosition();
        if (currentPosition < 0) {
            if (this.LIZ.LJI() < 0) {
                currentPosition = this.LIZ.LJIIIZ();
            } else {
                currentPosition = this.LIZ.LJI();
            }
        }
        oszArr[0] = new OSZ("duration", Long.valueOf(currentPosition));
        if (IEW.LIZLLL) {
            LJIIIIZZ = IEW.LIZ() + 1;
        } else {
            LJIIIIZZ = this.LIZ.LJIIIIZZ();
        }
        oszArr[1] = new OSZ("play_order", Integer.valueOf(LJIIIIZZ));
        return C113554cx.LJJL(oszArr);
    }

    public static EngagementTrace LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(EngagementTrace.class, false);
        if (LIZ != null) {
            return (EngagementTrace) LIZ;
        }
        if (C58096Mr6.LLLLIILLL == null) {
            synchronized (EngagementTrace.class) {
                if (C58096Mr6.LLLLIILLL == null) {
                    C58096Mr6.LLLLIILLL = new EngagementTraceImpl();
                }
            }
        }
        return C58096Mr6.LLLLIILLL;
    }

    public EngagementTraceImpl() {
        AdOmSdkManagerService adOmSdkManagerServiceImpl;
        Object LIZ = C58096Mr6.LIZ(AdOmSdkManagerService.class, false);
        if (LIZ != null) {
            adOmSdkManagerServiceImpl = (AdOmSdkManagerService) LIZ;
        } else {
            adOmSdkManagerServiceImpl = new AdOmSdkManagerServiceImpl();
        }
        this.LIZ = adOmSdkManagerServiceImpl;
    }
}
