package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.80e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043280e {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static boolean LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("promote_guide_shown_history_");
        long j = C1A7.LJIILIIL().LIZ.getLong(UPJ.LJ((RBX) HG3.LJIILL(), LIZ2, LIZ2), 0L);
        if (j == 0 || System.currentTimeMillis() - j > 86400000) {
            return false;
        }
        return true;
    }

    public static C188727au LIZ(Aweme aweme) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        if (aweme.getAwemeType() == 150) {
            str = "photo";
        } else {
            str = "video";
        }
        c188727au.LJIIIZ("content_type", str);
        c188727au.LIZLLL(AV1.LJIJI(aweme.getAuthorUid()) ? 1 : 0, "is_self");
        try {
            String logExtra = aweme.getBubbleInfo().getLogExtra();
            if (logExtra != null) {
                for (Map.Entry entry : ((HashMap) C190837eJ.LIZIZ(new JSONObject(logExtra))).entrySet()) {
                    c188727au.LJFF(entry.getValue(), (String) entry.getKey());
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return c188727au;
    }
}
