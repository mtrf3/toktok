package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100413wr {
    public static void LIZ(ActivityC45651qj activityC45651qj, IMUser user, boolean z, boolean z2) {
        o.LJIIIZ(user, "user");
        Intent intent = new Intent(activityC45651qj, (Class<?>) FriendChatDetailActivity.class);
        intent.putExtra("simple_uesr", user);
        intent.putExtra("is_stranger", z);
        intent.putExtra("is_author_supporter", z2);
        C16880lQ.LJFF(activityC45651qj, 1, intent);
        C96423qQ.LIZ();
        C4Z2.LJIILLIIL();
    }
}
