package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.AEp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25903AEp implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        T newInstance = modelClass.newInstance();
        o.LJIIIIZZ(newInstance, "modelClass.newInstance()");
        return newInstance;
    }
}
