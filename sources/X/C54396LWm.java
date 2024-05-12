package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import kotlin.jvm.internal.o;

/* renamed from: X.LWm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54396LWm {
    public final Fragment LIZ;
    public boolean LIZIZ;
    public final C54408LWy LIZJ = new C54408LWy();

    public final boolean LIZIZ() {
        T t = this.LIZJ.LJLIL;
        if (t == 0 || !((AbstractC51036K1g) t).isHasMore()) {
            return false;
        }
        int type = EnumC54377LVt.LOADMORE.getType();
        String LJ = C2US.LIZJ("feed").LJ();
        o.LJIIIIZZ(LJ, "getInstance(FeedImpressi…eys.KEY_FEED).toReportIds");
        C54397LWn c54397LWn = new C54397LWn(4, type, LJ);
        c54397LWn.LJ = C2US.LIZJ("feed").LIZLLL();
        return this.LIZJ.LJIILL(4, c54397LWn.LIZ());
    }

    public C54396LWm(Fragment fragment) {
        this.LIZ = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Aweme item) {
        o.LJIIIZ(item, "item");
        C54408LWy c54408LWy = this.LIZJ;
        int i = 0;
        FriendsFeed friendsFeed = new FriendsFeed(null, i, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        friendsFeed.setSource(LII.HISTORY_VIEWED.getDataLevel());
        friendsFeed.setAweme(item);
        c54408LWy.LJJIIJZLJL(friendsFeed, 0);
    }
}
