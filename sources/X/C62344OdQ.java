package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.OdQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62344OdQ {
    public static String LIZ(C7NR c7nr) {
        Aweme aweme = c7nr.LIZJ;
        if (aweme != null && aweme.getAwemeType() == 43) {
            if (C78996UzQ.LJJIIZI(c7nr.LIZJ)) {
                Aweme aweme2 = c7nr.LIZJ;
                if (aweme2 != null && aweme2.isPrivate()) {
                    return "now_video_memory";
                }
                return "now_video";
            }
            return "now_others_video_post";
        }
        if (C78996UzQ.LJJIIZI(c7nr.LIZJ)) {
            Aweme aweme3 = c7nr.LIZJ;
            if (aweme3 != null && aweme3.isPrivate()) {
                return "now_post_memory";
            }
            return "now_post";
        }
        return "now_others_post";
    }

    public static boolean LIZIZ(String itemType) {
        o.LJIIIZ(itemType, "itemType");
        if (o.LJ(itemType, "now_post_memory") || o.LJ(itemType, "now_video_memory")) {
            return true;
        }
        return false;
    }
}
