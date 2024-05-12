package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mention.model.MentionCheckResult;
import com.ss.android.ugc.aweme.mention.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.mention.models.FollowFriendResponse;
import com.ss.android.ugc.aweme.mention.models.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217818gj implements InterfaceC48038ItG, C0K7, RTU, InterfaceC217858gn {
    public static final C217818gj LJLIL = new C217818gj();
    public static final C217818gj LJLILLLLZI = new C217818gj();
    public static final C217818gj LJLJI = new C217818gj();

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        CLG.LIZ("cancel", "live_recharge");
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        ImageResponse imageResponse = new ImageResponse();
        imageResponse.status_code = -1;
        return imageResponse;
    }

    public static void LIZ(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        EnumC217828gk enumC217828gk;
        MentionRecentContactResponse recent = (MentionRecentContactResponse) obj;
        FollowFriendResponse follow = (FollowFriendResponse) obj2;
        o.LJIIIZ(recent, "recent");
        o.LJIIIZ(follow, "follow");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (MentionCheckResult mentionCheckResult : recent.blockResults) {
            if (((MentionCheckSingleTypeResult) ListProtector.get(mentionCheckResult.userBlockedResults, 0)).blockType == 1) {
                linkedHashSet.add(mentionCheckResult.uid);
            }
        }
        for (MentionCheckResult mentionCheckResult2 : follow.blockResults) {
            if (((MentionCheckSingleTypeResult) ListProtector.get(mentionCheckResult2.userBlockedResults, 0)).blockType == 1) {
                linkedHashSet.add(mentionCheckResult2.uid);
            }
        }
        for (User user : recent.userList) {
            List<User> list = follow.users;
            ArrayList arrayList2 = new ArrayList();
            for (User user2 : list) {
                if (o.LJ(user.getUid(), user2.getUid())) {
                    arrayList2.add(user2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                follow.users.remove(it.next());
            }
            Y9G LIZIZ = Y9H.LIZIZ(user);
            LIZIZ.LJIJI = new C217878gp(!linkedHashSet.contains(LIZIZ.LIZ), EnumC217828gk.RECENT, false, null, null, null, 0, null, null, 508);
            arrayList.add(LIZIZ);
        }
        Iterator<User> it2 = follow.users.iterator();
        while (it2.hasNext()) {
            Y9G LIZIZ2 = Y9H.LIZIZ(it2.next());
            int i = LIZIZ2.LIZIZ;
            if (i != 1) {
                if (i != 2) {
                    enumC217828gk = EnumC217828gk.ALL;
                } else {
                    enumC217828gk = EnumC217828gk.FRIEND;
                }
            } else {
                enumC217828gk = EnumC217828gk.FOLLOW;
            }
            LIZIZ2.LJIJI = new C217878gp(!linkedHashSet.contains(LIZIZ2.LIZ), enumC217828gk, false, null, null, null, 0, null, null, 508);
            arrayList.add(LIZIZ2);
        }
        return new C217808gi(new C217798gh(null, follow.hasMore, null, EnumC217778gf.RECOMMEND, null, null, (int) follow.cursor, null, 363), arrayList);
    }
}
