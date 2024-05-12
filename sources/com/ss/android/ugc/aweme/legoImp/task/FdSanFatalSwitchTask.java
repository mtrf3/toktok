package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F67;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.FdSanFatalSwitch;
import com.ss.android.ugc.aweme.legoImp.task.FdSanFatalSwitchTask;
import java.util.List;

/* loaded from: classes7.dex */
public class FdSanFatalSwitchTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "FdSanFatalSwitchTask";
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
    public final void run(final Context context) {
        SettingsManager.LIZLLL().LJIIIZ(new F67() { // from class: X.FIt
            @Override // X.F67
            public final void onChanged() {
                FdSanFatalSwitchTask fdSanFatalSwitchTask = FdSanFatalSwitchTask.this;
                Context context2 = context;
                fdSanFatalSwitchTask.getClass();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("fdsan_tracker", false)) {
                    FdSanFatalSwitch.openAndroidQFdsan(context2);
                }
            }
        });
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("fdsan_tracker", false)) {
            FdSanFatalSwitch.openAndroidQFdsan(context);
        }
    }
}
