package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AMM implements InterfaceC246329lc {
    public final WeakReference<MyProfileGuideViewModel> LIZ;
    public final WeakReference<ProfileViewModel> LIZIZ;

    @Override // X.InterfaceC246329lc
    public final void LIZIZ() {
        MyProfileGuideViewModel myProfileGuideViewModel = this.LIZ.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.Hv0(AMO.LJLIL);
        }
    }

    @Override // X.InterfaceC246329lc
    public final void LIZJ() {
        ProfileViewModel profileViewModel = this.LIZIZ.get();
        if (profileViewModel != null) {
            profileViewModel.setState(AMN.LJLIL);
        }
    }

    public AMM(MyProfileGuideViewModel guideViewModel, ProfileViewModel profileViewModel) {
        o.LJIIIZ(guideViewModel, "guideViewModel");
        o.LJIIIZ(profileViewModel, "profileViewModel");
        this.LIZ = new WeakReference<>(guideViewModel);
        this.LIZIZ = new WeakReference<>(profileViewModel);
    }
}
