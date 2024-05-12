package com.ss.android.ugc.aweme.impl;

import X.C40391FtD;
import X.C58096Mr6;
import X.C64841Pcb;
import X.C84342X8g;
import X.EE1;
import X.FKM;
import X.InterfaceC38012Evw;
import com.bytedance.ies.ugc.statisticlogger.page.PageTask;
import com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi;
import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.ss.android.ugc.aweme.legoImp.task.MotaInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LauncherTaskApiImpl implements ILauncherTaskApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final String LJFF() {
        return "fission_withdrawal";
    }

    public static ILauncherTaskApi LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(ILauncherTaskApi.class, false);
        if (LIZ != null) {
            return (ILauncherTaskApi) LIZ;
        }
        if (C58096Mr6.o1 == null) {
            synchronized (ILauncherTaskApi.class) {
                if (C58096Mr6.o1 == null) {
                    C58096Mr6.o1 = new LauncherTaskApiImpl();
                }
            }
        }
        return C58096Mr6.o1;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final EE1 LIZ() {
        if (TasksHolder.LJIJJLI == null) {
            TasksHolder.LJIJJLI = new PageTask();
        }
        PageTask pageTask = TasksHolder.LJIJJLI;
        o.LJIIIIZZ(pageTask, "getBtmPagerInitTask()");
        return pageTask;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final EE1 LIZLLL() {
        if (TasksHolder.LJIJJ == null) {
            TasksHolder.LJIJJ = new AssemInitTask();
        }
        AssemInitTask assemInitTask = TasksHolder.LJIJJ;
        o.LJIIIIZZ(assemInitTask, "getAssemInitTask()");
        return assemInitTask;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final EE1 LJ() {
        if (TasksHolder.LJIL == null) {
            TasksHolder.LJIL = new MotaInitTask();
        }
        MotaInitTask motaInitTask = TasksHolder.LJIL;
        o.LJIIIIZZ(motaInitTask, "getMotaInitTask()");
        return motaInitTask;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final InterfaceC38012Evw LJI() {
        return new C40391FtD();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final EE1 LIZIZ() {
        EE1 LIZLLL = TasksHolder.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getInitPushTask()");
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final void LJII() {
        if (C64841Pcb.LIZ().getConfig() == null) {
            new InitTTNetTask().run(FKM.LIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi
    public final void LIZJ() {
        C84342X8g.LIZ();
    }
}
