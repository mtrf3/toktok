package X;

import com.ss.android.ugc.aweme.nows.service.NowLimitService;
import com.ss.android.ugc.aweme.service.INowLimitService;

/* loaded from: classes10.dex */
public final class MWX implements INowLimitService {
    public static final MWX LIZIZ = new MWX();
    public final /* synthetic */ INowLimitService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    public MWX() {
        INowLimitService iNowLimitService;
        Object LIZ = C58096Mr6.LIZ(INowLimitService.class, false);
        if (LIZ != null) {
            iNowLimitService = (INowLimitService) LIZ;
        } else {
            if (C58096Mr6.C3 == null) {
                synchronized (INowLimitService.class) {
                    if (C58096Mr6.C3 == null) {
                        C58096Mr6.C3 = new NowLimitService();
                    }
                }
            }
            iNowLimitService = C58096Mr6.C3;
        }
        this.LIZ = iNowLimitService;
    }
}
