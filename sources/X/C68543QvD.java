package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QvD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68543QvD {
    public static SignificantUserInfo LIZ(QTX u) {
        o.LJIIIZ(u, "u");
        String valueOf = String.valueOf(u.LIZ);
        String str = u.LJIILL;
        o.LJIIIIZZ(str, "u.userName");
        String str2 = u.LJIIZILJ;
        o.LJIIIIZZ(str2, "u.avatarUrl");
        String str3 = u.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        return new SignificantUserInfo(valueOf, "", "", str, str2, str3, u.LJJJJ);
    }

    public static SignificantUserInfo LIZIZ(User user) {
        String str;
        List<String> urlList;
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "u.uid");
        String shortId = user.getShortId();
        o.LJIIIIZZ(shortId, "u.shortId");
        String uniqueId = user.getUniqueId();
        o.LJIIIIZZ(uniqueId, "u.uniqueId");
        String nickname = user.getNickname();
        o.LJIIIIZZ(nickname, "u.nickname");
        if (user.getAvatarThumb() == null || (urlList = user.getAvatarThumb().getUrlList()) == null || urlList.isEmpty()) {
            str = "";
        } else {
            str = (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
        }
        o.LJIIIIZZ(str, "if (u.avatarThumb == nul… u.avatarThumb.urlList[0]");
        String secUid = user.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        return new SignificantUserInfo(uid, shortId, uniqueId, nickname, str, secUid, EF7.LJIIIZ);
    }
}
