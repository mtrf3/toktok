package X;

import Y.ARunnableS42S0100000_6;
import android.os.Looper;
import com.ss.android.legoimpl.BusinessToolsTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerPageTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FFD implements Runnable {
    public final int LJLIL;

    public static void LIZIZ() {
        if (!((Boolean) C88063YhH.LIZJ.getValue()).booleanValue()) {
            C56662Kg.LIZ().LIZJ("method_init_push_early_ensure_duration", false);
            C36093EEn c36093EEn = C36093EEn.LIZ;
            EE1 LIZLLL = TasksHolder.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getInitPushTask()");
            c36093EEn.getClass();
            C36093EEn.LJ(LIZLLL);
            C56662Kg.LIZ().LJFF("method_init_push_early_ensure_duration", false);
        }
    }

    public final void LIZ() {
        int i = this.LJLIL;
        if (i != 2) {
            if (i != 3) {
                return;
            }
            LIZIZ();
            return;
        }
        if (((Boolean) C33949DUb.LJ.getValue()).booleanValue()) {
            return;
        }
        if (!C38874FNm.LIZIZ()) {
            LIZIZ();
        }
        C56662Kg.LIZ().LIZJ("method_ensure_duration", false);
        C56662Kg.LIZ().LIZJ("method_business_tools_ensure_duration", false);
        C36093EEn c36093EEn = C36093EEn.LIZ;
        if (TasksHolder.LJ == null) {
            TasksHolder.LJ = new BusinessToolsTask(FKM.LIZ());
        }
        BusinessToolsTask businessToolsTask = TasksHolder.LJ;
        o.LJIIIIZZ(businessToolsTask, "getBusinessToolsTask()");
        c36093EEn.getClass();
        C36093EEn.LJ(businessToolsTask);
        C56662Kg.LIZ().LJFF("method_business_tools_ensure_duration", false);
        C56662Kg.LIZ().LIZJ("method_absdk_ensure_duration", false);
        EE1 LIZ = TasksHolder.LIZ();
        o.LJIIIIZZ(LIZ, "getAbTestSdkInitTask()");
        C36093EEn.LJ(LIZ);
        C56662Kg.LIZ().LJFF("method_absdk_ensure_duration", false);
        C56662Kg.LIZ().LIZJ("method_init_module_ensure_duration", false);
        if (TasksHolder.LIZLLL == null) {
            TasksHolder.LIZLLL = new InitModules();
        }
        InitModules initModules = TasksHolder.LIZLLL;
        o.LJIIIIZZ(initModules, "getInitModules()");
        C36093EEn.LJ(initModules);
        C56662Kg.LIZ().LJFF("method_init_module_ensure_duration", false);
        if (!EU2.LIZ()) {
            C56662Kg.LIZ().LIZJ("method_cancel_notification_ensure_duration", false);
            if (TasksHolder.LJFF == null) {
                TasksHolder.LJFF = (EE1) C78685UuP.LJJIII().getCancelNotiTask();
            }
            EE1 ee12 = TasksHolder.LJFF;
            o.LJIIIIZZ(ee12, "getCancelNotificationTask()");
            C36093EEn.LJ(ee12);
            C56662Kg.LIZ().LJFF("method_cancel_notification_ensure_duration", false);
        }
        if (C34710Djm.LIZ()) {
            C56662Kg.LIZ().LIZJ("method_init_avmodule_ensure_duration", false);
            EE1 LIZIZ = TasksHolder.LIZIZ();
            o.LJII(LIZIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.legoImp.task.InitAVModule");
            InitAVModule initAVModule = (InitAVModule) LIZIZ;
            C36093EEn.LJ(initAVModule);
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                initAVModule.LJIIJ();
            } else {
                C37179EiV.LIZ().post(new ARunnableS42S0100000_6(initAVModule, 149));
            }
            C56662Kg.LIZ().LJFF("method_init_avmodule_ensure_duration", false);
        }
        if (!((Boolean) C88063YhH.LIZJ.getValue()).booleanValue() && InitPushTask.LJ()) {
            C56662Kg.LIZ().LIZJ("method_init_push_async_ensure_duration", false);
            EE1 LIZLLL = TasksHolder.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getInitPushTask()");
            C36093EEn.LJ(LIZLLL);
            C56662Kg.LIZ().LJFF("method_init_push_async_ensure_duration", false);
        }
        C56662Kg.LIZ().LIZJ("method_power_page_ensure_duration", false);
        if (TasksHolder.LJII == null) {
            TasksHolder.LJII = new PowerPageTask();
        }
        PowerPageTask powerPageTask = TasksHolder.LJII;
        o.LJIIIIZZ(powerPageTask, "getPowerPageTask()");
        C36093EEn.LJ(powerPageTask);
        C56662Kg.LIZ().LJFF("method_power_page_ensure_duration", false);
        C56662Kg.LIZ().LIZJ("method_init_foundation_ensure_duration", false);
        EE1 LIZJ = TasksHolder.LIZJ();
        o.LJIIIIZZ(LIZJ, "getInitFoundationTask()");
        C36093EEn.LJ(LIZJ);
        C56662Kg.LIZ().LJFF("method_init_foundation_ensure_duration", false);
        C56662Kg.LIZ().LIZJ("method_init_ui_ensure_duration", false);
        if (TasksHolder.LJIIJJI == null) {
            TasksHolder.LJIIJJI = new UIInitTask();
        }
        UIInitTask uIInitTask = TasksHolder.LJIIJJI;
        o.LJIIIIZZ(uIInitTask, "getInitUITask()");
        C36093EEn.LJ(uIInitTask);
        C56662Kg.LIZ().LJFF("method_init_ui_ensure_duration", false);
        if (DOI.LIZIZ()) {
            C56662Kg.LIZ().LIZJ("method_fix_inflate_crash_ensure_duration", false);
            InitLegoInflate.LJLIL.LIZ(EF7.LIZIZ());
            C56662Kg.LIZ().LJFF("method_fix_inflate_crash_ensure_duration", false);
        }
        C56662Kg.LIZ().LJFF("method_ensure_duration", false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public FFD(int i) {
        this.LJLIL = i;
    }
}
