package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C66501Q8b;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.KFD;
import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public class InitMobShare implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitMobShare";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        try {
            LauncherServiceImpl.LIZLLL().isDebug();
            Reflect.on((Class<?>) C66501Q8b.class).set("sMobKey", new KFD(AppLog.getInstallId()));
        } catch (Exception unused) {
        }
    }
}
