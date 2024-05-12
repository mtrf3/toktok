package X;

import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes5.dex */
public final class AMJ implements ALS {
    public final /* synthetic */ FollowListAdapter.FollowItemViewHolder LIZ;
    public final /* synthetic */ User LIZIZ;

    @Override // X.ALS
    public final void LIZ() {
    }

    @Override // X.ALS
    public final ALY LIZIZ() {
        return null;
    }

    @Override // X.ALS
    public final String LIZLLL() {
        return "";
    }

    @Override // X.ALS
    public final void LIZJ(int i) {
        this.LIZ.P(i);
        this.LIZIZ.setLivePushNotificationStatus(i);
    }

    public AMJ(FollowListAdapter.FollowItemViewHolder followItemViewHolder, User user) {
        this.LIZ = followItemViewHolder;
        this.LIZIZ = user;
    }
}
