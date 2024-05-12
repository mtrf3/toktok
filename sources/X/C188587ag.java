package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.7ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188587ag {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            return matchedFriendStruct.getRelationType();
        }
        return null;
    }

    public static MutualStruct LIZIZ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            return matchedFriendStruct.getMMutualStruct();
        }
        return null;
    }

    public static String LIZJ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            return matchedFriendStruct.getRecType();
        }
        return null;
    }

    public static String LIZLLL(Aweme aweme) {
        Object obj;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null) {
            User author = aweme.getAuthor();
            if (author == null || (matchedFriendStruct = author.getMatchedFriendStruct()) == null || (obj = matchedFriendStruct.getRecType()) == null) {
                AwemeRelationRecommendModel relationRecommendInfo = aweme.getRelationRecommendInfo();
                if (relationRecommendInfo != null) {
                    obj = Long.valueOf(relationRecommendInfo.getRecommendType());
                }
            }
            return String.valueOf(obj);
        }
        obj = null;
        return String.valueOf(obj);
    }

    public static boolean LJ(Aweme aweme) {
        String str;
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            str = matchedFriendStruct.getRecType();
        } else {
            str = null;
        }
        return C78685UuP.LJJJZ(str);
    }

    public static boolean LJFF(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme == null || (author = aweme.getAuthor()) == null || (matchedFriendStruct = author.getMatchedFriendStruct()) == null || matchedFriendStruct.getRecType() == null) {
            return true;
        }
        return false;
    }

    public static boolean LJI(Aweme aweme) {
        MutualStruct mutualStruct;
        MatchedFriendStruct matchedFriendStruct;
        MutualStruct mMutualStruct;
        User author;
        MatchedFriendStruct matchedFriendStruct2;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct2 = author.getMatchedFriendStruct()) != null) {
            mutualStruct = matchedFriendStruct2.getMMutualStruct();
        } else {
            mutualStruct = null;
        }
        if (mutualStruct == null) {
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null && (matchedFriendStruct = author2.getMatchedFriendStruct()) != null && (mMutualStruct = matchedFriendStruct.getMMutualStruct()) != null && mMutualStruct.getTotal() == 0) {
            return true;
        }
        return false;
    }
}
