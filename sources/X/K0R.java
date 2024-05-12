package X;

import android.content.Context;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService;
import com.ss.android.ugc.aweme.service.Social2TabRouteService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K0R implements ISocial2TabRouteService {
    public static final K0R LIZIZ = new K0R();
    public final /* synthetic */ ISocial2TabRouteService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService
    public final void LIZ(Context context, String sourcePage, String enterFrom) {
        o.LJIIIZ(sourcePage, "sourcePage");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LIZ(context, sourcePage, enterFrom);
    }

    public K0R() {
        ISocial2TabRouteService iSocial2TabRouteService;
        Object LIZ = C58096Mr6.LIZ(ISocial2TabRouteService.class, false);
        if (LIZ != null) {
            iSocial2TabRouteService = (ISocial2TabRouteService) LIZ;
        } else {
            if (C58096Mr6.m5 == null) {
                synchronized (ISocial2TabRouteService.class) {
                    if (C58096Mr6.m5 == null) {
                        C58096Mr6.m5 = new Social2TabRouteService();
                    }
                }
            }
            iSocial2TabRouteService = C58096Mr6.m5;
        }
        this.LIZ = iSocial2TabRouteService;
    }
}
