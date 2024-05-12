package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class FUM extends FUP {
    @Override // X.FUL
    public final void LIZ(C157566Gi c157566Gi) {
        SettingsRequestServiceImpl.LJIILLIIL().LIZLLL(new EU4(c157566Gi));
        try {
            SettingsManager.LIZLLL().getClass();
            GeckoConfig geckoConfig = (GeckoConfig) SettingsManager.LJII("aweme_gecko_conf", GeckoConfig.class);
            if (geckoConfig != null && !C79004UzY.LJJIFFI(geckoConfig.getInitialChannel())) {
                List<String> initialChannel = geckoConfig.getInitialChannel();
                List<String> initialHighPriorityChannel = geckoConfig.getInitialHighPriorityChannel();
                List<String> dynamicChannel = geckoConfig.getDynamicChannel();
                if (initialChannel != null) {
                    ((FUN) FUN.LIZLLL.getValue()).LIZ.LIZ(initialChannel);
                }
                if (!C79004UzY.LJJIFFI(initialHighPriorityChannel)) {
                    ((FUN) FUN.LIZLLL.getValue()).LIZIZ.LIZ(initialHighPriorityChannel);
                }
                if (!C79004UzY.LJJIFFI(dynamicChannel)) {
                    ((FUN) FUN.LIZLLL.getValue()).LIZJ.LIZ(dynamicChannel);
                }
            }
        } catch (Throwable unused) {
        }
        ISplashAdService iSplashAdService = (ISplashAdService) C171096nZ.LIZ(ISplashAdService.class);
        if (iSplashAdService != null) {
            SettingsManager.LIZLLL().getClass();
            iSplashAdService.LJ(SettingsManager.LIZ("awesome_splash_filter_enable", false));
        }
        SettingsRequestServiceImpl.LJIILLIIL().LJIIIZ();
    }
}
