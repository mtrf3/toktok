package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;

/* renamed from: X.NaH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59601NaH extends C08Z {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ ProfilePageFragment LIZIZ;

    public C59601NaH(ProfilePageFragment profilePageFragment, Aweme aweme) {
        this.LIZIZ = profilePageFragment;
        this.LIZ = aweme;
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        ProfilePageFragment profilePageFragment = this.LIZIZ;
        Fragment fragment2 = profilePageFragment.LJLJJL;
        if (fragment2 == null) {
            C36922EeM.LIZLLL(5, "ProfilePageFragment", "adBrowserContainerFragment is null when onFragmentViewCreated is called");
            return;
        }
        MixActivityContainer mixActivityContainer = ((CrossPlatformFragment) fragment2).LJLIL;
        if (mixActivityContainer != null) {
            profilePageFragment.Ql(((CrossPlatformFragment) fragment2).LJLILLLLZI);
            this.LIZIZ.km(this.LIZ, mixActivityContainer.LJLILLLLZI.LIZJ.LJJ);
        } else {
            C36922EeM.LJ("MixActivityContainer is null when onFragmentViewCreated is called");
        }
        this.LIZIZ.getChildFragmentManager().LJLJJLL(this);
    }
}
