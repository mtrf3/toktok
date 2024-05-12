package X;

import Y.ARunnableS13S0201000_10;
import com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.SjV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72913SjV implements InterfaceC72918Sja {
    public final /* synthetic */ FollowerRelationFragment LIZ;

    public C72913SjV(FollowerRelationFragment followerRelationFragment) {
        this.LIZ = followerRelationFragment;
    }

    @Override // X.InterfaceC72918Sja
    public final void LIZ(int i, C72919Sjb exposer) {
        o.LJIIIZ(exposer, "exposer");
        FollowListAdapter followListAdapter = this.LIZ.LJLLLL;
        if (followListAdapter != null) {
            Object LJZL = followListAdapter.LJZL(i, false);
            if (LJZL instanceof LB1) {
                LB1 lb1 = (LB1) LJZL;
                if (lb1.LJLIL == 1) {
                    User user = lb1.LJLILLLLZI;
                    FollowerRelationFragment followerRelationFragment = this.LIZ;
                    String uid = user.getUid();
                    o.LJIIIIZZ(uid, "itemUser.uid");
                    ARunnableS13S0201000_10 aRunnableS13S0201000_10 = new ARunnableS13S0201000_10(i, followerRelationFragment, user, 2);
                    if (!exposer.LIZLLL.contains(uid)) {
                        exposer.LIZLLL.add(uid);
                        aRunnableS13S0201000_10.run();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("mFollowerListAdapter");
        throw null;
    }
}
