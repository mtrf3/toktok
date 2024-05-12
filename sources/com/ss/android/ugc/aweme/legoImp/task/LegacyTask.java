package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C1791471i;
import X.C188727au;
import X.C1GE;
import X.C34323DdX;
import X.C35274Dss;
import X.C36093EEn;
import X.C36183EHz;
import X.C36322ENi;
import X.C36923EeN;
import X.C38354F3m;
import X.C38423F6d;
import X.C38752FIu;
import X.C38753FIv;
import X.C38754FIw;
import X.C38834FLy;
import X.C38987FRv;
import X.C38995FSd;
import X.C40328FsC;
import X.C47704Ins;
import X.C56662Kg;
import X.C63053Oor;
import X.C72085SQv;
import X.C79045V0n;
import X.C84763XOl;
import X.C9CM;
import X.DOH;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EI0;
import X.EU2;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F68;
import X.F9J;
import X.FAJ;
import X.FCD;
import X.FKM;
import X.FM0;
import X.FM5;
import X.FM8;
import X.FML;
import X.FMR;
import X.FMS;
import X.FVR;
import X.FX1;
import X.QM0;
import X.V1B;
import X.X1D;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS25S0200000_6;
import Y.AfS36S0101000_5;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.common.net.NetworkReceiver;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS78S1100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class LegacyTask implements EE1 {
    public Application LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI = FVR.LIZJ();

    @Override // X.EEY
    public final String key() {
        return "LegacyTask";
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
            return "LegacyTask$DeviceIdChangeTask";
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
            FX1.LIZIZ.LIZ.LJIIIIZZ("did_change", false);
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
        String str;
        SharedPreferences LIZIZ;
        this.LJLIL = (Application) context;
        this.LJLILLLLZI = FCD.LJI(context);
        QM0.LIZ(this.LJLIL);
        C72085SQv.LJLILLLLZI = new V1B();
        C1791471i.LIZ = this.LJLIL;
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZLLL(AccountInitializerTaskImpl.LJ().LIZLLL());
        LIZJ.LIZJ();
        if (this.LJLILLLLZI) {
            NetworkUtils.setCommandListener(C36923EeN.LIZ);
            C56662Kg.LIZ().LIZJ("cold_boot_legacy_init_appdata", false);
            if (!EU2.LIZIZ()) {
                InitAllServiceImpl.LJIILLIIL().LJIILJJIL();
                C84763XOl.LIZLLL().LJJJJZI(C36183EHz.LJLIL);
                C84763XOl.LIZJ().LJJJJZI(C9CM.LJLIL);
            }
            FM5.LIZ(this.LJLIL);
            FVR.LIZ.LJJJJLL().LJIILIIL().LJJIFFI(C47704Ins.LJLJJI).LJJIFFI(C79045V0n.LJLIL).LJJJJZI(new AfS36S0101000_5(2, this, 27));
            FM8.LIZ(this.LJLIL);
            if (!EU2.LIZJ() && C36322ENi.LIZIZ == null) {
                try {
                    C36322ENi.LIZIZ = new C36322ENi();
                } catch (Exception unused) {
                }
                Logger.debug();
            }
            C56662Kg.LIZ().LJFF("cold_boot_legacy_init_appdata", false);
        } else {
            String LIZ = FCD.LIZ(this.LJLIL);
            if (!C38354F3m.LJ(LIZ) && LIZ.endsWith(":ad")) {
                try {
                    Reflect.on(this).set("mBase", new C38754FIw(this.LJLIL.getBaseContext()));
                } catch (Throwable unused2) {
                    Process.killProcess(Process.myPid());
                }
            }
            int myPid = Process.myPid();
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("/proc/");
                LIZ2.append(myPid);
                LIZ2.append("/cmdline");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(X1D.LIZIZ(LIZ2)));
                try {
                    str = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(str)) {
                        str = str.trim();
                    }
                } catch (Throwable unused3) {
                    str = null;
                }
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (str != null && str.endsWith(":push")) {
                    Logger.debug();
                }
            } catch (Throwable unused4) {
            }
        }
        Application application = this.LJLIL;
        if (application != null && (LIZIZ = F9J.LIZIZ(application, 0, "applog_stats")) != null) {
            C38987FRv.LIZLLL = TextUtils.isEmpty(LIZIZ.getString("device_id", ""));
        }
        FAJ.LIZ("coldboot_legacytask_applog", false);
        if (!((Boolean) C35274Dss.LJIJI.getValue()).booleanValue()) {
            if ((((Number) DOH.LIZ.getValue()).intValue() & 2) == 2) {
                C36093EEn c36093EEn = C36093EEn.LIZ;
                if (TasksHolder.LJJIII == null) {
                    TasksHolder.LJJIII = new AppLogInitTask();
                }
                AppLogInitTask appLogInitTask = TasksHolder.LJJIII;
                c36093EEn.getClass();
                C36093EEn.LJ(appLogInitTask);
                ARunnableS25S0200000_6 aRunnableS25S0200000_6 = FM0.LIZJ;
                if (aRunnableS25S0200000_6 != null) {
                    aRunnableS25S0200000_6.run();
                }
            } else {
                C56662Kg.LIZ().LIZJ("cold_boot_legacy_init_applog", false);
                C38834FLy.LIZ(this.LJLIL);
                C56662Kg.LIZ().LJFF("cold_boot_legacy_init_applog", false);
            }
        }
        FAJ.LJFF("coldboot_legacytask_applog", false);
        if (this.LJLIL.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
        if (this.LJLILLLLZI) {
            C38423F6d.LIZ.initPitayaProxy(this.LJLIL);
        }
        if ((((Number) DOH.LIZ.getValue()).intValue() & 4) == 4) {
            C38995FSd.LIZJ().execute(new ARunnableS13S0000000_6(23));
        } else {
            EI0 LIZJ2 = C40328FsC.LIZJ(C36093EEn.LIZ);
            LIZJ2.LIZIZ(new EE1() { // from class: com.ss.android.ugc.aweme.legoImp.task.LegacyTask.2
                @Override // X.EEY
                public final String key() {
                    return "LegacyTask$2";
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
                    return EFK.BACKGROUND;
                }

                @Override // X.EEY
                public final void run(Context context2) {
                    F68 f68 = new F68();
                    if (context2 == null || Build.VERSION.SDK_INT < 26) {
                        return;
                    }
                    NetworkReceiver networkReceiver = new NetworkReceiver();
                    ((ArrayList) f68.LIZ).add(networkReceiver);
                    IntentFilter intentFilter = new IntentFilter();
                    for (String str2 : new String[]{"android.net.conn.CONNECTIVITY_CHANGE"}) {
                        intentFilter.addAction(str2);
                    }
                    C16880lQ.LJJLIIIJILLIZJL(networkReceiver, context2, intentFilter);
                }
            }, true);
            LIZJ2.LIZJ();
        }
        C56662Kg.LIZ().LIZJ("method_init_push_duration", false);
        if (!InitPushTask.LJ()) {
            InitPushTask.LIZLLL(context);
        }
        C56662Kg.LIZ().LJFF("method_init_push_duration", false);
        C188727au.LIZIZ = C38753FIv.LIZ;
        if (((Number) C34323DdX.LIZ.getValue()).intValue() > 0) {
            try {
                Reflect.on(FKM.LIZ()).call("setContentCaptureOptions", new Class[]{Class.forName("android.content.ContentCaptureOptions")}, null);
            } catch (Throwable unused5) {
            }
        }
    }

    public static void LIZLLL(LegacyTask legacyTask, String str) {
        if (TextUtils.equals(legacyTask.LJLJI, str)) {
            return;
        }
        legacyTask.LJLJI = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String serverDeviceId = AppLog.getServerDeviceId();
        if (legacyTask.LJLILLLLZI) {
            C63053Oor LIZ = C63053Oor.LIZIZ.LIZ(legacyTask.LJLIL);
            if (!TextUtils.isEmpty(serverDeviceId)) {
                TokenCert cert = TokenCert.with("bpea-firebase_androidsdk_1993");
                o.LJIIIZ(cert, "cert");
                C1GE.LJIJJ(cert, "Firebase", "setUserId", new AqS78S1100000_11(LIZ, serverDeviceId, 12));
            }
        }
        FMS fms = FMR.LIZ;
        FML fml = fms.LJI;
        if (fml != null) {
            fms.LIZ(fml);
        }
        String str2 = legacyTask.LJLJI;
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
