package X;

import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Mqd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58067Mqd implements InterfaceC58069Mqf {
    public final /* synthetic */ FollowListAdapter.FollowItemViewHolder LIZ;
    public final /* synthetic */ User LIZIZ;

    @Override // X.InterfaceC58069Mqf
    public final void LIZ() {
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LIZ.LJLZ.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(this.LIZIZ);
        }
    }

    public C58067Mqd(FollowListAdapter.FollowItemViewHolder followItemViewHolder, User user) {
        this.LIZ = followItemViewHolder;
        this.LIZIZ = user;
    }
}
