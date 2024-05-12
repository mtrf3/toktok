package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LTD implements InterfaceC252619vl {
    public static long LJLILLLLZI;
    public static FriendsFeedResponse LJLJJL;
    public static final LTD LJLIL = new LTD();
    public static String LJLJI = ((RBX) HG3.LJIILL()).getCurUserId();
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C7XG.LJLIL);

    public static final boolean LIZIZ() {
        if (LJLILLLLZI == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - LJLILLLLZI;
        C62822Ol8 c62822Ol8 = LJLJJI;
        if (currentTimeMillis > ((Number) c62822Ol8.getValue()).longValue() || ((Number) c62822Ol8.getValue()).longValue() - currentTimeMillis <= 10000) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(String str) {
        int i;
        List<FriendsFeed> list;
        String str2;
        List<FriendsFeed> list2;
        if (str == null || str.length() == 0) {
            return true;
        }
        if (!LIZIZ()) {
            return false;
        }
        try {
            List<String> list3 = (List) C75792yF.LIZIZ().LJII(str, new LTE().getType());
            int size = list3.size();
            FriendsFeedResponse friendsFeedResponse = LJLJJL;
            if (friendsFeedResponse != null && (list2 = friendsFeedResponse.friendFeedData) != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            if (size > i) {
                return false;
            }
            boolean z = true;
            for (String str3 : list3) {
                FriendsFeedResponse friendsFeedResponse2 = LJLJJL;
                if (friendsFeedResponse2 != null && (list = friendsFeedResponse2.friendFeedData) != null) {
                    Iterator<FriendsFeed> it = list.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        Aweme aweme = it.next().getAweme();
                        if (aweme != null) {
                            str2 = aweme.getAid();
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(str2, str3)) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                    }
                }
                z = false;
            }
            return z;
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "awemeIdsInCachedResponse");
            return false;
        }
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (user2 != null && !o.LJ(LJLJI, user2.getUid())) {
            LJLJI = user2.getUid();
            LJLILLLLZI = 0L;
        }
    }
}
