package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SQl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72075SQl {
    public static C72075SQl LIZIZ;
    public final java.util.Map<String, Aweme> LIZ = new ConcurrentHashMap();

    public final Aweme LIZ(String str) {
        if (TextUtils.isEmpty(str) || o.LJ(CardStruct.IStatusCode.DEFAULT, str) || TextUtils.isEmpty(str)) {
            return null;
        }
        return (Aweme) ((ConcurrentHashMap) this.LIZ).get(str);
    }

    public final AwemeStatistics LIZIZ(String str) {
        Aweme LIZ;
        if (TextUtils.isEmpty(str) || (LIZ = LIZ(str)) == null) {
            return null;
        }
        AwemeStatistics statistics = LIZ.getStatistics();
        if (statistics == null) {
            AwemeStatistics awemeStatistics = new AwemeStatistics();
            LIZ.setStatistics(awemeStatistics);
            return awemeStatistics;
        }
        return statistics;
    }

    public final Aweme LIZJ(Aweme aweme) {
        String str;
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (aweme.getVideo() != null && aweme.isAd()) {
            if (C63081OpJ.LLIIII(aweme)) {
                str = "topview";
            } else {
                str = "is_ads";
            }
            aweme.getVideo().setVideoAdTag(str);
        }
        Aweme aweme2 = (Aweme) ((ConcurrentHashMap) this.LIZ).get(aweme.getAid());
        if (aweme2 != null) {
            aweme2.update(aweme);
            return aweme2;
        }
        java.util.Map<String, Aweme> map = this.LIZ;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        ((ConcurrentHashMap) map).put(aid, aweme);
        return aweme;
    }
}
