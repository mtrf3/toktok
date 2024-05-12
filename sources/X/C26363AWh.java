package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.profile.editprofile.vm.ProfileEditProfileViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.AWh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26363AWh implements ViewModelProvider.Factory {
    public final /* synthetic */ int LIZ = 0;
    public final Object LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        switch (this.LIZ) {
            case 0:
                return C09L.LIZIZ(this, cls, c0vk);
            default:
                return C09L.LIZIZ(this, cls, c0vk);
        }
    }

    public C26363AWh(ActivityC45651qj activityC45651qj) {
        this.LIZIZ = activityC45651qj;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        switch (this.LIZ) {
            case 0:
                o.LJIIIZ(modelClass, "modelClass");
                return new ForceBackFYPViewModel(HomeTabViewModel.LJLJLLL.LIZ((ActivityC45651qj) this.LIZIZ), com.bytedance.hox.Hox.LJLLI.LIZ((ActivityC45651qj) this.LIZIZ));
            default:
                o.LJIIIZ(modelClass, "modelClass");
                return new ProfileEditProfileViewModel((C73318Sq2) this.LIZIZ);
        }
    }

    public C26363AWh(C73318Sq2 c73318Sq2) {
        this.LIZIZ = c73318Sq2;
    }
}
