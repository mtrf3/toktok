package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.UserNowPost;
import java.util.List;

/* renamed from: X.LtV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55697LtV {
    public static final C55211Llf LIZ = C55211Llf.INSTANCE;

    public static final boolean LIZ(Aweme aweme) {
        List<Aweme> nowPosts;
        UserNowPost userNowPost = aweme.userNowPost;
        if (userNowPost == null || (nowPosts = userNowPost.getNowPosts()) == null || nowPosts.size() <= 1) {
            return false;
        }
        return true;
    }
}
