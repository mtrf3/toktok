package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import kotlin.jvm.internal.o;

/* renamed from: X.SeN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72595SeN extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviAutoCreationState, ProfileNaviAutoCreationState> {
    public static final C72595SeN LJLIL = new C72595SeN();

    public C72595SeN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviAutoCreationState invoke(ProfileNaviAutoCreationState profileNaviAutoCreationState) {
        ProfileNaviAutoCreationState setStateImmediate = profileNaviAutoCreationState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviAutoCreationState.copy$default(setStateImmediate, false, null, false, false, false, null, null, 119, null);
    }
}
