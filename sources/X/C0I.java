package X;

import com.ss.android.ugc.aweme.LivePermissionApply;
import com.ss.android.ugc.aweme.LiveScenario;
import com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$1;

/* loaded from: classes6.dex */
public final class C0I implements C44 {
    public final /* synthetic */ C0T LIZ;

    public C0I(DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$1 dMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$1) {
        this.LIZ = dMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$1;
    }

    @Override // X.C44
    public final void onFailed(Throwable th) {
        this.LIZ.onFailed(th);
    }

    @Override // X.C44
    public final void LIZ(Boolean bool, C29180Bcm c29180Bcm, BUT but) {
        LiveScenario liveScenario;
        LivePermissionApply livePermissionApply = null;
        if (c29180Bcm != null) {
            liveScenario = new LiveScenario(c29180Bcm.LJLIL, c29180Bcm.LJLILLLLZI, c29180Bcm.LJLJI, c29180Bcm.LJLJJI, c29180Bcm.LJLJJLL);
        } else {
            liveScenario = null;
        }
        if (but != null) {
            livePermissionApply = new LivePermissionApply(but.LJLIL, but.LJLILLLLZI, but.LJLJI);
        }
        this.LIZ.onSuccess(bool, liveScenario, livePermissionApply);
    }
}
