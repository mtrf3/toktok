package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.utils.StorageCleanConfig;

/* renamed from: X.UWv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77337UWv {
    public static StorageCleanConfig LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            StorageCleanConfig storageCleanConfig = (StorageCleanConfig) SettingsManager.LJII("disk_space_threshold", StorageCleanConfig.class);
            if (storageCleanConfig != null) {
                return storageCleanConfig;
            }
        } catch (Throwable unused) {
        }
        StorageCleanConfig storageCleanConfig2 = new StorageCleanConfig();
        storageCleanConfig2.diskFreeSpaceThreshold = 440;
        storageCleanConfig2.appUsageValueThreshold = 1370;
        return storageCleanConfig2;
    }
}
