package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import kotlin.jvm.internal.o;

/* renamed from: X.SeM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72594SeM extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviAutoCreationState, ProfileNaviAutoCreationState> {
    public static final C72594SeM LJLIL = new C72594SeM();

    public C72594SeM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviAutoCreationState invoke(ProfileNaviAutoCreationState profileNaviAutoCreationState) {
        ProfileNaviAutoCreationState setStateImmediate = profileNaviAutoCreationState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviAutoCreationState.copy$default(setStateImmediate, false, null, false, true, false, null, null, 119, null);
    }
}
