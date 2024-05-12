package X;

import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService;
import com.ss.android.ugc.aweme.service.Social2TabServiceImpl;

/* loaded from: classes10.dex */
public final class LHM implements ISocial2TabService {
    public static final LHM LIZIZ = new LHM();
    public final /* synthetic */ ISocial2TabService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabDelegateService LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabRedDotService LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public LHM() {
        ISocial2TabService iSocial2TabService;
        Object LIZ = C58096Mr6.LIZ(ISocial2TabService.class, false);
        if (LIZ != null) {
            iSocial2TabService = (ISocial2TabService) LIZ;
        } else {
            if (C58096Mr6.n5 == null) {
                synchronized (ISocial2TabService.class) {
                    if (C58096Mr6.n5 == null) {
                        C58096Mr6.n5 = new Social2TabServiceImpl();
                    }
                }
            }
            iSocial2TabService = C58096Mr6.n5;
        }
        this.LIZ = iSocial2TabService;
    }
}
