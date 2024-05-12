package X;

import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndPresenter;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BG5 implements BG7 {
    public final /* synthetic */ LiveNewAudienceEndPresenter LIZ;

    @Override // X.BG7
    public final void LIZIZ() {
        BG4 bg4 = this.LIZ.mView;
        if (bg4 != null) {
            bg4.k6();
        }
        C30868C9o.LIZJ(R.string.sti);
    }

    public BG5(LiveNewAudienceEndPresenter liveNewAudienceEndPresenter) {
        this.LIZ = liveNewAudienceEndPresenter;
    }

    @Override // X.BG7
    public final void LIZ(FollowPair followPair) {
        if (!followPair.LIZIZ()) {
            C30868C9o.LIZJ(R.string.sti);
            BG4 bg4 = this.LIZ.mView;
            if (bg4 != null) {
                bg4.k6();
            }
        }
    }
}
