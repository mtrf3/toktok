package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import kotlin.jvm.internal.o;

/* renamed from: X.Sey, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72632Sey extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviCreatorState, ProfileNaviCreatorState> {
    public static final C72632Sey LJLIL = new C72632Sey();

    public C72632Sey() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
        ProfileNaviCreatorState setStateImmediate = profileNaviCreatorState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviCreatorState.copy$default(setStateImmediate, null, false, true, false, false, null, 59, null);
    }
}
