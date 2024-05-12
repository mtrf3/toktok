package defpackage;

import X.C09L;
import X.C0VK;
import X.M89;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class o1 implements ViewModelProvider.Factory {
    public final LifecycleOwner LIZ;
    public final M89 LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new PublishPreviewViewModel(this.LIZ, this.LIZIZ);
    }

    public o1(Fragment fragment, M89 m89) {
        this.LIZ = fragment;
        this.LIZIZ = m89;
    }
}
