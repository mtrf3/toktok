package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import kotlin.jvm.internal.o;

/* renamed from: X.Sf8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72642Sf8 extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviHubState, ProfileNaviHubState> {
    public static final C72642Sf8 LJLIL = new C72642Sf8();

    public C72642Sf8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
        ProfileNaviHubState setStateImmediate = profileNaviHubState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviHubState.copy$default(setStateImmediate, true, false, false, 6, null);
    }
}