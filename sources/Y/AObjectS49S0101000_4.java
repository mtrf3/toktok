package Y;

import X.AW4;
import X.C76800UCe;
import X.GGS;
import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;

/* loaded from: classes5.dex */
public class AObjectS49S0101000_4 implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    public static final Object invoke$0(AObjectS49S0101000_4 aObjectS49S0101000_4) {
        C76800UCe onInteractionLongPress;
        switch (aObjectS49S0101000_4.i1) {
            case 0:
                onInteractionLongPress = ((AbsAudienceInteractionFragment) aObjectS49S0101000_4.l0).onInteractionLongPress();
                return onInteractionLongPress;
            default:
                return VideoViewCell.LJLLILLLL((VideoViewCell) aObjectS49S0101000_4.l0);
        }
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$1(AObjectS49S0101000_4 aObjectS49S0101000_4) {
        switch (aObjectS49S0101000_4.i1) {
            case 0:
                aObjectS49S0101000_4.l0.getClass();
                return GGS.LIZJ;
            case 1:
                VideoViewCell videoViewCell = (VideoViewCell) aObjectS49S0101000_4.l0;
                videoViewCell.getClass();
                return Long.valueOf(System.currentTimeMillis() - videoViewCell.LLJJIJIL);
            case 2:
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObjectS49S0101000_4.l0;
                profilePageFragment.getClass();
                Object Il = profilePageFragment.Il(AW4.class, "page_fake_user_fragment");
                if (Il != null) {
                    AW4 aw4 = (AW4) Il;
                    aw4.setVisible(true);
                    aw4.X4(new AObjectS50S0101000_5(1, profilePageFragment, 0));
                }
                return null;
            default:
                Fragment fragment = (Fragment) aObjectS49S0101000_4.l0;
                if (fragment.mo49getActivity() != null) {
                    fragment.mo49getActivity().onBackPressed();
                }
                return null;
        }
    }

    public AObjectS49S0101000_4(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
