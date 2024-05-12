package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.camera.config.DMCameraFilesManagementSettingsConfig;

/* renamed from: X.4XI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XI extends AbstractC65781Prl implements InterfaceC65784Pro<DMCameraFilesManagementSettingsConfig> {
    public static final C4XI LJLIL = new C4XI();

    public C4XI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.camera.config.DMCameraFilesManagementSettingsConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final DMCameraFilesManagementSettingsConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        DMCameraFilesManagementSettingsConfig dMCameraFilesManagementSettingsConfig = C4XH.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("dm_file_management_setting", DMCameraFilesManagementSettingsConfig.class, dMCameraFilesManagementSettingsConfig);
        if (LJIIIIZZ == 0) {
            return dMCameraFilesManagementSettingsConfig;
        }
        return LJIIIIZZ;
    }
}
