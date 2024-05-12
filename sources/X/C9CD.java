package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiCommonSettingsConfig;

/* renamed from: X.9CD, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CD {
    public static final PoiCommonSettingsConfig LIZ = new PoiCommonSettingsConfig(null, 1, null);

    public static final PoiCommonSettingsConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PoiCommonSettingsConfig poiCommonSettingsConfig = LIZ;
        PoiCommonSettingsConfig poiCommonSettingsConfig2 = (PoiCommonSettingsConfig) LIZLLL.LJIIIIZZ("poi_common_settings", PoiCommonSettingsConfig.class, poiCommonSettingsConfig);
        if (poiCommonSettingsConfig2 == null) {
            return poiCommonSettingsConfig;
        }
        return poiCommonSettingsConfig2;
    }
}
