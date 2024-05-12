package X;

import Y.AObjectS49S0101000_4;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;

/* renamed from: X.NaM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59606NaM extends C08Z {
    public final /* synthetic */ String LIZ = "page_fake_user_fragment";
    public final /* synthetic */ InterfaceC65784Pro LIZIZ;
    public final /* synthetic */ ProfilePageFragment LIZJ;

    public C59606NaM(ProfilePageFragment profilePageFragment, AObjectS49S0101000_4 aObjectS49S0101000_4) {
        this.LIZJ = profilePageFragment;
        this.LIZIZ = aObjectS49S0101000_4;
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment == null || !TextUtils.equals(fragment.getTag(), this.LIZ)) {
            return;
        }
        this.LIZIZ.invoke();
        this.LIZJ.getChildFragmentManager().LJLJJLL(this);
    }
}
