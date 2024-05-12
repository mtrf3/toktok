package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C37179EiV;
import X.C39687Fhr;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import X.FFL;
import X.X1D;
import Y.ARunnableS10S0101000_6;
import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class StorageDeteriorationTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "StorageDeteriorationTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        int i;
        try {
            FFL.LJIIIZ().getClass();
            TrafficDeteriorationABParam trafficDeteriorationABParam = (TrafficDeteriorationABParam) FFL.LJIJ(true, "traffic_deterioration_android_v2", 31744, TrafficDeteriorationABParam.class, null);
            if (trafficDeteriorationABParam != null && (i = trafficDeteriorationABParam.degradation_scene) != 0) {
                int i2 = trafficDeteriorationABParam.traffic_degradation_rate;
                if (i == 6) {
                    EF7.LIZIZ();
                    long j = F9J.LIZIZ(EF7.LIZIZ(), 0, "storage_de_ab_v2_sp").getLong("key_ab_lab_did_lasttime", 0L);
                    long millis = TimeUnit.DAYS.toMillis(7L);
                    if (C39687Fhr.LJFF() > 1073741824 && System.currentTimeMillis() - j > millis) {
                        C37179EiV.LJFF.post(new ARunnableS10S0101000_6(i2, this, 6));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void LIZLLL(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Runtime runtime = Runtime.getRuntime();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dd if=/dev/zero of=");
            LIZ.append(str);
            LIZ.append(" bs=10485760  count=");
            LIZ.append(i);
            runtime.exec(X1D.LIZIZ(LIZ));
        } catch (Throwable unused) {
        }
        F9J.LIZIZ(EF7.LIZIZ(), 0, "storage_de_ab_v2_sp").edit().putLong("key_ab_lab_did_lasttime", System.currentTimeMillis()).apply();
    }
}
