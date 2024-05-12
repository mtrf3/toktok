package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GT6 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(User user) {
        String str;
        o.LJIIIZ(user, "user");
        if (FriendsServiceImpl.LJJJJ().LJIJJ() && user.getNickname() != null) {
            String nickname = user.getNickname();
            o.LJIIIIZZ(nickname, "{\n            user.nickname\n        }");
            return nickname;
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            str = user.getUniqueId();
        } else if (!TextUtils.isEmpty(user.getShortId())) {
            str = user.getShortId();
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "{\n            if (!TextU…\"\n            }\n        }");
        return str;
    }
}
