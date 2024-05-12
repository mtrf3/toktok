package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;

/* loaded from: classes10.dex */
public final class LGL implements View.OnClickListener {
    public final Context LJLIL;

    public final FeedFragment LIZ() {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
        if (LJJIFFI == null) {
            return null;
        }
        Fragment Ja = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).Ja("FRIENDS_FEED");
        if (!(Ja instanceof FeedFragment)) {
            return null;
        }
        return (FeedFragment) Ja;
    }

    public LGL(Context context) {
        this.LJLIL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LIJ lij;
        IFeedFetchDataAbility iFeedFetchDataAbility;
        FeedFragment LIZ = LIZ();
        C2K0 c2k0 = null;
        if ((LIZ == null || (iFeedFetchDataAbility = (IFeedFetchDataAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZ, null), IFeedFetchDataAbility.class, null)) == null || !iFeedFetchDataAbility.isLoading() || !C54029LIj.LIZIZ.LJJI()) && !C54029LIj.LIZIZ.LJJI()) {
            InterfaceC54017LHx redDotInterface = LHM.LIZIZ.LIZIZ().redDotInterface();
            if (redDotInterface != null && redDotInterface.getDotCount() > 0) {
                FeedFragment LIZ2 = LIZ();
                if (LIZ2 != 0) {
                    if ((LIZ2 instanceof LIJ) && (lij = (LIJ) LIZ2) != null) {
                        lij.Bi();
                    }
                    LIZ2.ub(false);
                    return;
                }
                return;
            }
            FeedFragment LIZ3 = LIZ();
            if (LIZ3 == null) {
                return;
            }
            C2K0 LIZ4 = C55096Ljo.LIZ(C55230Lly.LIZJ(LIZ3, null), IFeedFragmentAbility.class, null);
            if (LIZ4 instanceof IFriendsFeedFragmentAbility) {
                c2k0 = LIZ4;
            }
            IFriendsFeedFragmentAbility iFriendsFeedFragmentAbility = (IFriendsFeedFragmentAbility) c2k0;
            if (iFriendsFeedFragmentAbility == null) {
                return;
            }
            iFriendsFeedFragmentAbility.Pg0();
        }
    }
}
