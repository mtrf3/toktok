package com.ss.android.ugc.aweme.kids.setting;

import X.XSJ;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.ss.android.ugc.aweme.kids.setting.api.ISettingService;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;

/* loaded from: classes16.dex */
public final class SettingServiceImpl implements ISettingService {
    @Override // com.ss.android.ugc.aweme.kids.setting.api.ISettingService
    public final void LIZ(KidsComplianceSettings kidsComplianceSettings) {
        int i;
        Integer timeLockSelfInMin = kidsComplianceSettings.getTimeLockSelfInMin();
        if (timeLockSelfInMin != null) {
            i = timeLockSelfInMin.intValue();
        } else {
            i = 0;
        }
        TeenageModeSetting teenageModeSetting = new TeenageModeSetting(i);
        XSJ.LIZIZ = teenageModeSetting;
        XSJ.LIZ.LIZ(GsonProtectorUtils.toJson(new Gson(), teenageModeSetting));
    }
}
