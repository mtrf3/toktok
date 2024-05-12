package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221008ls {
    public static final C188727au LIZ = new C188727au();

    public static boolean LIZ(User user) {
        String uri;
        List<String> urlList;
        if (user.getAvatarThumb() != null && (uri = user.getAvatarThumb().getUri()) != null && uri.length() != 0 && (urlList = user.getAvatarThumb().getUrlList()) != null && !urlList.isEmpty()) {
            List<String> urlList2 = user.getAvatarThumb().getUrlList();
            o.LJIIIIZZ(urlList2, "author.avatarThumb.urlList");
            ArrayList arrayList = new ArrayList();
            for (String str : urlList2) {
                String it = str;
                o.LJIIIIZZ(it, "it");
                if (it.length() == 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != user.getAvatarThumb().getUrlList().size()) {
                return false;
            }
        }
        return true;
    }

    public static void LIZIZ(Aweme aweme) {
        boolean z;
        C188727au c188727au = LIZ;
        if (aweme == null) {
            c188727au.getClass();
            c188727au.LJIIIZ("feed_miss_type", "-1");
            return;
        }
        if (aweme.getAuthor() != null) {
            String authorUid = aweme.getAuthorUid();
            o.LJIIIIZZ(authorUid, "aweme.authorUid");
            if (authorUid.length() != 0 && !aweme.getAuthor().isUserDataMiss) {
                String nickname = aweme.getAuthor().getNickname();
                if (nickname == null || nickname.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    User author = aweme.getAuthor();
                    o.LJIIIIZZ(author, "aweme.author");
                    if (LIZ(author)) {
                        c188727au.LIZLLL(2, "feed_miss_type");
                        return;
                    }
                }
                String nickname2 = aweme.getAuthor().getNickname();
                if (nickname2 == null || nickname2.length() == 0) {
                    c188727au.LIZLLL(3, "feed_miss_type");
                    return;
                }
                User author2 = aweme.getAuthor();
                o.LJIIIIZZ(author2, "aweme.author");
                if (LIZ(author2)) {
                    c188727au.LIZLLL(4, "feed_miss_type");
                    return;
                } else {
                    c188727au.LIZLLL(0, "feed_miss_type");
                    return;
                }
            }
        }
        c188727au.LIZLLL(1, "feed_miss_type");
    }

    public static void LIZJ(User user) {
        String uid;
        C188727au c188727au = LIZ;
        if (user == null || (uid = user.getUid()) == null || uid.length() == 0) {
            c188727au.LIZLLL(1, "profile_miss_type");
            return;
        }
        String nickname = user.getNickname();
        if ((nickname == null || nickname.length() == 0) && LIZ(user)) {
            c188727au.LIZLLL(2, "profile_miss_type");
            return;
        }
        String nickname2 = user.getNickname();
        if (nickname2 == null || nickname2.length() == 0) {
            c188727au.LIZLLL(3, "profile_miss_type");
        } else if (LIZ(user)) {
            c188727au.LIZLLL(4, "profile_miss_type");
        } else {
            c188727au.LIZLLL(0, "profile_miss_type");
        }
    }
}
