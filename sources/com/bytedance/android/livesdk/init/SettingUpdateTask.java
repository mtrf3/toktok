package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C30922CBq;
import X.InterfaceC30950CCs;
import com.bytedance.android.live_settings.SettingsManager;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class SettingUpdateTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "setting_update_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        C30922CBq.LJFF(SettingsManager.INSTANCE.getModels(), null);
    }
}
