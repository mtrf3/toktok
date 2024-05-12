package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.6sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174356sp {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Comment comment) {
        String str;
        String str2;
        User author;
        IAccountUserService LJIILL = HG3.LJIILL();
        String str3 = null;
        if (LJIILL != null) {
            str = ((RBX) LJIILL).getCurUserId();
        } else {
            str = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "collection_comment");
        String cid = comment.getCid();
        if (cid == null) {
            cid = "";
        }
        c188727au.LJIIIZ("comment_id", cid);
        Aweme aliasAweme = comment.getAliasAweme();
        if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("author_id", str2);
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = "";
        }
        c188727au.LJIIIZ("group_id", awemeId);
        User user = comment.getUser();
        if (user != null) {
            str3 = user.getUid();
        }
        c188727au.LJFF(Boolean.valueOf(o.LJ(str3, str)), "is_author");
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("user_id", str);
        FMX.LJIIL("tap_comment", c188727au.LIZ);
    }
}
