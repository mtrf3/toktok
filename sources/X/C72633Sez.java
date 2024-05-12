package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import kotlin.jvm.internal.o;

/* renamed from: X.Sez, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72633Sez extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviCreatorState, ProfileNaviCreatorState> {
    public static final C72633Sez LJLIL = new C72633Sez();

    public C72633Sez() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
        ProfileNaviCreatorState setStateImmediate = profileNaviCreatorState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviCreatorState.copy$default(setStateImmediate, null, false, false, false, false, null, 59, null);
    }
}
