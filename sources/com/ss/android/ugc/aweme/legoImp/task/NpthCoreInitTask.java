package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C34953Dnh;
import X.C35007DoZ;
import X.C35019Dol;
import X.C36839Ed1;
import X.C38832FLw;
import X.C64254PJq;
import X.C66460Q6m;
import X.C66466Q6s;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.PTS;
import X.V3N;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.crash.Npth;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.List;

/* loaded from: classes7.dex */
public class NpthCoreInitTask implements EE1 {
    public static volatile Throwable LJLIL;

    @Override // X.EEY
    public final String key() {
        return "NpthCoreInitTask";
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
    public final int targetProcess() {
        return 16777215;
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        String str;
        Npth.setApplication((Application) context);
        if (FCD.LIZ(context).contains("miniapp")) {
            return;
        }
        String LIZ = FCD.LIZ(context);
        if (!TextUtils.isEmpty(LIZ) && LIZ.contains("bm")) {
            str = "3902";
        } else {
            str = null;
        }
        Npth.setOpenNewAnrMonitor(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("open_new_anr_monitor_v2", false));
        if (!EF7.LJIILLIIL) {
            Npth.init(context, new C38832FLw(str), true, true, true);
        }
        Npth.getConfigManager().setDefaultAnrCheckInterval(C34953Dnh.LIZ);
        if (C35007DoZ.LIZ.LIZ().getBoolean("enable_launch_protect", false) || Keva.getRepo("ab_repo_cold_boot_launch_protector").getBoolean("enable_launch_protect", false) || C35019Dol.LIZIZ()) {
            synchronized (C66466Q6s.class) {
                if (!C66466Q6s.LIZ) {
                    if (C35019Dol.LIZIZ()) {
                        Reflect.on((Class<?>) C64254PJq.class).set("sExceptionNoLimit", Boolean.TRUE);
                    }
                    if (C36839Ed1.LIZIZ(context) || C36839Ed1.LIZ(context).contains(":safemode")) {
                        C66460Q6m LIZIZ = C66460Q6m.LIZIZ();
                        V3N v3n = new V3N();
                        LIZIZ.getClass();
                        SafeModeActivity.LJLJJLL.getClass();
                        SafeModeActivity.LJLJJI = v3n;
                        C66460Q6m.LIZIZ().LIZJ(context, C36839Ed1.LIZIZ(context), new PTS(C16880lQ.LLLLL(context)));
                        C66466Q6s.LIZ(context);
                    }
                    C66466Q6s.LIZ = true;
                }
            }
        }
        if (LJLIL == null) {
        } else {
            throw new RuntimeException("before npth init crash catch", LJLIL);
        }
    }
}
