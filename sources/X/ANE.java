package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ANE implements InterfaceC246339ld {
    public final WeakReference<MyProfileGuideViewModel> LIZ;

    @Override // X.InterfaceC246339ld
    public final void LIZ() {
        MyProfileGuideViewModel myProfileGuideViewModel = this.LIZ.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.Hv0(ANF.LJLIL);
        }
    }

    public ANE(MyProfileGuideViewModel profileGuideViewModel) {
        o.LJIIIZ(profileGuideViewModel, "profileGuideViewModel");
        this.LIZ = new WeakReference<>(profileGuideViewModel);
    }
}
