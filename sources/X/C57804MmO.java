package X;

import com.ss.android.ugc.aweme.following.ui.assem.SelfFollowRelationSearchCell;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.MmO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57804MmO implements ALS {
    public final /* synthetic */ SelfFollowRelationSearchCell LIZ;
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
        this.LIZ.N(i);
        this.LIZIZ.setLivePushNotificationStatus(i);
    }

    public C57804MmO(SelfFollowRelationSearchCell selfFollowRelationSearchCell, User user) {
        this.LIZ = selfFollowRelationSearchCell;
        this.LIZIZ = user;
    }
}
