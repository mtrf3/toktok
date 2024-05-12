package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;

/* renamed from: X.NOp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59287NOp {
    public static CommerceAdLandpageBulletConfig LIZ;

    public static CommerceAdLandpageBulletConfig LIZ() {
        CommerceAdLandpageBulletConfig commerceAdLandpageBulletConfig = LIZ;
        if (commerceAdLandpageBulletConfig != null) {
            return commerceAdLandpageBulletConfig;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ = (CommerceAdLandpageBulletConfig) SettingsManager.LJII("commerce_ad_landpage_bullet_config", CommerceAdLandpageBulletConfig.class);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return LIZ;
    }
}
