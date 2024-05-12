package com.ss.android.ugc.aweme.app.launch;

import X.EE1;
import X.EFK;
import com.ss.android.ugc.aweme.launcher.service.task.ITaskApi;
import com.ss.android.ugc.aweme.legoImp.task.ColdStartThreadPriorityOpt;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImpl.task.LegoRequestTask;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TaskServiceImpl implements ITaskApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final EE1 LIZJ() {
        return new LegoRequestTask();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final EE1 LIZ() {
        EE1 LIZIZ = TasksHolder.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getInitAVModuleTask()");
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final EE1 LIZIZ(EFK type) {
        o.LJIIIZ(type, "type");
        return new ColdStartThreadPriorityOpt(type);
    }
}
