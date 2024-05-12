package com.ss.android.legoimpl;

import X.C01H;
import X.C09000Wy;
import X.C09010Wz;
import X.C0RN;
import X.C0U7;
import X.C0YN;
import X.C0YR;
import X.C145995oB;
import X.C33949DUb;
import X.C36922EeM;
import X.C48693J9d;
import X.C78983UzD;
import X.DN4;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJL;
import X.FKM;
import X.FMX;
import X.X1D;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes7.dex */
public class ExperienceKitInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ExperienceKitInitTask";
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
        return 1;
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
    public final boolean meetTrigger() {
        if (C33949DUb.LIZJ()) {
            return false;
        }
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("enable_vboost_settings", false);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, X.1O9] */
    @Override // X.EEY
    public final void run(Context context) {
        C36922EeM.LJ("ExperienceKitInitTask");
        FMX.LJIIL("vboost_task_launch", new C145995oB().LIZ);
        try {
            SettingsManager.LIZLLL().getClass();
            int LJ = SettingsManager.LJ("vboost_log_level_settings_mt", 6);
            C0YN.LIZ.LIZIZ = Integer.valueOf(LJ);
            boolean z = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("enable_vboost_settings", false);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enable:");
            LIZ.append(z);
            C36922EeM.LIZLLL(4, "vboost", X1D.LIZIZ(LIZ));
            if (z) {
                SettingsManager.LIZLLL().getClass();
                C0U7.LJ = SettingsManager.LIZ("enable_vboost_vendor_settings", false);
                C48693J9d c48693J9d = new C48693J9d();
                if (((Boolean) DN4.LJFF.getValue()).booleanValue()) {
                    C01H.LIZIZ = c48693J9d;
                } else {
                    FJL fjl = FJL.LIZ;
                    C09010Wz c09010Wz = C09000Wy.LIZ;
                    c09010Wz.LJII.LIZIZ = new WeakReference(fjl);
                    C0YR.LIZ.LIZIZ = c09010Wz.LJIIIIZZ;
                    C01H.LIZ(FKM.LIZ());
                    C36922EeM.LIZLLL(4, "vboost", "registerApplication.");
                    FMX.LJIIL("vboost_register_application", new C145995oB().LIZ);
                    C01H.LIZLLL(C48693J9d.LIZIZ());
                }
                AVExternalServiceImpl.LIZ().publishService().setKitManageRegister(true);
            }
        } catch (Throwable th) {
            C36922EeM.LIZLLL(6, "vboost", "registerApplication exception.");
            C78983UzD.LJIIZILJ(th);
            C09010Wz.LJIIJ.LIZIZ = Boolean.FALSE;
            AVExternalServiceImpl.LIZ().publishService().setKitManageRegister(false);
        }
    }
}
