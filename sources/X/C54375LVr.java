package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.LVr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54375LVr extends AbstractC65781Prl implements InterfaceC88472Yns<FriendsFeed, User> {
    public static final C54375LVr LJLIL = new C54375LVr();

    public C54375LVr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final User invoke(FriendsFeed friendsFeed) {
        Aweme aweme;
        FriendsFeed friendsFeed2 = friendsFeed;
        if (friendsFeed2 != null && (aweme = friendsFeed2.getAweme()) != null) {
            return aweme.getAuthor();
        }
        return null;
    }
}
