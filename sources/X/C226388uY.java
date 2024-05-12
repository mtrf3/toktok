package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;

/* renamed from: X.8uY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226388uY {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZIZ() {
        return ((Number) C226498uj.LIZ.getValue()).intValue();
    }

    public static int LIZLLL() {
        return ((Number) C26306AUc.LIZ.getValue()).intValue();
    }

    public static boolean LJ() {
        if (((Number) C226478uh.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Aweme aweme) {
        long j;
        AbstractC220518l5 LJIIIZ;
        String str;
        if (!C234869Jq.LIZ()) {
            return false;
        }
        if (((Number) C226458uf.LIZ.getValue()).intValue() >= 0) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getPlayCount();
            } else {
                j = 0;
            }
            if (j >= ((Number) r1.getValue()).intValue() && (LJIIIZ = C78598Ut0.LJIIIZ(aweme)) != null && LJIIIZ.LIZIZ != 1 && (str = LJIIIZ.LIZJ) != null && str.length() != 0 && LJIIIZ.LIZJ.length() <= 30) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJI(Aweme aweme) {
        if (!C234869Jq.LIZ() || aweme.getAddYoursRecommendation() == null) {
            return false;
        }
        String topicText = aweme.getAddYoursRecommendation().getTopicText();
        if (!C78857UxB.LJJJIL(topicText) || topicText.length() >= 30) {
            return false;
        }
        return true;
    }

    public static int LIZ(int i, int i2) {
        if (((Number) C226548uo.LIZ.getValue()).intValue() == 1) {
            return i;
        }
        return i2;
    }

    public static int LIZJ(int i, int i2) {
        if (((Number) C26306AUc.LIZ.getValue()).intValue() == 1) {
            return i2;
        }
        return i;
    }
}
