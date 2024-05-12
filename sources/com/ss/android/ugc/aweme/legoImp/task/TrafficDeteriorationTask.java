package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C37179EiV;
import X.E8Q;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import X.FFL;
import Y.ARunnableS10S0101000_6;
import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.launcher.service.experiment.ITrafficDeteriorationApi;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class TrafficDeteriorationTask implements EE1 {
    public static boolean LJLIL = true;
    public static int LJLILLLLZI;

    /* loaded from: classes7.dex */
    public static class TrafficDeteriorationABImpl implements ITrafficDeteriorationApi {
    }

    @Override // X.EEY
    public final String key() {
        return "TrafficDeteriorationTask";
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

    public static boolean LIZLLL() {
        EF7.LIZIZ();
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "traffic_de_ab_v2_sp");
        int i = LIZIZ.getInt("key_ab_lab_did_count", 0);
        LJLILLLLZI = i;
        long j = LIZIZ.getLong("key_ab_lab_did_lasttime", 0L);
        long millis = TimeUnit.DAYS.toMillis(7L);
        if (i > 4 || System.currentTimeMillis() - j <= millis) {
            return false;
        }
        return true;
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
                int i2 = trafficDeteriorationABParam.traffic_degradation_rate / 10;
                if (i == 5) {
                    E8Q.LIZJ = trafficDeteriorationABParam.enable_traffic_statistics;
                    if (!LIZLLL()) {
                        return;
                    }
                    LJLIL = false;
                    C37179EiV.LJFF.postDelayed(new ARunnableS10S0101000_6(i2, this, 7), 120000);
                } else if (i == 4) {
                    E8Q.LIZJ = trafficDeteriorationABParam.enable_traffic_statistics;
                    if (!LIZLLL()) {
                        return;
                    }
                    LJLIL = true;
                    C37179EiV.LJFF.postDelayed(new ARunnableS10S0101000_6(i2, this, 7), 120000);
                }
            }
        } catch (Exception unused) {
        }
    }
}
