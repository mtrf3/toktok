package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerState;
import kotlin.jvm.internal.o;

/* renamed from: X.SfI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72652SfI extends AbstractC65781Prl implements InterfaceC88472Yns<ProfileNaviSpinnerState, ProfileNaviSpinnerState> {
    public static final C72652SfI LJLIL = new C72652SfI();

    public C72652SfI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ProfileNaviSpinnerState invoke(ProfileNaviSpinnerState profileNaviSpinnerState) {
        ProfileNaviSpinnerState setStateImmediate = profileNaviSpinnerState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return setStateImmediate.copy(true);
    }
}
