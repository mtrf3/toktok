package com.ss.android.ugc.aweme.log;

import X.C58096Mr6;
import X.C58685N1l;
import X.N1D;
import X.N1E;
import X.N1V;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import kotlin.jvm.internal.AqS1S3000000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebLogService implements IAdWebLogService {
    public boolean LIZ;

    public static IAdWebLogService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IAdWebLogService.class, false);
        if (LIZ != null) {
            return (IAdWebLogService) LIZ;
        }
        if (C58096Mr6.y2 == null) {
            synchronized (IAdWebLogService.class) {
                if (C58096Mr6.y2 == null) {
                    C58096Mr6.y2 = new AdWebLogService();
                }
            }
        }
        return C58096Mr6.y2;
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final boolean LIZ() {
        if (this.LIZ) {
            return true;
        }
        this.LIZ = true;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final N1V LIZJ() {
        return new N1V();
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final N1E LIZLLL() {
        return new N1E();
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final void LIZIZ(String str, String str2, String str3, String sessionId, String str4) {
        o.LJIIIZ(sessionId, "sessionId");
        if (str == null || str.length() == 0) {
            return;
        }
        int hashCode = str3.hashCode();
        if (hashCode != -1819551867) {
            if (hashCode != 512667455) {
                if (hashCode != 1912999166 || !str3.equals("draw_ad")) {
                    return;
                }
                AdACTEventLoger.LJJIJ().LIZJ(C58685N1l.LIZIZ, str, str2, null, new AqS1S3000000_10(sessionId, str4, 0));
                return;
            }
            if (!str3.equals("result_ad_bg")) {
                return;
            }
            AdACTEventLoger.LJJIJ().LIZJ(C58685N1l.LIZLLL, str, str2, null, new AqS1S3000000_10(sessionId, str4, 2));
            return;
        }
        if (!str3.equals("result_ad")) {
            return;
        }
        AdACTEventLoger.LJJIJ().LIZJ(C58685N1l.LIZJ, str, str2, null, new AqS1S3000000_10(sessionId, str4, 1));
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final void LJ(boolean z, String str, int i, String str2, int i2, String sessionId, String str3, String str4) {
        o.LJIIIZ(sessionId, "sessionId");
        if (str == null || str.length() == 0) {
            return;
        }
        IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
        C58685N1l.LIZ.getClass();
        LJJIJ.LIZJ(C58685N1l.LJFF, str, str2, null, new N1D(i, i2, sessionId, str3, str4, z));
    }
}
