package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import kotlin.jvm.internal.o;

/* renamed from: X.SeR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72599SeR extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviAutoCreationState, ProfileNaviAutoCreationState> {
    public static final C72599SeR LJLIL = new C72599SeR();

    public C72599SeR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviAutoCreationState invoke(ProfileNaviAutoCreationState profileNaviAutoCreationState) {
        ProfileNaviAutoCreationState setStateImmediate = profileNaviAutoCreationState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviAutoCreationState.copy$default(setStateImmediate, false, null, false, false, false, null, null, 123, null);
    }
}
