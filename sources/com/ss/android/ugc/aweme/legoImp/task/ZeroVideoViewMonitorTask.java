package com.ss.android.ugc.aweme.legoImp.task;

import X.C0JU;
import X.C0RN;
import X.C10K;
import X.C36152EGu;
import X.C38995FSd;
import X.C39082FVm;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJC;
import X.FJD;
import X.FJE;
import X.InterfaceC36076EDw;
import android.content.Context;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final class ZeroVideoViewMonitorTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "ZeroVideoViewMonitorTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.IO;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!C39082FVm.LIZIZ()) {
            return;
        }
        if (C39082FVm.LIZIZ()) {
            try {
                int i = FJE.LIZ().getInt("last_boot_group", -1);
                if (i != 1) {
                    if (i == 2) {
                        FJD.LIZ = 2;
                        FJD.LIZIZ = 1;
                    } else {
                        FJD.LIZ = -1;
                        FJD.LIZIZ = 1;
                    }
                } else {
                    FJD.LIZ = 1;
                    FJD.LIZIZ = 2;
                }
                FJE.LIZ().storeInt("last_boot_group", FJD.LIZIZ);
            } catch (Throwable unused) {
            }
            C39082FVm.LIZJ = true;
        }
        LinkedHashMap LIZ = C0JU.LIZ("monitor_scene", "scene_start");
        LIZ.put("event_version", 5);
        LIZ.put("boot_time", Long.valueOf(SystemClock.uptimeMillis()));
        LIZ.put("vv_code", 1000);
        LIZ.put("is_new_user", String.valueOf(C36152EGu.LJI()));
        C39082FVm.LIZJ(LIZ);
        C10K.LJII(3000L).LJ(FJC.LIZ, C38995FSd.LIZLLL(), null);
    }
}
