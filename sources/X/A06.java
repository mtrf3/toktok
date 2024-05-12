package X;

import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A06 {
    public static void LIZ(Context context, User user, String str, OnActivityResultCallback onActivityResultCallback, String str2) {
        String str3;
        MutualStruct mMutualStruct;
        List<MutualUser> userList;
        String secUid;
        String uid;
        o.LJIIIZ(context, "context");
        if (user != null) {
            C78966Uyw.LJLJJLL = user;
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//profile/follow_relation");
            buildRoute.withParam("uid", user.getUid());
            buildRoute.withParam("sec_uid", user.getSecUid());
            buildRoute.withParam("follow_relation_type", str);
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str3);
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null && (mMutualStruct = matchedFriendStruct.getMMutualStruct()) != null && (userList = mMutualStruct.getUserList()) != null) {
                ArrayList arrayList = new ArrayList();
                for (MutualUser mutualUser : userList) {
                    if (mutualUser != null && (uid = mutualUser.getUid()) != null) {
                        arrayList.add(uid);
                    }
                }
                buildRoute.withParamStringList("mutual_relation_user_list", new ArrayList<>(arrayList));
                ArrayList arrayList2 = new ArrayList();
                for (MutualUser mutualUser2 : userList) {
                    if (mutualUser2 != null && (secUid = mutualUser2.getSecUid()) != null) {
                        arrayList2.add(secUid);
                    }
                }
                buildRoute.withParamStringList("mutual_relation_sec_user_list", new ArrayList<>(arrayList2));
            }
            buildRoute.open(3, onActivityResultCallback);
            if (o.LJ(str, "mutual_relation")) {
                if (str2 == null) {
                    str2 = "";
                }
                String uid2 = user.getUid();
                o.LJIIIIZZ(uid2, "user.uid");
                C26335AVf.LJII(str2, "click_rec_label", uid2, null);
            }
        }
    }

    public static /* synthetic */ void LIZIZ(Context context, User user, String str, OnActivityResultCallback onActivityResultCallback, int i) {
        if ((i & 8) != 0) {
            onActivityResultCallback = null;
        }
        LIZ(context, user, str, onActivityResultCallback, null);
    }
}
