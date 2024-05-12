package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.ShareToStoryStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.80S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80S {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        ShareToStoryStruct share2StoryStruct = aweme.getShare2StoryStruct();
        if ((share2StoryStruct != null && share2StoryStruct.getShareStoryPostType() == 1) || aweme.getAwemeType() == 40 || aweme.getIsTikTokStory()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        AwemeStatus status;
        if (aweme != null && (status = aweme.getStatus()) != null && status.getPrivateStatus() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 2) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author != null && author.getFollowStatus() == 2) || C78996UzQ.LJJIIZI(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Aweme aweme) {
        AwemeStatus status;
        if (aweme != null && (status = aweme.getStatus()) != null && status.getPrivateStatus() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJI(Aweme aweme) {
        AwemeStatus status;
        if (aweme != null && (status = aweme.getStatus()) != null && status.getPrivateStatus() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (AV1.LJIJI(aweme.getAuthorUid())) {
            return HG3.LJIILL().getCurUser().isSecret();
        }
        return aweme.getAuthor().isSecret();
    }

    public static boolean LJIIIIZZ(Aweme aweme) {
        if (aweme != null && aweme.isSubOnlyVideo()) {
            return true;
        }
        return false;
    }
}
