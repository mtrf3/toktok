package com.ss.android.ugc.aweme.legoImp.task;

import X.AV1;
import X.C00F;
import X.C0RN;
import X.C10K;
import X.C188727au;
import X.C1DG;
import X.C34509DgX;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.FMX;
import X.FPI;
import X.FPJ;
import X.FPL;
import X.FPO;
import X.FPT;
import Y.ACallableS23S0001000_1;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.experiment.EcomProfileSettingPreciseConfig;
import com.ss.android.ugc.aweme.search.service.ecom.ab.SearchClassReflectPreloadConfig;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class SnapBoostPreloadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SnapBoostPreloadTask";
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

    public static void LIZLLL() {
        String str;
        FPL.LIZ.getClass();
        SearchClassReflectPreloadConfig searchClassReflectPreloadConfig = FPL.LIZJ;
        if (searchClassReflectPreloadConfig != null) {
            str = searchClassReflectPreloadConfig.searchClassReflectPreloadPhase;
        } else {
            str = null;
        }
        if (o.LJ(str, "phase_in_boot_finish")) {
            C10K.LIZJ(new ACallableS23S0001000_1(1, 1));
        }
        if (C1DG.LIZIZ() == 4 || C1DG.LIZIZ() == 3) {
            new FPJ("snapboost_list.txt").LIZJ();
        }
        if (C00F.LIZ(31744, 0, "ecom_pdp_preload_class", true) == 1) {
            System.currentTimeMillis();
            new FPJ("snapboost_list_ecommerce_pdp.txt").LIZJ();
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        EcomProfileSettingPreciseConfig ecomProfileSettingPreciseConfig = FPO.LIZ;
        LJIIIZ.getClass();
        EcomProfileSettingPreciseConfig ecomProfileSettingPreciseConfig2 = (EcomProfileSettingPreciseConfig) FFL.LJIJ(true, "ecom_profile_setting_precise", 31744, EcomProfileSettingPreciseConfig.class, ecomProfileSettingPreciseConfig);
        if (ecomProfileSettingPreciseConfig2 != null) {
            ecomProfileSettingPreciseConfig = ecomProfileSettingPreciseConfig2;
        }
        if (ecomProfileSettingPreciseConfig.preloadEnable) {
            new FPJ("snapboost_list_ecommerce.txt").LIZJ();
        }
        if ((C34509DgX.LIZ & 1) == 1) {
            new FPJ("snapboost_list_profile_enter.txt").LIZJ();
        }
        if ((((Number) FPT.LIZ.getValue()).intValue() & 1) == 1) {
            new FPJ("snapboost_list_detail_enter.txt").LIZJ();
        }
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
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            FPI.LIZ(context, true);
            LIZLLL();
        } catch (Throwable unused) {
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin() && !AV1.LJIILLIIL()) {
            C188727au c188727au = new C188727au();
            c188727au.LJ(uptimeMillis2, "commit_took");
            c188727au.LIZLLL(1, "commit_id");
            c188727au.LIZLLL(0, "commit_result");
            FMX.LJIIL("tool_performance_profile_editor", c188727au.LIZ);
        }
    }
}
