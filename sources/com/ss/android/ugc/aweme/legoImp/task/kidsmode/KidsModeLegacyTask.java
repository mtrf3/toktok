package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.AV1;
import X.C0RN;
import X.C1791471i;
import X.C36089EEj;
import X.C36093EEn;
import X.C36183EHz;
import X.C36322ENi;
import X.C36583EXj;
import X.C36922EeM;
import X.C36923EeN;
import X.C38752FIu;
import X.C38757FIz;
import X.C38834FLy;
import X.C40328FsC;
import X.C47704Ins;
import X.C56662Kg;
import X.C72085SQv;
import X.C78685UuP;
import X.C79045V0n;
import X.C84763XOl;
import X.C9CM;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EI0;
import X.EU2;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FGG;
import X.FM5;
import X.FM8;
import X.FML;
import X.FMR;
import X.FMS;
import X.FVR;
import X.V1B;
import X.X1D;
import Y.AfS36S0101000_5;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import java.util.List;
import yq4.a;

/* loaded from: classes7.dex */
public class KidsModeLegacyTask implements EE1 {
    public Application LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI = FVR.LIZJ();

    @Override // X.EEY
    public final String key() {
        return "KidsModeLegacyTask";
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

    /* loaded from: classes7.dex */
    public class DeviceIdChangeTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "KidsModeLegacyTask$DeviceIdChangeTask";
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
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final void run(Context context) {
            EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
            LIZJ.LIZIZ(new GeckoHighPriorityCheckInRequest(), true);
            LIZJ.LIZIZ(new GeckoCheckInRequest(), true);
            LIZJ.LIZJ();
        }
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
        String LIZ;
        boolean LJIIJJI;
        this.LJLIL = (Application) context;
        this.LJLILLLLZI = FCD.LJI(context);
        C72085SQv.LJLILLLLZI = new V1B();
        C1791471i.LIZ = this.LJLIL;
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZ(AccountInitializerTaskImpl.LJ().LIZLLL());
        LJIIIZ.LIZJ();
        List<String> list = null;
        if (this.LJLILLLLZI) {
            NetworkUtils.setCommandListener(C36923EeN.LIZ);
            KidsCommonServiceImpl.LJFF().LIZIZ();
            FM5.LIZ(this.LJLIL);
            C84763XOl.LIZLLL().LJJJJZI(C36183EHz.LJLIL);
            C84763XOl.LIZJ().LJJJJZI(C9CM.LJLIL);
            FVR.LIZ.LJJJJLL().LJIILIIL().LJJIFFI(C47704Ins.LJLJJI).LJJIFFI(C79045V0n.LJLIL).LJJJJZI(new AfS36S0101000_5(2, this, 11));
            FM8.LIZ(this.LJLIL);
            if (!EU2.LIZJ() && C36322ENi.LIZIZ == null) {
                try {
                    C36322ENi.LIZIZ = new C36322ENi();
                } catch (Exception unused) {
                }
                Logger.debug();
            }
            LIZ = null;
        } else {
            LIZ = FCD.LIZ(this.LJLIL);
        }
        try {
            AppLog.setUseGoogleAdId(true);
        } catch (IllegalStateException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initApplog startLaunch:");
            LIZ2.append(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ);
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            C36922EeM.LIZ(e);
        }
        AppLog.registerLogRequestCallback(new C38757FIz());
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new CommonParamsInitTask(), true);
        LIZJ.LIZJ();
        if (a.LJI().LJI()) {
            LJIIJJI = C36583EXj.LIZJ();
        } else {
            LJIIJJI = AV1.LJIIJJI();
        }
        AppLog.setChildModeBeforeInit(LJIIJJI);
        if (LJIIJJI) {
            list = a.LJI().LJFF();
        }
        AppLog.setEventFilterByClient(list, false);
        C38834FLy.LIZ(this.LJLIL);
        if (this.LJLIL.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
        C56662Kg.LIZ().LIZJ("method_init_push_duration", false);
        if (this.LJLILLLLZI || FGG.LIZJ(this.LJLIL, LIZ)) {
            C78685UuP.LJJIII().initMessageDepend();
        }
        C56662Kg.LIZ().LJFF("method_init_push_duration", false);
    }

    public static void LIZLLL(KidsModeLegacyTask kidsModeLegacyTask, String str) {
        if (TextUtils.equals(kidsModeLegacyTask.LJLJI, str)) {
            return;
        }
        kidsModeLegacyTask.LJLJI = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FMS fms = FMR.LIZ;
        FML fml = fms.LJI;
        if (fml != null) {
            fms.LIZ(fml);
        }
        String str2 = kidsModeLegacyTask.LJLJI;
        String installId = AppLog.getInstallId();
        if (installId == null) {
            installId = "";
        }
        SecApiImpl.LIZ().updateDeviceIdAndInstallId(str2, installId);
        if (C38752FIu.LIZ() != ((int) EF7.LIZJ())) {
            SecApiImpl.LIZ().reportData("install");
        }
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new DeviceIdChangeTask(), true);
        LIZJ.LIZJ();
    }
}
