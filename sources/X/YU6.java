package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;

/* loaded from: classes16.dex */
public final class YU6 implements ViewModelProvider.Factory {
    public final /* synthetic */ C1AU LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public YU6(C1AU c1au) {
        this.LIZ = c1au;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        C4G2 LIZLLL = ((YU9) ((YU5) this.LIZ.getApplication()).generatedComponent()).LIZLLL();
        LIZLLL.getClass();
        return new ActivityRetainedComponentManager.ActivityRetainedComponentViewModel(new C244519ih(LIZLLL.LIZ));
    }
}
