package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import kotlin.jvm.internal.o;

/* renamed from: X.SfD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72647SfD extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviCreatorState, ProfileNaviCreatorState> {
    public static final C72647SfD LJLIL = new C72647SfD();

    public C72647SfD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
        ProfileNaviCreatorState setStateImmediate = profileNaviCreatorState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ProfileNaviCreatorState.copy$default(setStateImmediate, null, true, false, false, false, null, 61, null);
    }
}
