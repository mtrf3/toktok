package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0RN;
import X.C16880lQ;
import X.C23790wZ;
import X.C23830wd;
import X.C23840we;
import X.C23860wg;
import X.C34945DnZ;
import X.C35662Dz8;
import X.C38943FQd;
import X.C3GQ;
import X.C3GR;
import X.C52863Kot;
import X.C61532OCy;
import X.C61534ODa;
import X.C61561OEb;
import X.C61570OEk;
import X.C61571OEl;
import X.C84763XOl;
import X.EBC;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.L5N;
import X.L5O;
import X.LHU;
import X.O3U;
import X.OF3;
import android.content.Context;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.utils.gecko.GeckoDownloadResumeConfig;
import com.ss.android.ugc.aweme.utils.gecko.GeckoDownloadStrategy;
import com.ss.android.ugc.aweme.utils.gecko.GeckoExperimentsType;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLiveOpt;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GeckoGlobalInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "GeckoGlobalInitTask";
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
        int availableStorageFull;
        boolean useGeckoSettings;
        List<String> list;
        o.LJIIIZ(context, "context");
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(new C61570OEk());
        String LIZ = C38943FQd.LIZ();
        File LIZLLL = C38943FQd.LIZLLL();
        C61532OCy c61532OCy = EBC.LIZ;
        C16880lQ.LJJLIL(c61532OCy, LIZ, LIZLLL.getAbsolutePath());
        HashMap hashMap = new HashMap();
        hashMap.put("business_version", new OptionCheckUpdateParams.CustomValue() { // from class: X.OEj
            @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
            public final Object getValue() {
                return EF7.LIZLLL();
            }
        });
        c61532OCy.LJIIIZ(C38943FQd.LIZ(), hashMap);
        if (((Boolean) C23790wZ.LIZ.getValue()).booleanValue()) {
            C61571OEl.LIZ.LIZJ = (Map) SettingsManager.LIZLLL().LJIIIIZZ("geckox_resource_clean_group_name", Map.class, L5N.LIZ);
        }
        if ((((Number) C23840we.LIZ.getValue()).intValue() & 1) == 1) {
            Map<String, List<String>> expVal = (Map) C23830wd.LIZIZ.getValue();
            o.LJIIIIZZ(expVal, "expVal");
            C61571OEl.LIZ.LJ = expVal;
        }
        AppSettingsManager appSettingsManager = C61571OEl.LIZ;
        appSettingsManager.LJIIIIZZ = ((Number) C23860wg.LIZ.getValue()).longValue();
        appSettingsManager.LIZLLL = (Map) SettingsManager.LIZLLL().LJIIIIZZ("geckox_resource_clean_channel_list", Map.class, L5O.LIZ);
        GeckoExperimentsType geckoExperimentsType = (GeckoExperimentsType) C34945DnZ.LIZIZ.getValue();
        FFL.LJIIIZ().getClass();
        GeckoDownloadStrategy geckoDownloadStrategy = (GeckoDownloadStrategy) FFL.LJIJ(true, "GeckoDownloadStrategyAB", 31744, GeckoDownloadStrategy.class, null);
        if (geckoDownloadStrategy != null && geckoDownloadStrategy.getAvailableStorageFull() > 0 && geckoDownloadStrategy.getAvailableStoragePatch() > 0) {
            appSettingsManager.LIZ = geckoDownloadStrategy.getAvailableStorageFull();
            appSettingsManager.LIZIZ = geckoDownloadStrategy.getAvailableStoragePatch();
        } else {
            int i = 200;
            if (geckoExperimentsType == null) {
                availableStorageFull = 200;
            } else {
                availableStorageFull = geckoExperimentsType.getAvailableStorageFull();
            }
            appSettingsManager.LIZ = availableStorageFull;
            if (geckoExperimentsType != null) {
                i = geckoExperimentsType.getAvailableStoragePatch();
            }
            appSettingsManager.LIZIZ = i;
        }
        appSettingsManager.LJIIIZ = ((Boolean) C52863Kot.LIZ.getValue()).booleanValue();
        if (geckoExperimentsType == null) {
            useGeckoSettings = true;
        } else {
            useGeckoSettings = geckoExperimentsType.getUseGeckoSettings();
        }
        O3U.LJ = useGeckoSettings;
        if (useGeckoSettings) {
            c61532OCy.LIZIZ();
            if (c61532OCy.LJ != null) {
                c61532OCy.LIZJ();
                c61532OCy.LJFF.LIZJ(1, false);
            } else {
                throw new IllegalArgumentException("Please init GeckoGlobalConfig first");
            }
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        GeckoDownloadResumeConfig geckoDownloadResumeConfig = C61561OEb.LIZ;
        LJIIIZ.getClass();
        GeckoDownloadResumeConfig geckoDownloadResumeConfig2 = (GeckoDownloadResumeConfig) FFL.LJIJI(true, "gecko_download_resume", 31744, GeckoDownloadResumeConfig.class, geckoDownloadResumeConfig, 1);
        if (geckoDownloadResumeConfig2 != null) {
            geckoDownloadResumeConfig = geckoDownloadResumeConfig2;
        }
        appSettingsManager.LJFF = geckoDownloadResumeConfig.downloadResume;
        appSettingsManager.LJI = geckoDownloadResumeConfig.downloadResumeAddAE;
        appSettingsManager.LJII = geckoDownloadResumeConfig.resumeThreshold;
        GeckoLiveOpt geckoLiveOpt = (GeckoLiveOpt) OF3.LIZ.getValue();
        if (geckoLiveOpt != null && geckoLiveOpt.isEnable && (list = geckoLiveOpt.channelList) != null && !list.isEmpty()) {
            ((HashMap) c61532OCy.LJIILIIL).put(C38943FQd.LIZ(), list);
            if (geckoLiveOpt.blockPolling) {
                ((HashMap) c61532OCy.LJIILJJIL).put(C38943FQd.LIZ(), list);
            }
        }
        LHU lhu = LHU.LIZIZ;
        C3GQ.LIZ().getClass();
        lhu.LIZ(C3GR.GECKO_ONLINE_SYNC, C61534ODa.LJLIL);
        C84763XOl.LJI().LJJJJZI(C35662Dz8.LJLIL);
    }
}
