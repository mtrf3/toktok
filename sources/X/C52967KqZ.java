package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.GeckoCountConfig;

/* renamed from: X.KqZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52967KqZ {
    public static GeckoCountConfig LIZ() {
        GeckoCountConfig geckoCountConfig = null;
        try {
            geckoCountConfig = (GeckoCountConfig) SettingsManager.LIZLLL().LJIIIIZZ("ad_landing_page_gecko_cache_count_config", GeckoCountConfig.class, null);
            return geckoCountConfig;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return geckoCountConfig;
        }
    }
}
