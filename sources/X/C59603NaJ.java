package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;

/* renamed from: X.NaJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59603NaJ extends C08Z {
    public final /* synthetic */ InterfaceC59605NaL LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ ProfilePageFragment LIZLLL;

    public C59603NaJ(ProfilePageFragment profilePageFragment, InterfaceC59605NaL interfaceC59605NaL, Aweme aweme, boolean z) {
        this.LIZLLL = profilePageFragment;
        this.LIZ = interfaceC59605NaL;
        this.LIZIZ = aweme;
        this.LIZJ = z;
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (this.LIZ.LJI(this.LIZLLL.LJLJJL)) {
            this.LIZLLL.km(this.LIZIZ, this.LIZJ);
        } else {
            C36922EeM.LJ("BulletContainerView is null when onFragmentViewCreated is called");
        }
        this.LIZLLL.getChildFragmentManager().LJLJJLL(this);
    }
}
