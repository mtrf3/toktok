package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Leu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54792Leu implements InterfaceC54392LWi {
    public static final C54792Leu LIZ = new C54792Leu();

    public static boolean LJ(Aweme aweme) {
        UserStory userStory;
        if (!C54838Lfe.LJJ(aweme) || aweme == null || (userStory = aweme.getUserStory()) == null || userStory.getTotalCount() != 1 || userStory.getHasMoreBefore() || userStory.getHasMoreAfter() || userStory.getCurrentPosition() != 0) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Aweme aweme) {
        UserStory userStory;
        if (!C54838Lfe.LJJ(aweme) || aweme == null || (userStory = aweme.getUserStory()) == null || !userStory.isPostStyle()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54392LWi
    public final List<FollowFeed> LIZ(List<? extends FollowFeed> list) {
        Aweme aweme;
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        for (FollowFeed followFeed : list) {
            FollowFeed followFeed2 = followFeed;
            C53578L1a.LIZ.getClass();
            Aweme aweme2 = null;
            if (!C53578L1a.LIZ() && !C7EC.LIZ()) {
                if (followFeed2 != null) {
                    aweme2 = followFeed2.getAweme();
                }
                if (!C54838Lfe.LJJI(aweme2)) {
                    LJ.add(followFeed);
                }
            } else if (!C53578L1a.LIZ() && C7EC.LIZ()) {
                if (followFeed2 != null) {
                    aweme = followFeed2.getAweme();
                } else {
                    aweme = null;
                }
                if (C54838Lfe.LJJI(aweme)) {
                    if (followFeed2 != null) {
                        aweme2 = followFeed2.getAweme();
                    }
                    if (LJ(aweme2)) {
                    }
                }
                LJ.add(followFeed);
            } else if (C53578L1a.LIZ()) {
                if (followFeed2 != null) {
                    aweme2 = followFeed2.getAweme();
                }
                if (!LJFF(aweme2)) {
                    LJ.add(followFeed);
                }
            } else {
                if (followFeed2 != null) {
                    aweme2 = followFeed2.getAweme();
                }
                if (!C54838Lfe.LJJI(aweme2)) {
                    LJ.add(followFeed);
                }
            }
        }
        return LJ;
    }

    @Override // X.InterfaceC54392LWi
    public final List<Aweme> LIZIZ(List<? extends Aweme> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        for (Aweme aweme : list) {
            Aweme aweme2 = aweme;
            C53578L1a.LIZ.getClass();
            if (!C53578L1a.LIZ() && !C7EC.LIZ()) {
                if (!C54838Lfe.LJJI(aweme2)) {
                    LJ.add(aweme);
                }
            } else if (!C53578L1a.LIZ() && C7EC.LIZ()) {
                if (C54838Lfe.LJJI(aweme2) && !LJ(aweme2)) {
                }
                LJ.add(aweme);
            } else if (C53578L1a.LIZ()) {
                if (!LJFF(aweme2)) {
                    LJ.add(aweme);
                }
            } else if (!C54838Lfe.LJJI(aweme2)) {
                LJ.add(aweme);
            }
        }
        return LJ;
    }

    @Override // X.InterfaceC54392LWi
    public final List<FriendsFeed> LIZJ(List<FriendsFeed> list) {
        Aweme aweme;
        ArrayList arrayList = new ArrayList();
        for (FriendsFeed friendsFeed : list) {
            FriendsFeed friendsFeed2 = friendsFeed;
            C53578L1a.LIZ.getClass();
            Aweme aweme2 = null;
            if (!C53578L1a.LIZ() && !C7EC.LIZ()) {
                if (friendsFeed2 != null) {
                    aweme2 = friendsFeed2.getAweme();
                }
                if (!C54838Lfe.LJJI(aweme2)) {
                    arrayList.add(friendsFeed);
                }
            } else if (!C53578L1a.LIZ() && C7EC.LIZ()) {
                if (friendsFeed2 != null) {
                    aweme = friendsFeed2.getAweme();
                } else {
                    aweme = null;
                }
                if (C54838Lfe.LJJI(aweme)) {
                    if (friendsFeed2 != null) {
                        aweme2 = friendsFeed2.getAweme();
                    }
                    if (LJ(aweme2)) {
                    }
                }
                arrayList.add(friendsFeed);
            } else if (C53578L1a.LIZ()) {
                if (friendsFeed2 != null) {
                    aweme2 = friendsFeed2.getAweme();
                }
                if (!LJFF(aweme2)) {
                    arrayList.add(friendsFeed);
                }
            } else {
                if (friendsFeed2 != null) {
                    aweme2 = friendsFeed2.getAweme();
                }
                if (!C54838Lfe.LJJI(aweme2)) {
                    arrayList.add(friendsFeed);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC54392LWi
    public final List<Aweme> LIZLLL(List<? extends Aweme> list) {
        o.LJIIIZ(list, "<this>");
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZ()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!C54838Lfe.LJJI((Aweme) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return list;
    }
}
