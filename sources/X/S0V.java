package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes13.dex */
public final class S0V {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(Aweme aweme) {
        String str;
        int i;
        User author;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        if (C025908h.LJFF(false, str)) {
            return null;
        }
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            i = author.getFollowStatus();
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
