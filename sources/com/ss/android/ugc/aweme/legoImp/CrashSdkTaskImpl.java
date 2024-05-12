package com.ss.android.ugc.aweme.legoImp;

import X.EE1;
import com.ss.android.legoapi.ICrashSdkTaskApi;
import com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask;
import com.ss.android.ugc.aweme.legoImp.task.AnrTask;
import com.ss.android.ugc.aweme.legoImp.task.CrashSdkInitTask;
import com.ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask;
import com.ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthExtentTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthSecondInitTask;
import com.ss.android.ugc.aweme.legoImp.task.SafeViewInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ViewHolderLogTask;

/* loaded from: classes7.dex */
public final class CrashSdkTaskImpl implements ICrashSdkTaskApi {
    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZ() {
        return new NpthSecondInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZIZ() {
        return new NpthExtentTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZJ() {
        return new AnalysisHprofTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZLLL() {
        return new LeakReporterInjectTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJ() {
        return new CrashSdkInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJFF() {
        return new ViewHolderLogTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJI() {
        return new SafeViewInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJII() {
        return new NpthCoreInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJIIIIZZ() {
        return new MemoryMonitorTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJIIIZ() {
        return new AnrTask();
    }
}
