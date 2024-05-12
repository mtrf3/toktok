package com.ss.android.ugc.aweme.kids.homepage.compliance;

import X.AV0;
import X.C113554cx;
import X.C221108m2;
import X.C58096Mr6;
import X.C58542MyI;
import X.C62822Ol8;
import X.C75792yF;
import X.J7K;
import X.J7M;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.google.gson.Gson;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.kids.common.response.AgeAppealMenu;
import com.ss.android.ugc.aweme.kids.common.response.KMReportReason;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KidsSettingsServiceImpl implements IKidsSettingsService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(AV0.LJLIL);

    public static IKidsSettingsService LJIIJJI() {
        Object LIZ = C58096Mr6.LIZ(IKidsSettingsService.class, false);
        if (LIZ != null) {
            return (IKidsSettingsService) LIZ;
        }
        if (C58096Mr6.J1 == null) {
            synchronized (IKidsSettingsService.class) {
                if (C58096Mr6.J1 == null) {
                    C58096Mr6.J1 = new KidsSettingsServiceImpl();
                }
            }
        }
        return C58096Mr6.J1;
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final KMReportReason LJIIIZ() {
        String str;
        J7K j7k = J7M.LIZ;
        KidsComplianceSettings LIZ = j7k.LIZ();
        if (LIZ == null || LIZ.getKmReportReasons() == null) {
            return null;
        }
        Gson gson = new Gson();
        try {
            KidsComplianceSettings LIZ2 = j7k.LIZ();
            if (LIZ2 != null) {
                str = LIZ2.getKmReportReasons();
            } else {
                str = null;
            }
            Object fromJson = GsonProtectorUtils.fromJson(gson, str, (Class<Object>) KMReportReason.class);
            o.LJIIIIZZ(fromJson, "gson.fromJson(\n         …ss.java\n                )");
            return (KMReportReason) fromJson;
        } catch (s unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final List<String> LIZ() {
        List<String> blackSetting;
        KidsComplianceSettings LIZ = J7M.LIZ();
        if (LIZ == null || (blackSetting = LIZ.getBlackSetting()) == null) {
            return new ArrayList();
        }
        return blackSetting;
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final String LIZIZ() {
        KidsComplianceSettings LIZ = J7M.LIZ();
        if (LIZ != null) {
            return LIZ.getInterfaceControlSettingsString();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final String LIZJ() {
        KidsComplianceSettings LIZ = J7M.LIZ();
        if (LIZ != null) {
            return LIZ.getComplianceEncrypt();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final RuleEngineConfig LIZLLL() {
        String str;
        KidsComplianceSettings LIZ = J7M.LIZ();
        String str2 = null;
        if (LIZ != null) {
            str = LIZ.getRuleEngineConfig();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            KidsComplianceSettings LIZ2 = J7M.LIZ();
            if (LIZ2 != null) {
                str2 = LIZ2.getRuleEngineConfig();
            }
            return (RuleEngineConfig) C75792yF.LIZ(str2, RuleEngineConfig.class);
        }
        return new RuleEngineConfig(true, 0, false, 0, false, null, null, false, false, false, false, true, false, null, null, false, false, false, null, 522238, null);
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final SettingsModel LJ() {
        String str;
        KidsComplianceSettings LIZ = J7M.LIZ();
        String str2 = null;
        if (LIZ != null) {
            str = LIZ.getHeliosSettings();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            KidsComplianceSettings LIZ2 = J7M.LIZ();
            if (LIZ2 != null) {
                str2 = LIZ2.getHeliosSettings();
            }
            return (SettingsModel) C75792yF.LIZ(str2, SettingsModel.class);
        }
        return new SettingsModel(null, null, true, false, false, 0L, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, new NetworkConfig(true, false, 0L, 0L, null, null, null, null, null, 0L, 0L, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, C113554cx.LJJJLIIL(), null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, false, false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, 8380414, null), null, null, null, null, 1040187379, null);
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final m LJI() {
        String str;
        KidsComplianceSettings LIZ = J7M.LIZ();
        String str2 = null;
        if (LIZ != null) {
            str = LIZ.getBpeaLimitConfig();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        KidsComplianceSettings LIZ2 = J7M.LIZ();
        if (LIZ2 != null) {
            str2 = LIZ2.getBpeaLimitConfig();
        }
        return (m) C75792yF.LIZ(str2, m.class);
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final List<String> LJII() {
        List<String> kidsEvents;
        KidsComplianceSettings LIZ = J7M.LIZ();
        if (LIZ == null || (kidsEvents = LIZ.getKidsEvents()) == null) {
            return (List) this.LIZ.getValue();
        }
        return kidsEvents;
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final m LJIIIIZZ() {
        String str;
        KidsComplianceSettings LIZ = J7M.LIZ();
        String str2 = null;
        if (LIZ != null) {
            str = LIZ.getRuleEngineStrategy();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            KidsComplianceSettings LIZ2 = J7M.LIZ();
            if (LIZ2 != null) {
                str2 = LIZ2.getRuleEngineStrategy();
            }
            return (m) C75792yF.LIZ(str2, m.class);
        }
        return new m();
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final AgeAppealMenu LJIIJ() {
        AgeAppealMenu ageAppealMenu;
        KidsComplianceSettings LIZ = J7M.LIZ();
        if (LIZ == null || (ageAppealMenu = LIZ.getAgeAppealMenu()) == null) {
            return new AgeAppealMenu(false, false, "", "");
        }
        return ageAppealMenu;
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService
    public final void LJFF(C58542MyI c58542MyI) {
        J7M.LIZJ.add(c58542MyI);
    }
}
