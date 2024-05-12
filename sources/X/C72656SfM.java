package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import kotlin.jvm.internal.o;

/* renamed from: X.SfM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72656SfM extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviHubState, ProfileNaviHubState> {
    public static final C72656SfM LJLIL = new C72656SfM();

    public C72656SfM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
        ProfileNaviHubState setStateImmediate = profileNaviHubState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviHubState.copy$default(setStateImmediate, false, false, true, 3, null);
    }
}
