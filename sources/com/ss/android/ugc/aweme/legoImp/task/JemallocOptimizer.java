package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C36089EEj;
import X.C36093EEn;
import X.C76W;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import com.bytedance.sysoptimizer.JemallocSettingResult;
import java.util.List;

/* loaded from: classes16.dex */
public final class JemallocOptimizer {

    /* loaded from: classes10.dex */
    public static abstract class BootFinishTask implements EE1 {
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
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }
    }

    public static void LIZ(BootFinishTask bootFinishTask) {
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(bootFinishTask, true);
        LJIIIZ.LIZJ();
    }

    public static void LIZIZ(JemallocSettingResult jemallocSettingResult) {
        C76W c76w = new C76W();
        c76w.LIZ("option", jemallocSettingResult.optionName);
        c76w.LIZ("origin_value", jemallocSettingResult.rawValue);
        c76w.LIZ("setting_value", jemallocSettingResult.settingValue);
        c76w.LIZ("result", String.valueOf(jemallocSettingResult.exitCode));
        FMX.LJIILJJIL("android_jemalloc_setting_result", c76w.LIZIZ());
    }
}
