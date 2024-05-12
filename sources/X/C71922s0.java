package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.appsettings.DMStickerStoreConfig;

/* renamed from: X.2s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71922s0 {
    public static final DMStickerStoreConfig LIZ = new DMStickerStoreConfig(false, 0, false, 7, null);

    public static DMStickerStoreConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        DMStickerStoreConfig dMStickerStoreConfig = LIZ;
        DMStickerStoreConfig dMStickerStoreConfig2 = (DMStickerStoreConfig) LIZLLL.LJIIIIZZ("dm_sticker_store_config", DMStickerStoreConfig.class, dMStickerStoreConfig);
        if (dMStickerStoreConfig2 == null) {
            return dMStickerStoreConfig;
        }
        return dMStickerStoreConfig2;
    }
}
