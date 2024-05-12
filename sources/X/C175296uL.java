package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.6uL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175296uL {
    public static boolean LIZJ(Comment comment) {
        if (C78685UuP.LJJJZ(comment.getReplyToUserName()) && !o.LJ(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(Comment comment, boolean z) {
        o.LJIIIZ(comment, "<this>");
        if (V16.LJJIZ(comment) || (z && comment.parentCommentType == 223)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Comment comment, Aweme aweme, String str, boolean z) {
        String str2;
        MatchedFriendStruct matchedFriendStruct;
        o.LJIIIZ(comment, "<this>");
        if (aweme == null) {
            return false;
        }
        if (((!C175306uM.LIZLLL || !LIZ(comment, z)) && (!C175306uM.LIZJ || LIZ(comment, z))) || LIZJ(comment)) {
            return false;
        }
        if (!LIZJ(comment) && comment.getLabelText() != null && comment.getLabelType() == 1) {
            return false;
        }
        User user = comment.getUser();
        if (user != null && (matchedFriendStruct = user.getMatchedFriendStruct()) != null) {
            str2 = matchedFriendStruct.getRecType();
        } else {
            str2 = null;
        }
        if (!C78685UuP.LJJJZ(str2) || !ORZ.LJLJJI(str, C76E.LJIIJJI)) {
            return false;
        }
        if (!V16.LJJIZ(comment) && !C76E.LJIIJ.contains(C76D.LIZ(aweme.getAuthor(), str))) {
            return false;
        }
        return true;
    }
}
