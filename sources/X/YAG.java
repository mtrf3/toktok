package X;

import com.bytedance.sysoptimizer.java.AndroidNWindowManagerProtector;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;

/* loaded from: classes16.dex */
public final class YAG implements AndroidNWindowManagerProtector.GuardListener {
    public final /* synthetic */ SysOptimizerTask LIZ;

    @Override // com.bytedance.sysoptimizer.java.AndroidNWindowManagerProtector.GuardListener
    public final void onGuardFailed() {
        this.LIZ.getClass();
        SysOptimizerTask.LJIJI(false);
    }

    @Override // com.bytedance.sysoptimizer.java.AndroidNWindowManagerProtector.GuardListener
    public final void onGuardSuccess() {
        this.LIZ.getClass();
        SysOptimizerTask.LJIJI(true);
    }

    public YAG(SysOptimizerTask sysOptimizerTask) {
        this.LIZ = sysOptimizerTask;
    }
}
