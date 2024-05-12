package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import X.C00F;
import X.C19N;
import X.C58096Mr6;
import X.C78983UzD;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService;
import defpackage.e1;

/* loaded from: classes10.dex */
public final class SplashSettingServiceImpl implements ISplashSettingService {
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LIZIZ() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_force_skip_topview", true);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LIZJ() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("splash_one_cold_start", true);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LIZLLL() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_refresh_topview", true);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    public static ISplashSettingService LJII() {
        Object LIZ = C58096Mr6.LIZ(ISplashSettingService.class, false);
        if (LIZ != null) {
            return (ISplashSettingService) LIZ;
        }
        if (C58096Mr6.LJJ == null) {
            synchronized (ISplashSettingService.class) {
                if (C58096Mr6.LJJ == null) {
                    C58096Mr6.LJJ = new SplashSettingServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final int LIZ() {
        return C00F.LIZ(31744, 0, "awesome_splash_ad_delay_millis", true);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LJ() {
        return e1.LIZ(31744, "topview_feed_gap_optimize_enabled", true, false);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LJFF() {
        return e1.LIZ(31744, "cold_start_upload_topview_cid_enabled", true, false);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService
    public final boolean LJI() {
        return C19N.LJ("awesome_splash_force_use_h264", false);
    }
}
