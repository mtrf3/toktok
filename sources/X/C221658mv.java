package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221658mv {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, User user) {
        if (user == null) {
            return null;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 2) {
                    return null;
                }
                if (!C78966Uyw.LJJIJ().LIZIZ() && context != null) {
                    String LIZ2 = C57107Mb9.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService(), context, user.getUid(), 0, 12);
                    if (LIZ2 == null || o.LJ(LIZ2, context.getResources().getString(R.string.i3_))) {
                        return "message";
                    }
                    return "sayhi";
                }
                return "friend";
            }
            return "following";
        }
        if (user.getFollowerStatus() == 1) {
            return "follow_back";
        }
        return "follow";
    }
}
