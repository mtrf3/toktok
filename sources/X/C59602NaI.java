package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;

/* renamed from: X.NaI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59602NaI extends C08Z {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ ProfilePageFragment LIZIZ;

    public C59602NaI(ProfilePageFragment profilePageFragment, Aweme aweme) {
        this.LIZIZ = profilePageFragment;
        this.LIZ = aweme;
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        this.LIZIZ.km(this.LIZ, new C59607NaN(this.LIZIZ.LJLJJL.getArguments()).LIZ());
        this.LIZIZ.getChildFragmentManager().LJLJJLL(this);
    }
}
