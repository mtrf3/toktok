package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LMG {
    static {
        C221108m2.LIZIZ(LMM.LJLIL);
    }

    public static String LIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        if (o.LJ(tag, LMF.INBOX.getTag())) {
            return "notification_page";
        }
        if (o.LJ(tag, LMF.MY_PROFILE.getTag())) {
            return "personal_homepage";
        }
        if (o.LJ(tag, LMF.SEARCH.getTag())) {
            return "search";
        }
        if (!o.LJ(tag, LMF.LIVE.getTag())) {
            return tag;
        }
        return "live";
    }
}
