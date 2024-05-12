package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Qv7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68537Qv7 {
    public static TPUserInfo LIZ(User user) {
        String str;
        o.LJIIIZ(user, "user");
        String LIZ = C40312Frw.LIZ(user);
        o.LJIIIIZZ(LIZ, "getHandle(user)");
        if (user.getAvatarThumb() == null || user.getAvatarThumb().getUrlList() == null || user.getAvatarThumb().getUrlList().isEmpty()) {
            str = "";
        } else {
            str = (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
        }
        o.LJIIIIZZ(str, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
        return new TPUserInfo(LIZ, str);
    }
}
