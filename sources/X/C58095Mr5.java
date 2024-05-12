package X;

import Y.ARunnableS13S0201000_10;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mr5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58095Mr5 implements InterfaceC72918Sja {
    public final /* synthetic */ FollowingRelationFragment LIZ;

    public C58095Mr5(FollowingRelationFragment followingRelationFragment) {
        this.LIZ = followingRelationFragment;
    }

    @Override // X.InterfaceC72918Sja
    public final void LIZ(int i, C72919Sjb exposer) {
        o.LJIIIZ(exposer, "exposer");
        FollowingRelationFragment followingRelationFragment = this.LIZ;
        List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> LJLZ = followingRelationFragment.LJLLLL.LJLZ();
        o.LJIIIIZZ(LJLZ, "listAdapter.adapters");
        int i2 = 0;
        for (AbstractC029409q<? extends RecyclerView.ViewHolder> abstractC029409q : LJLZ) {
            FollowListAdapter followListAdapter = followingRelationFragment.LJLLLLLL;
            if (followListAdapter != null) {
                if (o.LJ(abstractC029409q, followListAdapter) && i2 <= i && i < abstractC029409q.getItemCount()) {
                    int i3 = i - i2;
                    if (i3 < 0) {
                        return;
                    }
                    FollowListAdapter followListAdapter2 = this.LIZ.LJLLLLLL;
                    if (followListAdapter2 != null) {
                        Object LJZL = followListAdapter2.LJZL(i3, false);
                        if (LJZL instanceof LB1) {
                            LB1 lb1 = (LB1) LJZL;
                            if (lb1.LJLIL == 0) {
                                User user = lb1.LJLILLLLZI;
                                FollowingRelationFragment followingRelationFragment2 = this.LIZ;
                                String uid = user.getUid();
                                o.LJIIIIZZ(uid, "itemUser.uid");
                                ARunnableS13S0201000_10 aRunnableS13S0201000_10 = new ARunnableS13S0201000_10(i3, followingRelationFragment2, user, 3);
                                if (!exposer.LIZLLL.contains(uid)) {
                                    exposer.LIZLLL.add(uid);
                                    aRunnableS13S0201000_10.run();
                                }
                            }
                            InterfaceC72447Sbz Pl = this.LIZ.Pl();
                            if (Pl != null) {
                                Pl.Dc();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    o.LJIJI("mFollowingListAdapter");
                    throw null;
                }
                i2 = abstractC029409q.getItemCount();
            } else {
                o.LJIJI("mFollowingListAdapter");
                throw null;
            }
        }
    }
}
