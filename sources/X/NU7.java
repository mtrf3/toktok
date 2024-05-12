package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.settings.GeckoCountConfig;
import com.ss.android.ugc.aweme.settings.PopupBlockList;
import com.ss.android.ugc.aweme.web.settings.WebInfoReportConfigSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NU7 implements InterfaceC59085NGv {
    public static final int LJI() {
        int i = 0;
        try {
            WebInfoReportConfigSettings.WebInfoReportConfig LIZ = WebInfoReportConfigSettings.LIZ();
            if (LIZ == null) {
                return 0;
            }
            i = LIZ.limitTimes;
            return i;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return i;
        }
    }

    public static final int LJIIIIZZ() {
        int i = 0;
        try {
            WebInfoReportConfigSettings.WebInfoReportConfig LIZ = WebInfoReportConfigSettings.LIZ();
            if (LIZ == null) {
                return 0;
            }
            i = LIZ.pageCount;
            return i;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return i;
        }
    }

    public static final Integer LJIIL() {
        Integer num = null;
        try {
            C35698Dzi.LIZ.getClass();
            PopupBlockList LIZ = C35698Dzi.LIZ();
            if (LIZ == null) {
                return null;
            }
            num = Integer.valueOf(LIZ.dimensional);
            return num;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return num;
        }
    }

    public static final String[] LJIILIIL() {
        String[] strArr = null;
        try {
            C35698Dzi.LIZ.getClass();
            PopupBlockList LIZ = C35698Dzi.LIZ();
            if (LIZ == null) {
                return null;
            }
            strArr = LIZ.keywordList;
            return strArr;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return strArr;
        }
    }

    public static final boolean LJIILJJIL() {
        try {
            C35698Dzi.LIZ.getClass();
            return C35698Dzi.LIZ() != null;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return false;
        }
    }

    public static final boolean LJIIZILJ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("enable_audio_auto_play", false);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return false;
        }
    }

    public static final List<String> LIZJ() {
        try {
            List<String> adCardPreloadCommonChannel = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdCardPreloadCommonChannel();
            if (adCardPreloadCommonChannel == null) {
                return new ArrayList();
            }
            return adCardPreloadCommonChannel;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return new ArrayList();
        }
    }

    public static final List<String> LIZLLL() {
        return C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdCardPreloadCommonPrefix();
    }

    public static final int LJFF() {
        try {
            return C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPageReportDelay();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
    }

    public static final String LJII() {
        try {
            return C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPageReportPacketKey();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return null;
        }
    }

    public static final String LJIIIZ() {
        try {
            return C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPageReportUrl();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return null;
        }
    }

    public static final String LJIIJ() {
        try {
            return C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAnalytics();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return null;
        }
    }

    public static final boolean LJIILL() {
        try {
            Boolean adLandingPagePreloadEnabled = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPagePreloadEnabled();
            o.LJIIIIZZ(adLandingPagePreloadEnabled, "get().adLandingPageConfi…LandingPagePreloadEnabled");
            return adLandingPagePreloadEnabled.booleanValue();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return false;
        }
    }

    public static final boolean LJIJ() {
        try {
            Boolean enableDynamicNavbar = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getEnableDynamicNavbar();
            o.LJIIIIZZ(enableDynamicNavbar, "get().adLandingPageConfig.enableDynamicNavbar");
            return enableDynamicNavbar.booleanValue();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return false;
        }
    }

    public static final int LIZ() {
        Integer adLandingPagePreloadCacheCount;
        GeckoCountConfig LIZ = C52967KqZ.LIZ();
        if (LIZ != null) {
            return LIZ.h5PageGeckoCacheCount;
        }
        try {
            adLandingPagePreloadCacheCount = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPagePreloadCacheCount();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (adLandingPagePreloadCacheCount != null) {
            return adLandingPagePreloadCacheCount.intValue();
        }
        return 40;
    }

    public static final int LIZIZ() {
        Integer adSplashPagePreloadCacheCount;
        GeckoCountConfig LIZ = C52967KqZ.LIZ();
        if (LIZ != null) {
            return LIZ.splashPageGeckoCacheCount;
        }
        try {
            adSplashPagePreloadCacheCount = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdSplashPagePreloadCacheCount();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (adSplashPagePreloadCacheCount != null) {
            return adSplashPagePreloadCacheCount.intValue();
        }
        return 40;
    }

    public static final String LJ() {
        C36821Ecj<String> adLandingPageConfig = SharePrefCache.inst().getAdLandingPageConfig();
        if (adLandingPageConfig != null) {
            return adLandingPageConfig.LIZ();
        }
        return null;
    }

    public static final String LJIIJJI() {
        return SharePrefCache.inst().getJsActlogUrl().LIZ();
    }

    public static final boolean LJIILLIIL() {
        try {
            WebInfoReportConfigSettings.WebInfoReportConfig LIZ = WebInfoReportConfigSettings.LIZ();
            if (LIZ != null) {
                return LIZ.wifiOnlyEnable;
            }
            return true;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return false;
        }
    }

    public static final int LJIJI() {
        Integer adLynxPagePreloadCacheCount;
        GeckoCountConfig LIZ = C52967KqZ.LIZ();
        if (LIZ != null) {
            return LIZ.lynxPageGeckoCacheCount;
        }
        try {
            adLynxPagePreloadCacheCount = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdLynxPagePreloadCacheCount();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (adLynxPagePreloadCacheCount != null) {
            return adLynxPagePreloadCacheCount.intValue();
        }
        return 40;
    }
}
