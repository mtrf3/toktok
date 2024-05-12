package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.services.SmartLockService;

/* loaded from: classes7.dex */
public final class G02 implements R47 {
    public final /* synthetic */ C40862G1y LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ InterfaceC40782FzW LIZJ;

    public G02(C40862G1y c40862G1y, ActivityC45651qj activityC45651qj, ComponentDependencies componentDependencies) {
        this.LIZ = c40862G1y;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = componentDependencies;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 2) {
                ((IMandatoryLoginService) this.LIZ.LIZIZ.getValue()).skipLoginForTest();
            } else if (i2 == 1) {
                if (SmartLockService.createISmartLockServicebyMonsterPlugin(false).isLoginSuccessBySmartLock() && EOO.LJI()) {
                    this.LIZIZ.finish();
                    return;
                }
            } else if (i2 != 1 && i2 != 2) {
                return;
            }
            this.LIZJ.LJJJJI().invoke();
        }
    }
}
