package X;

import com.bytedance.ies.ugc.statisticlogger.config.AppLogSendCallbackConfig;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class E16 {
    public static volatile AppLogSendCallbackConfig.Model LIZ;

    static {
        AppLogSendCallbackConfig.Model model;
        FH5.LIZIZ().LJFF(AppLogSendCallbackConfig.class, E15.LJLIL);
        AppLogSendCallbackConfig.LIZ.getClass();
        try {
            model = (AppLogSendCallbackConfig.Model) C75792yF.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("AppLog_send_callback_config", "{}"), AppLogSendCallbackConfig.Model.class);
            if (model == null) {
                model = new AppLogSendCallbackConfig.Model(null, null, 3, null);
            }
        } catch (Exception unused) {
            model = new AppLogSendCallbackConfig.Model(null, null, 3, null);
        }
        LIZ = model;
    }
}
