package X;

import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LW1 extends AbstractC65781Prl implements InterfaceC88472Yns<FriendsFeed, Boolean> {
    public static final LW1 LJLIL = new LW1();

    public LW1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FriendsFeed friendsFeed) {
        boolean z;
        FriendsFeed it = friendsFeed;
        o.LJIIIZ(it, "it");
        if (it.getAweme() == null || C73994T2g.LJIJJ(it) || C73994T2g.LJIJJLI(it) || C73994T2g.LJIILL(it)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
