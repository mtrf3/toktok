package X;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.o;

/* renamed from: X.a95, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92335a95 extends AbstractSavedStateViewModelFactory {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92335a95(InterfaceC36571c5 owner) {
        super(owner, null);
        o.LJIIIZ(owner, "owner");
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final <T extends ViewModel> T create(String key, Class<T> modelClass, SavedStateHandle handle) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(modelClass, "modelClass");
        o.LJIIIZ(handle, "handle");
        return new NavBackStackEntry.SavedStateViewModel(handle);
    }
}
