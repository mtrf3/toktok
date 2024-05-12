package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.1VM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VM implements ViewModelProvider.Factory {
    public final C1VF LIZ;
    public final C43361n2 LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ComposerFilterViewModel.class)) {
            return new ComposerFilterViewModel(this.LIZ, this.LIZIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C1VM(C1VF c1vf, C43361n2 c43361n2) {
        this.LIZ = c1vf;
        this.LIZIZ = c43361n2;
    }
}
