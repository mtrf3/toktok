package X;

import Y.IDFactoryS62S0000000_4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFB {
    public static ProfileViewModel LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        ProfileViewModel profileViewModel = (ProfileViewModel) ViewModelProviders.of(fragment, new IDFactoryS62S0000000_4(2)).get(ProfileViewModel.class.getName(), ProfileViewModel.class);
        profileViewModel.ov0(AFC.LJLIL);
        return profileViewModel;
    }
}
