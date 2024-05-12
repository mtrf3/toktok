package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.AuG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27716AuG implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        T newInstance = modelClass.getConstructor(Boolean.TYPE).newInstance(Boolean.FALSE);
        o.LJIIIIZZ(newInstance, "modelClass.getConstructo…java).newInstance(isPure)");
        return newInstance;
    }
}
