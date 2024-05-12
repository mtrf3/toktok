package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GVY {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(GVZ.LJLIL);

    public static String LIZ() {
        String string = LIZIZ().getString(LJ("key_latest_published_aweme_id"), "");
        o.LJIIIIZZ(string, "repo.getString(key, \"\")");
        return string;
    }

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static boolean LIZJ() {
        DistributeAuthorSurveyInfoModel LIZ2 = GHS.LIZ();
        if (LIZ2 == null) {
            return false;
        }
        int i = LIZ2.frequencyControlDays;
        long currentTimeMillis = System.currentTimeMillis() - LIZIZ().getLong(LJ("key_survey_closed_timestamp"), 0L);
        int i2 = LIZIZ().getInt(LJ("key_survey_closed_times"), 0);
        int i3 = LIZ2.surveyDistributionMaxShowTime;
        if (currentTimeMillis > i * 24 * 60 * 60 * 1000 && i2 < i3) {
            return false;
        }
        return true;
    }

    public static String LJ(String str) {
        return C00F.LIZIZ(str, '_', C77339UWx.LIZJ());
    }

    public static String LIZLLL(String str, String str2) {
        return C00F.LIZIZ(str, '_', str2);
    }
}
