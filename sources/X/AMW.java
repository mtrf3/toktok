package X;

import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AMW extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileState, ProfileState> {
    public static final AMW LJLIL = new AMW();

    public AMW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileState invoke(ProfileState profileState) {
        ProfileState setState = profileState;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileState.copy$default(setState, null, null, null, null, null, 0, 0, false, null, null, null, false, null, null, null, null, null, null, false, null, false, false, null, false, null, Boolean.TRUE, null, null, null, null, null, null, null, -33554433, 1, null);
    }
}
