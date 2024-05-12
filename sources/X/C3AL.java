package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;

/* renamed from: X.3AL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AL {
    public static final C3AL LIZ = new C3AL();
    public static final ActivityStatusConfig LIZIZ = new ActivityStatusConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, false, 0, 1048575, null);

    public static ActivityStatusConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ActivityStatusConfig activityStatusConfig = LIZIZ;
        ActivityStatusConfig activityStatusConfig2 = (ActivityStatusConfig) LIZLLL.LJIIIIZZ("tt_im_show_activity_status_config", ActivityStatusConfig.class, activityStatusConfig);
        if (activityStatusConfig2 == null) {
            return activityStatusConfig;
        }
        return activityStatusConfig2;
    }
}
