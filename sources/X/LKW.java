package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import kotlin.jvm.internal.AqS156S0200000_9;

/* loaded from: classes10.dex */
public final class LKW extends C08Z {
    public final /* synthetic */ String LIZ = "page_slide_custom_fragment";
    public final /* synthetic */ InterfaceC65784Pro LIZIZ;
    public final /* synthetic */ ProfilePageFragment LIZJ;

    public LKW(ProfilePageFragment profilePageFragment, AqS156S0200000_9 aqS156S0200000_9) {
        this.LIZJ = profilePageFragment;
        this.LIZIZ = aqS156S0200000_9;
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment == null || !TextUtils.equals(fragment.getTag(), this.LIZ)) {
            return;
        }
        this.LIZIZ.invoke();
        this.LIZJ.getChildFragmentManager().LJLJJLL(this);
    }
}
