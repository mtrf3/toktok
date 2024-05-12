package com.ss.android.ugc.aweme.legoImp.task;

import X.C00F;
import X.C0RN;
import X.C198517qh;
import X.C2NU;
import X.C36152EGu;
import X.C38663FFj;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FIP;
import X.FIQ;
import X.FIR;
import X.FIS;
import X.FUA;
import Y.AObjectS11S0001000_6;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.statisticlogger.page.PageTask;
import com.ss.android.common.applog.AppLog;
import com.ss.android.legoimpl.BusinessToolsTask;
import com.ss.android.ugc.aweme.InitFoundationTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitAdServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.ColdBootLivePreParseDNSTask;
import com.ss.android.ugc.aweme.legoImpl.task.InitFireBase;
import com.ss.android.ugc.aweme.legoImpl.task.InitRouter;
import com.ss.android.ugc.aweme.legoImpl.task.ScreenShotFeedbackTask;
import com.ss.android.ugc.aweme.legoImpl.task.ScreenShotTask;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes7.dex */
public final class TasksHolder {
    public static EE1 LIZ;
    public static EE1 LIZIZ;
    public static InitFireBase LIZJ;
    public static InitModules LIZLLL;
    public static BusinessToolsTask LJ;
    public static EE1 LJFF;
    public static InitPushTask LJI;
    public static PowerPageTask LJII;
    public static InitRouter LJIIIIZZ;
    public static InitFoundationTask LJIIIZ;
    public static InitStringHotUpdateTask LJIIJ;
    public static UIInitTask LJIIJJI;
    public static InitAVModule LJIIL;
    public static EE1 LJIILIIL;
    public static PlayerKitInitTask LJIILJJIL;
    public static PlayerKitCommonWidgetInitTask LJIILL;
    public static InitAdServiceTask LJIILLIIL;
    public static InitAppsFlyer LJIIZILJ;
    public static EE1 LJIJ;
    public static EE1 LJIJI;
    public static AssemInitTask LJIJJ;
    public static PageTask LJIJJLI;
    public static MotaInitTask LJIL;
    public static SplitCompatInstall LJJ;
    public static ScreenShotTask LJJI;
    public static ScreenShotFeedbackTask LJJIFFI;
    public static ColdBootPreloadPlayerSoTask LJJII;
    public static AppLogInitTask LJJIII;
    public static PlayerConfigInitTask LJJIIJ;
    public static ColdBootLivePreParseDNSTask LJJIIJZLJL;
    public static ApmInit LJJIIZ;
    public static InitShareSdkTask LJJIIZI;

    /* loaded from: classes7.dex */
    public static class AmeActivityResumeRun implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "TasksHolder$AmeActivityResumeRun";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EE1
        public final EFK type() {
            if (((Boolean) FIS.LIZ.getValue()).booleanValue() || C36152EGu.LIZIZ(FIQ.LJLIL)) {
                return EFK.MAIN;
            }
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        public AmeActivityResumeRun(Activity activity) {
            new WeakReference(activity);
        }

        @Override // X.EEY
        public final void run(Context context) {
            if (C00F.LIZ(31744, 0, "use_new_app_alert", true) == 0) {
                AppLog.activeUser(EF7.LIZIZ());
            }
            FIP fip = FIP.LIZIZ;
            fip.getClass();
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    for (int i = 0; i < fip.LIZ.size(); i++) {
                        FIR valueAt = fip.LIZ.valueAt(i);
                        int keyAt = fip.LIZ.keyAt(i);
                        if (valueAt != null && !valueAt.LIZ) {
                            if (valueAt.LIZJ == 3) {
                                valueAt.LIZ = true;
                                valueAt.LIZJ = 0;
                            } else if (System.currentTimeMillis() - valueAt.LIZIZ > (30000 >> r1)) {
                                valueAt.LIZJ++;
                                long currentTimeMillis = System.currentTimeMillis() - valueAt.LIZIZ;
                                C198517qh c198517qh = new C198517qh();
                                c198517qh.LIZ.put("group_id", String.valueOf(keyAt));
                                c198517qh.LIZ.put("fetch_url_retry_count", Integer.valueOf(valueAt.LIZJ));
                                c198517qh.LIZ.put("time_interval", Long.valueOf(currentTimeMillis));
                                FUA.LIZJ("aweme_setting_retry_policy", c198517qh.LJ());
                                valueAt.LIZLLL.LIZ();
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static EE1 LIZ() {
        if (LIZ == null) {
            LIZ = C38663FFj.LIZIZ.LIZ();
        }
        return LIZ;
    }

    public static EE1 LIZIZ() {
        if (LJIIL == null) {
            LJIIL = new InitAVModule();
        }
        return LJIIL;
    }

    public static EE1 LIZJ() {
        if (LJIIIZ == null) {
            LJIIIZ = new InitFoundationTask(new AObjectS11S0001000_6(0, 1), new AObjectS11S0001000_6(1, 0));
        }
        return LJIIIZ;
    }

    public static EE1 LIZLLL() {
        if (LJI == null) {
            LJI = new InitPushTask();
        }
        return LJI;
    }

    public static EE1 LJ(final int i) {
        return new EE1() { // from class: com.ss.android.ugc.aweme.legoImp.task.TasksHolder.1
            @Override // X.EEY
            public final String key() {
                return "TasksHolder$1";
            }

            @Override // X.EEY
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.EEY
            public final /* synthetic */ String prefix() {
                return "task_";
            }

            @Override // X.EE1
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.EEY
            public final /* synthetic */ int targetProcess() {
                return C0RN.LIZ();
            }

            @Override // X.EEY
            public final /* synthetic */ List triggerOtherLegoComponents() {
                return null;
            }

            @Override // X.EEY
            public final /* synthetic */ EnumC36103EEx triggerType() {
                return C0RN.LIZIZ(this);
            }

            @Override // X.EEY
            public final EnumC36092EEm scenesType() {
                return EnumC36092EEm.DEFAULT;
            }

            @Override // X.EE1
            public final EFK type() {
                return EFK.BACKGROUND;
            }

            @Override // X.EEY
            public final void run(Context context) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).preloadStageTask(i, context);
            }
        };
    }
}
