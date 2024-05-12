package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.7VH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7VH implements ViewModelProvider.Factory {
    public final /* synthetic */ String LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C7VH(String str) {
        this.LIZ = str;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (AssemViewModel.class.isAssignableFrom(modelClass)) {
            T newInstance = modelClass.getConstructor(String.class).newInstance(this.LIZ);
            o.LJIIIIZZ(newInstance, "modelClass.getConstructo…newInstance(collectionId)");
            return newInstance;
        }
        throw new IllegalArgumentException("Custom ViewModel must be a subclass of VideoCollectionContentViewModel.");
    }
}
