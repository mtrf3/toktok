package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Qus, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68522Qus {
    /* JADX WARN: Multi-variable type inference failed */
    public static CommonUserInfo LIZ() {
        return new CommonUserInfo("", "", "", null, 8, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CommonUserInfo LIZIZ(User user) {
        String nickname;
        String str;
        o.LJIIIZ(user, "user");
        if (C53262KvK.LIZIZ()) {
            nickname = user.getUniqueId();
        } else {
            nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
        }
        o.LJIIIIZZ(nickname, "if (OneClickLoginExperim…e ?: \"\"\n                }");
        if (user.getAvatarThumb() == null || user.getAvatarThumb().getUrlList() == null || user.getAvatarThumb().getUrlList().isEmpty()) {
            str = "";
        } else {
            str = (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
        }
        o.LJIIIIZZ(str, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
        String secUid = user.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        return new CommonUserInfo(nickname, str, secUid, null, 8, 0 == true ? 1 : 0);
    }
}
