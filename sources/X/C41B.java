package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.41B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41B {
    public static String LIZ(ActivityC45651qj context, IMUser user) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(user, "user");
        if (user.getFollowerStatus() == 1 && user.getFollowStatus() != 2) {
            i = R.string.hbx;
        } else if (user.getFollowStatus() == 0) {
            i = R.string.hbw;
        } else {
            i = R.string.q_o;
        }
        String string = context.getResources().getString(i, user.getDisplayName());
        o.LJIIIIZZ(string, "context.resources.getStr…g(textResId, displayName)");
        return string;
    }
}
