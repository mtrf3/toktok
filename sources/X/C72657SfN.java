package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import kotlin.jvm.internal.o;

/* renamed from: X.SfN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72657SfN extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviHubState, ProfileNaviHubState> {
    public static final C72657SfN LJLIL = new C72657SfN();

    public C72657SfN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
        ProfileNaviHubState setStateImmediate = profileNaviHubState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviHubState.copy$default(setStateImmediate, false, false, false, 3, null);
    }
}
