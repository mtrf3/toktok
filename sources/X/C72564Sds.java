package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import kotlin.jvm.internal.o;

/* renamed from: X.Sds, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72564Sds extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {
    public static final C72564Sds LJLIL = new C72564Sds();

    public C72564Sds() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
        ProfileNaviSwitcherState setStateImmediate = profileNaviSwitcherState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviSwitcherState.copy$default(setStateImmediate, null, false, false, false, false, 15, null);
    }
}
