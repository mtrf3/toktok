package com.ss.android.ugc.aweme.legoImp;

import X.EE1;
import com.ss.android.legoapi.ISysOptTaskApi;
import com.ss.android.ugc.aweme.legoImp.task.FdSanFatalSwitchTask;
import com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NativeBitmapTask;
import com.ss.android.ugc.aweme.legoImp.task.SamangCrashHandleTask;
import com.ss.android.ugc.aweme.legoImp.task.SliverTrackerTask;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitGodzilla;

/* loaded from: classes7.dex */
public final class SysOptTaskImpl implements ISysOptTaskApi {
    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZ() {
        return new SamangCrashHandleTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZIZ() {
        return new HoraeInitTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZJ() {
        return new NativeBitmapTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZLLL() {
        return new InitGodzilla();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LJ() {
        return new FdSanFatalSwitchTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LJFF() {
        return new SliverTrackerTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LJI() {
        return new SysOptimizerTask();
    }
}
