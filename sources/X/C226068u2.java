package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8u2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226068u2 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ() {
        List<String> educateItemIdList = LHM.LIZIZ.LIZ().getEducateItemIdList();
        if (educateItemIdList.isEmpty()) {
            return "";
        }
        return ORZ.LLD(educateItemIdList, ",", null, null, null, 62);
    }

    public static void LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tt_friends_tab_educate_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva.getRepo(X1D.LIZIZ(LIZ2)).storeInt("key_unclick_count", 0);
    }

    public static long LIZJ() {
        boolean z;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0L;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tt_friends_tab_educate_");
        LIZ2.append(curUserId);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        long j = repo.getLong("key_show_timestamp", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        repo.storeLong("key_show_timestamp", currentTimeMillis);
        if (j <= 0) {
            return 0L;
        }
        return currentTimeMillis - j;
    }

    public static void LIZLLL() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tt_friends_tab_educate_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        C19N.LIZJ(Keva.getRepo(X1D.LIZIZ(LIZ2)), "key_unclick_count", 0, 1, "key_unclick_count");
    }

    public static boolean LJ(Aweme aweme, EnumC61832bj style) {
        User author;
        o.LJIIIZ(style, "style");
        if (C47698Inm.LIZ.LIZLLL <= 1 || ((Number) C61052aT.LIZ.getValue()).intValue() != style.getValue() || aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 2) {
            return false;
        }
        RBX rbx = (RBX) HG3.LJIILL();
        String curUserId = rbx.getCurUserId();
        if (!rbx.isLogin() || curUserId == null || curUserId.length() == 0) {
            return false;
        }
        LHM lhm = LHM.LIZIZ;
        if (!lhm.LIZ().shouldShowFriendsTab() || rbx.getCurUser().getFriendCount() < C226078u3.LIZ().triggerFriendCount || lhm.LIZ().getEducateAvatarUserList().size() < C226078u3.LIZ().triggerUnreadCount) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tt_friends_tab_educate_");
        LIZ2.append(curUserId);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        long j = repo.getLong("key_visit_friends_feed_timestamp", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > C226078u3.LIZ().triggerLastVisitHours * 3600000 && currentTimeMillis - repo.getLong("key_show_timestamp", 0L) > C226078u3.LIZ().displayControlDays * 86400000 && repo.getInt("key_unclick_count", 0) < C226078u3.LIZ().maxUnClickCount) {
            return true;
        }
        return false;
    }
}
