package com.ss.android.ugc.aweme.ecommerce.core.services;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcImageMonitorSwitchKeySettings;
import com.ss.android.ugc.aweme.ecommerce.image.IECImageService;

/* loaded from: classes7.dex */
public final class ECImageService implements IECImageService {
    @Override // com.ss.android.ugc.aweme.ecommerce.image.IECImageService
    public final boolean LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel ecImageMonitorSwitchKeyModel = EcImageMonitorSwitchKeySettings.LIZ;
        EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel ecImageMonitorSwitchKeyModel2 = (EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel) LIZLLL.LJIIIIZZ("ec_image_monitor_switch_key", EcImageMonitorSwitchKeySettings.EcImageMonitorSwitchKeyModel.class, ecImageMonitorSwitchKeyModel);
        if (ecImageMonitorSwitchKeyModel2 != null) {
            ecImageMonitorSwitchKeyModel = ecImageMonitorSwitchKeyModel2;
        }
        Boolean bool = ecImageMonitorSwitchKeyModel.isOpen;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
