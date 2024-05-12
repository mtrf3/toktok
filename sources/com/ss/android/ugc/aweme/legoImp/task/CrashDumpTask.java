package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F3O;
import X.InterfaceC65349Pkn;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.agilelogger.ALog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CrashDumpTask implements EE1 {
    public final String LJLIL = "CrashDumpTask";

    @Override // X.EEY
    public final String key() {
        return "CrashDumpTask";
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
        return EFK.BOOT_FINISH;
    }

    /* loaded from: classes2.dex */
    public class CrashDumpConfig {

        @InterfaceC65349Pkn("crash_info_list")
        public String[] crash_info = new String[0];

        @InterfaceC65349Pkn("open_dump")
        public boolean open_dump;

        public CrashDumpConfig(CrashDumpTask crashDumpTask) {
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        try {
            CrashDumpConfig crashDumpConfig = (CrashDumpConfig) SettingsManager.LIZLLL().LJIIIIZZ("CrashDumpConfig", CrashDumpConfig.class, null);
            if (crashDumpConfig != null && crashDumpConfig.open_dump) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(this.LJLIL, "crashConfig: open");
                ArrayList arrayList = new ArrayList();
                for (String str : crashDumpConfig.crash_info) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(this.LJLIL, "crashConfig str: " + str);
                    arrayList.add(str);
                }
                F3O.LIZ(context, arrayList);
                return;
            }
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(this.LJLIL, "crashConfig: uninit");
        } catch (Throwable unused) {
        }
    }
}
