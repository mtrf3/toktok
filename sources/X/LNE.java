package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LNE implements ViewModelProvider.Factory {
    public final ActivityC45651qj LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public LNE(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new SlideGuideViewModel(com.bytedance.hox.Hox.LJLLI.LIZ(this.LIZ), HomeTabViewModel.LJLJLLL.LIZ(this.LIZ), LWM.LIZIZ.LIZLLL(this.LIZ), C3SZ.LIZ(this.LIZ));
    }
}
