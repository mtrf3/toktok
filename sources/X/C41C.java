package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.41C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41C {
    public static String LIZ(Context context, IMUser iMUser) {
        int i;
        if (iMUser.getFollowerStatus() == 1 && iMUser.getFollowStatus() != 2) {
            i = R.string.hbx;
        } else if (iMUser.getFollowStatus() == 0) {
            i = R.string.hbw;
        } else {
            i = R.string.q_o;
        }
        String string = context.getResources().getString(i, iMUser.getDisplayName());
        o.LJIIIIZZ(string, "context.resources.getStr…g(textResId, displayName)");
        return string;
    }
}
