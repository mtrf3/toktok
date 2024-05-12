package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

/* renamed from: X.LWl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54395LWl extends AbstractC51030K1a<C54883LgN, FollowFeed> {
    @Override // X.AbstractC51030K1a
    public final List<Aweme> LJJIIZI() {
        return C54883LgN.LJIIL(((AbstractC51036K1g) this.LJLIL).getItems());
    }

    @Override // X.AbstractC51030K1a
    public final List<FollowFeed> LJJIJ() {
        T t = this.LJLIL;
        if (t == 0) {
            return null;
        }
        return ((AbstractC51036K1g) t).getItems();
    }

    @Override // X.AbstractC51030K1a
    public final String LJJIIZ(FollowFeed followFeed) {
        FollowFeed followFeed2 = followFeed;
        if (followFeed2 == null) {
            return "";
        }
        return C227768wm.LIZIZ(followFeed2.getAweme());
    }
}
