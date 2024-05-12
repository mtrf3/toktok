package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public final class MDT {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZJ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "new" : "earlier" : "this_month" : "this_week" : "yesterday" : "today";
    }

    public static EnumC178066yo LIZLLL() {
        int LIZIZ = C53288Kvk.LIZIZ() & 3;
        if (LIZIZ != 1) {
            if (LIZIZ != 2) {
                if (LIZIZ != 3) {
                    return EnumC178066yo.TYPE_NONE;
                }
                return EnumC178066yo.TYPE_V3;
            }
            return EnumC178066yo.TYPE_V2;
        }
        return EnumC178066yo.TYPE_V1;
    }

    public static String LIZIZ(Integer num) {
        int i = C56702MNe.LIZ;
        if (num != null && num.intValue() != i) {
            if (num.intValue() == 3) {
                return "likes";
            }
            if (num.intValue() == 44) {
                return "comments";
            }
            if (num.intValue() == 84) {
                return "qa";
            }
            if (num.intValue() == 7) {
                return "followers";
            }
            if (num.intValue() == 26) {
                return "mentions";
            }
            if (num.intValue() == 599) {
                return "shop";
            }
            if (num.intValue() == 37) {
                return "official";
            }
        }
        return "all";
    }

    public static boolean LIZ(Comment comment, Aweme aweme) {
        if (INB.LIZ() == 0 || !((Boolean) C53288Kvk.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        if ((C54838Lfe.LJJI(aweme) && C2304092m.LIZ()) || comment == null || aweme == null) {
            return false;
        }
        return true;
    }
}
