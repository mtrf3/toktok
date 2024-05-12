package X;

import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AMV extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileState, ProfileState> {
    public static final AMV LJLIL = new AMV();

    public AMV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileState invoke(ProfileState profileState) {
        ProfileState setState = profileState;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileState.copy$default(setState, null, null, null, null, null, 0, 0, false, null, null, null, false, null, null, null, null, null, null, false, null, false, false, null, false, null, null, Boolean.TRUE, null, null, null, null, null, null, -67108865, 1, null);
    }
}
