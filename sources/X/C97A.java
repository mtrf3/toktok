package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.landscape.trafficincentives.OneMinuteTrafficIncentivesSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.97A, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97A {
    public static boolean LIZIZ() {
        String str;
        int i;
        int i2;
        int i3;
        Integer num;
        Integer num2;
        Integer num3;
        OneMinuteTrafficIncentivesSettings.LIZ.getClass();
        OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfig = (OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig) SettingsManager.LIZLLL().LJIIIIZZ("1min_traffic_profile_config", OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig.class, OneMinuteTrafficIncentivesSettings.LIZIZ);
        Keva repo = Keva.getRepo(LIZ());
        if (oneMinuteTrafficProfileConfig != null && o.LJ(oneMinuteTrafficProfileConfig.eligible, Boolean.TRUE) && (str = oneMinuteTrafficProfileConfig.h5Url) != null && str.length() != 0 && oneMinuteTrafficProfileConfig.maxShowTimes != null && oneMinuteTrafficProfileConfig.maxCloseTimes != null && oneMinuteTrafficProfileConfig.maxEnterTimes != null && oneMinuteTrafficProfileConfig.timeIntervalForAutoDismiss != null) {
            int i4 = repo.getInt("traffic_incentives_popup_show", 0);
            if (oneMinuteTrafficProfileConfig != null && (num3 = oneMinuteTrafficProfileConfig.maxShowTimes) != null) {
                i = num3.intValue();
            } else {
                i = 0;
            }
            if (i4 < i) {
                int i5 = repo.getInt("traffic_incentives_learn_more", 0);
                if (oneMinuteTrafficProfileConfig != null && (num2 = oneMinuteTrafficProfileConfig.maxEnterTimes) != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                if (i5 < i2) {
                    int i6 = repo.getInt("traffic_incentives_close_click", 0);
                    if (oneMinuteTrafficProfileConfig != null && (num = oneMinuteTrafficProfileConfig.maxCloseTimes) != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    if (i6 < i3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String LIZ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("one_minute_traffic_incentives_");
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            str = ((RBX) LJIILL).getCurSecUserId();
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }
}
