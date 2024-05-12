package X;

import com.ss.android.ugc.aweme.compliance.business.region.api.RegionChangeUpdatedApi;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EIO implements InterfaceC62932Omu {
    public final /* synthetic */ ComplianceBusinessServiceImpl LIZ;

    public EIO(ComplianceBusinessServiceImpl complianceBusinessServiceImpl) {
        this.LIZ = complianceBusinessServiceImpl;
    }

    @Override // X.InterfaceC62932Omu
    public final void LIZLLL(boolean z) {
        if (z) {
            this.LIZ.LJFF = true;
            RegionChangeUpdatedApi.LIZ.getClass();
            E7S.LIZIZ.sendUpdatedRegion().LJJL(T16.LIZ()).LJJJJZ();
            SettingManagerServiceImpl.LIZJ().LIZ(3);
            ScheduledExecutorService scheduledExecutorService = this.LIZ.LIZLLL;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            } else {
                o.LJIJI("scheduler");
                throw null;
            }
        }
    }
}
