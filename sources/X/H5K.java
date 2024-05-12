package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.camera.config.DMCameraSettingsConfig;

/* loaded from: classes8.dex */
public final class H5K extends AbstractC65781Prl implements InterfaceC65784Pro<DMCameraSettingsConfig> {
    public static final H5K LJLIL = new H5K();

    public H5K() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.camera.config.DMCameraSettingsConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final DMCameraSettingsConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        DMCameraSettingsConfig dMCameraSettingsConfig = H5J.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("dm_camera_settings_config", DMCameraSettingsConfig.class, dMCameraSettingsConfig);
        if (LJIIIIZZ == 0) {
            return dMCameraSettingsConfig;
        }
        return LJIIIIZZ;
    }
}
