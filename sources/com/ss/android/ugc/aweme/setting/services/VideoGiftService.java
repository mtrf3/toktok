package com.ss.android.ugc.aweme.setting.services;

import X.C25728A7w;
import X.C58096Mr6;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.GiftSettings;

/* loaded from: classes5.dex */
public final class VideoGiftService implements IVideoGiftService {
    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void LIZJ() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C25728A7w.LIZIZ("vgv_first_gift_sent"), true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean LJFF() {
        if (Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C25728A7w.LIZIZ("vgv_is_new_user_account"), true)) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C25728A7w.LIZIZ("vgv_first_gift_sent"), false);
    }

    public static IVideoGiftService LJI() {
        Object LIZ = C58096Mr6.LIZ(IVideoGiftService.class, false);
        if (LIZ != null) {
            return (IVideoGiftService) LIZ;
        }
        if (C58096Mr6.C6 == null) {
            synchronized (IVideoGiftService.class) {
                if (C58096Mr6.C6 == null) {
                    C58096Mr6.C6 = new VideoGiftService();
                }
            }
        }
        return C58096Mr6.C6;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean LIZIZ() {
        GiftSettings giftSettings;
        try {
            SettingsManager.LIZLLL().getClass();
            giftSettings = (GiftSettings) SettingsManager.LJII("non_live_gifting_viewer_setting", GiftSettings.class);
        } catch (Throwable unused) {
        }
        if (giftSettings != null && giftSettings.isSendGiftAfterRechargeEnabled) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void LIZLLL() {
        C25728A7w.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean LIZ(Aweme aweme) {
        GiftSettings giftSettings;
        try {
            SettingsManager.LIZLLL().getClass();
            giftSettings = (GiftSettings) SettingsManager.LJII("non_live_gifting_viewer_setting", GiftSettings.class);
        } catch (Throwable unused) {
            giftSettings = null;
        }
        if (giftSettings != null && giftSettings.enableVideoGift) {
            return true;
        }
        if (aweme == null) {
            return false;
        }
        return aweme.getAllowGift();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void LJ(boolean z) {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C25728A7w.LIZIZ("vgc_accept_gifting"), z);
    }
}
